package com.avito.android.str_booking.ui;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.str_booking.network.models.sections.OnboardingTooltip;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ly0.InterfaceC43849a;

/* compiled from: Views.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "com/avito/android/util/G6", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f286025b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.str_booking.domain.c f286026c;

    public g(RecyclerView recyclerView, com.avito.android.str_booking.domain.c cVar) {
        this.f286025b = recyclerView;
        this.f286026c = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.avito.android.str_booking.domain.c cVar = this.f286026c;
        Object objP = this.f286025b.P(cVar.f285573a);
        if (objP == null || !(objP instanceof InterfaceC43849a)) {
            return;
        }
        OnboardingTooltip onboardingTooltip = cVar.f285575c;
        ((InterfaceC43849a) objP).Bq(cVar.f285574b, onboardingTooltip.getTitle(), onboardingTooltip.getSubtitle());
    }
}
