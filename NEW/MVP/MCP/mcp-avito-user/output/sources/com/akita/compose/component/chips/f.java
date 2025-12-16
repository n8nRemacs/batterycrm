package com.akita.compose.component.chips;

import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Chips.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class f extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22096n f60891l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f60892m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC27333b f60893n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C22096n c22096n, int i12, InterfaceC27333b interfaceC27333b) {
        super(2);
        this.f60891l = c22096n;
        this.f60892m = i12;
        this.f60893n = interfaceC27333b;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            this.f60891l.invoke(Integer.valueOf(this.f60892m), this.f60893n, a13, 0);
        }
        return G0.f406611a;
    }
}
