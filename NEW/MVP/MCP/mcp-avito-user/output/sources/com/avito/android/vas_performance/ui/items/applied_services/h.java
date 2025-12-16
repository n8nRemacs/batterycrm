package com.avito.android.vas_performance.ui.items.applied_services;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.user_advert.advert.items.service_booking.i;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import j.InterfaceC42150f;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AppliedServiceItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/applied_services/h;", "Lcom/avito/android/vas_performance/ui/items/applied_services/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f321576j = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f321577b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final View f321578c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f321579d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Chips f321580e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f321581f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f321582g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final SimpleDraweeView f321583h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final SimpleDraweeView f321584i;

    public h(@k View view) {
        super(view);
        this.f321577b = view.getContext();
        View viewFindViewById = view.findViewById(R.id.applied_service_item);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f321578c = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.action_text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f321579d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.stickers);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.Chips");
        }
        this.f321580e = (Chips) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.service_title);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f321581f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.service_description);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f321582g = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.service_icon);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f321583h = (SimpleDraweeView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.action_icon);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f321584i = (SimpleDraweeView) viewFindViewById7;
    }

    @Override // com.avito.android.vas_performance.ui.items.applied_services.g
    public final void E9(@l String str) {
        SpannableString spannableString;
        if (str != null) {
            spannableString = new SpannableString(str);
            spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
        } else {
            spannableString = null;
        }
        I5.a(this.f321579d, spannableString, false);
    }

    @Override // com.avito.android.vas_performance.ui.items.applied_services.g
    public final void UK(@l ArrayList arrayList, @l List list) {
        G0 g02;
        Chips chips = this.f321580e;
        if (list != null) {
            D6.H(chips);
            chips.setData(list);
            if (arrayList != null) {
                chips.setMaxSelected(arrayList.size());
                chips.r(arrayList);
            }
            chips.setEditable(false);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            D6.w(chips);
        }
    }

    @Override // com.avito.android.vas_performance.ui.items.applied_services.g
    public final void h(@k String str) {
        this.f321582g.setText(str);
    }

    @Override // com.avito.android.vas_performance.ui.items.applied_services.g
    public final void oI(@l UniversalImage universalImage, @InterfaceC42150f @l Integer num, @l Y41.a<G0> aVar) {
        Image imageDependsOnThemeOrDefault;
        Context context = this.f321577b;
        com.avito.android.image_loader.a aVarB = (universalImage == null || (imageDependsOnThemeOrDefault = UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(context))) == null) ? null : com.avito.android.image_loader.b.b(imageDependsOnThemeOrDefault);
        SimpleDraweeView simpleDraweeView = this.f321584i;
        if (aVarB != null) {
            D6.H(simpleDraweeView);
            ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
            aVarA.d(aVarB);
            aVarA.c();
            simpleDraweeView.setOnClickListener(new i(20, aVar));
        } else {
            D6.w(simpleDraweeView);
            simpleDraweeView.setOnClickListener(null);
        }
        simpleDraweeView.setColorFilter(num != null ? new PorterDuffColorFilter(C35835l0.d(num.intValue(), context), PorterDuff.Mode.SRC_IN) : null);
    }

    @Override // com.avito.android.vas_performance.ui.items.applied_services.g
    public final void setTitle(@k String str) {
        this.f321581f.setText(str);
    }

    @Override // com.avito.android.vas_performance.ui.items.applied_services.g
    public final void wF(@l Y41.a<G0> aVar) {
        this.f321578c.setOnClickListener(new i(21, aVar));
    }

    @Override // com.avito.android.vas_performance.ui.items.applied_services.g
    public final void x(@k com.avito.android.image_loader.k kVar) {
        ImageRequest.a aVarA = C35949t5.a(this.f321583h);
        aVarA.d(kVar);
        aVarA.c();
    }

    @Override // com.avito.android.vas_performance.ui.items.applied_services.g
    public final void yJ(@InterfaceC42150f int i12) {
        this.f321582g.setTextColor(C35835l0.d(i12, this.f321577b));
    }
}
