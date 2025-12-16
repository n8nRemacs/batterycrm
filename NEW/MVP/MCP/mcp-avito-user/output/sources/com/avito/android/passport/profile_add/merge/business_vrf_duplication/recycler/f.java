package com.avito.android.passport.profile_add.merge.business_vrf_duplication.recycler;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.passport.profile_add.merge.business_vrf_duplication.mvi.o;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PassportVrfActionItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/business_vrf_duplication/recycler/f;", "Lcom/avito/android/passport/profile_add/merge/business_vrf_duplication/recycler/d;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<o, G0> f212589b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super o, G0> lVar) {
        this.f212589b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        PassportVrfActionItem passportVrfActionItem = (PassportVrfActionItem) aVar;
        hVar.setTitle(passportVrfActionItem.f212577c);
        hVar.f(passportVrfActionItem.f212578d);
        Integer numM = com.avito.android.lib.util.f.m(passportVrfActionItem.f212579e);
        hVar.H4(numM != null ? numM.intValue() : R.attr.textIconCopy);
        hVar.J4(R.attr.textIconArrowForwardIos);
        hVar.Va(new e(passportVrfActionItem, this));
    }
}
