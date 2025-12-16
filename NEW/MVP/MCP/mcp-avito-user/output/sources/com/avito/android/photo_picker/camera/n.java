package com.avito.android.photo_picker.camera;

import com.avito.android.R;
import com.avito.android.photo_picker.FlashMode;
import com.avito.android.photo_picker.PhotoPickerViewModel;
import com.avito.android.photo_picker.camera.i;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;

/* compiled from: CameraViewModel.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class n<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f219017b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FlashMode f219018c;

    public n(i iVar, FlashMode flashMode) {
        this.f219017b = iVar;
        this.f219018c = flashMode;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        int i12;
        i iVar = this.f219017b;
        PhotoPickerViewModel photoPickerViewModel = iVar.f218989c0;
        (photoPickerViewModel == null ? null : photoPickerViewModel).f218830Z = this.f219018c;
        if (photoPickerViewModel == null) {
            photoPickerViewModel = null;
        }
        FlashMode flashMode = photoPickerViewModel.f218830Z;
        if (L.f(flashMode, FlashMode.Off.f218749c)) {
            i12 = R.drawable.ic_light_off;
        } else if (L.f(flashMode, FlashMode.ForceOn.f218748c)) {
            i12 = R.drawable.ic_light_on;
        } else {
            if (!L.f(flashMode, FlashMode.Auto.f218747c)) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = R.drawable.ic_light_auto;
        }
        iVar.f218988b0.setValue(new i.a.C6575a(i12));
    }
}
