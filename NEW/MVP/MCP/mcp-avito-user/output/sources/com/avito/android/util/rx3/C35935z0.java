package com.avito.android.util.rx3;

import com.avito.android.util.rx3.H0;
import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.internal.operators.flowable.C41892v;
import io.reactivex.rxjava3.internal.operators.flowable.I1;
import java.util.Objects;
import kotlin.InterfaceC43072x;
import l41.InterfaceC43543a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.util.rx3.z0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C35935z0 implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f319042b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I1 f319043c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.core.H f319044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l41.o f319045e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43072x f319046f;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C35935z0(I1 i12, A0 a02, Y41.l lVar, io.reactivex.rxjava3.core.H h12) {
        this.f319043c = i12;
        this.f319045e = a02;
        this.f319046f = (kotlin.jvm.internal.N) lVar;
        this.f319044d = h12;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // l41.o
    public final Object apply(Object obj) {
        io.reactivex.rxjava3.core.H h12 = this.f319044d;
        InterfaceC43072x interfaceC43072x = this.f319046f;
        l41.o oVar = this.f319045e;
        I1 i12 = this.f319043c;
        int i13 = 0;
        switch (this.f319042b) {
            case 0:
                AbstractC41777j<R> abstractC41777jC = ((AbstractC41777j) obj).y(new C41892v(new org.reactivestreams.c[]{i12, AbstractC41777j.j(-1L)})).c((A0) oVar);
                H0.a aVar = new H0.a(new B0((kotlin.jvm.internal.N) interfaceC43072x));
                abstractC41777jC.getClass();
                l41.g<Object> gVar = io.reactivex.rxjava3.internal.functions.a.f401994d;
                InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
                Objects.requireNonNull(gVar, "onError is null");
                Objects.requireNonNull(interfaceC43543a, "onComplete is null");
                return new io.reactivex.rxjava3.internal.operators.flowable.S(abstractC41777jC, aVar, gVar, interfaceC43543a, interfaceC43543a).c(new A0(h12, i13));
            default:
                AbstractC41777j<R> abstractC41777jC2 = ((AbstractC41777j) obj).y(new C41892v(new org.reactivestreams.c[]{i12, AbstractC41777j.j(-1L)})).c((A0) oVar);
                H0.a aVar2 = new H0.a(new B0((Y41.l) interfaceC43072x));
                abstractC41777jC2.getClass();
                l41.g<Object> gVar2 = io.reactivex.rxjava3.internal.functions.a.f401994d;
                InterfaceC43543a interfaceC43543a2 = io.reactivex.rxjava3.internal.functions.a.f401993c;
                Objects.requireNonNull(gVar2, "onError is null");
                Objects.requireNonNull(interfaceC43543a2, "onComplete is null");
                return new io.reactivex.rxjava3.internal.operators.flowable.S(abstractC41777jC2, aVar2, gVar2, interfaceC43543a2, interfaceC43543a2).c(new A0(h12, i13));
        }
    }

    public /* synthetic */ C35935z0(I1 i12, A0 a02, Y41.l lVar, io.reactivex.rxjava3.core.H h12, byte b12) {
        this.f319043c = i12;
        this.f319045e = a02;
        this.f319046f = lVar;
        this.f319044d = h12;
    }
}
