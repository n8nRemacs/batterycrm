package com.avito.android.trx_promo_impl.date_range_picker.mvi;

import SF0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TrxPromoDateRangePickerActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LSF0/a;", "action", "", "invoke", "(LSF0/a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class c extends N implements Y41.l<SF0.a, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final c f304031l = new c();

    public c() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(SF0.a aVar) {
        SF0.a aVar2 = aVar;
        boolean z12 = true;
        if (!(aVar2 instanceof a.C1003a) && !(aVar2 instanceof a.b) && !(aVar2 instanceof a.c)) {
            z12 = false;
        }
        return Boolean.valueOf(z12);
    }
}
