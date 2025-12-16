package com.avito.android.util;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;

/* compiled from: Logs.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/V2;", "LAW/b;", "<init>", "()V", "_common_logger_util-android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class V2 implements AW.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final V2 f318762a = new V2();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static AW.b f318763b = AW.f.f434a;

    /* compiled from: Logs.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Throwable f318764l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th2) {
            super(0);
            this.f318764l = th2;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() throws Throwable {
            throw this.f318764l;
        }
    }

    @Override // AW.b
    public final void a(@Y61.k String str, @Y61.k String str2, @Y61.k Throwable th2) {
        f318763b.a(str, str2, th2);
    }

    public final void b(@Y61.k String str, @Y61.l Throwable th2) {
        c("DEFAULT_TAG", str, th2);
    }

    @Override // AW.b
    public final void c(@Y61.k String str, @Y61.k String str2, @Y61.l Throwable th2) {
        f318763b.c(str, str2, th2);
    }

    public final void d(@Y61.k String str, @Y61.k String str2) {
        a(str, str2, new IllegalStateException(str2));
    }

    public final void e(@Y61.k String str, @Y61.l Throwable th2) {
        if (th2 == null) {
            th2 = new IllegalStateException(str);
        }
        a("DEFAULT_TAG", str, th2);
    }

    public final void f(@Y61.k Throwable th2) {
        String message = th2.getMessage();
        if (message == null) {
            message = "Error";
        }
        a("DEFAULT_TAG", message, th2);
    }

    @Override // AW.b
    public final void g(@Y61.k String str, @Y61.k String str2) {
        f318763b.g(str, str2);
    }

    @Override // AW.b
    public final void h(@Y61.k String str, @Y61.k Throwable th2, @Y61.k Y41.a<String> aVar) {
        f318763b.h(str, th2, aVar);
    }

    @Override // AW.b
    public final void i(@Y61.k String str, @Y61.k String str2, @Y61.l Throwable th2) {
        f318763b.i(str, str2, th2);
    }

    @Override // AW.b
    public final void j(@Y61.k String str, @Y61.k String str2, @Y61.l Throwable th2) {
        f318763b.j(str, str2, th2);
    }

    @Override // AW.b
    public final void k(@Y61.k String str, @Y61.k Y41.a aVar) {
        f318763b.k(str, aVar);
    }

    @Override // AW.b
    public final void l(@Y61.k String str, @Y61.l Throwable th2, @Y61.k Y41.a<String> aVar) {
        f318763b.l(str, th2, aVar);
    }

    public final void m(@Y61.k Throwable th2, boolean z12) throws Throwable {
        if (!z12) {
            f(th2);
            return;
        }
        a aVar = new a(th2);
        if (kotlin.jvm.internal.L.f(Looper.myLooper(), Looper.getMainLooper())) {
            throw th2;
        }
        new Handler(Looper.getMainLooper()).post(new U2(0, aVar));
    }
}
