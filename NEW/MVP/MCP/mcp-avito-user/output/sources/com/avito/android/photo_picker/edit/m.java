package com.avito.android.photo_picker.edit;

import android.net.Uri;
import androidx.view.C23038g0;
import com.avito.android.photo_picker.SelectedPhoto;
import com.avito.android.photo_picker.edit.k;
import kotlin.Metadata;

/* compiled from: EditPhotoViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/net/Uri;", "croppedImage", "Lkotlin/G0;", "accept", "(Landroid/net/Uri;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class m<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f219426b;

    public m(k kVar) {
        this.f219426b = kVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Uri uri = (Uri) obj;
        k kVar = this.f219426b;
        C23038g0<k.a> c23038g0 = kVar.f219417P;
        SelectedPhoto selectedPhoto = kVar.f219416O;
        SelectedPhoto selectedPhoto2 = selectedPhoto == null ? null : selectedPhoto;
        if (selectedPhoto == null) {
            selectedPhoto = null;
        }
        c23038g0.setValue(new k.a.d(SelectedPhoto.a(selectedPhoto2, uri, selectedPhoto.f218866b, null, 118)));
    }
}
