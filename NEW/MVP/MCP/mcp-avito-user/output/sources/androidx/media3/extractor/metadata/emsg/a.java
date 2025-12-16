package androidx.media3.extractor.metadata.emsg;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.J;
import androidx.media3.common.util.z;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: EventMessageDecoder.java */
@J
/* loaded from: classes.dex */
public final class a extends androidx.media3.extractor.metadata.c {
    @Override // androidx.media3.extractor.metadata.c
    public final Metadata b(androidx.media3.extractor.metadata.b bVar, ByteBuffer byteBuffer) {
        z zVar = new z(byteBuffer.array(), byteBuffer.limit());
        String strP = zVar.p();
        strP.getClass();
        String strP2 = zVar.p();
        strP2.getClass();
        return new Metadata(new EventMessage(strP, strP2, zVar.o(), zVar.o(), Arrays.copyOfRange(zVar.f47962a, zVar.f47963b, zVar.f47964c)));
    }
}
