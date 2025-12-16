package curtains.internal;

import Y61.k;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Handlers.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"curtains_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final InterfaceC42726C f393000a = C42727D.c(b.f393003l);

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final InterfaceC42726C f393001b = C42727D.c(a.f393002l);

    /* compiled from: Handlers.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/Handler;", "invoke"}, k = 3, mv = {1, 4, 1})
    public static final class a extends N implements Y41.a<Handler> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f393002l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Handler invoke() {
            HandlerThread handlerThread = new HandlerThread("frame_metrics");
            handlerThread.start();
            return new Handler(handlerThread.getLooper());
        }
    }

    /* compiled from: Handlers.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/Handler;", "invoke"}, k = 3, mv = {1, 4, 1})
    public static final class b extends N implements Y41.a<Handler> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f393003l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }
}
