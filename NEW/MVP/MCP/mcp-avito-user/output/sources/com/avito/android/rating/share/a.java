package com.avito.android.rating.share;

import Y61.k;
import Y61.l;
import com.avito.android.adapter.gallery.GalleryItem;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: GallerySharingImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/share/a;", "LPv0/b;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements Pv0.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AtomicReference<GalleryItem> f247638a = new AtomicReference<>(null);

    @Inject
    public a() {
    }

    @Override // Pv0.b
    public final void a(@k GalleryItem galleryItem) {
        this.f247638a.set(galleryItem);
    }

    @Override // Pv0.b
    @l
    public final GalleryItem read() {
        return this.f247638a.get();
    }
}
