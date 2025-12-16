package com.avito.android.screenshot_observer;

import Y41.p;
import Y61.k;
import Y61.l;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.e2;

/* compiled from: ScreenshotObserver.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screenshot_observer/c;", "Landroid/database/ContentObserver;", "_avito_screenshot-observer_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f261692a;

    /* compiled from: ScreenshotObserver.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.screenshot_observer.ScreenshotObserverImpl$registerObserver$contentObserver$1$onChange$1$1", f = "ScreenshotObserver.kt", i = {}, l = {75, 76}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f261693q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ b f261694r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Uri f261695s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, Uri uri, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f261694r = bVar;
            this.f261695s = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new a(this.f261694r, this.f261695s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f261693q;
            Uri uri = this.f261695s;
            b bVar = this.f261694r;
            if (i12 == 0) {
                C42729a0.b(obj);
                f fVar = bVar.f261684d;
                this.f261693q = 1;
                obj = fVar.a(uri, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                C42729a0.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                e2 e2Var = bVar.f261686f;
                this.f261693q = 2;
                if (e2Var.emit(uri, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, Handler handler) {
        super(handler);
        this.f261692a = bVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z12, @l Uri uri) {
        super.onChange(z12, uri);
        if (uri != null) {
            b bVar = this.f261692a;
            C43259k.d(bVar.f261687g, null, null, new a(bVar, uri, null), 3);
        }
    }
}
