package com.avito.android.home.appending_item.retry;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AppendingRetryItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/home/appending_item/retry/e;", "Lcom/avito/android/home/appending_item/retry/i;", "Lcom/avito/konveyor/adapter/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public class e extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f162235c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f162236b;

    public e(@k View view) {
        super(view);
        this.f162236b = (TextView) view.findViewById(R.id.panel_error_retry);
    }

    @Override // com.avito.android.home.appending_item.retry.i
    public final void K8(@k Y41.a<G0> aVar) {
        this.f162236b.setOnClickListener(new com.avito.android.guests_selector.items.children_add_button.g(1, aVar));
    }
}
