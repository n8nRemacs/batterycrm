package ru.mts.biometry.sdk.view.modalcard;

import B91.E;
import Da1.c;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.view.C23038g0;
import androidx.view.P0;
import com.avito.android.R;
import g2.d;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import ru.mts.biometry.sdk.view.SdkBioButton;
import ru.mts.biometry.sdk.view.modalcard.enums.a;

@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/mts/biometry/sdk/view/modalcard/f;", "Lru/mts/biometry/sdk/view/modalcard/b;", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public class f extends b {

    /* renamed from: n0, reason: collision with root package name */
    public final a f436607n0;

    /* renamed from: o0, reason: collision with root package name */
    public final Drawable f436608o0;

    /* renamed from: p0, reason: collision with root package name */
    public final String f436609p0;

    /* renamed from: q0, reason: collision with root package name */
    public final String f436610q0;

    /* renamed from: r0, reason: collision with root package name */
    public final String f436611r0;

    /* renamed from: s0, reason: collision with root package name */
    public final String f436612s0;

    /* renamed from: t0, reason: collision with root package name */
    public final String f436613t0;

    /* renamed from: u0, reason: collision with root package name */
    public final View.OnClickListener f436614u0;

    /* renamed from: v0, reason: collision with root package name */
    public final View.OnClickListener f436615v0;

    /* renamed from: w0, reason: collision with root package name */
    public final N f436616w0;

    /* renamed from: x0, reason: collision with root package name */
    public E f436617x0;

    /* renamed from: y0, reason: collision with root package name */
    public Ea1.b f436618y0;

    /* renamed from: z0, reason: collision with root package name */
    public final C23038g0 f436619z0;

    public f() {
        this(0);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Ea1.b bVar = this.f436618y0;
        if (bVar == null) {
            bVar = null;
        }
        if (bVar.f4080E == null) {
            this.f436616w0.invoke();
        } else {
            Y41.a aVar = (Y41.a) this.f436603m0.getValue();
            if (aVar != null) {
                aVar.invoke();
            }
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.sdk_bio_fragment_mts_modal_card_simple, viewGroup, false);
        int i12 = R.id.mtsModalCardCancelButton;
        SdkBioButton sdkBioButton = (SdkBioButton) d.a(viewInflate, R.id.mtsModalCardCancelButton);
        if (sdkBioButton != null) {
            i12 = R.id.mtsModalCardDrawable;
            AppCompatImageView appCompatImageView = (AppCompatImageView) d.a(viewInflate, R.id.mtsModalCardDrawable);
            if (appCompatImageView != null) {
                i12 = R.id.mtsModalCardPrimaryButton;
                SdkBioButton sdkBioButton2 = (SdkBioButton) d.a(viewInflate, R.id.mtsModalCardPrimaryButton);
                if (sdkBioButton2 != null) {
                    i12 = R.id.mtsModalCardSecondaryButton;
                    SdkBioButton sdkBioButton3 = (SdkBioButton) d.a(viewInflate, R.id.mtsModalCardSecondaryButton);
                    if (sdkBioButton3 != null) {
                        i12 = R.id.mtsModalCardText;
                        TextView textView = (TextView) d.a(viewInflate, R.id.mtsModalCardText);
                        if (textView != null) {
                            i12 = R.id.mtsModalCardTitle;
                            TextView textView2 = (TextView) d.a(viewInflate, R.id.mtsModalCardTitle);
                            if (textView2 != null) {
                                i12 = R.id.mtsRootLayout;
                                LinearLayout linearLayout = (LinearLayout) d.a(viewInflate, R.id.mtsRootLayout);
                                if (linearLayout != null) {
                                    FrameLayout frameLayout = (FrameLayout) viewInflate;
                                    this.f436617x0 = new E(frameLayout, sdkBioButton, appCompatImageView, sdkBioButton2, sdkBioButton3, textView, textView2, linearLayout);
                                    this.f436596f0 = sdkBioButton2;
                                    this.f436597g0 = sdkBioButton;
                                    this.f436598h0 = textView2;
                                    this.f436599i0 = textView;
                                    this.f436600j0 = linearLayout;
                                    return frameLayout;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        Ea1.b bVar = this.f436618y0;
        if ((bVar == null ? null : bVar).f4080E == null) {
            if (bVar == null) {
                bVar = null;
            }
            bVar.f4080E = this.f436609p0;
            bVar.f4081J = this.f436610q0;
            bVar.f4082K = this.f436611r0;
            bVar.f4084M = this.f436612s0;
            bVar.f4083L = this.f436613t0;
            bVar.f4085N = this.f436607n0;
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // ru.mts.biometry.sdk.view.modalcard.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewTreeObserver viewTreeObserver;
        super.onViewCreated(view, bundle);
        Ea1.b bVar = (Ea1.b) new P0(this, new P0.d()).a(Ea1.b.class);
        this.f436618y0 = bVar;
        E e12 = this.f436617x0;
        if (e12 == null) {
            e12 = null;
        }
        a aVar = bVar.f4085N;
        if (aVar == null) {
            aVar = this.f436607n0;
        }
        if (aVar != null) {
            Context context = getContext();
            Drawable drawableC = context != null ? H91.b.c(aVar.f436606b, context) : null;
            E e13 = this.f436617x0;
            if (e13 == null) {
                e13 = null;
            }
            AppCompatImageView appCompatImageView = e13.f1025c;
            appCompatImageView.setImageDrawable(drawableC);
            appCompatImageView.setVisibility(drawableC != null ? 0 : 8);
        }
        Drawable drawable = this.f436608o0;
        if (drawable != null) {
            E e14 = this.f436617x0;
            if (e14 == null) {
                e14 = null;
            }
            AppCompatImageView appCompatImageView2 = e14.f1025c;
            appCompatImageView2.setImageDrawable(drawable);
            appCompatImageView2.setVisibility(0);
        }
        LinearLayout linearLayout = this.f436600j0;
        if (linearLayout != null && (viewTreeObserver = linearLayout.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new c());
        }
        Ea1.b bVar2 = this.f436618y0;
        if (bVar2 == null) {
            bVar2 = null;
        }
        TextView textView = this.f436598h0;
        if (textView != null) {
            String str = bVar2.f4080E;
            if (str == null) {
                str = this.f436609p0;
            }
            textView.setText(str);
        }
        TextView textView2 = this.f436598h0;
        if (textView2 != null) {
            CharSequence text = textView2.getText();
            textView2.setVisibility((text == null || text.length() == 0) ? 8 : 0);
        }
        Ea1.b bVar3 = this.f436618y0;
        if (bVar3 == null) {
            bVar3 = null;
        }
        TextView textView3 = this.f436599i0;
        if (textView3 != null) {
            String str2 = bVar3.f4081J;
            if (str2 == null) {
                str2 = this.f436610q0;
            }
            textView3.setText(str2);
        }
        TextView textView4 = this.f436599i0;
        if (textView4 != null) {
            CharSequence text2 = textView4.getText();
            textView4.setVisibility((text2 == null || text2.length() == 0) ? 8 : 0);
        }
        Ea1.b bVar4 = this.f436618y0;
        if (bVar4 == null) {
            bVar4 = null;
        }
        SdkBioButton sdkBioButton = this.f436596f0;
        if (sdkBioButton != null) {
            String str3 = bVar4.f4082K;
            if (str3 == null) {
                str3 = this.f436611r0;
            }
            sdkBioButton.setText(str3);
        }
        SdkBioButton sdkBioButton2 = this.f436596f0;
        if (sdkBioButton2 != null) {
            String text3 = sdkBioButton2.getText();
            sdkBioButton2.setVisibility((text3 == null || text3.length() == 0) ? 8 : 0);
        }
        Ea1.b bVar5 = this.f436618y0;
        if (bVar5 == null) {
            bVar5 = null;
        }
        SdkBioButton sdkBioButton3 = this.f436597g0;
        if (sdkBioButton3 != null) {
            String str4 = bVar5.f4083L;
            if (str4 == null) {
                str4 = this.f436613t0;
            }
            sdkBioButton3.setText(str4);
            SdkBioButton sdkBioButton4 = this.f436597g0;
            String text4 = sdkBioButton4 != null ? sdkBioButton4.getText() : null;
            sdkBioButton3.setVisibility((text4 == null || text4.length() == 0) ? 8 : 0);
        }
        SdkBioButton sdkBioButton5 = e12.f1027e;
        Ea1.b bVar6 = this.f436618y0;
        if (bVar6 == null) {
            bVar6 = null;
        }
        String str5 = bVar6.f4084M;
        if (str5 == null) {
            str5 = this.f436612s0;
        }
        sdkBioButton5.setText(str5);
        SdkBioButton sdkBioButton6 = e12.f1027e;
        String text5 = sdkBioButton6.getText();
        sdkBioButton6.setVisibility((text5 == null || text5.length() == 0) ? 8 : 0);
        SdkBioButton sdkBioButton7 = e12.f1024b;
        SdkBioButton sdkBioButton8 = e12.f1026d;
        if (bundle != null) {
            final int i12 = 0;
            sdkBioButton8.setOnClickListener(new View.OnClickListener(this) { // from class: Da1.g

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ ru.mts.biometry.sdk.view.modalcard.f f3250c;

                {
                    this.f3250c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i12) {
                        case 0:
                            this.f3250c.f436601k0.postValue("");
                            break;
                        case 1:
                            this.f3250c.f436619z0.postValue("");
                            break;
                        default:
                            this.f3250c.f436602l0.postValue("");
                            break;
                    }
                }
            });
            final int i13 = 1;
            sdkBioButton6.setOnClickListener(new View.OnClickListener(this) { // from class: Da1.g

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ ru.mts.biometry.sdk.view.modalcard.f f3250c;

                {
                    this.f3250c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i13) {
                        case 0:
                            this.f3250c.f436601k0.postValue("");
                            break;
                        case 1:
                            this.f3250c.f436619z0.postValue("");
                            break;
                        default:
                            this.f3250c.f436602l0.postValue("");
                            break;
                    }
                }
            });
            final int i14 = 2;
            sdkBioButton7.setOnClickListener(new View.OnClickListener(this) { // from class: Da1.g

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ ru.mts.biometry.sdk.view.modalcard.f f3250c;

                {
                    this.f3250c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i14) {
                        case 0:
                            this.f3250c.f436601k0.postValue("");
                            break;
                        case 1:
                            this.f3250c.f436619z0.postValue("");
                            break;
                        default:
                            this.f3250c.f436602l0.postValue("");
                            break;
                    }
                }
            });
        } else {
            sdkBioButton8.setOnClickListener(this.f436614u0);
            sdkBioButton6.setOnClickListener(this.f436615v0);
            sdkBioButton7.setOnClickListener(null);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sdkBioButton6.getLayoutParams();
        ViewGroup.LayoutParams layoutParams = sdkBioButton6.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i15 = marginLayoutParams2 != null ? marginLayoutParams2.leftMargin : 0;
        ViewGroup.LayoutParams layoutParams2 = sdkBioButton6.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        marginLayoutParams.setMargins(i15, 0, marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) sdkBioButton7.getLayoutParams();
        ViewGroup.LayoutParams layoutParams3 = sdkBioButton7.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        int i16 = marginLayoutParams5 != null ? marginLayoutParams5.leftMargin : 0;
        ViewGroup.LayoutParams layoutParams4 = sdkBioButton7.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
        int i17 = marginLayoutParams6 != null ? marginLayoutParams6.topMargin : 0;
        ViewGroup.LayoutParams layoutParams5 = sdkBioButton7.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams7 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
        marginLayoutParams4.setMargins(i16, i17, marginLayoutParams7 != null ? marginLayoutParams7.rightMargin : 0, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams8 = (ViewGroup.MarginLayoutParams) sdkBioButton8.getLayoutParams();
        ViewGroup.LayoutParams layoutParams6 = sdkBioButton8.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams9 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
        int i18 = marginLayoutParams9 != null ? marginLayoutParams9.leftMargin : 0;
        ViewGroup.LayoutParams layoutParams7 = sdkBioButton8.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams10 = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams7 : null;
        int i19 = marginLayoutParams10 != null ? marginLayoutParams10.topMargin : 0;
        ViewGroup.LayoutParams layoutParams8 = sdkBioButton8.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams11 = layoutParams8 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams8 : null;
        marginLayoutParams8.setMargins(i18, i19, marginLayoutParams11 != null ? marginLayoutParams11.rightMargin : 0, 0);
        E e15 = this.f436617x0;
        E e16 = e15 != null ? e15 : null;
        if (e16.f1026d.getVisibility() == 0) {
            return;
        }
        e16.f1027e.setVisibility(8);
        e16.f1024b.setVisibility(8);
    }

    public /* synthetic */ f(int i12) {
        this(null, null, "", "", "", "", null, null, Da1.f.f3248l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(a aVar, Drawable drawable, String str, String str2, String str3, String str4, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, Y41.a aVar2) {
        this.f436607n0 = aVar;
        this.f436608o0 = drawable;
        this.f436609p0 = str;
        this.f436610q0 = str2;
        this.f436611r0 = str3;
        this.f436612s0 = str4;
        this.f436613t0 = "";
        this.f436614u0 = onClickListener;
        this.f436615v0 = onClickListener2;
        this.f436616w0 = (N) aVar2;
        this.f436619z0 = new C23038g0();
    }
}
