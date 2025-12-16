package com.yandex.metrica.impl.ob;

import android.util.SparseArray;

/* renamed from: com.yandex.metrica.impl.ob.r6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39092r6 {

    /* renamed from: c, reason: collision with root package name */
    private static SparseArray<C39092r6> f381726c;

    /* renamed from: a, reason: collision with root package name */
    public final String f381727a;

    /* renamed from: b, reason: collision with root package name */
    public final String f381728b;

    static {
        SparseArray<C39092r6> sparseArray = new SparseArray<>();
        f381726c = sparseArray;
        sparseArray.put(EnumC38666a1.EVENT_TYPE_EXCEPTION_UNHANDLED.b(), new C39092r6("jvm", "binder"));
        f381726c.put(EnumC38666a1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF.b(), new C39092r6("jvm", "binder"));
        f381726c.put(EnumC38666a1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT.b(), new C39092r6("jvm", "intent"));
        f381726c.put(EnumC38666a1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE.b(), new C39092r6("jvm", "file"));
        f381726c.put(EnumC38666a1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH.b(), new C39092r6("jni_native", "file"));
        f381726c.put(EnumC38666a1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF.b(), new C39092r6("jni_native", "file"));
        f381726c.put(EnumC38666a1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH.b(), new C39092r6("jni_native", "file"));
        f381726c.put(EnumC38666a1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF.b(), new C39092r6("jni_native", "file"));
        f381726c.put(EnumC38666a1.EVENT_TYPE_CURRENT_SESSION_CRASHPAD_CRASH_PROTOBUF.b(), new C39092r6("jni_native", "file"));
        f381726c.put(EnumC38666a1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF.b(), new C39092r6("jni_native", "binder"));
    }

    private C39092r6(@j.N String str, @j.N String str2) {
        this.f381727a = str;
        this.f381728b = str2;
    }

    public static C39092r6 a(int i12) {
        return f381726c.get(i12);
    }
}
