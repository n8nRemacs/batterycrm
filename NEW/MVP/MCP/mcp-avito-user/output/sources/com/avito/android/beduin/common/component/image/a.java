package com.avito.android.beduin.common.component.image;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import com.avito.android.beduin.common.component.image.h;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinDraweeView.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/component/image/a;", "Lcom/facebook/drawee/view/SimpleDraweeView;", "", "radiiArray", "Lkotlin/G0;", "setCornerRadii", "([F)V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends SimpleDraweeView {

    /* renamed from: j, reason: collision with root package name */
    @k
    public final Path f101450j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public Paint f101451k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public h f101452l;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
        c(context, attributeSet);
        d(context, attributeSet);
        this.f101450j = new Path();
        this.f101452l = h.d.f101470a;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(@k Canvas canvas) {
        this.f101452l.a(canvas, getWidth(), getHeight());
        super.onDraw(canvas);
        h hVar = this.f101452l;
        getWidth();
        getHeight();
        hVar.b(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setCornerRadii(@Y61.l float[] r8) {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
            if (r8 == 0) goto L52
            int r2 = r8.length
            r3 = 1
            r4 = r3
        L7:
            if (r4 >= r2) goto L52
            r5 = r8[r0]
            r6 = r8[r4]
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L14
            int r4 = r4 + 1
            goto L7
        L14:
            com.avito.android.lib.util.v.a(r7, r1)
            com.avito.android.beduin.common.component.image.h r0 = r7.f101452l
            boolean r1 = r0 instanceof com.avito.android.beduin.common.component.image.h.c
            if (r1 == 0) goto L1e
            goto L3e
        L1e:
            com.avito.android.beduin.common.component.image.h$c r0 = new com.avito.android.beduin.common.component.image.h$c
            android.graphics.Paint r1 = r7.f101451k
            if (r1 != 0) goto L39
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>(r3)
            r2 = -1
            r1.setColor(r2)
            android.graphics.PorterDuffXfermode r2 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.DST_OUT
            r2.<init>(r3)
            r1.setXfermode(r2)
            r7.f101451k = r1
        L39:
            android.graphics.Path r2 = r7.f101450j
            r0.<init>(r2, r1)
        L3e:
            r7.f101452l = r0
            com.avito.android.beduin.common.component.image.h$c r0 = (com.avito.android.beduin.common.component.image.h.c) r0
            float[] r1 = r0.f101466c
            boolean r1 = java.util.Arrays.equals(r1, r8)
            if (r1 != 0) goto L6c
            android.graphics.Path r1 = r0.f101465b
            r1.reset()
            r0.f101466c = r8
            goto L6c
        L52:
            if (r8 == 0) goto L65
            int r2 = r8.length
            if (r2 != 0) goto L59
            r8 = 0
            goto L5f
        L59:
            r8 = r8[r0]
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
        L5f:
            if (r8 == 0) goto L65
            float r1 = r8.floatValue()
        L65:
            com.avito.android.lib.util.v.a(r7, r1)
            com.avito.android.beduin.common.component.image.h$d r8 = com.avito.android.beduin.common.component.image.h.d.f101470a
            r7.f101452l = r8
        L6c:
            r7.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.component.image.a.setCornerRadii(float[]):void");
    }
}
