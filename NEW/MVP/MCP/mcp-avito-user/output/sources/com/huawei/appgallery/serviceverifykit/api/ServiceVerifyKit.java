package com.huawei.appgallery.serviceverifykit.api;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class ServiceVerifyKit {

    public static class Builder {

        /* renamed from: f, reason: collision with root package name */
        public Context f363177f;

        /* renamed from: g, reason: collision with root package name */
        public Intent f363178g;

        /* renamed from: h, reason: collision with root package name */
        public ComponentType f363179h;

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f363172a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public final HashMap f363173b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        public final HashMap f363174c = new HashMap();

        /* renamed from: d, reason: collision with root package name */
        public ArrayList f363175d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        public final ArrayList f363176e = new ArrayList();

        /* renamed from: i, reason: collision with root package name */
        public final String f363180i = "verify_match_property";

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ComponentType {

            /* renamed from: b, reason: collision with root package name */
            public static final ComponentType f363181b;

            /* renamed from: c, reason: collision with root package name */
            public static final ComponentType f363182c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ ComponentType[] f363183d;

            static {
                ComponentType componentType = new ComponentType("ACTIVITY", 0);
                f363181b = componentType;
                ComponentType componentType2 = new ComponentType("SERVICE", 1);
                ComponentType componentType3 = new ComponentType("BROADCAST", 2);
                f363182c = componentType3;
                f363183d = new ComponentType[]{componentType, componentType2, componentType3};
            }

            public ComponentType() {
                throw null;
            }

            public static ComponentType valueOf(String str) {
                return (ComponentType) Enum.valueOf(ComponentType.class, str);
            }

            public static ComponentType[] values() {
                return (ComponentType[]) f363183d.clone();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:101:0x02bf  */
        /* JADX WARN: Removed duplicated region for block: B:102:0x02cd  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x02fe  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x030a  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x032d  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x0350  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x035b A[EDGE_INSN: B:136:0x035b->B:137:0x035d BREAK  A[LOOP:11: B:142:0x0377->B:146:0x038b]] */
        /* JADX WARN: Removed duplicated region for block: B:138:0x0360  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:177:0x03fc  */
        /* JADX WARN: Removed duplicated region for block: B:179:0x0405  */
        /* JADX WARN: Removed duplicated region for block: B:206:0x0476  */
        /* JADX WARN: Removed duplicated region for block: B:207:0x047b  */
        /* JADX WARN: Removed duplicated region for block: B:210:0x0485  */
        /* JADX WARN: Removed duplicated region for block: B:212:0x048e  */
        /* JADX WARN: Removed duplicated region for block: B:215:0x04a6  */
        /* JADX WARN: Removed duplicated region for block: B:230:0x0502  */
        /* JADX WARN: Removed duplicated region for block: B:231:0x0526  */
        /* JADX WARN: Removed duplicated region for block: B:259:0x05d2  */
        /* JADX WARN: Removed duplicated region for block: B:261:0x05e4  */
        /* JADX WARN: Removed duplicated region for block: B:272:0x067c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:391:0x04c7 A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r0v134, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r0v135, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r0v73, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r0v74, types: [java.util.List] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String a() throws android.content.pm.PackageManager.NameNotFoundException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException, java.security.cert.CertificateException, java.io.UnsupportedEncodingException, java.security.NoSuchProviderException {
            /*
                Method dump skipped, instructions count: 1880
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.appgallery.serviceverifykit.api.ServiceVerifyKit.Builder.a():java.lang.String");
        }
    }

    public static final class a {
    }

    public static class c {
    }

    public ServiceVerifyKit() {
    }
}
