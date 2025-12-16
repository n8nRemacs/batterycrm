package com.avito.android.photo_picker;

import com.avito.android.photo_picker.PhotoPickerViewModel;
import com.avito.android.util.V2;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PhotoPickerViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class K extends kotlin.jvm.internal.N implements Y41.l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PhotoPickerViewModel f218759l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(PhotoPickerViewModel photoPickerViewModel) {
        super(1);
        this.f218759l = photoPickerViewModel;
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        V2.f318762a.a("DEFAULT_TAG", "Can't save photos to db", th2);
        this.f218759l.f218825U.setValue(PhotoPickerViewModel.a.d.f218847a);
        return G0.f406611a;
    }
}
