package com.google.protobuf.nano;

import defpackage.wy1;
import java.io.IOException;

/* loaded from: classes.dex */
public class CodedOutputByteBufferNano$OutOfSpaceException extends IOException {
    public CodedOutputByteBufferNano$OutOfSpaceException(int i, int i2) {
        super(wy1.g("CodedOutputStream was writing to a flat byte array and ran out of space (pos ", i, " limit ", i2, ")."));
    }
}
