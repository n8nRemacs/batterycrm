package com.avito.android.component.user_hat.items;

import android.view.View;
import hw.InterfaceC41178c;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: Add.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/component/user_hat/items/u;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/component/user_hat/items/t;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class u extends com.avito.konveyor.adapter.b implements t {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f125354c = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f125355b;

    public u(@Y61.k View view) {
        super(view);
        this.f125355b = view;
    }

    @Override // com.avito.android.component.user_hat.f
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f125355b.setOnClickListener(new k(1, aVar));
    }
}
