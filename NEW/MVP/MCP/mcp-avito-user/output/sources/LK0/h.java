package LK0;

import PK0.q;
import com.avito.android.util.C35860o1;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FormatterV1Module_ProvideFontParamsFormatterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<IK0.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f9911a;

    public h(u uVar) {
        this.f9911a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        q qVar = (q) this.f9911a.get();
        b.f9902a.getClass();
        return new C35860o1(qVar);
    }
}
