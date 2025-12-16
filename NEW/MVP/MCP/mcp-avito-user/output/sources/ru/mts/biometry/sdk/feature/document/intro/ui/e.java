package ru.mts.biometry.sdk.feature.document.intro.ui;

import A91.p;
import B91.A;
import Ba1.AbstractC13130h;
import Ba1.k;
import H91.g;
import L91.q;
import Q91.d;
import Q91.f;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.view.C22984Q;
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
import ru.mts.biometry.sdk.view.SdkBioList;
import ru.mts.biometry.sdk.view.SdkBioToolbar;

@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/mts/biometry/sdk/feature/document/intro/ui/e;", "Lru/mts/biometry/sdk/base/b;", "LB91/A;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class e extends b<A> {

    /* renamed from: i0, reason: collision with root package name */
    public static final /* synthetic */ n[] f436443i0 = {m0.f406844a.i(new h0(e.class, "viewModel", "getViewModel()Lru/mts/biometry/sdk/feature/document/intro/ui/DocumentIntroViewModel;", 0))};

    /* renamed from: h0, reason: collision with root package name */
    public final k f436444h0;

    public e() {
        super((Object) null);
        this.f436444h0 = new k(f.class, d.f13579l);
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final c b5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.sdk_bio_fragment_document_intro, viewGroup, false);
        int i12 = R.id.btn_layout;
        LinearLayout linearLayout = (LinearLayout) g2.d.a(viewInflate, R.id.btn_layout);
        if (linearLayout != null) {
            i12 = R.id.btnPhoto;
            SdkBioButton sdkBioButton = (SdkBioButton) g2.d.a(viewInflate, R.id.btnPhoto);
            if (sdkBioButton != null) {
                i12 = R.id.btn_show_recommends;
                SdkBioButton sdkBioButton2 = (SdkBioButton) g2.d.a(viewInflate, R.id.btn_show_recommends);
                if (sdkBioButton2 != null) {
                    i12 = R.id.iv_document;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) g2.d.a(viewInflate, R.id.iv_document);
                    if (appCompatImageView != null) {
                        i12 = R.id.list_document_tips;
                        SdkBioList sdkBioList = (SdkBioList) g2.d.a(viewInflate, R.id.list_document_tips);
                        if (sdkBioList != null) {
                            i12 = R.id.scroll_layout;
                            NestedScrollView nestedScrollView = (NestedScrollView) g2.d.a(viewInflate, R.id.scroll_layout);
                            if (nestedScrollView != null) {
                                i12 = R.id.toolbar;
                                SdkBioToolbar sdkBioToolbar = (SdkBioToolbar) g2.d.a(viewInflate, R.id.toolbar);
                                if (sdkBioToolbar != null) {
                                    i12 = R.id.tv_footer;
                                    TextView textView = (TextView) g2.d.a(viewInflate, R.id.tv_footer);
                                    if (textView != null) {
                                        i12 = R.id.tv_main_title;
                                        TextView textView2 = (TextView) g2.d.a(viewInflate, R.id.tv_main_title);
                                        if (textView2 != null) {
                                            return new A((ConstraintLayout) viewInflate, linearLayout, sdkBioButton, sdkBioButton2, appCompatImageView, sdkBioList, nestedScrollView, sdkBioToolbar, textView, textView2);
                                        }
                                    }
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
    public final void c5(int i12, int i13) throws Resources.NotFoundException {
        A a12 = (A) this.f436376g0;
        if (a12 != null) {
            g.a(i12, 0, 13, a12.f983h);
            TypedArray typedArrayObtainStyledAttributes = requireContext().obtainStyledAttributes(H91.b.d(R.attr.sdkBioTextAppearanceFooter, requireContext()), new int[]{android.R.attr.layout_marginBottom});
            try {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, H91.c.a(24));
                typedArrayObtainStyledAttributes.recycle();
                View view = a12.f984i;
                if (view.getVisibility() == 0) {
                    i13 += dimensionPixelOffset;
                } else {
                    view = a12.f978c;
                }
                g.a(0, i13, 7, view);
                g.a(i12, 0, 13, a12.f982g);
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final void d5(c cVar) {
        A a12 = (A) cVar;
        a12.f983h.setOnCloseListener(new q(2));
        Ca1.d.a(new q(3), a12.f978c);
        Ca1.d.a(new p(this, 10), a12.f979d);
        TextView textView = a12.f984i;
        boolean z12 = textView.getText().length() > 0;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setVisibility(z12 ? 0 : 8);
        LinearLayout linearLayout = a12.f977b;
        if (z12) {
            AbstractC13130h.b(linearLayout, H91.c.a(20), H91.c.a(20), H91.c.a(20), H91.c.a(10));
        } else {
            AbstractC13130h.a(linearLayout);
        }
    }

    @Override // ru.mts.biometry.sdk.base.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        H91.e.a(this, !H91.f.b(this));
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new Q91.c(this, null), 3);
    }
}
