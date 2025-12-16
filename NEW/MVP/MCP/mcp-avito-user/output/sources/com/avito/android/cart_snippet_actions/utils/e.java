package com.avito.android.cart_snippet_actions.utils;

import Y41.l;
import java.util.LinkedHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ItemQuantityChanges.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Response", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.subjects.e<Object> f116283l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f116284m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f116285n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f116286o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f116287p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(io.reactivex.rxjava3.subjects.e eVar, l lVar, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, LinkedHashMap linkedHashMap3) {
        super(0);
        this.f116283l = eVar;
        this.f116284m = (N) lVar;
        this.f116285n = linkedHashMap;
        this.f116286o = linkedHashMap2;
        this.f116287p = linkedHashMap3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.a
    public final G0 invoke() {
        Object objInvoke = this.f116284m.invoke(this.f116285n);
        io.reactivex.rxjava3.subjects.e<Object> eVar = this.f116283l;
        eVar.onNext(objInvoke);
        eVar.e();
        this.f116286o.clear();
        this.f116287p.clear();
        return G0.f406611a;
    }
}
