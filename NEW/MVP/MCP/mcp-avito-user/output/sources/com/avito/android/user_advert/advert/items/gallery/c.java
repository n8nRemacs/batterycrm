package com.avito.android.user_advert.advert.items.gallery;

import androidx.compose.foundation.H;
import com.avito.android.remote.model.AddedByAvitoParams;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.NativeVideo;
import com.avito.android.remote.model.Video;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MyAdvertGalleryItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/gallery/c;", "Lcom/avito/conveyor_item/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f309410b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f309411c;

    /* renamed from: d, reason: collision with root package name */
    public final int f309412d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final List<Image> f309413e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Video f309414f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final NativeVideo f309415g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final AddedByAvitoParams f309416h;

    public c(@Y61.k String str, @Y61.k String str2, int i12, @Y61.k List<Image> list, @Y61.l Video video, @Y61.l NativeVideo nativeVideo, @Y61.l AddedByAvitoParams addedByAvitoParams) {
        this.f309410b = str;
        this.f309411c = str2;
        this.f309412d = i12;
        this.f309413e = list;
        this.f309414f = video;
        this.f309415g = nativeVideo;
        this.f309416h = addedByAvitoParams;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f309410b, cVar.f309410b) && L.f(this.f309411c, cVar.f309411c) && this.f309412d == cVar.f309412d && L.f(this.f309413e, cVar.f309413e) && L.f(this.f309414f, cVar.f309414f) && L.f(this.f309415g, cVar.f309415g) && L.f(this.f309416h, cVar.f309416h);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269930b() {
        return getF309410b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF309410b() {
        return this.f309410b;
    }

    public final int hashCode() {
        int iE2 = H.e(androidx.appcompat.app.r.e(this.f309412d, H.d(this.f309410b.hashCode() * 31, 31, this.f309411c), 31), 31, this.f309413e);
        Video video = this.f309414f;
        int iHashCode = (iE2 + (video == null ? 0 : video.hashCode())) * 31;
        NativeVideo nativeVideo = this.f309415g;
        int iHashCode2 = (iHashCode + (nativeVideo == null ? 0 : nativeVideo.hashCode())) * 31;
        AddedByAvitoParams addedByAvitoParams = this.f309416h;
        return iHashCode2 + (addedByAvitoParams != null ? addedByAvitoParams.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "MyAdvertGalleryItem(stringId=" + this.f309410b + ", itemId=" + this.f309411c + ", currentPosition=" + this.f309412d + ", images=" + this.f309413e + ", video=" + this.f309414f + ", nativeVideo=" + this.f309415g + ", addedByAvitoParams=" + this.f309416h + ')';
    }

    public c(String str, String str2, int i12, List list, Video video, NativeVideo nativeVideo, AddedByAvitoParams addedByAvitoParams, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? "user_advert.advert.items.my_advert_gallery_item_id" : str, str2, (i13 & 4) != 0 ? 0 : i12, (i13 & 8) != 0 ? C42784z0.f406748b : list, (i13 & 16) != 0 ? null : video, (i13 & 32) != 0 ? null : nativeVideo, (i13 & 64) != 0 ? null : addedByAvitoParams);
    }
}
