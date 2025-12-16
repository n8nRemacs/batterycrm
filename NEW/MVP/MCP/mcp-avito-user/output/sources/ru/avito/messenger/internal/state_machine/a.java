package ru.avito.messenger.internal.state_machine;

import androidx.compose.foundation.H;
import kotlin.Metadata;
import m91.InterfaceC43936c;
import ru.avito.messenger.internal.state_machine.g;

/* compiled from: SequentialStateMachine.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "S", "Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class a<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e<Object> f431774b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g.a<Object> f431775c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f431776d;

    public a(e<Object> eVar, g.a<Object> aVar, Object obj) {
        this.f431774b = eVar;
        this.f431775c = aVar;
        this.f431776d = obj;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        e<Object> eVar = this.f431774b;
        InterfaceC43936c interfaceC43936c = eVar.f431783c;
        StringBuilder sb2 = new StringBuilder("Started executing: ");
        sb2.append(this.f431775c.getClass().getSimpleName());
        sb2.append('(');
        interfaceC43936c.a(eVar.f431786f, H.n(sb2, this.f431776d, ')'), null);
    }
}
