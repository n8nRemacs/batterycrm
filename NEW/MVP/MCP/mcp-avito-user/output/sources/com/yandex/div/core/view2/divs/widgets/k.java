package com.yandex.div.core.view2.divs.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Spanned;
import android.util.AttributeSet;
import com.avito.android.R;
import com.yandex.div.core.InterfaceC37911f;
import com.yandex.div.core.view2.divs.C37931a;
import com.yandex.div.core.widget.C38045a;
import com.yandex.div2.C38269b7;
import com.yandex.div2.K;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DivLineHeightTextView.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010 \u001a\u0004\u0018\u00010\u00198\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R*\u00101\u001a\u00020)2\u0006\u0010*\u001a\u00020)8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R \u00108\u001a\b\u0012\u0004\u0012\u000203028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0016\u0010<\u001a\u0004\u0018\u0001098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/k;", "Lcom/yandex/div/internal/widget/r;", "Lcom/yandex/div/core/view2/divs/widgets/a;", "Lcom/yandex/div/core/view2/divs/widgets/e;", "Lcom/yandex/div/internal/widget/s;", "LF21/b;", "Lcom/yandex/div/core/view2/divs/widgets/b;", "getDivBorderDrawer", "()Lcom/yandex/div/core/view2/divs/widgets/b;", "Lcom/yandex/div2/b7;", "q", "Lcom/yandex/div2/b7;", "getDiv$div_release", "()Lcom/yandex/div2/b7;", "setDiv$div_release", "(Lcom/yandex/div2/b7;)V", "div", "Lcom/yandex/div/core/widget/a;", "r", "Lcom/yandex/div/core/widget/a;", "getAdaptiveMaxLines$div_release", "()Lcom/yandex/div/core/widget/a;", "setAdaptiveMaxLines$div_release", "(Lcom/yandex/div/core/widget/a;)V", "adaptiveMaxLines", "Lcom/yandex/div/core/util/text/b;", "s", "Lcom/yandex/div/core/util/text/b;", "getTextRoundedBgHelper$div_release", "()Lcom/yandex/div/core/util/text/b;", "setTextRoundedBgHelper$div_release", "(Lcom/yandex/div/core/util/text/b;)V", "textRoundedBgHelper", "", "t", "J", "getAnimationStartDelay$div_release", "()J", "setAnimationStartDelay$div_release", "(J)V", "animationStartDelay", "", "value", "v", "Z", "j", "()Z", "setTransient", "(Z)V", "isTransient", "", "Lcom/yandex/div/core/f;", "w", "Ljava/util/List;", "getSubscriptions", "()Ljava/util/List;", "subscriptions", "Lcom/yandex/div2/K;", "getBorder", "()Lcom/yandex/div2/K;", "border", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class k extends com.yandex.div.internal.widget.r implements InterfaceC38009a, InterfaceC38013e, com.yandex.div.internal.widget.s, F21.b {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public C38269b7 div;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public C38045a adaptiveMaxLines;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public com.yandex.div.core.util.text.b textRoundedBgHelper;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public long animationStartDelay;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public C38010b f368950u;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public boolean isTransient;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final ArrayList f368952w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f368953x;

    public k(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R.attr.divTextStyle : i12);
        this.f368952w = new ArrayList();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.InterfaceC38013e
    public final void c(@Y61.k com.yandex.div.json.expressions.e eVar, @Y61.l K k12) {
        this.f368950u = C37931a.U(this, k12, eVar);
    }

    @Override // android.view.View
    public final void dispatchDraw(@Y61.k Canvas canvas) {
        if (this.f368953x) {
            super.dispatchDraw(canvas);
            return;
        }
        C38010b c38010b = this.f368950u;
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
        this.f368953x = true;
        C38010b c38010b = this.f368950u;
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
        this.f368953x = false;
    }

    @Y61.l
    /* renamed from: getAdaptiveMaxLines$div_release, reason: from getter */
    public C38045a getAdaptiveMaxLines() {
        return this.adaptiveMaxLines;
    }

    /* renamed from: getAnimationStartDelay$div_release, reason: from getter */
    public long getAnimationStartDelay() {
        return this.animationStartDelay;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.InterfaceC38013e
    @Y61.l
    public K getBorder() {
        C38010b c38010b = this.f368950u;
        if (c38010b == null) {
            return null;
        }
        return c38010b.f368881e;
    }

    @Y61.l
    /* renamed from: getDiv$div_release, reason: from getter */
    public C38269b7 getDiv() {
        return this.div;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.InterfaceC38013e
    @Y61.l
    /* renamed from: getDivBorderDrawer, reason: from getter */
    public C38010b getF368950u() {
        return this.f368950u;
    }

    @Override // F21.b
    @Y61.k
    public List<InterfaceC37911f> getSubscriptions() {
        return this.f368952w;
    }

    @Y61.l
    /* renamed from: getTextRoundedBgHelper$div_release, reason: from getter */
    public com.yandex.div.core.util.text.b getTextRoundedBgHelper() {
        return this.textRoundedBgHelper;
    }

    @Override // com.yandex.div.internal.widget.s
    /* renamed from: j, reason: from getter */
    public final boolean getIsTransient() {
        return this.isTransient;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(@Y61.k Canvas canvas) {
        com.yandex.div.core.util.text.b textRoundedBgHelper;
        if ((getText() instanceof Spanned) && getLayout() != null && (textRoundedBgHelper = getTextRoundedBgHelper()) != null && (!textRoundedBgHelper.f367834c.isEmpty())) {
            float totalPaddingLeft = getTotalPaddingLeft();
            float totalPaddingTop = getTotalPaddingTop();
            int iSave = canvas.save();
            canvas.translate(totalPaddingLeft, totalPaddingTop);
            try {
                com.yandex.div.core.util.text.b textRoundedBgHelper2 = getTextRoundedBgHelper();
                if (textRoundedBgHelper2 != null) {
                    textRoundedBgHelper2.a(canvas, (Spanned) getText(), getLayout());
                }
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
        super.onDraw(canvas);
    }

    @Override // com.yandex.div.internal.widget.e, android.view.View
    public final void onSizeChanged(int i12, int i13, int i14, int i15) {
        super.onSizeChanged(i12, i13, i14, i15);
        C38010b c38010b = this.f368950u;
        if (c38010b == null) {
            return;
        }
        c38010b.m();
    }

    @Override // F21.b, com.yandex.div.core.view2.c0
    public final void release() {
        g();
        C38010b c38010b = this.f368950u;
        if (c38010b == null) {
            return;
        }
        c38010b.g();
    }

    public void setAdaptiveMaxLines$div_release(@Y61.l C38045a c38045a) {
        this.adaptiveMaxLines = c38045a;
    }

    public void setAnimationStartDelay$div_release(long j12) {
        this.animationStartDelay = j12;
    }

    public void setDiv$div_release(@Y61.l C38269b7 c38269b7) {
        this.div = c38269b7;
    }

    public void setTextRoundedBgHelper$div_release(@Y61.l com.yandex.div.core.util.text.b bVar) {
        this.textRoundedBgHelper = bVar;
    }

    @Override // com.yandex.div.internal.widget.s
    public void setTransient(boolean z12) {
        this.isTransient = z12;
        invalidate();
    }
}
