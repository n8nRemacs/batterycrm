package com.avito.android.beduin.common.component.photo_picker.items.Photo;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.beduin.common.component.photo_picker.BeduinPhotoPickerModel;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PhotoItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/items/Photo/a;", "Lcom/avito/conveyor_item/a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final BeduinPhotoPickerModel.PhotoPickerImage f101986b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f101987c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f101988d;

    public a(@k BeduinPhotoPickerModel.PhotoPickerImage photoPickerImage, boolean z12) {
        this.f101986b = photoPickerImage;
        this.f101987c = z12;
        this.f101988d = String.valueOf(photoPickerImage.f101921c);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f101986b, aVar.f101986b) && this.f101987c == aVar.f101987c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83624b() {
        return getF101988d().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF101988d() {
        return this.f101988d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f101987c) + (this.f101986b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhotoItem(image=");
        sb2.append(this.f101986b);
        sb2.append(", isStatic=");
        return r.x(sb2, this.f101987c, ')');
    }
}
