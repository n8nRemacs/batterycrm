package com.avito.android.vas_planning_checkout;

import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning_checkout/b;", "Lcom/avito/android/vas_planning_checkout/a;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.vas_planning_checkout.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36081b implements InterfaceC36080a {

    /* renamed from: a, reason: collision with root package name */
    public final int f322818a;

    @Inject
    public C36081b(@Y61.k Resources resources) throws Resources.NotFoundException {
        resources.getDimensionPixelOffset(R.dimen.vas_planning_padding_checkout_side);
        this.f322818a = resources.getDimensionPixelOffset(R.dimen.vas_planning_padding_checkout_item_bottom);
    }

    @Override // com.avito.android.vas_planning_checkout.InterfaceC36080a
    /* renamed from: a, reason: from getter */
    public final int getF322818a() {
        return this.f322818a;
    }
}
