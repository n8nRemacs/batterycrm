package androidx.compose.material3;

import androidx.compose.runtime.C22066f2;
import kotlin.Metadata;

/* compiled from: ModalBottomSheet.android.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.wa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21949wa extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f37683l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f37684m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f37685n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f37686o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21949wa(long j12, Y41.a<kotlin.G0> aVar, boolean z12, int i12) {
        super(2);
        this.f37683l = j12;
        this.f37684m = aVar;
        this.f37685n = z12;
        this.f37686o = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f37686o | 1);
        Y41.a<kotlin.G0> aVar = this.f37684m;
        boolean z12 = this.f37685n;
        C22015za.c(this.f37683l, aVar, z12, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
