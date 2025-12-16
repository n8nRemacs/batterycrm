package C4;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.similars.j;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.blocks.h;
import com.avito.android.advert_core.gap.AdvertDetailsGapItem;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsGapItemFactoryImpl.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LC4/c;", "Lcom/avito/android/advert_core/blocks/h;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final j f1904a;

    @Inject
    public c(@k j jVar) {
        this.f1904a = jVar;
    }

    @Override // com.avito.android.advert_core.blocks.h
    @k
    public final AdvertDetailsGapItem a(int i12) {
        AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
        return new AdvertDetailsGapItem(52, null, i12, this.f1904a.a(), null, null, 50, null);
    }
}
