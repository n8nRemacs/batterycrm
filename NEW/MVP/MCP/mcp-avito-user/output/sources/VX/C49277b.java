package vX;

import Y61.k;
import Y61.l;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.loyalty_program.analytics.LoyaltyProgramFromPage;
import javax.inject.Inject;
import kotlin.Metadata;
import xX.C49896a;

/* compiled from: LoyaltyProgramAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvX/b;", "LvX/a;", "_avito_loyalty-program_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vX.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C49277b implements InterfaceC49276a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f440823a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final E f440824b;

    @Inject
    public C49277b(@k E e12, @k InterfaceC28373a interfaceC28373a) {
        this.f440823a = interfaceC28373a;
        this.f440824b = e12;
    }

    @Override // vX.InterfaceC49276a
    public final void a(@k String str) {
        this.f440823a.c(new xX.c(this.f440824b.a(), str));
    }

    @Override // vX.InterfaceC49276a
    public final void b(@l Integer num) {
        LoyaltyProgramFromPage[] loyaltyProgramFromPageArr = LoyaltyProgramFromPage.f184155b;
        this.f440823a.c(new C49896a(num));
    }

    @Override // vX.InterfaceC49276a
    public final void c(@l Integer num) {
        LoyaltyProgramFromPage[] loyaltyProgramFromPageArr = LoyaltyProgramFromPage.f184155b;
        this.f440823a.c(new xX.b(num));
    }
}
