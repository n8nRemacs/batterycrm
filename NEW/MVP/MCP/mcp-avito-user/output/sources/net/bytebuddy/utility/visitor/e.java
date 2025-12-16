package net.bytebuddy.utility.visitor;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import net.bytebuddy.implementation.bytecode.StackSize;
import net.bytebuddy.jar.asm.B;
import net.bytebuddy.jar.asm.p;
import net.bytebuddy.jar.asm.r;
import net.bytebuddy.jar.asm.s;

/* compiled from: StackAwareMethodVisitor.java */
/* loaded from: classes7.dex */
public class e extends s {

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f419001g;

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f419002h;

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f419003i;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f419004d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f419005e;

    /* renamed from: f, reason: collision with root package name */
    public int f419006f;

    /* compiled from: StackAwareMethodVisitor.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f419007a;

        static {
            int[] iArr = new int[StackSize.values().length];
            f419007a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f419007a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        boolean z12;
        int i12 = 0;
        try {
            Class.forName("java.security.AccessController", false, null);
            f419003i = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
        } catch (ClassNotFoundException unused) {
            f419003i = false;
        } catch (SecurityException unused2) {
            f419003i = true;
        }
        try {
            z12 = Boolean.parseBoolean((String) (f419003i ? AccessController.doPrivileged(new net.bytebuddy.utility.privilege.b("net.bytebuddy.unadjusted")) : System.getProperty("net.bytebuddy.unadjusted")));
        } catch (Exception unused3) {
            z12 = false;
        }
        f419001g = z12;
        f419002h = new int[202];
        while (true) {
            int[] iArr = f419002h;
            if (i12 >= iArr.length) {
                return;
            }
            iArr[i12] = "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEEEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE".charAt(i12) - 'E';
            i12++;
        }
    }

    public e(s sVar, net.bytebuddy.description.method.a aVar) {
        super(net.bytebuddy.utility.e.f418981b, sVar);
        this.f419004d = new ArrayList();
        this.f419005e = new HashMap();
        this.f419006f = aVar.p();
    }

    @Override // net.bytebuddy.jar.asm.s
    public final void A(String str, String str2, String str3, int i12, boolean z12) {
        int iE2 = B.e(str3);
        K((-(iE2 >> 2)) + (i12 == 184 ? 1 : 0), 0);
        K(iE2 & 3, 0);
        super.A(str, str2, str3, i12, z12);
    }

    @Override // net.bytebuddy.jar.asm.s
    public final void B(int i12, String str) {
        K(1 - i12, 0);
        super.B(i12, str);
    }

    @Override // net.bytebuddy.jar.asm.s
    public final void E(int i12, int i13, r rVar, r... rVarArr) {
        K(-1, 0);
        ArrayList arrayList = new ArrayList(this.f419004d);
        HashMap map = this.f419005e;
        map.put(rVar, arrayList);
        for (r rVar2 : rVarArr) {
            map.put(rVar2, arrayList);
        }
        super.E(i12, i13, rVar, rVarArr);
    }

    @Override // net.bytebuddy.jar.asm.s
    public final void G(r rVar, r rVar2, r rVar3, @net.bytebuddy.utility.nullability.b String str) {
        this.f419005e.put(rVar3, Collections.singletonList(StackSize.SINGLE));
        super.G(rVar, rVar2, rVar3, str);
    }

    @Override // net.bytebuddy.jar.asm.s
    public final void I(int i12, String str) {
        K(f419002h[i12], 0);
        super.I(i12, str);
    }

    @Override // net.bytebuddy.jar.asm.s
    @SuppressFBWarnings(justification = "No action required on default option.", value = {"SF_SWITCH_NO_DEFAULT"})
    public final void J(int i12, int i13) {
        if (i12 != 169) {
            switch (i12) {
                case 54:
                case 56:
                case 58:
                    this.f419006f = Math.max(this.f419006f, i13 + 1);
                    break;
                case 55:
                case 57:
                    this.f419006f = Math.max(this.f419006f, i13 + 2);
                    break;
            }
        } else {
            this.f419004d.clear();
        }
        K(f419002h[i12], 0);
        super.J(i12, i13);
    }

    public final void K(int i12, int i13) {
        if (i12 > 2) {
            throw new IllegalStateException(AK.c.g(i12, "Cannot push multiple values onto the operand stack: "));
        }
        StackSize stackSize = StackSize.SINGLE;
        if (i12 <= 0) {
            if (i13 != 0) {
                throw new IllegalStateException(H.j(i13, i12, "Cannot specify non-zero offset ", " for non-incrementing value: "));
            }
            while (i12 < 0) {
                if (this.f419004d.isEmpty()) {
                    return;
                } else {
                    i12 += ((StackSize) C22026a.b(1, this.f419004d)).f417839b;
                }
            }
            if (i12 == 1) {
                this.f419004d.add(stackSize);
                return;
            } else {
                if (i12 != 0) {
                    throw new IllegalStateException(AK.c.g(i12, "Unexpected remainder on the operand stack: "));
                }
                return;
            }
        }
        int size = this.f419004d.size();
        while (i13 > 0 && size > 0) {
            size--;
            i13 -= ((StackSize) this.f419004d.get(size)).f417839b;
        }
        if (i13 < 0) {
            throw new IllegalStateException(AK.c.g(i13, "Unexpected offset underflow: "));
        }
        ArrayList arrayList = this.f419004d;
        if (i12 == 0) {
            stackSize = StackSize.ZERO;
        } else if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalArgumentException(AK.c.g(i12, "Unexpected stack size value: "));
            }
            stackSize = StackSize.DOUBLE;
        }
        arrayList.add(size, stackSize);
    }

    public final void L(List<StackSize> list) {
        ListIterator<StackSize> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            StackSize stackSizePrevious = listIterator.previous();
            int iOrdinal = stackSizePrevious.ordinal();
            if (iOrdinal == 1) {
                super.m(87);
            } else {
                if (iOrdinal != 2) {
                    throw new IllegalStateException("Unexpected stack size: " + stackSizePrevious);
                }
                super.m(88);
            }
        }
    }

    public final int M(int i12, int i13, StackSize stackSize) {
        if (this.f419004d.isEmpty()) {
            return 0;
        }
        int i14 = ((StackSize) androidx.appcompat.app.r.j(1, this.f419004d)).f417839b;
        int i15 = stackSize.f417839b;
        int i16 = i14 - i15;
        if (this.f419004d.size() == 1 && i16 == 0) {
            return 0;
        }
        super.J(i12, this.f419006f);
        if (i16 == 1) {
            super.m(87);
        } else if (i16 != 0) {
            throw new IllegalStateException(AK.c.g(i16, "Unexpected remainder on the operand stack: "));
        }
        ArrayList arrayList = this.f419004d;
        L(arrayList.subList(0, arrayList.size() - 1));
        super.J(i13, this.f419006f);
        return this.f419006f + i15;
    }

    @Override // net.bytebuddy.jar.asm.s
    public final void j(int i12, String str, String str2, String str3) {
        int iS2 = B.v(str3).s();
        switch (i12) {
            case 178:
                K(iS2, 0);
                break;
            case 179:
                K(-iS2, 0);
                break;
            case 180:
                K(-1, 0);
                K(iS2, 0);
                break;
            case 181:
                K((-iS2) - 1, 0);
                break;
            default:
                throw new IllegalStateException(AK.c.g(i12, "Unexpected opcode: "));
        }
        super.j(i12, str, str2, str3);
    }

    @Override // net.bytebuddy.jar.asm.s
    @SuppressFBWarnings(justification = "ASM models frames by reference identity.", value = {"RC_REF_COMPARISON_BAD_PRACTICE"})
    public final void k(@net.bytebuddy.utility.nullability.b Object[] objArr, int i12, @net.bytebuddy.utility.nullability.b Object[] objArr2, int i13, int i14) {
        StackSize stackSize = StackSize.DOUBLE;
        StackSize stackSize2 = StackSize.SINGLE;
        if (i12 == -1 || i12 == 0) {
            this.f419004d.clear();
            for (int i15 = 0; i15 < i14; i15++) {
                if (objArr2[i15] == 4 || objArr2[i15] == 3) {
                    this.f419004d.add(stackSize);
                } else {
                    this.f419004d.add(stackSize2);
                }
            }
        } else if (i12 == 1 || i12 == 2 || i12 == 3) {
            this.f419004d.clear();
        } else {
            if (i12 != 4) {
                throw new IllegalStateException(AK.c.g(i12, "Unknown frame type: "));
            }
            this.f419004d.clear();
            if (objArr2[0] == 4 || objArr2[0] == 3) {
                this.f419004d.add(stackSize);
            } else {
                this.f419004d.add(stackSize2);
            }
        }
        super.k(objArr, i12, objArr2, i13, i14);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    @Override // net.bytebuddy.jar.asm.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r6) {
        /*
            r5 = this;
            r0 = 2
            r1 = 47
            r2 = -2
            r3 = 0
            if (r6 == r1) goto L5e
            r1 = 49
            if (r6 == r1) goto L5e
            r1 = 133(0x85, float:1.86E-43)
            if (r6 == r1) goto L56
            r1 = 144(0x90, float:2.02E-43)
            if (r6 == r1) goto L4e
            r1 = 191(0xbf, float:2.68E-43)
            if (r6 == r1) goto L48
            r1 = 90
            int[] r4 = net.bytebuddy.utility.visitor.e.f419002h
            if (r6 == r1) goto L40
            r1 = 91
            if (r6 == r1) goto L38
            r1 = 93
            if (r6 == r1) goto L40
            r1 = 94
            if (r6 == r1) goto L38
            switch(r6) {
                case 135: goto L56;
                case 136: goto L4e;
                case 137: goto L4e;
                default: goto L2c;
            }
        L2c:
            switch(r6) {
                case 140: goto L56;
                case 141: goto L56;
                case 142: goto L4e;
                default: goto L2f;
            }
        L2f:
            switch(r6) {
                case 172: goto L48;
                case 173: goto L48;
                case 174: goto L48;
                case 175: goto L48;
                case 176: goto L48;
                case 177: goto L48;
                default: goto L32;
            }
        L32:
            r0 = r4[r6]
            r5.K(r0, r3)
            goto L64
        L38:
            r0 = r4[r6]
            int r1 = r0 + 2
            r5.K(r0, r1)
            goto L64
        L40:
            r0 = r4[r6]
            int r1 = r0 + 1
            r5.K(r0, r1)
            goto L64
        L48:
            java.util.ArrayList r0 = r5.f419004d
            r0.clear()
            goto L64
        L4e:
            r5.K(r2, r3)
            r0 = 1
            r5.K(r0, r3)
            goto L64
        L56:
            r1 = -1
            r5.K(r1, r3)
            r5.K(r0, r3)
            goto L64
        L5e:
            r5.K(r2, r3)
            r5.K(r0, r3)
        L64:
            super.m(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.utility.visitor.e.m(int):void");
    }

    @Override // net.bytebuddy.jar.asm.s
    public final void o(int i12, int i13) {
        K(f419002h[i12], 0);
        super.o(i12, i13);
    }

    @Override // net.bytebuddy.jar.asm.s
    public final void p(String str, String str2, p pVar, Object... objArr) {
        int iE2 = B.e(str2);
        K((-(iE2 >> 2)) + 1, 0);
        K(iE2 & 3, 0);
        super.p(str, str2, pVar, objArr);
    }

    @Override // net.bytebuddy.jar.asm.s
    public final void r(int i12, r rVar) {
        K(f419002h[i12], 0);
        this.f419005e.put(rVar, new ArrayList(i12 == 168 ? net.bytebuddy.utility.a.d(this.f419004d, StackSize.SINGLE) : this.f419004d));
        if (i12 == 167) {
            this.f419004d.clear();
        }
        super.r(i12, rVar);
    }

    @Override // net.bytebuddy.jar.asm.s
    public final void s(r rVar) {
        List list = (List) this.f419005e.get(rVar);
        if (list != null) {
            this.f419004d = new ArrayList(list);
        }
        super.s(rVar);
    }

    @Override // net.bytebuddy.jar.asm.s
    public final void t(Object obj) {
        K(((obj instanceof Long) || (obj instanceof Double)) ? 2 : 1, 0);
        super.t(obj);
    }

    @Override // net.bytebuddy.jar.asm.s
    public final void x(r rVar, int[] iArr, r[] rVarArr) {
        K(-1, 0);
        ArrayList arrayList = new ArrayList(this.f419004d);
        HashMap map = this.f419005e;
        map.put(rVar, arrayList);
        for (r rVar2 : rVarArr) {
            map.put(rVar2, arrayList);
        }
        super.x(rVar, iArr, rVarArr);
    }
}
