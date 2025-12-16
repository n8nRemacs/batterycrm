package androidx.preference;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.ComponentCallbacks2;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.TextView;
import androidx.preference.DialogPreference;
import j.I;
import j.InterfaceC42164u;
import j.N;
import j.P;
import j.X;

/* compiled from: PreferenceDialogFragment.java */
@Deprecated
/* loaded from: classes.dex */
public abstract class g extends DialogFragment implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public DialogPreference f53438b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f53439c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f53440d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f53441e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f53442f;

    /* renamed from: g, reason: collision with root package name */
    @I
    public int f53443g;

    /* renamed from: h, reason: collision with root package name */
    public BitmapDrawable f53444h;

    /* renamed from: i, reason: collision with root package name */
    public int f53445i;

    /* compiled from: PreferenceDialogFragment.java */
    @X
    public static class a {
        @InterfaceC42164u
        public static void a(@N Window window) {
            window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
        }
    }

    @Deprecated
    public g() {
    }

    @Deprecated
    public final DialogPreference a() {
        if (this.f53438b == null) {
            getArguments().getString("key");
            ((DialogPreference.a) getTargetFragment()).K4();
            this.f53438b = null;
        }
        return this.f53438b;
    }

    @Deprecated
    public void b(@N View view) {
        int i12;
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.f53442f;
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

    @Deprecated
    public abstract void c(boolean z12);

    @Override // android.content.DialogInterface.OnClickListener
    @Deprecated
    public final void onClick(@N DialogInterface dialogInterface, int i12) {
        this.f53445i = i12;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(@P Bundle bundle) {
        super.onCreate(bundle);
        ComponentCallbacks2 targetFragment = getTargetFragment();
        if (!(targetFragment instanceof DialogPreference.a)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        DialogPreference.a aVar = (DialogPreference.a) targetFragment;
        getArguments().getString("key");
        if (bundle == null) {
            aVar.K4();
            this.f53438b = null;
            throw null;
        }
        this.f53439c = bundle.getCharSequence("PreferenceDialogFragment.title");
        this.f53440d = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
        this.f53441e = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
        this.f53442f = bundle.getCharSequence("PreferenceDialogFragment.message");
        this.f53443g = bundle.getInt("PreferenceDialogFragment.layout", 0);
        Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
        if (bitmap != null) {
            this.f53444h = new BitmapDrawable(getResources(), bitmap);
        }
    }

    @Override // android.app.DialogFragment
    @N
    public final Dialog onCreateDialog(@P Bundle bundle) {
        Activity activity = getActivity();
        this.f53445i = -2;
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(activity).setTitle(this.f53439c).setIcon(this.f53444h).setPositiveButton(this.f53440d, this).setNegativeButton(this.f53441e, this);
        int i12 = this.f53443g;
        View viewInflate = i12 != 0 ? LayoutInflater.from(activity).inflate(i12, (ViewGroup) null) : null;
        if (viewInflate != null) {
            b(viewInflate);
            negativeButton.setView(viewInflate);
        } else {
            negativeButton.setMessage(this.f53442f);
        }
        d(negativeButton);
        AlertDialog alertDialogCreate = negativeButton.create();
        if (this instanceof b) {
            Window window = alertDialogCreate.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                a.a(window);
            } else {
                window.setSoftInputMode(5);
            }
        }
        return alertDialogCreate;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@N DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        c(this.f53445i == -1);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(@N Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f53439c);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f53440d);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f53441e);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f53442f);
        bundle.putInt("PreferenceDialogFragment.layout", this.f53443g);
        BitmapDrawable bitmapDrawable = this.f53444h;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Deprecated
    public void d(@N AlertDialog.Builder builder) {
    }
}
