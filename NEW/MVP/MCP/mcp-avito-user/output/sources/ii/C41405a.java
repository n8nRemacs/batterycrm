package ii;

import Y61.k;
import Y61.l;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.avito.android.beduin_models.BeduinAction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinClickableTextSpan.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lii/a;", "Landroid/text/style/ClickableSpan;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ii.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C41405a extends ClickableSpan {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<BeduinAction> f398678b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final InterfaceC41409e f398679c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f398680d;

    public /* synthetic */ C41405a(List list, InterfaceC41409e interfaceC41409e, boolean z12, int i12, C42822w c42822w) {
        this(list, interfaceC41409e, (i12 & 4) != 0 ? true : z12);
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(@k View view) {
        InterfaceC41409e interfaceC41409e = this.f398679c;
        if (interfaceC41409e != null) {
            interfaceC41409e.a(this.f398678b);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(@k TextPaint textPaint) {
        if (this.f398680d) {
            textPaint.setColor(textPaint.linkColor);
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C41405a(@k List<? extends BeduinAction> list, @l InterfaceC41409e interfaceC41409e, boolean z12) {
        this.f398678b = list;
        this.f398679c = interfaceC41409e;
        this.f398680d = z12;
    }
}
