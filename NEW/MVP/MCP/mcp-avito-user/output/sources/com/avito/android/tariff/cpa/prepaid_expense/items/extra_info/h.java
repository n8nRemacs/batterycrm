package com.avito.android.tariff.cpa.prepaid_expense.items.extra_info;

import Y61.k;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.Metadata;

/* compiled from: ExtraInfoItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpa/prepaid_expense/items/extra_info/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff/cpa/prepaid_expense/items/extra_info/g;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f295045b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f295046c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f295047d;

    public h(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f295045b = aVar;
        this.f295046c = (TextView) view.findViewById(R.id.title);
        this.f295047d = (TextView) view.findViewById(R.id.description);
    }

    @Override // com.avito.android.tariff.cpa.prepaid_expense.items.extra_info.g
    public final void g(@k AttributedText attributedText) {
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        TextView textView = this.f295047d;
        textView.setMovementMethod(linkMovementMethod);
        j.a(textView, attributedText, this.f295045b);
    }

    @Override // com.avito.android.tariff.cpa.prepaid_expense.items.extra_info.g
    public final void setTitle(@k String str) {
        this.f295046c.setText(str);
    }
}
