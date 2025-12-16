package com.avito.android.publish;

import android.net.Uri;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.StsRecognitionResult;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.imei_recognition.ImeiRecognitionResult;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: ScannerInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/R0;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface R0 {
    @Y61.k
    io.reactivex.rxjava3.core.z<P2<StsRecognitionResult>> a(@Y61.k Uri uri, @Y61.k Navigation navigation2, @Y61.k CategoryParameters categoryParameters);

    @Y61.k
    io.reactivex.rxjava3.core.z<P2<ImeiRecognitionResult>> b(@Y61.k Uri uri, @Y61.k Navigation navigation2, @Y61.k CategoryParameters categoryParameters);
}
