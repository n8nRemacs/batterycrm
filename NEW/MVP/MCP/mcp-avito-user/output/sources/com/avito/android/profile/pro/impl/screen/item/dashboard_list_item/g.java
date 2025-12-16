package com.avito.android.profile.pro.impl.screen.item.dashboard_list_item;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.inline_filters.dialog.select.ViewOnClickListenerC31042l;
import com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.j;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35949t5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileOtherDashboardView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/dashboard_list_item/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile/pro/impl/screen/item/dashboard_list_item/f;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f223138m = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f223139b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f223140c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ConstraintLayout f223141d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f223142e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f223143f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f223144g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f223145h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final View f223146i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final View f223147j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final SimpleDraweeView f223148k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final SimpleDraweeView f223149l;

    /* compiled from: ProfileOtherDashboardView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ItemSeverity.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ItemSeverity itemSeverity = ItemSeverity.f223095b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ItemSeverity itemSeverity2 = ItemSeverity.f223095b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ItemSeverity itemSeverity3 = ItemSeverity.f223095b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ItemSeverity itemSeverity4 = ItemSeverity.f223095b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ItemSeverity itemSeverity5 = ItemSeverity.f223095b;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[ItemSlug.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                ItemSlug itemSlug = ItemSlug.f223103d;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                ItemSlug itemSlug2 = ItemSlug.f223103d;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                ItemSlug itemSlug3 = ItemSlug.f223103d;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                ItemSlug itemSlug4 = ItemSlug.f223103d;
                iArr2[6] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                ItemSlug itemSlug5 = ItemSlug.f223103d;
                iArr2[4] = 6;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public g(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f223139b = aVar;
        this.f223140c = (TextView) view.findViewById(R.id.tv_other);
        this.f223141d = (ConstraintLayout) view.findViewById(R.id.cl_other_dashboard);
        this.f223142e = (TextView) view.findViewById(R.id.tv_other_dashboard_title);
        this.f223143f = (TextView) view.findViewById(R.id.tv_other_dashboard_description);
        this.f223144g = (TextView) view.findViewById(R.id.tv_show_more);
        this.f223145h = (TextView) view.findViewById(R.id.tv_other_dashboard_value);
        this.f223146i = view.findViewById(R.id.v_other_dashboard_next);
        this.f223147j = view.findViewById(R.id.v_other_dashboard);
        View viewFindViewById = view.findViewById(R.id.iv_other_dashboard);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f223148k = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.iv_other_dashboard_quality);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f223149l = (SimpleDraweeView) viewFindViewById2;
    }

    public static boolean B80(ProfileOtherDashboardItem profileOtherDashboardItem) {
        if (profileOtherDashboardItem.f223117d != ItemSeverity.f223097d) {
            if (profileOtherDashboardItem.f223116c != ItemSlug.f223108i) {
                return false;
            }
        }
        return true;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f223144g.setOnClickListener(null);
        this.f223141d.setOnClickListener(null);
    }

    @Override // com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.f
    public final void ym(@k ProfileOtherDashboardItem profileOtherDashboardItem, @k l<? super D90.a, G0> lVar) throws Resources.NotFoundException {
        int i12;
        int i13;
        Uri uriB;
        boolean z12 = profileOtherDashboardItem.f223126m;
        int i14 = z12 ? 0 : 8;
        TextView textView = this.f223144g;
        textView.setVisibility(i14);
        int i15 = !z12 ? 0 : 8;
        TextView textView2 = this.f223140c;
        textView2.setVisibility(i15);
        int i16 = !z12 ? 0 : 8;
        ConstraintLayout constraintLayout = this.f223141d;
        constraintLayout.setVisibility(i16);
        if (z12) {
            textView.setOnClickListener(new ViewOnClickListenerC31042l(16, lVar));
            return;
        }
        SimpleDraweeView simpleDraweeView = this.f223148k;
        Context context = simpleDraweeView.getContext();
        textView2.setVisibility(profileOtherDashboardItem.f223125l ? 0 : 8);
        ItemSeverity itemSeverity = ItemSeverity.f223096c;
        ItemSeverity itemSeverity2 = profileOtherDashboardItem.f223117d;
        textView2.setText(itemSeverity2 == itemSeverity ? context.getString(R.string.profile_pro_dashboard_good_performance) : context.getString(R.string.profile_pro_dashboard_what_can_be_improved));
        com.avito.android.util.text.a aVar = this.f223139b;
        TextView textView3 = this.f223142e;
        AttributedText attributedText = profileOtherDashboardItem.f223119f;
        textView3.setText(attributedText != null ? aVar.c(textView3.getContext(), attributedText) : profileOtherDashboardItem.f223118e);
        TextView textView4 = this.f223143f;
        AttributedText attributedText2 = profileOtherDashboardItem.f223121h;
        textView4.setText(attributedText2 != null ? aVar.c(textView4.getContext(), attributedText2) : profileOtherDashboardItem.f223120g);
        TextView textView5 = this.f223145h;
        AttributedText attributedText3 = profileOtherDashboardItem.f223123j;
        textView5.setText(attributedText3 != null ? aVar.c(textView5.getContext(), attributedText3) : profileOtherDashboardItem.f223122i);
        constraintLayout.setOnClickListener(new j(23, lVar, profileOtherDashboardItem));
        textView5.setVisibility(!B80(profileOtherDashboardItem) ? 0 : 8);
        this.f223146i.setVisibility(B80(profileOtherDashboardItem) ? 0 : 8);
        int iOrdinal = itemSeverity2.ordinal();
        if (iOrdinal != 0) {
            i12 = R.drawable.bg_profile_pro_dashboard;
            if (iOrdinal != 1 && iOrdinal != 2) {
                if (iOrdinal == 3) {
                    i12 = R.drawable.bg_profile_pro_dashboard_red_quality;
                } else if (iOrdinal == 4) {
                    i12 = R.drawable.bg_profile_pro_dashboard_green_quality;
                } else {
                    if (iOrdinal != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i12 = R.drawable.bg_profile_pro_dashboard_yellow_quality;
                }
            }
        } else {
            i12 = R.drawable.bg_profile_pro_dashboard_red;
        }
        constraintLayout.setBackground(context.getResources().getDrawable(i12, context.getTheme()));
        int iOrdinal2 = itemSeverity2.ordinal();
        int i17 = R.drawable.bg_profile_pro_small_red;
        if (iOrdinal2 != 0 && iOrdinal2 != 2) {
            i17 = R.drawable.bg_profile_pro_small_green;
        }
        Drawable drawable = context.getResources().getDrawable(i17, context.getTheme());
        View view = this.f223147j;
        view.setBackground(drawable);
        ItemSlug itemSlug = profileOtherDashboardItem.f223116c;
        UniversalImage universalImage = profileOtherDashboardItem.f223129p;
        if (universalImage == null) {
            int iOrdinal3 = itemSlug.ordinal();
            int i18 = R.drawable.ic_ads;
            if (iOrdinal3 != 0) {
                if (iOrdinal3 == 1) {
                    i18 = R.drawable.ic_vas;
                } else if (iOrdinal3 == 2) {
                    i18 = R.drawable.ic_calls;
                } else if (iOrdinal3 == 3) {
                    i18 = R.drawable.ic_chat_read;
                } else if (iOrdinal3 == 4) {
                    i18 = R.drawable.ic_box;
                } else if (iOrdinal3 == 6) {
                    i18 = R.drawable.ic_ruble;
                }
            }
            int i19 = i18;
            ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
            aVarA.f169484b = new ImageRequest.d.a(context.getResources().getDrawable(i19, context.getTheme()), null);
            aVarA.c();
        } else {
            Uri uriB2 = C35829k2.c(UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext())), simpleDraweeView, 0, 30).b();
            if (uriB2 != null) {
                ImageRequest.a aVarA2 = C35949t5.a(simpleDraweeView);
                aVarA2.f(uriB2);
                aVarA2.c();
            }
        }
        simpleDraweeView.setVisibility(!B80(profileOtherDashboardItem) ? 0 : 8);
        view.setVisibility(!B80(profileOtherDashboardItem) ? 0 : 8);
        int i22 = B80(profileOtherDashboardItem) ? 0 : 8;
        SimpleDraweeView simpleDraweeView2 = this.f223149l;
        simpleDraweeView2.setVisibility(i22);
        if (B80(profileOtherDashboardItem)) {
            if (itemSlug == ItemSlug.f223108i) {
                int iOrdinal4 = itemSeverity2.ordinal();
                i13 = R.drawable.ic_red_quality;
                if (iOrdinal4 != 3) {
                    if (iOrdinal4 == 4) {
                        i13 = R.drawable.ic_green_quality;
                    } else if (iOrdinal4 == 5) {
                        i13 = R.drawable.ic_yellow_quality;
                    }
                }
            } else {
                i13 = R.drawable.ic_promote;
            }
            if (universalImage == null) {
                ImageRequest.a aVarA3 = C35949t5.a(simpleDraweeView2);
                aVarA3.f169484b = new ImageRequest.d.a(context.getResources().getDrawable(i13, context.getTheme()), null);
                aVarA3.c();
                return;
            }
            Image imageDependsOnThemeOrDefault = UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext()));
            if (imageDependsOnThemeOrDefault == null || (uriB = C35829k2.c(imageDependsOnThemeOrDefault, simpleDraweeView2, 0, 30).b()) == null) {
                return;
            }
            ImageRequest.a aVarA4 = C35949t5.a(simpleDraweeView2);
            aVarA4.f(uriB);
            aVarA4.c();
        }
    }
}
