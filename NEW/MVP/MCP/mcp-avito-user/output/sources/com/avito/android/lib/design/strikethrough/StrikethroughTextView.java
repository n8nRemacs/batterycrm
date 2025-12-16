package com.avito.android.lib.design.strikethrough;

import PK0.n;
import X41.j;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.avito.android.R;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.strikethrough.a;
import com.avito.android.lib.design.text_view.e;
import com.avito.android.lib.util.c;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35835l0;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: StrikethroughTextView.kt */
@s0
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/avito/android/lib/design/strikethrough/StrikethroughTextView;", "Lcom/avito/android/lib/design/text_view/a;", "LLV/a;", "LCV/a;", "Lcom/avito/android/lib/design/strikethrough/a;", "Landroid/graphics/drawable/Drawable;", "getStrikethroughImage", "()Landroid/graphics/drawable/Drawable;", "newStyle", "Lkotlin/G0;", "setStyle", "(Lcom/avito/android/lib/design/strikethrough/a;)V", "newState", "setState", "(LCV/a;)V", "", "getCanDrawStrikethrough", "()Z", "canDrawStrikethrough", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"CustomViewStyleable"})
/* loaded from: classes14.dex */
public final class StrikethroughTextView extends com.avito.android.lib.design.text_view.a implements LV.a<CV.a, a> {

    /* renamed from: q, reason: collision with root package name */
    public boolean f180648q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public ColorStateList f180649r;

    /* renamed from: s, reason: collision with root package name */
    @l
    public final Drawable f180650s;

    /* renamed from: t, reason: collision with root package name */
    @l
    public CV.a f180651t;

    /* renamed from: u, reason: collision with root package name */
    @l
    public a f180652u;

    @j
    public StrikethroughTextView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    private final boolean getCanDrawStrikethrough() throws ExecutionException, InterruptedException {
        if (!this.f180648q) {
            return false;
        }
        CharSequence text = getText();
        return !(text == null || text.length() == 0);
    }

    private final Drawable getStrikethroughImage() {
        Drawable drawableH = C35835l0.h(R.attr.img_strikethrough, getContext());
        Drawable drawableMutate = drawableH != null ? drawableH.mutate() : null;
        if (drawableMutate != null) {
            drawableMutate.setTintList(this.f180649r);
        }
        if (drawableMutate != null) {
            drawableMutate.setCallback(this);
        }
        return drawableMutate;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(@k Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.f180650s;
        if (drawable == null || !getCanDrawStrikethrough()) {
            return;
        }
        drawable.setBounds(0, 0, getWidth(), getHeight());
        drawable.draw(canvas);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public StrikethroughTextView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, (i14 & 4) != 0 ? android.R.attr.textViewStyle : i12, 0, 8, null);
        this.f180650s = getStrikethroughImage();
        new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178924H0);
        a.f180653c.getClass();
        setStyle(a.C5303a.b(typedArrayObtainStyledAttributes, context));
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f180648q = typedArrayObtainStyledAttributes.getBoolean(0, this.f180648q);
        }
    }

    @Override // LV.b
    public void setState(@k CV.a newState) {
        CV.a aVar = this.f180651t;
        if (new c(newState, aVar).f181333c) {
            return;
        }
        this.f180651t = newState;
        String str = aVar != null ? aVar.f2193a : null;
        String str2 = newState.f2193a;
        if (!new c(str2, str).f181333c && str2 != null) {
            setText(str2);
        }
        boolean z12 = newState.f2194b;
        if (new c(Boolean.valueOf(z12), aVar != null ? Boolean.valueOf(aVar.f2194b) : null).f181333c) {
            return;
        }
        this.f180648q = z12;
        invalidate();
    }

    @Override // LV.d
    public void setStyle(@k a newStyle) {
        a aVar = this.f180652u;
        if (new c(newStyle, aVar).f181333c) {
            return;
        }
        this.f180652u = newStyle;
        n nVar = aVar != null ? aVar.f180655b : null;
        n nVar2 = newStyle.f180655b;
        if (!new c(nVar2, nVar).f181333c && nVar2 != null) {
            e.a(this, nVar2);
        }
        C35763c0 c35763c0 = aVar != null ? aVar.f180654a : null;
        C35763c0 c35763c02 = newStyle.f180654a;
        if (new c(c35763c02, c35763c0).f181333c || c35763c02 == null) {
            return;
        }
        ColorStateList colorStateListB = c35763c02.b();
        this.f180649r = colorStateListB;
        Drawable drawable = this.f180650s;
        if (drawable != null) {
            drawable.setTintList(colorStateListB);
        }
    }
}
