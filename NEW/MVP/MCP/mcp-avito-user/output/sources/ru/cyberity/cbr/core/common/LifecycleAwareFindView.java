package ru.cyberity.cbr.core.common;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.view.C22977J;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23057q;
import com.avito.android.remote.model.SearchParamsConverterKt;
import j.D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.internal.K;
import ru.cyberity.log.logger.Logger;

/* compiled from: LifecycleAwareFindView.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0013\u001a\u0004\u0018\u00018\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/cyberity/cbr/core/common/LifecycleAwareFindView;", "Landroid/view/View;", "T", "Landroidx/lifecycle/q;", "Landroidx/fragment/app/Fragment;", "fragment", "", "viewId", "<init>", "(Landroidx/fragment/app/Fragment;I)V", "Landroidx/lifecycle/P;", SearchParamsConverterKt.OWNER, "Lkotlin/G0;", "onDestroy", "(Landroidx/lifecycle/P;)V", "", "thisRef", "Lkotlin/reflect/n;", "property", "a", "(Ljava/lang/Object;Lkotlin/reflect/n;)Landroid/view/View;", "Landroidx/fragment/app/Fragment;", "b", "I", "c", "Landroid/view/View;", "view", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class LifecycleAwareFindView<T extends View> implements InterfaceC23057q {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final Fragment fragment;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int viewId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private T view;

    /* compiled from: LifecycleAwareFindView.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.common.LifecycleAwareFindView$getValue$1", f = "LifecycleAwareFindView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432628a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LifecycleAwareFindView<T> f432629b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LifecycleAwareFindView<T> lifecycleAwareFindView, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f432629b = lifecycleAwareFindView;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f432629b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f432628a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            try {
                if (((LifecycleAwareFindView) this.f432629b).fragment.getView() != null) {
                    ((LifecycleAwareFindView) this.f432629b).fragment.getViewLifecycleOwner().getLifecycle().a(this.f432629b);
                }
            } catch (Throwable th2) {
                ru.cyberity.log.a.f436064a.e(ru.cyberity.log.c.a(this.f432629b), "Error adding lifecycle observer", th2);
            }
            return G0.f406611a;
        }
    }

    public LifecycleAwareFindView(@Y61.k Fragment fragment, @D int i12) {
        this.fragment = fragment;
        this.viewId = i12;
    }

    @Override // androidx.view.InterfaceC23057q
    public void onDestroy(@Y61.k InterfaceC22983P owner) {
        this.view = null;
    }

    @Y61.l
    public final T a(@Y61.l Object thisRef, @Y61.k kotlin.reflect.n<?> property) {
        T t12 = null;
        if (this.view == null && this.fragment.getView() != null) {
            C22977J c22977jA = C22984Q.a(this.fragment);
            kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
            C43259k.d(c22977jA, K.f411877a.y(), null, new a(this, null), 2);
        }
        if (this.fragment.getView() != null) {
            if (this.view == null) {
                View view = this.fragment.getView();
                if (view != null) {
                    t12 = (T) view.findViewById(this.viewId);
                }
                this.view = t12;
            }
            return this.view;
        }
        Logger.e$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), this.fragment + ".view is null", null, 4, null);
        this.view = null;
        return null;
    }
}
