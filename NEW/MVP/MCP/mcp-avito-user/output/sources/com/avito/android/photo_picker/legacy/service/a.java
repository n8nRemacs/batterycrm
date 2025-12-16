package com.avito.android.photo_picker.legacy.service;

import com.avito.android.photo_picker.legacy.service.c;
import kotlin.Metadata;

/* compiled from: ImageUploadService.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/photo_picker/legacy/service/c$a;", "event", "Lkotlin/G0;", "accept", "(Lcom/avito/android/photo_picker/legacy/service/c$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class a<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageUploadService f219850b;

    public a(ImageUploadService imageUploadService) {
        this.f219850b = imageUploadService;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        c.a aVar = (c.a) obj;
        int i12 = ImageUploadService.f219844f;
        ImageUploadService imageUploadService = this.f219850b;
        if (aVar instanceof c.a.b) {
            com.avito.android.service.d dVar = imageUploadService.f219846c;
            (dVar != null ? dVar : null).a();
        } else if (aVar instanceof c.a.C6608a) {
            com.avito.android.service.d dVar2 = imageUploadService.f219846c;
            (dVar2 != null ? dVar2 : null).a();
        }
    }
}
