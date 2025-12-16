package com.avito.android.profile.pro.impl.screen.item.service_booking_block;

import android.content.Context;
import android.view.ViewGroup;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.service_booking_user_profile.view.item.ServiceBookingBlockActionItem;
import com.avito.android.util.C35949t5;
import com.facebook.drawee.view.SimpleDraweeView;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ProfileProSbBlockActionItem.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/service_booking_block/c;", "LTV0/d;", "Lcom/avito/android/profile/pro/impl/screen/item/service_booking_block/f;", "Lcom/avito/android/service_booking_user_profile/view/item/ServiceBookingBlockActionItem;", "<init>", "()V", "a", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
/* loaded from: classes16.dex */
public final class c implements TV0.d<f, ServiceBookingBlockActionItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public a f223486b;

    /* compiled from: ProfileProSbBlockActionItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/service_booking_block/c$a;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void a(@Y61.k DeepLink deepLink);
    }

    @Inject
    public c() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        ServiceBookingBlockActionItem serviceBookingBlockActionItem = (ServiceBookingBlockActionItem) aVar;
        d dVar = new d(this);
        int iOrdinal = serviceBookingBlockActionItem.f278168h.ordinal();
        SimpleDraweeView simpleDraweeView = fVar.f223492d;
        if (iOrdinal == 0) {
            ViewGroup.LayoutParams layoutParams = simpleDraweeView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = fVar.f223496h;
            layoutParams.height = fVar.f223497i;
            simpleDraweeView.setLayoutParams(layoutParams);
        } else if (iOrdinal == 1) {
            ViewGroup.LayoutParams layoutParams2 = simpleDraweeView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = fVar.f223498j;
            layoutParams2.height = fVar.f223499k;
            simpleDraweeView.setLayoutParams(layoutParams2);
        }
        C35949t5.c(fVar.f223492d, com.avito.android.image_loader.b.b(serviceBookingBlockActionItem.f278163c), fVar.f223500l, ImageRequest.ScaleType.f169473d, null, 8);
        PrintableText printableText = serviceBookingBlockActionItem.f278165e;
        Context context = fVar.f223491c;
        fVar.f223493e.setText(printableText.k0(context));
        fVar.f223494f.setText(serviceBookingBlockActionItem.f278166f.k0(context));
        com.avito.android.util.text.j.a(fVar.f223495g, serviceBookingBlockActionItem.f278167g, fVar.f223490b);
        fVar.itemView.setOnClickListener(new p(2, dVar, serviceBookingBlockActionItem));
    }
}
