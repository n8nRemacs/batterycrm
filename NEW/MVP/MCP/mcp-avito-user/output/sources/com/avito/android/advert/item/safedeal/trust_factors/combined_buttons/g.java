package com.avito.android.advert.item.safedeal.trust_factors.combined_buttons;

import android.view.View;
import com.avito.android.service_booking_day_settings.daysettings.adapter.k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79093b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f79094c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y41.a f79095d;

    public /* synthetic */ g(boolean z12, Y41.a aVar, int i12) {
        this.f79093b = i12;
        this.f79094c = z12;
        this.f79095d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Y41.a aVar = this.f79095d;
        boolean z12 = this.f79094c;
        switch (this.f79093b) {
            case 0:
                int i12 = h.f79096i;
                if (z12) {
                    aVar.invoke();
                    break;
                }
                break;
            default:
                int i13 = k.f276744g;
                if (z12) {
                    aVar.invoke();
                    break;
                }
                break;
        }
    }
}
