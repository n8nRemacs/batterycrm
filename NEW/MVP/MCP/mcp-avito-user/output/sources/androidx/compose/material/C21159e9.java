package androidx.compose.material;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: SnackbarHost.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.material.e9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21159e9 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C21224j9 f33553l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v.a f33554m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22096n f33555n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f33556o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21159e9(C21224j9 c21224j9, v.a aVar, C22096n c22096n, int i12) {
        super(2);
        this.f33553l = c21224j9;
        this.f33554m = aVar;
        this.f33555n = c22096n;
        this.f33556o = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f33556o | 1);
        C22096n c22096n = this.f33555n;
        C21172f9.b(this.f33553l, this.f33554m, c22096n, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
