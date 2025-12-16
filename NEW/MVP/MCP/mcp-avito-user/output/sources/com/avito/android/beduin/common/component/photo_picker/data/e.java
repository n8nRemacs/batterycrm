package com.avito.android.beduin.common.component.photo_picker.data;

import kotlin.G0;
import kotlin.Metadata;
import l41.o;

/* compiled from: BeduinPhotoPickerInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/data/i;", "it", "Lkotlin/G0;", "apply", "(Lcom/avito/android/beduin/common/component/photo_picker/data/i;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public static final e<T, R> f101967b = new e<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        if (((i) obj).getSuccess()) {
            return G0.f406611a;
        }
        throw new IllegalStateException("Check failed.");
    }
}
