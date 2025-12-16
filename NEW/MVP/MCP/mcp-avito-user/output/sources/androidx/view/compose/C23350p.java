package androidx.view.compose;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.saveable.l;
import androidx.view.C23395u;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NavBackStackEntryProvider.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.navigation.compose.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C23350p extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C23395u f52978l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l f52979m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22096n f52980n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23350p(C23395u c23395u, l lVar, C22096n c22096n, int i12) {
        super(2);
        this.f52978l = c23395u;
        this.f52979m = lVar;
        this.f52980n = c22096n;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(457);
        l lVar = this.f52979m;
        C22096n c22096n = this.f52980n;
        C23352r.a(this.f52978l, lVar, c22096n, a12, iA2);
        return G0.f406611a;
    }
}
