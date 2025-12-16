package com.akita.compose.component.bottom_sheet;

import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BottomSheet.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class v extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f60698l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22096n f60699m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22096n f60700n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.akita.compose.component.toast_bar.u uVar, C22096n c22096n, C22096n c22096n2) {
        super(2);
        this.f60698l = uVar;
        this.f60699m = c22096n;
        this.f60700n = c22096n2;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            com.akita.compose.component.scaffold.g.a(null, null, null, this.f60698l, this.f60699m, null, null, androidx.compose.runtime.internal.r.c(-651477220, new C27331u(this.f60700n), a13), a13, 12582912, 103);
        }
        return G0.f406611a;
    }
}
