package com.avito.android.beduin.common.component.photo_picker;

import android.net.Uri;
import android.os.Parcelable;
import com.avito.android.beduin.common.component.photo_picker.BeduinPhotoPickerModel;
import com.avito.android.photo_cache.EnhanceState;
import com.avito.android.photo_cache.PhotoSource;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35829k2;
import com.avito.android.util.L0;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PhotoInteractorWrapper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/s;", "", "a", "b", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_cache.b f102075a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final L0 f102076b;

    /* compiled from: PhotoInteractorWrapper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/s$a;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return L.f(null, null) && L.f(null, null);
        }

        public final int hashCode() {
            return (0 * 31) + 0;
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PrepareResult(staticImages=");
            sb2.append((Object) null);
            sb2.append(", userImages=");
            return androidx.compose.ui.graphics.colorspace.e.p(sb2, null, ')');
        }
    }

    /* compiled from: PhotoInteractorWrapper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/s$b;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f102077a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ArrayList f102078b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final ArrayList f102079c;

        public b(@Y61.k ArrayList arrayList, @Y61.k ArrayList arrayList2, @Y61.k ArrayList arrayList3) {
            this.f102077a = arrayList;
            this.f102078b = arrayList2;
            this.f102079c = arrayList3;
        }
    }

    @Inject
    public s(@Y61.k com.avito.android.photo_cache.b bVar, @Y61.k L0 l02) {
        this.f102075a = bVar;
        this.f102076b = l02;
    }

    public final ArrayList a(String str, String str2, List list) {
        Long lValueOf;
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        int i12 = 0;
        for (Object obj : list2) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            BeduinPhotoPickerModel.PhotoPickerImage photoPickerImage = (BeduinPhotoPickerModel.PhotoPickerImage) obj;
            Image urls = photoPickerImage.getUrls();
            L0 l02 = this.f102076b;
            Uri uriB = C35829k2.b(urls, l02.c(), l02.d(), 10.0f, 0, 52).b();
            if (uriB == null || photoPickerImage.g() != null) {
                lValueOf = null;
            } else {
                Long id2 = photoPickerImage.getId();
                String string = id2 != null ? id2.toString() : null;
                Parcelable.Creator<PhotoSource> creator = PhotoSource.CREATOR;
                lValueOf = Long.valueOf(this.f102075a.i(str, str2, string, i12, 0, uriB, (384 & 64) != 0 ? null : null, (384 & 512) != 0 ? EnhanceState.f216287c : null));
            }
            arrayList.add(BeduinPhotoPickerModel.PhotoPickerImage.a(photoPickerImage, null, null, null, null, null, lValueOf, null, null, 7679));
            i12 = i13;
        }
        return arrayList;
    }
}
