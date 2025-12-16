package com.avito.android.photo_picker;

import kotlin.Metadata;

/* compiled from: PhotoPickerViewModel.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/photo_picker/SelectedPhoto;", "invoke", "(Lcom/avito/android/photo_picker/SelectedPhoto;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class E extends kotlin.jvm.internal.N implements Y41.l<SelectedPhoto, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.photo_picker.legacy.thumbnail_list.l f218744l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(com.avito.android.photo_picker.legacy.thumbnail_list.l lVar) {
        super(1);
        this.f218744l = lVar;
    }

    @Override // Y41.l
    public final Boolean invoke(SelectedPhoto selectedPhoto) {
        return Boolean.valueOf(kotlin.jvm.internal.L.f(selectedPhoto.f218866b, this.f218744l.f219905e));
    }
}
