package M4;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.blocks.a;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AdvertDetailsBrandingAdvantagesBlockFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LM4/a;", "Lcom/avito/android/advert_core/blocks/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements com.avito.android.advert_core.blocks.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final P4.a f10375a;

    @Inject
    public a(@k P4.a aVar) {
        this.f10375a = aVar;
    }

    @Override // com.avito.android.advert_core.blocks.a
    @k
    public final List<PersistableSpannedItem> a(@k a.b bVar) {
        return C42745f0.V(this.f10375a.a(bVar.f83013a.f82645b));
    }

    @Override // com.avito.android.advert_core.blocks.a
    @l
    public final List<PersistableSpannedItem> b(@k a.b bVar) {
        return a.C2462a.a(this, bVar);
    }

    @Override // com.avito.android.advert_core.blocks.a
    public final boolean c(@k a.b bVar) {
        return true;
    }
}
