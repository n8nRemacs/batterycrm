package com.google.android.exoplayer2.analytics;

import android.graphics.Bitmap;
import android.media.UnsupportedSchemeException;
import android.net.Uri;
import android.os.Bundle;
import android.text.Layout;
import com.google.android.exoplayer2.InterfaceC36525h;
import com.google.android.exoplayer2.analytics.b;
import com.google.android.exoplayer2.drm.UnsupportedDrmException;
import com.google.android.exoplayer2.drm.f;
import com.google.android.exoplayer2.drm.k;
import com.google.android.exoplayer2.extractor.g;
import com.google.android.exoplayer2.metadata.id3.a;
import com.google.android.exoplayer2.source.ads.a;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.text.a;
import com.google.android.exoplayer2.util.C36599o;
import com.google.android.exoplayer2.util.C36604u;
import com.google.common.base.InterfaceC37276u;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class h implements C36604u.a, C36604u.b, f.b, k.g, g.a.InterfaceC10578a, com.google.android.exoplayer2.extractor.n, a.InterfaceC10587a, InterfaceC37276u, InterfaceC36525h.a, HlsPlaylistTracker.a, com.google.android.exoplayer2.upstream.cache.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f343769b;

    public /* synthetic */ h(int i12) {
        this.f343769b = i12;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.a.InterfaceC10587a
    public boolean a(int i12, int i13, int i14, int i15, int i16) {
        switch (this.f343769b) {
            case 21:
                if (i13 != 67 || i14 != 79 || i15 != 77 || (i16 != 77 && i12 != 2)) {
                    if (i13 == 77 && i14 == 76 && i15 == 76) {
                        if (i16 == 84 || i12 == 2) {
                        }
                    }
                }
                break;
        }
        return false;
    }

    @Override // com.google.common.base.InterfaceC37276u
    public Object apply(Object obj) {
        com.google.android.exoplayer2.extractor.mp4.k kVar = (com.google.android.exoplayer2.extractor.mp4.k) obj;
        int i12 = com.google.android.exoplayer2.extractor.mp4.g.f344829w;
        return kVar;
    }

    @Override // com.google.android.exoplayer2.extractor.g.a.InterfaceC10578a
    public Constructor b() {
        switch (this.f343769b) {
            case 18:
                int[] iArr = com.google.android.exoplayer2.extractor.g.f344546b;
                if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                    return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(com.google.android.exoplayer2.extractor.j.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                int[] iArr2 = com.google.android.exoplayer2.extractor.g.f344546b;
                return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(com.google.android.exoplayer2.extractor.j.class).getConstructor(new Class[0]);
        }
    }

    @Override // com.google.android.exoplayer2.drm.k.g
    public com.google.android.exoplayer2.drm.k c(UUID uuid) throws UnsupportedDrmException {
        try {
            try {
                return new com.google.android.exoplayer2.drm.n(uuid);
            } catch (UnsupportedDrmException unused) {
                Objects.toString(uuid);
                return new com.google.android.exoplayer2.drm.i();
            }
        } catch (UnsupportedSchemeException e12) {
            throw new UnsupportedDrmException(e12);
        } catch (Exception e13) {
            throw new UnsupportedDrmException(e13);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.e
    public String d(com.google.android.exoplayer2.upstream.p pVar) {
        String str = pVar.f347936h;
        return str != null ? str : pVar.f347929a.toString();
    }

    @Override // com.google.android.exoplayer2.util.C36604u.b
    public void e(Object obj, C36599o c36599o) {
    }

    @Override // com.google.android.exoplayer2.InterfaceC36525h.a
    public InterfaceC36525h fromBundle(Bundle bundle) {
        a.b[] bVarArr;
        switch (this.f343769b) {
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                com.google.android.exoplayer2.source.ads.a aVar = com.google.android.exoplayer2.source.ads.a.f346179h;
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(1, 36));
                if (parcelableArrayList == null) {
                    bVarArr = new a.b[0];
                } else {
                    a.b[] bVarArr2 = new a.b[parcelableArrayList.size()];
                    for (int i12 = 0; i12 < parcelableArrayList.size(); i12++) {
                        bVarArr2[i12] = (a.b) a.b.f346188i.fromBundle((Bundle) parcelableArrayList.get(i12));
                    }
                    bVarArr = bVarArr2;
                }
                return new com.google.android.exoplayer2.source.ads.a(null, bVarArr, bundle.getLong(Integer.toString(2, 36), 0L), bundle.getLong(Integer.toString(3, 36), -9223372036854775807L), bundle.getInt(Integer.toString(4, 36)));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                long j12 = bundle.getLong(Integer.toString(0, 36));
                int i13 = bundle.getInt(Integer.toString(1, 36), -1);
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(Integer.toString(2, 36));
                int[] intArray = bundle.getIntArray(Integer.toString(3, 36));
                long[] longArray = bundle.getLongArray(Integer.toString(4, 36));
                long j13 = bundle.getLong(Integer.toString(5, 36));
                boolean z12 = bundle.getBoolean(Integer.toString(6, 36));
                int[] iArr = intArray == null ? new int[0] : intArray;
                Uri[] uriArr = new Uri[0];
                if (parcelableArrayList2 != null) {
                    uriArr = (Uri[]) parcelableArrayList2.toArray(uriArr);
                }
                return new a.b(j12, i13, iArr, uriArr, longArray == null ? new long[0] : longArray, j13, z12);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            default:
                return new com.google.android.exoplayer2.video.b(bundle.getInt(Integer.toString(0, 36), -1), bundle.getInt(Integer.toString(1, 36), -1), bundle.getInt(Integer.toString(2, 36), -1), bundle.getByteArray(Integer.toString(3, 36)));
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                com.google.android.exoplayer2.text.a aVar2 = com.google.android.exoplayer2.text.a.f346715s;
                a.c cVar = new a.c();
                CharSequence charSequence = bundle.getCharSequence(Integer.toString(0, 36));
                if (charSequence != null) {
                    cVar.f346734a = charSequence;
                }
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(Integer.toString(1, 36));
                if (alignment != null) {
                    cVar.f346736c = alignment;
                }
                Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(Integer.toString(2, 36));
                if (alignment2 != null) {
                    cVar.f346737d = alignment2;
                }
                Bitmap bitmap = (Bitmap) bundle.getParcelable(Integer.toString(3, 36));
                if (bitmap != null) {
                    cVar.f346735b = bitmap;
                }
                if (bundle.containsKey(Integer.toString(4, 36)) && bundle.containsKey(Integer.toString(5, 36))) {
                    float f12 = bundle.getFloat(Integer.toString(4, 36));
                    int i14 = bundle.getInt(Integer.toString(5, 36));
                    cVar.f346738e = f12;
                    cVar.f346739f = i14;
                }
                if (bundle.containsKey(Integer.toString(6, 36))) {
                    cVar.f346740g = bundle.getInt(Integer.toString(6, 36));
                }
                if (bundle.containsKey(Integer.toString(7, 36))) {
                    cVar.f346741h = bundle.getFloat(Integer.toString(7, 36));
                }
                if (bundle.containsKey(Integer.toString(8, 36))) {
                    cVar.f346742i = bundle.getInt(Integer.toString(8, 36));
                }
                if (bundle.containsKey(Integer.toString(10, 36)) && bundle.containsKey(Integer.toString(9, 36))) {
                    float f13 = bundle.getFloat(Integer.toString(10, 36));
                    int i15 = bundle.getInt(Integer.toString(9, 36));
                    cVar.f346744k = f13;
                    cVar.f346743j = i15;
                }
                if (bundle.containsKey(Integer.toString(11, 36))) {
                    cVar.f346745l = bundle.getFloat(Integer.toString(11, 36));
                }
                if (bundle.containsKey(Integer.toString(12, 36))) {
                    cVar.f346746m = bundle.getFloat(Integer.toString(12, 36));
                }
                if (bundle.containsKey(Integer.toString(13, 36))) {
                    cVar.f346748o = bundle.getInt(Integer.toString(13, 36));
                    cVar.f346747n = true;
                }
                if (!bundle.getBoolean(Integer.toString(14, 36), false)) {
                    cVar.f346747n = false;
                }
                if (bundle.containsKey(Integer.toString(15, 36))) {
                    cVar.f346749p = bundle.getInt(Integer.toString(15, 36));
                }
                if (bundle.containsKey(Integer.toString(16, 36))) {
                    cVar.f346750q = bundle.getFloat(Integer.toString(16, 36));
                }
                return cVar.a();
        }
    }

    @Override // com.google.android.exoplayer2.util.C36604u.a
    public void invoke(Object obj) {
        b bVar = (b) obj;
        switch (this.f343769b) {
            case 0:
                bVar.getClass();
                break;
            case 1:
                bVar.getClass();
                break;
            case 2:
                bVar.getClass();
                break;
            case 3:
                bVar.getClass();
                break;
            case 4:
                bVar.getClass();
                break;
            case 5:
                bVar.getClass();
                break;
            case 6:
                bVar.getClass();
                break;
            case 7:
            default:
                bVar.getClass();
                break;
            case 8:
                bVar.getClass();
                break;
            case 9:
                bVar.getClass();
                break;
            case 10:
                bVar.getClass();
                break;
            case 11:
                bVar.getClass();
                break;
            case 12:
                bVar.getClass();
                break;
            case 13:
                bVar.getClass();
                break;
            case 14:
                bVar.getClass();
                break;
        }
    }

    public /* synthetic */ h(b.C10568b c10568b, int i12) {
        this.f343769b = i12;
    }

    @Override // com.google.android.exoplayer2.drm.f.b
    public void release() {
    }
}
