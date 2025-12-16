package com.avito.android.extended_profile_widgets.adapter.header;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.rating.RatingBar;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.remote.model.AvatarShape;
import com.avito.android.remote.model.ProfileCounter;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35852n1;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: HeaderItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/header/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/extended_profile_widgets/adapter/header/j;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f154447n = 0;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f154448b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f154449c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f154450d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f154451e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f154452f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f154453g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final RatingBar f154454h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f154455i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final TextView f154456j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Spinner f154457k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final TextView f154458l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final TextView f154459m;

    public l(@Y61.k View view, boolean z12) {
        super(view);
        this.f154448b = z12;
        this.f154449c = view.getContext();
        View viewFindViewById = view.findViewById(R.id.avatar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f154450d = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.name);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f154451e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.subtitle);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f154452f = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.rating_number);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f154453g = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.rating_score);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.rating.RatingBar");
        }
        this.f154454h = (RatingBar) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.rating_text);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f154455i = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.subscribe_text);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f154456j = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.subscribe_spinner);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.spinner.Spinner");
        }
        this.f154457k = (Spinner) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.subscribers_and_subscriptions);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f154458l = (TextView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.company_name);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f154459m = (TextView) viewFindViewById10;
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.header.j
    public final void C60(@Y61.l String str) {
        I5.a(this.f154459m, str, false);
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.header.j
    public final void G8(@Y61.l String str) {
        I5.a(this.f154451e, str, false);
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.header.j
    public final void K60(@Y61.l ProfileCounter profileCounter, @Y61.l ProfileCounter profileCounter2) {
        ArrayList arrayList = new ArrayList();
        if (profileCounter != null) {
            arrayList.add(profileCounter.getTitle() + (char) 160 + profileCounter.getSubtitle());
        }
        if (profileCounter2 != null) {
            arrayList.add(profileCounter2.getTitle() + (char) 160 + profileCounter2.getSubtitle());
        }
        I5.a(this.f154458l, C42745f0.O(arrayList, ", ", null, null, null, 62), false);
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.header.j
    public final void X6(@Y61.l Float f12, @Y61.l String str, boolean z12, @Y61.l Y41.a aVar) {
        boolean z13 = f12 != null;
        TextView textView = this.f154453g;
        D6.G(textView, z13);
        RatingBar ratingBar = this.f154454h;
        D6.G(ratingBar, z13);
        textView.setText(f12 != null ? C35852n1.a(f12.floatValue()) : null);
        ratingBar.setFloatingRatingIsEnabled(true);
        ratingBar.setRating(f12 != null ? f12.floatValue() : 0.0f);
        boolean z14 = str != null;
        TextView textView2 = this.f154455i;
        D6.G(textView2, z14);
        textView2.setText(str == null ? "" : str);
        textView2.setTextColor(C35835l0.d(str != null ? z12 ? R.attr.blue : R.attr.black : R.attr.gray28, this.f154449c));
        textView.setOnClickListener(new k(3, aVar));
        ratingBar.setOnClickListener(new k(4, aVar));
        textView2.setOnClickListener(new k(5, aVar));
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.header.j
    public final void fE(@Y61.k Y41.a<G0> aVar) {
        TextView textView = this.f154456j;
        textView.setText(R.string.notification_settings_title);
        D6.H(textView);
        textView.setOnClickListener(new k(0, aVar));
        D6.w(this.f154457k);
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.header.j
    public final void iS() {
        D6.w(this.f154456j);
        D6.w(this.f154457k);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f154450d.setOnClickListener(null);
        this.f154453g.setOnClickListener(null);
        this.f154454h.setOnClickListener(null);
        this.f154455i.setOnClickListener(null);
        this.f154456j.setOnClickListener(null);
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.header.j
    public final void n6(@Y61.l String str) {
        I5.a(this.f154452f, str, false);
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.header.j
    public final void tq(boolean z12) {
        this.f154456j.setVisibility(!z12 ? 0 : 8);
        this.f154457k.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.header.j
    public final void wq(@Y61.k Y41.a<G0> aVar) {
        TextView textView = this.f154456j;
        textView.setText(R.string.public_profile_subscribe);
        D6.H(textView);
        textView.setOnClickListener(new k(2, aVar));
        D6.w(this.f154457k);
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.header.j
    public final void zC(@Y61.k com.avito.android.image_loader.a aVar, @Y61.k AvatarShape avatarShape, @Y61.k Y41.a aVar2) {
        AvatarShape avatarShape2 = AvatarShape.CIRCLE;
        D6.c(this.f154450d, null, Integer.valueOf(y6.b(avatarShape == avatarShape2 ? 6 : 14)), null, null, 13);
        boolean z12 = avatarShape == avatarShape2;
        SimpleDraweeView simpleDraweeView = this.f154450d;
        com.avito.android.component.user_hat.b.a(simpleDraweeView, aVar, z12, this.f154448b);
        simpleDraweeView.setOnClickListener(new k(1, aVar2));
    }
}
