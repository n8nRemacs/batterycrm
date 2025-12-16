package com.avito.android.passport.profile_add.merge.profile_to_convert.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.passport.network.model.MergeAccountsProfile;
import com.avito.android.passport.profile_add.merge.profile_to_convert.mvi.entity.ProfileToConvertInternalAction;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;

/* compiled from: ProfileToConvertBootstrap.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profile_to_convert/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/passport/profile_add/merge/profile_to_convert/mvi/entity/ProfileToConvertInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements com.avito.android.arch.mvi.b<ProfileToConvertInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<MergeAccountsProfile> f213158a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f213159b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f213160c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final r60.d f213161d;

    @Inject
    public f(@Y61.k List<MergeAccountsProfile> list, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k r60.d dVar) {
        this.f213158a = list;
        this.f213159b = aVar;
        this.f213160c = interfaceC28373a;
        this.f213161d = dVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<ProfileToConvertInternalAction> a() {
        return C43175k.N(new C43210w(new ProfileToConvertInternalAction.GotProfilesToConvert(this.f213158a)), new d(new c(y.a(this.f213159b.d9())), this), C43175k.G(new e(this, null)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
