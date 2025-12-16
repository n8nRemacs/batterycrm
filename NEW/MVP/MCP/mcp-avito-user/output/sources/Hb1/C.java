package Hb1;

import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import java.util.List;
import kotlin.G0;

/* loaded from: classes9.dex */
public final class C extends kotlin.jvm.internal.N implements Y41.p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f7343l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v.a f7344m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f7345n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f7346o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f7347p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C(List list, v.a aVar, long j12, Y41.p pVar, int i12) {
        super(2);
        this.f7343l = list;
        this.f7344m = aVar;
        this.f7345n = j12;
        this.f7346o = (kotlin.jvm.internal.N) pVar;
        this.f7347p = i12;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA2 = C22066f2.a(this.f7347p | 1);
        ?? r42 = this.f7346o;
        F.b(this.f7343l, this.f7344m, this.f7345n, r42, (androidx.compose.runtime.A) obj, iA2);
        return G0.f406611a;
    }
}
