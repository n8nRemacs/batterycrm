package com.avito.android.photo_picker;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: PhotoPickerViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lio/reactivex/rxjava3/core/O;", "apply", "(Z)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class I<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PhotoPickerViewModel f218757b;

    public I(PhotoPickerViewModel photoPickerViewModel) {
        this.f218757b = photoPickerViewModel;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Boolean bool = (Boolean) obj;
        boolean zBooleanValue = bool.booleanValue();
        PhotoPickerViewModel photoPickerViewModel = this.f218757b;
        photoPickerViewModel.getClass();
        return zBooleanValue ? io.reactivex.rxjava3.core.I.q(bool).g(3L, TimeUnit.SECONDS, photoPickerViewModel.f218814J.c()) : io.reactivex.rxjava3.core.I.q(bool);
    }
}
