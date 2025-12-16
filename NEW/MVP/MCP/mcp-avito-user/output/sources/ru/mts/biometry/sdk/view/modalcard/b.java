package ru.mts.biometry.sdk.view.modalcard;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.H;
import androidx.view.C23038g0;
import com.avito.android.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.bottomsheet.h;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import ru.mts.biometry.sdk.view.SdkBioButton;

@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/mts/biometry/sdk/view/modalcard/b;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public class b extends BottomSheetDialogFragment {

    /* renamed from: f0, reason: collision with root package name */
    public SdkBioButton f436596f0;

    /* renamed from: g0, reason: collision with root package name */
    public SdkBioButton f436597g0;

    /* renamed from: h0, reason: collision with root package name */
    public TextView f436598h0;

    /* renamed from: i0, reason: collision with root package name */
    public TextView f436599i0;

    /* renamed from: j0, reason: collision with root package name */
    public LinearLayout f436600j0;

    /* renamed from: k0, reason: collision with root package name */
    public final C23038g0 f436601k0 = new C23038g0();

    /* renamed from: l0, reason: collision with root package name */
    public final C23038g0 f436602l0 = new C23038g0();

    /* renamed from: m0, reason: collision with root package name */
    public final C23038g0 f436603m0 = new C23038g0();

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.MTS_ModalCard_Dialog);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        h hVar = (h) super.onCreateDialog(bundle);
        hVar.setOnShowListener(new Da1.b(0, hVar, new l0.e()));
        return hVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Window window;
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setWindowAnimations(R.style.MTS_ModalCard_Animation);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        Fragment fragmentH = fragmentManager.H(str);
        if (fragmentManager.H(str) != null && fragmentH != null) {
            H hE2 = fragmentManager.e();
            hE2.m(fragmentH);
            hE2.e();
        }
        super.show(fragmentManager, str);
    }
}
