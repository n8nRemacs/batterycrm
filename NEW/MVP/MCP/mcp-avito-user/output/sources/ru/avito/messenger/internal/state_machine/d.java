package ru.avito.messenger.internal.state_machine;

import Y61.k;
import kotlin.Metadata;

/* compiled from: SequentialStateMachine.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "S", "newState", "Lkotlin/G0;", "accept", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class d<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e<Object> f431780b;

    public d(e<Object> eVar) {
        this.f431780b = eVar;
    }

    @Override // l41.g
    public final void accept(@k Object obj) {
        e<Object> eVar = this.f431780b;
        eVar.f431783c.a(eVar.f431786f, "New state: " + obj, null);
    }
}
