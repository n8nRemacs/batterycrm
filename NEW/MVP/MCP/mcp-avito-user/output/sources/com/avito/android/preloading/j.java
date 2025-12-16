package com.avito.android.preloading;

import com.avito.android.messenger.blacklist.mvi.C31684n;
import com.avito.android.preloading.n;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.T0;
import io.reactivex.rxjava3.internal.operators.observable.X0;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PreloadingPromise.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\n\b\u0001\u0010\u0003 \u0001*\u00020\u00012\u00020\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/preloading/j;", "", "Params", "Response", "a", "_common_preloading-promise"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class j<Params, Response> {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final a f221853g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.preloading.d<Params, Response> f221854a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f221855b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.i f221856c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Object f221857d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public T0 f221858e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Params f221859f;

    /* compiled from: PreloadingPromise.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/preloading/j$a;", "", "<init>", "()V", "", "LOG_TAG", "Ljava/lang/String;", "", "SUBSCRIBER_TIMEOUT", "J", "_common_preloading-promise"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PreloadingPromise.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\n\b\u0001\u0010\u0004 \u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Params", "", "Response", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<String> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f221860l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Preloading promise already in progress";
        }
    }

    /* compiled from: PreloadingPromise.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0002 \u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Params", "Response", "", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T> f221862b = new d<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "PreloadingPromise", (Throwable) obj);
        }
    }

    /* compiled from: PreloadingPromise.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\n\b\u0001\u0010\u0004 \u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Params", "", "Response", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.a<String> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f221863l = new e();

        public e() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Preload and result params doesn't match";
        }
    }

    /* compiled from: PreloadingPromise.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\n\b\u0001\u0010\u0004 \u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Params", "", "Response", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements Y41.a<String> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f221864l = new f();

        public f() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Loading must have been started at this point";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@Y61.k com.avito.android.preloading.d<Params, ? extends Response> dVar, boolean z12) {
        this.f221854a = dVar;
        this.f221855b = z12;
        this.f221856c = new io.reactivex.rxjava3.disposables.i();
        this.f221857d = new Object();
    }

    public final void a(Y41.a aVar, boolean z12) {
        if (this.f221855b) {
            if (!z12) {
                throw new IllegalArgumentException(aVar.invoke().toString());
            }
        } else {
            if (z12) {
                return;
            }
            V2.f318762a.d("PreloadingPromise", (String) aVar.invoke());
        }
    }

    public final void b(@Y61.k Params params) {
        synchronized (this.f221857d) {
            a(b.f221860l, this.f221859f == null);
            this.f221859f = params;
            z<? extends Response> zVarA = this.f221854a.a(params);
            zVarA.getClass();
            io.reactivex.rxjava3.internal.functions.b.a(1, "bufferSize");
            X0 x0Q0 = X0.Q0(zVarA);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            H h12 = io.reactivex.rxjava3.schedulers.b.f404942b;
            io.reactivex.rxjava3.internal.functions.b.a(1, "observerCount");
            Objects.requireNonNull(timeUnit, "unit is null");
            Objects.requireNonNull(h12, "scheduler is null");
            T0 t02 = new T0(x0Q0, 3000L, timeUnit, h12);
            this.f221856c.a(t02.v0(c.f221861b, d.f221862b, io.reactivex.rxjava3.internal.functions.a.f401993c));
            this.f221858e = t02;
            G0 g02 = G0.f406611a;
        }
    }

    @Y61.k
    public final io.reactivex.rxjava3.disposables.d c(@Y61.k Params params, @Y61.k Y41.l<? super Response, G0> lVar, @Y61.k Y41.l<? super Throwable, G0> lVar2, @Y61.k Y41.a<G0> aVar) {
        io.reactivex.rxjava3.disposables.d dVarV0;
        synchronized (this.f221857d) {
            try {
                if (this.f221859f == null || this.f221856c.getF318621e()) {
                    b(params);
                }
                a(e.f221863l, params.equals(this.f221859f));
                T0 t02 = this.f221858e;
                a(f.f221864l, t02 != null);
                dVarV0 = t02 != null ? new io.reactivex.rxjava3.internal.operators.observable.N(t02, new C31684n(this, 7)).v0(new n.a(lVar), new n.a(lVar2), new C31684n(aVar, 8)) : null;
                this.f221856c.a(dVarV0);
                if (dVarV0 == null) {
                    dVarV0 = io.reactivex.rxjava3.disposables.d.E(io.reactivex.rxjava3.internal.functions.a.f401992b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVarV0;
    }

    public /* synthetic */ j(com.avito.android.preloading.d dVar, boolean z12, int i12, C42822w c42822w) {
        this(dVar, (i12 & 2) != 0 ? false : z12);
    }

    /* compiled from: PreloadingPromise.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0002 \u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Params", "Response", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T> f221861b = new c<>();

        @Override // l41.g
        public final void accept(@Y61.k Response response) {
        }
    }
}
