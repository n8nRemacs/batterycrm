package com.avito.android.tns_gallery;

import com.avito.android.remote.model.TnsGalleryImage;
import java.util.List;
import kotlin.Metadata;

/* compiled from: TnsGalleryItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tns_gallery/a;", "LTV0/a;", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements TV0.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f301522b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<TnsGalleryImage> f301523c;

    public a(long j12, @Y61.k List<TnsGalleryImage> list) {
        this.f301522b = j12;
        this.f301523c = list;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF301522b() {
        return this.f301522b;
    }
}
