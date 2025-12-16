package Ql;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CalendarHeaderView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQl/b;", "LQl/a;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements InterfaceC14906a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13991a;

    /* renamed from: b, reason: collision with root package name */
    public final Toolbar f13992b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f13993c;

    public b(@k View view) {
        this.f13991a = view.getContext();
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        this.f13992b = toolbar;
        this.f13993c = (TextView) toolbar.findViewById(R.id.clear_button);
        toolbar.setNavigationIcon(R.drawable.ic_back_24_black);
    }

    @Override // Ql.InterfaceC14906a
    public final void D(@k PrintableText printableText) {
        this.f13992b.setTitle(printableText.k0(this.f13991a));
    }

    @Override // Ql.InterfaceC14906a
    public final void E(boolean z12) {
        TextView textView = this.f13993c;
        textView.setEnabled(z12);
        Context context = this.f13991a;
        textView.setTextColor(z12 ? C35835l0.d(R.attr.blue, context) : C35835l0.d(R.attr.blueAlpha40, context));
    }

    @Override // Ql.InterfaceC14906a
    public final void F(@k Y41.a<G0> aVar) {
        this.f13992b.setNavigationOnClickListener(new Ae0.b(18, aVar));
    }

    @Override // Ql.InterfaceC14906a
    public final void G(@k Y41.a<G0> aVar) {
        this.f13993c.setOnClickListener(new Ae0.b(19, aVar));
    }
}
