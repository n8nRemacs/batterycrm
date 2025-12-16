package kotlinx.coroutines.flow.internal;

import androidx.compose.runtime.C22026a;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.F0;
import kotlinx.coroutines.channels.K0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ChannelFlow.kt */
@s0
@I0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/flow/internal/f;", "T", "Lkotlinx/coroutines/flow/internal/w;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.flow.internal.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43168f<T> implements w<T> {

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final CoroutineContext f411466b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    public final int f411467c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final BufferOverflow f411468d;

    public AbstractC43168f(@Y61.k CoroutineContext coroutineContext, int i12, @Y61.k BufferOverflow bufferOverflow) {
        this.f411466b = coroutineContext;
        this.f411467c = i12;
        this.f411468d = bufferOverflow;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // kotlinx.coroutines.flow.internal.w
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.flow.InterfaceC43160i<T> Bc(@Y61.k kotlin.coroutines.CoroutineContext r5, int r6, @Y61.k kotlinx.coroutines.channels.BufferOverflow r7) {
        /*
            r4 = this;
            kotlin.coroutines.CoroutineContext r0 = r4.f411466b
            kotlin.coroutines.CoroutineContext r5 = r5.plus(r0)
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.f410777b
            kotlinx.coroutines.channels.BufferOverflow r2 = r4.f411468d
            int r3 = r4.f411467c
            if (r7 == r1) goto Lf
            goto L26
        Lf:
            r7 = -3
            if (r3 != r7) goto L13
            goto L25
        L13:
            if (r6 != r7) goto L17
        L15:
            r6 = r3
            goto L25
        L17:
            r7 = -2
            if (r3 != r7) goto L1b
            goto L25
        L1b:
            if (r6 != r7) goto L1e
            goto L15
        L1e:
            int r6 = r6 + r3
            if (r6 < 0) goto L22
            goto L25
        L22:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L25:
            r7 = r2
        L26:
            boolean r0 = kotlin.jvm.internal.L.f(r5, r0)
            if (r0 == 0) goto L31
            if (r6 != r3) goto L31
            if (r7 != r2) goto L31
            return r4
        L31:
            kotlinx.coroutines.flow.internal.f r5 = r4.c(r5, r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.AbstractC43168f.Bc(kotlin.coroutines.CoroutineContext, int, kotlinx.coroutines.channels.BufferOverflow):kotlinx.coroutines.flow.i");
    }

    @Y61.l
    public String a() {
        return null;
    }

    @Y61.l
    public abstract Object b(@Y61.k kotlinx.coroutines.channels.I0<? super T> i02, @Y61.k Continuation<? super G0> continuation);

    @Y61.k
    public abstract AbstractC43168f<T> c(@Y61.k CoroutineContext coroutineContext, int i12, @Y61.k BufferOverflow bufferOverflow);

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public Object collect(@Y61.k InterfaceC43172j<? super T> interfaceC43172j, @Y61.k Continuation<? super G0> continuation) {
        Object objC = U.c(new C43166d(interfaceC43172j, this, null), continuation);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : G0.f406611a;
    }

    @Y61.l
    public InterfaceC43160i<T> d() {
        return null;
    }

    @Y61.k
    public K0<T> e(@Y61.k T t12) {
        int i12 = this.f411467c;
        if (i12 == -3) {
            i12 = -2;
        }
        CoroutineStart coroutineStart = CoroutineStart.f410682d;
        C43167e c43167e = new C43167e(this, null);
        return F0.c(t12, this.f411466b, i12, this.f411468d, coroutineStart, c43167e);
    }

    @Y61.k
    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strA = a();
        if (strA != null) {
            arrayList.add(strA);
        }
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        CoroutineContext coroutineContext = this.f411466b;
        if (coroutineContext != emptyCoroutineContext) {
            arrayList.add("context=" + coroutineContext);
        }
        int i12 = this.f411467c;
        if (i12 != -3) {
            arrayList.add("capacity=" + i12);
        }
        BufferOverflow bufferOverflow = BufferOverflow.f410777b;
        BufferOverflow bufferOverflow2 = this.f411468d;
        if (bufferOverflow2 != bufferOverflow) {
            arrayList.add("onBufferOverflow=" + bufferOverflow2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        return C22026a.c(sb2, C42745f0.O(arrayList, ", ", null, null, null, 62), ']');
    }
}
