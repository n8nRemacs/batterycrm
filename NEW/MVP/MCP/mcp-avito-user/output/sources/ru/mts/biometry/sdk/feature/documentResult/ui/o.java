package ru.mts.biometry.sdk.feature.documentResult.ui;

import B91.B;
import Ba1.k;
import C91.a;
import H91.g;
import T91.A;
import T91.p;
import T91.z;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.os.C22777e;
import androidx.core.widget.NestedScrollView;
import androidx.view.C22981N;
import androidx.view.N0;
import com.avito.android.R;
import g2.c;
import g2.d;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Q;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import ru.mts.biometry.sdk.base.b;
import ru.mts.biometry.sdk.base.f;
import ru.mts.biometry.sdk.feature.documentResult.ui.a0;
import ru.mts.biometry.sdk.view.SdkBioButton;
import ru.mts.biometry.sdk.view.SdkBioTextField;
import ru.mts.biometry.sdk.view.SdkBioToolbar;
import z91.e;

/* loaded from: classes9.dex */
public final class o extends b implements A {

    /* renamed from: h0, reason: collision with root package name */
    public final W91.h f436458h0;

    /* renamed from: i0, reason: collision with root package name */
    public final k f436459i0;

    /* renamed from: j0, reason: collision with root package name */
    public final InterfaceC42726C f436460j0;

    /* renamed from: k0, reason: collision with root package name */
    public f f436461k0;

    /* renamed from: m0, reason: collision with root package name */
    public static final /* synthetic */ n[] f436457m0 = {m0.f406844a.i(new h0(o.class, "viewModel", "getViewModel()Lru/mts/biometry/sdk/feature/documentResult/ui/DocumentResultViewModel;", 0))};

    /* renamed from: l0, reason: collision with root package name */
    public static final T91.k f436456l0 = new T91.k();

    public o() {
        super(0);
        e.f443907a.getClass();
        this.f436458h0 = e.a().b();
        this.f436459i0 = new k(z.class, new p(this));
        this.f436460j0 = C42727D.c(new T91.o(this));
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final c b5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.sdk_bio_fragment_document_result, viewGroup, false);
        int i12 = R.id.btn_accept;
        SdkBioButton sdkBioButton = (SdkBioButton) d.a(viewInflate, R.id.btn_accept);
        if (sdkBioButton != null) {
            i12 = R.id.btn_retry;
            SdkBioButton sdkBioButton2 = (SdkBioButton) d.a(viewInflate, R.id.btn_retry);
            if (sdkBioButton2 != null) {
                i12 = R.id.confirmationMessage;
                if (((TextView) d.a(viewInflate, R.id.confirmationMessage)) != null) {
                    i12 = R.id.passport_fields_title;
                    if (((TextView) d.a(viewInflate, R.id.passport_fields_title)) != null) {
                        i12 = R.id.scrollView;
                        if (((NestedScrollView) d.a(viewInflate, R.id.scrollView)) != null) {
                            i12 = R.id.tf_birth_date;
                            SdkBioTextField sdkBioTextField = (SdkBioTextField) d.a(viewInflate, R.id.tf_birth_date);
                            if (sdkBioTextField != null) {
                                i12 = R.id.tf_birth_place;
                                SdkBioTextField sdkBioTextField2 = (SdkBioTextField) d.a(viewInflate, R.id.tf_birth_place);
                                if (sdkBioTextField2 != null) {
                                    i12 = R.id.tf_delivery_date;
                                    SdkBioTextField sdkBioTextField3 = (SdkBioTextField) d.a(viewInflate, R.id.tf_delivery_date);
                                    if (sdkBioTextField3 != null) {
                                        i12 = R.id.tf_delivery_place;
                                        SdkBioTextField sdkBioTextField4 = (SdkBioTextField) d.a(viewInflate, R.id.tf_delivery_place);
                                        if (sdkBioTextField4 != null) {
                                            i12 = R.id.tf_department_code;
                                            SdkBioTextField sdkBioTextField5 = (SdkBioTextField) d.a(viewInflate, R.id.tf_department_code);
                                            if (sdkBioTextField5 != null) {
                                                i12 = R.id.tf_firstname;
                                                SdkBioTextField sdkBioTextField6 = (SdkBioTextField) d.a(viewInflate, R.id.tf_firstname);
                                                if (sdkBioTextField6 != null) {
                                                    i12 = R.id.tf_gender;
                                                    SdkBioTextField sdkBioTextField7 = (SdkBioTextField) d.a(viewInflate, R.id.tf_gender);
                                                    if (sdkBioTextField7 != null) {
                                                        i12 = R.id.tf_inn;
                                                        SdkBioTextField sdkBioTextField8 = (SdkBioTextField) d.a(viewInflate, R.id.tf_inn);
                                                        if (sdkBioTextField8 != null) {
                                                            i12 = R.id.tf_lastname;
                                                            SdkBioTextField sdkBioTextField9 = (SdkBioTextField) d.a(viewInflate, R.id.tf_lastname);
                                                            if (sdkBioTextField9 != null) {
                                                                i12 = R.id.tf_passport_number;
                                                                SdkBioTextField sdkBioTextField10 = (SdkBioTextField) d.a(viewInflate, R.id.tf_passport_number);
                                                                if (sdkBioTextField10 != null) {
                                                                    i12 = R.id.tf_passport_series;
                                                                    SdkBioTextField sdkBioTextField11 = (SdkBioTextField) d.a(viewInflate, R.id.tf_passport_series);
                                                                    if (sdkBioTextField11 != null) {
                                                                        i12 = R.id.tf_patronymic;
                                                                        SdkBioTextField sdkBioTextField12 = (SdkBioTextField) d.a(viewInflate, R.id.tf_patronymic);
                                                                        if (sdkBioTextField12 != null) {
                                                                            i12 = R.id.toolbar;
                                                                            SdkBioToolbar sdkBioToolbar = (SdkBioToolbar) d.a(viewInflate, R.id.toolbar);
                                                                            if (sdkBioToolbar != null) {
                                                                                i12 = R.id.tv_birthplace_title;
                                                                                if (((TextView) d.a(viewInflate, R.id.tv_birthplace_title)) != null) {
                                                                                    i12 = R.id.tv_change_inn;
                                                                                    TextView textView = (TextView) d.a(viewInflate, R.id.tv_change_inn);
                                                                                    if (textView != null) {
                                                                                        i12 = R.id.tv_document_name;
                                                                                        TextView textView2 = (TextView) d.a(viewInflate, R.id.tv_document_name);
                                                                                        if (textView2 != null) {
                                                                                            i12 = R.id.tv_info;
                                                                                            AppCompatTextView appCompatTextView = (AppCompatTextView) d.a(viewInflate, R.id.tv_info);
                                                                                            if (appCompatTextView != null) {
                                                                                                i12 = R.id.tv_inn_error;
                                                                                                TextView textView3 = (TextView) d.a(viewInflate, R.id.tv_inn_error);
                                                                                                if (textView3 != null) {
                                                                                                    i12 = R.id.tv_inn_title;
                                                                                                    TextView textView4 = (TextView) d.a(viewInflate, R.id.tv_inn_title);
                                                                                                    if (textView4 != null) {
                                                                                                        return new B((LinearLayout) viewInflate, sdkBioButton, sdkBioButton2, sdkBioTextField, sdkBioTextField2, sdkBioTextField3, sdkBioTextField4, sdkBioTextField5, sdkBioTextField6, sdkBioTextField7, sdkBioTextField8, sdkBioTextField9, sdkBioTextField10, sdkBioTextField11, sdkBioTextField12, sdkBioToolbar, textView, textView2, appCompatTextView, textView3, textView4);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final void c5(int i12, int i13) {
        AppCompatTextView appCompatTextView;
        SdkBioToolbar sdkBioToolbar;
        B b12 = (B) this.f436376g0;
        if (b12 != null && (sdkBioToolbar = b12.f1001p) != null) {
            g.a(i12, 0, 13, sdkBioToolbar);
        }
        B b13 = (B) this.f436376g0;
        if (b13 == null || (appCompatTextView = b13.f1004s) == null) {
            return;
        }
        g.a(0, i13, 7, appCompatTextView);
    }

    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, java.util.Map] */
    @Override // ru.mts.biometry.sdk.base.b
    public final void d5(c cVar) {
        ru.mts.biometry.sdk.domain.entity.selector.b bVar;
        String str;
        String str2;
        final int i12 = 0;
        final B b12 = (B) cVar;
        final int i13 = 1;
        H91.e.a(this, !H91.f.b(this));
        if (((Boolean) this.f436460j0.getValue()).booleanValue()) {
            C43259k.d(C22981N.a(getLifecycle()), null, null, new T91.n(this, null), 3);
        }
        b12.f1001p.setOnHintListener(new View.OnClickListener(this) { // from class: T91.q

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ru.mts.biometry.sdk.feature.documentResult.ui.o f15468c;

            {
                this.f15468c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.mts.biometry.sdk.feature.documentResult.ui.o oVar = this.f15468c;
                switch (i12) {
                    case 0:
                        oVar.f436458h0.d(true);
                        break;
                    default:
                        k kVar = ru.mts.biometry.sdk.feature.documentResult.ui.o.f436456l0;
                        String str3 = ((C15344b) oVar.e5().f15494M.getValue()).f15441b;
                        int i14 = (str3 == null || str3.length() != 0) ? R.string.sdk_bio_edit_inn : R.string.sdk_bio_add_inn;
                        a0 a0Var = new a0();
                        a0Var.setArguments(C22777e.b(new Q("arg_inn", str3)));
                        a0Var.f436449g0 = oVar;
                        G0 g02 = G0.f406611a;
                        ru.mts.biometry.sdk.base.f fVarA = A91.b.a(a0Var, oVar.getString(i14));
                        oVar.f436461k0 = fVarA;
                        fVarA.show(oVar.getParentFragmentManager(), "tag_edit_inn");
                        break;
                }
            }
        });
        Ca1.d.a(new View.OnClickListener() { // from class: T91.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                ru.mts.biometry.sdk.feature.documentResult.ui.o oVar = this;
                B91.B b13 = b12;
                switch (i12) {
                    case 0:
                        k kVar = ru.mts.biometry.sdk.feature.documentResult.ui.o.f436456l0;
                        b13.f988c.enableLoader();
                        b13.f987b.setEnabled(false);
                        z zVarE5 = oVar.e5();
                        C43259k.d(N0.a(zVarE5), C43262l0.f411947c, null, new y(zVarE5, null), 2);
                        break;
                    default:
                        k kVar2 = ru.mts.biometry.sdk.feature.documentResult.ui.o.f436456l0;
                        b13.f987b.enableLoader();
                        b13.f988c.setEnabled(false);
                        z zVarE52 = oVar.e5();
                        C43259k.d(N0.a(zVarE52), C43262l0.f411947c, null, new w(oVar.requireContext(), zVarE52, b13.f989d.getFieldValue(), null), 2);
                        break;
                }
            }
        }, b12.f988c);
        Ca1.d.a(new View.OnClickListener() { // from class: T91.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                ru.mts.biometry.sdk.feature.documentResult.ui.o oVar = this;
                B91.B b13 = b12;
                switch (i13) {
                    case 0:
                        k kVar = ru.mts.biometry.sdk.feature.documentResult.ui.o.f436456l0;
                        b13.f988c.enableLoader();
                        b13.f987b.setEnabled(false);
                        z zVarE5 = oVar.e5();
                        C43259k.d(N0.a(zVarE5), C43262l0.f411947c, null, new y(zVarE5, null), 2);
                        break;
                    default:
                        k kVar2 = ru.mts.biometry.sdk.feature.documentResult.ui.o.f436456l0;
                        b13.f987b.enableLoader();
                        b13.f988c.setEnabled(false);
                        z zVarE52 = oVar.e5();
                        C43259k.d(N0.a(zVarE52), C43262l0.f411947c, null, new w(oVar.requireContext(), zVarE52, b13.f989d.getFieldValue(), null), 2);
                        break;
                }
            }
        }, b12.f987b);
        Ca1.d.a(new View.OnClickListener(this) { // from class: T91.q

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ru.mts.biometry.sdk.feature.documentResult.ui.o f15468c;

            {
                this.f15468c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.mts.biometry.sdk.feature.documentResult.ui.o oVar = this.f15468c;
                switch (i13) {
                    case 0:
                        oVar.f436458h0.d(true);
                        break;
                    default:
                        k kVar = ru.mts.biometry.sdk.feature.documentResult.ui.o.f436456l0;
                        String str3 = ((C15344b) oVar.e5().f15494M.getValue()).f15441b;
                        int i14 = (str3 == null || str3.length() != 0) ? R.string.sdk_bio_edit_inn : R.string.sdk_bio_add_inn;
                        a0 a0Var = new a0();
                        a0Var.setArguments(C22777e.b(new Q("arg_inn", str3)));
                        a0Var.f436449g0 = oVar;
                        G0 g02 = G0.f406611a;
                        ru.mts.biometry.sdk.base.f fVarA = A91.b.a(a0Var, oVar.getString(i14));
                        oVar.f436461k0 = fVarA;
                        fVarA.show(oVar.getParentFragmentManager(), "tag_edit_inn");
                        break;
                }
            }
        }, b12.f1002q);
        Ca1.e.a(b12.f986a, getString(R.string.sdk_bio_title_verify_progress), getString(R.string.sdk_bio_message_verify_progress));
        e5();
        E91.d dVar = a.f2018e.f3819e;
        b12.f998m.setFieldValue(dVar != null ? dVar.f3829e : null);
        b12.f999n.setFieldValue(dVar != null ? dVar.f3828d : null);
        b12.f995j.setFieldValue(dVar != null ? dVar.f3827c : null);
        b12.f994i.setFieldValue(dVar != null ? dVar.f3833i : null);
        b12.f997l.setFieldValue(dVar != null ? dVar.f3830f : null);
        b12.f1000o.setFieldValue(dVar != null ? dVar.f3836l : null);
        b12.f989d.setFieldValue((dVar == null || (str2 = dVar.f3832h) == null) ? null : Ba1.p.a(str2));
        b12.f990e.setFieldValue(dVar != null ? dVar.f3834j : null);
        b12.f991f.setFieldValue((dVar == null || (str = dVar.f3835k) == null) ? null : Ba1.p.a(str));
        b12.f992g.setFieldValue(dVar != null ? dVar.f3831g : null);
        b12.f993h.setFieldValue(dVar != null ? dVar.f3837m : null);
        requireContext();
        e eVar = e.f443907a;
        E91.a aVar = a.f2018e.f3821g;
        if (aVar != null) {
            bVar = (ru.mts.biometry.sdk.domain.entity.selector.b) aVar.f3814f.f436416c.get(dVar != null ? dVar.f3825a : null);
        } else {
            bVar = null;
        }
        b12.f1003r.setText(bVar != null ? bVar.f436411c : null);
    }

    public final z e5() {
        n nVar = f436457m0[0];
        return (z) this.f436459i0.a(this);
    }
}
