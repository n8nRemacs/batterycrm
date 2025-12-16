package androidx.fragment.app;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.RestrictTo;
import androidx.view.C23489g;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23040h0;
import androidx.view.V0;
import androidx.view.X0;
import com.avito.android.remote.model.Radius;
import j.InterfaceC42153i;
import java.util.Objects;

/* loaded from: classes.dex */
public class DialogFragment extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private int mBackStackId;
    private boolean mCancelable;
    private boolean mCreatingDialog;

    @j.P
    private Dialog mDialog;
    private boolean mDialogCreated;
    private Runnable mDismissRunnable;
    private boolean mDismissed;
    private Handler mHandler;
    private InterfaceC23040h0<InterfaceC22983P> mObserver;
    private DialogInterface.OnCancelListener mOnCancelListener;
    private DialogInterface.OnDismissListener mOnDismissListener;
    private boolean mShownByMe;
    private boolean mShowsDialog;
    private int mStyle;
    private int mTheme;
    private boolean mViewDestroyed;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public final void run() {
            DialogFragment dialogFragment = DialogFragment.this;
            dialogFragment.mOnDismissListener.onDismiss(dialogFragment.mDialog);
        }
    }

    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public final void onCancel(@j.P DialogInterface dialogInterface) {
            DialogFragment dialogFragment = DialogFragment.this;
            if (dialogFragment.mDialog != null) {
                dialogFragment.onCancel(dialogFragment.mDialog);
            }
        }
    }

    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public final void onDismiss(@j.P DialogInterface dialogInterface) {
            DialogFragment dialogFragment = DialogFragment.this;
            if (dialogFragment.mDialog != null) {
                dialogFragment.onDismiss(dialogFragment.mDialog);
            }
        }
    }

    public class d implements InterfaceC23040h0<InterfaceC22983P> {
        public d() {
        }

        @Override // androidx.view.InterfaceC23040h0
        @SuppressLint({"SyntheticAccessor"})
        public final void onChanged(InterfaceC22983P interfaceC22983P) {
            if (interfaceC22983P != null) {
                DialogFragment dialogFragment = DialogFragment.this;
                if (dialogFragment.mShowsDialog) {
                    View viewRequireView = dialogFragment.requireView();
                    if (viewRequireView.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (dialogFragment.mDialog != null) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            toString();
                            Objects.toString(dialogFragment.mDialog);
                        }
                        dialogFragment.mDialog.setContentView(viewRequireView);
                    }
                }
            }
        }
    }

    public class e extends AbstractC22957o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC22957o f46290b;

        public e(AbstractC22957o abstractC22957o) {
            this.f46290b = abstractC22957o;
        }

        @Override // androidx.fragment.app.AbstractC22957o
        @j.P
        public final View b(int i12) {
            AbstractC22957o abstractC22957o = this.f46290b;
            return abstractC22957o.c() ? abstractC22957o.b(i12) : DialogFragment.this.onFindViewById(i12);
        }

        @Override // androidx.fragment.app.AbstractC22957o
        public final boolean c() {
            return this.f46290b.c() || DialogFragment.this.onHasView();
        }
    }

    public DialogFragment() {
        this.mDismissRunnable = new a();
        this.mOnCancelListener = new b();
        this.mOnDismissListener = new c();
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new d();
        this.mDialogCreated = false;
    }

    private void dismissInternal(boolean z12, boolean z13, boolean z14) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!z13) {
                if (Looper.myLooper() == this.mHandler.getLooper()) {
                    onDismiss(this.mDialog);
                } else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId >= 0) {
            if (z14) {
                FragmentManager parentFragmentManager = getParentFragmentManager();
                int i12 = this.mBackStackId;
                if (i12 < 0) {
                    parentFragmentManager.getClass();
                    throw new IllegalArgumentException(AK.c.g(i12, "Bad id: "));
                }
                parentFragmentManager.b0(i12, 1, null);
            } else {
                getParentFragmentManager().Z(this.mBackStackId, 1, z12);
            }
            this.mBackStackId = -1;
            return;
        }
        FragmentManager parentFragmentManager2 = getParentFragmentManager();
        parentFragmentManager2.getClass();
        C22943a c22943a = new C22943a(parentFragmentManager2);
        c22943a.f46457p = true;
        c22943a.m(this);
        if (z14) {
            c22943a.g();
        } else if (z12) {
            c22943a.t(true);
        } else {
            c22943a.t(false);
        }
    }

    private void prepareDialog(@j.P Bundle bundle) {
        if (this.mShowsDialog && !this.mDialogCreated) {
            try {
                this.mCreatingDialog = true;
                Dialog dialogOnCreateDialog = onCreateDialog(bundle);
                this.mDialog = dialogOnCreateDialog;
                if (this.mShowsDialog) {
                    setupDialog(dialogOnCreateDialog, this.mStyle);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.mDialog.setOwnerActivity((Activity) context);
                    }
                    this.mDialog.setCancelable(this.mCancelable);
                    this.mDialog.setOnCancelListener(this.mOnCancelListener);
                    this.mDialog.setOnDismissListener(this.mOnDismissListener);
                    this.mDialogCreated = true;
                } else {
                    this.mDialog = null;
                }
                this.mCreatingDialog = false;
            } catch (Throwable th2) {
                this.mCreatingDialog = false;
                throw th2;
            }
        }
    }

    public void E3(@Y61.l Radius radius) {
        dismiss();
    }

    @Y61.k
    public com.avito.android.lib.design.bottom_sheet.d J0() {
        return (com.avito.android.lib.design.bottom_sheet.d) getDialog();
    }

    @Override // androidx.fragment.app.Fragment
    @j.N
    public AbstractC22957o createFragmentContainer() {
        return new e(super.createFragmentContainer());
    }

    public void dismiss() {
        dismissInternal(false, false, false);
    }

    public void dismissAllowingStateLoss() {
        dismissInternal(true, false, false);
    }

    @j.K
    public void dismissNow() {
        dismissInternal(false, false, true);
    }

    @j.P
    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    @j.f0
    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    @Override // androidx.fragment.app.Fragment
    @j.K
    @Deprecated
    public void onActivityCreated(@j.P Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @j.K
    public void onAttach(@j.N Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().observeForever(this.mObserver);
        if (this.mShownByMe) {
            return;
        }
        this.mDismissed = false;
    }

    @Override // androidx.fragment.app.Fragment
    @j.K
    public void onCreate(@j.P Bundle bundle) {
        super.onCreate(bundle);
        this.mHandler = new Handler();
        this.mShowsDialog = this.mContainerId == 0;
        if (bundle != null) {
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = bundle.getInt(SAVED_THEME, 0);
            this.mCancelable = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
        }
    }

    @j.N
    @j.K
    public Dialog onCreateDialog(@j.P Bundle bundle) {
        if (Log.isLoggable("FragmentManager", 3)) {
            toString();
        }
        return new androidx.view.r(requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.Fragment
    @j.K
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    @j.K
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        getViewLifecycleOwnerLiveData().removeObserver(this.mObserver);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    @InterfaceC42153i
    public void onDismiss(@j.N DialogInterface dialogInterface) {
        if (this.mViewDestroyed) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            toString();
        }
        dismissInternal(true, true, false);
    }

    @j.P
    public View onFindViewById(int i12) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i12);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @j.N
    public LayoutInflater onGetLayoutInflater(@j.P Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (!this.mShowsDialog || this.mCreatingDialog) {
            if (Log.isLoggable("FragmentManager", 2)) {
                new StringBuilder("getting layout inflater for DialogFragment ").append(this);
            }
            return layoutInflaterOnGetLayoutInflater;
        }
        prepareDialog(bundle);
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
        }
        Dialog dialog = this.mDialog;
        return dialog != null ? layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext()) : layoutInflaterOnGetLayoutInflater;
    }

    public boolean onHasView() {
        return this.mDialogCreated;
    }

    @Override // androidx.fragment.app.Fragment
    @j.K
    public void onSaveInstanceState(@j.N Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, bundleOnSaveInstanceState);
        }
        int i12 = this.mStyle;
        if (i12 != 0) {
            bundle.putInt(SAVED_STYLE, i12);
        }
        int i13 = this.mTheme;
        if (i13 != 0) {
            bundle.putInt(SAVED_THEME, i13);
        }
        boolean z12 = this.mCancelable;
        if (!z12) {
            bundle.putBoolean(SAVED_CANCELABLE, z12);
        }
        boolean z13 = this.mShowsDialog;
        if (!z13) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, z13);
        }
        int i14 = this.mBackStackId;
        if (i14 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i14);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @j.K
    public void onStart() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            V0.b(decorView, this);
            X0.b(decorView, this);
            C23489g.b(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @j.K
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @j.K
    public void onViewStateRestored(@j.P Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public void performCreateView(@j.N LayoutInflater layoutInflater, @j.P ViewGroup viewGroup, @j.P Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @j.N
    public final androidx.view.r requireComponentDialog() {
        Dialog dialogRequireDialog = requireDialog();
        if (dialogRequireDialog instanceof androidx.view.r) {
            return (androidx.view.r) dialogRequireDialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " did not return a ComponentDialog instance from requireDialog(). The actual Dialog is " + dialogRequireDialog);
    }

    @j.N
    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void setCancelable(boolean z12) {
        this.mCancelable = z12;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z12);
        }
    }

    public void setShowsDialog(boolean z12) {
        this.mShowsDialog = z12;
    }

    public void setStyle(int i12, @j.f0 int i13) {
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
        }
        this.mStyle = i12;
        if (i12 == 2 || i12 == 3) {
            this.mTheme = R.style.Theme.Panel;
        }
        if (i13 != 0) {
            this.mTheme = i13;
        }
    }

    @RestrictTo
    public void setupDialog(@j.N Dialog dialog, int i12) {
        if (i12 != 1 && i12 != 2) {
            if (i12 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void show(@j.N FragmentManager fragmentManager, @j.P String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        fragmentManager.getClass();
        C22943a c22943a = new C22943a(fragmentManager);
        c22943a.f46457p = true;
        c22943a.j(0, this, str, 1);
        c22943a.t(false);
    }

    public void showNow(@j.N FragmentManager fragmentManager, @j.P String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        fragmentManager.getClass();
        C22943a c22943a = new C22943a(fragmentManager);
        c22943a.f46457p = true;
        c22943a.j(0, this, str, 1);
        c22943a.g();
    }

    public int show(@j.N H h12, @j.P String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        h12.j(0, this, str, 1);
        this.mViewDestroyed = false;
        int iE2 = h12.e();
        this.mBackStackId = iE2;
        return iE2;
    }

    public DialogFragment(@j.I int i12) {
        super(i12);
        this.mDismissRunnable = new a();
        this.mOnCancelListener = new b();
        this.mOnDismissListener = new c();
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new d();
        this.mDialogCreated = false;
    }

    public void onCancel(@j.N DialogInterface dialogInterface) {
    }
}
