package com.bank.xyz.api;

import com.bank.xyz.model.InlineResponse200;

import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-11-08T07:00:28.455Z")

@Api(value = "branches", description = "the branches API")
public interface BranchesApi {

    @ApiOperation(value = "To get branches", notes = "Branch Information including location", response = InlineResponse200.class, tags={ "open_api", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = InlineResponse200.class),
        @ApiResponse(code = 404, message = "Not Found", response = InlineResponse200.class) })
    @RequestMapping(value = "/branches",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<InlineResponse200> 10(@ApiParam(value = "Lattitude") @RequestParam(value = "lat", required = false) String lat



,@ApiParam(value = "Longitude") @RequestParam(value = "lon", required = false) String lon



,@ApiParam(value = "Radius") @RequestParam(value = "rad", required = false) String rad



) {
        // do some magic!
        return new ResponseEntity<InlineResponse200>(HttpStatus.OK);
    }

}
