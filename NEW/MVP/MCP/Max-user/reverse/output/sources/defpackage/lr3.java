package defpackage;

/* loaded from: classes2.dex */
public final class lr3 {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;

    public lr3(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
        this.d = k18Var4;
    }

    public final ur3 a() {
        return (ur3) this.c.getValue();
    }

    public final lv4 b() {
        return (lv4) this.b.getValue();
    }

    public final boolean c() {
        boolean z = !a().a() && !(e() && b().d() && b().c()) && d();
        wqi.c("lr3", "isBackgroundDataDisabledAndOnMobileNetwork: %b, isOnline=%b, appIsVisible=%b, hasForegroundServicesAlive=%b, isOnMobileNetwork=%b", Boolean.valueOf(z), Boolean.valueOf(e()), Boolean.valueOf(b().d()), Boolean.valueOf(b().c()), Boolean.valueOf(d()));
        return z;
    }

    public final boolean d() {
        return (a().b() == os3.c || a().b() == os3.b) ? false : true;
    }

    public final boolean e() {
        return ((oje) this.d.getValue()).k == 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f() {
        /*
            r13 = this;
            lv4 r0 = r13.b()
            boolean r0 = r0.d()
            lv4 r1 = r13.b()
            boolean r1 = r1.c()
            lv4 r2 = r13.b()
            alf r2 = r2.f
            vw6 r2 = (defpackage.vw6) r2
            boolean r2 = r2.a()
            r3 = r2 ^ 1
            ur3 r4 = r13.a()
            os3 r4 = r4.b()
            k18 r5 = r13.a
            java.lang.Object r5 = r5.getValue()
            z7c r5 = (defpackage.z7c) r5
            pe8 r5 = r5.a
            fde r6 = r5.C
            yy7[] r7 = defpackage.w4e.m0
            r8 = 20
            r7 = r7[r8]
            java.lang.Object r5 = r6.D(r5, r7)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r6 = 2
            r7 = 1
            if (r0 != 0) goto L77
            if (r1 != 0) goto L77
            if (r2 == 0) goto L77
            if (r5 == 0) goto L4d
            goto L77
        L4d:
            ur3 r2 = r13.a()
            boolean r2 = r2.f()
            k18 r8 = r13.a
            java.lang.Object r8 = r8.getValue()
            z7c r8 = (defpackage.z7c) r8
            l5c r8 = r8.b
            r8.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r9 = ru.ok.tamtam.android.prefs.PmsKey.f73keepconnection
            long r10 = (long) r6
            long r8 = r8.m(r9, r10)
            int r8 = (int) r8
            if (r8 == 0) goto L78
            r9 = 0
            if (r8 == r7) goto L71
        L6f:
            r2 = r9
            goto L78
        L71:
            os3 r8 = defpackage.os3.c
            if (r4 != r8) goto L6f
            if (r2 == 0) goto L6f
        L77:
            r2 = r7
        L78:
            l6b r8 = defpackage.wqi.a
            if (r8 != 0) goto L7d
            goto Ldd
        L7d:
            lg8 r9 = defpackage.lg8.d
            boolean r10 = r8.b(r9)
            if (r10 == 0) goto Ldd
            java.lang.String r10 = "\nappVisible: "
            java.lang.String r11 = "\nhasForegroundServicesAlive: "
            java.lang.String r12 = "shouldConnect: "
            java.lang.StringBuilder r0 = defpackage.ho7.p(r12, r2, r10, r0, r11)
            java.lang.String r10 = "\nnoServices: "
            java.lang.String r11 = "\nforceConnection: "
            defpackage.az1.t(r10, r11, r0, r1, r3)
            r0.append(r5)
            java.lang.String r1 = "\nconnectionType: "
            r0.append(r1)
            java.lang.String r1 = r4.a()
            r0.append(r1)
            java.lang.String r1 = "\nkeepAlive: "
            r0.append(r1)
            k18 r1 = r13.a
            java.lang.Object r1 = r1.getValue()
            z7c r1 = (defpackage.z7c) r1
            l5c r1 = r1.b
            r1.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r3 = ru.ok.tamtam.android.prefs.PmsKey.f73keepconnection
            long r4 = (long) r6
            long r3 = r1.m(r3, r4)
            int r1 = (int) r3
            if (r1 == 0) goto Lce
            if (r1 == r7) goto Lcb
            if (r1 == r6) goto Lc8
            java.lang.String r1 = "unknown"
            goto Ld0
        Lc8:
            java.lang.String r1 = "never"
            goto Ld0
        Lcb:
            java.lang.String r1 = "wifi"
            goto Ld0
        Lce:
            java.lang.String r1 = "always"
        Ld0:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.String r3 = "lr3"
            r8.c(r9, r3, r0, r1)
        Ldd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lr3.f():boolean");
    }
}
