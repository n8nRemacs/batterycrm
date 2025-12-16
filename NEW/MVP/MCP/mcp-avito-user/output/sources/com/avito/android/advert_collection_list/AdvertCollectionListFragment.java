package com.avito.android.advert_collection_list;

import Q7.a;
import Q7.b;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.C22981N;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.C23060r0;
import androidx.view.C23069w;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.view.V0;
import com.avito.android.R;
import com.avito.android.account.E;
import com.avito.android.advert_collection_list.mvi.entity.AdvertCollectionListState;
import com.avito.android.advert_collection_list.u;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.conveyor_item.ParcelableItem;
import fv.C40482a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import kv.C43501a;
import z1.AbstractC50339a;

/* compiled from: AdvertCollectionListFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert_collection_list/AdvertCollectionListFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdvertCollectionListFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public r f81968n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f81969o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f81970p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public E f81971q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public u.a f81972r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f81973s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f81974t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public M7.a f81975u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public Class<?> f81976v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.l
    public t f81977w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.bottom_sheet.d f81978x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.bottom_sheet.d f81979y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final O0 f81980z0;

    /* compiled from: AdvertCollectionListFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.l<Q7.a, G0> {
        @Override // Y41.l
        public final G0 invoke(Q7.a aVar) {
            ((u) this.receiver).accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertCollectionListFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection_list.AdvertCollectionListFragment$onViewCreated$2", f = "AdvertCollectionListFragment.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f81981q;

        /* compiled from: AdvertCollectionListFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.advert_collection_list.AdvertCollectionListFragment$onViewCreated$2$1", f = "AdvertCollectionListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f81983q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ AdvertCollectionListFragment f81984r;

            /* compiled from: AdvertCollectionListFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.advert_collection_list.AdvertCollectionListFragment$onViewCreated$2$1$1", f = "AdvertCollectionListFragment.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.advert_collection_list.AdvertCollectionListFragment$b$a$a, reason: collision with other inner class name */
            public static final class C2429a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f81985q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ AdvertCollectionListFragment f81986r;

                /* compiled from: AdvertCollectionListFragment.kt */
                @s0
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.advert_collection_list.AdvertCollectionListFragment$b$a$a$a, reason: collision with other inner class name */
                public static final class C2430a extends N implements Y41.l<AdvertCollectionListState, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ AdvertCollectionListFragment f81987l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C2430a(AdvertCollectionListFragment advertCollectionListFragment) {
                        super(1);
                        this.f81987l = advertCollectionListFragment;
                    }

                    @Override // Y41.l
                    public final G0 invoke(AdvertCollectionListState advertCollectionListState) {
                        AdvertCollectionListState advertCollectionListState2 = advertCollectionListState;
                        AdvertCollectionListFragment advertCollectionListFragment = this.f81987l;
                        t tVar = advertCollectionListFragment.f81977w0;
                        if (tVar != null) {
                            r rVar = advertCollectionListFragment.f81968n0;
                            if (rVar == null) {
                                rVar = null;
                            }
                            rVar.getClass();
                            List<ParcelableItem> list = advertCollectionListState2.f82219b;
                            rVar.f82306c.c(new UV0.c(list));
                            D6.G(tVar.f82312e, list.isEmpty());
                            D6.G(tVar.f82311d, !list.isEmpty());
                            tVar.f82310c.setRefreshing(advertCollectionListState2.f82220c);
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2429a(AdvertCollectionListFragment advertCollectionListFragment, Continuation<? super C2429a> continuation) {
                    super(2, continuation);
                    this.f81986r = advertCollectionListFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C2429a(this.f81986r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C2429a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f81985q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        AdvertCollectionListFragment advertCollectionListFragment = this.f81986r;
                        n2<AdvertCollectionListState> state = advertCollectionListFragment.q5().getState();
                        ScreenPerformanceTracker screenPerformanceTracker = advertCollectionListFragment.f81973s0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C2430a c2430a = new C2430a(advertCollectionListFragment);
                        this.f81985q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c2430a, this) == coroutine_suspended) {
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

            /* compiled from: AdvertCollectionListFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.advert_collection_list.AdvertCollectionListFragment$onViewCreated$2$1$2", f = "AdvertCollectionListFragment.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.advert_collection_list.AdvertCollectionListFragment$b$a$b, reason: collision with other inner class name */
            public static final class C2431b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f81988q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ AdvertCollectionListFragment f81989r;

                /* compiled from: AdvertCollectionListFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.advert_collection_list.AdvertCollectionListFragment$b$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C2432a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AdvertCollectionListFragment f81990b;

                    public C2432a(AdvertCollectionListFragment advertCollectionListFragment) {
                        this.f81990b = advertCollectionListFragment;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v9, types: [T, com.avito.android.lib.design.toast_bar.k] */
                    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.internal.w] */
                    /* JADX WARN: Type inference failed for: r3v1, types: [M7.a] */
                    /* JADX WARN: Type inference failed for: r3v2 */
                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        RecyclerView recyclerView;
                        RecyclerView recyclerView2;
                        com.avito.android.component.toast.f fVarB;
                        Q7.b bVar = (Q7.b) obj;
                        AdvertCollectionListFragment advertCollectionListFragment = this.f81990b;
                        if (bVar instanceof b.C0889b) {
                            com.avito.android.deeplink_handler.handler.composite.a aVar = advertCollectionListFragment.f81970p0;
                            if (aVar == null) {
                                aVar = null;
                            }
                            b.C0889b c0889b = (b.C0889b) bVar;
                            b.a.a(aVar, c0889b.f13517a, c0889b.f13518b, null, 4);
                        } else if (bVar instanceof b.e) {
                            InterfaceC35845m2 interfaceC35845m2 = advertCollectionListFragment.f81969o0;
                            if (interfaceC35845m2 == null) {
                                interfaceC35845m2 = null;
                            }
                            Intent intentD = interfaceC35845m2.d(((b.e) bVar).f13522a, "");
                            InterfaceC35845m2 interfaceC35845m22 = advertCollectionListFragment.f81969o0;
                            if (interfaceC35845m22 == null) {
                                interfaceC35845m22 = null;
                            }
                            Class<?> cls = advertCollectionListFragment.f81976v0;
                            advertCollectionListFragment.startActivity(Intent.createChooser(intentD, advertCollectionListFragment.requireContext().getResources().getString(R.string.share), interfaceC35845m22.v(cls != null ? cls : null).getIntentSender()));
                        } else {
                            int i12 = 0;
                            int i13 = 2;
                            if (bVar instanceof b.d) {
                                b.d dVar = (b.d) bVar;
                                String str = dVar.f13520a;
                                com.avito.android.lib.design.bottom_sheet.d dVar2 = advertCollectionListFragment.f81979y0;
                                if (dVar2 != null) {
                                    dVar2.dismiss();
                                }
                                com.avito.android.lib.design.bottom_sheet.d dVar3 = new com.avito.android.lib.design.bottom_sheet.d(advertCollectionListFragment.requireContext(), i12, i13, );
                                com.avito.android.advert_collection_list.actions.b.c(new com.avito.android.advert_collection_list.c(advertCollectionListFragment), dVar3, str, dVar.f13521b);
                                com.avito.android.lib.util.g.a(dVar3);
                                advertCollectionListFragment.f81979y0 = dVar3;
                            } else if (bVar instanceof b.c) {
                                String str2 = ((b.c) bVar).f13519a;
                                com.avito.android.lib.design.bottom_sheet.d dVar4 = advertCollectionListFragment.f81978x0;
                                if (dVar4 != null) {
                                    dVar4.dismiss();
                                }
                                com.avito.android.lib.design.bottom_sheet.d dVar5 = new com.avito.android.lib.design.bottom_sheet.d(advertCollectionListFragment.requireContext(), i12, i13, );
                                S7.b.a(new com.avito.android.advert_collection_list.b(advertCollectionListFragment, str2), dVar5);
                                advertCollectionListFragment.f81978x0 = dVar5;
                                com.avito.android.lib.util.g.a(dVar5);
                            } else if (bVar instanceof b.i) {
                                b.i iVar = (b.i) bVar;
                                String str3 = iVar.f13527a;
                                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                                PrintableText printableTextF = com.avito.android.printable_text.b.f(str3);
                                boolean z12 = iVar.f13528b;
                                if (z12) {
                                    f.c.f125255c.getClass();
                                    fVarB = f.c.a.b();
                                } else {
                                    fVarB = f.a.f125253a;
                                }
                                com.avito.android.component.toast.c.c(cVar, advertCollectionListFragment, printableTextF, null, null, fVarB, 0, z12 ? ToastBarPosition.f181046d : ToastBarPosition.f181047e, 942);
                            } else if (bVar instanceof b.a) {
                                DeepLink deepLink = ((b.a) bVar).f13516a;
                                l0.h hVar = new l0.h();
                                hVar.f406842b = com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, advertCollectionListFragment, com.avito.android.printable_text.b.c(R.string.collection_created, new Serializable[0]), null, Collections.singletonList(new c.a.C3719a(androidx.core.content.d.getString(advertCollectionListFragment.requireContext(), R.string.proceed_action_button), false, null, new com.avito.android.advert_collection_list.a(advertCollectionListFragment, deepLink, hVar), 6, null)), f.a.f125253a, 0, ToastBarPosition.f181047e, 938);
                                t tVar = advertCollectionListFragment.f81977w0;
                                if (tVar != null && (recyclerView2 = tVar.f82309b) != null) {
                                    recyclerView2.A0(0);
                                }
                            } else if (bVar instanceof b.g) {
                                t tVar2 = advertCollectionListFragment.f81977w0;
                                if (tVar2 != null && (recyclerView = tVar2.f82309b) != null) {
                                    ((b.g) bVar).getClass();
                                    recyclerView.A0(0);
                                }
                            } else if (bVar instanceof b.h) {
                                InterfaceC28373a interfaceC28373a = advertCollectionListFragment.f81974t0;
                                if (interfaceC28373a == null) {
                                    interfaceC28373a = null;
                                }
                                b.h hVar2 = (b.h) bVar;
                                interfaceC28373a.c(new x(hVar2.f13524a, hVar2.f13526c));
                                M7.a aVar2 = advertCollectionListFragment.f81975u0;
                                (aVar2 != null ? aVar2 : null).c(hVar2.f13524a, hVar2.f13525b, "", true);
                            } else if (bVar instanceof b.f) {
                                M7.a aVar3 = advertCollectionListFragment.f81975u0;
                                (aVar3 != null ? aVar3 : 0).b(((b.f) bVar).f13523a);
                            }
                        }
                        G0 g02 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g02;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.D
                    @Y61.k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f81990b, AdvertCollectionListFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2431b(AdvertCollectionListFragment advertCollectionListFragment, Continuation<? super C2431b> continuation) {
                    super(2, continuation);
                    this.f81989r = advertCollectionListFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C2431b(this.f81989r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C2431b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f81988q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        AdvertCollectionListFragment advertCollectionListFragment = this.f81989r;
                        InterfaceC43160i<Q7.b> events = advertCollectionListFragment.q5().getEvents();
                        C2432a c2432a = new C2432a(advertCollectionListFragment);
                        this.f81988q = 1;
                        if (events.collect(c2432a, this) == coroutine_suspended) {
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
            public a(AdvertCollectionListFragment advertCollectionListFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f81984r = advertCollectionListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f81984r, continuation);
                aVar.f81983q = obj;
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
                T t12 = (T) this.f81983q;
                AdvertCollectionListFragment advertCollectionListFragment = this.f81984r;
                C43259k.d(t12, null, null, new C2429a(advertCollectionListFragment, null), 3);
                C43259k.d(t12, null, null, new C2431b(advertCollectionListFragment, null), 3);
                return G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return AdvertCollectionListFragment.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f81981q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46683f;
                AdvertCollectionListFragment advertCollectionListFragment = AdvertCollectionListFragment.this;
                a aVar = new a(advertCollectionListFragment, null);
                this.f81981q = 1;
                if (C23056p0.b(advertCollectionListFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: AdvertCollectionListFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "<anonymous>", "(Lkv/a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection_list.AdvertCollectionListFragment$onViewCreated$3", f = "AdvertCollectionListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<C43501a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f81991q;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = AdvertCollectionListFragment.this.new c(continuation);
            cVar.f81991q = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(C43501a c43501a, Continuation<? super G0> continuation) {
            return ((c) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            AdvertCollectionListFragment.this.q5().accept(new a.d((C43501a) this.f81991q));
            return G0.f406611a;
        }
    }

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/B", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f81994m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.l lVar) {
            super(0);
            this.f81994m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new Cd.r(AdvertCollectionListFragment.this, this.f81994m);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/v", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<Fragment> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return AdvertCollectionListFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/w", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f81996l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f81996l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f81996l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/x", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f81997l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f81997l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f81997l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f81998l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f81998l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f81998l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: AdvertCollectionListFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/advert_collection_list/u;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/advert_collection_list/u;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.l<C23060r0, u> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final u invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            u.a aVar = AdvertCollectionListFragment.this.f81972r0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    public AdvertCollectionListFragment() {
        super(R.layout.advert_collection_list_fragment);
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f81980z0 = new O0(m0.f406844a.b(u.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f81973s0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        t tVar = this.f81977w0;
        RecyclerView recyclerView = tVar != null ? tVar.f82309b : null;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
        this.f81977w0 = null;
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f81978x0;
        if (dVar != null) {
            dVar.dismiss();
        }
        this.f81978x0 = null;
        com.avito.android.lib.design.bottom_sheet.d dVar2 = this.f81979y0;
        if (dVar2 != null) {
            dVar2.dismiss();
        }
        this.f81979y0 = null;
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        q5().accept(a.g.f13514a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        E e12 = this.f81971q0;
        if (e12 == null) {
            e12 = null;
        }
        bundle.putString(ChannelContext.Item.USER_ID, e12.a());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        t tVar = new t(view);
        r rVar = this.f81968n0;
        if (rVar == null) {
            rVar = null;
        }
        a aVar = new a(1, q5(), u.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        tVar.f82309b.setAdapter(rVar.f82307d);
        SwipeRefreshLayout swipeRefreshLayout = tVar.f82310c;
        int[] iArrA = com.avito.android.lib.deprecated_design.c.a(swipeRefreshLayout.getContext(), false);
        swipeRefreshLayout.setColorSchemeColors(Arrays.copyOf(iArrA, iArrA.length));
        swipeRefreshLayout.setProgressBackgroundColorSchemeColor(C35835l0.d(R.attr.white, swipeRefreshLayout.getContext()));
        swipeRefreshLayout.g(0, C35835l0.f(R.attr.actionBarSize, swipeRefreshLayout.getContext()), true);
        swipeRefreshLayout.setOnRefreshListener(new AJ.b(2, aVar));
        InterfaceC22983P interfaceC22983PA = V0.a(view);
        if (interfaceC22983PA != null) {
            com.avito.android.advert_collection_list.adapter.advert_collection.d dVar = rVar.f82304a;
            C43197r1 c43197r1 = new C43197r1(new m(aVar, null), new C43152f0(dVar.getF82059e(), new l(3, null)));
            Lifecycle lifecycle = interfaceC22983PA.getLifecycle();
            Lifecycle.State state = Lifecycle.State.f46682e;
            C43175k.K(C23069w.a(c43197r1, lifecycle, state), C22981N.a(interfaceC22983PA.getLifecycle()));
            C43175k.K(C23069w.a(new C43197r1(new o(aVar, null), new C43152f0(dVar.getF82060f(), new n(3, null))), interfaceC22983PA.getLifecycle(), state), C22981N.a(interfaceC22983PA.getLifecycle()));
            C43175k.K(C23069w.a(new C43197r1(new q(aVar, null), new C43152f0(rVar.f82305b.b(), new p(3, null))), interfaceC22983PA.getLifecycle(), Lifecycle.State.f46683f), C22981N.a(interfaceC22983PA.getLifecycle()));
        }
        tVar.f82313f.setOnClickListener(new com.avito.android.advert.item.compatibility.v2.m(3, aVar));
        tVar.f82311d.setOnClickListener(new com.avito.android.advert.item.compatibility.v2.m(4, aVar));
        this.f81977w0 = tVar;
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new b(null), 3);
        com.avito.android.deeplink_handler.handler.composite.a aVar2 = this.f81970p0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        C43175k.K(new C43197r1(new c(null), C40482a.b(aVar2)), C22984Q.a(getViewLifecycleOwner()));
        ScreenPerformanceTracker screenPerformanceTracker = this.f81973s0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.advert_collection_list.di.m.a().a((com.avito.android.advert_collection_list.di.b) C29972i.a(C29972i.b(this), com.avito.android.advert_collection_list.di.b.class), cv.c.b(this), (InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class), com.avito.android.analytics.screens.s.c(this), bundle != null, bundle != null ? bundle.getString(ChannelContext.Item.USER_ID) : null).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f81973s0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    public final u q5() {
        return (u) this.f81980z0.getValue();
    }
}
