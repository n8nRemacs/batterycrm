package com.akita.compose.component.navbar;

import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: NavBar.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class n extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f62256l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u f62257m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22096n f62258n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, u uVar, C22096n c22096n) {
        super(2);
        this.f62256l = str;
        this.f62257m = uVar;
        this.f62258n = c22096n;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        float f12;
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            u uVar = this.f62257m;
            com.akita.compose.foundation.r rVar = uVar.f62294e;
            v.a aVar = androidx.compose.ui.v.f42878y1;
            if (this.f62258n != null) {
                f12 = uVar.f62295f;
            } else {
                f12 = 0;
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            }
            androidx.compose.ui.v vVarM = R1.m(aVar, 0.0f, 0.0f, f12, 0.0f, 11);
            androidx.compose.ui.text.style.s.f42720b.getClass();
            com.akita.compose.foundation.ui.p.b(this.f62256l, rVar, vVarM, false, 0L, null, 1, androidx.compose.ui.text.style.s.f42722d, false, null, a13, 14155776, 824);
        }
        return G0.f406611a;
    }
}
