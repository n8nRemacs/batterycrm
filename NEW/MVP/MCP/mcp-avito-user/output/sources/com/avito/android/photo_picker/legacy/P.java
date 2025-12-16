package com.avito.android.photo_picker.legacy;

import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: SingleCachePhotoInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/photo_picker/converter/a;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/photo_picker/converter/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class P<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X f219604b;

    public P(X x12) {
        this.f219604b = x12;
    }

    @Override // l41.g
    public final void accept(Object obj) throws Throwable {
        com.avito.android.photo_picker.converter.a aVar = (com.avito.android.photo_picker.converter.a) obj;
        X x12 = this.f219604b;
        x12.getClass();
        LinkedHashMap linkedHashMap = aVar.f219315b;
        String strA = x12.f219636j.a(new N70.a((String) linkedHashMap.get("ImageWidth"), (String) linkedHashMap.get("ImageLength")));
        Set<String> set = N70.e.f11210a;
        linkedHashMap.put("UserComment", strA);
        N70.e.b(new androidx.exifinterface.media.a(aVar.f219314a), linkedHashMap);
    }
}
