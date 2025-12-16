package androidx.compose.ui.text.platform;

import android.text.style.ClickableSpan;
import android.view.View;
import androidx.compose.ui.text.D;
import kotlin.Metadata;

/* compiled from: URLSpanCache.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/platform/s;", "Landroid/text/style/ClickableSpan;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class s extends ClickableSpan {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.text.C f42584b;

    public s(@Y61.k androidx.compose.ui.text.C c12) {
        this.f42584b = c12;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(@Y61.k View view) {
        D f41908c = this.f42584b.getF41908c();
        if (f41908c != null) {
            f41908c.onClick();
        }
    }
}
