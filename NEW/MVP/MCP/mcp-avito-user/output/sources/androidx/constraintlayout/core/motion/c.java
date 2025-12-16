package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.n;
import androidx.constraintlayout.core.motion.utils.w;
import java.util.ArrayList;

/* compiled from: Motion.java */
/* loaded from: classes.dex */
public class c implements w {

    /* renamed from: a, reason: collision with root package name */
    public final f f43246a;

    /* renamed from: b, reason: collision with root package name */
    public final e f43247b;

    /* renamed from: c, reason: collision with root package name */
    public final e f43248c;

    /* renamed from: d, reason: collision with root package name */
    public final d f43249d;

    /* renamed from: e, reason: collision with root package name */
    public final d f43250e;

    public c(f fVar) {
        new n();
        this.f43247b = new e();
        this.f43248c = new e();
        this.f43249d = new d();
        this.f43250e = new d();
        new ArrayList();
        new ArrayList();
        this.f43246a = fVar;
    }

    public final void a(f fVar) {
        e eVar = this.f43248c;
        eVar.getClass();
        eVar.f43252b = 1.0f;
        this.f43246a.f43256a.getClass();
        float f12 = 0;
        this.f43246a.f43256a.getClass();
        this.f43246a.f43256a.getClass();
        this.f43246a.f43256a.getClass();
        eVar.f43253c = f12;
        eVar.f43254d = f12;
        fVar.f43256a.getClass();
        fVar.f43256a.getClass();
        fVar.f43256a.getClass();
        fVar.f43256a.getClass();
        eVar.f43253c = f12;
        eVar.f43254d = f12;
        eVar.a(fVar);
        this.f43250e.a(fVar);
    }

    public final void b(f fVar) {
        e eVar = this.f43247b;
        eVar.getClass();
        eVar.f43252b = 0.0f;
        fVar.f43256a.getClass();
        float f12 = 0;
        fVar.f43256a.getClass();
        fVar.f43256a.getClass();
        fVar.f43256a.getClass();
        eVar.f43253c = f12;
        eVar.f43254d = f12;
        eVar.a(fVar);
        this.f43249d.a(fVar);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(" start: x: ");
        e eVar = this.f43247b;
        sb2.append(eVar.f43253c);
        sb2.append(" y: ");
        sb2.append(eVar.f43254d);
        sb2.append(" end: x: ");
        e eVar2 = this.f43248c;
        sb2.append(eVar2.f43253c);
        sb2.append(" y: ");
        sb2.append(eVar2.f43254d);
        return sb2.toString();
    }
}
