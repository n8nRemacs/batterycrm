package ru.mts.biometry.sdk.feature.document.chooseDocument.ui;

import Au.ViewOnClickListenerC13080b;
import B91.t;
import H91.e;
import H91.f;
import L91.q;
import O91.a;
import O91.g;
import O91.h;
import O91.i;
import O91.o;
import O91.r;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.k0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22984Q;
import androidx.view.O0;
import com.avito.android.R;
import g2.c;
import g2.d;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import ru.mts.biometry.sdk.base.b;
import ru.mts.biometry.sdk.view.SdkBioButton;
import ru.mts.biometry.sdk.view.SdkBioEditText;
import ru.mts.biometry.sdk.view.SdkBioToolbar;

@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/mts/biometry/sdk/feature/document/chooseDocument/ui/j;", "Lru/mts/biometry/sdk/base/b;", "LB91/t;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class j extends b<t> {

    /* renamed from: h0, reason: collision with root package name */
    public final r f436436h0;

    /* renamed from: i0, reason: collision with root package name */
    public final O0 f436437i0;

    public j() {
        super(0);
        this.f436436h0 = new r(new a(this));
        this.f436437i0 = k0.a(this, m0.f406844a.b(o.class), new h(this), new i(this));
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final c b5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.sdk_bio_fragment_choose_document, viewGroup, false);
        int i12 = R.id.btn_layout;
        if (((LinearLayout) d.a(viewInflate, R.id.btn_layout)) != null) {
            i12 = R.id.btnNext;
            SdkBioButton sdkBioButton = (SdkBioButton) d.a(viewInflate, R.id.btnNext);
            if (sdkBioButton != null) {
                i12 = R.id.et_choose_country;
                SdkBioEditText sdkBioEditText = (SdkBioEditText) d.a(viewInflate, R.id.et_choose_country);
                if (sdkBioEditText != null) {
                    i12 = R.id.header_choose_document;
                    TextView textView = (TextView) d.a(viewInflate, R.id.header_choose_document);
                    if (textView != null) {
                        i12 = R.id.rv_document_type;
                        RecyclerView recyclerView = (RecyclerView) d.a(viewInflate, R.id.rv_document_type);
                        if (recyclerView != null) {
                            i12 = R.id.title_choose_document;
                            TextView textView2 = (TextView) d.a(viewInflate, R.id.title_choose_document);
                            if (textView2 != null) {
                                i12 = R.id.toolbar;
                                SdkBioToolbar sdkBioToolbar = (SdkBioToolbar) d.a(viewInflate, R.id.toolbar);
                                if (sdkBioToolbar != null) {
                                    i12 = R.id.tv_choose_document_type;
                                    TextView textView3 = (TextView) d.a(viewInflate, R.id.tv_choose_document_type);
                                    if (textView3 != null) {
                                        return new t((ConstraintLayout) viewInflate, sdkBioButton, sdkBioEditText, textView, recyclerView, textView2, sdkBioToolbar, textView3);
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
    public final void d5(c cVar) {
        t tVar = (t) cVar;
        RecyclerView recyclerView = tVar.f1171e;
        recyclerView.setAdapter(this.f436436h0);
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setItemAnimator(null);
        tVar.f1173g.setOnBackListener(new q(1));
        SdkBioEditText sdkBioEditText = tVar.f1169c;
        sdkBioEditText.setEnabled(false);
        t tVar2 = (t) this.f436376g0;
        if (tVar2 != null) {
            f.a(this, new g(tVar2));
            e.a(this, true ^ f.b(this));
        }
        requireContext();
        z91.e eVar = z91.e.f443907a;
        E91.a aVar = C91.a.f2018e.f3821g;
        if (aVar != null) {
            String str = aVar.f3809a;
            if (str != null) {
                tVar.f1170d.setText(str);
            }
            String str2 = aVar.f3810b;
            if (str2 != null) {
                tVar.f1172f.setText(str2);
            }
            String str3 = aVar.f3811c;
            if (str3 != null) {
                tVar.f1174h.setText(str3);
            }
            String str4 = aVar.f3812d;
            if (str4 != null) {
                sdkBioEditText.setTopLabel(str4);
            }
        }
        Ca1.d.a(new ViewOnClickListenerC13080b(11, this, tVar), tVar.f1168b);
    }

    @Override // ru.mts.biometry.sdk.base.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new O91.f(this, null), 3);
    }
}
