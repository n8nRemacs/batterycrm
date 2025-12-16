package com.avito.android.passport.profile_add.merge.profiles_list.recycler;

import androidx.compose.runtime.internal.P;
import com.avito.android.passport.profile_add.merge.profiles_list.recycler.c;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MergeAccountsExpandItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profiles_list/recycler/g;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/recycler/d;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f213320b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f213321c;

    @Inject
    public g() {
    }

    @Override // com.avito.android.passport.profile_add.merge.profiles_list.recycler.d
    public final void K4(@Y61.k Y41.a<G0> aVar) {
        this.f213321c = aVar;
    }

    @Override // com.avito.android.passport.profile_add.merge.profiles_list.recycler.d
    public final void K5(@Y61.k Y41.a<G0> aVar) {
        this.f213320b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        c cVar = (c) aVar;
        if (cVar instanceof c.a) {
            iVar.eS(((c.a) cVar).f213316b);
            iVar.a(new e(this));
        } else if (cVar.equals(c.C6394c.f213317b)) {
            iVar.em();
            iVar.a(new f(this));
        }
    }
}
