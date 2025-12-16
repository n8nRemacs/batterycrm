package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.fragment.app.b;
import androidx.fragment.app.c;
import androidx.mediarouter.app.MediaRouteChooserDialogFragment;
import androidx.mediarouter.app.MediaRouteControllerDialogFragment;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v49 extends View {
    public static s49 D0;
    public static final SparseArray E0 = new SparseArray(2);
    public static final int[] F0 = {R.attr.state_checked};
    public static final int[] G0 = {R.attr.state_checkable};
    public final int A0;
    public boolean B0;
    public boolean C0;
    public final l69 a;
    public final t49 b;
    public d69 c;
    public i59 d;
    public boolean o;
    public int s0;
    public u49 t0;
    public Drawable u0;
    public int v0;
    public int w0;
    public int x0;
    public final ColorStateList y0;
    public final int z0;

    public v49(Context context) {
        Drawable.ConstantState constantState;
        int i = avc.mediaRouteButtonStyle;
        int i2 = r69.a;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, r69.e(context));
        int iG = r69.g(contextThemeWrapper, avc.mediaRouteTheme);
        super(iG != 0 ? new ContextThemeWrapper(contextThemeWrapper, iG) : contextThemeWrapper, null, i);
        this.c = d69.c;
        this.d = i59.a;
        int i3 = 0;
        this.s0 = 0;
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(null, n6d.MediaRouteButton, i, 0);
        hfh.m(this, context2, n6d.MediaRouteButton, null, typedArrayObtainStyledAttributes, i, 0);
        if (isInEditMode()) {
            this.a = null;
            this.b = null;
            this.u0 = eri.a(context2, typedArrayObtainStyledAttributes.getResourceId(n6d.MediaRouteButton_externalRouteEnabledDrawableStatic, 0));
            return;
        }
        this.a = l69.d(context2);
        this.b = new t49(this, i3);
        l69.b();
        k69 k69VarE = l69.c().e();
        int i4 = !k69VarE.d() ? k69VarE.h : 0;
        this.x0 = i4;
        this.w0 = i4;
        if (D0 == null) {
            D0 = new s49(context2.getApplicationContext());
        }
        this.y0 = typedArrayObtainStyledAttributes.getColorStateList(n6d.MediaRouteButton_mediaRouteButtonTint);
        this.z0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(n6d.MediaRouteButton_android_minWidth, 0);
        this.A0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(n6d.MediaRouteButton_android_minHeight, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(n6d.MediaRouteButton_externalRouteEnabledDrawableStatic, 0);
        this.v0 = typedArrayObtainStyledAttributes.getResourceId(n6d.MediaRouteButton_externalRouteEnabledDrawable, 0);
        typedArrayObtainStyledAttributes.recycle();
        int i5 = this.v0;
        SparseArray sparseArray = E0;
        if (i5 != 0 && (constantState = (Drawable.ConstantState) sparseArray.get(i5)) != null) {
            setRemoteIndicatorDrawable(constantState.newDrawable());
        }
        if (this.u0 == null) {
            if (resourceId != 0) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) sparseArray.get(resourceId);
                if (constantState2 != null) {
                    setRemoteIndicatorDrawableInternal(constantState2.newDrawable());
                } else {
                    u49 u49Var = new u49(this, resourceId, getContext());
                    this.t0 = u49Var;
                    u49Var.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
                }
            } else {
                a();
            }
        }
        e();
        setClickable(true);
    }

    private Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    private c getFragmentManager() {
        Activity activity = getActivity();
        if (activity instanceof b) {
            return ((b) activity).z();
        }
        return null;
    }

    public final void a() {
        if (this.v0 > 0) {
            u49 u49Var = this.t0;
            if (u49Var != null) {
                u49Var.cancel(false);
            }
            u49 u49Var2 = new u49(this, this.v0, getContext());
            this.t0 = u49Var2;
            this.v0 = 0;
            u49Var2.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    public final void b() {
        this.a.getClass();
        l69.b();
        k69 k69VarE = l69.c().e();
        boolean zD = k69VarE.d();
        int i = !zD ? k69VarE.h : 0;
        if (this.x0 != i) {
            this.x0 = i;
            e();
            refreshDrawableState();
        }
        if (i == 1) {
            a();
        }
        if (this.o) {
            setEnabled(this.B0 || !zD || l69.e(this.c));
        }
    }

    public final void c() {
        int i = this.s0;
        if (i == 0 && !this.B0 && !D0.b) {
            i = 4;
        }
        super.setVisibility(i);
        Drawable drawable = this.u0;
        if (drawable != null) {
            drawable.setVisible(getVisibility() == 0, false);
        }
    }

    public final boolean d() {
        if (!this.o) {
            return false;
        }
        l69 l69Var = this.a;
        l69Var.getClass();
        l69.b();
        l69.c();
        c fragmentManager = getFragmentManager();
        if (fragmentManager == null) {
            throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
        }
        l69Var.getClass();
        l69.b();
        if (l69.c().e().d()) {
            if (fragmentManager.D("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") != null) {
                Log.w("MediaRouteButton", "showDialog(): Route chooser dialog already showing!");
                return false;
            }
            this.d.getClass();
            MediaRouteChooserDialogFragment mediaRouteChooserDialogFragment = new MediaRouteChooserDialogFragment();
            d69 d69Var = this.c;
            if (d69Var == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            mediaRouteChooserDialogFragment.y0();
            if (!mediaRouteChooserDialogFragment.A1.equals(d69Var)) {
                mediaRouteChooserDialogFragment.A1 = d69Var;
                Bundle bundle = mediaRouteChooserDialogFragment.X;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBundle("selector", d69Var.a);
                mediaRouteChooserDialogFragment.n0(bundle);
                jo joVar = mediaRouteChooserDialogFragment.z1;
                if (joVar != null) {
                    if (mediaRouteChooserDialogFragment.y1) {
                        ((o59) joVar).g(d69Var);
                    } else {
                        ((x49) joVar).g(d69Var);
                    }
                }
            }
            ue0 ue0Var = new ue0(fragmentManager);
            ue0Var.f(0, mediaRouteChooserDialogFragment, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment", 1);
            ue0Var.d(true);
            return true;
        }
        if (fragmentManager.D("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") != null) {
            Log.w("MediaRouteButton", "showDialog(): Route controller dialog already showing!");
            return false;
        }
        this.d.getClass();
        MediaRouteControllerDialogFragment mediaRouteControllerDialogFragment = new MediaRouteControllerDialogFragment();
        d69 d69Var2 = this.c;
        if (d69Var2 == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (mediaRouteControllerDialogFragment.A1 == null) {
            Bundle bundle2 = mediaRouteControllerDialogFragment.X;
            if (bundle2 != null) {
                Bundle bundle3 = bundle2.getBundle("selector");
                d69 d69Var3 = null;
                if (bundle3 != null) {
                    d69Var3 = new d69(bundle3, null);
                } else {
                    d69 d69Var4 = d69.c;
                }
                mediaRouteControllerDialogFragment.A1 = d69Var3;
            }
            if (mediaRouteControllerDialogFragment.A1 == null) {
                mediaRouteControllerDialogFragment.A1 = d69.c;
            }
        }
        if (!mediaRouteControllerDialogFragment.A1.equals(d69Var2)) {
            mediaRouteControllerDialogFragment.A1 = d69Var2;
            Bundle bundle4 = mediaRouteControllerDialogFragment.X;
            if (bundle4 == null) {
                bundle4 = new Bundle();
            }
            bundle4.putBundle("selector", d69Var2.a);
            mediaRouteControllerDialogFragment.n0(bundle4);
            jo joVar2 = mediaRouteControllerDialogFragment.z1;
            if (joVar2 != null && mediaRouteControllerDialogFragment.y1) {
                ((x59) joVar2).i(d69Var2);
            }
        }
        ue0 ue0Var2 = new ue0(fragmentManager);
        ue0Var2.f(0, mediaRouteControllerDialogFragment, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment", 1);
        ue0Var2.d(true);
        return true;
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.u0 != null) {
            this.u0.setState(getDrawableState());
            if (this.u0.getCurrent() instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) this.u0.getCurrent();
                int i = this.x0;
                if (i == 1 || this.w0 != i) {
                    if (!animationDrawable.isRunning()) {
                        animationDrawable.start();
                    }
                } else if (i == 2 && !animationDrawable.isRunning()) {
                    animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
                }
            }
            invalidate();
        }
        this.w0 = this.x0;
    }

    public final void e() {
        int i = this.x0;
        String string = getContext().getString(i != 1 ? i != 2 ? j4d.mr_cast_button_disconnected : j4d.mr_cast_button_connected : j4d.mr_cast_button_connecting);
        setContentDescription(string);
        if (!this.C0 || TextUtils.isEmpty(string)) {
            string = null;
        }
        gcg.a(this, string);
    }

    public i59 getDialogFactory() {
        return this.d;
    }

    public d69 getRouteSelector() {
        return this.c;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.u0;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        this.o = true;
        if (!this.c.c()) {
            this.a.a(this.c, this.b, 0);
        }
        b();
        s49 s49Var = D0;
        ArrayList arrayList = s49Var.c;
        if (arrayList.size() == 0) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            s49Var.a.registerReceiver(s49Var, intentFilter);
        }
        arrayList.add(this);
    }

    @Override // android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.a != null) {
            int i2 = this.x0;
            if (i2 == 1) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, G0);
                return iArrOnCreateDrawableState;
            }
            if (i2 == 2) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, F0);
                return iArrOnCreateDrawableState;
            }
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.o = false;
            if (!this.c.c()) {
                this.a.f(this.b);
            }
            s49 s49Var = D0;
            ArrayList arrayList = s49Var.c;
            arrayList.remove(this);
            if (arrayList.size() == 0) {
                s49Var.a.unregisterReceiver(s49Var);
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.u0 != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            int intrinsicWidth = this.u0.getIntrinsicWidth();
            int intrinsicHeight = this.u0.getIntrinsicHeight();
            int i = (((width - paddingLeft) - intrinsicWidth) / 2) + paddingLeft;
            int i2 = (((height - paddingTop) - intrinsicHeight) / 2) + paddingTop;
            this.u0.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.u0.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingRight;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        Drawable drawable = this.u0;
        int paddingBottom = 0;
        if (drawable != null) {
            paddingRight = getPaddingRight() + getPaddingLeft() + drawable.getIntrinsicWidth();
        } else {
            paddingRight = 0;
        }
        int iMax = Math.max(this.z0, paddingRight);
        Drawable drawable2 = this.u0;
        if (drawable2 != null) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + drawable2.getIntrinsicHeight();
        }
        int iMax2 = Math.max(this.A0, paddingBottom);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, iMax);
        } else if (mode != 1073741824) {
            size = iMax;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, iMax2);
        } else if (mode2 != 1073741824) {
            size2 = iMax2;
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac A[RETURN] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean performClick() {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v49.performClick():boolean");
    }

    public void setAlwaysVisible(boolean z) {
        if (z != this.B0) {
            this.B0 = z;
            c();
            b();
        }
    }

    public void setCheatSheetEnabled(boolean z) {
        if (z != this.C0) {
            this.C0 = z;
            e();
        }
    }

    public void setDialogFactory(i59 i59Var) {
        if (i59Var == null) {
            throw new IllegalArgumentException("factory must not be null");
        }
        this.d = i59Var;
    }

    public void setRemoteIndicatorDrawable(Drawable drawable) {
        this.v0 = 0;
        setRemoteIndicatorDrawableInternal(drawable);
    }

    public void setRemoteIndicatorDrawableInternal(Drawable drawable) {
        u49 u49Var = this.t0;
        if (u49Var != null) {
            u49Var.cancel(false);
        }
        Drawable drawable2 = this.u0;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.u0);
        }
        if (drawable != null) {
            ColorStateList colorStateList = this.y0;
            if (colorStateList != null) {
                drawable = drawable.mutate();
                t35.h(drawable, colorStateList);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
        }
        this.u0 = drawable;
        refreshDrawableState();
    }

    public void setRouteSelector(d69 d69Var) {
        if (d69Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.c.equals(d69Var)) {
            return;
        }
        if (this.o) {
            boolean zC = this.c.c();
            t49 t49Var = this.b;
            l69 l69Var = this.a;
            if (!zC) {
                l69Var.f(t49Var);
            }
            if (!d69Var.c()) {
                l69Var.a(d69Var, t49Var, 0);
            }
        }
        this.c = d69Var;
        b();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        this.s0 = i;
        c();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.u0;
    }
}
