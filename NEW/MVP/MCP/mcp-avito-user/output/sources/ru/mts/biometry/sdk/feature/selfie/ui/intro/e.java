package ru.mts.biometry.sdk.feature.selfie.ui.intro;

import B91.C13110c;
import Ba1.AbstractC13130h;
import Ba1.k;
import H91.f;
import L91.q;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.view.C22981N;
import com.avito.android.R;
import g2.c;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import ru.mts.biometry.sdk.base.b;
import ru.mts.biometry.sdk.view.SdkBioButton;
import ru.mts.biometry.sdk.view.SdkBioToolbar;
import sG0.ViewOnClickListenerC48048b;
import ua1.d;
import ua1.g;

@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/mts/biometry/sdk/feature/selfie/ui/intro/e;", "Lru/mts/biometry/sdk/base/b;", "LB91/c;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class e extends b<C13110c> {

    /* renamed from: i0, reason: collision with root package name */
    public static final /* synthetic */ n[] f436525i0 = {m0.f406844a.i(new h0(e.class, "viewModel", "getViewModel()Lru/mts/biometry/sdk/feature/selfie/ui/intro/SelfieIntroViewModel;", 0))};

    /* renamed from: h0, reason: collision with root package name */
    public final k f436526h0;

    public e() {
        super((Object) null);
        this.f436526h0 = new k(g.class, d.f440101l);
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final c b5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.sdk_bio_fragment_selfie_intro, (ViewGroup) null, false);
        int i12 = R.id.btn_layout;
        LinearLayout linearLayout = (LinearLayout) g2.d.a(viewInflate, R.id.btn_layout);
        if (linearLayout != null) {
            i12 = R.id.btnPhoto;
            SdkBioButton sdkBioButton = (SdkBioButton) g2.d.a(viewInflate, R.id.btnPhoto);
            if (sdkBioButton != null) {
                i12 = R.id.btn_show_recommends;
                SdkBioButton sdkBioButton2 = (SdkBioButton) g2.d.a(viewInflate, R.id.btn_show_recommends);
                if (sdkBioButton2 != null) {
                    i12 = R.id.iv_face;
                    if (((AppCompatImageView) g2.d.a(viewInflate, R.id.iv_face)) != null) {
                        i12 = R.id.scroll_layout;
                        NestedScrollView nestedScrollView = (NestedScrollView) g2.d.a(viewInflate, R.id.scroll_layout);
                        if (nestedScrollView != null) {
                            i12 = R.id.toolbar;
                            SdkBioToolbar sdkBioToolbar = (SdkBioToolbar) g2.d.a(viewInflate, R.id.toolbar);
                            if (sdkBioToolbar != null) {
                                i12 = R.id.tv_main_title;
                                if (((TextView) g2.d.a(viewInflate, R.id.tv_main_title)) != null) {
                                    return new C13110c((ConstraintLayout) viewInflate, linearLayout, sdkBioButton, sdkBioButton2, nestedScrollView, sdkBioToolbar);
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
        C13110c c13110c = (C13110c) this.f436376g0;
        if (c13110c != null) {
            H91.g.a(i12, 0, 13, c13110c.f1096f);
            H91.g.a(i12, 0, 13, c13110c.f1095e);
            H91.g.a(0, i13, 7, c13110c.f1093c);
        }
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final void d5(c cVar) {
        C13110c c13110c = (C13110c) cVar;
        c13110c.f1093c.setOnClickListener(new q(17));
        c13110c.f1094d.setOnClickListener(new ViewOnClickListenerC48048b(this, 1));
        AbstractC13130h.a(c13110c.f1092b);
        c13110c.f1096f.setOnCloseListener(new q(18));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        C43259k.d(C22981N.a(getLifecycle()), null, null, new ua1.c(this, null), 3);
    }

    @Override // ru.mts.biometry.sdk.base.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        H91.e.a(this, !f.b(this));
    }
}
