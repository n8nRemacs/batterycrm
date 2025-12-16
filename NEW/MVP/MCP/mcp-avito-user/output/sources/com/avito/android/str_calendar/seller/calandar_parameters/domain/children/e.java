package com.avito.android.str_calendar.seller.calandar_parameters.domain.children;

import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: AvailableChildrenAgesBuilder.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(I)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class e extends N implements Y41.l<Integer, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.h<Integer> f286931l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l0.h<Integer> hVar) {
        super(1);
        this.f286931l = hVar;
    }

    @Override // Y41.l
    public final Boolean invoke(Integer num) {
        int iIntValue = num.intValue();
        Integer num2 = this.f286931l.f406842b;
        return Boolean.valueOf(iIntValue < (num2 != null ? num2.intValue() : Integer.MAX_VALUE));
    }
}
