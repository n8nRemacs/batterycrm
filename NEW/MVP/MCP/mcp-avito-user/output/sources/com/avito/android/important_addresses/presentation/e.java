package com.avito.android.important_addresses.presentation;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: ImportantAddressesItemHolderImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/important_addresses/presentation/e;", "LJM/b;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_important-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e extends RecyclerView.C implements JM.b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f169625b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final l f169626c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f169627d;

    public e(@Y61.k View view, @Y61.k l lVar, @Y61.k com.avito.android.util.text.a aVar) {
        super(view);
        this.f169625b = view;
        this.f169626c = lVar;
        this.f169627d = aVar;
    }

    @Override // JM.b
    public final void b70() {
        this.f169626c.a(new g(this.f169625b, this.f169627d));
    }
}
