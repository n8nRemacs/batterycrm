package defpackage;

import android.content.SharedPreferences;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes2.dex */
public final class dh4 implements bbd {
    public static final Object o = new Object();
    public final Object a;
    public final Object b;
    public volatile Object c;
    public final Object d;

    public dh4(bwf bwfVar) {
        this.a = bwfVar;
        jve jveVarB = kve.b(0, 1, 1);
        this.b = jveVarB;
        this.d = new gbd(jveVarB);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.dh4 r14, defpackage.q44 r15) throws java.lang.Throwable {
        /*
            java.lang.Object r0 = r14.b
            bwf r0 = (defpackage.bwf) r0
            boolean r1 = r15 instanceof defpackage.y5b
            if (r1 == 0) goto L17
            r1 = r15
            y5b r1 = (defpackage.y5b) r1
            int r2 = r1.Z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.Z = r2
            goto L1c
        L17:
            y5b r1 = new y5b
            r1.<init>(r14, r15)
        L1c:
            java.lang.Object r15 = r1.X
            int r2 = r1.Z
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L40
            if (r2 == r3) goto L2e
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L2e:
            java.nio.file.Path r14 = r1.o
            dh4 r1 = r1.d
            defpackage.g8j.b(r15)     // Catch: java.lang.Throwable -> L3b
            kotlin.KotlinNothingValueException r15 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L3b
            r15.<init>()     // Catch: java.lang.Throwable -> L3b
            throw r15     // Catch: java.lang.Throwable -> L3b
        L3b:
            r0 = move-exception
            r15 = r0
            r15 = r14
            r14 = r1
            goto L6b
        L40:
            defpackage.g8j.b(r15)
            java.lang.Object r15 = r0.getValue()
            java.nio.file.Path r15 = (java.nio.file.Path) r15
            java.nio.file.attribute.FileAttribute[] r2 = new java.nio.file.attribute.FileAttribute[r4]
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r4)
            java.nio.file.attribute.FileAttribute[] r2 = (java.nio.file.attribute.FileAttribute[]) r2
            java.nio.file.Files.createDirectories(r15, r2)
            java.lang.Object r15 = r0.getValue()
            java.nio.file.Path r15 = (java.nio.file.Path) r15
            java.lang.String r0 = "all.log"
            java.nio.file.Path r15 = r15.resolve(r0)
            r1.d = r14     // Catch: java.lang.Throwable -> L6a
            r1.o = r15     // Catch: java.lang.Throwable -> L6a
            r1.Z = r3     // Catch: java.lang.Throwable -> L6a
            r14.c(r3, r15, r1)     // Catch: java.lang.Throwable -> L6a
            return
        L6a:
            r0 = move-exception
        L6b:
            r14.getClass()
            java.lang.String r7 = r15.toString()
            java.lang.String r12 = "-t"
            java.lang.String r13 = "4096"
            java.lang.String r5 = "logcat"
            java.lang.String r6 = "-f"
            java.lang.String r8 = "-b"
            java.lang.String r9 = "all"
            java.lang.String r10 = "-v"
            java.lang.String r11 = "long"
            java.lang.String[] r14 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13}
            java.util.List r14 = defpackage.ve3.j(r14)
            java.lang.ProcessBuilder r15 = new java.lang.ProcessBuilder
            java.lang.String[] r1 = new java.lang.String[r4]
            r15.<init>(r1)
            java.lang.ProcessBuilder r14 = r15.command(r14)
            java.lang.ProcessBuilder r14 = r14.redirectErrorStream(r3)
            java.lang.Process r14 = r14.start()
            r14.waitFor()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dh4.a(dh4, q44):void");
    }

    @Override // defpackage.bbd
    public Object D(Object obj, yy7 yy7Var) throws NoSuchMethodException, SecurityException {
        Method declaredMethod;
        if (this.c == o) {
            try {
                Class cls = (Class) ((cm6) this.a).invoke();
                String str = (String) this.b;
                Class[] clsArr = (Class[]) this.d;
                declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
                declaredMethod = null;
            }
            this.c = declaredMethod;
        }
        return (Method) this.c;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public lha b() {
        lha lhaVar = (lha) this.c;
        if (lhaVar != null) {
            return lhaVar;
        }
        wha whaVar = lha.a;
        String string = ((SharedPreferences) ((bwf) this.a).getValue()).getString("nightmode", "");
        if (string == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        whaVar.getClass();
        lha jhaVar = kha.b;
        List listR = vmf.R(string, new char[]{','});
        if (!listR.isEmpty()) {
            String str = (String) ue3.G(listR);
            switch (str.hashCode()) {
                case -1609594047:
                    if (str.equals("enabled")) {
                        jhaVar = iha.b;
                        break;
                    }
                    break;
                case -887328209:
                    str.equals("system");
                    break;
                case -697920873:
                    if (str.equals("schedule")) {
                        int i = s65.d;
                        int i2 = Integer.parseInt((String) listR.get(1));
                        y65 y65Var = y65.MINUTES;
                        jhaVar = new jha(v9j.h(i2, y65Var), v9j.h(Integer.parseInt((String) listR.get(2)), y65Var));
                        break;
                    }
                    break;
                case 270940796:
                    if (str.equals("disabled")) {
                        jhaVar = hha.b;
                        break;
                    }
                    break;
            }
        }
        this.c = jhaVar;
        return jhaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(int r17, java.nio.file.Path r18, defpackage.q44 r19) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r19
            boolean r1 = r0 instanceof defpackage.a6b
            if (r1 == 0) goto L17
            r1 = r0
            a6b r1 = (defpackage.a6b) r1
            int r2 = r1.X
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.X = r2
            r2 = r16
            goto L1e
        L17:
            a6b r1 = new a6b
            r2 = r16
            r1.<init>(r2, r0)
        L1e:
            java.lang.Object r0 = r1.d
            int r3 = r1.X
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 == r4) goto L2f
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2f:
            defpackage.g8j.b(r0)
            goto L8d
        L33:
            defpackage.g8j.b(r0)
            java.lang.String r7 = r18.toString()
            if (r17 == 0) goto L93
            java.lang.String r14 = "-v"
            java.lang.String r15 = "long"
            java.lang.String r5 = "logcat"
            java.lang.String r6 = "-f"
            java.lang.String r8 = "-r"
            java.lang.String r9 = "8196"
            java.lang.String r10 = "-n"
            java.lang.String r11 = "4"
            java.lang.String r12 = "-b"
            java.lang.String r13 = "all"
            java.lang.String[] r0 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15}
            java.util.List r0 = defpackage.ve3.j(r0)
            java.lang.ProcessBuilder r3 = new java.lang.ProcessBuilder
            r5 = 0
            java.lang.String[] r5 = new java.lang.String[r5]
            r3.<init>(r5)
            java.lang.ProcessBuilder r0 = r3.command(r0)
            java.lang.ProcessBuilder r0 = r0.redirectErrorStream(r4)
            java.lang.Process r0 = r0.start()
            r1.X = r4
            l42 r3 = new l42
            kotlin.coroutines.Continuation r1 = defpackage.hni.f(r1)
            r3.<init>(r4, r1)
            r3.o()
            z11 r1 = new z11
            r4 = 13
            r1.<init>(r4, r0)
            r3.e(r1)
            java.lang.Object r0 = r3.n()
            g84 r1 = defpackage.g84.a
            if (r0 != r1) goto L8d
            return
        L8d:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L93:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dh4.c(int, java.nio.file.Path, q44):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r10v16, types: [j9a] */
    /* JADX WARN: Type inference failed for: r10v18, types: [j9a] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(defpackage.em6 r10, defpackage.q44 r11) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dh4.d(em6, q44):java.lang.Object");
    }

    public dh4(cm6 cm6Var, String str, Class... clsArr) {
        this.a = cm6Var;
        this.b = str;
        this.d = clsArr;
        this.c = o;
    }

    public /* synthetic */ dh4(yo3 yo3Var, String str) {
        this(yo3Var, str, new Class[0]);
    }

    public dh4(mwa mwaVar, ContextScope contextScope) {
        this.a = contextScope;
        this.b = new bwf(new fr7(27, mwaVar));
        Symbol symbol = o9a.a;
        this.d = new n9a();
    }
}
