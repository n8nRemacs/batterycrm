package androidx.compose.runtime.snapshots;

import androidx.collection.S0;
import androidx.compose.runtime.snapshots.H;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SnapshotStateObserver.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class I extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ H f38652l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(H h12) {
        super(0);
        this.f38652l = h12;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [int] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // Y41.a
    public final G0 invoke() {
        boolean z12;
        int i12;
        H.a[] aVarArr;
        ?? r62;
        H.a[] aVarArr2;
        boolean z13 = true;
        while (true) {
            H h12 = this.f38652l;
            synchronized (h12.f38633g) {
                try {
                    if (h12.f38629c) {
                        z12 = z13;
                    } else {
                        h12.f38629c = z13;
                        try {
                            androidx.compose.runtime.collection.e<H.a> eVar = h12.f38632f;
                            H.a[] aVarArr3 = eVar.f38260b;
                            int i13 = eVar.f38262d;
                            int i14 = 0;
                            while (i14 < i13) {
                                H.a aVar = aVarArr3[i14];
                                S0<Object> s02 = aVar.f38643g;
                                Object[] objArr = s02.f25730b;
                                long[] jArr = s02.f25729a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i15 = 0;
                                    while (true) {
                                        long j12 = jArr[i15];
                                        i12 = i13;
                                        if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i16 = 8;
                                            int i17 = 8 - ((~(i15 - length)) >>> 31);
                                            int i18 = 0;
                                            while (i18 < i17) {
                                                if ((j12 & 255) < 128) {
                                                    aVarArr2 = aVarArr3;
                                                    aVar.f38637a.invoke(objArr[(i15 << 3) + i18]);
                                                    i16 = 8;
                                                } else {
                                                    aVarArr2 = aVarArr3;
                                                }
                                                j12 >>= i16;
                                                i18++;
                                                aVarArr3 = aVarArr2;
                                            }
                                            aVarArr = aVarArr3;
                                            r62 = 1;
                                            r62 = 1;
                                            if (i17 != i16) {
                                                break;
                                            }
                                        } else {
                                            aVarArr = aVarArr3;
                                            r62 = z13;
                                        }
                                        if (i15 == length) {
                                            break;
                                        }
                                        i15 += r62 == true ? 1 : 0;
                                        z13 = r62 == true ? 1 : 0;
                                        i13 = i12;
                                        aVarArr3 = aVarArr;
                                    }
                                } else {
                                    i12 = i13;
                                    aVarArr = aVarArr3;
                                    r62 = z13;
                                }
                                s02.g();
                                i14 += r62;
                                z13 = r62;
                                i13 = i12;
                                aVarArr3 = aVarArr;
                            }
                            z12 = z13;
                            h12.f38629c = false;
                        } catch (Throwable th2) {
                            h12.f38629c = false;
                            throw th2;
                        }
                    }
                    G0 g02 = G0.f406611a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (!H.a(this.f38652l)) {
                return G0.f406611a;
            }
            z13 = z12;
        }
    }
}
