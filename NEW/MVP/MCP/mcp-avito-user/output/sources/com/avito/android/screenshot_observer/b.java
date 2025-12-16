package com.avito.android.screenshot_observer;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import com.avito.android.permissions.t;
import com.avito.android.permissions.u;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.screenshot_observer.a;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43189o1;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.internal.K;

/* compiled from: ScreenshotObserver.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screenshot_observer/b;", "Lcom/avito/android/screenshot_observer/a;", "_avito_screenshot-observer_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.screenshot_observer.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f261681a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a.InterfaceC7827a f261682b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final u f261683c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final f f261684d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public c f261685e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final e2 f261686f = f2.b(0, 0, null, 7);

    /* renamed from: g, reason: collision with root package name */
    @k
    public final C43238h f261687g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public N0 f261688h;

    /* compiled from: ScreenshotObserver.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.screenshot_observer.ScreenshotObserverImpl$register$1", f = "ScreenshotObserver.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f261689q;

        /* compiled from: ScreenshotObserver.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/net/Uri;", TooltipAttribute.PARAM_DEEP_LINK, "Lkotlin/G0;", "emit", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.screenshot_observer.b$a$a, reason: collision with other inner class name */
        public static final class C7828a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f261691b;

            public C7828a(b bVar) {
                this.f261691b = bVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                this.f261691b.f261682b.R1((Uri) obj);
                return G0.f406611a;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return b.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f261689q;
            if (i12 == 0) {
                C42729a0.b(obj);
                b bVar = b.this;
                C43189o1 c43189o1 = new C43189o1(C43175k.n(bVar.f261686f, 1000L));
                C7828a c7828a = new C7828a(bVar);
                this.f261689q = 1;
                if (c43189o1.collect(c7828a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public b(@k Context context, @k a.InterfaceC7827a interfaceC7827a, @k u uVar, @k f fVar) {
        this.f261681a = context;
        this.f261682b = interfaceC7827a;
        this.f261683c = uVar;
        this.f261684d = fVar;
        kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
        this.f261687g = U.a(K.f411877a);
    }

    @Override // com.avito.android.screenshot_observer.a
    public final void a() {
        c cVar = this.f261685e;
        if (cVar != null) {
            this.f261681a.getContentResolver().unregisterContentObserver(cVar);
            this.f261685e = null;
            N0 n02 = this.f261688h;
            if (n02 != null) {
                ((V0) n02).c(null);
            }
            this.f261688h = null;
        }
    }

    @Override // com.avito.android.screenshot_observer.a
    public final void b() {
        if (this.f261685e == null) {
            t.f215141z.getClass();
            if (this.f261683c.b(t.a.f215144c)) {
                ContentResolver contentResolver = this.f261681a.getContentResolver();
                c cVar = new c(this, new Handler(Looper.getMainLooper()));
                contentResolver.registerContentObserver(Build.VERSION.SDK_INT >= 29 ? MediaStore.Images.Media.getContentUri("external") : MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, cVar);
                this.f261685e = cVar;
                this.f261688h = C43259k.d(this.f261687g, null, null, new a(null), 3);
            }
        }
    }
}
