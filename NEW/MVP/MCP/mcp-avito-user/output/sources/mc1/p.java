package Mc1;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class p extends N implements Y41.p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f10899l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f10900m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f10901n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f10902o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str, v vVar, long j12, int i12) {
        super(2);
        this.f10899l = str;
        this.f10900m = vVar;
        this.f10901n = j12;
        this.f10902o = i12;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        s.o(this.f10899l, this.f10900m, this.f10901n, (A) obj, C22066f2.a(this.f10902o | 1));
        return G0.f406611a;
    }
}
