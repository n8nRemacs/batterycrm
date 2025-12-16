package com.avito.android.tariff.cpr.configure.advance.mvi;

import com.avito.android.tariff.cpr.configure.advance.items.reviews.x;
import gB0.InterfaceC40566a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CprConfigureAdvanceActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LgB0/a;", "action", "", "invoke", "(LgB0/a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class b extends N implements Y41.l<InterfaceC40566a, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final b f295447l = new b();

    public b() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(InterfaceC40566a interfaceC40566a) {
        InterfaceC40566a interfaceC40566a2 = interfaceC40566a;
        return Boolean.valueOf(interfaceC40566a2 instanceof InterfaceC40566a.b ? true : interfaceC40566a2 instanceof InterfaceC40566a.c ? ((InterfaceC40566a.c) interfaceC40566a2).f396366a instanceof x.a : false);
    }
}
