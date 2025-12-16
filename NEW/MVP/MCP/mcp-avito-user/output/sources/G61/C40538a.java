package g61;

import Y41.l;
import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import gc1.C40657a;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* renamed from: g61.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40538a extends N implements p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f396311l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f396312m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f396313n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f396314o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f396315p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C40657a f396316q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l f396317r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f396318s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f396319t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40538a(v vVar, String str, String str2, long j12, String str3, C40657a c40657a, l lVar, int i12, int i13) {
        super(2);
        this.f396311l = vVar;
        this.f396312m = str;
        this.f396313n = str2;
        this.f396314o = j12;
        this.f396315p = str3;
        this.f396316q = c40657a;
        this.f396317r = lVar;
        this.f396318s = i12;
        this.f396319t = i13;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA2 = C22066f2.a(this.f396318s | 1);
        C40657a c40657a = this.f396316q;
        l lVar = this.f396317r;
        AbstractC40539b.a(this.f396311l, this.f396312m, this.f396313n, this.f396314o, this.f396315p, c40657a, lVar, (A) obj, iA2, this.f396319t);
        return G0.f406611a;
    }
}
