package ru.mts.biometry.sdk.feature.documentResult.ui;

import A91.p;
import Au.ViewOnClickListenerC13080b;
import B91.C;
import T91.B;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.avito.android.R;
import g2.d;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import ru.mts.biometry.sdk.view.SdkBioButton;
import ru.mts.biometry.sdk.view.SdkBioEditText;
import ru.mts.biometry.sdk.view.SdkBioList;

@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/mts/biometry/sdk/feature/documentResult/ui/a0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "ru/mts/biometry/sdk/feature/documentResult/ui/x", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class a0 extends Fragment {

    /* renamed from: f0, reason: collision with root package name */
    public C f436448f0;

    /* renamed from: g0, reason: collision with root package name */
    public o f436449g0;

    /* renamed from: h0, reason: collision with root package name */
    public final InterfaceC42726C f436450h0;

    public a0() {
        super(R.layout.sdk_bio_fragment_edit_inn);
        this.f436450h0 = C42727D.c(new T91.C(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        int i12 = R.id.btn_accept;
        SdkBioButton sdkBioButton = (SdkBioButton) d.a(view, R.id.btn_accept);
        if (sdkBioButton != null) {
            i12 = R.id.btn_cancel;
            SdkBioButton sdkBioButton2 = (SdkBioButton) d.a(view, R.id.btn_cancel);
            if (sdkBioButton2 != null) {
                i12 = R.id.et_inn;
                SdkBioEditText sdkBioEditText = (SdkBioEditText) d.a(view, R.id.et_inn);
                if (sdkBioEditText != null) {
                    i12 = R.id.sbl_hint;
                    if (((SdkBioList) d.a(view, R.id.sbl_hint)) != null) {
                        i12 = R.id.tv_inn_info_label;
                        if (((TextView) d.a(view, R.id.tv_inn_info_label)) != null) {
                            this.f436448f0 = new C((ConstraintLayout) view, sdkBioButton, sdkBioButton2, sdkBioEditText);
                            InterfaceC42726C interfaceC42726C = this.f436450h0;
                            sdkBioEditText.setText((String) interfaceC42726C.getValue());
                            C c12 = this.f436448f0;
                            if (c12 != null) {
                                Ca1.d.a(new p(this, 13), c12.f1009c);
                                SdkBioEditText sdkBioEditText2 = c12.f1010d;
                                sdkBioEditText2.getEditText().addTextChangedListener(new B(c12));
                                ViewOnClickListenerC13080b viewOnClickListenerC13080b = new ViewOnClickListenerC13080b(18, this, c12);
                                SdkBioButton sdkBioButton3 = c12.f1008b;
                                Ca1.d.a(viewOnClickListenerC13080b, sdkBioButton3);
                                String text = sdkBioEditText2.getText();
                                sdkBioButton3.setEnabled(text != null && text.length() == 12);
                                String str = (String) interfaceC42726C.getValue();
                                sdkBioButton3.setText(getString((str == null || C43066x.K(str)) ? R.string.sdk_bio_add : R.string.sdk_bio_edit));
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i12)));
    }
}
