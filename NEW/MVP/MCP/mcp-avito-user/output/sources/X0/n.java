package x0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: TextDecorationSpan.android.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lx0/n;", "Landroid/text/style/CharacterStyle;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f441932a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f441933b;

    public n(boolean z12, boolean z13) {
        this.f441932a = z12;
        this.f441933b = z13;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(@Y61.k TextPaint textPaint) {
        textPaint.setUnderlineText(this.f441932a);
        textPaint.setStrikeThruText(this.f441933b);
    }
}
