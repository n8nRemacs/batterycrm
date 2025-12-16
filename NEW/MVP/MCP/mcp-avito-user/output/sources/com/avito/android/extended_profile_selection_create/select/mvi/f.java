package com.avito.android.extended_profile_selection_create.select.mvi;

import RA.a;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.extended_profile_selection_create.ExtendedProfileSelectionCreateConfig;
import com.avito.android.extended_profile_selection_create.select.InterfaceC30498c;
import com.avito.android.extended_profile_selection_create.select.mvi.entity.ExtendedProfileSelectionCreateInternalAction;
import com.avito.android.extended_profile_selection_create.select.mvi.entity.ExtendedProfileSelectionCreateState;
import com.avito.android.remote.model.SearchParams;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ExtendedProfileSelectionCreateActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/mvi/f;", "Lcom/avito/android/arch/mvi/a;", "LRA/a;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateState;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements com.avito.android.arch.mvi.a<RA.a, ExtendedProfileSelectionCreateInternalAction, ExtendedProfileSelectionCreateState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ExtendedProfileSelectionCreateConfig f152371a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30498c f152372b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f152373c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final E f152374d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f152375e;

    @Inject
    public f(@Y61.k ExtendedProfileSelectionCreateConfig extendedProfileSelectionCreateConfig, @Y61.k InterfaceC30498c interfaceC30498c, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k E e12, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f152371a = extendedProfileSelectionCreateConfig;
        this.f152372b = interfaceC30498c;
        this.f152373c = aVar;
        this.f152374d = e12;
        this.f152375e = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ExtendedProfileSelectionCreateInternalAction> b(RA.a aVar, ExtendedProfileSelectionCreateState extendedProfileSelectionCreateState) {
        C43210w c43210w;
        RA.a aVar2 = aVar;
        ExtendedProfileSelectionCreateState extendedProfileSelectionCreateState2 = extendedProfileSelectionCreateState;
        if (aVar2 instanceof a.c) {
            return C43175k.G(new b(2, null));
        }
        if (aVar2 instanceof a.m) {
            return C43175k.G(new c(aVar2, extendedProfileSelectionCreateState2, this, null));
        }
        boolean z12 = aVar2 instanceof a.C0943a;
        Set<Long> set = extendedProfileSelectionCreateState2.f152355p;
        ExtendedProfileSelectionCreateConfig extendedProfileSelectionCreateConfig = this.f152371a;
        if (z12) {
            return (set.size() < extendedProfileSelectionCreateConfig.f151617h || set.contains(Long.valueOf(((a.C0943a) aVar2).f14163a.f152038d))) ? new C43210w(new ExtendedProfileSelectionCreateInternalAction.SelectAdvert(((a.C0943a) aVar2).f14163a)) : C43175k.w();
        }
        boolean z13 = aVar2 instanceof a.i;
        InterfaceC30498c interfaceC30498c = this.f152372b;
        SearchParams searchParams = extendedProfileSelectionCreateState2.f152343d;
        int i12 = extendedProfileSelectionCreateState2.f152350k;
        Long l12 = extendedProfileSelectionCreateState2.f152352m;
        if (z13) {
            ExtendedProfileSelectionCreateState.a aVar3 = extendedProfileSelectionCreateState2.f152363x;
            return (aVar3 != null ? aVar3.f152370b : null) == ExtendedProfileSelectionCreateState.ErrorAction.f152365b ? interfaceC30498c.b(l12) : ((a.i) aVar2).f14171a ? InterfaceC30498c.a.a(interfaceC30498c, 0, searchParams, 5) : InterfaceC30498c.a.a(interfaceC30498c, i12 + 1, searchParams, 4);
        }
        if (aVar2 instanceof a.b) {
            return interfaceC30498c.c(i12 + 1, searchParams, false);
        }
        if (aVar2 instanceof a.d) {
            return C43175k.G(new a(this, extendedProfileSelectionCreateState2, null));
        }
        if (aVar2 instanceof a.h) {
            return C43175k.G(new d(aVar2, this, null));
        }
        if (aVar2 instanceof a.g) {
            b.a.a(this.f152373c, ((a.g) aVar2).f14169a, null, null, 6);
            return C43175k.w();
        }
        if (aVar2 instanceof a.l) {
            DeepLink deepLink = ((a.l) aVar2).f14174a;
            return deepLink instanceof ItemsSearchLink ? InterfaceC30498c.a.a(interfaceC30498c, 0, ((ItemsSearchLink) deepLink).f133403b, 1) : C43175k.G(new e(aVar2, this, null));
        }
        if (!(aVar2 instanceof a.k)) {
            boolean z14 = aVar2 instanceof a.f;
            InterfaceC28373a interfaceC28373a = this.f152375e;
            E e12 = this.f152374d;
            if (z14) {
                if (set.size() < 3 || set.size() > extendedProfileSelectionCreateConfig.f151617h) {
                    c43210w = new C43210w(ExtendedProfileSelectionCreateInternalAction.HighlightContinueText.f152329b);
                } else {
                    boolean zEquals = set.equals(extendedProfileSelectionCreateState2.f152354o);
                    Long l13 = extendedProfileSelectionCreateConfig.f151619j;
                    String str = extendedProfileSelectionCreateState2.f152353n;
                    if (!zEquals || str == null || l12 == null) {
                        String strA = e12.a();
                        if (strA != null) {
                            interfaceC28373a.c(new IA.e(strA, set.size(), l13 != null));
                        }
                        return interfaceC30498c.a(set, l12, str);
                    }
                    String strA2 = e12.a();
                    if (strA2 != null) {
                        interfaceC28373a.c(new IA.e(strA2, set.size(), l13 != null));
                    }
                    c43210w = new C43210w(new ExtendedProfileSelectionCreateInternalAction.CreateSelectionSuccess(str, false, l12.longValue()));
                }
            } else {
                if (aVar2 instanceof a.j) {
                    return InterfaceC30498c.a.a(interfaceC30498c, 0, new SearchParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1, null), 5);
                }
                if (aVar2 instanceof a.o) {
                    c43210w = new C43210w(ExtendedProfileSelectionCreateInternalAction.ShowMoreActions.f152338b);
                } else if (aVar2 instanceof a.e) {
                    c43210w = new C43210w(ExtendedProfileSelectionCreateInternalAction.CloseSelectionMenu.f152320b);
                } else if (aVar2 instanceof a.n) {
                    String strA3 = e12.a();
                    if (strA3 != null) {
                        interfaceC28373a.c(new IA.d(strA3, true, extendedProfileSelectionCreateConfig.f151619j != null));
                    }
                    c43210w = new C43210w(ExtendedProfileSelectionCreateInternalAction.SelectAll.f152334b);
                } else {
                    if (!(aVar2 instanceof a.p)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String strA4 = e12.a();
                    if (strA4 != null) {
                        interfaceC28373a.c(new IA.d(strA4, false, extendedProfileSelectionCreateConfig.f151619j != null));
                    }
                    c43210w = new C43210w(ExtendedProfileSelectionCreateInternalAction.UnselectAll.f152339b);
                }
            }
        } else {
            if (extendedProfileSelectionCreateState2.f152356q) {
                return InterfaceC30498c.a.a(interfaceC30498c, 0, new SearchParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1, null), 5);
            }
            c43210w = new C43210w(ExtendedProfileSelectionCreateInternalAction.UpdateItems.f152340b);
        }
        return c43210w;
    }
}
