package ru.mts.biometry.sdk.feature.address.ui;

import B91.C13117j;
import K91.A;
import K91.ViewOnClickListenerC14270a;
import K91.c;
import K91.e;
import K91.f;
import K91.q;
import W91.h;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.k0;
import androidx.view.C22984Q;
import androidx.view.O0;
import com.avito.android.R;
import g2.d;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import ru.mts.biometry.sdk.base.b;
import ru.mts.biometry.sdk.view.SdkBioButton;
import ru.mts.biometry.sdk.view.SdkBioToolbar;
import z91.s;

@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/mts/biometry/sdk/feature/address/ui/g;", "Lru/mts/biometry/sdk/base/b;", "LB91/j;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class g extends b<C13117j> {

    /* renamed from: h0, reason: collision with root package name */
    public h f436418h0;

    /* renamed from: i0, reason: collision with root package name */
    public final InterfaceC42726C f436419i0;

    /* renamed from: j0, reason: collision with root package name */
    public final O0 f436420j0;

    /* renamed from: k0, reason: collision with root package name */
    public final InterfaceC42726C f436421k0;

    public g() {
        super((Object) null);
        this.f436419i0 = C42727D.c(new f(this));
        this.f436420j0 = k0.a(this, m0.f406844a.b(A.class), new K91.g(this), new K91.h(this));
        this.f436421k0 = C42727D.c(new c(this));
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final g2.c b5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.sdk_bio_fragment_address_confirm, viewGroup, false);
        int i12 = R.id.addressHeadline;
        if (((TextView) d.a(viewInflate, R.id.addressHeadline)) != null) {
            i12 = R.id.addressTitle;
            if (((TextView) d.a(viewInflate, R.id.addressTitle)) != null) {
                i12 = R.id.block;
                TextView textView = (TextView) d.a(viewInflate, R.id.block);
                if (textView != null) {
                    i12 = R.id.btnEditPrimary;
                    SdkBioButton sdkBioButton = (SdkBioButton) d.a(viewInflate, R.id.btnEditPrimary);
                    if (sdkBioButton != null) {
                        i12 = R.id.btnEditSecondary;
                        SdkBioButton sdkBioButton2 = (SdkBioButton) d.a(viewInflate, R.id.btnEditSecondary);
                        if (sdkBioButton2 != null) {
                            i12 = R.id.btnSend;
                            SdkBioButton sdkBioButton3 = (SdkBioButton) d.a(viewInflate, R.id.btnSend);
                            if (sdkBioButton3 != null) {
                                i12 = R.id.buttons_barrier;
                                if (((Barrier) d.a(viewInflate, R.id.buttons_barrier)) != null) {
                                    i12 = R.id.city;
                                    TextView textView2 = (TextView) d.a(viewInflate, R.id.city);
                                    if (textView2 != null) {
                                        i12 = R.id.cityTittle;
                                        TextView textView3 = (TextView) d.a(viewInflate, R.id.cityTittle);
                                        if (textView3 != null) {
                                            i12 = R.id.flat;
                                            TextView textView4 = (TextView) d.a(viewInflate, R.id.flat);
                                            if (textView4 != null) {
                                                i12 = R.id.house;
                                                TextView textView5 = (TextView) d.a(viewInflate, R.id.house);
                                                if (textView5 != null) {
                                                    i12 = R.id.houseTittle;
                                                    TextView textView6 = (TextView) d.a(viewInflate, R.id.houseTittle);
                                                    if (textView6 != null) {
                                                        i12 = R.id.pcTittle;
                                                        TextView textView7 = (TextView) d.a(viewInflate, R.id.pcTittle);
                                                        if (textView7 != null) {
                                                            i12 = R.id.postalCode;
                                                            TextView textView8 = (TextView) d.a(viewInflate, R.id.postalCode);
                                                            if (textView8 != null) {
                                                                i12 = R.id.region;
                                                                TextView textView9 = (TextView) d.a(viewInflate, R.id.region);
                                                                if (textView9 != null) {
                                                                    i12 = R.id.scroll_layout;
                                                                    NestedScrollView nestedScrollView = (NestedScrollView) d.a(viewInflate, R.id.scroll_layout);
                                                                    if (nestedScrollView != null) {
                                                                        i12 = R.id.street;
                                                                        TextView textView10 = (TextView) d.a(viewInflate, R.id.street);
                                                                        if (textView10 != null) {
                                                                            i12 = R.id.streetTittle;
                                                                            if (((TextView) d.a(viewInflate, R.id.streetTittle)) != null) {
                                                                                i12 = R.id.toolbar;
                                                                                SdkBioToolbar sdkBioToolbar = (SdkBioToolbar) d.a(viewInflate, R.id.toolbar);
                                                                                if (sdkBioToolbar != null) {
                                                                                    i12 = R.id.tv_info;
                                                                                    AppCompatTextView appCompatTextView = (AppCompatTextView) d.a(viewInflate, R.id.tv_info);
                                                                                    if (appCompatTextView != null) {
                                                                                        return new C13117j((ConstraintLayout) viewInflate, textView, sdkBioButton, sdkBioButton2, sdkBioButton3, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, nestedScrollView, textView10, sdkBioToolbar, appCompatTextView);
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
        C13117j c13117j = (C13117j) this.f436376g0;
        if (c13117j != null) {
            H91.g.a(i12, 0, 13, c13117j.f1138p);
            H91.g.a(i12, 0, 13, c13117j.f1136n);
            H91.g.a(0, H91.c.a(24) + i13, 7, c13117j.f1139q);
        }
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final void d5(g2.c cVar) {
        String str;
        String str2;
        String str3;
        String str4;
        Integer num;
        C13117j c13117j = (C13117j) cVar;
        c13117j.f1138p.setOnCloseListener(new ViewOnClickListenerC14270a(this, 5));
        C22984Q.a(getViewLifecycleOwner()).e(new e(this, null));
        Object value = ((A) this.f436420j0.getValue()).f9300L.getValue();
        q qVar = value instanceof q ? (q) value : null;
        I91.d dVar = qVar != null ? qVar.f9325a : null;
        C13117j c13117j2 = (C13117j) this.f436376g0;
        if (c13117j2 != null) {
            if (dVar == null || (str = dVar.f8036i) == null) {
                str = "";
            }
            c13117j2.f1135m.setText(str);
            String str5 = dVar != null ? dVar.f8030c : null;
            InterfaceC42726C interfaceC42726C = this.f436419i0;
            TextView textView = c13117j2.f1128f;
            String str6 = "—";
            if (str5 != null) {
                textView.setText(dVar.f8030c);
            } else {
                textView.setTextColor(((Number) interfaceC42726C.getValue()).intValue());
                textView.setText("—");
                c13117j2.f1129g.setTextColor(((Number) interfaceC42726C.getValue()).intValue());
            }
            Integer num2 = dVar != null ? dVar.f8034g : null;
            TextView textView2 = c13117j2.f1134l;
            if (num2 == null || ((num = dVar.f8034g) != null && num.intValue() == 0)) {
                textView2.setTextColor(((Number) interfaceC42726C.getValue()).intValue());
                textView2.setText("—");
                c13117j2.f1133k.setTextColor(((Number) interfaceC42726C.getValue()).intValue());
            } else {
                textView2.setText(dVar.f8034g.toString());
            }
            if (dVar == null || (str2 = dVar.f8037j) == null) {
                str2 = "—";
            }
            c13117j2.f1137o.setText(str2);
            if (dVar == null || (str3 = dVar.f8033f) == null) {
                str3 = "—";
            }
            c13117j2.f1124b.setText(str3);
            if (dVar != null && (str4 = dVar.f8035h) != null) {
                str6 = str4;
            }
            c13117j2.f1130h.setText(str6);
            String str7 = dVar != null ? dVar.f8032e : null;
            SdkBioButton sdkBioButton = c13117j2.f1126d;
            SdkBioButton sdkBioButton2 = c13117j2.f1125c;
            SdkBioButton sdkBioButton3 = c13117j2.f1127e;
            TextView textView3 = c13117j2.f1131i;
            if (str7 == null) {
                textView3.setText("-");
                textView3.setTextColor(((Number) interfaceC42726C.getValue()).intValue());
                c13117j2.f1132j.setTextColor(((Number) interfaceC42726C.getValue()).intValue());
                sdkBioButton3.setEnabled(false);
                sdkBioButton2.setVisibility(0);
                sdkBioButton.setVisibility(8);
            } else {
                textView3.setText(dVar.f8032e);
                sdkBioButton3.setEnabled(true);
                sdkBioButton2.setVisibility(8);
                sdkBioButton.setVisibility(0);
            }
        }
        Ca1.d.a(new ViewOnClickListenerC14270a(this, 2), c13117j.f1127e);
        Ca1.d.a(new ViewOnClickListenerC14270a(this, 3), c13117j.f1125c);
        Ca1.d.a(new ViewOnClickListenerC14270a(this, 4), c13117j.f1126d);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        requireContext();
        s sVar = z91.e.f443908b;
        if (sVar == null) {
            throw new IllegalArgumentException("DI delegate is null");
        }
        this.f436418h0 = sVar.b();
    }

    @Override // ru.mts.biometry.sdk.base.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        H91.e.a(this, !H91.f.b(this));
    }
}
