package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.annotation.RestrictTo;
import androidx.core.util.z;
import j.N;
import j.P;
import j.X;

/* compiled from: EmojiSpan.java */
@X
/* loaded from: classes.dex */
public abstract class m extends ReplacementSpan {

    /* renamed from: c, reason: collision with root package name */
    @N
    public final t f46132c;

    /* renamed from: b, reason: collision with root package name */
    public final Paint.FontMetricsInt f46131b = new Paint.FontMetricsInt();

    /* renamed from: d, reason: collision with root package name */
    public short f46133d = -1;

    /* renamed from: e, reason: collision with root package name */
    public float f46134e = 1.0f;

    @RestrictTo
    public m(@N t tVar) {
        z.f(tVar, "rasterizer cannot be null");
        this.f46132c = tVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(@N Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i12, int i13, @P Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f46131b;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        t tVar = this.f46132c;
        this.f46134e = fAbs / (tVar.c().a(14) != 0 ? r8.f46105b.getShort(r1 + r8.f46104a) : (short) 0);
        androidx.emoji2.text.flatbuffer.n nVarC = tVar.c();
        int iA2 = nVarC.a(14);
        if (iA2 != 0) {
            nVarC.f46105b.getShort(iA2 + nVarC.f46104a);
        }
        short s5 = (short) ((tVar.c().a(12) != 0 ? r5.f46105b.getShort(r7 + r5.f46104a) : (short) 0) * this.f46134e);
        this.f46133d = s5;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s5;
    }
}
