package s11;

import X41.j;
import Y61.k;
import Y61.l;
import android.opengl.EGL14;
import android.view.Surface;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q11.f;

/* compiled from: EglWindowSurface.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ls11/e;", "Ls11/b;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class e extends b {

    /* renamed from: c, reason: collision with root package name */
    @l
    public Surface f437300c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f437301d;

    @j
    public e(@k com.otaliastudios.opengl.core.c cVar, @k Surface surface, boolean z12) {
        f fVar = new f(EGL14.eglCreateWindowSurface(cVar.f365914a.f428959a, cVar.f365916c.f428957a, surface, new int[]{q11.e.f428964e}, 0));
        com.otaliastudios.opengl.core.f.a("eglCreateWindowSurface");
        if (fVar == q11.e.f428962c) {
            throw new RuntimeException("surface was null");
        }
        this.f437298a = cVar;
        this.f437299b = fVar;
        this.f437300c = surface;
        this.f437301d = z12;
    }

    public /* synthetic */ e(com.otaliastudios.opengl.core.c cVar, Surface surface, boolean z12, int i12, C42822w c42822w) {
        this(cVar, surface, (i12 & 4) != 0 ? false : z12);
    }
}
