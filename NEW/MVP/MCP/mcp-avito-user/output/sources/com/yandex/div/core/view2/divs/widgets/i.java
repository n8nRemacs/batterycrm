package com.yandex.div.core.view2.divs.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.net.Uri;
import android.util.AttributeSet;
import com.avito.android.R;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggest;
import com.yandex.div.core.InterfaceC37911f;
import com.yandex.div.core.view2.divs.C37931a;
import com.yandex.div2.C38577v2;
import com.yandex.div2.K;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DivImageView.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\rR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010'\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010.\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\rR \u00105\u001a\b\u0012\u0004\u0012\u0002000/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0016\u00109\u001a\u0004\u0018\u0001068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/i;", "Lcom/yandex/div/core/widget/B;", "Lcom/yandex/div/core/view2/divs/widgets/e;", "Lcom/yandex/div/internal/widget/s;", "Lu21/d;", "LF21/b;", "Lcom/yandex/div/core/view2/divs/widgets/b;", "getDivBorderDrawer", "()Lcom/yandex/div/core/view2/divs/widgets/b;", "", "adjustViewBounds", "Lkotlin/G0;", "setAdjustViewBounds", "(Z)V", "cropToPadding", "setCropToPadding", "Lcom/yandex/div2/v2;", "m", "Lcom/yandex/div2/v2;", "getDiv$div_release", "()Lcom/yandex/div2/v2;", "setDiv$div_release", "(Lcom/yandex/div2/v2;)V", "div", "Landroid/net/Uri;", "n", "Landroid/net/Uri;", "getImageUrl$div_release", "()Landroid/net/Uri;", "setImageUrl$div_release", "(Landroid/net/Uri;)V", "imageUrl", "", "o", "Ljava/lang/String;", "getPreview$div_release", "()Ljava/lang/String;", "setPreview$div_release", "(Ljava/lang/String;)V", MessageSuggest.PREVIEW, "value", "q", "Z", "j", "()Z", "setTransient", "isTransient", "", "Lcom/yandex/div/core/f;", "r", "Ljava/util/List;", "getSubscriptions", "()Ljava/util/List;", "subscriptions", "Lcom/yandex/div2/K;", "getBorder", "()Lcom/yandex/div2/K;", "border", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class i extends com.yandex.div.core.widget.B implements InterfaceC38013e, com.yandex.div.internal.widget.s, u21.d, F21.b {

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public C38577v2 div;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public Uri imageUrl;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public String preview;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public C38010b f368935p;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public boolean isTransient;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final ArrayList f368937r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f368938s;

    public i(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R.attr.divImageStyle : i12);
        this.f368937r = new ArrayList();
        super.setAdjustViewBounds(true);
        super.setCropToPadding(true);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.InterfaceC38013e
    public final void c(@Y61.k com.yandex.div.json.expressions.e eVar, @Y61.l K k12) {
        this.f368935p = C37931a.U(this, k12, eVar);
    }

    @Override // android.view.View
    public final void dispatchDraw(@Y61.k Canvas canvas) {
        if (this.f368938s) {
            super.dispatchDraw(canvas);
            return;
        }
        C38010b c38010b = this.f368935p;
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
        this.f368938s = true;
        C38010b c38010b = this.f368935p;
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
        this.f368938s = false;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.InterfaceC38013e
    @Y61.l
    public K getBorder() {
        C38010b c38010b = this.f368935p;
        if (c38010b == null) {
            return null;
        }
        return c38010b.f368881e;
    }

    @Y61.l
    /* renamed from: getDiv$div_release, reason: from getter */
    public final C38577v2 getDiv() {
        return this.div;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.InterfaceC38013e
    @Y61.l
    /* renamed from: getDivBorderDrawer, reason: from getter */
    public C38010b getF368940g() {
        return this.f368935p;
    }

    @Y61.l
    /* renamed from: getImageUrl$div_release, reason: from getter */
    public final Uri getImageUrl() {
        return this.imageUrl;
    }

    @Y61.l
    /* renamed from: getPreview$div_release, reason: from getter */
    public final String getPreview() {
        return this.preview;
    }

    @Override // F21.b
    @Y61.k
    public List<InterfaceC37911f> getSubscriptions() {
        return this.f368937r;
    }

    @Override // com.yandex.div.internal.widget.s
    /* renamed from: j, reason: from getter */
    public final boolean getIsTransient() {
        return this.isTransient;
    }

    @Override // com.yandex.div.internal.widget.AspectImageView
    public final boolean k(int i12) {
        return false;
    }

    @Override // com.yandex.div.internal.widget.AspectImageView, android.view.View
    public final void onSizeChanged(int i12, int i13, int i14, int i15) {
        super.onSizeChanged(i12, i13, i14, i15);
        C38010b c38010b = this.f368935p;
        if (c38010b == null) {
            return;
        }
        c38010b.m();
    }

    @Override // F21.b, com.yandex.div.core.view2.c0
    public final void release() {
        g();
        C38010b c38010b = this.f368935p;
        if (c38010b == null) {
            return;
        }
        c38010b.g();
    }

    public final void setDiv$div_release(@Y61.l C38577v2 c38577v2) {
        this.div = c38577v2;
    }

    public final void setImageUrl$div_release(@Y61.l Uri uri) {
        this.imageUrl = uri;
    }

    public final void setPreview$div_release(@Y61.l String str) {
        this.preview = str;
    }

    @Override // com.yandex.div.internal.widget.s
    public void setTransient(boolean z12) {
        this.isTransient = z12;
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean adjustViewBounds) {
    }

    @Override // android.widget.ImageView
    public void setCropToPadding(boolean cropToPadding) {
    }
}
