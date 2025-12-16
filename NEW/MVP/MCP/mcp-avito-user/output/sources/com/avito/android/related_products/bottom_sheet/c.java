package com.avito.android.related_products.bottom_sheet;

import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: BeduinV2FormStorage.kt */
@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/related_products/bottom_sheet/c;", "Lcom/avito/android/related_products/bottom_sheet/b;", "<init>", "()V", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ContributesBinding.b
/* loaded from: classes16.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public String f252848a;

    @Inject
    public c() {
    }

    @Override // com.avito.android.related_products.bottom_sheet.b
    public final void a(@Y61.k String str) {
        this.f252848a = str;
    }

    @Override // com.avito.android.related_products.bottom_sheet.b
    public final void clear() {
        this.f252848a = null;
    }

    @Override // com.avito.android.related_products.bottom_sheet.a
    @Y61.l
    /* renamed from: getForm, reason: from getter */
    public final String getF252848a() {
        return this.f252848a;
    }
}
