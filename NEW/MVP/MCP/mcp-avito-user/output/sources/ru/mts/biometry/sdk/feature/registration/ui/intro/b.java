package ru.mts.biometry.sdk.feature.registration.ui.intro;

import A91.r;
import B91.M;
import Ba1.AbstractC13130h;
import H91.e;
import H91.f;
import H91.g;
import W91.h;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.avito.android.R;
import com.avito.android.str_seller_orders.orders_seller.a;
import g2.c;
import g2.d;
import i.b;
import kotlin.C42727D;
import kotlin.Metadata;
import qa1.C47366a;
import ru.mts.biometry.sdk.view.SdkBioButton;
import ru.mts.biometry.sdk.view.SdkBioToolbar;
import z91.s;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/mts/biometry/sdk/feature/registration/ui/intro/b;", "Lru/mts/biometry/sdk/base/b;", "LB91/M;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class b extends ru.mts.biometry.sdk.base.b<M> {

    /* renamed from: h0, reason: collision with root package name */
    public h f436520h0;

    public b() {
        super((Object) null);
        C42727D.c(new C47366a(this));
        registerForActivityResult(new b.c(), new a(this, 10));
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final c b5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.sdk_bio_fragment_registration_intro, viewGroup, false);
        int i12 = R.id.btn_layout;
        LinearLayout linearLayout = (LinearLayout) d.a(viewInflate, R.id.btn_layout);
        if (linearLayout != null) {
            i12 = R.id.btnPhoto;
            SdkBioButton sdkBioButton = (SdkBioButton) d.a(viewInflate, R.id.btnPhoto);
            if (sdkBioButton != null) {
                i12 = R.id.btn_show_recommends;
                SdkBioButton sdkBioButton2 = (SdkBioButton) d.a(viewInflate, R.id.btn_show_recommends);
                if (sdkBioButton2 != null) {
                    i12 = R.id.iv_passport;
                    if (((AppCompatImageView) d.a(viewInflate, R.id.iv_passport)) != null) {
                        i12 = R.id.scroll_layout;
                        NestedScrollView nestedScrollView = (NestedScrollView) d.a(viewInflate, R.id.scroll_layout);
                        if (nestedScrollView != null) {
                            i12 = R.id.toolbar;
                            SdkBioToolbar sdkBioToolbar = (SdkBioToolbar) d.a(viewInflate, R.id.toolbar);
                            if (sdkBioToolbar != null) {
                                i12 = R.id.tv_main_title;
                                if (((TextView) d.a(viewInflate, R.id.tv_main_title)) != null) {
                                    return new M((ConstraintLayout) viewInflate, linearLayout, sdkBioButton, sdkBioButton2, nestedScrollView, sdkBioToolbar);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final void c5(int i12, int i13) {
        M m12 = (M) this.f436376g0;
        if (m12 != null) {
            g.a(i12, 0, 13, m12.f1086f);
            g.a(0, i13, 7, m12.f1083c);
            g.a(i12, 0, 13, m12.f1085e);
        }
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final void d5(c cVar) {
        M m12 = (M) cVar;
        e.a(this, !f.b(this));
        final int i12 = 2;
        m12.f1086f.setOnCloseListener(new View.OnClickListener(this) { // from class: qa1.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ru.mts.biometry.sdk.feature.registration.ui.intro.b f429301c;

            {
                this.f429301c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        h hVar = this.f429301c.f436520h0;
                        if (hVar == null) {
                            hVar = null;
                        }
                        Aa1.b.b(hVar);
                        break;
                    case 1:
                        ru.mts.biometry.sdk.feature.registration.ui.intro.b bVar = this.f429301c;
                        A91.b.a(r.a(bVar.getResources().getStringArray(R.array.sdk_bio_registration_intro_list_full)), bVar.getResources().getString(R.string.sdk_bio_registration_recommendation_dialog_title)).show(bVar.getParentFragmentManager(), "BottomSheetContainer");
                        break;
                    default:
                        h hVar2 = this.f429301c.f436520h0;
                        if (hVar2 == null) {
                            hVar2 = null;
                        }
                        hVar2.d(true);
                        break;
                }
            }
        });
        final int i13 = 0;
        Ca1.d.a(new View.OnClickListener(this) { // from class: qa1.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ru.mts.biometry.sdk.feature.registration.ui.intro.b f429301c;

            {
                this.f429301c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        h hVar = this.f429301c.f436520h0;
                        if (hVar == null) {
                            hVar = null;
                        }
                        Aa1.b.b(hVar);
                        break;
                    case 1:
                        ru.mts.biometry.sdk.feature.registration.ui.intro.b bVar = this.f429301c;
                        A91.b.a(r.a(bVar.getResources().getStringArray(R.array.sdk_bio_registration_intro_list_full)), bVar.getResources().getString(R.string.sdk_bio_registration_recommendation_dialog_title)).show(bVar.getParentFragmentManager(), "BottomSheetContainer");
                        break;
                    default:
                        h hVar2 = this.f429301c.f436520h0;
                        if (hVar2 == null) {
                            hVar2 = null;
                        }
                        hVar2.d(true);
                        break;
                }
            }
        }, m12.f1083c);
        final int i14 = 1;
        Ca1.d.a(new View.OnClickListener(this) { // from class: qa1.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ru.mts.biometry.sdk.feature.registration.ui.intro.b f429301c;

            {
                this.f429301c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        h hVar = this.f429301c.f436520h0;
                        if (hVar == null) {
                            hVar = null;
                        }
                        Aa1.b.b(hVar);
                        break;
                    case 1:
                        ru.mts.biometry.sdk.feature.registration.ui.intro.b bVar = this.f429301c;
                        A91.b.a(r.a(bVar.getResources().getStringArray(R.array.sdk_bio_registration_intro_list_full)), bVar.getResources().getString(R.string.sdk_bio_registration_recommendation_dialog_title)).show(bVar.getParentFragmentManager(), "BottomSheetContainer");
                        break;
                    default:
                        h hVar2 = this.f429301c.f436520h0;
                        if (hVar2 == null) {
                            hVar2 = null;
                        }
                        hVar2.d(true);
                        break;
                }
            }
        }, m12.f1084d);
        AbstractC13130h.a(m12.f1082b);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        requireContext();
        s sVar = z91.e.f443908b;
        if (sVar == null) {
            throw new IllegalArgumentException("DI delegate is null");
        }
        this.f436520h0 = sVar.b();
    }
}
