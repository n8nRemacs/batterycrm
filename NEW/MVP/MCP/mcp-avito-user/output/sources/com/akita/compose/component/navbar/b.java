package com.akita.compose.component.navbar;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NavBarAction.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class b extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f62197l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u f62198m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i12, u uVar) {
        super(2);
        this.f62197l = i12;
        this.f62198m = uVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            androidx.compose.ui.graphics.painter.e eVarA = u0.e.a(this.f62197l, 0, a13);
            u uVar = this.f62198m;
            com.akita.compose.foundation.ui.e.a(eVarA, "", C20588k2.o(androidx.compose.ui.v.f42878y1, uVar.f62299j), uVar.f62296g, a13, 56, 0);
        }
        return G0.f406611a;
    }
}
