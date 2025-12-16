package com.avito.android.photo_picker.camera;

import android.graphics.Bitmap;
import android.net.Uri;
import com.avito.android.photo_storage.SharedPhotosStorage;
import java.io.ByteArrayInputStream;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CameraViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroid/net/Uri;", "bitmap", "Landroid/graphics/Bitmap;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class j<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f219010b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f219011c;

    public j(i iVar, byte[] bArr) {
        this.f219010b = iVar;
        this.f219011c = bArr;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        i iVar = this.f219010b;
        LinkedHashMap linkedHashMapA = N70.e.a(new androidx.exifinterface.media.a(new ByteArrayInputStream(this.f219011c)));
        linkedHashMapA.put("UserComment", iVar.f218974N.a(new N70.a((String) linkedHashMapA.get("ImageWidth"), (String) linkedHashMapA.get("ImageLength"))));
        Uri uriA = SharedPhotosStorage.c.a(iVar.f218975O, bitmap, linkedHashMapA, null, 22);
        bitmap.recycle();
        return uriA;
    }
}
