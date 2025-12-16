package y7;

import Y61.k;
import Y61.l;
import android.app.Activity;
import android.app.Dialog;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.C29640d;
import com.avito.android.R;
import com.avito.android.di.B;
import com.avito.android.lib.util.g;
import com.avito.android.spinner_overlay_fragment.SpinnerOverlayDialogFragment;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.reflect.n;

/* compiled from: AdvertDetailsLoadingDialogRouter.kt */
@B
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ly7/b;", "Ly7/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: y7.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C50075b implements InterfaceC50074a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.lib.deprecated_design.dialog.a f442936a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C29640d f442937b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Activity f442938c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public Dialog f442939d;

    @Inject
    public C50075b(@k com.avito.android.lib.deprecated_design.dialog.a aVar, @k C29640d c29640d, @k Activity activity) {
        this.f442936a = aVar;
        this.f442937b = c29640d;
        this.f442938c = activity;
    }

    @Override // y7.InterfaceC50074a
    public final void a() {
        FragmentManager supportFragmentManager;
        C29640d c29640d = this.f442937b;
        c29640d.getClass();
        n<Object> nVar = C29640d.f132175X[36];
        if (!((Boolean) c29640d.f132185J.a().invoke()).booleanValue()) {
            if (this.f442939d == null) {
                this.f442939d = this.f442936a.d();
                return;
            }
            return;
        }
        Activity activity = this.f442938c;
        ActivityC22955m activityC22955m = activity instanceof ActivityC22955m ? (ActivityC22955m) activity : null;
        if (activityC22955m == null || (supportFragmentManager = activityC22955m.getSupportFragmentManager()) == null) {
            return;
        }
        Fragment fragmentH = supportFragmentManager.H("advert_spinner_dialog");
        if ((fragmentH instanceof DialogFragment ? (DialogFragment) fragmentH : null) == null) {
            SpinnerOverlayDialogFragment.f284839f0.getClass();
            SpinnerOverlayDialogFragment spinnerOverlayDialogFragment = new SpinnerOverlayDialogFragment();
            spinnerOverlayDialogFragment.setStyle(2, R.style.Theme_DesignSystem_Re23_Transparent);
            g.b(spinnerOverlayDialogFragment, activity, supportFragmentManager, "advert_spinner_dialog");
        }
    }

    @Override // y7.InterfaceC50074a
    public final void q1() {
        FragmentManager supportFragmentManager;
        Dialog dialog = this.f442939d;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.f442939d = null;
        Activity activity = this.f442938c;
        ActivityC22955m activityC22955m = activity instanceof ActivityC22955m ? (ActivityC22955m) activity : null;
        if (activityC22955m == null || (supportFragmentManager = activityC22955m.getSupportFragmentManager()) == null) {
            return;
        }
        Fragment fragmentH = supportFragmentManager.H("advert_spinner_dialog");
        DialogFragment dialogFragment = fragmentH instanceof DialogFragment ? (DialogFragment) fragmentH : null;
        if (dialogFragment != null) {
            dialogFragment.dismissAllowingStateLoss();
        }
    }
}
