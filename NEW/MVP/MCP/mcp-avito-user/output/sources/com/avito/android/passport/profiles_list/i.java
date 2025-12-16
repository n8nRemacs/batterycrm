package com.avito.android.passport.profiles_list;

import androidx.compose.runtime.internal.P;
import androidx.view.N0;
import com.avito.android.analytics.InterfaceC28373a;
import j60.C42206c;
import j60.InterfaceC42204a;
import j60.InterfaceC42205b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.Z1;

/* compiled from: PassportProfilesListViewModel.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/passport/profiles_list/i;", "Lcom/avito/android/arch/mvi/android/j;", "Lj60/a;", "Lj60/c;", "Lj60/b;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i extends com.avito.android.arch.mvi.android.j<InterfaceC42204a, C42206c, InterfaceC42205b> {

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final Z1<String> f213804N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f213805O;

    @Inject
    public i(@Y61.k com.avito.android.passport.profiles_list.mvi.g gVar, @Y61.k Z1<String> z12, @Y61.k InterfaceC28373a interfaceC28373a) {
        super(gVar, null, 2, null);
        this.f213804N = z12;
        this.f213805O = interfaceC28373a;
        C43259k.d(N0.a(this), null, null, new h(this, null), 3);
    }
}
