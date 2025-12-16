package com.avito.android.lib.design.tooltip;

import KV.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.lib.design.tooltip.state.TooltipState;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import j.k0;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: TooltipContainer.kt */
@s0
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u00019J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u000bR$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010-\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010$\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R0\u00108\u001a\u00020.2\u0006\u0010/\u001a\u00020.8\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\b0\u00101\u0012\u0004\b6\u00107\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u0006:"}, d2 = {"Lcom/avito/android/lib/design/tooltip/n;", "Landroid/widget/FrameLayout;", "LLV/d;", "LKV/a;", "Landroid/view/View;", "anchor", "Lkotlin/G0;", "setAnchorView", "(Landroid/view/View;)V", "newStyle", "setStyle", "(LKV/a;)V", "b", "LKV/a;", "getStyle$_design_modules_components", "()LKV/a;", "setStyle$_design_modules_components", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/lib/design/tooltip/state/TooltipState;", "c", "Lcom/avito/android/lib/design/tooltip/state/TooltipState;", "getState$_design_modules_components", "()Lcom/avito/android/lib/design/tooltip/state/TooltipState;", "setState$_design_modules_components", "(Lcom/avito/android/lib/design/tooltip/state/TooltipState;)V", VoiceInfo.STATE, "", "m", "Z", "getShowTail$_design_modules_components", "()Z", "setShowTail$_design_modules_components", "(Z)V", "showTail", "", "q", "I", "getMaxHeight$_design_modules_components", "()I", "setMaxHeight$_design_modules_components", "(I)V", "maxHeight", "s", "getMaxWidth$_design_modules_components", "setMaxWidth$_design_modules_components", "maxWidth", "Lcom/avito/android/lib/design/tooltip/q;", "value", "t", "Lcom/avito/android/lib/design/tooltip/q;", "getTooltipPosition", "()Lcom/avito/android/lib/design/tooltip/q;", "setTooltipPosition", "(Lcom/avito/android/lib/design/tooltip/q;)V", "getTooltipPosition$annotations", "()V", "tooltipPosition", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"CustomViewStyleable"})
/* loaded from: classes14.dex */
public final class n extends FrameLayout implements LV.d<KV.a> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public KV.a style;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public TooltipState state;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.design.button.c f181236d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Rect f181237e;

    /* renamed from: f, reason: collision with root package name */
    public float f181238f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public ColorStateList f181239g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public com.google.android.material.shape.q f181240h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public ColorStateList f181241i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public com.google.android.material.shape.q f181242j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public com.google.android.material.shape.k f181243k;

    /* renamed from: l, reason: collision with root package name */
    public int f181244l;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean showTail;

    /* renamed from: n, reason: collision with root package name */
    public int f181246n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public WeakReference<View> f181247o;

    /* renamed from: p, reason: collision with root package name */
    public int f181248p;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public int maxHeight;

    /* renamed from: r, reason: collision with root package name */
    public int f181250r;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public int maxWidth;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public q tooltipPosition;

    /* compiled from: TooltipContainer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/lib/design/tooltip/n$a;", "", "<init>", "()V", "", "ROTATION_TAIL_BOTTOM", "F", "ROTATION_TAIL_LEFT", "ROTATION_TAIL_RIGHT", "ROTATION_TAIL_TOP", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public /* synthetic */ n(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.tooltip : i12, (i14 & 8) != 0 ? R.style.Design_Widget_Tooltip : i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r8 = this;
            com.google.android.material.shape.q r0 = r8.f181242j
            if (r0 == 0) goto L10
            com.google.android.material.shape.k r1 = new com.google.android.material.shape.k
            r1.<init>(r0)
            android.content.res.ColorStateList r0 = r8.f181241i
            r1.n(r0)
            r8.f181243k = r1
        L10:
            boolean r0 = r8.showTail
            if (r0 == 0) goto L1a
            int r0 = r8.f181244l
            int r1 = r8.f181246n
            int r0 = r0 + r1
            goto L4a
        L1a:
            KV.a r0 = r8.style
            if (r0 == 0) goto L49
            VU.c r0 = r0.f9483s
            if (r0 == 0) goto L49
            boolean r1 = r0.f17168a
            if (r1 == 0) goto L27
            goto L28
        L27:
            r0 = 0
        L28:
            if (r0 == 0) goto L49
            VU.d r1 = r0.f17169b
            int r2 = r1.f17176d
            int r3 = r1.f17173a
            int r1 = r1.f17174b
            int r1 = java.lang.Math.max(r3, r1)
            int r1 = r1 + r2
            VU.d r0 = r0.f17170c
            int r2 = r0.f17176d
            int r3 = r0.f17173a
            int r0 = r0.f17174b
            int r0 = java.lang.Math.max(r3, r0)
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r1, r0)
            goto L4a
        L49:
            r0 = 0
        L4a:
            com.google.android.material.shape.q r1 = r8.f181240h
            if (r1 == 0) goto L6d
            com.google.android.material.shape.k r2 = new com.google.android.material.shape.k
            r2.<init>(r1)
            android.content.res.ColorStateList r1 = r8.f181239g
            r2.n(r1)
            android.graphics.drawable.LayerDrawable r7 = new android.graphics.drawable.LayerDrawable
            com.google.android.material.shape.k[] r1 = new com.google.android.material.shape.k[]{r2}
            r7.<init>(r1)
            r2 = 0
            r1 = r7
            r3 = r0
            r4 = r0
            r5 = r0
            r6 = r0
            r1.setLayerInset(r2, r3, r4, r5, r6)
            r8.setBackground(r7)
        L6d:
            r8.setPadding(r0, r0, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.tooltip.n.a():void");
    }

    @Override // android.view.View
    public final void draw(@Y61.k Canvas canvas) {
        View childAt = getChildAt(0);
        float x12 = childAt.getX();
        float y12 = childAt.getY();
        int iSave = canvas.save();
        canvas.translate(x12, y12);
        try {
            this.f181236d.a(canvas, childAt);
            canvas.restoreToCount(iSave);
            super.draw(canvas);
        } catch (Throwable th2) {
            canvas.restoreToCount(iSave);
            throw th2;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.shape.k kVar = this.f181243k;
        if (kVar == null) {
            return;
        }
        kVar.setState(getDrawableState());
    }

    /* renamed from: getMaxHeight$_design_modules_components, reason: from getter */
    public final int getMaxHeight() {
        return this.maxHeight;
    }

    /* renamed from: getMaxWidth$_design_modules_components, reason: from getter */
    public final int getMaxWidth() {
        return this.maxWidth;
    }

    /* renamed from: getShowTail$_design_modules_components, reason: from getter */
    public final boolean getShowTail() {
        return this.showTail;
    }

    @Y61.l
    /* renamed from: getState$_design_modules_components, reason: from getter */
    public final TooltipState getState() {
        return this.state;
    }

    @Y61.l
    /* renamed from: getStyle$_design_modules_components, reason: from getter */
    public final KV.a getStyle() {
        return this.style;
    }

    @Y61.k
    public final q getTooltipPosition() {
        return this.tooltipPosition;
    }

    @Override // android.view.View
    public final void onDraw(@Y61.k Canvas canvas) {
        Rect rect = this.f181237e;
        if (!rect.isEmpty()) {
            canvas.save();
            canvas.rotate(this.f181238f, rect.centerX(), rect.centerY());
            com.google.android.material.shape.k kVar = this.f181243k;
            if (kVar != null) {
                kVar.setBounds(rect);
            }
            com.google.android.material.shape.k kVar2 = this.f181243k;
            if (kVar2 != null) {
                if (!this.showTail) {
                    kVar2 = null;
                }
                if (kVar2 != null) {
                    kVar2.draw(canvas);
                }
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        View view;
        int i14;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.max(this.f181250r, Math.min(this.maxWidth, View.MeasureSpec.getSize(i12))), View.MeasureSpec.getMode(i12)), View.MeasureSpec.makeMeasureSpec(Math.max(this.f181248p, Math.min(this.maxHeight, View.MeasureSpec.getSize(i13))), View.MeasureSpec.getMode(i13)));
        int i15 = 0;
        this.f181236d.d(getChildAt(0));
        WeakReference<View> weakReference = this.f181247o;
        if (weakReference == null || (view = weakReference.get()) == null || !isAttachedToWindow()) {
            return;
        }
        s.f181270a.getClass();
        int iA2 = s.a(s.c(this), s.c(view));
        Q qI2 = this.tooltipPosition.i(view, this);
        int iIntValue = ((Number) qI2.f406619b).intValue();
        int iIntValue2 = ((Number) qI2.f406620c).intValue();
        boolean z12 = this.f181246n > 0;
        Rect rect = this.f181237e;
        if (z12) {
            int iA3 = this.tooltipPosition.a();
            int i16 = iA3 / 2;
            if (iA2 == 3 || iA2 == 5) {
                rect.top = iIntValue2 - i16;
                rect.bottom = iIntValue2 + i16;
                if (iA2 == 5) {
                    rect.left = iIntValue;
                    rect.right = iIntValue + iA3;
                } else {
                    rect.left = iIntValue - iA3;
                    rect.right = iIntValue;
                }
            } else {
                rect.left = iIntValue - i16;
                rect.right = iIntValue + i16;
                if (iA2 == 48) {
                    rect.top = iIntValue2 - iA3;
                    rect.bottom = iIntValue2;
                } else {
                    rect.top = iIntValue2;
                    rect.bottom = iIntValue2 + iA3;
                }
            }
        } else {
            int iC2 = this.tooltipPosition.c() / 2;
            rect.top = iIntValue2 - iC2;
            rect.bottom = iIntValue2 + iC2;
            rect.left = iIntValue - iC2;
            rect.right = iIntValue + iC2;
        }
        this.f181238f = iA2 != 3 ? iA2 != 5 ? iA2 != 80 ? 225.0f : 45.0f : 315.0f : 135.0f;
        int i17 = this.f181246n;
        if (i17 > 0) {
            if (iA2 == 3) {
                i14 = 0;
                i15 = i17;
            } else if (iA2 != 5) {
                i14 = iA2 != 80 ? i17 : -i17;
            } else {
                i14 = 0;
                i15 = -i17;
            }
            rect.left += i15;
            rect.right += i15;
            rect.top += i14;
            rect.bottom += i14;
        }
        invalidate();
    }

    public final void setAnchorView(@Y61.k View anchor) {
        this.f181247o = new WeakReference<>(anchor);
        requestLayout();
    }

    public final void setMaxHeight$_design_modules_components(int i12) {
        this.maxHeight = i12;
    }

    public final void setMaxWidth$_design_modules_components(int i12) {
        this.maxWidth = i12;
    }

    public final void setShowTail$_design_modules_components(boolean z12) {
        this.showTail = z12;
    }

    public final void setState$_design_modules_components(@Y61.l TooltipState tooltipState) {
        this.state = tooltipState;
    }

    public final void setStyle$_design_modules_components(@Y61.l KV.a aVar) {
        this.style = aVar;
    }

    public final void setTooltipPosition(@Y61.k q qVar) {
        this.f181244l = qVar.a();
        a();
        this.tooltipPosition = qVar;
    }

    @X41.j
    public n(@Y61.k Context context, @Y61.l AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet, i12, i13);
        this.f181236d = new com.avito.android.lib.design.button.c();
        this.f181237e = new Rect();
        this.f181238f = 45.0f;
        this.showTail = true;
        this.maxHeight = Integer.MAX_VALUE;
        this.maxWidth = Integer.MAX_VALUE;
        this.tooltipPosition = new r.b(new i.c(new b.c()));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178946S0, i12, i13);
        KV.a.f9464v.getClass();
        setStyle(a.C0572a.c(typedArrayObtainStyledAttributes, context));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    @Y61.k
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0112  */
    @Override // LV.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStyle(@Y61.k KV.a r12) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.tooltip.n.setStyle(KV.a):void");
    }

    @k0
    public static /* synthetic */ void getTooltipPosition$annotations() {
    }
}
