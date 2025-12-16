package coil.compose;

import android.graphics.ColorSpace;
import androidx.compose.foundation.H;
import androidx.media3.common.C23088b;
import coil.memory.MemoryCache;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EqualityDelegate.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-compose-base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f58261a = new a();

    /* compiled from: EqualityDelegate.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"coil/compose/p$a", "Lcoil/compose/o;", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements o {
        @Override // coil.compose.o
        public final boolean equals(@Y61.l Object obj, @Y61.l Object obj2) {
            if (obj == obj2) {
                return true;
            }
            if (!(obj instanceof coil.request.p) || !(obj2 instanceof coil.request.p)) {
                return L.f(obj, obj2);
            }
            coil.request.p pVar = (coil.request.p) obj;
            coil.request.p pVar2 = (coil.request.p) obj2;
            return L.f(pVar.f58659a, pVar2.f58659a) && L.f(pVar.f58660b, pVar2.f58660b) && L.f(pVar.f58650E, pVar2.f58650E) && L.f(pVar.f58663e, pVar2.f58663e) && L.f(pVar.f58664f, pVar2.f58664f) && pVar.f58665g == pVar2.f58665g && L.f(pVar.f58666h, pVar2.f58666h) && L.f(pVar.f58670l, pVar2.f58670l) && L.f(pVar.f58672n, pVar2.f58672n) && pVar.f58674p == pVar2.f58674p && pVar.f58675q == pVar2.f58675q && pVar.f58676r == pVar2.f58676r && pVar.f58677s == pVar2.f58677s && pVar.f58678t == pVar2.f58678t && pVar.f58679u == pVar2.f58679u && pVar.f58680v == pVar2.f58680v && L.f(pVar.f58647B, pVar2.f58647B) && pVar.f58648C == pVar2.f58648C && pVar.f58667i == pVar2.f58667i && L.f(pVar.f58649D, pVar2.f58649D);
        }

        @Override // coil.compose.o
        public final int hashCode(@Y61.l Object obj) {
            if (!(obj instanceof coil.request.p)) {
                if (obj != null) {
                    return obj.hashCode();
                }
                return 0;
            }
            coil.request.p pVar = (coil.request.p) obj;
            int iA2 = C23088b.a(pVar.f58659a.hashCode() * 31, 31, pVar.f58660b);
            MemoryCache.Key key = pVar.f58650E;
            int iHashCode = (iA2 + (key != null ? key.hashCode() : 0)) * 31;
            MemoryCache.Key key2 = pVar.f58663e;
            int iHashCode2 = (iHashCode + (key2 != null ? key2.hashCode() : 0)) * 31;
            String str = pVar.f58664f;
            int iHashCode3 = (pVar.f58665g.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31;
            ColorSpace colorSpace = pVar.f58666h;
            return pVar.f58649D.f58733b.hashCode() + ((pVar.f58667i.hashCode() + ((pVar.f58648C.hashCode() + ((pVar.f58647B.hashCode() + ((pVar.f58680v.hashCode() + ((pVar.f58679u.hashCode() + ((pVar.f58678t.hashCode() + androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((pVar.f58672n.hashCode() + H.e((iHashCode3 + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31, 31, pVar.f58670l)) * 31, 31, pVar.f58674p), 31, pVar.f58675q), 31, pVar.f58676r), 31, pVar.f58677s)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }
    }
}
