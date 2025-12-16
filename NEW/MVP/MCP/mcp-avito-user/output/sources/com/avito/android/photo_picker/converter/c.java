package com.avito.android.photo_picker.converter;

import Y61.k;
import android.content.Context;
import android.net.Uri;
import com.avito.android.photo_storage.i;
import io.reactivex.rxjava3.internal.operators.observable.C;
import kotlin.Metadata;

/* compiled from: BitmapFileProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/converter/c;", "Lcom/avito/android/photo_picker/converter/b;", "_avito_photo-conversion_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f219316a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final i f219317b;

    public c(@k Context context, @k i iVar) {
        this.f219316a = context;
        this.f219317b = iVar;
    }

    @Override // com.avito.android.photo_picker.converter.b
    @k
    public final C a(@k Uri uri, @k ImageConvertOptions imageConvertOptions) {
        return new C(new FX0.b(this, uri, imageConvertOptions, 15));
    }
}
