package ii;

import Y61.k;
import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import kotlin.Metadata;

/* compiled from: BeduinLineHeightSpan.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lii/b;", "Landroid/text/style/LineHeightSpan;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ii.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C41406b implements LineHeightSpan {

    /* renamed from: b, reason: collision with root package name */
    public final int f398681b;

    public C41406b(int i12) {
        this.f398681b = i12;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(@k CharSequence charSequence, int i12, int i13, int i14, int i15, @k Paint.FontMetricsInt fontMetricsInt) {
        int i16 = this.f398681b;
        fontMetricsInt.bottom = i16;
        fontMetricsInt.descent = i16;
    }
}
