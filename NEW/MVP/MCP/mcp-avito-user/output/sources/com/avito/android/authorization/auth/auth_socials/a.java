package com.avito.android.authorization.auth.auth_socials;

import ae.C19875c;
import be.C25637d;
import be.InterfaceC25634a;
import be.InterfaceC25635b;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.authorization.auth.auth_socials.entity.AuthSocialsInternalAction;
import he.C40919b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AuthSocialsActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/authorization/auth/auth_socials/a;", "Lcom/avito/android/arch/mvi/a;", "Lbe/b;", "Lcom/avito/android/authorization/auth/auth_socials/entity/AuthSocialsInternalAction;", "Lbe/d;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC25635b, AuthSocialsInternalAction, C25637d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f92883a;

    @Inject
    public a(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f92883a = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<AuthSocialsInternalAction> b(InterfaceC25635b interfaceC25635b, C25637d c25637d) {
        InterfaceC25635b interfaceC25635b2 = interfaceC25635b;
        if (!(interfaceC25635b2 instanceof InterfaceC25635b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC25634a interfaceC25634a = ((InterfaceC25635b.a) interfaceC25635b2).f57306a;
        if (interfaceC25634a instanceof InterfaceC25634a.c) {
            return C43175k.w();
        }
        boolean z12 = interfaceC25634a instanceof InterfaceC25634a.b;
        InterfaceC28373a interfaceC28373a = this.f92883a;
        if (z12) {
            InterfaceC25634a.b bVar = (InterfaceC25634a.b) interfaceC25634a;
            interfaceC28373a.c(new C19875c("auth", bVar.f57298a));
            interfaceC28373a.c(new C40919b(bVar.f57301d));
            return new C43210w(new AuthSocialsInternalAction.ShowUserDialog(bVar.f57300c));
        }
        if (!(interfaceC25634a instanceof InterfaceC25634a.d)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = ((InterfaceC25634a.d) interfaceC25634a).f57303a;
        interfaceC28373a.c(new C19875c("auth", str));
        return new C43210w(new AuthSocialsInternalAction.OpenSocial(str));
    }
}
