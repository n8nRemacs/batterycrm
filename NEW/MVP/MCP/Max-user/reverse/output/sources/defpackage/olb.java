package defpackage;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/* loaded from: classes3.dex */
public class olb {
    public static final sb3 h = new sb3(4);
    public final qje a;
    public final hf5 b;
    public final mde c;
    public final b6 d;
    public final n7 e;
    public volatile boolean f;
    public oe5 g;

    public olb(qje qjeVar, hf5 hf5Var, mde mdeVar, b6 b6Var) {
        this(qjeVar, hf5Var, mdeVar, b6Var, new n7());
    }

    public Optional a(byte[] bArr, int i, byte[] bArr2, int i2) {
        boolean z;
        boolean z2;
        z5 z5Var;
        Optional optionalOf;
        oe5 oe5Var;
        int iMin = Integer.min(i, i2);
        btc btcVarB = b(bArr, bArr2);
        ArrayList arrayList = new ArrayList();
        mde mdeVar = this.c;
        Instant instant = mdeVar.a.instant();
        synchronized (mdeVar.e) {
            try {
                Instant instant2 = mdeVar.f;
                z = false;
                z2 = instant2 != null && (instant.isAfter(instant2) || Duration.between(instant, mdeVar.f).toMillis() < 1);
                if (z2) {
                    mdeVar.f = null;
                }
            } finally {
            }
        }
        if (z2 && this.d.c()) {
            z5Var = (z5) this.d.a().get();
            if (btcVarB.h(z5Var.c()) > i2) {
                mde mdeVar2 = this.c;
                synchronized (mdeVar2.e) {
                    mdeVar2.f = mdeVar2.a.instant();
                }
                return Optional.empty();
            }
            btcVarB.b(z5Var);
            arrayList.add(h);
            this.d.f(z5Var, btcVarB.m().longValue());
        } else {
            z5Var = null;
        }
        int iC = (z5Var != null || this.c.c.isEmpty() || !this.d.b() || (z5Var = (z5) this.d.a().orElse(null)) == null) ? 0 : z5Var.c();
        List list = (List) this.c.d.peekFirst();
        if (list != null && !list.isEmpty()) {
            List listC = this.c.c();
            if (btcVarB.h(listC.stream().mapToInt(new n0(14)).sum()) > i2) {
                r0c r0cVar = new r0c();
                if (btcVarB.h(1) > i2) {
                    return Optional.empty();
                }
                ArrayList arrayList2 = new ArrayList(1);
                Object obj = new Object[]{r0cVar}[0];
                Objects.requireNonNull(obj);
                arrayList2.add(obj);
                listC = Collections.unmodifiableList(arrayList2);
            }
            btcVarB.f = true;
            btcVarB.c.addAll(listC);
            return Optional.of(new dde(btcVarB));
        }
        if (!this.c.c.isEmpty()) {
            int iH = btcVarB.h(1000) - 1000;
            while (iH < iMin) {
                int i3 = iMin - iH;
                int i4 = i3 - iC;
                Optional optionalD = this.c.d(i4);
                if (optionalD.isPresent() || iC <= 0) {
                    i3 = i4;
                } else {
                    optionalD = this.c.d(i3);
                }
                if (!optionalD.isPresent()) {
                    break;
                }
                atc atcVarC = ((lde) optionalD.get()).c(i3);
                if (atcVarC != null) {
                    if (atcVarC.c() > i3) {
                        StringBuilder sbK = wy1.k("supplier does not produce frame of right (max) size: ", atcVarC.c(), " > ", i3, " frame: ");
                        sbK.append(atcVarC);
                        throw new RuntimeException(sbK.toString());
                    }
                    int iC2 = atcVarC.c() + iH;
                    btcVarB.b(atcVarC);
                    arrayList.add(((lde) optionalD.get()).b());
                    if (iC <= 0 || iC2 + iC > iMin) {
                        iH = iC2;
                    } else {
                        btcVarB.b(z5Var);
                        arrayList.add(h);
                        this.d.f(z5Var, btcVarB.m().longValue());
                        iH = z5Var.c() + iC2;
                        iC = 0;
                    }
                }
            }
        }
        if (!this.c.d.isEmpty() && btcVarB.c.isEmpty()) {
            this.c.c();
            btcVarB.f = true;
            btcVarB.b(new r0c());
            arrayList.add(h);
        }
        if (btcVarB.c.isEmpty()) {
            this.e.a--;
            optionalOf = Optional.empty();
        } else {
            if (btcVarB.c.size() != arrayList.size()) {
                throw new IllegalStateException();
            }
            optionalOf = Optional.of(new dde(btcVarB, new m17(arrayList, 2)));
        }
        if (this.f) {
            mde mdeVar3 = this.c;
            synchronized (mdeVar3.e) {
                try {
                    if (mdeVar3.c.isEmpty() && mdeVar3.f == null) {
                        z = true;
                    }
                } finally {
                }
            }
            if (z && (oe5Var = this.g) != null) {
                oe5Var.accept(this);
                return optionalOf;
            }
        }
        return optionalOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.btc b(byte[] r5, byte[] r6) {
        /*
            r4 = this;
            hf5 r0 = r4.b
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == r1) goto L39
            r1 = 2
            if (r0 == r1) goto L2c
            r5 = 3
            if (r0 != r5) goto L26
            rwe r5 = new rwe
            qje r0 = r4.a
            java.lang.Object r0 = r0.b
            zzg r0 = (defpackage.zzg) r0
            r5.<init>()
            r5.a = r0
            r5.e = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5.c = r6
            goto L45
        L26:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            r5.<init>()
            throw r5
        L2c:
            i07 r0 = new i07
            qje r1 = r4.a
            java.lang.Object r1 = r1.b
            zzg r1 = (defpackage.zzg) r1
            r0.<init>(r1, r5, r6)
        L37:
            r5 = r0
            goto L45
        L39:
            i7i r0 = new i7i
            qje r1 = r4.a
            java.lang.Object r1 = r1.b
            zzg r1 = (defpackage.zzg) r1
            r0.<init>(r1, r5, r6)
            goto L37
        L45:
            n7 r6 = r4.e
            long r0 = r6.a
            r2 = 1
            long r2 = r2 + r0
            r6.a = r2
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 < 0) goto L57
            r5.b = r0
            return r5
        L57:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.olb.b(byte[], byte[]):btc");
    }

    public final String toString() {
        return "PacketAssembler[" + this.b + "]";
    }

    public olb(qje qjeVar, hf5 hf5Var, mde mdeVar, b6 b6Var, n7 n7Var) {
        this.a = qjeVar;
        this.b = hf5Var;
        this.c = mdeVar;
        this.d = b6Var;
        this.e = n7Var;
    }
}
