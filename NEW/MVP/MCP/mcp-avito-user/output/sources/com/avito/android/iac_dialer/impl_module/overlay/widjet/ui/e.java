package com.avito.android.iac_dialer.impl_module.overlay.widjet.ui;

import Y41.p;
import Y61.k;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.app.m;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.overlay.widjet.ui.a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: IacDialerOverlayViewTouchListener.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/overlay/widjet/ui/e;", "Landroid/view/View$OnTouchListener;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Y41.a<Point> f166178b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final p<Integer, Integer, G0> f166179c;

    /* renamed from: d, reason: collision with root package name */
    public final int f166180d;

    /* renamed from: e, reason: collision with root package name */
    public int f166181e;

    /* renamed from: f, reason: collision with root package name */
    public int f166182f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public Point f166183g = new Point(0, 0);

    /* renamed from: h, reason: collision with root package name */
    public final int f166184h;

    /* renamed from: i, reason: collision with root package name */
    public int f166185i;

    /* renamed from: j, reason: collision with root package name */
    public int f166186j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f166187k;

    public e(@k m mVar, @k Y41.a aVar, @k p pVar, int i12, int i13) {
        this.f166178b = aVar;
        this.f166179c = pVar;
        this.f166180d = ViewConfiguration.get(mVar).getScaledTouchSlop();
        int i14 = (i12 - i13) / 2;
        this.f166184h = i14;
        this.f166185i = i14;
        this.f166186j = i14;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(@k View view, @k MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int i12 = this.f166184h;
        if (action == 0) {
            this.f166181e = (int) motionEvent.getRawX();
            this.f166182f = (int) motionEvent.getRawY();
            Point point = (Point) ((a.C4926a) this.f166178b).invoke();
            this.f166183g = point;
            int i13 = point.x;
            this.f166185i = i12 + i13;
            this.f166186j = i12 - i13;
            this.f166187k = false;
        } else if (action != 1) {
            if (action == 2) {
                float rawX = motionEvent.getRawX() - this.f166181e;
                float rawY = motionEvent.getRawY() - this.f166182f;
                if (this.f166187k || ((float) Math.hypot(rawX, rawY)) > this.f166180d) {
                    this.f166187k = true;
                    int rawX2 = (int) (motionEvent.getRawX() - this.f166181e);
                    if (rawX2 < 0 && Math.abs(rawX2) > this.f166185i) {
                        i12 = -i12;
                    } else if (rawX2 <= 0 || Math.abs(rawX2) <= this.f166186j) {
                        i12 = this.f166183g.x + rawX2;
                    }
                    ((a.b) this.f166179c).invoke(Integer.valueOf(i12), Integer.valueOf(this.f166183g.y + ((int) rawY)));
                }
            }
        } else if (!this.f166187k) {
            view.performClick();
        }
        return true;
    }
}
