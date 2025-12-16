package com.avito.android.publish.price_list.items.header;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelfServicesHeaderItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/price_list/items/header/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/price_list/items/header/f;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f238663b;

    public k(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.self_services_header);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f238663b = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.publish.price_list.items.header.f
    public final void setTitle(@Y61.k String str) {
        I5.a(this.f238663b, str, false);
    }
}
