package com.avito.android.service_booking_common.blueprints.info_banner;

import Y61.k;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SbInfoBannerViewHolder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/info_banner/f;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: b, reason: collision with root package name */
    public final Context f276431b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Banner f276432c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC42726C f276433d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC42726C f276434e;

    /* compiled from: SbInfoBannerViewHolder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<TextView> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f276435l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(0);
            this.f276435l = view;
        }

        @Override // Y41.a
        public final TextView invoke() {
            View viewFindViewById = this.f276435l.findViewById(R.id.sb_info_banner_description);
            if (viewFindViewById != null) {
                return (TextView) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    /* compiled from: SbInfoBannerViewHolder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<TextView> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f276436l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(0);
            this.f276436l = view;
        }

        @Override // Y41.a
        public final TextView invoke() {
            View viewFindViewById = this.f276436l.findViewById(R.id.sb_info_banner_title);
            if (viewFindViewById != null) {
                return (TextView) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    public f(@k View view) {
        super(view);
        this.f276431b = view.getContext();
        this.f276432c = (Banner) view;
        this.f276433d = C42727D.c(new b(view));
        InterfaceC42726C interfaceC42726CC = C42727D.c(new a(view));
        this.f276434e = interfaceC42726CC;
        ((TextView) interfaceC42726CC.getValue()).setMovementMethod(LinkMovementMethod.getInstance());
    }
}
