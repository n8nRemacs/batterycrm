package androidx.media3.exoplayer.metadata;

import androidx.camera.camera2.internal.G;
import androidx.media3.common.C23108t;
import androidx.media3.common.util.J;

/* compiled from: MetadataDecoderFactory.java */
@J
/* loaded from: classes.dex */
public interface a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f49401a = new C1829a();

    /* compiled from: MetadataDecoderFactory.java */
    /* renamed from: androidx.media3.exoplayer.metadata.a$a, reason: collision with other inner class name */
    public class C1829a implements a {
        public final androidx.media3.extractor.metadata.c a(C23108t c23108t) {
            String str = c23108t.f47757m;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new androidx.media3.extractor.metadata.dvbsi.a();
                    case "application/x-icy":
                        return new androidx.media3.extractor.metadata.icy.a();
                    case "application/id3":
                        return new androidx.media3.extractor.metadata.id3.a();
                    case "application/x-emsg":
                        return new androidx.media3.extractor.metadata.emsg.a();
                    case "application/x-scte35":
                        return new androidx.media3.extractor.metadata.scte35.a();
                }
            }
            throw new IllegalArgumentException(G.f("Attempted to create decoder for unsupported MIME type: ", str));
        }

        public final boolean b(C23108t c23108t) {
            String str = c23108t.f47757m;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }
    }
}
