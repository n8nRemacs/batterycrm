package com.avito.android.profile.user_profile.cards.comfortable_deal.item_new_status;

import Y61.k;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.fresco.s;
import com.avito.android.lib.design.avatar.Avatar;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.user_profile.items.Banner;
import com.avito.android.util.C35787f0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ComfortableDealWithStatusCardItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/comfortable_deal/item_new_status/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile/user_profile/cards/comfortable_deal/item_new_status/f;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f224901k = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ConstraintLayout f224902b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f224903c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f224904d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SimpleDraweeView f224905e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f224906f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Avatar f224907g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f224908h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final ConstraintLayout f224909i;

    /* renamed from: j, reason: collision with root package name */
    public final Resources f224910j;

    public i(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.profile_comfortable_deal_with_status_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        this.f224902b = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title_banner);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById2;
        this.f224903c = textView;
        View viewFindViewById3 = view.findViewById(R.id.title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f224904d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.image);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f224905e = (SimpleDraweeView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.description);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f224906f = (TextView) viewFindViewById5;
        this.f224907g = (Avatar) view.findViewById(R.id.avatar);
        this.f224908h = (TextView) view.findViewById(R.id.name);
        View viewFindViewById6 = view.findViewById(R.id.user_profile_common_card_container);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        this.f224909i = (ConstraintLayout) viewFindViewById6;
        this.f224910j = textView.getResources();
    }

    @Override // com.avito.android.profile.user_profile.cards.comfortable_deal.item_new_status.f
    public final void S(@k Y41.a<G0> aVar) {
        this.f224902b.setOnClickListener(new com.avito.android.profile.edit.adapter.c(14, aVar));
    }

    @Override // com.avito.android.profile.user_profile.cards.comfortable_deal.item_new_status.f
    public final void SJ(@k Banner banner) throws Resources.NotFoundException {
        I5.a(this.f224904d, banner.getTitle(), false);
        j.a(this.f224906f, banner.getDescription(), null);
        com.avito.android.image_loader.a aVarB = com.avito.android.image_loader.b.b(banner.getItemImage());
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
        Resources resources = this.f224910j;
        C35949t5.c(this.f224905e, aVarB, resources.getDrawable(R.drawable.ic_placeholder_cd, null), ImageRequest.ScaleType.f169474e, null, 8);
        String badgeFallback = banner.getBadgeFallback();
        Image badgeImage = banner.getBadgeImage();
        TextView textView = this.f224908h;
        if (badgeImage != null) {
            D6.w(textView);
            Avatar avatar = this.f224907g;
            s.a(avatar, badgeImage, true, true, new g(avatar), new h(avatar));
        } else {
            boolean z12 = badgeFallback == null || badgeFallback.length() == 0;
            Avatar avatar2 = this.f224907g;
            if (z12) {
                avatar2.setImage(resources.getDrawable(R.drawable.ic_comfortable_deal, null));
            } else {
                avatar2.setImage(null);
                I5.a(textView, String.valueOf(badgeFallback != null ? Character.valueOf(C43066x.D(badgeFallback)) : null), false);
            }
        }
        Drawable drawable = resources.getDrawable(R.drawable.user_profile_rounded_bg, null);
        if (com.avito.android.lib.util.darkTheme.c.a(this.f224903c.getContext())) {
            Integer numA = C35787f0.a("#FF1F1E1D");
            if (numA != null) {
                int iIntValue = numA.intValue();
                if (drawable != null) {
                    drawable.setTint(iIntValue);
                }
            }
        } else {
            Integer numA2 = C35787f0.a("#EBEAE8");
            if (numA2 != null) {
                int iIntValue2 = numA2.intValue();
                if (drawable != null) {
                    drawable.setTint(iIntValue2);
                }
            }
        }
        this.f224909i.setBackground(drawable);
    }

    @Override // com.avito.android.profile.user_profile.cards.comfortable_deal.item_new_status.f
    public final void b(@k String str) {
        I5.a(this.f224903c, str, false);
    }
}
