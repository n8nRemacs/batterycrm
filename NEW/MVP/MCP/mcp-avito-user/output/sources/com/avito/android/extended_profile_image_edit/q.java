package com.avito.android.extended_profile_image_edit;

import android.animation.ValueAnimator;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.Group;
import androidx.view.C22981N;
import androidx.view.InterfaceC22983P;
import com.avito.android.R;
import com.avito.android.krop.KropView;
import com.avito.android.krop.RectOverlay;
import com.avito.android.lib.deprecated_design.ProgressView;
import com.avito.android.lib.deprecated_design.badge_bar.BadgeView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.P5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import vA.InterfaceC49183a;

/* compiled from: BannerImageEditView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_image_edit/q;", "Lcom/avito/android/extended_profile_image_edit/g;", "_avito_extended-profile-image-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class q implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f151110a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e f151111b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final BannerImageEditFragment f151112c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ExtendedProfileImageEditConfig f151113d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f151114e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final KropView f151115f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final View f151116g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final View f151117h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final View f151118i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final BadgeView f151119j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final ImageView f151120k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Button f151121l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Toolbar f151122m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final Group f151123n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final ProgressView f151124o;

    /* renamed from: p, reason: collision with root package name */
    public final int f151125p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final ValueAnimator f151126q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public com.facebook.datasource.c f151127r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f151128s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.bottom_sheet.d f151129t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public Uri f151130u;

    public q(@Y61.k View view, @Y61.k e eVar, @Y61.k BannerImageEditFragment bannerImageEditFragment, @Y61.k InterfaceC22983P interfaceC22983P, @Y61.k ExtendedProfileImageEditConfig extendedProfileImageEditConfig) {
        this.f151110a = view;
        this.f151111b = eVar;
        this.f151112c = bannerImageEditFragment;
        this.f151113d = extendedProfileImageEditConfig;
        this.f151114e = view.getContext();
        View viewFindViewById = view.findViewById(R.id.ext_profile_banner_edit_image_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.krop.KropView");
        }
        KropView kropView = (KropView) viewFindViewById;
        this.f151115f = kropView;
        View viewFindViewById2 = view.findViewById(R.id.ext_profile_banner_edit_krop_overlay);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.krop.RectOverlay");
        }
        RectOverlay rectOverlay = (RectOverlay) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.ext_profile_banner_image_overlay_frame);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f151116g = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.ext_profile_banner_image_top_overlay);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f151117h = viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.ext_profile_banner_image_bottom_overlay);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f151118i = viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.ext_profile_banner_edit_badge);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.deprecated_design.badge_bar.BadgeView");
        }
        BadgeView badgeView = (BadgeView) viewFindViewById6;
        this.f151119j = badgeView;
        View viewFindViewById7 = view.findViewById(R.id.ext_profile_banner_edit_warning_icon);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById7;
        this.f151120k = imageView;
        View viewFindViewById8 = view.findViewById(R.id.ext_profile_banner_edit_save_button);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById8;
        this.f151121l = button;
        View viewFindViewById9 = view.findViewById(R.id.ext_profile_banner_edit_cancel_button);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button2 = (Button) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.ext_profile_banner_edit_toolbar);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById10;
        this.f151122m = toolbar;
        View viewFindViewById11 = view.findViewById(R.id.ext_profile_banner_edit_image_group);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.Group");
        }
        this.f151123n = (Group) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.ext_profile_banner_edit_progress);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.deprecated_design.ProgressView");
        }
        this.f151124o = (ProgressView) viewFindViewById12;
        this.f151125p = R.attr.whiteAlpha80;
        int iD2 = C35835l0.d(R.attr.whiteAlpha80, view.getContext());
        int iD3 = C35835l0.d(R.attr.white, view.getContext());
        P5.d(toolbar);
        int i12 = extendedProfileImageEditConfig.f150988c;
        int i13 = extendedProfileImageEditConfig.f150989d;
        kropView.b(i12, i13);
        if (extendedProfileImageEditConfig.f150990e) {
            badgeView.setText(i12 + " × " + i13);
        } else {
            D6.w(badgeView);
        }
        D6.E(rectOverlay, i12, i13);
        String str = extendedProfileImageEditConfig.f150993h;
        if (str != null) {
            com.avito.android.lib.design.button.b.a(button, str, false);
        }
        String str2 = extendedProfileImageEditConfig.f150994i;
        if (str2 != null) {
            com.avito.android.lib.design.button.b.a(button2, str2, false);
        }
        final int i14 = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.extended_profile_image_edit.j

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ q f151016c;

            {
                this.f151016c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        q qVar = this.f151016c;
                        qVar.f151111b.accept(new InterfaceC49183a.b(new n(qVar)));
                        break;
                    case 1:
                        this.f151016c.f151112c.E0();
                        break;
                    case 2:
                        this.f151016c.f151111b.accept(InterfaceC49183a.C12745a.f440489a);
                        break;
                    case 3:
                        this.f151016c.f151111b.accept(InterfaceC49183a.C12745a.f440489a);
                        break;
                    default:
                        this.f151016c.f151112c.E0();
                        break;
                }
            }
        });
        final int i15 = 1;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.extended_profile_image_edit.j

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ q f151016c;

            {
                this.f151016c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        q qVar = this.f151016c;
                        qVar.f151111b.accept(new InterfaceC49183a.b(new n(qVar)));
                        break;
                    case 1:
                        this.f151016c.f151112c.E0();
                        break;
                    case 2:
                        this.f151016c.f151111b.accept(InterfaceC49183a.C12745a.f440489a);
                        break;
                    case 3:
                        this.f151016c.f151111b.accept(InterfaceC49183a.C12745a.f440489a);
                        break;
                    default:
                        this.f151016c.f151112c.E0();
                        break;
                }
            }
        });
        final int i16 = 2;
        badgeView.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.extended_profile_image_edit.j

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ q f151016c;

            {
                this.f151016c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        q qVar = this.f151016c;
                        qVar.f151111b.accept(new InterfaceC49183a.b(new n(qVar)));
                        break;
                    case 1:
                        this.f151016c.f151112c.E0();
                        break;
                    case 2:
                        this.f151016c.f151111b.accept(InterfaceC49183a.C12745a.f440489a);
                        break;
                    case 3:
                        this.f151016c.f151111b.accept(InterfaceC49183a.C12745a.f440489a);
                        break;
                    default:
                        this.f151016c.f151112c.E0();
                        break;
                }
            }
        });
        final int i17 = 3;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.extended_profile_image_edit.j

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ q f151016c;

            {
                this.f151016c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        q qVar = this.f151016c;
                        qVar.f151111b.accept(new InterfaceC49183a.b(new n(qVar)));
                        break;
                    case 1:
                        this.f151016c.f151112c.E0();
                        break;
                    case 2:
                        this.f151016c.f151111b.accept(InterfaceC49183a.C12745a.f440489a);
                        break;
                    case 3:
                        this.f151016c.f151111b.accept(InterfaceC49183a.C12745a.f440489a);
                        break;
                    default:
                        this.f151016c.f151112c.E0();
                        break;
                }
            }
        });
        final int i18 = 4;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.extended_profile_image_edit.j

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ q f151016c;

            {
                this.f151016c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i18) {
                    case 0:
                        q qVar = this.f151016c;
                        qVar.f151111b.accept(new InterfaceC49183a.b(new n(qVar)));
                        break;
                    case 1:
                        this.f151016c.f151112c.E0();
                        break;
                    case 2:
                        this.f151016c.f151111b.accept(InterfaceC49183a.C12745a.f440489a);
                        break;
                    case 3:
                        this.f151016c.f151111b.accept(InterfaceC49183a.C12745a.f440489a);
                        break;
                    default:
                        this.f151016c.f151112c.E0();
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(iD2, iD3);
        valueAnimatorOfArgb.setDuration(200L);
        valueAnimatorOfArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.avito.android.extended_profile_image_edit.i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                q qVar = this.f151014a;
                qVar.f151128s = false;
                qVar.f151122m.setBackgroundColor(iIntValue);
                qVar.f151117h.setBackgroundColor(iIntValue);
                qVar.f151118i.setBackgroundColor(iIntValue);
            }
        });
        this.f151126q = valueAnimatorOfArgb;
        C43259k.d(C22981N.a(interfaceC22983P.getLifecycle()), null, null, new k(interfaceC22983P, this, null), 3);
    }
}
