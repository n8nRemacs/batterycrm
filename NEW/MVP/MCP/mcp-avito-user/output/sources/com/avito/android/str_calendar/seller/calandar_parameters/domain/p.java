package com.avito.android.str_calendar.seller.calandar_parameters.domain;

import Gy0.InterfaceC13931a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: StrCalendarParametersWarningDialogCallbackImpl.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/domain/p;", "Lcom/avito/android/str_calendar/seller/warning_dialog/e;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class p implements com.avito.android.str_calendar.seller.warning_dialog.e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC13931a, G0> f287021b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public p(@Y61.k Y41.l<? super InterfaceC13931a, G0> lVar) {
        this.f287021b = lVar;
    }

    @Override // com.avito.android.str_calendar.seller.warning_dialog.e
    public final void Y2() {
        this.f287021b.invoke(InterfaceC13931a.B.f6807a);
    }

    @Override // com.avito.android.str_calendar.seller.warning_dialog.e
    public final void d1(@Y61.k DeepLink deepLink) {
        this.f287021b.invoke(new InterfaceC13931a.j(deepLink));
    }

    @Override // com.avito.android.str_calendar.seller.warning_dialog.e
    public final void hd(@Y61.l String str) {
        this.f287021b.invoke(new InterfaceC13931a.C(str));
    }
}
