package com.avito.android.str_booking.ui.user_info;

import com.avito.android.str_booking.network.models.sections.UserInfoContent;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: StrBookingUserInfoPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_booking/ui/user_info/j;", "LTV0/f;", "Lcom/avito/android/str_booking/ui/user_info/l;", "Lcom/avito/android/str_booking/ui/user_info/c;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements TV0.f<l, c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<com.avito.android.str_booking.mvi.entity.a, G0> f286186b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public j(@Y61.k Y41.l<? super com.avito.android.str_booking.mvi.entity.a, G0> lVar) {
        this.f286186b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        l lVar = (l) eVar;
        c cVar = (c) aVar;
        lVar.Vs(cVar);
        UserInfoContent userInfoContent = cVar.f286179b;
        lVar.Nt(userInfoContent != null ? L.f(userInfoContent.getIsActive(), Boolean.TRUE) : false);
        lVar.Kj(cVar, new e(this));
        lVar.RI(cVar, new f(this), new g(this));
        if (cVar.f286180c) {
            lVar.qz(new h(this));
        }
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        l lVar = (l) eVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof Boolean) {
                obj = obj2;
            }
        }
        Boolean bool = (Boolean) (obj instanceof Boolean ? obj : null);
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        lVar.qz(new i(this));
    }
}
