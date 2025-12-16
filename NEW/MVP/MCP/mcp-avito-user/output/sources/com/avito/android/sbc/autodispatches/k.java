package com.avito.android.sbc.autodispatches;

import Po0.C14821e;
import Po0.InterfaceC14818b;
import Po0.InterfaceC14820d;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C23424o;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.lib.design.floating_container.FloatingContainer;
import com.avito.android.lib.design.tab_group.TabGroup;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.D6;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SbcAutoDispatchesFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sbc.autodispatches.SbcAutoDispatchesFragment$bindViewModel$1", f = "SbcAutoDispatchesFragment.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class k extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f258915q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ SbcAutoDispatchesFragment f258916r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.sbc.autodispatches.mvi.m f258917s;

    /* compiled from: SbcAutoDispatchesFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.sbc.autodispatches.SbcAutoDispatchesFragment$bindViewModel$1$1", f = "SbcAutoDispatchesFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f258918q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.sbc.autodispatches.mvi.m f258919r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ SbcAutoDispatchesFragment f258920s;

        /* compiled from: SbcAutoDispatchesFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.sbc.autodispatches.SbcAutoDispatchesFragment$bindViewModel$1$1$1", f = "SbcAutoDispatchesFragment.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.sbc.autodispatches.k$a$a, reason: collision with other inner class name */
        public static final class C7775a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f258921q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.sbc.autodispatches.mvi.m f258922r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ SbcAutoDispatchesFragment f258923s;

            /* compiled from: SbcAutoDispatchesFragment.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LPo0/d;", "it", "Lkotlin/G0;", "emit", "(LPo0/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.sbc.autodispatches.k$a$a$a, reason: collision with other inner class name */
            public static final class C7776a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SbcAutoDispatchesFragment f258924b;

                public C7776a(SbcAutoDispatchesFragment sbcAutoDispatchesFragment) {
                    this.f258924b = sbcAutoDispatchesFragment;
                }

                /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    Integer num;
                    InterfaceC14820d interfaceC14820d = (InterfaceC14820d) obj;
                    z zVar = this.f258924b.f258826q0;
                    if (zVar != null && !L.f(zVar.f258984k, interfaceC14820d)) {
                        boolean zEquals = interfaceC14820d.equals(InterfaceC14820d.C0867d.f13300a);
                        com.avito.android.progress_overlay.l lVar = zVar.f258983j;
                        Integer num2 = null;
                        SwipeRefreshLayout swipeRefreshLayout = zVar.f258982i;
                        FloatingContainer floatingContainer = zVar.f258981h;
                        if (zEquals) {
                            D6.w(floatingContainer);
                            lVar.k(null);
                            swipeRefreshLayout.setRefreshing(false);
                        } else {
                            boolean z12 = interfaceC14820d instanceof InterfaceC14820d.b;
                            View view = zVar.f258974a;
                            if (z12) {
                                D6.H(floatingContainer);
                                floatingContainer.a(view.getContext().getString(R.string.sbc_auto_dispatch_action_button_update));
                                lVar.a(view.getContext().getString(R.string.messenger_create_discount_unknown_error_description));
                                swipeRefreshLayout.setRefreshing(false);
                            } else {
                                boolean z13 = interfaceC14820d instanceof InterfaceC14820d.a;
                                ViewGroup viewGroup = zVar.f258979f;
                                ViewGroup viewGroup2 = zVar.f258980g;
                                if (z13) {
                                    D6.H(floatingContainer);
                                    floatingContainer.a(view.getContext().getString(R.string.sbc_auto_dispatch_choose_advert_short));
                                    lVar.j();
                                    D6.H(viewGroup2);
                                    D6.w(viewGroup);
                                    swipeRefreshLayout.setRefreshing(false);
                                } else if (interfaceC14820d instanceof InterfaceC14820d.c) {
                                    D6.H(floatingContainer);
                                    floatingContainer.a(view.getContext().getString(R.string.sbc_auto_dispatch_choose_advert_long));
                                    lVar.j();
                                    D6.w(viewGroup2);
                                    D6.H(viewGroup);
                                    InterfaceC14820d.c cVar = (InterfaceC14820d.c) interfaceC14820d;
                                    swipeRefreshLayout.setRefreshing(cVar.f13299c);
                                    D d12 = zVar.f258985l;
                                    Object obj2 = d12.f258821k;
                                    ArrayList arrayList = cVar.f13297a;
                                    if (!L.f(obj2, arrayList)) {
                                        if (zVar.f258986m && (num = cVar.f13298b) != null) {
                                            zVar.f258986m = false;
                                            num2 = num;
                                        }
                                        TabGroup tabGroup = zVar.f258978e;
                                        tabGroup.l();
                                        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
                                        Iterator<T> it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            arrayList2.add(new com.avito.android.lib.design.tab_group.b(com.avito.android.printable_text.b.f(((C14821e) it.next()).f13302b), null, false, 6, null));
                                        }
                                        com.avito.android.lib.design.tab_group.c.a(tabGroup, arrayList2, num2);
                                        ?? r12 = d12.f258821k;
                                        d12.f258821k = arrayList;
                                        C23424o.a(new C34465a(arrayList, r12), true).b(d12);
                                    }
                                }
                            }
                        }
                        zVar.f258984k = interfaceC14820d;
                    }
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7775a(SbcAutoDispatchesFragment sbcAutoDispatchesFragment, com.avito.android.sbc.autodispatches.mvi.m mVar, Continuation continuation) {
                super(2, continuation);
                this.f258922r = mVar;
                this.f258923s = sbcAutoDispatchesFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C7775a(this.f258923s, this.f258922r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C7775a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f258921q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    C7776a c7776a = new C7776a(this.f258923s);
                    this.f258921q = 1;
                    if (this.f258922r.le(c7776a, this) == coroutine_suspended) {
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

        /* compiled from: SbcAutoDispatchesFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.sbc.autodispatches.SbcAutoDispatchesFragment$bindViewModel$1$1$2", f = "SbcAutoDispatchesFragment.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f258925q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.sbc.autodispatches.mvi.m f258926r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ SbcAutoDispatchesFragment f258927s;

            /* compiled from: SbcAutoDispatchesFragment.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LPo0/b;", "event", "Lkotlin/G0;", "emit", "(LPo0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.sbc.autodispatches.k$a$b$a, reason: collision with other inner class name */
            public static final class C7777a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SbcAutoDispatchesFragment f258928b;

                public C7777a(SbcAutoDispatchesFragment sbcAutoDispatchesFragment) {
                    this.f258928b = sbcAutoDispatchesFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    InterfaceC14818b interfaceC14818b = (InterfaceC14818b) obj;
                    boolean z12 = interfaceC14818b instanceof InterfaceC14818b.a;
                    SbcAutoDispatchesFragment sbcAutoDispatchesFragment = this.f258928b;
                    if (z12) {
                        com.avito.android.deeplink_handler.handler.composite.a aVar = sbcAutoDispatchesFragment.f258825p0;
                        if (aVar == null) {
                            aVar = null;
                        }
                        b.a.a(aVar, ((InterfaceC14818b.a) interfaceC14818b).f13284a, null, null, 6);
                    } else if (interfaceC14818b instanceof InterfaceC14818b.C0865b) {
                        View view = sbcAutoDispatchesFragment.getView();
                        View viewFindViewById = view != null ? view.findViewById(R.id.sbc_auto_dispatches_root_container) : null;
                        if (viewFindViewById != null) {
                            com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                            PrintableText printableTextC = com.avito.android.printable_text.b.c(((InterfaceC14818b.C0865b) interfaceC14818b).f13285a, new Serializable[0]);
                            ToastBarPosition toastBarPosition = ToastBarPosition.f181048f;
                            Context context = sbcAutoDispatchesFragment.getContext();
                            com.avito.android.component.toast.c.b(cVar, viewFindViewById, printableTextC, null, null, null, null, 0, toastBarPosition, context != null ? Boxing.boxInt(D6.i(84, context)) : null, false, false, null, null, 3902);
                        }
                    }
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(SbcAutoDispatchesFragment sbcAutoDispatchesFragment, com.avito.android.sbc.autodispatches.mvi.m mVar, Continuation continuation) {
                super(2, continuation);
                this.f258926r = mVar;
                this.f258927s = sbcAutoDispatchesFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new b(this.f258927s, this.f258926r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f258925q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    C7777a c7777a = new C7777a(this.f258927s);
                    this.f258925q = 1;
                    if (this.f258926r.ke(c7777a, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SbcAutoDispatchesFragment sbcAutoDispatchesFragment, com.avito.android.sbc.autodispatches.mvi.m mVar, Continuation continuation) {
            super(2, continuation);
            this.f258919r = mVar;
            this.f258920s = sbcAutoDispatchesFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f258920s, this.f258919r, continuation);
            aVar.f258918q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            T t12 = (T) this.f258918q;
            com.avito.android.sbc.autodispatches.mvi.m mVar = this.f258919r;
            SbcAutoDispatchesFragment sbcAutoDispatchesFragment = this.f258920s;
            C43259k.d(t12, null, null, new C7775a(sbcAutoDispatchesFragment, mVar, null), 3);
            C43259k.d(t12, null, null, new b(sbcAutoDispatchesFragment, mVar, null), 3);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(SbcAutoDispatchesFragment sbcAutoDispatchesFragment, com.avito.android.sbc.autodispatches.mvi.m mVar, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f258916r = sbcAutoDispatchesFragment;
        this.f258917s = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new k(this.f258916r, this.f258917s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((k) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f258915q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            com.avito.android.sbc.autodispatches.mvi.m mVar = this.f258917s;
            SbcAutoDispatchesFragment sbcAutoDispatchesFragment = this.f258916r;
            a aVar = new a(sbcAutoDispatchesFragment, mVar, null);
            this.f258915q = 1;
            if (C23056p0.b(sbcAutoDispatchesFragment, state, aVar, this) == coroutine_suspended) {
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
