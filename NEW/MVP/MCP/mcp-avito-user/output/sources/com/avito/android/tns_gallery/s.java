package com.avito.android.tns_gallery;

import android.os.Parcelable;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.TnsGalleryImage;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: TnsGalleryView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tns_gallery/s;", "", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface s {

    /* compiled from: TnsGalleryView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void a(@Y61.l Parcelable parcelable);

    void b(@Y61.k List<TnsGalleryImage> list, @Y61.l Y41.p<? super List<Image>, ? super Integer, G0> pVar, @Y61.l Y41.l<? super Parcelable, G0> lVar);

    void c();
}
