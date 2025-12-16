package com.avito.android.passport.profile_add.merge.check.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.passport.profile_add.merge.check.mvi.entity.CheckMergePossibilityInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;

/* compiled from: CheckMergePossibilityBootstrap.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/check/mvi/e;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/passport/profile_add/merge/check/mvi/entity/CheckMergePossibilityInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements com.avito.android.arch.mvi.b<CheckMergePossibilityInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.passport.profile_add.merge.domain.a f212661a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f212662b;

    @Inject
    public e(@Y61.k com.avito.android.passport.profile_add.merge.domain.a aVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2) {
        this.f212661a = aVar;
        this.f212662b = aVar2;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<CheckMergePossibilityInternalAction> a() {
        return C43175k.N(this.f212661a.e(), new d(new c(y.a(this.f212662b.d9()))));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
