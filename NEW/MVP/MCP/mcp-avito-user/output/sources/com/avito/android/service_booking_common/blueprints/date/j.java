package com.avito.android.service_booking_common.blueprints.date;

import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import qt0.C47440d;

/* compiled from: SbDateItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, "Lkotlin/G0;", "invoke", "(II)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class j extends N implements Y41.p<Integer, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f276362l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C47440d f276363m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, C47440d c47440d) {
        super(2);
        this.f276362l = kVar;
        this.f276363m = c47440d;
    }

    @Override // Y41.p
    public final G0 invoke(Integer num, Integer num2) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        this.f276362l.f276350b.K5(C47440d.b(this.f276363m, null, new C47440d.b(iIntValue, iIntValue2), 7));
        return G0.f406611a;
    }
}
