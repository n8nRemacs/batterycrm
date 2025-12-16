package com.avito.android.notification_center.list.item;

import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.printable_text.PrintableText;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ErrorSnippetItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/notification_center/list/item/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/notification_center/list/item/h;", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f207616f = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f207617b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f207618c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f207619d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Button f207620e;

    public i(@Y61.k View view) {
        super(view);
        this.f207617b = view;
        this.f207619d = (TextView) view.findViewById(R.id.notification_error_snippet_message);
        this.f207620e = (Button) view.findViewById(R.id.notification_error_snippet_refresh);
    }

    @Override // com.avito.android.notification_center.list.item.h
    public final void Od(@Y61.l Y41.a<G0> aVar) {
        this.f207620e.setOnClickListener(new com.avito.android.mortgage.root.list.items.legacy_status.i(9, aVar));
    }

    @Override // com.avito.android.notification_center.list.item.h
    public final void d(@Y61.l Y41.a<G0> aVar) {
        this.f207618c = aVar;
    }

    @Override // com.avito.android.notification_center.list.item.h
    public final void i7(@Y61.k PrintableText printableText) {
        this.f207619d.setText(printableText.k0(this.f207617b.getContext()));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f207618c;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
