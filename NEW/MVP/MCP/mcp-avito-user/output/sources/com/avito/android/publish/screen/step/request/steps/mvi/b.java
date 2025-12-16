package com.avito.android.publish.screen.step.request.steps.mvi;

import Me0.C14479d;
import Me0.InterfaceC14476a;
import Me0.InterfaceC14477b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.publish.C0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: StepsRequestActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/screen/step/request/steps/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LMe0/a;", "LMe0/b;", "LMe0/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC14476a, InterfaceC14477b, C14479d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.screen.step.request.steps.loader.a f242055a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C0 f242056b;

    @Inject
    public b(@Y61.k com.avito.android.publish.screen.step.request.steps.loader.a aVar, @Y61.k C0 c02) {
        this.f242055a = aVar;
        this.f242056b = c02;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC14477b> b(InterfaceC14476a interfaceC14476a, C14479d c14479d) {
        InterfaceC14476a interfaceC14476a2 = interfaceC14476a;
        if (interfaceC14476a2.equals(InterfaceC14476a.C0693a.f10970a)) {
            return C43175k.G(new a(this, null));
        }
        if (interfaceC14476a2.equals(InterfaceC14476a.b.f10971a)) {
            return this.f242055a.load();
        }
        throw new NoWhenBranchMatchedException();
    }
}
