package x0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ShadowSpan.android.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lx0/l;", "Landroid/text/style/CharacterStyle;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final int f441927a;

    /* renamed from: b, reason: collision with root package name */
    public final float f441928b;

    /* renamed from: c, reason: collision with root package name */
    public final float f441929c;

    /* renamed from: d, reason: collision with root package name */
    public final float f441930d;

    public l(float f12, float f13, float f14, int i12) {
        this.f441927a = i12;
        this.f441928b = f12;
        this.f441929c = f13;
        this.f441930d = f14;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(@Y61.k TextPaint textPaint) {
        textPaint.setShadowLayer(this.f441930d, this.f441928b, this.f441929c, this.f441927a);
    }
}
