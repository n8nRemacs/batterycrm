package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: Composer.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class D extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ B f37944l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.runtime.changelist.a f37945m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ K2 f37946n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22183t1 f37947o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(B b12, androidx.compose.runtime.changelist.a aVar, K2 k22, C22183t1 c22183t1) {
        super(0);
        this.f37944l = b12;
        this.f37945m = aVar;
        this.f37946n = k22;
        this.f37947o = c22183t1;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        B b12 = this.f37944l;
        androidx.compose.runtime.changelist.b bVar = b12.f37884M;
        androidx.compose.runtime.changelist.a aVar = this.f37945m;
        K2 k22 = this.f37946n;
        C22183t1 c22183t1 = this.f37947o;
        androidx.compose.runtime.changelist.a aVar2 = bVar.f38192b;
        try {
            bVar.f38192b = aVar;
            K2 k23 = b12.f37878G;
            int[] iArr = b12.f37903o;
            androidx.collection.A0<O1> a02 = b12.f37910v;
            b12.f37903o = null;
            b12.f37910v = null;
            try {
                b12.f37878G = k22;
                boolean z12 = bVar.f38195e;
                try {
                    bVar.f38195e = false;
                    b12.i0(c22183t1.f38765a, c22183t1.f38771g, c22183t1.f38766b, true);
                    bVar.f38195e = z12;
                    kotlin.G0 g02 = kotlin.G0.f406611a;
                    bVar.f38192b = aVar2;
                    return kotlin.G0.f406611a;
                } catch (Throwable th2) {
                    bVar.f38195e = z12;
                    throw th2;
                }
            } finally {
                b12.f37878G = k23;
                b12.f37903o = iArr;
                b12.f37910v = a02;
            }
        } catch (Throwable th3) {
            bVar.f38192b = aVar2;
            throw th3;
        }
    }
}
