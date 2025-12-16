package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.G;
import androidx.work.X;
import j.N;

/* compiled from: ConstraintsCommandHandler.java */
@RestrictTo
/* loaded from: classes10.dex */
class c {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f55612e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f55613a;

    /* renamed from: b, reason: collision with root package name */
    public final X f55614b;

    /* renamed from: c, reason: collision with root package name */
    public final int f55615c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.work.impl.constraints.f f55616d;

    static {
        G.b("ConstraintsCmdHandler");
    }

    public c(@N Context context, X x12, int i12, @N f fVar) {
        this.f55613a = context;
        this.f55614b = x12;
        this.f55615c = i12;
        this.f55616d = new androidx.work.impl.constraints.f(fVar.f55638f.f55567l);
    }
}
