package androidx.view.compose;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.saveable.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NavBackStackEntryProvider.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.navigation.compose.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C23351q extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f52981l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22096n f52982m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f52983n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23351q(l lVar, C22096n c22096n, int i12) {
        super(2);
        this.f52981l = lVar;
        this.f52982m = c22096n;
        this.f52983n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f52983n | 1);
        C23352r.b(this.f52981l, this.f52982m, a12, iA2);
        return G0.f406611a;
    }
}
