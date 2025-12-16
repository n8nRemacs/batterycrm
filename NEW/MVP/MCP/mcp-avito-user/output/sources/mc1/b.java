package Mc1;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class b extends N implements Y41.p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f10856l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f10857m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f10858n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f10859o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i12, int i13, v vVar, String str) {
        super(2);
        this.f10856l = str;
        this.f10857m = vVar;
        this.f10858n = i12;
        this.f10859o = i13;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA2 = C22066f2.a(this.f10859o | 1);
        String str = this.f10856l;
        s.a(this.f10858n, iA2, (A) obj, this.f10857m, str);
        return G0.f406611a;
    }
}
