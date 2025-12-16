package com.avito.android.passport.profile_list_item;

import androidx.compose.runtime.internal.P;
import j60.InterfaceC42204a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ProfileListItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_list_item/g;", "Lcom/avito/android/passport/profile_list_item/e;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC42204a, G0> f213641b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@Y61.k Y41.l<? super InterfaceC42204a, G0> lVar) {
        this.f213641b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        PassportListProfileItem passportListProfileItem = (PassportListProfileItem) aVar;
        iVar.J(passportListProfileItem.f213627b);
        iVar.D(com.avito.android.printable_text.b.f(passportListProfileItem.f213628c));
        iVar.h(passportListProfileItem.f213629d);
        iVar.l(passportListProfileItem.f213630e);
        iVar.Td(passportListProfileItem.f213632g);
        iVar.B9(passportListProfileItem.f213634i, passportListProfileItem.f213633h);
        iVar.a(new f(this, passportListProfileItem));
    }
}
