package com.avito.android.authorization.confirm_3fa.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.authorization.confirm_3fa.mvi.entity.ConfirmEmailListInternalAction;
import ge.C40667c;
import ge.InterfaceC40665a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ConfirmEmailListActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/authorization/confirm_3fa/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "Lge/a;", "Lcom/avito/android/authorization/confirm_3fa/mvi/entity/ConfirmEmailListInternalAction;", "Lge/c;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC40665a, ConfirmEmailListInternalAction, C40667c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final j f93599a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f93600b;

    @Inject
    public b(@Y61.k j jVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f93599a = jVar;
        this.f93600b = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ConfirmEmailListInternalAction> b(InterfaceC40665a interfaceC40665a, C40667c c40667c) {
        InterfaceC40665a interfaceC40665a2 = interfaceC40665a;
        if (interfaceC40665a2 instanceof InterfaceC40665a.C11215a) {
            return C43175k.G(new a(interfaceC40665a2, this, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
