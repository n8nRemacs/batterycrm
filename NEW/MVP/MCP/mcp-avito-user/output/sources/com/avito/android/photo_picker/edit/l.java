package com.avito.android.photo_picker.edit;

import android.graphics.Bitmap;
import com.avito.android.photo_storage.SharedPhotosStorage;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: EditPhotoViewModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072*\u0010\u0006\u001a&\u0012\u0004\u0012\u00020\u0001\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003j\u0002`\u00050\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lkotlin/Q;", "Landroid/graphics/Bitmap;", "Lorg/funktionale/option/a;", "", "", "Lcom/avito/android/photo_exif/ExifAttributesCollection;", "<name for destructuring parameter 0>", "Landroid/net/Uri;", "apply", "(Lkotlin/Q;)Landroid/net/Uri;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class l<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f219425b;

    public l(k kVar) {
        this.f219425b = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) {
        Q q12 = (Q) obj;
        Bitmap bitmap = (Bitmap) q12.f406619b;
        org.funktionale.option.a aVar = (org.funktionale.option.a) q12.f406620c;
        k kVar = this.f219425b;
        return SharedPhotosStorage.c.a(kVar.f219410E, bitmap, (Map) aVar.c(), null, 22);
    }
}
