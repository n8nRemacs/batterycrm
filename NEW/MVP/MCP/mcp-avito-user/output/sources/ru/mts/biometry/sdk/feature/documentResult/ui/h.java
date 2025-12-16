package ru.mts.biometry.sdk.feature.documentResult.ui;

import B91.H;
import Ba1.k;
import Ba1.p;
import C91.a;
import H91.f;
import H91.g;
import T91.C15343a;
import T91.i;
import T91.z;
import android.content.Intent;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.view.C22981N;
import androidx.view.N0;
import com.avito.android.R;
import g2.c;
import g2.d;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import ru.mts.biometry.sdk.base.b;
import ru.mts.biometry.sdk.view.SdkBioButton;
import ru.mts.biometry.sdk.view.SdkBioEditText;
import ru.mts.biometry.sdk.view.SdkBioToolbar;
import z91.e;

/* loaded from: classes9.dex */
public final class h extends b {

    /* renamed from: h0, reason: collision with root package name */
    public final W91.h f436453h0;

    /* renamed from: i0, reason: collision with root package name */
    public final k f436454i0;

    /* renamed from: j0, reason: collision with root package name */
    public final InterfaceC42726C f436455j0;

    /* renamed from: l0, reason: collision with root package name */
    public static final /* synthetic */ n[] f436452l0 = {m0.f406844a.i(new h0(h.class, "viewModel", "getViewModel()Lru/mts/biometry/sdk/feature/documentResult/ui/DocumentResultViewModel;", 0))};

    /* renamed from: k0, reason: collision with root package name */
    public static final C15343a f436451k0 = new C15343a();

    public h() {
        super((Object) null);
        e.f443907a.getClass();
        this.f436453h0 = e.a().b();
        this.f436454i0 = new k(z.class, new i(this));
        this.f436455j0 = C42727D.c(new T91.h(this));
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final c b5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.sdk_bio_fragment_passport_result, viewGroup, false);
        int i12 = R.id.birthDate;
        SdkBioEditText sdkBioEditText = (SdkBioEditText) d.a(viewInflate, R.id.birthDate);
        if (sdkBioEditText != null) {
            i12 = R.id.birthPlace;
            SdkBioEditText sdkBioEditText2 = (SdkBioEditText) d.a(viewInflate, R.id.birthPlace);
            if (sdkBioEditText2 != null) {
                i12 = R.id.bottom_barrier;
                if (((Barrier) d.a(viewInflate, R.id.bottom_barrier)) != null) {
                    i12 = R.id.btnAccept;
                    SdkBioButton sdkBioButton = (SdkBioButton) d.a(viewInflate, R.id.btnAccept);
                    if (sdkBioButton != null) {
                        i12 = R.id.btnRetry;
                        SdkBioButton sdkBioButton2 = (SdkBioButton) d.a(viewInflate, R.id.btnRetry);
                        if (sdkBioButton2 != null) {
                            i12 = R.id.confirmationMessage;
                            if (((TextView) d.a(viewInflate, R.id.confirmationMessage)) != null) {
                                i12 = R.id.deliveryDate;
                                SdkBioEditText sdkBioEditText3 = (SdkBioEditText) d.a(viewInflate, R.id.deliveryDate);
                                if (sdkBioEditText3 != null) {
                                    i12 = R.id.deliveryPlace;
                                    SdkBioEditText sdkBioEditText4 = (SdkBioEditText) d.a(viewInflate, R.id.deliveryPlace);
                                    if (sdkBioEditText4 != null) {
                                        i12 = R.id.departmentCode;
                                        SdkBioEditText sdkBioEditText5 = (SdkBioEditText) d.a(viewInflate, R.id.departmentCode);
                                        if (sdkBioEditText5 != null) {
                                            i12 = R.id.gender;
                                            SdkBioEditText sdkBioEditText6 = (SdkBioEditText) d.a(viewInflate, R.id.gender);
                                            if (sdkBioEditText6 != null) {
                                                i12 = R.id.guideline2;
                                                if (((Guideline) d.a(viewInflate, R.id.guideline2)) != null) {
                                                    i12 = R.id.inn;
                                                    SdkBioEditText sdkBioEditText7 = (SdkBioEditText) d.a(viewInflate, R.id.inn);
                                                    if (sdkBioEditText7 != null) {
                                                        i12 = R.id.innInfo;
                                                        TextView textView = (TextView) d.a(viewInflate, R.id.innInfo);
                                                        if (textView != null) {
                                                            i12 = R.id.loader_layout;
                                                            FrameLayout frameLayout = (FrameLayout) d.a(viewInflate, R.id.loader_layout);
                                                            if (frameLayout != null) {
                                                                i12 = R.id.name;
                                                                SdkBioEditText sdkBioEditText8 = (SdkBioEditText) d.a(viewInflate, R.id.name);
                                                                if (sdkBioEditText8 != null) {
                                                                    i12 = R.id.number;
                                                                    SdkBioEditText sdkBioEditText9 = (SdkBioEditText) d.a(viewInflate, R.id.number);
                                                                    if (sdkBioEditText9 != null) {
                                                                        i12 = R.id.passport_fields_title;
                                                                        if (((TextView) d.a(viewInflate, R.id.passport_fields_title)) != null) {
                                                                            i12 = R.id.patronymic;
                                                                            SdkBioEditText sdkBioEditText10 = (SdkBioEditText) d.a(viewInflate, R.id.patronymic);
                                                                            if (sdkBioEditText10 != null) {
                                                                                i12 = R.id.scrollView;
                                                                                NestedScrollView nestedScrollView = (NestedScrollView) d.a(viewInflate, R.id.scrollView);
                                                                                if (nestedScrollView != null) {
                                                                                    i12 = R.id.series;
                                                                                    SdkBioEditText sdkBioEditText11 = (SdkBioEditText) d.a(viewInflate, R.id.series);
                                                                                    if (sdkBioEditText11 != null) {
                                                                                        i12 = R.id.surname;
                                                                                        SdkBioEditText sdkBioEditText12 = (SdkBioEditText) d.a(viewInflate, R.id.surname);
                                                                                        if (sdkBioEditText12 != null) {
                                                                                            i12 = R.id.toolbar;
                                                                                            SdkBioToolbar sdkBioToolbar = (SdkBioToolbar) d.a(viewInflate, R.id.toolbar);
                                                                                            if (sdkBioToolbar != null) {
                                                                                                i12 = R.id.tv_info;
                                                                                                if (((AppCompatTextView) d.a(viewInflate, R.id.tv_info)) != null) {
                                                                                                    return new H((ConstraintLayout) viewInflate, sdkBioEditText, sdkBioEditText2, sdkBioButton, sdkBioButton2, sdkBioEditText3, sdkBioEditText4, sdkBioEditText5, sdkBioEditText6, sdkBioEditText7, textView, frameLayout, sdkBioEditText8, sdkBioEditText9, sdkBioEditText10, nestedScrollView, sdkBioEditText11, sdkBioEditText12, sdkBioToolbar);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final void c5(int i12, int i13) {
        H h12 = (H) this.f436376g0;
        if (h12 != null) {
            g.a(i12, 0, 13, h12.f1061s);
            g.a(0, i13, 7, h12.f1058p);
        }
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final void d5(c cVar) {
        String str;
        String str2;
        final H h12 = (H) cVar;
        H91.e.a(this, !f.b(this));
        e5();
        E91.d dVar = a.f2018e.f3819e;
        h12.f1056n.setText(dVar != null ? dVar.f3829e : null);
        h12.f1059q.setText(dVar != null ? dVar.f3828d : null);
        h12.f1051i.setText(dVar != null ? dVar.f3827c : null);
        h12.f1055m.setText(dVar != null ? dVar.f3833i : null);
        h12.f1060r.setText(dVar != null ? dVar.f3830f : null);
        h12.f1057o.setText(dVar != null ? dVar.f3836l : null);
        h12.f1044b.setText((dVar == null || (str2 = dVar.f3832h) == null) ? null : p.a(str2));
        h12.f1045c.setText(dVar != null ? dVar.f3834j : null);
        h12.f1048f.setText((dVar == null || (str = dVar.f3835k) == null) ? null : p.a(str));
        h12.f1049g.setText(dVar != null ? dVar.f3831g : null);
        h12.f1050h.setText(dVar != null ? dVar.f3837m : null);
        if (((Boolean) this.f436455j0.getValue()).booleanValue()) {
            h12.f1052j.getEditText().addTextChangedListener(new T91.g(this));
        }
        final int i12 = 0;
        Ca1.d.a(new View.OnClickListener() { // from class: T91.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                ru.mts.biometry.sdk.feature.documentResult.ui.h hVar = this;
                H h13 = h12;
                switch (i12) {
                    case 0:
                        C15343a c15343a = ru.mts.biometry.sdk.feature.documentResult.ui.h.f436451k0;
                        h13.f1047e.enableLoader();
                        h13.f1046d.setEnabled(false);
                        z zVarE5 = hVar.e5();
                        C43259k.d(N0.a(zVarE5), C43262l0.f411947c, null, new y(zVarE5, null), 2);
                        break;
                    default:
                        C15343a c15343a2 = ru.mts.biometry.sdk.feature.documentResult.ui.h.f436451k0;
                        h13.f1046d.enableLoader();
                        h13.f1047e.setEnabled(false);
                        Intent intent = new Intent();
                        intent.setAction("d.c.action");
                        SdkBioEditText sdkBioEditText = h13.f1044b;
                        intent.putExtra("bd_extra", sdkBioEditText.getText());
                        androidx.localbroadcastmanager.content.a.a(hVar.requireContext()).c(intent);
                        z zVarE52 = hVar.e5();
                        C43259k.d(N0.a(zVarE52), C43262l0.f411947c, null, new w(hVar.requireContext(), zVarE52, sdkBioEditText.getText(), null), 2);
                        break;
                }
            }
        }, h12.f1047e);
        final int i13 = 1;
        Ca1.d.a(new View.OnClickListener() { // from class: T91.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                ru.mts.biometry.sdk.feature.documentResult.ui.h hVar = this;
                H h13 = h12;
                switch (i13) {
                    case 0:
                        C15343a c15343a = ru.mts.biometry.sdk.feature.documentResult.ui.h.f436451k0;
                        h13.f1047e.enableLoader();
                        h13.f1046d.setEnabled(false);
                        z zVarE5 = hVar.e5();
                        C43259k.d(N0.a(zVarE5), C43262l0.f411947c, null, new y(zVarE5, null), 2);
                        break;
                    default:
                        C15343a c15343a2 = ru.mts.biometry.sdk.feature.documentResult.ui.h.f436451k0;
                        h13.f1046d.enableLoader();
                        h13.f1047e.setEnabled(false);
                        Intent intent = new Intent();
                        intent.setAction("d.c.action");
                        SdkBioEditText sdkBioEditText = h13.f1044b;
                        intent.putExtra("bd_extra", sdkBioEditText.getText());
                        androidx.localbroadcastmanager.content.a.a(hVar.requireContext()).c(intent);
                        z zVarE52 = hVar.e5();
                        C43259k.d(N0.a(zVarE52), C43262l0.f411947c, null, new w(hVar.requireContext(), zVarE52, sdkBioEditText.getText(), null), 2);
                        break;
                }
            }
        }, h12.f1046d);
        C43259k.d(C22981N.a(getLifecycle()), null, null, new T91.f(null, h12, this), 3);
        h12.f1061s.setOnHintListener(new T91.e(this, 1));
    }

    public final z e5() {
        n nVar = f436452l0[0];
        return (z) this.f436454i0.a(this);
    }
}
