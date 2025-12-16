package com.avito.android.barcode;

import Y61.k;
import Y61.l;
import android.app.Application;
import android.content.Intent;
import com.avito.android.barcode.presentation.BarcodeArguments;
import com.avito.android.barcode.presentation.BarcodeDetailsActivity;
import com.avito.android.barcode_encoder.BarcodeFormat;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BarcodeIntentFactory.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/barcode/b;", "Lcom/avito/android/barcode/a;", "_avito_barcode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f98653a;

    @Inject
    public b(@k Application application) {
        this.f98653a = application;
    }

    @Override // com.avito.android.barcode.a
    @k
    public final Intent a(@k BarcodeFormat barcodeFormat, @k String str, @l String str2, @l String str3) {
        BarcodeDetailsActivity.f98681z.getClass();
        Intent intent = new Intent(this.f98653a, (Class<?>) BarcodeDetailsActivity.class);
        intent.putExtra("extra_arguments", new BarcodeArguments(barcodeFormat, str, str2, str3));
        return intent;
    }
}
