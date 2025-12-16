package com.yandex.div.evaluable;

import Y61.k;
import com.yandex.div.evaluable.a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Evaluator.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
final class f extends N implements Y41.a<Object> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f369416l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a.C10891a f369417m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, a.C10891a c10891a) {
        super(0);
        this.f369416l = eVar;
        this.f369417m = c10891a;
    }

    @Override // Y41.a
    @k
    public final Object invoke() {
        a.C10891a c10891a = this.f369417m;
        Object objA = this.f369416l.a(c10891a.f369382f);
        c10891a.c(c10891a.f369382f.f369379b);
        return objA;
    }
}
