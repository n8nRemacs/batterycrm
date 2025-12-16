package com.avito.android.mortgage_invite.client_form;

import androidx.compose.runtime.C22066f2;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.phone_confirm.model.PhoneConfirmArguments;
import com.avito.android.mortgage_invite.client_search.model.MortgageClientSearchArguments;
import kotlin.G0;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ApplicationClientFormScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class U extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ U10.c f205089l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<U10.a, G0> f205090m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<U10.b> f205091n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f205092o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.l<MortgageClientSearchArguments, G0> f205093p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.l<PhoneConfirmArguments, G0> f205094q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f205095r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f205096s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(U10.c cVar, Y41.l lVar, InterfaceC43160i interfaceC43160i, Y41.a aVar, Y41.l lVar2, Y41.l lVar3, Y41.l lVar4, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f205089l = cVar;
        this.f205090m = lVar;
        this.f205091n = interfaceC43160i;
        this.f205092o = aVar;
        this.f205093p = lVar2;
        this.f205094q = lVar3;
        this.f205095r = lVar4;
        this.f205096s = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(521);
        Y41.l<MortgageClientSearchArguments, G0> lVar = this.f205093p;
        Y41.l<PhoneConfirmArguments, G0> lVar2 = this.f205094q;
        f0.a(this.f205089l, this.f205090m, this.f205091n, this.f205092o, lVar, lVar2, this.f205095r, a12, iA2);
        return G0.f406611a;
    }
}
