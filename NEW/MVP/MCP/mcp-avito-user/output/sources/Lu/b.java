package LU;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.deprecated_design.button.c;
import com.avito.android.printable_text.PrintableText;
import hw.InterfaceC41179d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LoadView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLU/b;", "LLU/a;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41179d
/* loaded from: classes14.dex */
public final class b implements a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f9961b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f9962c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final c f9963d;

    public b(@k View view) {
        this.f9961b = view;
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f9962c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.refresh);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        c cVar = new c(viewFindViewById2);
        this.f9963d = cVar;
        cVar.a(R.string.load_snippet_refresh);
    }

    @Override // LU.a
    public final void Od(@l Y41.a<G0> aVar) {
        this.f9963d.c(aVar);
    }

    @Override // LU.a
    public final void i7(@k PrintableText printableText) {
        this.f9962c.setText(printableText.k0(this.f9961b.getContext()));
    }
}
