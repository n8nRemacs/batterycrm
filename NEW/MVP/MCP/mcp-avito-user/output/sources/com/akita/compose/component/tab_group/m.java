package com.akita.compose.component.tab_group;

import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TabGroup.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class m extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22096n f63049l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ R2.a f63050m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(C22096n c22096n, R2.a aVar) {
        super(2);
        this.f63049l = c22096n;
        this.f63050m = aVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            this.f63049l.invoke(this.f63050m, a13, 0);
        }
        return G0.f406611a;
    }
}
