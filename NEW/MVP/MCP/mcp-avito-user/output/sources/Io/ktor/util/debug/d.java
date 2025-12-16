package io.ktor.util.debug;

import Y61.k;
import java.lang.management.ManagementFactory;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: IntellijIdeaDebugDetectorJvm.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/util/debug/d;", "", "<init>", "()V", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final InterfaceC42726C f400459a;

    /* compiled from: IntellijIdeaDebugDetectorJvm.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f400460l = new a();

        public a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // Y41.a
        @k
        public final Boolean invoke() {
            boolean zQ2;
            try {
                zQ2 = C43066x.q(ManagementFactory.getRuntimeMXBean().getInputArguments().toString(), "jdwp", false);
            } catch (Throwable unused) {
                zQ2 = false;
            }
            return Boolean.valueOf(zQ2);
        }
    }

    static {
        new d();
        f400459a = C42727D.c(a.f400460l);
    }
}
