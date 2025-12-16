package com.avito.android.image.enhancement.files;

import Y61.k;
import Y61.l;
import android.net.Uri;
import io.reactivex.rxjava3.internal.operators.observable.C41964k1;
import java.io.File;
import java.io.InputStream;
import kotlin.Metadata;

/* compiled from: ImageEnhanceFileConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/image/enhancement/files/a;", "", "_avito_image-enhancement_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface a {
    @k
    File a();

    @k
    C41964k1 b(@k Uri uri);

    @l
    File c(@k Uri uri);

    @k
    File d(@k InputStream inputStream);
}
