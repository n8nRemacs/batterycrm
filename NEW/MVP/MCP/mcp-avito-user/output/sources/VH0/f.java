package VH0;

import com.avito.android.N2;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PublishCsatUxFeedbackDelegateImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f17043a;

    /* renamed from: b, reason: collision with root package name */
    public final u f17044b;

    /* renamed from: c, reason: collision with root package name */
    public final u f17045c;

    public f(u uVar, u uVar2, u uVar3) {
        this.f17043a = uVar;
        this.f17044b = uVar2;
        this.f17045c = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((g) this.f17043a.get(), (SK0.b) this.f17044b.get(), (N2) this.f17045c.get());
    }
}
