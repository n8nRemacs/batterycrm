package androidx.media3.extractor.metadata;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import j.P;
import java.nio.ByteBuffer;

/* compiled from: SimpleMetadataDecoder.java */
@J
/* loaded from: classes.dex */
public abstract class c implements a {
    @Override // androidx.media3.extractor.metadata.a
    @P
    public final Metadata a(b bVar) {
        ByteBuffer byteBuffer = bVar.f48323d;
        byteBuffer.getClass();
        C23110a.b(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (bVar.f(BeduinInputModel.MIN_TEXT_VERSION)) {
            return null;
        }
        return b(bVar, byteBuffer);
    }

    @P
    public abstract Metadata b(b bVar, ByteBuffer byteBuffer);
}
