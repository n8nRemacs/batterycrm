package tb1;

import Y61.k;
import Y61.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42754k;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import tb1.b;

/* compiled from: Buffer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Ltb1/a;", "T", "", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* renamed from: tb1.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48644a<T> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f439328a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C42754k<b> f439329b;

    /* JADX WARN: Illegal instructions before constructor call */
    public C48644a() {
        C42822w c42822w = null;
        this(c42822w, 1, c42822w);
    }

    public final void a(@k b bVar) {
        synchronized (this.f439328a) {
            this.f439329b.addLast(bVar);
            G0 g02 = G0.f406611a;
        }
    }

    @l
    public final b b() {
        b bVarV;
        synchronized (this.f439328a) {
            try {
                bVarV = this.f439329b.v();
                if (!(bVarV instanceof b.C12675b)) {
                    if (bVarV instanceof b.c) {
                        bVarV = (b.c) bVarV;
                    } else if (!L.f(bVarV, b.a.f439330a)) {
                        if (bVarV != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bVarV = null;
                    }
                }
            } finally {
            }
        }
        return bVarV;
    }

    public C48644a(@k Object obj) {
        this.f439328a = obj;
        this.f439329b = new C42754k<>();
    }

    public /* synthetic */ C48644a(Object obj, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? new Object() : obj);
    }
}
