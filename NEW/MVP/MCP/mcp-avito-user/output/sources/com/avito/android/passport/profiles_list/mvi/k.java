package com.avito.android.passport.profiles_list.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.arch.mvi.u;
import com.avito.android.passport.profiles_list.mvi.entity.PassportProfilesListInternalAction;
import com.avito.android.passport.profiles_list.recycler.PassportListButtonItem;
import j60.C42206c;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PassportProfilesListReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profiles_list/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/passport/profiles_list/mvi/entity/PassportProfilesListInternalAction;", "Lj60/c;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k implements u<PassportProfilesListInternalAction, C42206c> {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f213849b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final PassportListButtonItem f213850c;

    @Inject
    public k(@com.avito.android.passport.profiles_list.di.b boolean z12) {
        this.f213849b = z12;
        this.f213850c = new PassportListButtonItem(com.avito.android.printable_text.b.c(z12 ? R.string.switch_profile_cancel_button : R.string.switch_profile_add_button, new Serializable[0]), null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0121  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, java.util.Map] */
    @Override // com.avito.android.arch.mvi.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j60.C42206c a(com.avito.android.passport.profiles_list.mvi.entity.PassportProfilesListInternalAction r30, j60.C42206c r31) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.passport.profiles_list.mvi.k.a(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
