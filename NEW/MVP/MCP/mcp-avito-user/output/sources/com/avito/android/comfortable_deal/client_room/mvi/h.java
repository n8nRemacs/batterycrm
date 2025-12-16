package com.avito.android.comfortable_deal.client_room.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import ep.InterfaceC40139a;
import fp.d;
import fp.e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ClientRoomActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/comfortable_deal/client_room/mvi/h;", "Lcom/avito/android/arch/mvi/a;", "Lfp/d;", "Lfp/e;", "Lfp/g;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements com.avito.android.arch.mvi.a<fp.d, fp.e, fp.g> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40139a f119905a;

    @Inject
    public h(@Y61.k InterfaceC40139a interfaceC40139a) {
        this.f119905a = interfaceC40139a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<fp.e> b(fp.d dVar, fp.g gVar) {
        fp.d dVar2 = dVar;
        if (dVar2 instanceof d.c) {
            return C43175k.G(new a(this, dVar2, null));
        }
        if (dVar2 instanceof d.h) {
            return C43175k.G(new b(this, dVar2, null));
        }
        if (dVar2 instanceof d.e) {
            return C43175k.G(new c(this, dVar2, null));
        }
        if (dVar2 instanceof d.g) {
            return C43175k.G(new d(this, dVar2, null));
        }
        if (dVar2 instanceof d.b) {
            return new C43210w(e.d.f396107a);
        }
        if (dVar2 instanceof d.a) {
            return C43175k.G(new e(this, dVar2, null));
        }
        if (dVar2.equals(d.C11173d.f396098a)) {
            return C43175k.G(new f(this, null));
        }
        if (dVar2.equals(d.f.f396100a)) {
            return C43175k.G(new g(this, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
