package com.avito.android.tariff_lf_publication.level.mvi;

import UD0.a;
import UD0.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.tariff_lf_publication.level.mvi.entity.TariffLfPublicationLevelInternalAction;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import wZ.C49580d;

/* compiled from: TariffLfPublicationLevelActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff_lf_publication/level/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LUD0/a;", "Lcom/avito/android/tariff_lf_publication/level/mvi/entity/TariffLfPublicationLevelInternalAction;", "LUD0/c;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements com.avito.android.arch.mvi.a<UD0.a, TariffLfPublicationLevelInternalAction, UD0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_lf_publication.level.domain.a f300922a;

    @Inject
    public c(@Y61.k com.avito.android.tariff_lf_publication.level.domain.a aVar) {
        this.f300922a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return com.avito.android.arch.mvi.utils.h.e(c43197r1, a.f300919l, new b(this, aVar), 1000L);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<TariffLfPublicationLevelInternalAction> b(@Y61.k UD0.a aVar, @Y61.k UD0.c cVar) {
        C43210w c43210w;
        Object next;
        if (aVar instanceof a.C1108a) {
            return new C43210w(TariffLfPublicationLevelInternalAction.Back.f300925b);
        }
        if (aVar instanceof a.f) {
            return this.f300922a.invoke();
        }
        if (aVar instanceof a.e) {
            C49580d c49580d = cVar.f16282f;
            DeepLink deepLink = c49580d != null ? c49580d.f441551b : null;
            Iterator<T> it = cVar.f16280d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((c.b) next).f16287c) {
                    break;
                }
            }
            c.b bVar = (c.b) next;
            Long lValueOf = bVar != null ? Long.valueOf(bVar.f16288d) : null;
            if (deepLink == null || cVar.f16285i) {
                return C43175k.w();
            }
            c43210w = new C43210w(new TariffLfPublicationLevelInternalAction.HandleDeeplink(lValueOf, deepLink));
        } else if (aVar instanceof a.d) {
            c43210w = new C43210w(new TariffLfPublicationLevelInternalAction.LevelClicked(((a.d) aVar).f16270a));
        } else if (aVar instanceof a.b) {
            c43210w = new C43210w(new TariffLfPublicationLevelInternalAction.HandleDeeplink(null, ((a.b) aVar).f16268a));
        } else {
            if (!(aVar instanceof a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(new TariffLfPublicationLevelInternalAction.DeepLinkLoading(((a.c) aVar).f16269a));
        }
        return c43210w;
    }
}
