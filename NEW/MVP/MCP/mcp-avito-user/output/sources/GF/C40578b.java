package gF;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import com.avito.android.analytics.provider.clickstream.ParcelableClickStreamEvent;
import com.avito.android.gallery.ui.PhotoGalleryActivity;
import com.avito.android.gallery.ui.PhotoGalleryOpenParams;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35961v3;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GalleryIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LgF/b;", "LgF/a;", "_avito_gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gF.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C40578b implements InterfaceC40577a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f396410a;

    @Inject
    public C40578b(@k Context context) {
        this.f396410a = context;
    }

    @Override // gF.InterfaceC40577a
    @k
    public final Intent a(int i12, @k List list) {
        return b(list, i12, null);
    }

    @Override // gF.InterfaceC40577a
    @k
    public final Intent b(@k List<Image> list, int i12, @l ParcelableClickStreamEvent parcelableClickStreamEvent) {
        PhotoGalleryOpenParams photoGalleryOpenParams = new PhotoGalleryOpenParams(list, i12, parcelableClickStreamEvent);
        PhotoGalleryActivity.f159233u.getClass();
        Intent intent = new Intent(this.f396410a, (Class<?>) PhotoGalleryActivity.class);
        C35961v3.b(intent, photoGalleryOpenParams);
        return intent;
    }
}
