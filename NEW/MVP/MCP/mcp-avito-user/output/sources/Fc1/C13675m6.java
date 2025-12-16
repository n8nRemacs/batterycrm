package Fc1;

import android.app.Application;
import android.text.TextUtils;

@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: Fc1.m6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13675m6 implements dagger.internal.h<C13641j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f5676a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f5677b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f5678c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f5679d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f5680e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f5681f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f5682g;

    public C13675m6(U5 u52, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.u uVar, dagger.internal.l lVar3, dagger.internal.l lVar4, dagger.internal.l lVar5, dagger.internal.u uVar2) {
        this.f5676a = lVar;
        this.f5677b = lVar2;
        this.f5678c = uVar;
        this.f5679d = lVar3;
        this.f5680e = lVar4;
        this.f5681f = lVar5;
        this.f5682g = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() throws xyz.n.a.e5 {
        Application application = (Application) this.f5676a.f393949a;
        String str = (String) this.f5677b.f393949a;
        Q q12 = (Q) this.f5678c.get();
        C13757w c13757w = (C13757w) this.f5679d.f393949a;
        C13729s7 c13729s7 = (C13729s7) this.f5680e.f393949a;
        K7 k72 = (K7) this.f5681f.f393949a;
        H3 h32 = (H3) this.f5682g.get();
        if (TextUtils.equals(application.getPackageName() + c13757w.f5865a.f2315o, B2.b(application))) {
            if (str.length() == 25) {
                return new C13641j(application.getApplicationContext(), str, c13757w, q12, c13729s7, k72, h32);
            }
            throw new xyz.n.a.e5(xyz.n.a.j2.APP_ID_IS_WRONG, str);
        }
        xyz.n.a.j2 j2Var = xyz.n.a.j2.LAUNCHED_WRONG_PROCESS;
        String strB = B2.b(application);
        if (strB == null) {
            kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
            strB = "";
        }
        throw new xyz.n.a.e5(j2Var, strB);
    }
}
