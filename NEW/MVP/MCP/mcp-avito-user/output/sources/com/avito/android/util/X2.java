package com.avito.android.util;

import kotlin.Metadata;

/* compiled from: LogsT.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/X2;", "LAW/b;", "<init>", "()V", "_common_logger_util-android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class X2 implements AW.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final X2 f318778a = new X2();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static AW.b f318779b = AW.f.f434a;

    public static String b(String str) {
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append("[" + Thread.currentThread().getName() + ']');
        sb2.append("] ");
        sb2.append(str);
        return sb2.toString();
    }

    @Override // AW.b
    public final void a(@Y61.k String str, @Y61.k String str2, @Y61.k Throwable th2) {
        f318779b.a(str, b(str2), th2);
    }

    @Override // AW.b
    public final void c(@Y61.k String str, @Y61.k String str2, @Y61.l Throwable th2) {
        f318779b.c(str, b(str2), th2);
    }

    public final void d(@Y61.k String str, @Y61.k String str2) {
        a(str, str2, new IllegalStateException(str2));
    }

    @Override // AW.b
    public final void g(@Y61.k String str, @Y61.k String str2) {
        f318779b.g(str, b(str2));
    }

    @Override // AW.b
    public final void h(@Y61.k String str, @Y61.k Throwable th2, @Y61.k Y41.a<String> aVar) {
        f318779b.h(str, th2, new W2(aVar));
    }

    @Override // AW.b
    public final void i(@Y61.k String str, @Y61.k String str2, @Y61.l Throwable th2) {
        f318779b.i(str, b(str2), th2);
    }

    @Override // AW.b
    public final void j(@Y61.k String str, @Y61.k String str2, @Y61.l Throwable th2) {
        f318779b.j(str, b(str2), th2);
    }

    @Override // AW.b
    public final void k(@Y61.k String str, @Y61.k Y41.a aVar) {
        f318779b.k(str, new W2(aVar));
    }

    @Override // AW.b
    public final void l(@Y61.k String str, @Y61.l Throwable th2, @Y61.k Y41.a<String> aVar) {
        f318779b.l(str, th2, new W2(aVar));
    }
}
