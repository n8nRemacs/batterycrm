package w0;

import Y61.k;
import android.text.TextPaint;
import androidx.compose.runtime.internal.P;
import j.X;
import kotlin.Metadata;

/* compiled from: SegmentFinder.android.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lw0/d;", "Lw0/c;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X
/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final CharSequence f441074a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextPaint f441075b;

    public d(@k CharSequence charSequence, @k TextPaint textPaint) {
        this.f441074a = charSequence;
        this.f441075b = textPaint;
    }

    @Override // w0.c
    public final int e(int i12) {
        CharSequence charSequence = this.f441074a;
        return this.f441075b.getTextRunCursor(charSequence, 0, charSequence.length(), false, i12, 0);
    }

    @Override // w0.c
    public final int f(int i12) {
        CharSequence charSequence = this.f441074a;
        return this.f441075b.getTextRunCursor(charSequence, 0, charSequence.length(), false, i12, 2);
    }
}
