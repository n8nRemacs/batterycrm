package com.yandex.metrica.impl.ob;

import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.z0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39278z0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<Integer> f382285a;

    /* renamed from: b, reason: collision with root package name */
    private static final EnumSet<EnumC38666a1> f382286b;

    /* renamed from: c, reason: collision with root package name */
    private static final EnumSet<EnumC38666a1> f382287c;

    /* renamed from: d, reason: collision with root package name */
    private static final EnumSet<EnumC38666a1> f382288d;

    /* renamed from: e, reason: collision with root package name */
    private static final EnumSet<EnumC38666a1> f382289e;

    /* renamed from: f, reason: collision with root package name */
    private static final EnumSet<EnumC38666a1> f382290f;

    /* renamed from: g, reason: collision with root package name */
    private static final EnumSet<EnumC38666a1> f382291g;

    /* renamed from: h, reason: collision with root package name */
    private static final EnumSet<EnumC38666a1> f382292h;

    /* renamed from: i, reason: collision with root package name */
    public static final List<Integer> f382293i;

    /* renamed from: j, reason: collision with root package name */
    public static final List<Integer> f382294j;

    static {
        Integer[] numArr = {Integer.valueOf(EnumC38666a1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF.b()), Integer.valueOf(EnumC38666a1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF.b()), Integer.valueOf(EnumC38666a1.EVENT_TYPE_EXCEPTION_USER.b()), Integer.valueOf(EnumC38666a1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF.b()), Integer.valueOf(EnumC38666a1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE.b()), Integer.valueOf(EnumC38666a1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT.b()), Integer.valueOf(EnumC38666a1.EVENT_TYPE_ANR.b())};
        HashSet hashSet = new HashSet();
        for (int i12 = 0; i12 < 7; i12++) {
            hashSet.add(numArr[i12]);
        }
        f382285a = Collections.unmodifiableSet(hashSet);
        EnumC38666a1 enumC38666a1 = EnumC38666a1.EVENT_TYPE_UNDEFINED;
        EnumC38666a1 enumC38666a12 = EnumC38666a1.EVENT_TYPE_PURGE_BUFFER;
        EnumC38666a1 enumC38666a13 = EnumC38666a1.EVENT_TYPE_SEND_REFERRER;
        EnumC38666a1 enumC38666a14 = EnumC38666a1.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        EnumC38666a1 enumC38666a15 = EnumC38666a1.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        EnumC38666a1 enumC38666a16 = EnumC38666a1.EVENT_TYPE_ACTIVATION;
        EnumC38666a1 enumC38666a17 = EnumC38666a1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH;
        EnumC38666a1 enumC38666a18 = EnumC38666a1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        EnumC38666a1 enumC38666a19 = EnumC38666a1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF;
        f382286b = EnumSet.of(enumC38666a1, enumC38666a12, enumC38666a13, enumC38666a14, enumC38666a15, enumC38666a16, enumC38666a17, enumC38666a18, enumC38666a19, EnumC38666a1.EVENT_TYPE_SET_SESSION_EXTRA);
        EnumC38666a1 enumC38666a110 = EnumC38666a1.EVENT_TYPE_SET_USER_INFO;
        EnumC38666a1 enumC38666a111 = EnumC38666a1.EVENT_TYPE_REPORT_USER_INFO;
        EnumC38666a1 enumC38666a112 = EnumC38666a1.EVENT_TYPE_IDENTITY;
        EnumC38666a1 enumC38666a113 = EnumC38666a1.EVENT_TYPE_INIT;
        EnumC38666a1 enumC38666a114 = EnumC38666a1.EVENT_TYPE_APP_UPDATE;
        f382287c = EnumSet.of(enumC38666a110, enumC38666a111, enumC38666a112, enumC38666a1, enumC38666a113, enumC38666a114, enumC38666a13, EnumC38666a1.EVENT_TYPE_ALIVE, EnumC38666a1.EVENT_TYPE_STARTUP, enumC38666a14, enumC38666a15, enumC38666a16, enumC38666a17, enumC38666a18, enumC38666a19, EnumC38666a1.EVENT_TYPE_WEBVIEW_SYNC);
        EnumC38666a1 enumC38666a115 = EnumC38666a1.EVENT_TYPE_UPDATE_FOREGROUND_TIME;
        EnumC38666a1 enumC38666a116 = EnumC38666a1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        f382288d = EnumSet.of(enumC38666a115, enumC38666a110, enumC38666a111, enumC38666a116);
        EnumC38666a1 enumC38666a117 = EnumC38666a1.EVENT_TYPE_EXCEPTION_UNHANDLED;
        EnumC38666a1 enumC38666a118 = EnumC38666a1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT;
        EnumC38666a1 enumC38666a119 = EnumC38666a1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        EnumC38666a1 enumC38666a120 = EnumC38666a1.EVENT_TYPE_EXCEPTION_USER;
        EnumC38666a1 enumC38666a121 = EnumC38666a1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        EnumC38666a1 enumC38666a122 = EnumC38666a1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        EnumC38666a1 enumC38666a123 = EnumC38666a1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH;
        EnumC38666a1 enumC38666a124 = EnumC38666a1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        EnumC38666a1 enumC38666a125 = EnumC38666a1.EVENT_TYPE_CURRENT_SESSION_CRASHPAD_CRASH_PROTOBUF;
        EnumC38666a1 enumC38666a126 = EnumC38666a1.EVENT_TYPE_REGULAR;
        f382289e = EnumSet.of(enumC38666a117, enumC38666a116, enumC38666a118, enumC38666a119, enumC38666a120, enumC38666a121, enumC38666a122, enumC38666a17, enumC38666a18, enumC38666a123, enumC38666a124, enumC38666a125, enumC38666a19, enumC38666a126);
        f382290f = EnumSet.of(EnumC38666a1.EVENT_TYPE_DIAGNOSTIC, EnumC38666a1.EVENT_TYPE_DIAGNOSTIC_STATBOX, EnumC38666a1.EVENT_TYPE_DIAGNOSTIC_DISABLE_STAT_SENDING, EnumC38666a1.EVENT_TYPE_APPMETRICA_DIAGNOSTICS);
        f382291g = EnumSet.of(enumC38666a126);
        f382292h = EnumSet.of(enumC38666a17, enumC38666a18, enumC38666a19);
        f382293i = Arrays.asList(Integer.valueOf(enumC38666a113.b()), Integer.valueOf(EnumC38666a1.EVENT_TYPE_FIRST_ACTIVATION.b()), Integer.valueOf(enumC38666a13.b()), Integer.valueOf(enumC38666a114.b()));
        f382294j = Arrays.asList(Integer.valueOf(EnumC38666a1.EVENT_TYPE_CLEANUP.b()));
    }

    public static boolean a(EnumC38666a1 enumC38666a1) {
        return !f382286b.contains(enumC38666a1);
    }

    public static boolean b(EnumC38666a1 enumC38666a1) {
        return !f382287c.contains(enumC38666a1);
    }

    public static boolean c(int i12) {
        return f382289e.contains(EnumC38666a1.a(i12));
    }

    public static boolean d(int i12) {
        return !f382292h.contains(EnumC38666a1.a(i12));
    }

    public static boolean e(int i12) {
        return f382291g.contains(EnumC38666a1.a(i12));
    }

    public static boolean f(int i12) {
        return f382285a.contains(Integer.valueOf(i12));
    }

    public static boolean a(int i12) {
        return f382290f.contains(EnumC38666a1.a(i12));
    }

    public static boolean b(int i12) {
        return f382288d.contains(EnumC38666a1.a(i12));
    }

    public static C38715c0 c(@j.P String str, @j.N C38737cm c38737cm) {
        return a(str, EnumC38666a1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF, c38737cm);
    }

    public static C38715c0 a(@j.N String str, @j.N C38737cm c38737cm) {
        return a(str, EnumC38666a1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, c38737cm);
    }

    public static C38715c0 b(@j.N String str, @j.N C38737cm c38737cm) {
        return a(str, EnumC38666a1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, c38737cm);
    }

    private static C38715c0 a(@j.P String str, @j.N EnumC38666a1 enumC38666a1, @j.N C38737cm c38737cm) {
        J j12 = new J("", "", enumC38666a1.b(), 0, c38737cm);
        if (str != null) {
            j12.i(str);
        }
        return j12;
    }

    public static C38715c0 a() {
        C38715c0 c38715c0 = new C38715c0();
        c38715c0.f380258e = EnumC38666a1.EVENT_TYPE_DIAGNOSTIC_DISABLE_STAT_SENDING.b();
        try {
            c38715c0.f380255b = new JSONObject().put("stat_sending", new JSONObject().put(BeduinCartItemModel.DISABLED_STRING, true)).toString();
        } catch (Throwable unused) {
        }
        return c38715c0;
    }

    public static C38715c0 a(@j.P String str, @j.N byte[] bArr, @j.N C38737cm c38737cm) {
        return new J(bArr, str, EnumC38666a1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF.b(), c38737cm);
    }

    public static C38715c0 a(String str, String str2, boolean z12, @j.N C38737cm c38737cm) {
        HashMap map = new HashMap();
        map.put("type", str);
        map.put("link", str2);
        map.put("auto", Boolean.valueOf(z12));
        return new J(Tl.g(map), "", EnumC38666a1.EVENT_TYPE_APP_OPEN.b(), 0, c38737cm);
    }
}
