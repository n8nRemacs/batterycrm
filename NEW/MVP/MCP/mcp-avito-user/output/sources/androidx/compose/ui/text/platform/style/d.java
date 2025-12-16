package androidx.compose.ui.text.platform.style;

import Y61.k;
import android.graphics.Paint;
import androidx.compose.ui.graphics.m1;
import androidx.compose.ui.graphics.n1;
import kotlin.Metadata;

/* compiled from: DrawStyleSpan.android.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {
    @k
    public static final Paint.Cap a(int i12) {
        m1.a aVar = m1.f39698b;
        aVar.getClass();
        if (m1.b(i12, 0)) {
            return Paint.Cap.BUTT;
        }
        aVar.getClass();
        if (m1.b(i12, m1.f39699c)) {
            return Paint.Cap.ROUND;
        }
        aVar.getClass();
        return m1.b(i12, m1.f39700d) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }

    @k
    public static final Paint.Join b(int i12) {
        n1.a aVar = n1.f39707b;
        aVar.getClass();
        if (n1.b(i12, 0)) {
            return Paint.Join.MITER;
        }
        aVar.getClass();
        if (n1.b(i12, n1.f39708c)) {
            return Paint.Join.ROUND;
        }
        aVar.getClass();
        return n1.b(i12, n1.f39709d) ? Paint.Join.BEVEL : Paint.Join.MITER;
    }
}
