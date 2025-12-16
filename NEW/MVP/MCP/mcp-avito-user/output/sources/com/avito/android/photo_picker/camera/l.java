package com.avito.android.photo_picker.camera;

import android.net.Uri;
import androidx.view.C23038g0;
import com.avito.android.photo_cache.PhotoSource;
import com.avito.android.photo_picker.PhotoPickerViewModel;
import com.avito.android.photo_picker.camera.i;
import kotlin.Metadata;

/* compiled from: CameraViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/net/Uri;", "it", "Lkotlin/G0;", "accept", "(Landroid/net/Uri;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class l<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f219014b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f219015c;

    public l(i iVar, boolean z12) {
        this.f219014b = iVar;
        this.f219015c = z12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Uri uri = (Uri) obj;
        i iVar = this.f219014b;
        iVar.ne();
        C23038g0<i.a> c23038g0 = iVar.f218988b0;
        boolean z12 = this.f219015c;
        c23038g0.setValue(new i.a.h(z12));
        if (!z12) {
            i.ke(iVar);
        }
        PhotoPickerViewModel photoPickerViewModel = iVar.f218989c0;
        if (photoPickerViewModel == null) {
            photoPickerViewModel = null;
        }
        PhotoPickerViewModel.Be(photoPickerViewModel, uri, PhotoSource.f216295e, null, 12);
    }
}
