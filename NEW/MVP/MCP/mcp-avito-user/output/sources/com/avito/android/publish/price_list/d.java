package com.avito.android.publish.price_list;

import android.content.Context;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.modal.a;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.publish.C0;
import com.avito.android.publish.PublishActivity;
import com.avito.android.publish.objects.InterfaceC33971t;
import com.avito.android.publish.objects.result.ObjectsFragmentResultImpl;
import com.avito.android.publish.price_list.SelectPriceListFragment;
import com.avito.android.publish.price_list.mvi.entity.e;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SelectPriceListFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.price_list.SelectPriceListFragment$observeEvents$1", f = "SelectPriceListFragment.kt", i = {}, l = {233}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class d extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f238419q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ SelectPriceListFragment f238420r;

    /* compiled from: SelectPriceListFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.price_list.SelectPriceListFragment$observeEvents$1$1", f = "SelectPriceListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f238421q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ SelectPriceListFragment f238422r;

        /* compiled from: SelectPriceListFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.publish.price_list.SelectPriceListFragment$observeEvents$1$1$1", f = "SelectPriceListFragment.kt", i = {}, l = {235}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.publish.price_list.d$a$a, reason: collision with other inner class name */
        public static final class C7164a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f238423q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ SelectPriceListFragment f238424r;

            /* compiled from: SelectPriceListFragment.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/e;", "event", "Lkotlin/G0;", "emit", "(Lcom/avito/android/publish/price_list/mvi/entity/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.publish.price_list.d$a$a$a, reason: collision with other inner class name */
            public static final class C7165a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SelectPriceListFragment f238425b;

                public C7165a(SelectPriceListFragment selectPriceListFragment) {
                    this.f238425b = selectPriceListFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    com.avito.android.publish.price_list.mvi.entity.e eVar = (com.avito.android.publish.price_list.mvi.entity.e) obj;
                    boolean z12 = eVar instanceof e.a;
                    SelectPriceListFragment selectPriceListFragment = this.f238425b;
                    if (z12) {
                        SelectPriceListFragment.a aVar = SelectPriceListFragment.f238386A0;
                        if (((Integer) selectPriceListFragment.f238390q0.getValue()) != null) {
                            C0 c02 = selectPriceListFragment.f238388o0;
                            (c02 != null ? c02 : null).ye();
                        } else {
                            com.avito.android.publish.objects.result.a aVar2 = selectPriceListFragment.f238395v0;
                            (aVar2 != null ? aVar2 : null).a(ObjectsFragmentResultImpl.ObjectsRequestKey.f238087d, ((e.a) eVar).f238835a.getId());
                            selectPriceListFragment.getParentFragmentManager().Y();
                        }
                    } else if (eVar instanceof e.C7175e) {
                        ActivityC22955m activityC22955mRequireActivity = selectPriceListFragment.requireActivity();
                        PublishActivity publishActivity = activityC22955mRequireActivity instanceof PublishActivity ? (PublishActivity) activityC22955mRequireActivity : null;
                        if (publishActivity != null) {
                            publishActivity.d2(null);
                        }
                    } else if (eVar instanceof e.b) {
                        z zVar = selectPriceListFragment.f238399z0;
                        if (zVar != null) {
                            Input.t(zVar.f238950l, null, false, 6);
                        }
                        InterfaceC33971t interfaceC33971t = selectPriceListFragment.f238394u0;
                        e.b bVar = (e.b) eVar;
                        (interfaceC33971t != null ? interfaceC33971t : null).a(bVar.f238836a.getId(), (12 & 2) != 0 ? null : null, (12 & 4) != 0 ? null : bVar.f238837b, (12 & 8) == 0, (12 & 16) != 0 ? false : false);
                    } else if (eVar instanceof e.c) {
                        z zVar2 = selectPriceListFragment.f238399z0;
                        if (zVar2 != null) {
                            Input.t(zVar2.f238950l, null, false, 6);
                        }
                        InterfaceC33971t interfaceC33971t2 = selectPriceListFragment.f238394u0;
                        e.c cVar = (e.c) eVar;
                        (interfaceC33971t2 != null ? interfaceC33971t2 : null).a(cVar.f238838a.getId(), (12 & 2) != 0 ? null : Boxing.boxInt(cVar.f238839b), (12 & 4) != 0 ? null : null, (12 & 8) == 0, (12 & 16) != 0 ? false : true);
                    } else if (eVar instanceof e.d) {
                        C0 c03 = selectPriceListFragment.f238388o0;
                        if (c03 == null) {
                            c03 = null;
                        }
                        c03.xe(null);
                    } else if (eVar instanceof e.f) {
                        z zVar3 = selectPriceListFragment.f238399z0;
                        if (zVar3 != null) {
                            zVar3.f238951m.A0(((e.f) eVar).f238842a);
                        }
                    } else if (eVar instanceof e.i) {
                        u3.l<SimpleTestGroupWithNone> lVar = selectPriceListFragment.f238397x0;
                        Q q12 = ((T) (lVar != null ? lVar : null).f439745a.f439749b).b() ? new Q(new androidx.appcompat.view.d(selectPriceListFragment.requireContext(), R.style.Theme_DesignSystem_Re23), Boxing.boxInt(R.style.PublishObjectModelStyle)) : new Q(selectPriceListFragment.requireContext(), Boxing.boxInt(R.style.Modal_Default));
                        Context context = (Context) q12.f406619b;
                        int iIntValue = ((Number) q12.f406620c).intValue();
                        a.C5284a c5284a = com.avito.android.lib.design.modal.a.f179704d;
                        c cVar2 = new c(eVar, context, selectPriceListFragment);
                        c5284a.getClass();
                        com.avito.android.lib.util.g.a(a.C5284a.a(context, 0, iIntValue, cVar2));
                    } else if (eVar instanceof e.g) {
                        com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, selectPriceListFragment, com.avito.android.printable_text.b.f(((e.g) eVar).f238843a), null, null, null, 0, ToastBarPosition.f181046d, 958);
                    } else if (eVar instanceof e.h) {
                        com.avito.android.component.toast.c cVar3 = com.avito.android.component.toast.c.f125244a;
                        PrintableText printableTextF = com.avito.android.printable_text.b.f(((e.h) eVar).f238844a);
                        f.c.f125255c.getClass();
                        com.avito.android.component.toast.c.c(cVar3, selectPriceListFragment, printableTextF, null, null, f.c.a.b(), 0, ToastBarPosition.f181046d, 942);
                    }
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7164a(SelectPriceListFragment selectPriceListFragment, Continuation<? super C7164a> continuation) {
                super(2, continuation);
                this.f238424r = selectPriceListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C7164a(this.f238424r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C7164a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f238423q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    SelectPriceListFragment selectPriceListFragment = this.f238424r;
                    InterfaceC43160i<com.avito.android.publish.price_list.mvi.entity.e> events = ((com.avito.android.publish.price_list.mvi.entity.c) selectPriceListFragment.f238389p0.getValue()).getEvents();
                    C7165a c7165a = new C7165a(selectPriceListFragment);
                    this.f238423q = 1;
                    if (events.collect(c7165a, this) == coroutine_suspended) {
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
        public a(SelectPriceListFragment selectPriceListFragment, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f238422r = selectPriceListFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f238422r, continuation);
            aVar.f238421q = obj;
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
            C43259k.d((T) this.f238421q, null, null, new C7164a(this.f238422r, null), 3);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SelectPriceListFragment selectPriceListFragment, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f238420r = selectPriceListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new d(this.f238420r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f238419q;
        if (i12 == 0) {
            C42729a0.b(obj);
            SelectPriceListFragment selectPriceListFragment = this.f238420r;
            InterfaceC22983P viewLifecycleOwner = selectPriceListFragment.getViewLifecycleOwner();
            Lifecycle.State state = Lifecycle.State.f46682e;
            a aVar = new a(selectPriceListFragment, null);
            this.f238419q = 1;
            if (C23056p0.b(viewLifecycleOwner, state, aVar, this) == coroutine_suspended) {
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
