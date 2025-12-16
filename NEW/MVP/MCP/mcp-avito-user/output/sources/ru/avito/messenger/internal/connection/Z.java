package ru.avito.messenger.internal.connection;

import k91.AbstractC42547e;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.internal.connection.C47754g.d;
import ru.avito.messenger.internal.connection.C47754g.i;
import ru.avito.messenger.internal.connection.InterfaceC47751d;

/* compiled from: MessengerConnectionHolder.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk91/e;", "message", "Lkotlin/G0;", "accept", "(Lk91/e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class Z<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C47754g f431274b;

    public Z(C47754g c47754g) {
        this.f431274b = c47754g;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        AbstractC42547e abstractC42547e = (AbstractC42547e) obj;
        boolean z12 = abstractC42547e instanceof AbstractC42547e.r;
        C47754g c47754g = this.f431274b;
        ru.avito.messenger.internal.state_machine.g<InterfaceC47751d.b> gVar = c47754g.f431306a;
        if (z12) {
            gVar.a(c47754g.new i(((AbstractC42547e.r) abstractC42547e).getValue()));
            return;
        }
        String str = abstractC42547e.sequenceId;
        if (str != null) {
            gVar.a(c47754g.new d(str));
        }
    }
}
