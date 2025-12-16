package com.avito.android.vas_planning;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.error.z;
import com.avito.android.util.D6;
import com.avito.android.util.P2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VasPlanningView.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/deep_linking/links/DeepLink;", "kotlin.jvm.PlatformType", "deepLinkState", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class n extends N implements Y41.l<P2<? super DeepLink>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o f322445l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar) {
        super(1);
        this.f322445l = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(P2<? super DeepLink> p22) {
        P2<? super DeepLink> p23 = p22;
        boolean z12 = p23 instanceof P2.c;
        o oVar = this.f322445l;
        if (z12) {
            com.avito.android.progress_overlay.l lVar = oVar.f322455j;
            if (lVar == null) {
                lVar = null;
            }
            lVar.k(null);
            D6.w(oVar.f322454i);
        } else if (p23 instanceof P2.a) {
            oVar.b();
            P2.a aVar = (P2.a) p23;
            oVar.a(aVar.f318719a, z.k(aVar.f318719a), null);
        } else if (p23 instanceof P2.b) {
            oVar.f322448c.q5((DeepLink) ((P2.b) p23).f318720a);
            oVar.b();
        }
        return G0.f406611a;
    }
}
