package com.avito.android.passport.profile_add.merge.accounts_profile_error.recycler;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PassportProfileErrorItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/accounts_profile_error/recycler/e;", "Lcom/avito/android/passport/profile_add/merge/accounts_profile_error/recycler/d;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements d {
    @Inject
    public e() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        PassportProfileErrorItem passportProfileErrorItem = (PassportProfileErrorItem) aVar;
        gVar.e(passportProfileErrorItem.f212445b);
        Integer numM = com.avito.android.lib.util.f.m(passportProfileErrorItem.f212446c);
        gVar.setIcon(numM != null ? numM.intValue() : R.attr.textIconAdd);
    }
}
