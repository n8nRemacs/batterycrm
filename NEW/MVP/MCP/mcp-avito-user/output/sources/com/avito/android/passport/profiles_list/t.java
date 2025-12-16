package com.avito.android.passport.profiles_list;

import androidx.compose.runtime.internal.P;
import hz.InterfaceC41196a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C1;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import l60.InterfaceC43550a;

/* compiled from: ProfilesListInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profiles_list/t;", "Lcom/avito/android/passport/profiles_list/o;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class t implements o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43550a f213878a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41196a f213879b;

    @Inject
    public t(@Y61.k InterfaceC43550a interfaceC43550a, @Y61.k InterfaceC41196a interfaceC41196a) {
        this.f213878a = interfaceC43550a;
        this.f213879b = interfaceC41196a;
    }

    @Override // com.avito.android.passport.profiles_list.o
    @Y61.k
    public final C43137a0 a() {
        return new C43137a0(new s(2, null), new C1(C43175k.G(new q(this, null)), new C43152f0(this.f213879b.n(), new p(3, null)), new r(3, null)));
    }
}
