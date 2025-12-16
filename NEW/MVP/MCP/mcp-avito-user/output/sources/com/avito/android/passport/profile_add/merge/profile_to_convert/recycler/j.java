package com.avito.android.passport.profile_add.merge.profile_to_convert.recycler;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.component.user_hat.ProfileType;
import com.avito.android.passport.profile_list_item.PassportListProfileItem;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ProfileToConvertListItemPresenterImpl.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profile_to_convert/recycler/j;", "Lcom/avito/android/passport/profile_list_item/e;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j implements com.avito.android.passport.profile_list_item.e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<String, G0> f213189b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public j(@Y61.k Y41.l<? super String, G0> lVar) {
        this.f213189b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        com.avito.android.passport.profile_list_item.i iVar = (com.avito.android.passport.profile_list_item.i) eVar;
        PassportListProfileItem passportListProfileItem = (PassportListProfileItem) aVar;
        iVar.J(passportListProfileItem.f213627b);
        boolean z12 = passportListProfileItem.f213632g;
        iVar.D(!z12 ? com.avito.android.printable_text.b.f(passportListProfileItem.f213628c) : com.avito.android.printable_text.b.c(R.string.passport_accounts_merge_profile_to_convert_selected_profile, new Serializable[0]));
        iVar.h(passportListProfileItem.f213629d);
        iVar.l(passportListProfileItem.f213630e);
        iVar.Td(z12);
        iVar.B9(passportListProfileItem.f213634i, ProfileType.f125289b);
        iVar.a(new i(this, passportListProfileItem));
        iVar.kP(z12);
    }
}
