package com.avito.security.libfp;

import I41.g;
import I41.h;
import android.content.Context;
import com.avito.security.libfp.Application;
import java.io.IOException;
import java.util.BitSet;

/* loaded from: classes5.dex */
public abstract class FingerprintService {

    /* renamed from: a, reason: collision with root package name */
    static BitSet f338603a;

    public enum a {
        f338604b(0),
        f338605c(1),
        f338606d(2);


        /* renamed from: a, reason: collision with root package name */
        private final int f338608a;

        a(int i12) {
            this.f338608a = i12;
        }

        public int a() {
            return this.f338608a;
        }
    }

    static {
        Application.zCDEAyeaF(Application.C10496Application.FingerprintService.GcgDigqtB());
        f338603a = new BitSet();
    }

    public static void doProbe(@g Context context) {
        LibApplication.m69i(444);
        LibApplication.m69i(445);
        LibApplication.m69i(446);
    }

    @g
    public static FingerprintService init(@g Context context) throws IOException {
        Application.zCDEAyeaF(context);
        LibApplication.m93ii((Object) context, 78);
        Object objM65i = LibApplication.m65i(306);
        LibApplication.m96ii(objM65i, LibApplication.m65i(433), (Object) context, 249);
        return (FingerprintService) objM65i;
    }

    public static void negativeDebugCheck(Object obj) {
        f338603a.clear(a.f338605c.a());
    }

    public static void negativeEmulatorCheck(Object obj) {
        f338603a.clear(a.f338606d.a());
    }

    public static void negativeRootCheck(Object obj) {
        f338603a.clear(a.f338604b.a());
    }

    public static void positiveDebugCheck(Object obj) {
        f338603a.set(a.f338605c.a());
    }

    public static void positiveEmulatorCheck(Object obj) {
        f338603a.set(a.f338606d.a());
    }

    public static void positiveRootCheck(Object obj) {
        f338603a.set(a.f338604b.a());
    }

    public abstract String calculateFingerprint();

    public abstract String calculateFingerprintV2(@h String str);

    public abstract String getToken(String str);
}
