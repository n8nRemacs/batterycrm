package ru.mts.biometry.sdk.base;

import A91.i;
import A91.j;
import A91.k;
import A91.l;
import A91.m;
import A91.n;
import B91.D;
import H91.g;
import W91.h;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.avito.android.R;
import g2.c;
import g2.d;
import java.util.List;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.mts.biometry.sdk.view.SdkBioButton;
import ru.mts.biometry.sdk.view.SdkBioList;
import ru.mts.biometry.sdk.view.SdkBioToolbar;
import z91.e;

@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lru/mts/biometry/sdk/base/p;", "Lru/mts/biometry/sdk/base/b;", "LB91/D;", "<init>", "()V", "ru/mts/biometry/sdk/base/g", "ru/mts/biometry/sdk/base/h", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public class p extends b<D> {

    /* renamed from: h0, reason: collision with root package name */
    public final InterfaceC42726C f436380h0;

    /* renamed from: i0, reason: collision with root package name */
    public final InterfaceC42726C f436381i0;

    /* renamed from: j0, reason: collision with root package name */
    public final InterfaceC42726C f436382j0;

    /* renamed from: k0, reason: collision with root package name */
    public final InterfaceC42726C f436383k0;

    /* renamed from: l0, reason: collision with root package name */
    public final InterfaceC42726C f436384l0;

    /* renamed from: m0, reason: collision with root package name */
    public final InterfaceC42726C f436385m0;

    /* renamed from: n0, reason: collision with root package name */
    public final InterfaceC42726C f436386n0;

    /* renamed from: o0, reason: collision with root package name */
    public h f436387o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f436388p0;

    public p() {
        super(0);
        this.f436380h0 = C42727D.c(new A91.h(this));
        this.f436381i0 = C42727D.c(new m(this));
        this.f436382j0 = C42727D.c(new n(this));
        this.f436383k0 = C42727D.c(new i(this));
        this.f436384l0 = C42727D.c(new j(this));
        this.f436385m0 = C42727D.c(new l(this));
        this.f436386n0 = C42727D.c(new k(this));
    }

    public void b() {
        h hVar = this.f436387o0;
        if (hVar == null) {
            hVar = null;
        }
        hVar.a();
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final c b5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.sdk_bio_fragment_info, (ViewGroup) null, false);
        int i12 = R.id.btn_layout;
        LinearLayout linearLayout = (LinearLayout) d.a(viewInflate, R.id.btn_layout);
        if (linearLayout != null) {
            i12 = R.id.btn_retry;
            SdkBioButton sdkBioButton = (SdkBioButton) d.a(viewInflate, R.id.btn_retry);
            if (sdkBioButton != null) {
                i12 = R.id.btn_retry_secondary;
                SdkBioButton sdkBioButton2 = (SdkBioButton) d.a(viewInflate, R.id.btn_retry_secondary);
                if (sdkBioButton2 != null) {
                    i12 = R.id.content_container;
                    LinearLayout linearLayout2 = (LinearLayout) d.a(viewInflate, R.id.content_container);
                    if (linearLayout2 != null) {
                        i12 = R.id.iv_icon;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) d.a(viewInflate, R.id.iv_icon);
                        if (appCompatImageView != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            i12 = R.id.sbl_items;
                            SdkBioList sdkBioList = (SdkBioList) d.a(viewInflate, R.id.sbl_items);
                            if (sdkBioList != null) {
                                i12 = R.id.scroll_container;
                                NestedScrollView nestedScrollView = (NestedScrollView) d.a(viewInflate, R.id.scroll_container);
                                if (nestedScrollView != null) {
                                    i12 = R.id.toolbar;
                                    SdkBioToolbar sdkBioToolbar = (SdkBioToolbar) d.a(viewInflate, R.id.toolbar);
                                    if (sdkBioToolbar != null) {
                                        i12 = R.id.tv_description;
                                        AppCompatTextView appCompatTextView = (AppCompatTextView) d.a(viewInflate, R.id.tv_description);
                                        if (appCompatTextView != null) {
                                            i12 = R.id.tv_error_title;
                                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) d.a(viewInflate, R.id.tv_error_title);
                                            if (appCompatTextView2 != null) {
                                                return new D(constraintLayout, linearLayout, sdkBioButton, sdkBioButton2, linearLayout2, appCompatImageView, constraintLayout, sdkBioList, nestedScrollView, sdkBioToolbar, appCompatTextView, appCompatTextView2);
                                            }
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
    public final void c5(int i12, int i13) {
        D d12;
        List listE5;
        D d13 = (D) this.f436376g0;
        if (d13 != null) {
            g.a(i12, 0, 13, d13.f1020j);
        }
        if ((this.f436388p0 == 1 || ((listE5 = e5()) != null && (!listE5.isEmpty()))) && (d12 = (D) this.f436376g0) != null) {
            LinearLayout linearLayout = d12.f1015e;
            View view = d12.f1013c;
            linearLayout.removeView(view);
            ConstraintLayout constraintLayout = d12.f1017g;
            constraintLayout.removeView(view);
            int dimension = (int) getResources().getDimension(R.dimen.sdk_bio_info_screen_button_horizontal_margin);
            int dimension2 = (int) getResources().getDimension(R.dimen.sdk_bio_info_screen_button_bottom_margin);
            ConstraintLayout.b bVar = new ConstraintLayout.b(-1, -2);
            bVar.setMargins(dimension, 0, dimension, i13 + dimension2);
            view.setLayoutParams(bVar);
            Context contextRequireContext = requireContext();
            TypedValue typedValue = new TypedValue();
            contextRequireContext.getTheme().resolveAttribute(R.attr.sdkBioBottomInfoScreenButtonWithUnderlay, typedValue, true);
            boolean z12 = typedValue.data != 0;
            List listE52 = e5();
            NestedScrollView nestedScrollView = d12.f1019i;
            LinearLayout linearLayout2 = d12.f1012b;
            if (listE52 == null || listE52.isEmpty() || !z12) {
                g.b(linearLayout2);
                constraintLayout.addView(view);
                androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
                dVar.g(constraintLayout);
                dVar.i(view.getId(), 6, 0, 6);
                dVar.i(view.getId(), 7, 0, 7);
                dVar.i(view.getId(), 4, 0, 4);
                dVar.i(nestedScrollView.getId(), 4, view.getId(), 3);
                dVar.c(constraintLayout);
                return;
            }
            g.c(linearLayout2);
            linearLayout2.removeView(view);
            linearLayout2.addView(view);
            androidx.constraintlayout.widget.d dVar2 = new androidx.constraintlayout.widget.d();
            dVar2.g(constraintLayout);
            dVar2.i(linearLayout2.getId(), 6, 0, 6);
            dVar2.i(linearLayout2.getId(), 7, 0, 7);
            dVar2.i(linearLayout2.getId(), 4, 0, 4);
            dVar2.i(nestedScrollView.getId(), 4, linearLayout2.getId(), 3);
            dVar2.c(constraintLayout);
        }
    }

    public List e5() {
        return (List) this.f436384l0.getValue();
    }

    @Override // ru.mts.biometry.sdk.base.b
    /* renamed from: f5, reason: merged with bridge method [inline-methods] */
    public void d5(final D d12) {
        String str;
        AppCompatTextView appCompatTextView = d12.f1021k;
        InterfaceC42726C interfaceC42726C = this.f436383k0;
        int i12 = 8;
        appCompatTextView.setVisibility(((String) interfaceC42726C.getValue()) != null ? 0 : 8);
        appCompatTextView.setText((String) interfaceC42726C.getValue());
        final SdkBioButton sdkBioButton = d12.f1013c;
        final int i13 = 0;
        Ca1.d.a(new View.OnClickListener(this) { // from class: A91.o

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ru.mts.biometry.sdk.base.p f154c;

            {
                this.f154c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                switch (i13) {
                    case 0:
                        this.f154c.b();
                        sdkBioButton.enableLoader();
                        d12.f1014d.setEnabled(false);
                        break;
                    default:
                        this.f154c.c();
                        sdkBioButton.enableLoader();
                        d12.f1013c.setEnabled(false);
                        break;
                }
            }
        }, sdkBioButton);
        sdkBioButton.setVisibility(((Boolean) this.f436385m0.getValue()).booleanValue() ? 0 : 8);
        final SdkBioButton sdkBioButton2 = d12.f1014d;
        final int i14 = 1;
        Ca1.d.a(new View.OnClickListener(this) { // from class: A91.o

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ru.mts.biometry.sdk.base.p f154c;

            {
                this.f154c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                switch (i14) {
                    case 0:
                        this.f154c.b();
                        sdkBioButton2.enableLoader();
                        d12.f1014d.setEnabled(false);
                        break;
                    default:
                        this.f154c.c();
                        sdkBioButton2.enableLoader();
                        d12.f1013c.setEnabled(false);
                        break;
                }
            }
        }, sdkBioButton2);
        sdkBioButton2.setEnabled(true);
        sdkBioButton2.disableLoader();
        InterfaceC42726C interfaceC42726C2 = this.f436381i0;
        String str2 = (String) interfaceC42726C2.getValue();
        sdkBioButton2.setVisibility((str2 == null || str2.length() == 0) ? 8 : 0);
        String str3 = (String) this.f436380h0.getValue();
        if (str3 != null) {
            sdkBioButton.setText(str3);
        }
        String str4 = (String) interfaceC42726C2.getValue();
        if (str4 != null) {
            sdkBioButton2.setText(str4);
        }
        String str5 = (String) this.f436382j0.getValue();
        AppCompatTextView appCompatTextView2 = d12.f1022l;
        appCompatTextView2.setText(str5);
        SdkBioList sdkBioList = d12.f1018h;
        if (e5() != null && (!r6.isEmpty())) {
            i12 = 0;
        }
        sdkBioList.setVisibility(i12);
        List listE5 = e5();
        if ((listE5 == null || listE5.isEmpty()) && ((str = (String) interfaceC42726C.getValue()) == null || str.length() == 0)) {
            appCompatTextView2.setGravity(17);
        }
        List<String> listE52 = e5();
        if (listE52 != null) {
            sdkBioList.setItems(listE52);
        }
        d12.f1016f.setImageDrawable((Drawable) this.f436386n0.getValue());
        d12.f1020j.setOnCloseListener(new A91.p(this, 0));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) throws Resources.NotFoundException {
        super.onAttach(context);
        requireContext();
        z91.s sVar = e.f443908b;
        if (sVar == null) {
            throw new IllegalArgumentException("DI delegate is null");
        }
        this.f436387o0 = sVar.b();
        TypedArray typedArrayObtainStyledAttributes = requireContext().obtainStyledAttributes(H91.b.d(R.attr.sdkBioNotificationScreenStyle, requireContext()), new int[]{R.attr.sdkBioNotificationScreenButtonPosition});
        try {
            this.f436388p0 = typedArrayObtainStyledAttributes.getInt(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        SdkBioButton sdkBioButton;
        SdkBioButton sdkBioButton2;
        super.onResume();
        D d12 = (D) this.f436376g0;
        if (d12 != null && (sdkBioButton2 = d12.f1013c) != null) {
            sdkBioButton2.setEnabled(true);
            sdkBioButton2.disableLoader();
        }
        D d13 = (D) this.f436376g0;
        if (d13 == null || (sdkBioButton = d13.f1014d) == null) {
            return;
        }
        sdkBioButton.setEnabled(true);
        sdkBioButton.disableLoader();
    }

    @Override // ru.mts.biometry.sdk.base.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        H91.e.a(this, !H91.f.b(this));
    }

    public void c() {
    }
}
