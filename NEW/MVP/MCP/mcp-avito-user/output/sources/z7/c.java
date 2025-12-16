package z7;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.Z0;
import com.avito.android.remote.anchors.AnchorTrustFactors;
import com.avito.android.remote.model.AdvertDetails;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.reflect.n;

/* compiled from: AdvertDetailsTopBarPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz7/c;", "Lz7/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.advert.item.anchor_trust_factors.topbar.a f443837a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Z0 f443838b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public com.avito.android.advert.item.anchor_trust_factors.topbar.a f443839c;

    @Inject
    public c(@k com.avito.android.advert.item.anchor_trust_factors.topbar.a aVar, @k Z0 z02) {
        this.f443837a = aVar;
        this.f443838b = z02;
    }

    @Override // z7.b
    public final void a(int i12, int i13) {
        com.avito.android.advert.item.anchor_trust_factors.topbar.a aVar = this.f443839c;
        if (aVar != null) {
            aVar.a(i12, i13);
        }
    }

    @Override // z7.b
    public final void f(@k AdvertDetails advertDetails) {
        Z0 z02 = this.f443838b;
        z02.getClass();
        n<Object> nVar = Z0.f67595D[13];
        if (((Boolean) z02.f67613p.a().getValue()).booleanValue()) {
            AnchorTrustFactors anchorTrustFactors = advertDetails.getAnchorTrustFactors();
            if (anchorTrustFactors != null ? L.f(anchorTrustFactors.getIsFloatingAnchorsEnabled(), Boolean.TRUE) : false) {
                com.avito.android.advert.item.anchor_trust_factors.topbar.a aVar = this.f443837a;
                this.f443839c = aVar;
                if (aVar != null) {
                    aVar.g(advertDetails);
                }
                com.avito.android.advert.item.anchor_trust_factors.topbar.a aVar2 = this.f443839c;
                if (aVar2 != null) {
                    aVar2.f(advertDetails);
                }
            }
        }
    }
}
