package K91;

import androidx.view.M0;
import androidx.view.P0;

/* loaded from: classes9.dex */
public final class b implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    public final C91.h f9304a;

    /* renamed from: b, reason: collision with root package name */
    public final I91.c f9305b;

    /* renamed from: c, reason: collision with root package name */
    public final W91.h f9306c;

    public b(C91.h hVar, I91.c cVar, W91.h hVar2) {
        this.f9304a = hVar;
        this.f9305b = cVar;
        this.f9306c = hVar2;
    }

    @Override // androidx.lifecycle.P0.c
    public final M0 create(Class cls) {
        return new A(this.f9304a, this.f9305b, this.f9306c);
    }
}
