package com.avito.android.image.enhancement.files;

import Y61.k;
import android.net.Uri;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import java.io.File;
import kotlin.Metadata;
import okhttp3.OkHttpClient;

/* compiled from: ImageEnhanceFileLoader.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/image/enhancement/files/d;", "Lcom/avito/android/image/enhancement/files/c;", "_avito_image-enhancement_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final OkHttpClient f169370a;

    public d(@k OkHttpClient okHttpClient) {
        this.f169370a = okHttpClient;
    }

    @Override // com.avito.android.image.enhancement.files.c
    @k
    public final C42006d a(@k Uri uri, @k File file) {
        return new C42006d(new FX0.b(this, uri, file, 10));
    }
}
