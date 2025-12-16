package kotlinx.coroutines.flow.internal;

import java.util.Arrays;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractC43165c;
import kotlinx.coroutines.flow.n2;

/* compiled from: AbstractSharedFlow.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00060\u0003j\u0002`\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/flow/internal/a;", "Lkotlinx/coroutines/flow/internal/c;", "S", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.flow.internal.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43163a<S extends AbstractC43165c<?>> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public S[] f411454b;

    /* renamed from: c, reason: collision with root package name */
    public int f411455c;

    /* renamed from: d, reason: collision with root package name */
    public int f411456d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public H f411457e;

    @Y61.k
    public final S a() {
        S s5;
        H h12;
        synchronized (this) {
            try {
                S[] sArr = this.f411454b;
                if (sArr == null) {
                    sArr = (S[]) c();
                    this.f411454b = sArr;
                } else if (this.f411455c >= sArr.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length * 2);
                    this.f411454b = (S[]) ((AbstractC43165c[]) objArrCopyOf);
                    sArr = (S[]) ((AbstractC43165c[]) objArrCopyOf);
                }
                int i12 = this.f411456d;
                do {
                    s5 = sArr[i12];
                    if (s5 == null) {
                        s5 = (S) b();
                        sArr[i12] = s5;
                    }
                    i12++;
                    if (i12 >= sArr.length) {
                        i12 = 0;
                    }
                } while (!s5.a(this));
                this.f411456d = i12;
                this.f411455c++;
                h12 = this.f411457e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (h12 != null) {
            h12.r(1);
        }
        return s5;
    }

    @Y61.k
    public final n2<Integer> ac() {
        H h12;
        synchronized (this) {
            h12 = this.f411457e;
            if (h12 == null) {
                int i12 = this.f411455c;
                h12 = new H(1, Integer.MAX_VALUE, BufferOverflow.f410778c);
                h12.K5(Integer.valueOf(i12));
                this.f411457e = h12;
            }
        }
        return h12;
    }

    @Y61.k
    public abstract S b();

    @Y61.k
    public abstract AbstractC43165c[] c();

    public final void d(@Y61.k S s5) {
        H h12;
        int i12;
        Continuation[] continuationArrB;
        synchronized (this) {
            try {
                int i13 = this.f411455c - 1;
                this.f411455c = i13;
                h12 = this.f411457e;
                if (i13 == 0) {
                    this.f411456d = 0;
                }
                continuationArrB = s5.b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (Continuation continuation : continuationArrB) {
            if (continuation != null) {
                int i14 = Z.f406624c;
                continuation.resumeWith(G0.f406611a);
            }
        }
        if (h12 != null) {
            h12.r(-1);
        }
    }
}
