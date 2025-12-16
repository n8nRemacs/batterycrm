package com.avito.android.advert_core.contactbar;

import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.AuthenticateLink;
import com.avito.android.util.rx3.AbstractC35899h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertContactsPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/rx3/h;", "Lcom/avito/android/deep_linking/links/DeepLink;", "progress", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/rx3/h;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class j extends N implements Y41.l<AbstractC35899h<? extends DeepLink>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C28266e f83235l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(C28266e c28266e) {
        super(1);
        this.f83235l = c28266e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(AbstractC35899h<? extends DeepLink> abstractC35899h) {
        AbstractC35899h<? extends DeepLink> abstractC35899h2 = abstractC35899h;
        boolean z12 = abstractC35899h2 instanceof AbstractC35899h.b;
        C28266e c28266e = this.f83235l;
        if (z12) {
            c28266e.e();
            c28266e.h();
            c28266e.d();
            c28266e.g();
            c28266e.c();
            c28266e.f();
            DeepLink deepLinkG = (DeepLink) ((AbstractC35899h.b) abstractC35899h2).f319026a;
            if (deepLinkG instanceof AuthenticateLink) {
                AuthenticateLink authenticateLink = (AuthenticateLink) deepLinkG;
                if (authenticateLink.f133883b == null) {
                    AuthSource authSource = AuthSource.f92694c;
                    deepLinkG = AuthenticateLink.g(authenticateLink);
                }
            }
            c28266e.a(deepLinkG);
            com.avito.android.advert_core.advert.c cVar = c28266e.f83171O;
            if (cVar != null) {
                cVar.la();
            }
        } else if (abstractC35899h2 instanceof AbstractC35899h.c) {
            com.avito.android.advert_core.advert.c cVar2 = c28266e.f83171O;
            if (cVar2 != null) {
                cVar2.t2();
            }
        } else if (abstractC35899h2 instanceof AbstractC35899h.a) {
            com.avito.android.advert_core.advert.c cVar3 = c28266e.f83171O;
            if (cVar3 != null) {
                cVar3.la();
            }
            com.avito.android.advert_core.advert.c cVar4 = c28266e.f83171O;
            if (cVar4 != null) {
                cVar4.ka(((AbstractC35899h.a) abstractC35899h2).f319025a);
            }
        }
        return G0.f406611a;
    }
}
