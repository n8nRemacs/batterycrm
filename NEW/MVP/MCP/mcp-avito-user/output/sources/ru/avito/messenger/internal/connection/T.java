package ru.avito.messenger.internal.connection;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.internal.connection.C47754g.e;

/* compiled from: MessengerConnectionHolder.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "resetConnection", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class T extends kotlin.jvm.internal.N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C47754g f431266l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C47749b f431267m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(C47754g c47754g, C47749b c47749b) {
        super(1);
        this.f431266l = c47754g;
        this.f431267m = c47749b;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        String str = this.f431267m.f431278b;
        C47754g c47754g = this.f431266l;
        c47754g.f431306a.a(c47754g.new e(str, zBooleanValue, zBooleanValue));
        return G0.f406611a;
    }
}
