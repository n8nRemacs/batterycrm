package com.yandex.div.core.view2.divs.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.yandex.div.core.InterfaceC37911f;
import com.yandex.div.core.view2.divs.C37931a;
import com.yandex.div2.K;
import com.yandex.div2.T5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DivSliderView.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u0004\u0018\u00010 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/r;", "Lcom/yandex/div/internal/widget/slider/d;", "Lcom/yandex/div/core/view2/divs/widgets/e;", "Lcom/yandex/div/internal/widget/s;", "LF21/b;", "Lcom/yandex/div/core/view2/divs/widgets/b;", "getDivBorderDrawer", "()Lcom/yandex/div/core/view2/divs/widgets/b;", "Lcom/yandex/div2/T5;", "B", "Lcom/yandex/div2/T5;", "getDiv$div_release", "()Lcom/yandex/div2/T5;", "setDiv$div_release", "(Lcom/yandex/div2/T5;)V", "div", "", "value", "D", "Z", "j", "()Z", "setTransient", "(Z)V", "isTransient", "", "Lcom/yandex/div/core/f;", "E", "Ljava/util/List;", "getSubscriptions", "()Ljava/util/List;", "subscriptions", "Lcom/yandex/div2/K;", "getBorder", "()Lcom/yandex/div2/K;", "border", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class r extends com.yandex.div.internal.widget.slider.d implements InterfaceC38013e, com.yandex.div.internal.widget.s, F21.b {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public T5 div;

    /* renamed from: C, reason: collision with root package name */
    @Y61.l
    public C38010b f368989C;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public boolean isTransient;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final ArrayList f368991E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f368992F;

    public r(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f368991E = new ArrayList();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.InterfaceC38013e
    public final void c(@Y61.k com.yandex.div.json.expressions.e eVar, @Y61.l K k12) {
        this.f368989C = C37931a.U(this, k12, eVar);
    }

    @Override // android.view.View
    public final void dispatchDraw(@Y61.k Canvas canvas) {
        if (this.f368992F) {
            super.dispatchDraw(canvas);
            return;
        }
        C38010b c38010b = this.f368989C;
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
        this.f368992F = true;
        C38010b c38010b = this.f368989C;
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
        this.f368992F = false;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.InterfaceC38013e
    @Y61.l
    public K getBorder() {
        C38010b c38010b = this.f368989C;
        if (c38010b == null) {
            return null;
        }
        return c38010b.f368881e;
    }

    @Y61.l
    /* renamed from: getDiv$div_release, reason: from getter */
    public final T5 getDiv() {
        return this.div;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.InterfaceC38013e
    @Y61.l
    /* renamed from: getDivBorderDrawer, reason: from getter */
    public C38010b getF368928i() {
        return this.f368989C;
    }

    @Override // F21.b
    @Y61.k
    public List<InterfaceC37911f> getSubscriptions() {
        return this.f368991E;
    }

    @Override // com.yandex.div.internal.widget.s
    /* renamed from: j, reason: from getter */
    public final boolean getIsTransient() {
        return this.isTransient;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i12, int i13, int i14, int i15) {
        super.onSizeChanged(i12, i13, i14, i15);
        C38010b c38010b = this.f368989C;
        if (c38010b == null) {
            return;
        }
        c38010b.m();
    }

    @Override // F21.b, com.yandex.div.core.view2.c0
    public final void release() {
        g();
        C38010b c38010b = this.f368989C;
        if (c38010b == null) {
            return;
        }
        c38010b.g();
    }

    public final void setDiv$div_release(@Y61.l T5 t52) {
        this.div = t52;
    }

    @Override // com.yandex.div.internal.widget.s
    public void setTransient(boolean z12) {
        this.isTransient = z12;
        invalidate();
    }
}
