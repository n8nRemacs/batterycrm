package com.avito.android.lib.design.list_item.layout;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.avito.android.util.p6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AlignmentFrameLayout.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/avito/android/lib/design/list_item/layout/AlignmentFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "b", "c", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AlignmentFrameLayout extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public int f179578b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public a f179579c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public a f179580d;

    /* compiled from: AlignmentFrameLayout.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b¦\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/list_item/layout/AlignmentFrameLayout$a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public abstract class a {
        public a() {
        }

        public final void a(int i12, int i13, int i14, int i15) {
            p6 p6Var = new p6(AlignmentFrameLayout.this);
            while (p6Var.hasNext()) {
                View view = (View) p6Var.next();
                if (view.getVisibility() != 8) {
                    b(view, i12, i13, i14, i15);
                }
            }
        }

        public abstract void b(@k View view, int i12, int i13, int i14, int i15);
    }

    /* compiled from: AlignmentFrameLayout.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/list_item/layout/AlignmentFrameLayout$c;", "Lcom/avito/android/lib/design/list_item/layout/AlignmentFrameLayout$a;", "Lcom/avito/android/lib/design/list_item/layout/AlignmentFrameLayout;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class c extends a {

        /* renamed from: b, reason: collision with root package name */
        public final int f179584b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AlignmentFrameLayout f179585c;

        public c() {
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AlignmentFrameLayout alignmentFrameLayout, int i12, int i13, C42822w c42822w) {
            super();
            i12 = (i13 & 1) != 0 ? 0 : i12;
            this.f179585c = alignmentFrameLayout;
            this.f179584b = i12;
        }

        @Override // com.avito.android.lib.design.list_item.layout.AlignmentFrameLayout.a
        public final void b(@k View view, int i12, int i13, int i14, int i15) {
            int width;
            int i16;
            int i17;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            AlignmentFrameLayout alignmentFrameLayout = this.f179585c;
            int paddingLeft = alignmentFrameLayout.getPaddingLeft();
            int paddingRight = (i14 - i12) - alignmentFrameLayout.getPaddingRight();
            int paddingTop = alignmentFrameLayout.getPaddingTop();
            int measuredHeight = view.getMeasuredHeight();
            int measuredWidth = view.getMeasuredWidth();
            int i18 = layoutParams.gravity & 7;
            if (i18 == 1) {
                width = (((paddingRight - paddingLeft) - alignmentFrameLayout.getWidth()) / 2) + paddingLeft + layoutParams.leftMargin;
                i16 = layoutParams.rightMargin;
            } else {
                if (i18 != 5 && i18 != 8388613) {
                    i17 = paddingLeft + layoutParams.leftMargin;
                    int i19 = paddingTop + this.f179584b;
                    view.layout(i17, i19, measuredWidth + i17, measuredHeight + i19);
                }
                width = paddingRight - measuredWidth;
                i16 = layoutParams.rightMargin;
            }
            i17 = width - i16;
            int i192 = paddingTop + this.f179584b;
            view.layout(i17, i192, measuredWidth + i17, measuredHeight + i192);
        }
    }

    public AlignmentFrameLayout(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
        float f12 = 0.0f;
        int i12 = 1;
        C42822w c42822w = null;
        this.f179579c = new b(this, f12, i12, c42822w);
        this.f179580d = new b(this, f12, i12, c42822w);
    }

    public static void a(AlignmentFrameLayout alignmentFrameLayout, a aVar, a aVar2, int i12, int i13) {
        if ((i13 & 1) != 0) {
            aVar = alignmentFrameLayout.f179579c;
        }
        if ((i13 & 2) != 0) {
            aVar2 = alignmentFrameLayout.f179580d;
        }
        if ((i13 & 4) != 0) {
            i12 = alignmentFrameLayout.f179578b;
        }
        alignmentFrameLayout.f179579c = aVar;
        alignmentFrameLayout.f179580d = aVar2;
        alignmentFrameLayout.f179578b = i12;
        alignmentFrameLayout.requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        if (getMeasuredHeight() < this.f179578b) {
            this.f179579c.a(i12, i13, i14, i15);
        } else {
            this.f179580d.a(i12, i13, i14, i15);
        }
    }

    /* compiled from: AlignmentFrameLayout.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/list_item/layout/AlignmentFrameLayout$b;", "Lcom/avito/android/lib/design/list_item/layout/AlignmentFrameLayout$a;", "Lcom/avito/android/lib/design/list_item/layout/AlignmentFrameLayout;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b extends a {

        /* renamed from: b, reason: collision with root package name */
        public final float f179582b;

        public b(float f12) {
            super();
            this.f179582b = f12;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
        @Override // com.avito.android.lib.design.list_item.layout.AlignmentFrameLayout.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(@Y61.k android.view.View r8, int r9, int r10, int r11, int r12) {
            /*
                r7 = this;
                android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
                android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
                com.avito.android.lib.design.list_item.layout.AlignmentFrameLayout r1 = com.avito.android.lib.design.list_item.layout.AlignmentFrameLayout.this
                int r2 = r1.getPaddingLeft()
                float r2 = (float) r2
                int r11 = r11 - r9
                int r9 = r1.getPaddingRight()
                int r11 = r11 - r9
                int r9 = r1.getPaddingTop()
                float r9 = (float) r9
                int r12 = r12 - r10
                int r10 = r1.getPaddingBottom()
                int r12 = r12 - r10
                int r10 = r8.getMeasuredHeight()
                float r10 = (float) r10
                int r3 = r8.getMeasuredWidth()
                float r3 = (float) r3
                int r4 = r0.gravity
                r4 = r4 & 7
                r5 = 1
                r6 = 2
                if (r4 == r5) goto L45
                r1 = 5
                if (r4 == r1) goto L3d
                r1 = 8388613(0x800005, float:1.175495E-38)
                if (r4 == r1) goto L3d
                int r11 = r0.leftMargin
                float r11 = (float) r11
                float r2 = r2 + r11
                goto L57
            L3d:
                float r11 = (float) r11
                float r11 = r11 - r3
                int r1 = r0.rightMargin
            L41:
                float r1 = (float) r1
                float r2 = r11 - r1
                goto L57
            L45:
                float r11 = (float) r11
                float r11 = r11 - r2
                int r1 = r1.getWidth()
                float r1 = (float) r1
                float r11 = r11 - r1
                float r1 = (float) r6
                float r11 = r11 / r1
                float r11 = r11 + r2
                int r1 = r0.leftMargin
                float r1 = (float) r1
                float r11 = r11 + r1
                int r1 = r0.rightMargin
                goto L41
            L57:
                float r11 = r7.f179582b
                r1 = 0
                int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
                if (r1 >= 0) goto L6d
                float r11 = (float) r12
                float r11 = r11 - r9
                float r11 = r11 - r10
                float r12 = (float) r6
                float r11 = r11 / r12
                float r11 = r11 + r9
                int r9 = r0.topMargin
                float r9 = (float) r9
                float r11 = r11 + r9
                int r9 = r0.bottomMargin
                float r9 = (float) r9
                float r11 = r11 - r9
                goto L73
            L6d:
                float r9 = r9 + r11
                float r11 = (float) r6
                float r11 = r10 / r11
                float r11 = r9 - r11
            L73:
                int r9 = (int) r2
                int r12 = (int) r11
                float r2 = r2 + r3
                int r0 = (int) r2
                float r11 = r11 + r10
                int r10 = (int) r11
                r8.layout(r9, r12, r0, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.list_item.layout.AlignmentFrameLayout.b.b(android.view.View, int, int, int, int):void");
        }

        public /* synthetic */ b(AlignmentFrameLayout alignmentFrameLayout, float f12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? -1.0f : f12);
        }
    }
}
