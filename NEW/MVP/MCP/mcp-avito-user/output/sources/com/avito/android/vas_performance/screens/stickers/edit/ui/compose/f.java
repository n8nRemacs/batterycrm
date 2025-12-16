package com.avito.android.vas_performance.screens.stickers.edit.ui.compose;

import ML0.b;
import androidx.compose.runtime.InterfaceC22204y1;
import com.akita.compose.component.toast_bar.J;
import com.akita.compose.component.toast_bar.ToastBarDuration;
import com.akita.compose.component.toast_bar.ToastBarPosition;
import com.akita.compose.component.toast_bar.u;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StickersEditScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.vas_performance.screens.stickers.edit.ui.compose.StickersEditScreenKt$StickersEditScreen$1", f = "StickersEditScreen.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class f extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f320856q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<ML0.b> f320857r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.m f320858s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u f320859t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ J f320860u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f320861v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f320862w;

    /* compiled from: StickersEditScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LML0/b;", "event", "Lkotlin/G0;", "emit", "(LML0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.app.m f320863b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ u f320864c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ J f320865d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f320866e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f320867f;

        public a(androidx.appcompat.app.m mVar, u uVar, J j12, InterfaceC22204y1 interfaceC22204y1, InterfaceC22204y1 interfaceC22204y12) {
            this.f320863b = mVar;
            this.f320864c = uVar;
            this.f320865d = j12;
            this.f320866e = interfaceC22204y1;
            this.f320867f = interfaceC22204y12;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            ML0.b bVar = (ML0.b) obj;
            if (bVar instanceof b.c) {
                ((Y41.l) this.f320866e.getF42167b()).invoke(((b.c) bVar).f10598a);
            } else if (bVar instanceof b.a) {
                androidx.appcompat.app.m mVar = this.f320863b;
                if (mVar != null) {
                    mVar.onBackPressed();
                }
            } else if (bVar instanceof b.C0675b) {
                ((Y41.a) this.f320867f.getF42167b()).invoke();
            } else if (bVar instanceof b.d) {
                Object objA = this.f320864c.a(this.f320865d, ((b.d) bVar).f10599a, G0.f406611a, (60 & 8) != 0 ? null : null, (60 & 32) != 0 ? ToastBarDuration.f63230b : ToastBarDuration.f63231c, (60 & 64) != 0 ? ToastBarPosition.f63235b : null, (60 & 128) != 0 ? false : false, continuation);
                return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.appcompat.app.m mVar, InterfaceC22204y1 interfaceC22204y1, InterfaceC22204y1 interfaceC22204y12, u uVar, J j12, Continuation continuation, InterfaceC43160i interfaceC43160i) {
        super(2, continuation);
        this.f320857r = interfaceC43160i;
        this.f320858s = mVar;
        this.f320859t = uVar;
        this.f320860u = j12;
        this.f320861v = interfaceC22204y1;
        this.f320862w = interfaceC22204y12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new f(this.f320858s, this.f320861v, this.f320862w, this.f320859t, this.f320860u, continuation, this.f320857r);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f320856q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC22204y1 interfaceC22204y1 = this.f320861v;
            InterfaceC22204y1 interfaceC22204y12 = this.f320862w;
            a aVar = new a(this.f320858s, this.f320859t, this.f320860u, interfaceC22204y1, interfaceC22204y12);
            this.f320856q = 1;
            if (this.f320857r.collect(aVar, this) == coroutine_suspended) {
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
