package com.akita.compose.component.list_item;

import androidx.compose.runtime.A;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ListItemCheckbox.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class b extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f61863l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s f61864m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z12, s sVar) {
        super(2);
        this.f61863l = z12;
        this.f61864m = sVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            com.akita.compose.component.toggle.j.b(this.f61863l, null, this.f61864m.f61954f, null, null, null, a13, 48, 120);
        }
        return G0.f406611a;
    }
}
