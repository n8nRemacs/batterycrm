package Gb1;

import D31.g;
import androidx.appcompat.app.r;
import e.InterfaceC39835a;
import e.h;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* loaded from: classes9.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f6611a;

    /* renamed from: b, reason: collision with root package name */
    public static String f6612b;

    /* renamed from: c, reason: collision with root package name */
    public static String f6613c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406614b;
        InterfaceC42726C interfaceC42726CB = C42727D.b(lazyThreadSafetyMode, d.f6609l);
        f6611a = interfaceC42726CB;
        InterfaceC42726C interfaceC42726CB2 = C42727D.b(lazyThreadSafetyMode, e.f6610l);
        f6612b = "https://id.sber.ru/";
        f6613c = "https://profile.sber.ru";
        b(((h) ((InterfaceC39835a) interfaceC42726CB.getValue())).f394239l);
        C43259k.d((T) ((g) ((D31.a) interfaceC42726CB2.getValue())).f2881b.getValue(), null, null, new b(2, null), 3);
    }

    public static String a(String str) {
        return r.q(f6612b, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(sberid.sdk.global.models.StandName r9) {
        /*
            int[] r0 = Gb1.c.f6608a
            int r1 = r9.ordinal()
            r1 = r0[r1]
            java.lang.String r2 = "https://id-ift.sber.ru/"
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == r7) goto L25
            java.lang.String r8 = "https://id-psi.sber.ru/"
            if (r1 == r6) goto L24
            if (r1 == r5) goto L25
            if (r1 == r4) goto L24
            if (r1 != r3) goto L1e
            java.lang.String r2 = "https://id.sber.ru/"
            goto L25
        L1e:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L24:
            r2 = r8
        L25:
            Gb1.f.f6612b = r2
            int r9 = r9.ordinal()
            r9 = r0[r9]
            java.lang.String r0 = "https://tdleg-mprb00046.enablers.sbrf.ru"
            if (r9 == r7) goto L45
            java.lang.String r1 = "https://profile-uat.sber.ru"
            if (r9 == r6) goto L44
            if (r9 == r5) goto L45
            if (r9 == r4) goto L44
            if (r9 != r3) goto L3e
            java.lang.String r0 = "https://profile.sber.ru"
            goto L45
        L3e:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L44:
            r0 = r1
        L45:
            Gb1.f.f6613c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Gb1.f.b(sberid.sdk.global.models.StandName):void");
    }
}
