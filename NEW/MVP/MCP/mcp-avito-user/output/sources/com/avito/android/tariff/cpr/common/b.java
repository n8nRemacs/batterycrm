package com.avito.android.tariff.cpr.common;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;

/* compiled from: CoroutinesExtensions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "param", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class b extends N implements l<Object, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.h<N0> f295139l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T f295140m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l<Object, G0> f295141n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l0.h hVar, T t12, l lVar) {
        super(1);
        this.f295139l = hVar;
        this.f295140m = t12;
        this.f295141n = lVar;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [T, kotlinx.coroutines.N0] */
    @Override // Y41.l
    public final G0 invoke(Object obj) {
        l0.h<N0> hVar = this.f295139l;
        if (hVar.f406842b == null) {
            hVar.f406842b = C43259k.d(this.f295140m, null, null, new a(this.f295141n, obj, hVar, null), 3);
        }
        return G0.f406611a;
    }
}
