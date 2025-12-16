package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.collections.C42754k;

/* compiled from: ArrayPools.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/json/internal/m;", "", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.serialization.json.internal.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C43462m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C42754k<char[]> f413110a = new C42754k<>();

    /* renamed from: b, reason: collision with root package name */
    public int f413111b;

    @Y61.k
    public final char[] a(int i12) {
        char[] cArr;
        synchronized (this) {
            C42754k<char[]> c42754k = this.f413110a;
            cArr = null;
            char[] cArrRemoveLast = c42754k.isEmpty() ? null : c42754k.removeLast();
            if (cArrRemoveLast != null) {
                this.f413111b -= cArrRemoveLast.length;
                cArr = cArrRemoveLast;
            }
        }
        return cArr == null ? new char[i12] : cArr;
    }
}
