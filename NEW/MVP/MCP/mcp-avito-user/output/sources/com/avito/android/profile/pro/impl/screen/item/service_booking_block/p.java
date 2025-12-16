package com.avito.android.profile.pro.impl.screen.item.service_booking_block;

import android.view.View;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.service_booking_user_profile.view.item.ServiceBookingBlockActionItem;
import com.avito.android.service_booking_user_profile.view.item.a;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class p implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f223513b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f223514c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f223515d;

    public /* synthetic */ p(int i12, Object obj, Object obj2) {
        this.f223513b = i12;
        this.f223514c = obj;
        this.f223515d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DeepLink deepLink;
        Y41.l<? super DeepLink, G0> lVar;
        DeepLink deepLink2;
        Y41.l<? super DeepLink, G0> lVar2;
        Object obj = this.f223514c;
        Object obj2 = this.f223515d;
        switch (this.f223513b) {
            case 0:
                int i12 = q.f223516p;
                a.C8261a c8261a = ((com.avito.android.service_booking_user_profile.view.item.a) obj).f278177f;
                if (c8261a != null && (deepLink = c8261a.f278180a) != null && (lVar = ((q) obj2).f223529n) != null) {
                    ((n) lVar).invoke(deepLink);
                    break;
                }
                break;
            case 1:
                int i13 = q.f223516p;
                a.b bVar = ((com.avito.android.service_booking_user_profile.view.item.a) obj).f278176e;
                if (bVar != null && (deepLink2 = bVar.f278183b) != null && (lVar2 = ((q) obj2).f223529n) != null) {
                    ((n) lVar2).invoke(deepLink2);
                    break;
                }
                break;
            default:
                int i14 = f.f223489m;
                ((Y41.l) obj).invoke(((ServiceBookingBlockActionItem) obj2).f278164d);
                break;
        }
    }
}
