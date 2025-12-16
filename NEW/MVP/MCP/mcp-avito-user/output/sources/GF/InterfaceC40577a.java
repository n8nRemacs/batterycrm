package gF;

import Y61.k;
import Y61.l;
import android.content.Intent;
import com.avito.android.analytics.provider.clickstream.ParcelableClickStreamEvent;
import com.avito.android.remote.model.Image;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GalleryIntentFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LgF/a;", "", "_avito_gallery_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gF.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC40577a {

    /* compiled from: GalleryIntentFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gF.a$a, reason: collision with other inner class name */
    public static final class C11198a {
    }

    @k
    Intent a(int i12, @k List list);

    @k
    Intent b(@k List<Image> list, int i12, @l ParcelableClickStreamEvent parcelableClickStreamEvent);
}
