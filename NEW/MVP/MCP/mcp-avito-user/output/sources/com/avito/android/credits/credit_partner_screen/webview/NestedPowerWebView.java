package com.avito.android.credits.credit_partner_screen.webview;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.core.view.G;
import androidx.core.view.H;
import com.yatatsu.powerwebview.PowerWebView;
import kotlin.Metadata;

/* compiled from: NestedPowerWebView.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/credits/credit_partner_screen/webview/NestedPowerWebView;", "Lcom/yatatsu/powerwebview/PowerWebView;", "Landroidx/core/view/G;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "enabled", "Lkotlin/G0;", "setNestedScrollingEnabled", "(Z)V", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NestedPowerWebView extends PowerWebView implements G {

    /* renamed from: k, reason: collision with root package name */
    @k
    public final int[] f128840k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final int[] f128841l;

    /* renamed from: m, reason: collision with root package name */
    public int f128842m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final H f128843n;

    /* renamed from: o, reason: collision with root package name */
    public int f128844o;

    public NestedPowerWebView(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f128840k = new int[2];
        this.f128841l = new int[2];
        this.f128843n = new H(this);
        setNestedScrollingEnabled(true);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f12, float f13, boolean z12) {
        return this.f128843n.a(f12, f13, z12);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f12, float f13) {
        return this.f128843n.b(f12, f13);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i12, int i13, @l int[] iArr, @l int[] iArr2) {
        return this.f128843n.c(i12, i13, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i12, int i13, int i14, int i15, @l int[] iArr) {
        return this.f128843n.d(i12, i13, i14, i15, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f128843n.f(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f128843n.f44937d;
    }

    @Override // com.yatatsu.powerwebview.PowerWebView, android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(@l MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int action = motionEventObtain.getAction();
        if (action == 0) {
            this.f128842m = 0;
        }
        int y12 = (int) motionEventObtain.getY();
        motionEventObtain.offsetLocation(0.0f, this.f128842m);
        if (action == 0) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEventObtain);
            this.f128844o = y12;
            startNestedScroll(2);
            return zOnTouchEvent;
        }
        if (action != 1) {
            if (action == 2) {
                int i12 = this.f128844o - y12;
                int[] iArr = this.f128841l;
                int[] iArr2 = this.f128840k;
                if (dispatchNestedPreScroll(0, i12, iArr, iArr2)) {
                    i12 -= iArr[1];
                    this.f128844o = y12 - iArr2[1];
                    motionEventObtain.offsetLocation(0.0f, -r1);
                    this.f128842m = iArr2[1];
                }
                boolean zOnTouchEvent2 = super.onTouchEvent(motionEventObtain);
                if (!dispatchNestedScroll(0, iArr[1], 0, i12, this.f128840k)) {
                    return zOnTouchEvent2;
                }
                motionEventObtain.offsetLocation(0.0f, iArr2[1]);
                this.f128842m = iArr2[1];
                this.f128844o -= i12;
                return zOnTouchEvent2;
            }
            if (action != 3) {
                return false;
            }
        }
        boolean zOnTouchEvent3 = super.onTouchEvent(motionEventObtain);
        stopNestedScroll();
        return zOnTouchEvent3;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean enabled) {
        this.f128843n.g(enabled);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i12) {
        return this.f128843n.h(i12, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f128843n.i(0);
    }
}
