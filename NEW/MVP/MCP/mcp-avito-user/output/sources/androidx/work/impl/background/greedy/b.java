package androidx.work.impl.background.greedy;

import androidx.annotation.RestrictTo;
import androidx.work.G;
import androidx.work.X;
import androidx.work.impl.C23550e;
import j.N;
import java.util.HashMap;

/* compiled from: DelayedWorkTracker.java */
@RestrictTo
/* loaded from: classes10.dex */
public class b {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f55572e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final c f55573a;

    /* renamed from: b, reason: collision with root package name */
    public final C23550e f55574b;

    /* renamed from: c, reason: collision with root package name */
    public final X f55575c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f55576d = new HashMap();

    static {
        G.b("DelayedWorkTracker");
    }

    public b(@N c cVar, @N C23550e c23550e, @N X x12) {
        this.f55573a = cVar;
        this.f55574b = c23550e;
        this.f55575c = x12;
    }
}
