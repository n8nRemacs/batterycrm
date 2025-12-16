package bj0;

import Y61.k;
import android.app.Application;
import android.content.Intent;
import com.avito.android.related_products.bottom_sheet.RelatedProductsBottomSheetActivity;
import com.avito.android.related_products.bottom_sheet.v;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RelatedProductsIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbj0/d;", "Lcom/avito/android/related_products/bottom_sheet/v;", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bj0.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C25664d implements v {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f57402a;

    @Inject
    public C25664d(@k Application application) {
        this.f57402a = application;
    }

    @Override // com.avito.android.related_products.bottom_sheet.v
    @k
    public final Intent a() {
        RelatedProductsBottomSheetActivity.f252819m.getClass();
        return new Intent(this.f57402a, (Class<?>) RelatedProductsBottomSheetActivity.class);
    }
}
