package com.avito.android.photo_picker.legacy;

import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PhotoPickerInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/legacy/e;", "", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.photo_picker.legacy.e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC33243e {
    @Y61.k
    io.reactivex.rxjava3.internal.operators.single.M a();

    void b(@Y61.k String str);

    @Y61.k
    C41982q1 c(@Y61.k Iterable iterable);

    @Y61.k
    io.reactivex.rxjava3.internal.operators.completable.M commit();

    @Y61.k
    io.reactivex.rxjava3.internal.operators.single.M d(@Y61.k ArrayList arrayList);

    @Y61.k
    io.reactivex.rxjava3.internal.operators.single.W e(@Y61.k List list);

    void f(int i12, int i13);

    @Y61.k
    PhotoPickerInteractorState getState();
}
