package com.yandex.div.core.view2.divs.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.yandex.div.core.InterfaceC37911f;
import com.yandex.div.core.view2.divs.C37931a;
import com.yandex.div2.DivPager;
import com.yandex.div2.K;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DivPagerView.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R*\u0010!\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R \u0010(\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R$\u0010.\u001a\u00020)2\u0006\u0010\u001a\u001a\u00020)8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0016\u00102\u001a\u0004\u0018\u00010/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/n;", "Lcom/yandex/div/core/widget/E;", "Lcom/yandex/div/core/view2/divs/widgets/e;", "Lcom/yandex/div/internal/widget/h;", "Lcom/yandex/div/internal/widget/s;", "LF21/b;", "Lcom/yandex/div/core/view2/divs/widgets/b;", "getDivBorderDrawer", "()Lcom/yandex/div/core/view2/divs/widgets/b;", "Lcom/yandex/div2/DivPager;", "c", "Lcom/yandex/div2/DivPager;", "getDiv$div_release", "()Lcom/yandex/div2/DivPager;", "setDiv$div_release", "(Lcom/yandex/div2/DivPager;)V", "div", "Lcom/yandex/div/internal/widget/g;", "d", "Lcom/yandex/div/internal/widget/g;", "getOnInterceptTouchEventListener", "()Lcom/yandex/div/internal/widget/g;", "setOnInterceptTouchEventListener", "(Lcom/yandex/div/internal/widget/g;)V", "onInterceptTouchEventListener", "", "value", "f", "Z", "j", "()Z", "setTransient", "(Z)V", "isTransient", "", "Lcom/yandex/div/core/f;", "g", "Ljava/util/List;", "getSubscriptions", "()Ljava/util/List;", "subscriptions", "", "getCurrentItem$div_release", "()I", "setCurrentItem$div_release", "(I)V", "currentItem", "Lcom/yandex/div2/K;", "getBorder", "()Lcom/yandex/div2/K;", "border", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class n extends com.yandex.div.core.widget.E implements InterfaceC38013e, com.yandex.div.internal.widget.h, com.yandex.div.internal.widget.s, F21.b {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public DivPager div;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public com.yandex.div.internal.widget.g onInterceptTouchEventListener;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public C38010b f368966e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean isTransient;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ArrayList f368968g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f368969h;

    public n(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f368968g = new ArrayList();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.InterfaceC38013e
    public final void c(@Y61.k com.yandex.div.json.expressions.e eVar, @Y61.l K k12) {
        this.f368966e = C37931a.U(this, k12, eVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(@Y61.k Canvas canvas) {
        C37931a.q(this, canvas);
        if (this.f368969h) {
            super.dispatchDraw(canvas);
            return;
        }
        C38010b c38010b = this.f368966e;
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
        this.f368969h = true;
        C38010b c38010b = this.f368966e;
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
        this.f368969h = false;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.InterfaceC38013e
    @Y61.l
    public K getBorder() {
        C38010b c38010b = this.f368966e;
        if (c38010b == null) {
            return null;
        }
        return c38010b.f368881e;
    }

    public int getCurrentItem$div_release() {
        return getViewPager().getCurrentItem();
    }

    @Y61.l
    /* renamed from: getDiv$div_release, reason: from getter */
    public DivPager getDiv() {
        return this.div;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.InterfaceC38013e
    @Y61.l
    /* renamed from: getDivBorderDrawer, reason: from getter */
    public C38010b getF368989C() {
        return this.f368966e;
    }

    @Y61.l
    public com.yandex.div.internal.widget.g getOnInterceptTouchEventListener() {
        return this.onInterceptTouchEventListener;
    }

    @Override // F21.b
    @Y61.k
    public List<InterfaceC37911f> getSubscriptions() {
        return this.f368968g;
    }

    @Override // com.yandex.div.internal.widget.s
    /* renamed from: j, reason: from getter */
    public final boolean getIsTransient() {
        return this.isTransient;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@Y61.k MotionEvent motionEvent) {
        com.yandex.div.internal.widget.g onInterceptTouchEventListener = getOnInterceptTouchEventListener();
        if (onInterceptTouchEventListener != null) {
            onInterceptTouchEventListener.a(this, motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i12, int i13, int i14, int i15) {
        super.onSizeChanged(i12, i13, i14, i15);
        C38010b c38010b = this.f368966e;
        if (c38010b == null) {
            return;
        }
        c38010b.m();
    }

    @Override // F21.b, com.yandex.div.core.view2.c0
    public final void release() {
        g();
        C38010b c38010b = this.f368966e;
        if (c38010b == null) {
            return;
        }
        c38010b.g();
    }

    public void setCurrentItem$div_release(int i12) {
        getViewPager().g(i12, false);
    }

    public void setDiv$div_release(@Y61.l DivPager divPager) {
        this.div = divPager;
    }

    public void setOnInterceptTouchEventListener(@Y61.l com.yandex.div.internal.widget.g gVar) {
        this.onInterceptTouchEventListener = gVar;
    }

    @Override // com.yandex.div.internal.widget.s
    public void setTransient(boolean z12) {
        this.isTransient = z12;
        invalidate();
    }
}
