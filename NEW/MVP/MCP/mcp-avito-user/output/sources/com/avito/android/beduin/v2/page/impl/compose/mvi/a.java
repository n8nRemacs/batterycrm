package com.avito.android.beduin.v2.page.impl.compose.mvi;

import Hi.InterfaceC13994a;
import Hi.b;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BeduinV2PageComposeActor.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/compose/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LHi/a;", "LHi/b;", "LHi/d;", "<init>", "()V", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC13994a, Hi.b, Hi.d> {
    @Inject
    public a() {
    }

    @Override // com.avito.android.arch.mvi.a
    @k
    public final InterfaceC43160i a(@k C43197r1 c43197r1, @k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<Hi.b> b(InterfaceC13994a interfaceC13994a, Hi.d dVar) {
        Hi.b cVar;
        Hi.b bVar;
        InterfaceC13994a interfaceC13994a2 = interfaceC13994a;
        if (interfaceC13994a2.equals(InterfaceC13994a.C0433a.f7609a)) {
            bVar = b.a.f7612a;
        } else {
            if (interfaceC13994a2 instanceof InterfaceC13994a.b) {
                cVar = new b.C0434b(((InterfaceC13994a.b) interfaceC13994a2).f7610a);
            } else {
                if (!(interfaceC13994a2 instanceof InterfaceC13994a.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar = new b.c(((InterfaceC13994a.c) interfaceC13994a2).f7611a);
            }
            bVar = cVar;
        }
        return new C43210w(bVar);
    }
}
