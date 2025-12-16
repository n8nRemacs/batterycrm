package PK0;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TextIconPlaceholder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPK0/j;", "Landroid/text/style/ClickableSpan;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j extends ClickableSpan {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f12985b;

    /* JADX WARN: Multi-variable type inference failed */
    public j() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(@Y61.k View view) {
        Y41.a<G0> aVar = this.f12985b;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public j(@Y61.l Y41.a<G0> aVar) {
        this.f12985b = aVar;
    }

    public /* synthetic */ j(Y41.a aVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : aVar);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(@Y61.k TextPaint textPaint) {
    }
}
