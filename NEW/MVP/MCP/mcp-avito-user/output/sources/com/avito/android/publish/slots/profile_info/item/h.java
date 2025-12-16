package com.avito.android.publish.slots.profile_info.item;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.rating.RatingBar;
import com.avito.android.remote.model.advert_details.UserIconType;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UserInfoItemViewImpl.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/profile_info/item/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/slots/profile_info/item/g;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ir.d f244705b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f244706c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f244707d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f244708e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final View f244709f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final RatingBar f244710g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f244711h;

    /* compiled from: UserInfoItemViewImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f244712a;

        static {
            int[] iArr = new int[UserIconType.values().length];
            try {
                iArr[UserIconType.SHOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserIconType.COMPANY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f244712a = iArr;
        }
    }

    public h(@k View view, @k ir.d dVar) {
        super(view);
        this.f244705b = dVar;
        this.f244706c = view.getContext();
        View viewFindViewById = view.findViewById(R.id.avatar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f244707d = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f244708e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.rating_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f244709f = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.rating);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.rating.RatingBar");
        }
        this.f244710g = (RatingBar) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.rating_text);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f244711h = (TextView) viewFindViewById5;
    }

    @Override // com.avito.android.publish.slots.profile_info.item.g
    public final void A60(@l com.avito.android.image_loader.a aVar, @k UserIconType userIconType) {
        int i12 = a.f244712a[userIconType.ordinal()];
        Context context = this.f244706c;
        this.f244705b.a(this.f244707d, aVar, userIconType, i12 != 1 ? i12 != 2 ? null : C35835l0.l(context.getDrawable(R.drawable.ic_company_40), C35835l0.d(R.attr.gray28, context)) : C35835l0.l(context.getDrawable(R.drawable.ic_shop_40), C35835l0.d(R.attr.gray28, context)));
    }

    @Override // com.avito.android.publish.slots.profile_info.item.g
    public final void J(@l String str) {
        I5.a(this.f244708e, str, false);
    }

    @Override // com.avito.android.publish.slots.profile_info.item.g
    public final void S2(@l String str, @l Float f12) {
        View view = this.f244709f;
        if (f12 == null && str == null) {
            D6.w(view);
            return;
        }
        D6.G(view, true);
        RatingBar ratingBar = this.f244710g;
        ratingBar.setFloatingRatingIsEnabled(true);
        ratingBar.setRating(f12 != null ? f12.floatValue() : 0.0f);
        if (f12 == null || f12.floatValue() <= 0.0f) {
            f12 = null;
        }
        D6.G(ratingBar, f12 != null);
        I5.a(this.f244711h, str, false);
    }
}
