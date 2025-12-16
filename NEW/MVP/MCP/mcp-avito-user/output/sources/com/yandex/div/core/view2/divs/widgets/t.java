package com.yandex.div.core.view2.divs.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C22832m;
import com.yandex.div.core.InterfaceC37911f;
import com.yandex.div.core.view2.divs.C37931a;
import com.yandex.div2.AbstractC38330g;
import com.yandex.div2.C38404j6;
import com.yandex.div2.K;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: DivStateLayout.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001AJ\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010 \u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010(\u001a\u0004\u0018\u00010!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R*\u00101\u001a\u00020)2\u0006\u0010*\u001a\u00020)8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R \u00108\u001a\b\u0012\u0004\u0012\u000203028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0013\u0010<\u001a\u0004\u0018\u0001098F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0016\u0010@\u001a\u0004\u0018\u00010=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006B"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/t;", "Lcom/yandex/div/internal/widget/f;", "Lcom/yandex/div/core/view2/divs/widgets/e;", "LF21/b;", "Lcom/yandex/div/internal/widget/s;", "Lcom/yandex/div/core/view2/divs/widgets/b;", "getDivBorderDrawer", "()Lcom/yandex/div/core/view2/divs/widgets/b;", "Lcom/yandex/div/core/state/f;", "m", "Lcom/yandex/div/core/state/f;", "getPath", "()Lcom/yandex/div/core/state/f;", "setPath", "(Lcom/yandex/div/core/state/f;)V", "path", "Lkotlin/Function0;", "Lkotlin/G0;", "p", "LY41/a;", "getSwipeOutCallback", "()LY41/a;", "setSwipeOutCallback", "(LY41/a;)V", "swipeOutCallback", "Lcom/yandex/div2/j6;", "q", "Lcom/yandex/div2/j6;", "getDivState$div_release", "()Lcom/yandex/div2/j6;", "setDivState$div_release", "(Lcom/yandex/div2/j6;)V", "divState", "Lcom/yandex/div2/g;", "r", "Lcom/yandex/div2/g;", "getActiveStateDiv$div_release", "()Lcom/yandex/div2/g;", "setActiveStateDiv$div_release", "(Lcom/yandex/div2/g;)V", "activeStateDiv", "", "value", "s", "Z", "j", "()Z", "setTransient", "(Z)V", "isTransient", "", "Lcom/yandex/div/core/f;", "u", "Ljava/util/List;", "getSubscriptions", "()Ljava/util/List;", "subscriptions", "", "getStateId", "()Ljava/lang/String;", "stateId", "Lcom/yandex/div2/K;", "getBorder", "()Lcom/yandex/div2/K;", "border", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class t extends com.yandex.div.internal.widget.f implements InterfaceC38013e, F21.b, com.yandex.div.internal.widget.s {

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public com.yandex.div.core.state.f path;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final a f368995n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final C22832m f368996o;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public Y41.a<G0> swipeOutCallback;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public C38404j6 divState;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public AbstractC38330g activeStateDiv;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public boolean isTransient;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public C38010b f369001t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final ArrayList f369002u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f369003v;

    /* compiled from: DivStateLayout.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/t$a;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public final class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        public static boolean a(View view, float f12, float f13, int i12) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount() - 1;
                if (childCount >= 0) {
                    while (true) {
                        int i13 = childCount - 1;
                        View childAt = viewGroup.getChildAt(childCount);
                        if (f12 >= childAt.getLeft() && f12 < childAt.getRight() && f13 >= childAt.getTop() && f13 < childAt.getBottom() && a(childAt, f12 - childAt.getLeft(), f13 - childAt.getTop(), i12)) {
                            return true;
                        }
                        if (i13 < 0) {
                            break;
                        }
                        childCount = i13;
                    }
                }
            }
            return view.canScrollHorizontally(i12);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(@Y61.k MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(@Y61.k MotionEvent motionEvent, @Y61.k MotionEvent motionEvent2, float f12, float f13) {
            t tVar = t.this;
            View childAt = tVar.getChildCount() > 0 ? tVar.getChildAt(0) : null;
            if (childAt == null) {
                return false;
            }
            int iSignum = (int) Math.signum(f12);
            if (childAt.getTranslationX() == 0.0f) {
                if (Math.abs(f12) > Math.abs(f13) * 2 && a(childAt, motionEvent.getX(), motionEvent.getY(), iSignum)) {
                    return false;
                }
            }
            childAt.setTranslationX(M0.a.a(childAt.getTranslationX() - f12, -childAt.getWidth(), childAt.getWidth()));
            return !(childAt.getTranslationX() == 0.0f);
        }
    }

    public t(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        a aVar = new a();
        this.f368995n = aVar;
        this.f368996o = new C22832m(context, aVar, new Handler(Looper.getMainLooper()));
        this.f369002u = new ArrayList();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.InterfaceC38013e
    public final void c(@Y61.k com.yandex.div.json.expressions.e eVar, @Y61.l K k12) {
        this.f369001t = C37931a.U(this, k12, eVar);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i12) {
        if (super.canScrollHorizontally(i12)) {
            return true;
        }
        if (getChildCount() < 1 || this.swipeOutCallback == null) {
            return super.canScrollHorizontally(i12);
        }
        View childAt = getChildAt(0);
        if (i12 < 0) {
            if (childAt.getTranslationX() <= childAt.getWidth()) {
                return true;
            }
        } else if ((-childAt.getTranslationX()) <= childAt.getWidth()) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(@Y61.k Canvas canvas) {
        C37931a.q(this, canvas);
        if (this.f369003v) {
            super.dispatchDraw(canvas);
            return;
        }
        C38010b c38010b = this.f369001t;
        if (c38010b == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        try {
            c38010b.c(canvas);
            super.dispatchDraw(canvas);
            c38010b.d(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.View
    public final void draw(@Y61.k Canvas canvas) {
        this.f369003v = true;
        C38010b c38010b = this.f369001t;
        if (c38010b != null) {
            int iSave = canvas.save();
            try {
                c38010b.c(canvas);
                super.draw(canvas);
                c38010b.d(canvas);
            } finally {
                canvas.restoreToCount(iSave);
            }
        } else {
            super.draw(canvas);
        }
        this.f369003v = false;
    }

    @Y61.l
    /* renamed from: getActiveStateDiv$div_release, reason: from getter */
    public final AbstractC38330g getActiveStateDiv() {
        return this.activeStateDiv;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.InterfaceC38013e
    @Y61.l
    public K getBorder() {
        C38010b c38010b = this.f369001t;
        if (c38010b == null) {
            return null;
        }
        return c38010b.f368881e;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.InterfaceC38013e
    @Y61.l
    /* renamed from: getDivBorderDrawer, reason: from getter */
    public C38010b getF369001t() {
        return this.f369001t;
    }

    @Y61.l
    /* renamed from: getDivState$div_release, reason: from getter */
    public final C38404j6 getDivState() {
        return this.divState;
    }

    @Y61.l
    public final com.yandex.div.core.state.f getPath() {
        return this.path;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.l
    public final String getStateId() {
        com.yandex.div.core.state.f fVar = this.path;
        if (fVar == null) {
            return null;
        }
        List<Q<String, String>> list = fVar.f367663b;
        if (list.isEmpty()) {
            return null;
        }
        return (String) ((Q) C42745f0.Q(list)).f406620c;
    }

    @Override // F21.b
    @Y61.k
    public List<InterfaceC37911f> getSubscriptions() {
        return this.f369002u;
    }

    @Y61.l
    public final Y41.a<G0> getSwipeOutCallback() {
        return this.swipeOutCallback;
    }

    @Override // com.yandex.div.internal.widget.s
    /* renamed from: j, reason: from getter */
    public final boolean getIsTransient() {
        return this.isTransient;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@Y61.k MotionEvent motionEvent) {
        if (this.swipeOutCallback == null) {
            requestDisallowInterceptTouchEvent(false);
            return false;
        }
        this.f368996o.a(motionEvent);
        a aVar = this.f368995n;
        t tVar = t.this;
        View childAt = tVar.getChildCount() > 0 ? tVar.getChildAt(0) : null;
        requestDisallowInterceptTouchEvent(!((childAt == null ? 0.0f : childAt.getTranslationX()) == 0.0f));
        t tVar2 = t.this;
        View childAt2 = tVar2.getChildCount() > 0 ? tVar2.getChildAt(0) : null;
        if ((childAt2 == null ? 0.0f : childAt2.getTranslationX()) == 0.0f) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i12, int i13, int i14, int i15) {
        super.onSizeChanged(i12, i13, i14, i15);
        C38010b c38010b = this.f369001t;
        if (c38010b == null) {
            return;
        }
        c38010b.m();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(@Y61.k MotionEvent motionEvent) {
        float fAbs;
        s sVar;
        float fSignum;
        if (this.swipeOutCallback == null) {
            requestDisallowInterceptTouchEvent(false);
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            a aVar = this.f368995n;
            t tVar = t.this;
            View childAt = tVar.getChildCount() > 0 ? tVar.getChildAt(0) : null;
            if (childAt != null) {
                if (Math.abs(childAt.getTranslationX()) > childAt.getWidth() / 2) {
                    fAbs = (Math.abs(childAt.getWidth() - childAt.getTranslationX()) * 300.0f) / childAt.getWidth();
                    fSignum = Math.signum(childAt.getTranslationX()) * childAt.getWidth();
                    sVar = new s(t.this);
                } else {
                    fAbs = (Math.abs(childAt.getTranslationX()) * 300.0f) / childAt.getWidth();
                    sVar = null;
                    fSignum = 0.0f;
                }
                childAt.animate().cancel();
                childAt.animate().setDuration((long) M0.a.a(fAbs, 0.0f, 300.0f)).translationX(fSignum).setListener(sVar).start();
            }
        }
        if (this.f368996o.f45080a.onTouchEvent(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // F21.b, com.yandex.div.core.view2.c0
    public final void release() {
        g();
        C38010b c38010b = this.f369001t;
        if (c38010b == null) {
            return;
        }
        c38010b.g();
    }

    public final void setActiveStateDiv$div_release(@Y61.l AbstractC38330g abstractC38330g) {
        this.activeStateDiv = abstractC38330g;
    }

    public final void setDivState$div_release(@Y61.l C38404j6 c38404j6) {
        this.divState = c38404j6;
    }

    public final void setPath(@Y61.l com.yandex.div.core.state.f fVar) {
        this.path = fVar;
    }

    public final void setSwipeOutCallback(@Y61.l Y41.a<G0> aVar) {
        this.swipeOutCallback = aVar;
    }

    @Override // com.yandex.div.internal.widget.s
    public void setTransient(boolean z12) {
        this.isTransient = z12;
        invalidate();
    }
}
