package C4;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.similars.j;
import com.avito.android.advert_core.blocks.g;
import com.avito.android.advert_core.divider.AdvertDetailsDividerItem;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsDividerItemFactoryImpl.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LC4/a;", "Lcom/avito/android/advert_core/blocks/g;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final j f1902a;

    @Inject
    public a(@k j jVar) {
        this.f1902a = jVar;
    }

    @Override // com.avito.android.advert_core.blocks.g
    @k
    public final AdvertDetailsDividerItem a(int i12) {
        return new AdvertDetailsDividerItem(0L, null, i12, i12, this.f1902a.a(), null, null, null, 227, null);
    }
}
