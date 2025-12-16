package com.avito.android.lib.beduin_v2.component.button.compose;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.akita.compose.component.button.t;
import com.avito.beduin.v2.avito.component.button.state.C36216a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ButtonComponent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class c extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C36216a f175518l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t f175519m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f175520n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f175521o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C36216a c36216a, t tVar, v vVar, int i12) {
        super(2);
        this.f175518l = c36216a;
        this.f175519m = tVar;
        this.f175520n = vVar;
        this.f175521o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f175521o | 1);
        v vVar = this.f175520n;
        d.a(this.f175518l, this.f175519m, vVar, a12, iA2);
        return G0.f406611a;
    }
}
