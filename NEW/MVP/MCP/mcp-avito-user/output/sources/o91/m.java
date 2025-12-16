package O91;

import androidx.view.M0;
import androidx.view.P0;

/* loaded from: classes9.dex */
public final class m implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    public final ru.mts.biometry.api.dataSource.j f12054a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.mts.biometry.api.dataSource.o f12055b;

    /* renamed from: c, reason: collision with root package name */
    public final W91.h f12056c;

    public m(ru.mts.biometry.api.dataSource.j jVar, ru.mts.biometry.api.dataSource.o oVar, W91.h hVar) {
        this.f12054a = jVar;
        this.f12055b = oVar;
        this.f12056c = hVar;
    }

    @Override // androidx.lifecycle.P0.c
    public final M0 create(Class cls) {
        return new o(new M91.a(this.f12054a, this.f12055b), this.f12056c);
    }
}
