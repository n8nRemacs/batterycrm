package com.avito.android.service_booking_common.blueprints.partner_logo;

import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35949t5;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import qt0.C47444h;

/* compiled from: SbPartnerLogoViewHolder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/partner_logo/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/service_booking_common/blueprints/partner_logo/f;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f276471b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC42726C f276472c;

    /* compiled from: SbPartnerLogoViewHolder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/fresco/SimpleDraweeView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<SimpleDraweeView> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final SimpleDraweeView invoke() {
            View viewFindViewById = g.this.f276471b.findViewById(R.id.sb_partner_logo);
            if (viewFindViewById != null) {
                return (SimpleDraweeView) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
    }

    public g(@k View view) {
        super(view);
        this.f276471b = view;
        this.f276472c = C42727D.c(new a());
    }

    @Override // com.avito.android.service_booking_common.blueprints.partner_logo.f
    public final void ZQ(@k C47444h c47444h) {
        UniversalImage universalImage = c47444h.f429446c;
        InterfaceC42726C interfaceC42726C = this.f276472c;
        C35949t5.c((SimpleDraweeView) interfaceC42726C.getValue(), com.avito.android.image_loader.b.b(universalImage != null ? UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(((SimpleDraweeView) interfaceC42726C.getValue()).getContext())) : null), null, null, null, 14);
    }
}
