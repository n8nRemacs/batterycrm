package com.avito.android.categories_global.mvi;

import Kn.C14332b;
import Kn.InterfaceC14331a;
import Ln.C14417b;
import Ln.InterfaceC14416a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.categories_global.mvi.entity.CategoriesInternalAction;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.Collection;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CategoriesActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/categories_global/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LLn/a;", "Lcom/avito/android/categories_global/mvi/entity/CategoriesInternalAction;", "LLn/e;", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC14416a, CategoriesInternalAction, Ln.e> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14331a f116402a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C14332b f116403b;

    @Inject
    public a(@Y61.k InterfaceC14331a interfaceC14331a, @Y61.k C14332b c14332b) {
        this.f116402a = interfaceC14331a;
        this.f116403b = c14332b;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<CategoriesInternalAction> b(InterfaceC14416a interfaceC14416a, Ln.e eVar) {
        C43210w c43210w;
        CategoriesInternalAction openDeeplink;
        InterfaceC14416a interfaceC14416a2 = interfaceC14416a;
        Ln.e eVar2 = eVar;
        if (interfaceC14416a2.equals(InterfaceC14416a.C0631a.f10102a)) {
            return new C43210w(CategoriesInternalAction.NavigateBack.f116422b);
        }
        boolean z12 = interfaceC14416a2 instanceof InterfaceC14416a.c;
        C14417b c14417b = eVar2.f10120d;
        InterfaceC14331a interfaceC14331a = this.f116402a;
        if (z12) {
            C14417b c14417b2 = ((InterfaceC14416a.c) interfaceC14416a2).f10104a;
            if (((Collection) c14417b2.f10109d.f10113a).isEmpty()) {
                C14417b.a aVar = c14417b2.f10110e;
                DeepLink deepLink = aVar != null ? aVar.f10112b : null;
                openDeeplink = deepLink != null ? new CategoriesInternalAction.OpenDeeplink(deepLink) : new CategoriesInternalAction.ShowErrorToast();
            } else {
                interfaceC14331a.b(c14417b);
                openDeeplink = new CategoriesInternalAction.OpenDestination(com.avito.android.categories_global.i.a(com.avito.android.categories_global.i.f116385a, c14417b2.f10107b, null, 2));
            }
            c43210w = new C43210w(openDeeplink);
        } else {
            if (interfaceC14416a2.equals(InterfaceC14416a.d.f10105a)) {
                C14332b c14332b = this.f116403b;
                return interfaceC14331a.a(c14332b.f9652b, c14332b.f9651a);
            }
            if (!interfaceC14416a2.equals(InterfaceC14416a.b.f10103a)) {
                throw new NoWhenBranchMatchedException();
            }
            C14417b.a aVar2 = c14417b.f10110e;
            if (aVar2 == null) {
                return C43175k.w();
            }
            c43210w = new C43210w(new CategoriesInternalAction.OpenDeeplink(aVar2.f10112b));
        }
        return c43210w;
    }
}
