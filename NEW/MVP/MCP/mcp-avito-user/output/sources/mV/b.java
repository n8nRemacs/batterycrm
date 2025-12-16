package MV;

import MV.a;
import com.avito.android.lib.design.zoom.e;

/* compiled from: TransformGestureDetector.java */
/* loaded from: classes14.dex */
public class b implements a.InterfaceC0679a {

    /* renamed from: a, reason: collision with root package name */
    public final MV.a f10703a;

    /* renamed from: b, reason: collision with root package name */
    public e f10704b = null;

    /* compiled from: TransformGestureDetector.java */
    public interface a {
        void c(b bVar);

        void h(b bVar);
    }

    public b(MV.a aVar) {
        this.f10703a = aVar;
        aVar.f10702h = this;
    }

    public static float a(int i12, float[] fArr) {
        float f12 = 0.0f;
        for (int i13 = 0; i13 < i12; i13++) {
            f12 += fArr[i13];
        }
        if (i12 > 0) {
            return f12 / i12;
        }
        return 0.0f;
    }

    public final void b() {
        e eVar;
        e eVar2;
        MV.a aVar = this.f10703a;
        boolean z12 = aVar.f10695a;
        if (z12) {
            if (z12) {
                aVar.f10695a = false;
                b bVar = aVar.f10702h;
                if (bVar != null && (eVar2 = bVar.f10704b) != null) {
                    eVar2.s();
                }
            }
            for (int i12 = 0; i12 < 2; i12++) {
                aVar.f10698d[i12] = aVar.f10700f[i12];
                aVar.f10699e[i12] = aVar.f10701g[i12];
            }
            if (aVar.f10695a) {
                return;
            }
            b bVar2 = aVar.f10702h;
            if (bVar2 != null && (eVar = bVar2.f10704b) != null) {
                eVar.h(bVar2);
            }
            aVar.f10695a = true;
        }
    }
}
