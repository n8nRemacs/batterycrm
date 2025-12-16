package com.avito.android.lf_levels.mvi;

import kotlin.Metadata;
import kotlin.jvm.internal.N;
import wR.InterfaceC49553a;

/* compiled from: LfLevelsActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LwR/a;", "action", "", "invoke", "(LwR/a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class a extends N implements Y41.l<InterfaceC49553a, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final a f175372l = new a();

    public a() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(InterfaceC49553a interfaceC49553a) {
        InterfaceC49553a interfaceC49553a2 = interfaceC49553a;
        return Boolean.valueOf(interfaceC49553a2 instanceof InterfaceC49553a.C12819a ? true : interfaceC49553a2.equals(InterfaceC49553a.b.f441438a));
    }
}
