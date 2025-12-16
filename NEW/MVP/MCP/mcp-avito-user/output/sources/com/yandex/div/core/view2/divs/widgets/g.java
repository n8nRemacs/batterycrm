package com.yandex.div.core.view2.divs.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.net.Uri;
import android.util.AttributeSet;
import com.yandex.div.core.InterfaceC37911f;
import com.yandex.div.core.view2.divs.C37931a;
import com.yandex.div2.K;
import com.yandex.div2.O1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DivGifImageView.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R*\u0010!\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R \u0010(\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010,\u001a\u0004\u0018\u00010)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/g;", "Lcom/yandex/div/core/widget/B;", "Lcom/yandex/div/core/view2/divs/widgets/e;", "Lcom/yandex/div/internal/widget/s;", "Lcom/yandex/div/core/widget/h;", "LF21/b;", "Lcom/yandex/div/core/view2/divs/widgets/b;", "getDivBorderDrawer", "()Lcom/yandex/div/core/view2/divs/widgets/b;", "Lcom/yandex/div2/O1;", "m", "Lcom/yandex/div2/O1;", "getDiv$div_release", "()Lcom/yandex/div2/O1;", "setDiv$div_release", "(Lcom/yandex/div2/O1;)V", "div", "Landroid/net/Uri;", "n", "Landroid/net/Uri;", "getGifUrl$div_release", "()Landroid/net/Uri;", "setGifUrl$div_release", "(Landroid/net/Uri;)V", "gifUrl", "", "value", "p", "Z", "j", "()Z", "setTransient", "(Z)V", "isTransient", "", "Lcom/yandex/div/core/f;", "q", "Ljava/util/List;", "getSubscriptions", "()Ljava/util/List;", "subscriptions", "Lcom/yandex/div2/K;", "getBorder", "()Lcom/yandex/div2/K;", "border", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class g extends com.yandex.div.core.widget.B implements InterfaceC38013e, com.yandex.div.internal.widget.s, com.yandex.div.core.widget.h, F21.b {

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public O1 div;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public Uri gifUrl;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public C38010b f368922o;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public boolean isTransient;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final ArrayList f368924q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f368925r;

    public g(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f368924q = new ArrayList();
        setCropToPadding(true);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.InterfaceC38013e
    public final void c(@Y61.k com.yandex.div.json.expressions.e eVar, @Y61.l K k12) {
        this.f368922o = C37931a.U(this, k12, eVar);
    }

    @Override // android.view.View
    public final void dispatchDraw(@Y61.k Canvas canvas) {
        if (this.f368925r) {
            super.dispatchDraw(canvas);
            return;
        }
        C38010b c38010b = this.f368922o;
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
        this.f368925r = true;
        C38010b c38010b = this.f368922o;
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
        this.f368925r = false;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.InterfaceC38013e
    @Y61.l
    public K getBorder() {
        C38010b c38010b = this.f368922o;
        if (c38010b == null) {
            return null;
        }
        return c38010b.f368881e;
    }

    @Y61.l
    /* renamed from: getDiv$div_release, reason: from getter */
    public final O1 getDiv() {
        return this.div;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.InterfaceC38013e
    @Y61.l
    /* renamed from: getDivBorderDrawer, reason: from getter */
    public C38010b getF368922o() {
        return this.f368922o;
    }

    @Y61.l
    /* renamed from: getGifUrl$div_release, reason: from getter */
    public final Uri getGifUrl() {
        return this.gifUrl;
    }

    @Override // F21.b
    @Y61.k
    public List<InterfaceC37911f> getSubscriptions() {
        return this.f368924q;
    }

    @Override // com.yandex.div.internal.widget.s
    /* renamed from: j, reason: from getter */
    public final boolean getIsTransient() {
        return this.isTransient;
    }

    @Override // com.yandex.div.internal.widget.AspectImageView, android.view.View
    public final void onSizeChanged(int i12, int i13, int i14, int i15) {
        super.onSizeChanged(i12, i13, i14, i15);
        C38010b c38010b = this.f368922o;
        if (c38010b == null) {
            return;
        }
        c38010b.m();
    }

    @Override // F21.b, com.yandex.div.core.view2.c0
    public final void release() {
        g();
        C38010b c38010b = this.f368922o;
        if (c38010b == null) {
            return;
        }
        c38010b.g();
    }

    public final void setDiv$div_release(@Y61.l O1 o12) {
        this.div = o12;
    }

    public final void setGifUrl$div_release(@Y61.l Uri uri) {
        this.gifUrl = uri;
    }

    @Override // com.yandex.div.internal.widget.s
    public void setTransient(boolean z12) {
        this.isTransient = z12;
        invalidate();
    }
}
