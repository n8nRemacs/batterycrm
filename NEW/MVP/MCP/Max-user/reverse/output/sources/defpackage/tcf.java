package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.Concurrent_commonKt;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public final class tcf extends n4 implements f9a, o42, pn6 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater X = AtomicReferenceFieldUpdater.newUpdater(tcf.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    public int o;

    public tcf(Object obj) {
        this._state$volatile = obj;
    }

    @Override // defpackage.e9a, defpackage.z26
    public final Object a(Object obj, Continuation continuation) {
        setValue(obj);
        return qqg.a;
    }

    @Override // defpackage.fve
    public final List b() {
        return Collections.singletonList(getValue());
    }

    @Override // defpackage.f9a
    public final boolean c(Object obj, Object obj2) {
        if (obj == null) {
            obj = bqa.a;
        }
        if (obj2 == null) {
            obj2 = bqa.a;
        }
        return m(obj, obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        if (((defpackage.xnf) r0).b(r3) == r8) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0094, code lost:
    
        if (r2 != r8) goto L36;
     */
    /* JADX WARN: Path cross not found for [B:44:0x00aa, B:46:0x00b0], limit reached: 74 */
    /* JADX WARN: Path cross not found for [B:46:0x00b0, B:44:0x00aa], limit reached: 74 */
    /* JADX WARN: Path cross not found for [B:46:0x00b0, B:54:0x00cb], limit reached: 74 */
    /* JADX WARN: Path cross not found for [B:66:0x010a, B:67:0x010b], limit reached: 74 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:14:0x0039, B:36:0x0094, B:38:0x009c, B:41:0x00a3, B:42:0x00a7, B:44:0x00aa, B:54:0x00cb, B:57:0x00d8, B:58:0x00f4, B:64:0x0104, B:61:0x00fb, B:63:0x0101, B:46:0x00b0, B:50:0x00b7, B:21:0x0052, B:24:0x005d, B:35:0x0087), top: B:73:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:14:0x0039, B:36:0x0094, B:38:0x009c, B:41:0x00a3, B:42:0x00a7, B:44:0x00aa, B:54:0x00cb, B:57:0x00d8, B:58:0x00f4, B:64:0x0104, B:61:0x00fb, B:63:0x0101, B:46:0x00b0, B:50:0x00b7, B:21:0x0052, B:24:0x005d, B:35:0x0087), top: B:73:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d8 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:14:0x0039, B:36:0x0094, B:38:0x009c, B:41:0x00a3, B:42:0x00a7, B:44:0x00aa, B:54:0x00cb, B:57:0x00d8, B:58:0x00f4, B:64:0x0104, B:61:0x00fb, B:63:0x0101, B:46:0x00b0, B:50:0x00b7, B:21:0x0052, B:24:0x005d, B:35:0x0087), top: B:73:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00d7 -> B:36:0x0094). Please report as a decompilation issue!!! */
    @Override // defpackage.x26
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.z26 r18, kotlin.coroutines.Continuation r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tcf.d(z26, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.pn6
    public final x26 e(x74 x74Var, int i, int i2) {
        Symbol symbol = ucf.a;
        return (((i < 0 || i >= 2) && i != -2) || i2 != 2) ? kve.e(this, x74Var, i, i2) : this;
    }

    @Override // defpackage.e9a
    public final void g() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // defpackage.f9a, defpackage.mcf
    public final Object getValue() {
        Symbol symbol = bqa.a;
        Object obj = X.get(this);
        if (obj == symbol) {
            return null;
        }
        return obj;
    }

    @Override // defpackage.e9a
    public final boolean h(Object obj) {
        setValue(obj);
        return true;
    }

    @Override // defpackage.n4
    public final o4 j() {
        return new vcf();
    }

    @Override // defpackage.n4
    public final o4[] k() {
        return new vcf[2];
    }

    public final boolean m(Object obj, Object obj2) {
        int i;
        o4[] o4VarArr;
        Symbol symbol;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !fni.a(obj3, obj)) {
                return false;
            }
            if (fni.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.o;
            if ((i2 & 1) != 0) {
                this.o = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.o = i3;
            o4[] o4VarArr2 = this.a;
            while (true) {
                vcf[] vcfVarArr = (vcf[]) o4VarArr2;
                if (vcfVarArr != null) {
                    for (vcf vcfVar : vcfVarArr) {
                        if (vcfVar != null) {
                            AtomicReference atomicReference = vcfVar.a;
                            while (true) {
                                Object value = Concurrent_commonKt.getValue(atomicReference);
                                if (value != null && value != (symbol = ucf.b)) {
                                    Symbol symbol2 = ucf.a;
                                    if (value != symbol2) {
                                        while (!atomicReference.compareAndSet(value, symbol2)) {
                                            if (atomicReference.get() != value) {
                                                break;
                                            }
                                        }
                                        ((l42) value).resumeWith(qqg.a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(value, symbol)) {
                                        if (atomicReference.get() != value) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.o;
                    if (i == i3) {
                        this.o = i3 + 1;
                        return true;
                    }
                    o4VarArr = this.a;
                }
                o4VarArr2 = o4VarArr;
                i3 = i;
            }
        }
    }

    @Override // defpackage.f9a
    public final void setValue(Object obj) {
        if (obj == null) {
            obj = bqa.a;
        }
        m(null, obj);
    }
}
