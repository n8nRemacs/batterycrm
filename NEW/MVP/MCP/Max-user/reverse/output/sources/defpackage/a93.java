package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.ViewGroup;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class a93 implements clb, ue2 {
    public static final v1a s0 = new v1a(16);
    public static volatile a93 t0;
    public Object X;
    public Object Y;
    public Object Z;
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object o;

    public a93(int i) {
        switch (i) {
            case 5:
                this.b = new iqa(2);
                this.d = jm.a;
                this.Z = hd5.a;
                break;
            default:
                this.a = new AtomicInteger(0);
                this.b = new AtomicInteger(0);
                this.c = new AtomicInteger(0);
                this.d = new AtomicInteger(0);
                this.o = new AtomicInteger(0);
                this.X = new AtomicInteger(0);
                this.Y = new AtomicInteger(0);
                this.Z = new ConcurrentHashMap();
                break;
        }
    }

    public static void g(ViewGroup viewGroup, yeb yebVar) {
        lee.e(lee.l(zfi.g(new at(8, viewGroup), new n8(0), new o8(0, yebVar)), new o8(1, yebVar)));
    }

    public static /* synthetic */ void h(a93 a93Var, ViewGroup viewGroup) {
        yeb yebVarK = a93Var.k();
        a93Var.getClass();
        g(viewGroup, yebVarK);
    }

    @Override // defpackage.ue2
    public void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            pb2 pb2Var = (pb2) it.next();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.o;
            long j = pb2Var.a;
            rf2 rf2Var = pb2Var.b;
            ((f9a) concurrentHashMap.computeIfAbsent(Long.valueOf(j), new ni(8, new d63(pb2Var, 0)))).setValue(pb2Var);
            if (rf2Var.a == 0 && !rf2Var.e(((l4e) ((k18) this.c).getValue()).a())) {
                return;
            }
            ((f9a) ((ConcurrentHashMap) this.X).computeIfAbsent(Long.valueOf(rf2Var.a), new ni(4, new d63(pb2Var, 1)))).setValue(pb2Var);
        }
    }

    @Override // defpackage.ue2
    public void b(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            f9a f9aVar = (f9a) ((ConcurrentHashMap) this.o).remove(Long.valueOf(((Number) it.next()).longValue()));
            if (f9aVar != null) {
                pb2 pb2Var = (pb2) f9aVar.getValue();
                f9aVar.setValue(null);
                if (pb2Var != null) {
                    rf2 rf2Var = pb2Var.b;
                    if (rf2Var.a == 0 && !rf2Var.e(((l4e) ((k18) this.c).getValue()).a())) {
                        return;
                    }
                    f9a f9aVar2 = (f9a) ((ConcurrentHashMap) this.X).remove(Long.valueOf(rf2Var.a));
                    if (f9aVar2 != null) {
                        f9aVar2.setValue(null);
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.List] */
    public kua c() {
        wo3 wo3Var = (wo3) this.a;
        ubg ubgVar = (ubg) this.b;
        rm rmVar = (rm) this.Y;
        vm vmVar = (vm) this.X;
        u5i u5iVar = (u5i) this.o;
        if (rmVar != null && vmVar != null && u5iVar != null) {
            return new ro4(this, rmVar, vmVar, u5iVar, this.Z);
        }
        if (wo3Var == null || ubgVar == null) {
            throw new IllegalArgumentException("You must either provide configurationStore and tokenProvider, either sessionStore, tokenInfoProvider and appKeyProvider");
        }
        return new au4(this, wo3Var, ubgVar, this.Z);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0103  */
    @Override // defpackage.clb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public double d(double r17, double r19, double r21, boolean r23) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a93.d(double, double, double, boolean):double");
    }

    public String e(Long l, int i) {
        Context context = (Context) this.a;
        String strA = null;
        if (l != null) {
            Long l2 = l.longValue() != 0 ? l : null;
            if (l2 != null) {
                long jLongValue = l2.longValue();
                String[] strArr = l6g.b;
                strA = z7i.a(jLongValue);
            }
        }
        String string = context.getString(i);
        if (strA == null) {
            return string;
        }
        return string + " · " + strA + " " + context.getString(l.longValue() < 60000 ? y2d.call_history_item_call_time_unit_sec : y2d.call_history_item_call_time_unit_min);
    }

    @Override // defpackage.clb
    public void f(double d) {
        ((ia5) this.Z).a(d);
    }

    public ve2 i() {
        return (ve2) ((k18) this.b).getValue();
    }

    public h5b j() {
        afb afbVar = (afb) this.c;
        SharedPreferences sharedPreferences = (SharedPreferences) ((bwf) ((dh4) this.d).a).getValue();
        h5b h5bVar = h5b.d;
        h5b h5bVarA = afbVar.a(sharedPreferences.getString("themename", h5bVar.a));
        return h5bVarA == null ? h5bVar : h5bVarA;
    }

    public yeb k() {
        yeb yebVarA;
        afb afbVar = (afb) this.c;
        SharedPreferences sharedPreferences = (SharedPreferences) ((bwf) ((dh4) this.d).a).getValue();
        h5b h5bVar = h5b.d;
        h5b h5bVarA = afbVar.a(sharedPreferences.getString("themename", h5bVar.a));
        return (h5bVarA == null || (yebVarA = h5bVarA.a(l())) == null) ? h5bVar.a(l()) : yebVarA;
    }

    public boolean l() {
        lha lhaVarB = ((dh4) this.d).b();
        if (lhaVarB instanceof jha) {
            return ((jha) lhaVarB).b();
        }
        if (lhaVarB.equals(kha.b)) {
            return ((kf3) ((tcf) ((xpb) this.b).b).getValue()) == kf3.b;
        }
        if (lhaVarB.equals(iha.b)) {
            return true;
        }
        if (lhaVarB.equals(hha.b)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public void m(lha lhaVar) {
        dh4 dh4Var = (dh4) this.d;
        dh4Var.getClass();
        lha.a.getClass();
        String strS = wha.s(lhaVar);
        dh4Var.c = lhaVar;
        SharedPreferences.Editor editorEdit = ((SharedPreferences) ((bwf) dh4Var.a).getValue()).edit();
        editorEdit.putString("nightmode", strS);
        editorEdit.apply();
        ((jve) dh4Var.b).h("nightmode");
    }

    public void n(String str) {
        h5b h5bVarA;
        tcf tcfVar = (tcf) this.o;
        afb afbVar = (afb) this.c;
        if (str.equals(k().getName()) || (h5bVarA = afbVar.a(str)) == null) {
            return;
        }
        String str2 = h5bVarA.a;
        afbVar.b(str2, h5bVarA);
        dh4 dh4Var = (dh4) this.d;
        SharedPreferences.Editor editorEdit = ((SharedPreferences) ((bwf) dh4Var.a).getValue()).edit();
        editorEdit.putString("themename", str2);
        editorEdit.apply();
        ((jve) dh4Var.b).h("themename");
        tcfVar.setValue(h5bVarA.a(l()));
    }

    @Override // defpackage.clb
    public void reset() {
        ia5 ia5Var = (ia5) this.c;
        ia5Var.d = ia5Var.c;
        ia5 ia5Var2 = (ia5) this.d;
        ia5Var2.d = ia5Var2.c;
        ia5 ia5Var3 = (ia5) this.o;
        ia5Var3.d = ia5Var3.c;
        ia5 ia5Var4 = (ia5) this.X;
        ia5Var4.d = ia5Var4.c;
        ia5 ia5Var5 = (ia5) this.Y;
        ia5Var5.d = ia5Var5.c;
        ia5 ia5Var6 = (ia5) this.Z;
        ia5Var6.d = ia5Var6.c;
    }

    public a93(Context context, int i) {
        switch (i) {
            case 3:
                this.a = context;
                final int i2 = 0;
                this.b = ipi.b(3, new cm6(this) { // from class: db1
                    public final /* synthetic */ a93 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.cm6
                    public final Object invoke() {
                        int i3 = i2;
                        a93 a93Var = this.b;
                        switch (i3) {
                            case 0:
                                Context context2 = (Context) a93Var.a;
                                int i4 = ivd.p0;
                                int i5 = w9b.a;
                                return new v6g(r34.b(context2, i4).mutate(), context2);
                            case 1:
                                Context context3 = (Context) a93Var.a;
                                int i6 = ivd.o0;
                                int i7 = w9b.a;
                                return new v6g(r34.b(context3, i6).mutate(), context3);
                            case 2:
                                Context context4 = (Context) a93Var.a;
                                int i8 = ivd.i0;
                                int i9 = w9b.a;
                                return new v6g(r34.b(context4, i8).mutate(), context4);
                            case 3:
                                Context context5 = (Context) a93Var.a;
                                int i10 = ivd.h0;
                                int i11 = w9b.a;
                                return new v6g(r34.b(context5, i10).mutate(), context5);
                            case 4:
                                Context context6 = (Context) a93Var.a;
                                int i12 = ivd.s0;
                                int i13 = w9b.a;
                                return new v6g(r34.b(context6, i12).mutate(), context6);
                            case 5:
                                Context context7 = (Context) a93Var.a;
                                int i14 = ivd.r0;
                                int i15 = w9b.a;
                                return new v6g(r34.b(context7, i14).mutate(), context7);
                            default:
                                Context context8 = (Context) a93Var.a;
                                int i16 = iwc.ic_link_16;
                                int i17 = w9b.a;
                                return new v6g(r34.b(context8, i16).mutate(), context8);
                        }
                    }
                });
                final int i3 = 1;
                this.c = ipi.b(3, new cm6(this) { // from class: db1
                    public final /* synthetic */ a93 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.cm6
                    public final Object invoke() {
                        int i32 = i3;
                        a93 a93Var = this.b;
                        switch (i32) {
                            case 0:
                                Context context2 = (Context) a93Var.a;
                                int i4 = ivd.p0;
                                int i5 = w9b.a;
                                return new v6g(r34.b(context2, i4).mutate(), context2);
                            case 1:
                                Context context3 = (Context) a93Var.a;
                                int i6 = ivd.o0;
                                int i7 = w9b.a;
                                return new v6g(r34.b(context3, i6).mutate(), context3);
                            case 2:
                                Context context4 = (Context) a93Var.a;
                                int i8 = ivd.i0;
                                int i9 = w9b.a;
                                return new v6g(r34.b(context4, i8).mutate(), context4);
                            case 3:
                                Context context5 = (Context) a93Var.a;
                                int i10 = ivd.h0;
                                int i11 = w9b.a;
                                return new v6g(r34.b(context5, i10).mutate(), context5);
                            case 4:
                                Context context6 = (Context) a93Var.a;
                                int i12 = ivd.s0;
                                int i13 = w9b.a;
                                return new v6g(r34.b(context6, i12).mutate(), context6);
                            case 5:
                                Context context7 = (Context) a93Var.a;
                                int i14 = ivd.r0;
                                int i15 = w9b.a;
                                return new v6g(r34.b(context7, i14).mutate(), context7);
                            default:
                                Context context8 = (Context) a93Var.a;
                                int i16 = iwc.ic_link_16;
                                int i17 = w9b.a;
                                return new v6g(r34.b(context8, i16).mutate(), context8);
                        }
                    }
                });
                final int i4 = 2;
                this.d = ipi.b(3, new cm6(this) { // from class: db1
                    public final /* synthetic */ a93 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.cm6
                    public final Object invoke() {
                        int i32 = i4;
                        a93 a93Var = this.b;
                        switch (i32) {
                            case 0:
                                Context context2 = (Context) a93Var.a;
                                int i42 = ivd.p0;
                                int i5 = w9b.a;
                                return new v6g(r34.b(context2, i42).mutate(), context2);
                            case 1:
                                Context context3 = (Context) a93Var.a;
                                int i6 = ivd.o0;
                                int i7 = w9b.a;
                                return new v6g(r34.b(context3, i6).mutate(), context3);
                            case 2:
                                Context context4 = (Context) a93Var.a;
                                int i8 = ivd.i0;
                                int i9 = w9b.a;
                                return new v6g(r34.b(context4, i8).mutate(), context4);
                            case 3:
                                Context context5 = (Context) a93Var.a;
                                int i10 = ivd.h0;
                                int i11 = w9b.a;
                                return new v6g(r34.b(context5, i10).mutate(), context5);
                            case 4:
                                Context context6 = (Context) a93Var.a;
                                int i12 = ivd.s0;
                                int i13 = w9b.a;
                                return new v6g(r34.b(context6, i12).mutate(), context6);
                            case 5:
                                Context context7 = (Context) a93Var.a;
                                int i14 = ivd.r0;
                                int i15 = w9b.a;
                                return new v6g(r34.b(context7, i14).mutate(), context7);
                            default:
                                Context context8 = (Context) a93Var.a;
                                int i16 = iwc.ic_link_16;
                                int i17 = w9b.a;
                                return new v6g(r34.b(context8, i16).mutate(), context8);
                        }
                    }
                });
                final int i5 = 3;
                this.o = ipi.b(3, new cm6(this) { // from class: db1
                    public final /* synthetic */ a93 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.cm6
                    public final Object invoke() {
                        int i32 = i5;
                        a93 a93Var = this.b;
                        switch (i32) {
                            case 0:
                                Context context2 = (Context) a93Var.a;
                                int i42 = ivd.p0;
                                int i52 = w9b.a;
                                return new v6g(r34.b(context2, i42).mutate(), context2);
                            case 1:
                                Context context3 = (Context) a93Var.a;
                                int i6 = ivd.o0;
                                int i7 = w9b.a;
                                return new v6g(r34.b(context3, i6).mutate(), context3);
                            case 2:
                                Context context4 = (Context) a93Var.a;
                                int i8 = ivd.i0;
                                int i9 = w9b.a;
                                return new v6g(r34.b(context4, i8).mutate(), context4);
                            case 3:
                                Context context5 = (Context) a93Var.a;
                                int i10 = ivd.h0;
                                int i11 = w9b.a;
                                return new v6g(r34.b(context5, i10).mutate(), context5);
                            case 4:
                                Context context6 = (Context) a93Var.a;
                                int i12 = ivd.s0;
                                int i13 = w9b.a;
                                return new v6g(r34.b(context6, i12).mutate(), context6);
                            case 5:
                                Context context7 = (Context) a93Var.a;
                                int i14 = ivd.r0;
                                int i15 = w9b.a;
                                return new v6g(r34.b(context7, i14).mutate(), context7);
                            default:
                                Context context8 = (Context) a93Var.a;
                                int i16 = iwc.ic_link_16;
                                int i17 = w9b.a;
                                return new v6g(r34.b(context8, i16).mutate(), context8);
                        }
                    }
                });
                final int i6 = 4;
                this.X = ipi.b(3, new cm6(this) { // from class: db1
                    public final /* synthetic */ a93 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.cm6
                    public final Object invoke() {
                        int i32 = i6;
                        a93 a93Var = this.b;
                        switch (i32) {
                            case 0:
                                Context context2 = (Context) a93Var.a;
                                int i42 = ivd.p0;
                                int i52 = w9b.a;
                                return new v6g(r34.b(context2, i42).mutate(), context2);
                            case 1:
                                Context context3 = (Context) a93Var.a;
                                int i62 = ivd.o0;
                                int i7 = w9b.a;
                                return new v6g(r34.b(context3, i62).mutate(), context3);
                            case 2:
                                Context context4 = (Context) a93Var.a;
                                int i8 = ivd.i0;
                                int i9 = w9b.a;
                                return new v6g(r34.b(context4, i8).mutate(), context4);
                            case 3:
                                Context context5 = (Context) a93Var.a;
                                int i10 = ivd.h0;
                                int i11 = w9b.a;
                                return new v6g(r34.b(context5, i10).mutate(), context5);
                            case 4:
                                Context context6 = (Context) a93Var.a;
                                int i12 = ivd.s0;
                                int i13 = w9b.a;
                                return new v6g(r34.b(context6, i12).mutate(), context6);
                            case 5:
                                Context context7 = (Context) a93Var.a;
                                int i14 = ivd.r0;
                                int i15 = w9b.a;
                                return new v6g(r34.b(context7, i14).mutate(), context7);
                            default:
                                Context context8 = (Context) a93Var.a;
                                int i16 = iwc.ic_link_16;
                                int i17 = w9b.a;
                                return new v6g(r34.b(context8, i16).mutate(), context8);
                        }
                    }
                });
                final int i7 = 5;
                this.Y = ipi.b(3, new cm6(this) { // from class: db1
                    public final /* synthetic */ a93 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.cm6
                    public final Object invoke() {
                        int i32 = i7;
                        a93 a93Var = this.b;
                        switch (i32) {
                            case 0:
                                Context context2 = (Context) a93Var.a;
                                int i42 = ivd.p0;
                                int i52 = w9b.a;
                                return new v6g(r34.b(context2, i42).mutate(), context2);
                            case 1:
                                Context context3 = (Context) a93Var.a;
                                int i62 = ivd.o0;
                                int i72 = w9b.a;
                                return new v6g(r34.b(context3, i62).mutate(), context3);
                            case 2:
                                Context context4 = (Context) a93Var.a;
                                int i8 = ivd.i0;
                                int i9 = w9b.a;
                                return new v6g(r34.b(context4, i8).mutate(), context4);
                            case 3:
                                Context context5 = (Context) a93Var.a;
                                int i10 = ivd.h0;
                                int i11 = w9b.a;
                                return new v6g(r34.b(context5, i10).mutate(), context5);
                            case 4:
                                Context context6 = (Context) a93Var.a;
                                int i12 = ivd.s0;
                                int i13 = w9b.a;
                                return new v6g(r34.b(context6, i12).mutate(), context6);
                            case 5:
                                Context context7 = (Context) a93Var.a;
                                int i14 = ivd.r0;
                                int i15 = w9b.a;
                                return new v6g(r34.b(context7, i14).mutate(), context7);
                            default:
                                Context context8 = (Context) a93Var.a;
                                int i16 = iwc.ic_link_16;
                                int i17 = w9b.a;
                                return new v6g(r34.b(context8, i16).mutate(), context8);
                        }
                    }
                });
                final int i8 = 6;
                this.Z = ipi.b(3, new cm6(this) { // from class: db1
                    public final /* synthetic */ a93 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.cm6
                    public final Object invoke() {
                        int i32 = i8;
                        a93 a93Var = this.b;
                        switch (i32) {
                            case 0:
                                Context context2 = (Context) a93Var.a;
                                int i42 = ivd.p0;
                                int i52 = w9b.a;
                                return new v6g(r34.b(context2, i42).mutate(), context2);
                            case 1:
                                Context context3 = (Context) a93Var.a;
                                int i62 = ivd.o0;
                                int i72 = w9b.a;
                                return new v6g(r34.b(context3, i62).mutate(), context3);
                            case 2:
                                Context context4 = (Context) a93Var.a;
                                int i82 = ivd.i0;
                                int i9 = w9b.a;
                                return new v6g(r34.b(context4, i82).mutate(), context4);
                            case 3:
                                Context context5 = (Context) a93Var.a;
                                int i10 = ivd.h0;
                                int i11 = w9b.a;
                                return new v6g(r34.b(context5, i10).mutate(), context5);
                            case 4:
                                Context context6 = (Context) a93Var.a;
                                int i12 = ivd.s0;
                                int i13 = w9b.a;
                                return new v6g(r34.b(context6, i12).mutate(), context6);
                            case 5:
                                Context context7 = (Context) a93Var.a;
                                int i14 = ivd.r0;
                                int i15 = w9b.a;
                                return new v6g(r34.b(context7, i14).mutate(), context7);
                            default:
                                Context context8 = (Context) a93Var.a;
                                int i16 = iwc.ic_link_16;
                                int i17 = w9b.a;
                                return new v6g(r34.b(context8, i16).mutate(), context8);
                        }
                    }
                });
                break;
            default:
                bwf bwfVar = new bwf(new ns2(context, 1));
                this.a = new kz8(context, 1);
                this.b = new xpb(context);
                this.c = new afb(bwfVar);
                this.d = new dh4(bwfVar);
                tcf tcfVarA = ucf.a(k());
                this.o = tcfVarA;
                this.X = ucf.a(0);
                this.Y = new hbd(tcfVarA);
                this.Z = "Chroma";
                break;
        }
    }
}
