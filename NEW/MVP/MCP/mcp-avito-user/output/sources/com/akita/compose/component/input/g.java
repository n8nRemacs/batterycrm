package com.akita.compose.component.input;

import androidx.compose.runtime.A;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.text.C22602e;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Input.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class g extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f61751l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22602e f61752m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f61753n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f61754o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InputState f61755p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f61756q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, C22602e c22602e, v vVar, boolean z12, InputState inputState, int i12) {
        super(2);
        this.f61751l = str;
        this.f61752m = c22602e;
        this.f61753n = vVar;
        this.f61754o = z12;
        this.f61755p = inputState;
        this.f61756q = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else if (this.f61751l != null && this.f61752m.f42127c.length() == 0) {
            v vVar = this.f61753n;
            com.akita.compose.foundation.ui.p.b(this.f61751l, vVar.f61829b, null, false, ((T) vVar.f61830c.a(this.f61754o, this.f61755p, a13).getF42167b()).f39331a, null, this.f61756q, 0, false, null, a13, 3072, 932);
        }
        return G0.f406611a;
    }
}
