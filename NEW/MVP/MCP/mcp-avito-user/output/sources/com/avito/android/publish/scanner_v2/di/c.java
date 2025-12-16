package com.avito.android.publish.scanner_v2.di;

import Y61.k;
import com.avito.android.photo_storage.SharedPhotosStorage;
import com.avito.android.publish.C0;
import com.avito.android.publish.di.InterfaceC33816g;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import kotlin.Metadata;

/* compiled from: VinScannerComponent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/scanner_v2/di/c;", "Lcom/avito/android/publish/di/g;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface c extends InterfaceC33816g {
    @k
    com.avito.android.publish.view.result_handler.a F1();

    @k
    CategoryParametersConverter I();

    @k
    SharedPhotosStorage b2();

    @k
    C0 u();
}
