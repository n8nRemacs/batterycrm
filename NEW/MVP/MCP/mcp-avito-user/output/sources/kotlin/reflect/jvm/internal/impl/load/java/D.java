package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import v51.C49167a;

/* compiled from: JvmAbi.kt */
/* loaded from: classes8.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final D f407911a = new D();

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.name.c f407912b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.name.b f407913c;

    static {
        kotlin.reflect.jvm.internal.impl.name.c cVar = new kotlin.reflect.jvm.internal.impl.name.c("kotlin.jvm.JvmField");
        f407912b = cVar;
        kotlin.reflect.jvm.internal.impl.name.b.j(cVar);
        kotlin.reflect.jvm.internal.impl.name.b.j(new kotlin.reflect.jvm.internal.impl.name.c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f407913c = kotlin.reflect.jvm.internal.impl.name.b.e("kotlin/jvm/internal/RepeatableContainer", false);
    }

    @X41.n
    @Y61.k
    public static final String a(@Y61.k String str) {
        if (b(str)) {
            return str;
        }
        return "get" + C49167a.a(str);
    }

    @X41.n
    public static final boolean b(@Y61.k String str) {
        if (!C43066x.h0(str, "is", false) || str.length() == 2) {
            return false;
        }
        char cCharAt = str.charAt(2);
        return L.g(97, cCharAt) > 0 || L.g(cCharAt, 122) > 0;
    }
}
