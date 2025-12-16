package androidx.compose.ui.text.platform.style;

import Y61.k;
import Y61.l;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.C22279q;
import androidx.compose.ui.graphics.I0;
import androidx.compose.ui.graphics.drawscope.j;
import androidx.compose.ui.graphics.drawscope.n;
import androidx.compose.ui.graphics.drawscope.o;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DrawStyleSpan.android.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/platform/style/c;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c extends CharacterStyle implements UpdateAppearance {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final j f42601b;

    public c(@k j jVar) {
        this.f42601b = jVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(@l TextPaint textPaint) {
        if (textPaint != null) {
            n nVar = n.f39497a;
            j jVar = this.f42601b;
            if (L.f(jVar, nVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (jVar instanceof o) {
                textPaint.setStyle(Paint.Style.STROKE);
                o oVar = (o) jVar;
                textPaint.setStrokeWidth(oVar.f39499a);
                textPaint.setStrokeMiter(oVar.f39500b);
                textPaint.setStrokeJoin(d.b(oVar.f39502d));
                textPaint.setStrokeCap(d.a(oVar.f39501c));
                I0 i02 = oVar.f39503e;
                textPaint.setPathEffect(i02 != null ? ((C22279q) i02).f39745b : null);
            }
        }
    }
}
