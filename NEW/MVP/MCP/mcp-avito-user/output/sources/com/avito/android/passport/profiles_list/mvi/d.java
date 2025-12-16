package com.avito.android.passport.profiles_list.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.passport.profiles_list.mvi.entity.PassportProfilesListInternalAction;
import com.avito.android.passport.profiles_list.o;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;

/* compiled from: PassportProfilesListBootstrap.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profiles_list/mvi/d;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/passport/profiles_list/mvi/entity/PassportProfilesListInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements com.avito.android.arch.mvi.b<PassportProfilesListInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final o f213826a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f213827b;

    @Inject
    public d(@Y61.k o oVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f213826a = oVar;
        this.f213827b = aVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<PassportProfilesListInternalAction> a() {
        return C43175k.N(this.f213826a.a(), new c(y.a(this.f213827b.d9())));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
