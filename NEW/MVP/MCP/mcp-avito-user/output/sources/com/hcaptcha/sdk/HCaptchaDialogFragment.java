package com.hcaptcha.sdk;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AndroidRuntimeException;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.R;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public final class HCaptchaDialogFragment extends DialogFragment implements t {

    /* renamed from: f0, reason: collision with root package name */
    @P
    public p f363071f0;

    /* renamed from: g0, reason: collision with root package name */
    public LinearLayout f363072g0;

    /* renamed from: h0, reason: collision with root package name */
    public float f363073h0 = 0.6f;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            HCaptchaDialogFragment.this.f363072g0.setVisibility(8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    @Override // com.hcaptcha.sdk.tasks.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B3(@j.N com.hcaptcha.sdk.HCaptchaException r3) {
        /*
            r2 = this;
            com.hcaptcha.sdk.p r0 = r2.f363071f0
            if (r0 == 0) goto L12
            com.hcaptcha.sdk.HCaptchaConfig r0 = r0.f363116a
            com.hcaptcha.sdk.s r1 = r0.getRetryPredicate()
            boolean r0 = r1.H3(r0, r3)
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            boolean r1 = r2.isAdded()
            if (r1 == 0) goto L1e
            if (r0 != 0) goto L1e
            r2.dismissAllowingStateLoss()
        L1e:
            com.hcaptcha.sdk.p r1 = r2.f363071f0
            if (r1 == 0) goto L31
            if (r0 == 0) goto L2c
            android.webkit.WebView r3 = r1.f363119d
            java.lang.String r0 = "javascript:resetAndExecute();"
            r3.loadUrl(r0)
            goto L31
        L2c:
            com.hcaptcha.sdk.HCaptchaStateListener r0 = r1.f363118c
            r0.a(r3)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hcaptcha.sdk.HCaptchaDialogFragment.B3(com.hcaptcha.sdk.HCaptchaException):void");
    }

    @Override // com.hcaptcha.sdk.t
    public final void H4(@N ActivityC22955m activityC22955m) {
        FragmentManager supportFragmentManager = activityC22955m.getSupportFragmentManager();
        Fragment fragmentH = supportFragmentManager.H("HCaptchaDialogFragment");
        if (fragmentH == null || !fragmentH.isAdded()) {
            try {
                show(supportFragmentManager, "HCaptchaDialogFragment");
            } catch (IllegalStateException e12) {
                e12.getMessage();
                p pVar = this.f363071f0;
                if (pVar != null) {
                    pVar.f363118c.a(new HCaptchaException(HCaptchaError.ERROR));
                }
            }
        }
    }

    public final void b5() {
        if (this.f363071f0.f363116a.getLoading().booleanValue()) {
            this.f363072g0.animate().alpha(0.0f).setDuration(200L).setListener(new a());
            return;
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.getWindow().addFlags(2);
            dialog.getWindow().setDimAmount(this.f363073h0);
        }
    }

    @Override // com.hcaptcha.sdk.tasks.b
    public final void c3() {
        if (this.f363071f0.f363116a.getSize() != HCaptchaSize.INVISIBLE) {
            b5();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@N DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        B3(new HCaptchaException(HCaptchaError.CHALLENGE_CLOSED));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, R.style.HCaptchaDialogTheme);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(@N LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        Bundle arguments;
        int i12;
        HCaptchaStateListener hCaptchaStateListener;
        HCaptchaStateListener hCaptchaStateListener2 = null;
        View viewInflate = null;
        try {
            arguments = getArguments();
            i12 = Build.VERSION.SDK_INT;
            hCaptchaStateListener = (HCaptchaStateListener) (i12 >= 33 ? (Parcelable) arguments.getParcelable("hCaptchaDialogListener", HCaptchaStateListener.class) : arguments.getParcelable("hCaptchaDialogListener"));
        } catch (AndroidRuntimeException | ClassCastException unused) {
            view = null;
        }
        try {
            HCaptchaConfig hCaptchaConfig = (HCaptchaConfig) (i12 >= 33 ? arguments.getSerializable("hCaptchaConfig", HCaptchaConfig.class) : arguments.getSerializable("hCaptchaConfig"));
            j jVar = (j) (i12 >= 33 ? arguments.getSerializable("hCaptchaInternalConfig", j.class) : arguments.getSerializable("hCaptchaInternalConfig"));
            int i13 = 0;
            viewInflate = layoutInflater.inflate(R.layout.hcaptcha_fragment, viewGroup, false);
            viewInflate.setFocusableInTouchMode(true);
            viewInflate.requestFocus();
            viewInflate.setOnKeyListener(new View.OnKeyListener() { // from class: com.hcaptcha.sdk.g
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view2, int i14, KeyEvent keyEvent) {
                    p pVar;
                    HCaptchaDialogFragment hCaptchaDialogFragment = this.f363099b;
                    if (keyEvent.getAction() != 0 || i14 != 4 || (pVar = hCaptchaDialogFragment.f363071f0) == null) {
                        return false;
                    }
                    HCaptchaException hCaptchaException = new HCaptchaException(HCaptchaError.CHALLENGE_CLOSED);
                    HCaptchaConfig hCaptchaConfig2 = pVar.f363116a;
                    return hCaptchaConfig2.getRetryPredicate().H3(hCaptchaConfig2, hCaptchaException);
                }
            });
            WebView webView = (WebView) viewInflate.findViewById(R.id.webView);
            LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.loadingContainer);
            this.f363072g0 = linearLayout;
            if (!hCaptchaConfig.getLoading().booleanValue()) {
                i13 = 8;
            }
            linearLayout.setVisibility(i13);
            this.f363071f0 = new p(new Handler(Looper.getMainLooper()), requireContext(), hCaptchaConfig, jVar, this, hCaptchaStateListener, webView);
            return viewInflate;
        } catch (AndroidRuntimeException | ClassCastException unused2) {
            view = viewInflate;
            hCaptchaStateListener2 = hCaptchaStateListener;
            dismiss();
            if (hCaptchaStateListener2 != null) {
                hCaptchaStateListener2.a(new HCaptchaException(HCaptchaError.ERROR));
            }
            return view;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        p pVar = this.f363071f0;
        if (pVar != null) {
            WebView webView = pVar.f363119d;
            webView.removeJavascriptInterface("JSInterface");
            webView.removeJavascriptInterface("JSDI");
            ViewParent parent = webView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(webView);
            }
            webView.destroy();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || this.f363071f0 == null) {
            return;
        }
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(new ColorDrawable(0));
        this.f363073h0 = window.getAttributes().dimAmount;
        if (this.f363071f0.f363116a.getLoading().booleanValue()) {
            return;
        }
        window.clearFlags(2);
        window.setDimAmount(0.0f);
    }

    @Override // com.hcaptcha.sdk.tasks.d
    public final void onSuccess(String str) {
        String str2 = str;
        if (isAdded()) {
            dismissAllowingStateLoss();
        }
        this.f363071f0.f363118c.d(str2);
    }

    @Override // com.hcaptcha.sdk.tasks.c
    public final void v4() {
        if (this.f363071f0.f363116a.getSize() == HCaptchaSize.INVISIBLE) {
            b5();
        }
        this.f363071f0.f363118c.c();
    }

    @Override // com.hcaptcha.sdk.t
    public final void w0() {
        p pVar = this.f363071f0;
        if (pVar != null) {
            pVar.f363119d.loadUrl("javascript:reset();");
        }
        if (isAdded()) {
            dismissAllowingStateLoss();
        }
    }
}
