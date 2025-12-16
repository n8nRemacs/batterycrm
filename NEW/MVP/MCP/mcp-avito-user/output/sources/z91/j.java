package z91;

import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class j extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s f443912l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(s sVar) {
        super(0);
        this.f443912l = sVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        s sVar = this.f443912l;
        d dVar = sVar.f443921a;
        return new ru.mts.biometry.api.d(dVar.f443903a, dVar.f443905c, (ru.mts.biometry.api.repo.c) sVar.f443932l.getValue(), (ru.mts.biometry.api.repo.a) sVar.f443933m.getValue());
    }
}
