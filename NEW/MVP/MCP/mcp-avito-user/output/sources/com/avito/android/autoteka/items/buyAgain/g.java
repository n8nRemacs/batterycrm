package com.avito.android.autoteka.items.buyAgain;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BuyAgainView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/items/buyAgain/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/autoteka/items/buyAgain/f;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f96680e = 0;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f96681b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f96682c;

    /* renamed from: d, reason: collision with root package name */
    public final Button f96683d;

    public g(@k View view) {
        super(view);
        this.f96681b = (TextView) view.findViewById(R.id.autoteka_title);
        this.f96682c = (TextView) view.findViewById(R.id.autoteka_description);
        this.f96683d = (Button) view.findViewById(R.id.autoteka_view_report);
    }

    @Override // com.avito.android.autoteka.items.buyAgain.f
    public final void b(@k String str) {
        this.f96681b.setText(str);
    }

    @Override // com.avito.android.autoteka.items.buyAgain.f
    public final void or(@k Y41.a<G0> aVar) {
        this.f96683d.setOnClickListener(new com.avito.android.advertising.ui.buzzoola.premium.a(7, aVar));
    }

    @Override // com.avito.android.autoteka.items.buyAgain.f
    public final void q(@k AttributedText attributedText) {
        j.c(this.f96682c, attributedText, null);
    }
}
