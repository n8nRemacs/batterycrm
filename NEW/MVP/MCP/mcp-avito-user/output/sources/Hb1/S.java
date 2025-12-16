package Hb1;

import androidx.compose.runtime.C22066f2;
import java.util.List;
import kotlin.G0;

/* loaded from: classes9.dex */
public final class S extends kotlin.jvm.internal.N implements Y41.p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f7397l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f7398m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f7399n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7400o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public S(List list, long j12, Y41.p pVar, int i12) {
        super(2);
        this.f7397l = list;
        this.f7398m = j12;
        this.f7399n = (kotlin.jvm.internal.N) pVar;
        this.f7400o = i12;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA2 = C22066f2.a(this.f7400o | 1);
        ?? r32 = this.f7399n;
        e0.b(this.f7397l, this.f7398m, r32, (androidx.compose.runtime.A) obj, iA2);
        return G0.f406611a;
    }
}
