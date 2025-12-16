package com.avito.android.related_products.bottom_sheet;

import bj0.C25661a;
import bj0.InterfaceC25663c;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: DeeplinkHandlerUpdatesListener.kt */
@Singleton
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/related_products/bottom_sheet/r;", "Lcom/avito/android/related_products/bottom_sheet/g;", "Lbj0/c;", "<init>", "()V", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ContributesBinding.b
/* loaded from: classes16.dex */
public final class r implements g, InterfaceC25663c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e2 f252995a = f2.b(0, 1, null, 5);

    @Inject
    public r() {
    }

    @Override // bj0.InterfaceC25663c
    public final InterfaceC43160i a() {
        return C43175k.a(this.f252995a);
    }

    @Override // com.avito.android.related_products.bottom_sheet.g
    public final void b(@Y61.k C25661a c25661a) {
        this.f252995a.K5(c25661a);
    }
}
