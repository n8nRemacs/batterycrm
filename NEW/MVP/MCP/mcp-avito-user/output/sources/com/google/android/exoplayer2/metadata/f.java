package com.google.android.exoplayer2.metadata;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.android.exoplayer2.util.C36585a;
import j.P;
import java.nio.ByteBuffer;

/* compiled from: SimpleMetadataDecoder.java */
/* loaded from: classes6.dex */
public abstract class f implements a {
    @Override // com.google.android.exoplayer2.metadata.a
    @P
    public final Metadata a(c cVar) {
        ByteBuffer byteBuffer = cVar.f344205d;
        byteBuffer.getClass();
        C36585a.b(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (cVar.f(BeduinInputModel.MIN_TEXT_VERSION)) {
            return null;
        }
        return b(cVar, byteBuffer);
    }

    @P
    public abstract Metadata b(c cVar, ByteBuffer byteBuffer);
}
