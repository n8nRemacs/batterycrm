package com.avito.android.messenger.channels.mvi.view;

import HY.c;
import HY.f;
import android.content.Context;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.C30277e1;
import com.avito.android.R;
import com.avito.android.component.toast.c;
import com.avito.android.messenger.channels.mvi.list_feature.o1;
import com.avito.android.messenger.channels.mvi.view.ChannelsListFragment;
import com.avito.android.mvi.e;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.L5;
import com.avito.android.util.X2;
import java.util.Collections;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelsListFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.view.ChannelsListFragment$bindChannelsListViewModel$1", f = "ChannelsListFragment.kt", i = {}, l = {256}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.messenger.channels.mvi.view.s, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C31889s extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f188799q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ChannelsListFragment f188800r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o1 f188801s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ H f188802t;

    /* compiled from: ChannelsListFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger.channels.mvi.view.ChannelsListFragment$bindChannelsListViewModel$1$1", f = "ChannelsListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.messenger.channels.mvi.view.s$a */
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f188803q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ o1 f188804r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ ChannelsListFragment f188805s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ H f188806t;

        /* compiled from: ChannelsListFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.messenger.channels.mvi.view.ChannelsListFragment$bindChannelsListViewModel$1$1$1", f = "ChannelsListFragment.kt", i = {}, l = {258}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.messenger.channels.mvi.view.s$a$a, reason: collision with other inner class name */
        public static final class C5558a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f188807q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ o1 f188808r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ ChannelsListFragment f188809s;

            /* compiled from: ChannelsListFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.messenger.channels.mvi.view.s$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C5559a implements InterfaceC43172j, kotlin.jvm.internal.D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ChannelsListFragment f188810b;

                public C5559a(ChannelsListFragment channelsListFragment) {
                    this.f188810b = channelsListFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    HY.f fVar = (HY.f) obj;
                    ChannelsListFragment.a aVar = ChannelsListFragment.f188628A0;
                    ChannelsListFragment channelsListFragment = this.f188810b;
                    if (fVar instanceof f.a) {
                        com.avito.android.messenger.channels.a aVar2 = channelsListFragment.f188639x0;
                        if (aVar2 == null) {
                            aVar2 = null;
                        }
                        f.a aVar3 = (f.a) fVar;
                        String str = aVar3.f7192a;
                        C30277e1 c30277e1 = channelsListFragment.f188636u0;
                        if (c30277e1 == null) {
                            c30277e1 = null;
                        }
                        c30277e1.getClass();
                        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[89];
                        aVar2.a(aVar3.f7193b, str, ((Boolean) c30277e1.f144966J0.a().invoke()).booleanValue() ? aVar3.f7194c : null);
                    } else if (fVar instanceof f.b) {
                        String strK0 = ((f.b) fVar).f7195a.k0(channelsListFragment.requireContext());
                        Context context = channelsListFragment.getContext();
                        if (context != null) {
                            L5.b(context, strK0, 0);
                        }
                    } else if (fVar instanceof f.c) {
                        com.avito.android.messenger.channels.mvi.interactor.z zVar = ((f.c) fVar).f7196a;
                        MessengerUserHashInfo messengerUserHashInfo = zVar.f187675a;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        long j12 = zVar.f187677c;
                        long j13 = jCurrentTimeMillis - j12;
                        int i12 = 5000 - ((int) j13);
                        if (jCurrentTimeMillis > j12 && j13 <= 5000 && i12 >= 3000) {
                            channelsListFragment.f188641z0 = com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, channelsListFragment, com.avito.android.printable_text.b.f(channelsListFragment.getString(R.string.messenger_locally_delete_chat_notice_message)), null, Collections.singletonList(new c.a.C3719a(channelsListFragment.getString(R.string.messenger_restore_locally_delete_chat), true, null, new E(channelsListFragment, messengerUserHashInfo, zVar.f187676b), 4, null)), null, i12, null, 986);
                        }
                    } else if (kotlin.jvm.internal.L.f(fVar, f.d.f7197a)) {
                        com.avito.android.messenger.channels.a aVar4 = channelsListFragment.f188639x0;
                        (aVar4 != null ? aVar4 : null).b();
                    }
                    G0 g02 = G0.f406611a;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    return g02;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if ((obj instanceof InterfaceC43172j) && (obj instanceof kotlin.jvm.internal.D)) {
                        return getFunctionDelegate().equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.D
                @Y61.k
                public final InterfaceC43072x<?> getFunctionDelegate() {
                    return new C42801a(2, this.f188810b, ChannelsListFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/messenger/channels/mvi/list_feature/entity/ChannelsListOneTimeEvent;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5558a(o1 o1Var, ChannelsListFragment channelsListFragment, Continuation<? super C5558a> continuation) {
                super(2, continuation);
                this.f188808r = o1Var;
                this.f188809s = channelsListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C5558a(this.f188808r, this.f188809s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
                return ((C5558a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f188807q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    C5559a c5559a = new C5559a(this.f188809s);
                    this.f188807q = 1;
                    if (this.f188808r.ke(c5559a, this) == coroutine_suspended) {
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

        /* compiled from: ChannelsListFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.messenger.channels.mvi.view.ChannelsListFragment$bindChannelsListViewModel$1$1$2", f = "ChannelsListFragment.kt", i = {}, l = {261}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.messenger.channels.mvi.view.s$a$b */
        public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f188811q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ o1 f188812r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ H f188813s;

            /* compiled from: ChannelsListFragment.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LHY/h;", VoiceInfo.STATE, "Lkotlin/G0;", "emit", "(LHY/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.messenger.channels.mvi.view.s$a$b$a, reason: collision with other inner class name */
            public static final class C5560a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ H f188814b;

                public C5560a(H h12) {
                    this.f188814b = h12;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    HY.h hVar = (HY.h) obj;
                    H h12 = this.f188814b;
                    h12.getClass();
                    e.a.a(h12, hVar);
                    X2.f318778a.g("ChannelsListFragment", "Rendered " + hVar);
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(o1 o1Var, H h12, Continuation continuation) {
                super(2, continuation);
                this.f188812r = o1Var;
                this.f188813s = h12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new b(this.f188812r, this.f188813s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f188811q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    C5560a c5560a = new C5560a(this.f188813s);
                    this.f188811q = 1;
                    if (this.f188812r.le(c5560a, this) == coroutine_suspended) {
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

        /* compiled from: ChannelsListFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.messenger.channels.mvi.view.ChannelsListFragment$bindChannelsListViewModel$1$1$3", f = "ChannelsListFragment.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.messenger.channels.mvi.view.s$a$c */
        public static final class c extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f188815q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ H f188816r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ o1 f188817s;

            /* compiled from: ChannelsListFragment.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "emit", "(Lkotlin/G0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.messenger.channels.mvi.view.s$a$c$a, reason: collision with other inner class name */
            public static final class C5561a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o1 f188818b;

                public C5561a(o1 o1Var) {
                    this.f188818b = o1Var;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    this.f188818b.accept(new c.e.b());
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(o1 o1Var, H h12, Continuation continuation) {
                super(2, continuation);
                this.f188816r = h12;
                this.f188817s = o1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new c(this.f188817s, this.f188816r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
                return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f188815q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    InterfaceC43160i interfaceC43160iA = kotlinx.coroutines.rx3.y.a(this.f188816r.f188653A);
                    C5561a c5561a = new C5561a(this.f188817s);
                    this.f188815q = 1;
                    if (((AbstractC43168f) interfaceC43160iA).collect(c5561a, this) == coroutine_suspended) {
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

        /* compiled from: ChannelsListFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.messenger.channels.mvi.view.ChannelsListFragment$bindChannelsListViewModel$1$1$4", f = "ChannelsListFragment.kt", i = {}, l = {276}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.messenger.channels.mvi.view.s$a$d */
        public static final class d extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f188819q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ H f188820r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ o1 f188821s;

            /* compiled from: ChannelsListFragment.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "emit", "(Lkotlin/G0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.messenger.channels.mvi.view.s$a$d$a, reason: collision with other inner class name */
            public static final class C5562a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o1 f188822b;

                public C5562a(o1 o1Var) {
                    this.f188822b = o1Var;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    c.e.f fVar = c.e.f.f7170a;
                    o1 o1Var = this.f188822b;
                    o1Var.accept(fVar);
                    o1Var.accept(c.e.d.f7168a);
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(o1 o1Var, H h12, Continuation continuation) {
                super(2, continuation);
                this.f188820r = h12;
                this.f188821s = o1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new d(this.f188821s, this.f188820r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
                return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f188819q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    InterfaceC43160i interfaceC43160iA = kotlinx.coroutines.rx3.y.a(this.f188820r.f188654B);
                    C5562a c5562a = new C5562a(this.f188821s);
                    this.f188819q = 1;
                    if (((AbstractC43168f) interfaceC43160iA).collect(c5562a, this) == coroutine_suspended) {
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

        /* compiled from: ChannelsListFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.messenger.channels.mvi.view.ChannelsListFragment$bindChannelsListViewModel$1$1$5", f = "ChannelsListFragment.kt", i = {}, l = {284}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.messenger.channels.mvi.view.s$a$e */
        public static final class e extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f188823q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ H f188824r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ o1 f188825s;

            /* compiled from: ChannelsListFragment.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LHY/c;", "action", "Lkotlin/G0;", "emit", "(LHY/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.messenger.channels.mvi.view.s$a$e$a, reason: collision with other inner class name */
            public static final class C5563a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o1 f188826b;

                public C5563a(o1 o1Var) {
                    this.f188826b = o1Var;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    this.f188826b.accept((HY.c) obj);
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(o1 o1Var, H h12, Continuation continuation) {
                super(2, continuation);
                this.f188824r = h12;
                this.f188825s = o1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new e(this.f188825s, this.f188824r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
                return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f188823q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    InterfaceC43160i interfaceC43160iA = kotlinx.coroutines.rx3.y.a(this.f188824r.f188656D);
                    C5563a c5563a = new C5563a(this.f188825s);
                    this.f188823q = 1;
                    if (((AbstractC43168f) interfaceC43160iA).collect(c5563a, this) == coroutine_suspended) {
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

        /* compiled from: ChannelsListFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.messenger.channels.mvi.view.ChannelsListFragment$bindChannelsListViewModel$1$1$6", f = "ChannelsListFragment.kt", i = {}, l = {291}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.messenger.channels.mvi.view.s$a$f */
        public static final class f extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f188827q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ H f188828r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ o1 f188829s;

            /* compiled from: ChannelsListFragment.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "emit", "(Lkotlin/G0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.messenger.channels.mvi.view.s$a$f$a, reason: collision with other inner class name */
            public static final class C5564a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o1 f188830b;

                public C5564a(o1 o1Var) {
                    this.f188830b = o1Var;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    this.f188830b.accept(c.e.d.f7168a);
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(o1 o1Var, H h12, Continuation continuation) {
                super(2, continuation);
                this.f188828r = h12;
                this.f188829s = o1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new f(this.f188829s, this.f188828r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
                return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f188827q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    InterfaceC43160i interfaceC43160iA = kotlinx.coroutines.rx3.y.a(this.f188828r.f188655C);
                    C5564a c5564a = new C5564a(this.f188829s);
                    this.f188827q = 1;
                    if (((AbstractC43168f) interfaceC43160iA).collect(c5564a, this) == coroutine_suspended) {
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

        /* compiled from: ChannelsListFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.messenger.channels.mvi.view.ChannelsListFragment$bindChannelsListViewModel$1$1$7", f = "ChannelsListFragment.kt", i = {}, l = {298}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.messenger.channels.mvi.view.s$a$g */
        public static final class g extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f188831q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ H f188832r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ o1 f188833s;

            /* compiled from: ChannelsListFragment.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "emit", "(Lkotlin/G0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.messenger.channels.mvi.view.s$a$g$a, reason: collision with other inner class name */
            public static final class C5565a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o1 f188834b;

                public C5565a(o1 o1Var) {
                    this.f188834b = o1Var;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    this.f188834b.accept(c.e.C0414c.f7167a);
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(o1 o1Var, H h12, Continuation continuation) {
                super(2, continuation);
                this.f188832r = h12;
                this.f188833s = o1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new g(this.f188833s, this.f188832r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
                return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.C] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f188831q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    InterfaceC43160i interfaceC43160iA = kotlinx.coroutines.rx3.y.a((io.reactivex.rxjava3.core.z) this.f188832r.f188686y.getValue());
                    C5565a c5565a = new C5565a(this.f188833s);
                    this.f188831q = 1;
                    if (((AbstractC43168f) interfaceC43160iA).collect(c5565a, this) == coroutine_suspended) {
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

        /* compiled from: ChannelsListFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.messenger.channels.mvi.view.ChannelsListFragment$bindChannelsListViewModel$1$1$8", f = "ChannelsListFragment.kt", i = {}, l = {305}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.messenger.channels.mvi.view.s$a$h */
        public static final class h extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f188835q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ H f188836r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ o1 f188837s;

            /* compiled from: ChannelsListFragment.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "emit", "(Lkotlin/G0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.messenger.channels.mvi.view.s$a$h$a, reason: collision with other inner class name */
            public static final class C5566a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o1 f188838b;

                public C5566a(o1 o1Var) {
                    this.f188838b = o1Var;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    this.f188838b.accept(c.b.g.f7154a);
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(o1 o1Var, H h12, Continuation continuation) {
                super(2, continuation);
                this.f188836r = h12;
                this.f188837s = o1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new h(this.f188837s, this.f188836r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
                return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f188835q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    InterfaceC43160i interfaceC43160iA = kotlinx.coroutines.rx3.y.a(this.f188836r.f188685x);
                    C5566a c5566a = new C5566a(this.f188837s);
                    this.f188835q = 1;
                    if (((AbstractC43168f) interfaceC43160iA).collect(c5566a, this) == coroutine_suspended) {
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
        public a(o1 o1Var, ChannelsListFragment channelsListFragment, H h12, Continuation continuation) {
            super(2, continuation);
            this.f188804r = o1Var;
            this.f188805s = channelsListFragment;
            this.f188806t = h12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f188804r, this.f188805s, this.f188806t, continuation);
            aVar.f188803q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f188803q;
            ChannelsListFragment channelsListFragment = this.f188805s;
            o1 o1Var = this.f188804r;
            C43259k.d(t12, null, null, new C5558a(o1Var, channelsListFragment, null), 3);
            H h12 = this.f188806t;
            C43259k.d(t12, null, null, new b(o1Var, h12, null), 3);
            C43259k.d(t12, null, null, new c(o1Var, h12, null), 3);
            C43259k.d(t12, null, null, new d(o1Var, h12, null), 3);
            C43259k.d(t12, null, null, new e(o1Var, h12, null), 3);
            C43259k.d(t12, null, null, new f(o1Var, h12, null), 3);
            C43259k.d(t12, null, null, new g(o1Var, h12, null), 3);
            C43259k.d(t12, null, null, new h(o1Var, h12, null), 3);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31889s(o1 o1Var, ChannelsListFragment channelsListFragment, H h12, Continuation continuation) {
        super(2, continuation);
        this.f188800r = channelsListFragment;
        this.f188801s = o1Var;
        this.f188802t = h12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C31889s(this.f188801s, this.f188800r, this.f188802t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C31889s) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f188799q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46683f;
            o1 o1Var = this.f188801s;
            ChannelsListFragment channelsListFragment = this.f188800r;
            a aVar = new a(o1Var, channelsListFragment, this.f188802t, null);
            this.f188799q = 1;
            if (C23056p0.b(channelsListFragment, state, aVar, this) == coroutine_suspended) {
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
