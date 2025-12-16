package com.avito.android.photo_picker.converter;

import Y61.k;
import android.net.Uri;
import io.reactivex.rxjava3.core.z;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.text.C43066x;
import l41.o;

/* compiled from: ImageUploadConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/converter/d;", "Lcom/avito/android/photo_picker/converter/f;", "_avito_photo-conversion_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final b f219318a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ImageConvertOptions f219319b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final N70.b f219320c;

    /* compiled from: ImageUploadConverter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/photo_picker/converter/a;", "it", "Ljava/io/File;", "apply", "(Lcom/avito/android/photo_picker/converter/a;)Ljava/io/File;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements o {
        public a() {
        }

        @Override // l41.o
        public final Object apply(Object obj) throws Throwable {
            com.avito.android.photo_picker.converter.a aVar = (com.avito.android.photo_picker.converter.a) obj;
            d dVar = d.this;
            dVar.getClass();
            LinkedHashMap linkedHashMap = aVar.f219315b;
            Set<String> set = N70.e.f11210a;
            String str = (String) linkedHashMap.get("UserComment");
            String string = str != null ? C43066x.A0(str).toString() : null;
            if (string == null || string.length() == 0) {
                linkedHashMap.put("UserComment", dVar.f219320c.a(new N70.a((String) linkedHashMap.get("ImageWidth"), (String) linkedHashMap.get("ImageLength"))));
            }
            File file = aVar.f219314a;
            N70.e.b(new androidx.exifinterface.media.a(file), linkedHashMap);
            return file;
        }
    }

    public d(@k b bVar, @k ImageConvertOptions imageConvertOptions, @k N70.b bVar2) {
        this.f219318a = bVar;
        this.f219319b = imageConvertOptions;
        this.f219320c = bVar2;
    }

    @Override // com.avito.android.photo_picker.converter.f
    @k
    public final z<File> a(@k Uri uri) {
        return this.f219318a.a(uri, this.f219319b).d0(new a());
    }
}
