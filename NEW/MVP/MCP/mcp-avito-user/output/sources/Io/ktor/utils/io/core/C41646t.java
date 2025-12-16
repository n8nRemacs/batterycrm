package io.ktor.utils.io.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.X;

/* compiled from: CloseableJVM.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\n\u0010\u0001\"\u00020\u00002\u00020\u0000¨\u0006\u0002"}, d2 = {"Ljava/io/Closeable;", "Closeable", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.utils.io.core.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41646t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f400903a = C42727D.c(a.f400904l);

    /* compiled from: CloseableJVM.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Method;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.core.t$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Method> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f400904l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Method invoke() {
            try {
                return Throwable.class.getMethod("addSuppressed", Throwable.class);
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    @X
    public static final void a(@Y61.k Throwable th2, @Y61.k Throwable th3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = (Method) f400903a.getValue();
        if (method != null) {
            method.invoke(th2, th3);
        }
    }
}
