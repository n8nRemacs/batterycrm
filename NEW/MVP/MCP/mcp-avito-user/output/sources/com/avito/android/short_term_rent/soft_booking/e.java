package com.avito.android.short_term_rent.soft_booking;

import com.avito.android.short_term_rent.soft_booking.entity.StrSoftBookingContactFieldType;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ow0.InterfaceC44950a;

/* compiled from: StrSoftBookingFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "text", "Lcom/avito/android/short_term_rent/soft_booking/entity/StrSoftBookingContactFieldType;", "type", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Lcom/avito/android/short_term_rent/soft_booking/entity/StrSoftBookingContactFieldType;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class e extends N implements Y41.p<String, StrSoftBookingContactFieldType, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ StrSoftBookingFragment f282653l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(StrSoftBookingFragment strSoftBookingFragment) {
        super(2);
        this.f282653l = strSoftBookingFragment;
    }

    @Override // Y41.p
    public final G0 invoke(String str, StrSoftBookingContactFieldType strSoftBookingContactFieldType) {
        kotlin.reflect.n<Object>[] nVarArr = StrSoftBookingFragment.f282537y0;
        this.f282653l.q5().accept(new InterfaceC44950a.d(strSoftBookingContactFieldType, str));
        return G0.f406611a;
    }
}
