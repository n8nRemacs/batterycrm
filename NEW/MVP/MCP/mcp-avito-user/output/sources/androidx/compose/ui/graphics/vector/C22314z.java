package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: VectorCompose.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.graphics.vector.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22314z extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f40024l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f40025m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f40026n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f40027o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f40028p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f40029q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f40030r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f40031s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ List<AbstractC22297h> f40032t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C22096n f40033u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22314z(String str, float f12, float f13, float f14, float f15, float f16, float f17, float f18, List list, C22096n c22096n, int i12) {
        super(2);
        this.f40024l = str;
        this.f40025m = f12;
        this.f40026n = f13;
        this.f40027o = f14;
        this.f40028p = f15;
        this.f40029q = f16;
        this.f40030r = f17;
        this.f40031s = f18;
        this.f40032t = list;
        this.f40033u = c22096n;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(805306369);
        C22096n c22096n = this.f40033u;
        float f12 = this.f40030r;
        float f13 = this.f40031s;
        Q.a(this.f40024l, this.f40025m, this.f40026n, this.f40027o, this.f40028p, this.f40029q, f12, f13, this.f40032t, c22096n, a12, iA2);
        return G0.f406611a;
    }
}
