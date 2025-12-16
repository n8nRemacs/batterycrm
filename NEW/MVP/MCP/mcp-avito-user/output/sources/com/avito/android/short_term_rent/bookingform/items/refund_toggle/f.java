package com.avito.android.short_term_rent.bookingform.items.refund_toggle;

import Y41.p;
import com.avito.android.short_term_rent.bookingform.mvi.entity.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RefundTogglePresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "buttonId", "", "isSelected", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class f extends N implements p<String, Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f281607l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ RefundToggleItem f281608m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, RefundToggleItem refundToggleItem) {
        super(2);
        this.f281607l = hVar;
        this.f281608m = refundToggleItem;
    }

    @Override // Y41.p
    public final G0 invoke(String str, Boolean bool) {
        this.f281607l.f281610b.invoke(new a.q(str, bool.booleanValue(), this.f281608m.f281580c));
        return G0.f406611a;
    }
}
