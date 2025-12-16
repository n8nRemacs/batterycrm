package com.avito.android.hotel_booking.konveyor.input;

import RI.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BookingFormInputPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "hasFocus", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class g extends N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f163686l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f163687m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c f163688n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, h hVar, c cVar) {
        super(1);
        this.f163686l = kVar;
        this.f163687m = hVar;
        this.f163688n = cVar;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        c cVar = this.f163688n;
        h hVar = this.f163687m;
        k kVar = this.f163686l;
        if (zBooleanValue) {
            kVar.u0(new f(hVar, cVar));
        } else {
            kVar.u0(null);
            hVar.f163689b.invoke(new b.h(cVar.f163671b));
        }
        return G0.f406611a;
    }
}
