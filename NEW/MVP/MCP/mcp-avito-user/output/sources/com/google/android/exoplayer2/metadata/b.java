package com.google.android.exoplayer2.metadata;

import androidx.camera.camera2.internal.G;
import com.google.android.exoplayer2.I;

/* compiled from: MetadataDecoderFactory.java */
/* loaded from: classes6.dex */
public interface b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f345624a = new a();

    /* compiled from: MetadataDecoderFactory.java */
    public class a implements b {
        public final f a(I i12) {
            String str = i12.f343476m;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new com.google.android.exoplayer2.metadata.dvbsi.a();
                    case "application/x-icy":
                        return new com.google.android.exoplayer2.metadata.icy.a();
                    case "application/id3":
                        return new com.google.android.exoplayer2.metadata.id3.a();
                    case "application/x-emsg":
                        return new com.google.android.exoplayer2.metadata.emsg.a();
                    case "application/x-scte35":
                        return new com.google.android.exoplayer2.metadata.scte35.a();
                }
            }
            throw new IllegalArgumentException(G.f("Attempted to create decoder for unsupported MIME type: ", str));
        }

        public final boolean b(I i12) {
            String str = i12.f343476m;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }
    }
}
