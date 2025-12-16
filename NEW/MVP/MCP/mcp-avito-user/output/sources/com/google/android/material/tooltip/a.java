package com.google.android.material.tooltip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import androidx.annotation.RestrictTo;
import com.google.android.material.internal.D;
import com.google.android.material.resources.d;
import com.google.android.material.shape.j;
import com.google.android.material.shape.k;
import com.google.android.material.shape.n;
import com.google.android.material.shape.q;
import j.N;
import j.P;
import j.f0;

/* compiled from: TooltipDrawable.java */
@RestrictTo
/* loaded from: classes6.dex */
public class a extends k implements D.b {

    /* renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ int f357698O = 0;

    /* renamed from: A, reason: collision with root package name */
    @P
    public final Paint.FontMetrics f357699A;

    /* renamed from: B, reason: collision with root package name */
    @N
    public final D f357700B;

    /* renamed from: C, reason: collision with root package name */
    @N
    public final View.OnLayoutChangeListener f357701C;

    /* renamed from: D, reason: collision with root package name */
    @N
    public final Rect f357702D;

    /* renamed from: E, reason: collision with root package name */
    public int f357703E;

    /* renamed from: F, reason: collision with root package name */
    public int f357704F;

    /* renamed from: G, reason: collision with root package name */
    public int f357705G;

    /* renamed from: H, reason: collision with root package name */
    public int f357706H;

    /* renamed from: I, reason: collision with root package name */
    public int f357707I;

    /* renamed from: J, reason: collision with root package name */
    public int f357708J;

    /* renamed from: K, reason: collision with root package name */
    public float f357709K;

    /* renamed from: L, reason: collision with root package name */
    public float f357710L;

    /* renamed from: M, reason: collision with root package name */
    public float f357711M;

    /* renamed from: N, reason: collision with root package name */
    public float f357712N;

    /* renamed from: y, reason: collision with root package name */
    @P
    public CharSequence f357713y;

    /* renamed from: z, reason: collision with root package name */
    @N
    public final Context f357714z;

    /* compiled from: TooltipDrawable.java */
    /* renamed from: com.google.android.material.tooltip.a$a, reason: collision with other inner class name */
    public class ViewOnLayoutChangeListenerC10646a implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC10646a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            int i22 = a.f357698O;
            a aVar = a.this;
            aVar.getClass();
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            aVar.f357708J = iArr[0];
            view.getWindowVisibleDisplayFrame(aVar.f357702D);
        }
    }

    public a(@N Context context, @f0 int i12) {
        super(context, null, 0, i12);
        this.f357699A = new Paint.FontMetrics();
        D d12 = new D(this);
        this.f357700B = d12;
        this.f357701C = new ViewOnLayoutChangeListenerC10646a();
        this.f357702D = new Rect();
        this.f357709K = 1.0f;
        this.f357710L = 1.0f;
        this.f357711M = 0.5f;
        this.f357712N = 1.0f;
        this.f357714z = context;
        TextPaint textPaint = d12.f356721a;
        textPaint.density = context.getResources().getDisplayMetrics().density;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    public final n A() {
        float f12 = -z();
        float fWidth = ((float) (getBounds().width() - (Math.sqrt(2.0d) * this.f357707I))) / 2.0f;
        return new n(new j(this.f357707I), Math.min(Math.max(f12, -fWidth), fWidth));
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable
    public final void draw(@N Canvas canvas) {
        canvas.save();
        float fZ2 = z();
        float f12 = (float) (-((Math.sqrt(2.0d) * this.f357707I) - this.f357707I));
        canvas.scale(this.f357709K, this.f357710L, (getBounds().width() * 0.5f) + getBounds().left, (getBounds().height() * this.f357711M) + getBounds().top);
        canvas.translate(fZ2, f12);
        super.draw(canvas);
        if (this.f357713y != null) {
            float fCenterY = getBounds().centerY();
            D d12 = this.f357700B;
            TextPaint textPaint = d12.f356721a;
            Paint.FontMetrics fontMetrics = this.f357699A;
            textPaint.getFontMetrics(fontMetrics);
            int i12 = (int) (fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            d dVar = d12.f356726f;
            TextPaint textPaint2 = d12.f356721a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                d12.f356726f.e(this.f357714z, textPaint2, d12.f356722b);
                textPaint2.setAlpha((int) (this.f357712N * 255.0f));
            }
            CharSequence charSequence = this.f357713y;
            canvas.drawText(charSequence, 0, charSequence.length(), r0.centerX(), i12, textPaint2);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.max(this.f357700B.f356721a.getTextSize(), this.f357705G);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f12 = this.f357703E * 2;
        CharSequence charSequence = this.f357713y;
        return (int) Math.max(f12 + (charSequence == null ? 0.0f : this.f357700B.a(charSequence.toString())), this.f357704F);
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        q.b bVarF = this.f357034b.f357057a.f();
        bVarF.f357103k = A();
        setShapeAppearanceModel(bVarF.a());
    }

    public final float z() {
        int i12;
        Rect rect = this.f357702D;
        if (((rect.right - getBounds().right) - this.f357708J) - this.f357706H < 0) {
            i12 = ((rect.right - getBounds().right) - this.f357708J) - this.f357706H;
        } else {
            if (((rect.left - getBounds().left) - this.f357708J) + this.f357706H <= 0) {
                return 0.0f;
            }
            i12 = ((rect.left - getBounds().left) - this.f357708J) + this.f357706H;
        }
        return i12;
    }
}
