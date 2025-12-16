package ru.mts.biometry.sdk.feature.passport.ui.address;

import B91.n;
import Ca1.ViewOnTouchListenerC13235b;
import Fc1.DialogInterfaceOnShowListenerC13648j6;
import H91.c;
import I91.b;
import N91.l;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22984Q;
import androidx.view.P0;
import ca1.C27135a;
import ca1.C27136b;
import ca1.C27137c;
import ca1.C27139e;
import ca1.C27140f;
import ca1.C27143i;
import ca1.C27144j;
import ca1.C27154t;
import com.avito.android.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.bottomsheet.h;
import g2.d;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.mts.biometry.sdk.view.SdkBioEditText;
import z91.e;
import z91.s;

@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/mts/biometry/sdk/feature/passport/ui/address/f;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class f extends BottomSheetDialogFragment {

    /* renamed from: i0, reason: collision with root package name */
    public static final int f436482i0 = c.a(52);

    /* renamed from: f0, reason: collision with root package name */
    public C27154t f436483f0;

    /* renamed from: g0, reason: collision with root package name */
    public n f436484g0;

    /* renamed from: h0, reason: collision with root package name */
    public final C27143i f436485h0 = new C27143i(new C27135a(this));

    public final n b5() {
        n nVar = this.f436484g0;
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        requireContext();
        s sVar = e.f443908b;
        if (sVar == null) {
            throw new IllegalArgumentException("DI delegate is null");
        }
        this.f436483f0 = (C27154t) new P0(this, new C27144j((b) sVar.f443928h.getValue())).a(C27154t.class);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        h hVar = new h(requireContext(), getTheme());
        hVar.setOnShowListener(new DialogInterfaceOnShowListenerC13648j6(this, 1));
        return hVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        View viewInflate = layoutInflater.inflate(R.layout.sdk_bio_fragment_address_select, viewGroup, false);
        int i12 = R.id.progress;
        ProgressBar progressBar = (ProgressBar) d.a(viewInflate, R.id.progress);
        if (progressBar != null) {
            i12 = R.id.search;
            SdkBioEditText sdkBioEditText = (SdkBioEditText) d.a(viewInflate, R.id.search);
            if (sdkBioEditText != null) {
                i12 = R.id.search_results;
                RecyclerView recyclerView = (RecyclerView) d.a(viewInflate, R.id.search_results);
                if (recyclerView != null) {
                    i12 = R.id.topHandle;
                    if (d.a(viewInflate, R.id.topHandle) != null) {
                        this.f436484g0 = new n((ConstraintLayout) viewInflate, progressBar, sdkBioEditText, recyclerView);
                        Dialog dialog = getDialog();
                        if (dialog != null && (window = dialog.getWindow()) != null) {
                            window.setSoftInputMode(4);
                        }
                        b5().f1149c.requestFocus();
                        return b5().f1147a;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        b5().f1150d.setAdapter(null);
        this.f436484g0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        H91.f.a(this, new C27136b(this));
        H91.e.a(this, !H91.f.b(this));
        EditText editText = b5().f1149c.getEditText();
        editText.addTextChangedListener(new C27137c(this));
        editText.setOnEditorActionListener(new C27140f(this, 0));
        editText.setOnTouchListener(new ViewOnTouchListenerC13235b(editText, 1));
        n nVarB5 = b5();
        Bundle arguments = getArguments();
        nVarB5.f1149c.setText(arguments != null ? arguments.getString("previous_selected_address") : null);
        SdkBioEditText sdkBioEditText = b5().f1149c;
        EditText editText2 = sdkBioEditText.getEditText();
        String text = sdkBioEditText.getText();
        editText2.setSelection(text != null ? text.length() : 0);
        b5().f1150d.setAdapter(this.f436485h0);
        C22984Q.a(getViewLifecycleOwner()).e(new C27139e(this, null));
        b5().f1147a.getViewTreeObserver().addOnGlobalLayoutListener(new l(this, 2));
    }
}
