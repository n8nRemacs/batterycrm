package androidx.view.compose;

import Y41.l;
import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import androidx.view.C23404y0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NavHost.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.navigation.compose.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C23329C extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C23404y0 f52919l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f52920m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f52921n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ N f52922o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f52923p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C23329C(C23404y0 c23404y0, String str, v vVar, l lVar, int i12) {
        super(2);
        this.f52919l = c23404y0;
        this.f52920m = str;
        this.f52921n = vVar;
        this.f52922o = (N) lVar;
        this.f52923p = i12;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f52923p | 1);
        ?? r32 = this.f52922o;
        String str = this.f52920m;
        v vVar = this.f52921n;
        C23359y.c(this.f52919l, str, vVar, r32, a12, iA2);
        return G0.f406611a;
    }
}
