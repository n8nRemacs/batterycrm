package com.avito.android.str_booking.domain.polling;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: StrBookingPollingDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LUx0/e;", "response", "Lkotlin/G0;", "invoke", "(LUx0/e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class f extends N implements l<Ux0.e, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f285710l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f285711m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0.a f285712n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, Y41.a<G0> aVar, l0.a aVar2) {
        super(1);
        this.f285710l = str;
        this.f285711m = aVar;
        this.f285712n = aVar2;
    }

    @Override // Y41.l
    public final G0 invoke(Ux0.e eVar) {
        if (!L.f(this.f285710l, eVar.getUpdatedTime())) {
            this.f285711m.invoke();
            this.f285712n.f406838b = false;
        }
        return G0.f406611a;
    }
}
