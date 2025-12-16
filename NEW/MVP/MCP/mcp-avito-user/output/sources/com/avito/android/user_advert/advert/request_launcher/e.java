package com.avito.android.user_advert.advert.request_launcher;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.AddedByAvitoParams;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.NativeVideo;
import com.avito.android.remote.model.Video;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MyAdvertPhotoGalleryRequestLauncher.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/request_launcher/e;", "", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Video f310599a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final NativeVideo f310600b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<Image> f310601c;

    /* renamed from: d, reason: collision with root package name */
    public final int f310602d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AddedByAvitoParams f310603e;

    public e(@l Video video, @l NativeVideo nativeVideo, @k List<Image> list, int i12, @l AddedByAvitoParams addedByAvitoParams) {
        this.f310599a = video;
        this.f310600b = nativeVideo;
        this.f310601c = list;
        this.f310602d = i12;
        this.f310603e = addedByAvitoParams;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f310599a, eVar.f310599a) && L.f(this.f310600b, eVar.f310600b) && L.f(this.f310601c, eVar.f310601c) && this.f310602d == eVar.f310602d && L.f(this.f310603e, eVar.f310603e);
    }

    public final int hashCode() {
        Video video = this.f310599a;
        int iHashCode = (video == null ? 0 : video.hashCode()) * 31;
        NativeVideo nativeVideo = this.f310600b;
        int iE2 = r.e(this.f310602d, H.e((iHashCode + (nativeVideo == null ? 0 : nativeVideo.hashCode())) * 31, 31, this.f310601c), 31);
        AddedByAvitoParams addedByAvitoParams = this.f310603e;
        return iE2 + (addedByAvitoParams != null ? addedByAvitoParams.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "MyAdvertPhotoGalleryRequestInput(video=" + this.f310599a + ", nativeVideo=" + this.f310600b + ", images=" + this.f310601c + ", currentItem=" + this.f310602d + ", addedByAvitoParams=" + this.f310603e + ')';
    }
}
