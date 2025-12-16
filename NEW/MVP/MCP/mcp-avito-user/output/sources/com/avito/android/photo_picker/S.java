package com.avito.android.photo_picker;

import android.app.Application;
import com.avito.android.photo_picker.converter.ImageConvertOptions;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UploadConverterProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/S;", "Lcom/avito/android/photo_picker/Q;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class S implements Q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f218862a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_storage.i f218863b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_picker.converter.b f218864c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final N70.b f218865d;

    @Inject
    public S(@Y61.k Application application, @Y61.k com.avito.android.photo_storage.i iVar, @Y61.k com.avito.android.photo_picker.converter.b bVar, @Y61.k N70.b bVar2) {
        this.f218862a = application;
        this.f218863b = iVar;
        this.f218864c = bVar;
        this.f218865d = bVar2;
    }

    @Override // com.avito.android.photo_picker.Q
    @Y61.k
    public final com.avito.android.photo_picker.converter.f a(@Y61.k String str) {
        if (str.equals("evidence files") || str.equals("auto evidence files")) {
            return new com.avito.android.photo_picker.converter.e(this.f218862a.getContentResolver(), this.f218863b);
        }
        return new com.avito.android.photo_picker.converter.d(this.f218864c, str.equals("publish") ? new ImageConvertOptions(1440, 1920, 80, 4194304) : new ImageConvertOptions(960, 1280, 90, 4194304), this.f218865d);
    }
}
