package com.avito.android.util;

import android.net.Uri;
import android.os.Bundle;
import com.adjust.sdk.Constants;
import com.google.gson.Gson;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.text.C43066x;

/* compiled from: RequestUtils.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/A4;", "", "<init>", "()V", "_avito-discouraged_api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class A4 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final A4 f318516a = new A4();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f318517b = C42727D.c(a.f318518l);

    /* compiled from: RequestUtils.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/google/gson/Gson;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Gson> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f318518l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Gson invoke() {
            return new Gson();
        }
    }

    @X41.n
    public static final void a(@Y61.l Object obj, @Y61.l String str, @Y61.k StringBuilder sb2) {
        A4 a42 = f318516a;
        if (obj == null) {
            a42.getClass();
            if (sb2.length() > 0) {
                sb2.append(ContainerUtils.FIELD_DELIMITER);
            }
            sb2.append(b(str));
            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            return;
        }
        if (obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            for (int i12 = 0; i12 < length; i12++) {
                kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
                a(Array.get(obj, i12), String.format("%s[%s]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i12)}, 2)), sb2);
            }
            return;
        }
        if (obj instanceof Boolean) {
            a42.getClass();
            if (sb2.length() > 0) {
                sb2.append(ContainerUtils.FIELD_DELIMITER);
            }
            sb2.append(b(str));
            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb2.append(b(((Boolean) obj).booleanValue() ? "1" : "0"));
            return;
        }
        a42.getClass();
        if (sb2.length() > 0) {
            sb2.append(ContainerUtils.FIELD_DELIMITER);
        }
        sb2.append(b(str));
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(b(obj.toString()));
    }

    @Y61.l
    public static String b(@Y61.l String str) throws UnsupportedEncodingException {
        if (str == null) {
            str = "";
        }
        try {
            String strEncode = URLEncoder.encode(str, Constants.ENCODING);
            return C43066x.q(strEncode, "*", false) ? C43066x.a0(strEncode, "*", "%2A", false) : strEncode;
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static void c(String str, com.google.gson.i iVar, LinkedHashMap linkedHashMap) {
        if (iVar instanceof com.google.gson.m) {
            String strS = iVar.j().s();
            if (strS == null) {
                return;
            }
            linkedHashMap.put(str, strS);
            return;
        }
        boolean z12 = iVar instanceof com.google.gson.k;
        A4 a42 = f318516a;
        if (z12) {
            Iterator<T> it = iVar.i().f362194b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
                String str2 = String.format(Locale.getDefault(), "%s[%s]", Arrays.copyOf(new Object[]{str, entry.getKey()}, 2));
                com.google.gson.i iVar2 = (com.google.gson.i) entry.getValue();
                a42.getClass();
                c(str2, iVar2, linkedHashMap);
            }
        }
        if (iVar instanceof com.google.gson.f) {
            com.google.gson.f fVarH = iVar.h();
            kotlin.ranges.k it2 = kotlin.ranges.s.r(0, fVarH.f362000b.size()).iterator();
            while (it2.f406910d) {
                int iA2 = it2.a();
                kotlin.jvm.internal.u0 u0Var2 = kotlin.jvm.internal.u0.f406856a;
                String str3 = String.format(Locale.getDefault(), "%s[%s]", Arrays.copyOf(new Object[]{str, String.valueOf(iA2)}, 2));
                com.google.gson.i iVarW = fVarH.w(iA2);
                a42.getClass();
                c(str3, iVarW, linkedHashMap);
            }
        }
    }

    @Y61.k
    public static String d(@Y61.l Bundle bundle) {
        if (bundle.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(bundle.size() * 8);
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            a(bundle.get(str), str, sb2);
        }
        return sb2.toString();
    }

    @Y61.k
    public static Map e(@Y61.k Object obj) {
        com.google.gson.i iVarY;
        Gson gson = (Gson) f318517b.getValue();
        gson.getClass();
        if (obj == null) {
            iVarY = com.google.gson.j.f362193b;
        } else {
            Class<?> cls = obj.getClass();
            com.google.gson.internal.bind.b bVar = new com.google.gson.internal.bind.b();
            gson.n(obj, cls, bVar);
            iVarY = bVar.y();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        com.google.gson.k kVarI = iVarY.i();
        for (String str : kVarI.f362194b.keySet()) {
            com.google.gson.i iVarD = kVarI.D(str);
            f318516a.getClass();
            c(str, iVarD, linkedHashMap);
        }
        return kotlin.collections.P0.q(linkedHashMap);
    }

    @Y61.k
    public static HashMap f(@Y61.l String str, @Y61.k List list) {
        HashMap map = new HashMap();
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
            map.put(String.format(Locale.getDefault(), "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i12)}, 2)), list.get(i12));
        }
        return map;
    }

    @Y61.k
    public static HashMap g(@Y61.l String str, @Y61.l Set set) {
        if (set == null) {
            set = kotlin.collections.B0.f406639b;
        }
        return f(str, new ArrayList(set));
    }

    @Y61.k
    public static Map h(@Y61.k Object obj, @Y61.k String str) {
        com.google.gson.i iVarY;
        Gson gson = (Gson) f318517b.getValue();
        gson.getClass();
        if (obj == null) {
            iVarY = com.google.gson.j.f362193b;
        } else {
            Class<?> cls = obj.getClass();
            com.google.gson.internal.bind.b bVar = new com.google.gson.internal.bind.b();
            gson.n(obj, cls, bVar);
            iVarY = bVar.y();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c(str, iVarY, linkedHashMap);
        return kotlin.collections.P0.q(linkedHashMap);
    }

    @Y61.k
    public static Map i(@Y61.l Map map, boolean z12) {
        com.google.gson.i iVarY;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                f318516a.getClass();
                Gson gson = (Gson) f318517b.getValue();
                gson.getClass();
                if (value == null) {
                    iVarY = com.google.gson.j.f362193b;
                } else {
                    Class<?> cls = value.getClass();
                    com.google.gson.internal.bind.b bVar = new com.google.gson.internal.bind.b();
                    gson.n(value, cls, bVar);
                    iVarY = bVar.y();
                }
                c(str, iVarY, linkedHashMap);
            }
        }
        if (!z12) {
            return kotlin.collections.P0.q(linkedHashMap);
        }
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        int iF2 = kotlin.collections.P0.f(C42745f0.q(setEntrySet, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iF2);
        for (Map.Entry entry2 : setEntrySet) {
            linkedHashMap2.put(Uri.encode((String) entry2.getKey()), Uri.encode((String) entry2.getValue()));
        }
        return linkedHashMap2;
    }

    public static /* synthetic */ Map j(A4 a42, Map map) {
        a42.getClass();
        return i(map, false);
    }
}
