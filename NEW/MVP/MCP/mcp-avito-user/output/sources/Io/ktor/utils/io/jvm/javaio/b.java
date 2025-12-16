package io.ktor.utils.io.jvm.javaio;

import io.ktor.utils.io.InterfaceC41649d1;
import io.ktor.utils.io.W0;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.N0;

/* compiled from: Blocking.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f401107a = C42727D.c(a.f401110l);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Object f401108b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final Object f401109c = new Object();

    /* compiled from: Blocking.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/slf4j/a;", "kotlin.jvm.PlatformType", "invoke", "()Lorg/slf4j/a;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends N implements Y41.a<org.slf4j.a> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f401110l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final org.slf4j.a invoke() {
            return org.slf4j.b.d(io.ktor.utils.io.jvm.javaio.a.class);
        }
    }

    @Y61.k
    public static final InputStream a(@Y61.k W0 w02, @Y61.l N0 n02) {
        return new e(w02, n02);
    }

    public static InputStream b(W0 w02) {
        return new e(w02, null);
    }

    public static OutputStream c(InterfaceC41649d1 interfaceC41649d1) {
        return new h(interfaceC41649d1);
    }
}
