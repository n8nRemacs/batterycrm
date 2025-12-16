package androidx.preference;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.TextView;
import androidx.appcompat.app.l;
import androidx.fragment.app.DialogFragment;
import androidx.preference.DialogPreference;
import androidx.view.InterfaceC23487e;
import j.I;
import j.InterfaceC42164u;
import j.N;
import j.P;
import j.X;

/* loaded from: classes.dex */
public abstract class PreferenceDialogFragmentCompat extends DialogFragment implements DialogInterface.OnClickListener {

    /* renamed from: f0, reason: collision with root package name */
    public DialogPreference f53368f0;

    /* renamed from: g0, reason: collision with root package name */
    public CharSequence f53369g0;

    /* renamed from: h0, reason: collision with root package name */
    public CharSequence f53370h0;

    /* renamed from: i0, reason: collision with root package name */
    public CharSequence f53371i0;

    /* renamed from: j0, reason: collision with root package name */
    public CharSequence f53372j0;

    /* renamed from: k0, reason: collision with root package name */
    @I
    public int f53373k0;

    /* renamed from: l0, reason: collision with root package name */
    public BitmapDrawable f53374l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f53375m0;

    @X
    public static class a {
        @InterfaceC42164u
        public static void a(@N Window window) {
            window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
        }
    }

    public final DialogPreference b5() {
        if (this.f53368f0 == null) {
            requireArguments().getString("key");
            ((DialogPreference.a) getTargetFragment()).K4();
            this.f53368f0 = null;
        }
        return this.f53368f0;
    }

    public void c5(@N View view) {
        int i12;
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.f53372j0;
            if (TextUtils.isEmpty(charSequence)) {
                i12 = 8;
            } else {
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(charSequence);
                }
                i12 = 0;
            }
            if (viewFindViewById.getVisibility() != i12) {
                viewFindViewById.setVisibility(i12);
            }
        }
    }

    public abstract void d5(boolean z12);

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(@N DialogInterface dialogInterface, int i12) {
        this.f53375m0 = i12;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@P Bundle bundle) {
        super.onCreate(bundle);
        InterfaceC23487e targetFragment = getTargetFragment();
        if (!(targetFragment instanceof DialogPreference.a)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        DialogPreference.a aVar = (DialogPreference.a) targetFragment;
        requireArguments().getString("key");
        if (bundle == null) {
            aVar.K4();
            this.f53368f0 = null;
            throw null;
        }
        this.f53369g0 = bundle.getCharSequence("PreferenceDialogFragment.title");
        this.f53370h0 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
        this.f53371i0 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
        this.f53372j0 = bundle.getCharSequence("PreferenceDialogFragment.message");
        this.f53373k0 = bundle.getInt("PreferenceDialogFragment.layout", 0);
        Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
        if (bitmap != null) {
            this.f53374l0 = new BitmapDrawable(getResources(), bitmap);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    @N
    public final Dialog onCreateDialog(@P Bundle bundle) {
        this.f53375m0 = -2;
        l.a negativeButton = new l.a(requireContext()).setTitle(this.f53369g0).setIcon(this.f53374l0).setPositiveButton(this.f53370h0, this).setNegativeButton(this.f53371i0, this);
        requireContext();
        int i12 = this.f53373k0;
        View viewInflate = i12 != 0 ? getLayoutInflater().inflate(i12, (ViewGroup) null) : null;
        if (viewInflate != null) {
            c5(viewInflate);
            negativeButton.setView(viewInflate);
        } else {
            negativeButton.setMessage(this.f53372j0);
        }
        e5(negativeButton);
        androidx.appcompat.app.l lVarCreate = negativeButton.create();
        if (this instanceof EditTextPreferenceDialogFragmentCompat) {
            Window window = lVarCreate.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                a.a(window);
            } else {
                EditTextPreferenceDialogFragmentCompat editTextPreferenceDialogFragmentCompat = (EditTextPreferenceDialogFragmentCompat) this;
                editTextPreferenceDialogFragmentCompat.f53320q0 = SystemClock.currentThreadTimeMillis();
                editTextPreferenceDialogFragmentCompat.f5();
            }
        }
        return lVarCreate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@N DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        d5(this.f53375m0 == -1);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@N Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f53369g0);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f53370h0);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f53371i0);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f53372j0);
        bundle.putInt("PreferenceDialogFragment.layout", this.f53373k0);
        BitmapDrawable bitmapDrawable = this.f53374l0;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    public void e5(@N l.a aVar) {
    }
}
