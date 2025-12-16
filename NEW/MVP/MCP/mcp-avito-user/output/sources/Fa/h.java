package fa;

import Y61.k;
import com.avito.android.remote.model.grid_gallery.GridGallery;
import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.google.gson.r;
import com.yandex.div2.D8;
import dagger.internal.t;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;

/* compiled from: AdvertDetailsJsonModule_ProvideGridGalleryTypeAdapterFactoriesFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfa/h;", "Ldagger/internal/h;", "", "Lcom/google/gson/r;", "LX41/o;", "<init>", "()V", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements dagger.internal.h<Set<r>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final h f395953a = new h();

    @Override // javax.inject.Provider
    public final Object get() {
        g.f395952a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, GridGallery.Row.class);
        optimalRuntimeTypeAdapterFactoryA.b(GridGallery.Row.SingleItem.class, "singleItem");
        optimalRuntimeTypeAdapterFactoryA.b(GridGallery.Row.DoubleItem.class, "doubleItem");
        optimalRuntimeTypeAdapterFactoryA.b(GridGallery.Row.BeduinTeaser.class, "teaserItem");
        Set setL0 = C42756l.l0(new OptimalRuntimeTypeAdapterFactory[]{optimalRuntimeTypeAdapterFactoryA, D8.k(GridGallery.RowItem.class, GridGallery.RowItem.Photo.class, "photo", GridGallery.RowItem.Video.class, "video"), D8.k(GridGallery.BottomBar.class, GridGallery.BottomBar.SingleButton.class, "singleButton", GridGallery.BottomBar.DoubleButton.class, "doubleButtons")});
        t.b(setL0, "Cannot return null from a non-@Nullable @Provides method");
        return setL0;
    }
}
