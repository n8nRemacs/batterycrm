package com.avito.android.beduin.common.component.photo_picker;

import com.avito.android.beduin.common.component.photo_picker.BeduinPhotoPickerModel;
import com.avito.android.photo_picker.converter.ImageConvertOptions;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UploadConverterProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/C;", "Lcom/avito/android/beduin/common/component/photo_picker/B;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class C implements B {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_picker.converter.b f101932a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final N70.b f101933b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f101934c = C42727D.c(new a());

    /* compiled from: UploadConverterProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/photo_picker/converter/d;", "invoke", "()Lcom/avito/android/photo_picker/converter/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<com.avito.android.photo_picker.converter.d> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.photo_picker.converter.d invoke() {
            ImageConvertOptions imageConvertOptions = new ImageConvertOptions(3000, 4000, 90, 4194304);
            C c12 = C.this;
            return new com.avito.android.photo_picker.converter.d(c12.f101932a, imageConvertOptions, c12.f101933b);
        }
    }

    @Inject
    public C(@Y61.k com.avito.android.photo_picker.converter.b bVar, @Y61.k N70.b bVar2) {
        this.f101932a = bVar;
        this.f101933b = bVar2;
    }

    @Override // com.avito.android.beduin.common.component.photo_picker.B
    @Y61.k
    public final com.avito.android.photo_picker.converter.d a(@Y61.k BeduinPhotoPickerModel.ImageUploadParams imageUploadParams) {
        if (imageUploadParams.getSize() == null) {
            return (com.avito.android.photo_picker.converter.d) this.f101934c.getValue();
        }
        return new com.avito.android.photo_picker.converter.d(this.f101932a, new ImageConvertOptions(imageUploadParams.getSize().getHeight(), imageUploadParams.getSize().getWidth(), 90, 4194304), this.f101933b);
    }
}
