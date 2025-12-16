package androidx.media3.exoplayer.analytics;

import V1.h;
import android.media.UnsupportedSchemeException;
import android.net.Uri;
import androidx.concurrent.futures.b;
import androidx.media3.common.util.r;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import androidx.media3.exoplayer.drm.g;
import androidx.media3.exoplayer.drm.l;
import androidx.media3.exoplayer.upstream.experimental.i;
import androidx.media3.extractor.C23192k;
import androidx.media3.extractor.metadata.id3.a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.F;
import androidx.work.G;
import androidx.work.multiprocess.RemoteListenableWorker;
import coil.f;
import com.google.common.base.InterfaceC37276u;
import java.lang.reflect.Constructor;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements r.a, g.b, l.g, i.b, C23192k.a.InterfaceC1852a, androidx.media3.extractor.t, a.InterfaceC1853a, InterfaceC37276u, b.c, f.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48676b;

    public /* synthetic */ m(int i12) {
        this.f48676b = i12;
    }

    public static int e(Uri uri, int i12, int i13) {
        return (uri.hashCode() + i12) * i13;
    }

    public static int f(Date date, int i12, int i13) {
        return (date.hashCode() + i12) * i13;
    }

    public static int g(Set set, int i12, int i13) {
        return (set.hashCode() + i12) * i13;
    }

    public static Object h(int i12, List list) {
        return list.get(list.size() - i12);
    }

    public static String i(float f12, String str) {
        return str + f12;
    }

    public static String j(RecyclerView recyclerView, StringBuilder sb2) {
        sb2.append(recyclerView.H());
        return sb2.toString();
    }

    public static String k(String str, V1.h hVar, String str2, V1.h hVar2) {
        return str + hVar + str2 + hVar2;
    }

    public static String l(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String m(StringBuilder sb2, Long l12, char c12) {
        sb2.append(l12);
        sb2.append(c12);
        return sb2.toString();
    }

    public static HashSet n(HashMap map, String str, h.a aVar, int i12) {
        map.put(str, aVar);
        return new HashSet(i12);
    }

    public static void o(androidx.sqlite.db.framework.b bVar, String str, String str2, String str3, String str4) {
        bVar.P4(str);
        bVar.P4(str2);
        bVar.P4(str3);
        bVar.P4(str4);
    }

    public static void p(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }

    @Override // androidx.media3.extractor.metadata.id3.a.InterfaceC1853a
    public boolean a(int i12, int i13, int i14, int i15, int i16) {
        switch (this.f48676b) {
            case 10:
                break;
            default:
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
        androidx.media3.extractor.mp4.k kVar = (androidx.media3.extractor.mp4.k) obj;
        int i12 = androidx.media3.extractor.mp4.g.f51002w;
        return kVar;
    }

    @Override // androidx.media3.extractor.C23192k.a.InterfaceC1852a
    public Constructor b() {
        switch (this.f48676b) {
            case 7:
                int[] iArr = C23192k.f50610d;
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(androidx.media3.extractor.p.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                int[] iArr2 = C23192k.f50610d;
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(androidx.media3.extractor.p.class).getConstructor(new Class[0]);
        }
    }

    @Override // androidx.media3.exoplayer.drm.l.g
    public androidx.media3.exoplayer.drm.l c(UUID uuid) throws UnsupportedDrmException {
        try {
            try {
                return new androidx.media3.exoplayer.drm.o(uuid);
            } catch (UnsupportedDrmException unused) {
                Objects.toString(uuid);
                androidx.media3.common.util.s.c();
                return new androidx.media3.exoplayer.drm.j();
            }
        } catch (UnsupportedSchemeException e12) {
            throw new UnsupportedDrmException(e12);
        } catch (Exception e13) {
            throw new UnsupportedDrmException(e13);
        }
    }

    @Override // coil.f.d
    public coil.f create() {
        return coil.f.f58371a;
    }

    @Override // androidx.concurrent.futures.b.c
    public Object d(b.a aVar) {
        switch (this.f48676b) {
            case 20:
                return F.lambda$getForegroundInfoAsync$0(aVar);
            default:
                int i12 = RemoteListenableWorker.f56112a;
                G.a().getClass();
                aVar.d(new IllegalArgumentException("startWork() shouldn't never be called on RemoteListenableWorker"));
                return "RemoteListenableWorker Failed Future";
        }
    }

    @Override // androidx.media3.common.util.r.a
    public void invoke(Object obj) {
        b bVar = (b) obj;
        switch (this.f48676b) {
            case 0:
                bVar.getClass();
                break;
            case 1:
                bVar.getClass();
                break;
            default:
                bVar.getClass();
                break;
        }
    }

    @Override // androidx.media3.exoplayer.drm.g.b
    public void release() {
    }
}
