package com.avito.android.beduin.common.component.photo_picker;

import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin.common.component.photo_picker.BeduinPhotoPickerModel;
import com.avito.android.beduin_models.BeduinModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PhotoPickerChange.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/PhotoPickerChange;", "", "Lcom/avito/android/beduin/common/component/e$a;", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PhotoPickerChange implements e.a<BeduinPhotoPickerModel> {

    /* renamed from: c, reason: collision with root package name */
    public static final PhotoPickerChange f101938c;

    /* renamed from: d, reason: collision with root package name */
    public static final PhotoPickerChange f101939d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ PhotoPickerChange[] f101940e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f101941f;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final N f101942b;

    /* compiled from: PhotoPickerChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.l<BeduinPhotoPickerModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f101943l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinPhotoPickerModel beduinPhotoPickerModel) {
            BeduinPhotoPickerModel beduinPhotoPickerModel2 = beduinPhotoPickerModel;
            List<BeduinPhotoPickerModel.PhotoPickerImage> listK = beduinPhotoPickerModel2.k();
            if (listK == null) {
                listK = C42784z0.f406748b;
            }
            List<BeduinPhotoPickerModel.PhotoPickerImage> listL = beduinPhotoPickerModel2.l();
            if (listL == null) {
                listL = C42784z0.f406748b;
            }
            return C42745f0.U(listK, listL);
        }
    }

    /* compiled from: PhotoPickerChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.l<BeduinPhotoPickerModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f101944l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinPhotoPickerModel beduinPhotoPickerModel) {
            return beduinPhotoPickerModel.f101914d;
        }
    }

    static {
        PhotoPickerChange photoPickerChange = new PhotoPickerChange(0, a.f101943l, "Images");
        f101938c = photoPickerChange;
        PhotoPickerChange photoPickerChange2 = new PhotoPickerChange(1, b.f101944l, "ErrorState");
        f101939d = photoPickerChange2;
        PhotoPickerChange[] photoPickerChangeArr = {photoPickerChange, photoPickerChange2};
        f101940e = photoPickerChangeArr;
        f101941f = kotlin.enums.c.a(photoPickerChangeArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PhotoPickerChange(int i12, Y41.l lVar, String str) {
        this.f101942b = (N) lVar;
    }

    public static PhotoPickerChange valueOf(String str) {
        return (PhotoPickerChange) Enum.valueOf(PhotoPickerChange.class, str);
    }

    public static PhotoPickerChange[] values() {
        return (PhotoPickerChange[]) f101940e.clone();
    }

    @Override // com.avito.android.beduin.common.component.e.a
    public final BeduinModel a(BeduinModel beduinModel) {
        return BeduinPhotoPickerModel.d((BeduinPhotoPickerModel) beduinModel, null, null, null, null, null, null, null, 4083);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l<com.avito.android.beduin.common.component.photo_picker.BeduinPhotoPickerModel, java.lang.Object>, kotlin.jvm.internal.N] */
    @Y61.k
    public final Y41.l<BeduinPhotoPickerModel, Object> b() {
        return this.f101942b;
    }
}
