package Ef;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.printable_text.PrintableText;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ErrorView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LEf/b;", "Lcom/avito/konveyor/adapter/b;", "LEf/a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ef.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13481b extends com.avito.konveyor.adapter.b implements InterfaceC13480a {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f4132e = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f4133b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f4134c;

    /* renamed from: d, reason: collision with root package name */
    public final Button f4135d;

    public C13481b(@k View view) {
        super(view);
        this.f4133b = view.getContext();
        this.f4134c = (TextView) view.findViewById(R.id.autoteka_text);
        this.f4135d = (Button) view.findViewById(R.id.autoteka_update);
    }

    @Override // Ef.InterfaceC13480a
    public final void Y2(@k PrintableText printableText) {
        com.avito.android.printable_text.a.c(this.f4134c, printableText);
    }

    @Override // Ef.InterfaceC13480a
    public final void l4(@k PrintableText printableText, @k Y41.a<G0> aVar) {
        String strK0 = printableText.k0(this.f4133b);
        Button button = this.f4135d;
        button.setText(strK0);
        button.setOnClickListener(new Ae0.b(8, aVar));
    }
}
