package com.avito.android.beduin.common.component.photo_picker;

import com.avito.android.beduin.common.component.photo_picker.BeduinPhotoPickerModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: BeduinPhotoPickerComponent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/PhotoPickerChange;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/component/photo_picker/PhotoPickerChange;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.beduin.common.component.photo_picker.e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28799e extends N implements Y41.l<PhotoPickerChange, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f101976l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C28795a f101977m;

    /* compiled from: BeduinPhotoPickerComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.photo_picker.e$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[PhotoPickerChange.values().length];
            try {
                iArr[PhotoPickerChange.f101938c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PhotoPickerChange.f101939d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28799e(j jVar, C28795a c28795a) {
        super(1);
        this.f101976l = jVar;
        this.f101977m = c28795a;
    }

    @Override // Y41.l
    public final G0 invoke(PhotoPickerChange photoPickerChange) {
        int iOrdinal = photoPickerChange.ordinal();
        C28795a c28795a = this.f101977m;
        j jVar = this.f101976l;
        if (iOrdinal == 0) {
            jVar.setImages(c28795a.f101946f);
        } else if (iOrdinal == 1) {
            BeduinPhotoPickerModel.ErrorState errorState = c28795a.f101946f.f101914d;
            com.avito.konveyor.adapter.d dVar = jVar.f102025F0;
            List<T> list = dVar.f53650c.f53994f;
            int size = list.size() - 1;
            TV0.a aVar = (TV0.a) C42745f0.Q(list);
            if (aVar instanceof com.avito.android.beduin.common.component.photo_picker.items.Placeholder.a) {
                com.avito.android.beduin.common.component.photo_picker.items.Placeholder.a aVar2 = new com.avito.android.beduin.common.component.photo_picker.items.Placeholder.a(((com.avito.android.beduin.common.component.photo_picker.items.Placeholder.a) aVar).f102010b, errorState != null ? errorState.f101918b : false, errorState != null ? errorState.f101919c : null);
                ArrayList arrayList = new ArrayList(dVar.f53650c.f53994f);
                arrayList.set(size, aVar2);
                jVar.f102025F0.l(arrayList, new com.avito.android.app.coldstart.d(jVar, 7));
            }
        }
        return G0.f406611a;
    }
}
