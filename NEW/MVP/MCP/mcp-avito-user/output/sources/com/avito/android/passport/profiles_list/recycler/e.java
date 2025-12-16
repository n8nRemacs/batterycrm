package com.avito.android.passport.profiles_list.recycler;

import androidx.compose.runtime.internal.P;
import j60.InterfaceC42204a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ProfileListButtonItem.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profiles_list/recycler/e;", "LTV0/d;", "Lcom/avito/android/passport/profiles_list/recycler/f;", "Lcom/avito/android/passport/profiles_list/recycler/PassportListButtonItem;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements TV0.d<f, PassportListButtonItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC42204a, G0> f213870b;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@Y61.k Y41.l<? super InterfaceC42204a, G0> lVar) {
        this.f213870b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        fVar.y(((PassportListButtonItem) aVar).f213860b);
        fVar.a(new d(this));
    }
}
