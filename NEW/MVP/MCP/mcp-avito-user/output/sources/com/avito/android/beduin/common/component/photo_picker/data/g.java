package com.avito.android.beduin.common.component.photo_picker.data;

import com.avito.android.advert.deeplinks.delivery.p;
import com.avito.android.beduin.common.component.photo_picker.BeduinPhotoPickerModel;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.o;

/* compiled from: BeduinPhotoPickerInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/io/File;", "file", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerImage;", "apply", "(Ljava/io/File;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class g<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f101969b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BeduinPhotoPickerModel.ImageUploadParams f101970c;

    public g(d dVar, BeduinPhotoPickerModel.ImageUploadParams imageUploadParams) {
        this.f101969b = dVar;
        this.f101970c = imageUploadParams;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return new C42007e(new p(this.f101969b, this.f101970c, (File) obj, 4));
    }
}
