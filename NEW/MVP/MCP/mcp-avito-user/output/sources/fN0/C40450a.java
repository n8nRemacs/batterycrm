package fn0;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import com.avito.android.adapter.gallery.GalleryItem;
import com.avito.android.review_gallery.ReviewGalleryActivity;
import com.avito.android.review_gallery.i;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ReviewGalleryIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfn0/a;", "Lcom/avito/android/review_gallery/i;", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fn0.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C40450a implements i {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f396073a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Pv0.b f396074b;

    @Inject
    public C40450a(@k Context context, @k Pv0.b bVar) {
        this.f396073a = context;
        this.f396074b = bVar;
    }

    @Override // com.avito.android.review_gallery.i
    @k
    public final Intent a(@k GalleryItem galleryItem, int i12, @l String str, @k String str2) {
        this.f396074b.a(galleryItem);
        ReviewGalleryActivity.f255437y.getClass();
        Intent intent = new Intent(this.f396073a, (Class<?>) ReviewGalleryActivity.class);
        intent.putExtra("item_id", str);
        intent.putExtra("position", i12);
        intent.putExtra("from_page", str2);
        return intent;
    }
}
