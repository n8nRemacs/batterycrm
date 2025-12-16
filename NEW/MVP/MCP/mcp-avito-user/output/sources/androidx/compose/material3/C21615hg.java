package androidx.compose.material3;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: SnackbarHost.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.hg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21615hg extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C21729mg f36505l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f36506m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22096n f36507n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f36508o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f36509p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21615hg(C21729mg c21729mg, androidx.compose.ui.v vVar, C22096n c22096n, int i12, int i13) {
        super(2);
        this.f36505l = c21729mg;
        this.f36506m = vVar;
        this.f36507n = c22096n;
        this.f36508o = i12;
        this.f36509p = i13;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f36508o | 1);
        C21729mg c21729mg = this.f36505l;
        C21637ig.b(c21729mg, this.f36506m, this.f36507n, a12, iA2, this.f36509p);
        return kotlin.G0.f406611a;
    }
}
