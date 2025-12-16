package com.avito.android.passport.profile_add;

import com.avito.android.passport.profile_add.l;
import com.avito.android.util.InterfaceC35863o4;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;

/* compiled from: ReAgentProfileStateProviderImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/m;", "Lcom/avito/android/passport/profile_add/l;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes15.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f212378a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Z1<l.a> f212379b;

    @Inject
    public m(@Y61.k InterfaceC35863o4 interfaceC35863o4) {
        this.f212378a = interfaceC35863o4;
        this.f212379b = p2.a(new l.a(interfaceC35863o4.a()));
    }

    @Override // com.avito.android.passport.profile_add.l
    public final void a() {
        l.a value;
        String strA;
        Z1<l.a> z12 = this.f212379b;
        do {
            value = z12.getValue();
            strA = this.f212378a.a();
            value.getClass();
        } while (!z12.N3(value, new l.a(strA)));
    }

    @Override // com.avito.android.passport.profile_add.l
    @Y61.k
    public final n2<l.a> b() {
        return this.f212379b;
    }
}
