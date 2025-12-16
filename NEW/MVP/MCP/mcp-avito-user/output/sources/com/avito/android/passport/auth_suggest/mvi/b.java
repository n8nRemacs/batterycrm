package com.avito.android.passport.auth_suggest.mvi;

import F50.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.passport.auth_suggest.entity.PassportAuthSuggestInternalAction;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PassportAuthSuggestActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/passport/auth_suggest/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LF50/a;", "Lcom/avito/android/passport/auth_suggest/entity/PassportAuthSuggestInternalAction;", "LF50/c;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.arch.mvi.a<F50.a, PassportAuthSuggestInternalAction, F50.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final I50.a f211024a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Set<String> f211025b;

    @Inject
    public b(@Y61.k I50.a aVar, @Y61.k Set<String> set) {
        this.f211024a = aVar;
        this.f211025b = set;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<PassportAuthSuggestInternalAction> b(F50.a aVar, F50.c cVar) {
        F50.a aVar2 = aVar;
        if (aVar2 instanceof a.b) {
            return C43175k.G(new a(this, ((a.b) aVar2).f4537a, null));
        }
        if (aVar2 instanceof a.C0273a) {
            return new C43210w(new PassportAuthSuggestInternalAction.HandleBeduinEvent(((a.C0273a) aVar2).f4536a));
        }
        if (aVar2 instanceof a.c) {
            return new C43210w(new PassportAuthSuggestInternalAction.HandleBeduinState(((a.c) aVar2).f4538a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
