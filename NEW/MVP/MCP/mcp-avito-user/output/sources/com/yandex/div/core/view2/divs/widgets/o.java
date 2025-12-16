package com.yandex.div.core.view2.divs.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.yandex.div.core.InterfaceC37911f;
import com.yandex.div.core.view2.c0;
import com.yandex.div.core.view2.divs.C37931a;
import com.yandex.div.core.view2.divs.H2;
import com.yandex.div2.DivGallery;
import com.yandex.div2.K;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import x21.C49755a;

/* compiled from: DivRecyclerView.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010)\u001a\u0004\u0018\u00010\"8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R \u00100\u001a\b\u0012\u0004\u0012\u00020+0*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0016\u00104\u001a\u0004\u0018\u0001018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/o;", "Lx21/a;", "Lcom/yandex/div/core/view2/divs/widgets/e;", "Lcom/yandex/div/internal/widget/h;", "Lcom/yandex/div/internal/widget/s;", "LF21/b;", "Lcom/yandex/div/core/view2/divs/widgets/b;", "getDivBorderDrawer", "()Lcom/yandex/div/core/view2/divs/widgets/b;", "", "value", "H0", "Z", "j", "()Z", "setTransient", "(Z)V", "isTransient", "Lcom/yandex/div2/DivGallery;", "I0", "Lcom/yandex/div2/DivGallery;", "getDiv", "()Lcom/yandex/div2/DivGallery;", "setDiv", "(Lcom/yandex/div2/DivGallery;)V", "div", "Lcom/yandex/div/internal/widget/g;", "J0", "Lcom/yandex/div/internal/widget/g;", "getOnInterceptTouchEventListener", "()Lcom/yandex/div/internal/widget/g;", "setOnInterceptTouchEventListener", "(Lcom/yandex/div/internal/widget/g;)V", "onInterceptTouchEventListener", "Lcom/yandex/div/core/view2/divs/H2;", "K0", "Lcom/yandex/div/core/view2/divs/H2;", "getPagerSnapStartHelper", "()Lcom/yandex/div/core/view2/divs/H2;", "setPagerSnapStartHelper", "(Lcom/yandex/div/core/view2/divs/H2;)V", "pagerSnapStartHelper", "", "Lcom/yandex/div/core/f;", "L0", "Ljava/util/List;", "getSubscriptions", "()Ljava/util/List;", "subscriptions", "Lcom/yandex/div2/K;", "getBorder", "()Lcom/yandex/div2/K;", "border", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class o extends C49755a implements InterfaceC38013e, com.yandex.div.internal.widget.h, com.yandex.div.internal.widget.s, F21.b {

    /* renamed from: G0, reason: collision with root package name */
    @Y61.l
    public C38010b f368970G0;

    /* renamed from: H0, reason: collision with root package name and from kotlin metadata */
    public boolean isTransient;

    /* renamed from: I0, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public DivGallery div;

    /* renamed from: J0, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public com.yandex.div.internal.widget.g onInterceptTouchEventListener;

    /* renamed from: K0, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public H2 pagerSnapStartHelper;

    /* renamed from: L0, reason: collision with root package name */
    @Y61.k
    public final ArrayList f368975L0;

    /* renamed from: M0, reason: collision with root package name */
    public boolean f368976M0;

    public o(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f368975L0 = new ArrayList();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.InterfaceC38013e
    public final void c(@Y61.k com.yandex.div.json.expressions.e eVar, @Y61.l K k12) {
        this.f368970G0 = C37931a.U(this, k12, eVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(@Y61.k Canvas canvas) {
        C37931a.q(this, canvas);
        if (this.f368976M0) {
            super.dispatchDraw(canvas);
            return;
        }
        C38010b c38010b = this.f368970G0;
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

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(@Y61.k Canvas canvas) {
        this.f368976M0 = true;
        C38010b c38010b = this.f368970G0;
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
        this.f368976M0 = false;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.InterfaceC38013e
    @Y61.l
    public K getBorder() {
        C38010b c38010b = this.f368970G0;
        if (c38010b == null) {
            return null;
        }
        return c38010b.f368881e;
    }

    @Y61.l
    public DivGallery getDiv() {
        return this.div;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.InterfaceC38013e
    @Y61.l
    /* renamed from: getDivBorderDrawer, reason: from getter */
    public C38010b getF368989C() {
        return this.f368970G0;
    }

    @Y61.l
    public com.yandex.div.internal.widget.g getOnInterceptTouchEventListener() {
        return this.onInterceptTouchEventListener;
    }

    @Y61.l
    public H2 getPagerSnapStartHelper() {
        return this.pagerSnapStartHelper;
    }

    @Override // F21.b
    @Y61.k
    public List<InterfaceC37911f> getSubscriptions() {
        return this.f368975L0;
    }

    @Override // com.yandex.div.internal.widget.s
    /* renamed from: j, reason: from getter */
    public final boolean getIsTransient() {
        return this.isTransient;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@Y61.k MotionEvent motionEvent) {
        com.yandex.div.internal.widget.g onInterceptTouchEventListener = getOnInterceptTouchEventListener();
        if (onInterceptTouchEventListener != null) {
            onInterceptTouchEventListener.a(this, motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onSizeChanged(int i12, int i13, int i14, int i15) {
        super.onSizeChanged(i12, i13, i14, i15);
        C38010b c38010b = this.f368970G0;
        if (c38010b == null) {
            return;
        }
        c38010b.m();
    }

    @Override // F21.b, com.yandex.div.core.view2.c0
    public final void release() {
        g();
        C38010b c38010b = this.f368970G0;
        if (c38010b != null) {
            c38010b.g();
        }
        Object adapter = getAdapter();
        if (adapter instanceof c0) {
            ((c0) adapter).release();
        }
    }

    public void setDiv(@Y61.l DivGallery divGallery) {
        this.div = divGallery;
    }

    public void setOnInterceptTouchEventListener(@Y61.l com.yandex.div.internal.widget.g gVar) {
        this.onInterceptTouchEventListener = gVar;
    }

    public void setPagerSnapStartHelper(@Y61.l H2 h22) {
        this.pagerSnapStartHelper = h22;
    }

    @Override // com.yandex.div.internal.widget.s
    public void setTransient(boolean z12) {
        this.isTransient = z12;
        invalidate();
    }
}
