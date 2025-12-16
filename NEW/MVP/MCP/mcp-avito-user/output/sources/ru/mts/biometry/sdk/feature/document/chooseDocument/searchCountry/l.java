package ru.mts.biometry.sdk.feature.document.chooseDocument.searchCountry;

import A91.p;
import B91.x;
import Da1.b;
import H91.g;
import N91.c;
import N91.d;
import N91.e;
import N91.i;
import N91.j;
import N91.k;
import O91.o;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.k0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22984Q;
import androidx.view.O0;
import com.avito.android.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.bottomsheet.h;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import ru.mts.biometry.sdk.view.SdkBioEditText;

@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/mts/biometry/sdk/feature/document/chooseDocument/searchCountry/l;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class l extends BottomSheetDialogFragment {

    /* renamed from: f0, reason: collision with root package name */
    public final int f436430f0;

    /* renamed from: g0, reason: collision with root package name */
    public x f436431g0;

    /* renamed from: h0, reason: collision with root package name */
    public final c f436432h0;

    /* renamed from: i0, reason: collision with root package name */
    public final O0 f436433i0;

    public l() {
        super(R.layout.sdk_bio_fragment_dialog_country_search);
        this.f436430f0 = H91.c.a(52);
        this.f436432h0 = new c(new d(this));
        this.f436433i0 = k0.a(this, m0.f406844a.b(o.class), new j(this), new k(this));
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        h hVar = (h) super.onCreateDialog(bundle);
        hVar.setOnShowListener(new b(1, hVar, this));
        return hVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((o) this.f436433i0.getValue()).a("");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        int i12 = R.id.ic_close;
        AppCompatImageView appCompatImageView = (AppCompatImageView) g2.d.a(view, R.id.ic_close);
        if (appCompatImageView != null) {
            i12 = R.id.search;
            SdkBioEditText sdkBioEditText = (SdkBioEditText) g2.d.a(view, R.id.search);
            if (sdkBioEditText != null) {
                i12 = R.id.search_results;
                RecyclerView recyclerView = (RecyclerView) g2.d.a(view, R.id.search_results);
                if (recyclerView != null) {
                    i12 = R.id.tv_bottom_sheet_title;
                    if (((TextView) g2.d.a(view, R.id.tv_bottom_sheet_title)) != null) {
                        i12 = R.id.tv_nothing_found;
                        TextView textView = (TextView) g2.d.a(view, R.id.tv_nothing_found);
                        if (textView != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            this.f436431g0 = new x(constraintLayout, appCompatImageView, sdkBioEditText, recyclerView, textView);
                            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                            layoutParams.height = getResources().getDisplayMetrics().heightPixels - this.f436430f0;
                            constraintLayout.setLayoutParams(layoutParams);
                            x xVar = this.f436431g0;
                            if (xVar == null) {
                                xVar = null;
                            }
                            xVar.f1190b.setOnClickListener(new p(this, 7));
                            RecyclerView recyclerView2 = xVar.f1192d;
                            recyclerView2.setAdapter(this.f436432h0);
                            requireContext();
                            recyclerView2.setLayoutManager(new LinearLayoutManager());
                            g.c(recyclerView2);
                            xVar.f1191c.getEditText().addTextChangedListener(new e(this));
                            x xVar2 = this.f436431g0;
                            if (xVar2 == null) {
                                xVar2 = null;
                            }
                            xVar2.f1189a.getViewTreeObserver().addOnGlobalLayoutListener(new N91.l(this, 0));
                            C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new i(this, null), 3);
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i12)));
    }
}
