package OK0;

import Y61.k;
import Y61.l;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DeepLinkSpan.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOK0/b;", "Landroid/text/style/ClickableSpan;", "_avito_text-formatters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends ClickableSpan {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DeepLink f12193b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final w f12194c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12195d;

    public /* synthetic */ b(DeepLink deepLink, w wVar, boolean z12, int i12, C42822w c42822w) {
        this(deepLink, wVar, (i12 & 4) != 0 ? true : z12);
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(@k View view) {
        w wVar = this.f12194c;
        if (wVar != null) {
            wVar.i7(this.f12193b);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(@k TextPaint textPaint) {
        if (this.f12195d) {
            textPaint.setColor(textPaint.linkColor);
            textPaint.setUnderlineText(false);
        }
    }

    public b(@k DeepLink deepLink, @l w wVar, boolean z12) {
        this.f12193b = deepLink;
        this.f12194c = wVar;
        this.f12195d = z12;
    }
}
