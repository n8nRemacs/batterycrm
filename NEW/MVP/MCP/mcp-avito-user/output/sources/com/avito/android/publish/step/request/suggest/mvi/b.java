package com.avito.android.publish.step.request.suggest.mvi;

import Bf0.InterfaceC13143a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.publish.C0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SuggestRequestActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/step/request/suggest/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LBf0/a;", "LBf0/b;", "LBf0/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC13143a, Bf0.b, Bf0.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C0 f245466a;

    @Inject
    public b(@Y61.k C0 c02) {
        this.f245466a = c02;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<Bf0.b> b(InterfaceC13143a interfaceC13143a, Bf0.d dVar) {
        if (interfaceC13143a.equals(InterfaceC13143a.C0065a.f1587a)) {
            return C43175k.G(new a(this, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
