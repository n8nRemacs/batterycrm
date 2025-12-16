package com.avito.beduin.v2.network.api;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NetworkClient.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/network/api/Method;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Method {

    /* renamed from: b, reason: collision with root package name */
    public static final Method f337866b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Method[] f337867c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f337868d;

    static {
        Method method = new Method("Get", 0);
        f337866b = method;
        Method[] methodArr = {method, new Method("Post", 1), new Method("Patch", 2), new Method("Put", 3), new Method("Delete", 4)};
        f337867c = methodArr;
        f337868d = c.a(methodArr);
    }

    public Method() {
        throw null;
    }

    public static Method valueOf(String str) {
        return (Method) Enum.valueOf(Method.class, str);
    }

    public static Method[] values() {
        return (Method[]) f337867c.clone();
    }
}
