package com.avito.android.beduin.common.component.photo_picker;

import com.avito.android.beduin.common.component.photo_picker.BeduinPhotoPickerModel;
import com.avito.android.util.P2;
import java.util.Optional;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: BeduinPhotoPickerViewModel.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/util/P2;", "Lkotlin/G0;", "it", "Lkotlin/Q;", "Ljava/util/Optional;", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$ImageDeleteParams;", "apply", "(Lcom/avito/android/util/P2;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class q<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Optional<BeduinPhotoPickerModel.ImageDeleteParams> f102069b;

    public q(Optional<BeduinPhotoPickerModel.ImageDeleteParams> optional) {
        this.f102069b = optional;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return new Q((P2) obj, this.f102069b);
    }
}
