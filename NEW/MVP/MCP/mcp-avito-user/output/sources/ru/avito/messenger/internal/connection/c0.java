package ru.avito.messenger.internal.connection;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.internal.connection.C47754g.C12406g;
import ru.avito.messenger.internal.connection.C47754g.h;
import ru.avito.messenger.internal.connection.InterfaceC47751d;
import ru.avito.websocket.u;

/* compiled from: MessengerConnectionHolder.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Lru/avito/websocket/u;", "", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class c0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C47754g f431286b;

    public c0(C47754g c47754g) {
        this.f431286b = c47754g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.g
    public final void accept(Object obj) {
        kotlin.Q q12 = (kotlin.Q) obj;
        ru.avito.websocket.u uVar = (ru.avito.websocket.u) q12.f406619b;
        String str = (String) q12.f406620c;
        boolean z12 = uVar instanceof u.a;
        C47754g c47754g = this.f431286b;
        ru.avito.messenger.internal.state_machine.g<InterfaceC47751d.b> gVar = c47754g.f431306a;
        if (z12) {
            gVar.a(c47754g.new C12406g());
        } else if (uVar instanceof u.c) {
            gVar.a(c47754g.new h((u.c) uVar, str));
        } else {
            boolean z13 = uVar instanceof u.b;
        }
    }
}
