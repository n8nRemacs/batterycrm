package com.avito.android.photo_picker.photo_panel;

import com.avito.android.photo_picker.PhotoPickerViewModel;
import kotlin.Metadata;
import l41.g;

/* compiled from: PhotoPanelViewModel.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "<anonymous parameter 0>", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class c<T> implements g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f219935b;

    public c(b bVar) {
        this.f219935b = bVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        b bVar = this.f219935b;
        PhotoPickerViewModel photoPickerViewModel = bVar.f219930J;
        if (photoPickerViewModel == null) {
            photoPickerViewModel = null;
        }
        bVar.ke(photoPickerViewModel.f218829Y);
    }
}
