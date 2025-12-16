package com.avito.android.component.toast;

import Y61.k;
import Y61.l;
import com.avito.android.component.snackbar.e;
import com.avito.android.component.toast.f;
import com.avito.android.remote.error.ApiError;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: UiMessageShownRelay.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/avito/android/component/toast/g;", "", "<init>", "()V", "a", "b", "_avito_ui-messages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final g f125258a = new g();

    /* renamed from: b, reason: collision with root package name */
    @l
    public static Y41.l<? super a, G0> f125259b;

    /* compiled from: UiMessageShownRelay.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/toast/g$a;", "", "_avito_ui-messages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f125260a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final b f125261b;

        public a(@k String str, @k b bVar) {
            this.f125260a = str;
            this.f125261b = bVar;
        }
    }

    /* compiled from: UiMessageShownRelay.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/component/toast/g$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/component/toast/g$b$a;", "Lcom/avito/android/component/toast/g$b$b;", "_avito_ui-messages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: UiMessageShownRelay.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/component/toast/g$b$a;", "Lcom/avito/android/component/toast/g$b;", "<init>", "()V", "_avito_ui-messages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final a f125262a = new a();

            public a() {
                super(null);
            }
        }

        /* compiled from: UiMessageShownRelay.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/toast/g$b$b;", "Lcom/avito/android/component/toast/g$b;", "_avito_ui-messages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.component.toast.g$b$b, reason: collision with other inner class name */
        public static final class C3721b extends b {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final Throwable f125263a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final ApiError f125264b;

            public C3721b() {
                this(null, null, 3, null);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public C3721b(Throwable th2, ApiError apiError, int i12, C42822w c42822w) {
                C42822w c42822w2 = null;
                th2 = (i12 & 1) != 0 ? null : th2;
                apiError = (i12 & 2) != 0 ? null : apiError;
                super(c42822w2);
                this.f125263a = th2;
                this.f125264b = apiError;
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: UiMessageShownRelay.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "throwable", "Lcom/avito/android/component/toast/g$b$b;", "invoke", "(Ljava/lang/Throwable;)Lcom/avito/android/component/toast/g$b$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<Throwable, b.C3721b> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f125265l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final b.C3721b invoke(Throwable th2) {
            return new b.C3721b(th2, null, 2, null);
        }
    }

    /* compiled from: UiMessageShownRelay.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/error/ApiError;", "error", "Lcom/avito/android/component/toast/g$b$b;", "invoke", "(Lcom/avito/android/remote/error/ApiError;)Lcom/avito/android/component/toast/g$b$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<ApiError, b.C3721b> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f125266l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final b.C3721b invoke(ApiError apiError) {
            return new b.C3721b(null, apiError, 1, null);
        }
    }

    /* compiled from: UiMessageShownRelay.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "throwable", "Lcom/avito/android/component/toast/g$b$b;", "invoke", "(Ljava/lang/Throwable;)Lcom/avito/android/component/toast/g$b$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<Throwable, b.C3721b> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f125267l = new e();

        public e() {
            super(1);
        }

        @Override // Y41.l
        public final b.C3721b invoke(Throwable th2) {
            return new b.C3721b(th2, null, 2, null);
        }
    }

    /* compiled from: UiMessageShownRelay.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/error/ApiError;", "error", "Lcom/avito/android/component/toast/g$b$b;", "invoke", "(Lcom/avito/android/remote/error/ApiError;)Lcom/avito/android/component/toast/g$b$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<ApiError, b.C3721b> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f125268l = new f();

        public f() {
            super(1);
        }

        @Override // Y41.l
        public final b.C3721b invoke(ApiError apiError) {
            return new b.C3721b(null, apiError, 1, null);
        }
    }

    public static void a(@k String str, @k com.avito.android.component.snackbar.e eVar) {
        Object objInvoke;
        b c3721b;
        if (eVar.equals(e.a.f125238a)) {
            c3721b = b.a.f125262a;
        } else {
            if (!(eVar instanceof e.b)) {
                throw new NoWhenBranchMatchedException();
            }
            e.b bVar = (e.b) eVar;
            e eVar2 = e.f125267l;
            f fVar = f.f125268l;
            Throwable th2 = bVar.f125240a;
            if (th2 != null) {
                objInvoke = eVar2.invoke(th2);
            } else {
                ApiError apiError = bVar.f125241b;
                objInvoke = apiError != null ? fVar.invoke(apiError) : null;
            }
            c3721b = (b.C3721b) objInvoke;
            if (c3721b == null) {
                c3721b = new b.C3721b(null, null, 3, null);
            }
        }
        Y41.l<? super a, G0> lVar = f125259b;
        if (lVar != null) {
            lVar.invoke(new a(str, c3721b));
        }
    }

    public static void b(@k String str, @k com.avito.android.component.toast.f fVar) {
        Object objInvoke;
        b c3721b;
        if (fVar.equals(f.a.f125253a) ? true : fVar.equals(f.b.f125254a)) {
            c3721b = b.a.f125262a;
        } else {
            if (!(fVar instanceof f.c)) {
                throw new NoWhenBranchMatchedException();
            }
            f.c cVar = (f.c) fVar;
            c cVar2 = c.f125265l;
            d dVar = d.f125266l;
            ApiError apiError = cVar.f125257b;
            if (apiError != null) {
                objInvoke = dVar.invoke(apiError);
            } else {
                Throwable th2 = cVar.f125256a;
                objInvoke = th2 != null ? cVar2.invoke(th2) : null;
            }
            c3721b = (b.C3721b) objInvoke;
            if (c3721b == null) {
                c3721b = new b.C3721b(null, null, 3, null);
            }
        }
        Y41.l<? super a, G0> lVar = f125259b;
        if (lVar != null) {
            lVar.invoke(new a(str, c3721b));
        }
    }
}
