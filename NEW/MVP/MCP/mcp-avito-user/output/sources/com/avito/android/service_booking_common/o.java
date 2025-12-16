package com.avito.android.service_booking_common;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.service_booking_common.di.InterfaceC34926b;
import com.avito.android.util.InterfaceC35945t1;
import java.util.Date;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceBookingResourceProvider.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_common/o;", "Lcom/avito/android/service_booking_common/n;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f276677a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35945t1<Long> f276678b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f276679c;

    @Inject
    public o(@Y61.k Resources resources, @InterfaceC34926b @Y61.k InterfaceC35945t1<Long> interfaceC35945t1) throws Resources.NotFoundException {
        this.f276677a = resources;
        this.f276678b = interfaceC35945t1;
        resources.getString(R.string.sb_default_error);
        this.f276679c = resources.getString(R.string.sb_close_btn);
    }

    @Override // com.avito.android.service_booking_common.n
    @Y61.k
    public final String a(@Y61.l Date date) {
        if (date != null) {
            String strA = this.f276678b.a(Long.valueOf(date.getTime()));
            if (strA != null) {
                return strA;
            }
        }
        return "";
    }

    @Override // com.avito.android.service_booking_common.n
    @Y61.k
    public final String b(@Y61.l Integer num) {
        return this.f276677a.getQuantityString(R.plurals.services, num != null ? num.intValue() : 0, Integer.valueOf(num != null ? num.intValue() : 0));
    }

    @Override // com.avito.android.service_booking_common.n
    @Y61.k
    public final String c() {
        return this.f276677a.getString(R.string.sb_service_info_close_btn_title);
    }

    @Override // com.avito.android.service_booking_common.n
    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getF276679c() {
        return this.f276679c;
    }

    @Override // com.avito.android.service_booking_common.n
    @Y61.k
    public final String e(@Y61.k String str) {
        return this.f276677a.getString(R.string.sb_next_step_button_title, str);
    }
}
