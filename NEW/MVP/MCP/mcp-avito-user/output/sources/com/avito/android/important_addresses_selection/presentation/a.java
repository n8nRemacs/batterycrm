package com.avito.android.important_addresses_selection.presentation;

import SM.b;
import Y41.l;
import Y41.p;
import Y61.k;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.important_addresses_selection.presentation.ImportantAddressesSelectionDialogFragment;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;

/* compiled from: ImportantAddressesSelectionDialogFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.important_addresses_selection.presentation.ImportantAddressesSelectionDialogFragment$onInflated$1$1", f = "ImportantAddressesSelectionDialogFragment.kt", i = {}, l = {140}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f169803q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ImportantAddressesSelectionDialogFragment f169804r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f169805s;

    /* compiled from: ImportantAddressesSelectionDialogFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.important_addresses_selection.presentation.ImportantAddressesSelectionDialogFragment$onInflated$1$1$1", f = "ImportantAddressesSelectionDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.important_addresses_selection.presentation.a$a, reason: collision with other inner class name */
    public static final class C5018a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f169806q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ ImportantAddressesSelectionDialogFragment f169807r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ d f169808s;

        /* compiled from: ImportantAddressesSelectionDialogFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.important_addresses_selection.presentation.ImportantAddressesSelectionDialogFragment$onInflated$1$1$1$1", f = "ImportantAddressesSelectionDialogFragment.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.important_addresses_selection.presentation.a$a$a, reason: collision with other inner class name */
        public static final class C5019a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f169809q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ ImportantAddressesSelectionDialogFragment f169810r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ d f169811s;

            /* compiled from: ImportantAddressesSelectionDialogFragment.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LSM/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LSM/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.important_addresses_selection.presentation.a$a$a$a, reason: collision with other inner class name */
            public static final class C5020a extends N implements l<SM.c, G0> {

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ d f169812l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C5020a(d dVar) {
                    super(1);
                    this.f169812l = dVar;
                }

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.List] */
                @Override // Y41.l
                public final G0 invoke(SM.c cVar) {
                    d dVar = this.f169812l;
                    dVar.f169816a.c(new UV0.c(cVar.f14931c.f14934b));
                    RecyclerView recyclerView = dVar.f169817b;
                    if (recyclerView.d0()) {
                        recyclerView.post(new com.avito.android.app.coldstart.d(dVar, 29));
                    } else {
                        RecyclerView.Adapter adapter = recyclerView.getAdapter();
                        if (adapter != null) {
                            adapter.notifyDataSetChanged();
                        }
                    }
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5019a(ImportantAddressesSelectionDialogFragment importantAddressesSelectionDialogFragment, d dVar, Continuation<? super C5019a> continuation) {
                super(2, continuation);
                this.f169810r = importantAddressesSelectionDialogFragment;
                this.f169811s = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                return new C5019a(this.f169810r, this.f169811s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C5019a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f169809q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    ImportantAddressesSelectionDialogFragment.a aVar = ImportantAddressesSelectionDialogFragment.f169783p0;
                    ImportantAddressesSelectionDialogFragment importantAddressesSelectionDialogFragment = this.f169810r;
                    n2<SM.c> state = ((com.avito.android.important_addresses_selection.presentation.mvi.l) importantAddressesSelectionDialogFragment.f169785i0.getValue()).getState();
                    ScreenPerformanceTracker screenPerformanceTracker = importantAddressesSelectionDialogFragment.f169786j0;
                    if (screenPerformanceTracker == null) {
                        screenPerformanceTracker = null;
                    }
                    C5020a c5020a = new C5020a(this.f169811s);
                    this.f169809q = 1;
                    if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c5020a, this) == coroutine_suspended) {
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

        /* compiled from: ImportantAddressesSelectionDialogFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.important_addresses_selection.presentation.ImportantAddressesSelectionDialogFragment$onInflated$1$1$1$2", f = "ImportantAddressesSelectionDialogFragment.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.important_addresses_selection.presentation.a$a$b */
        public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f169813q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ ImportantAddressesSelectionDialogFragment f169814r;

            /* compiled from: ImportantAddressesSelectionDialogFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.important_addresses_selection.presentation.a$a$b$a, reason: collision with other inner class name */
            public /* synthetic */ class C5021a implements InterfaceC43172j, D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ImportantAddressesSelectionDialogFragment f169815b;

                public C5021a(ImportantAddressesSelectionDialogFragment importantAddressesSelectionDialogFragment) {
                    this.f169815b = importantAddressesSelectionDialogFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    String str;
                    SM.b bVar = (SM.b) obj;
                    ImportantAddressesSelectionDialogFragment.a aVar = ImportantAddressesSelectionDialogFragment.f169783p0;
                    ImportantAddressesSelectionDialogFragment importantAddressesSelectionDialogFragment = this.f169815b;
                    importantAddressesSelectionDialogFragment.getClass();
                    if (bVar instanceof b.a) {
                        String tag = importantAddressesSelectionDialogFragment.getTag();
                        str = tag != null ? tag : "";
                        Bundle bundle = new Bundle(1);
                        bundle.putParcelable("key.important_addresses_data", ((b.a) bVar).f14922a);
                        G0 g02 = G0.f406611a;
                        importantAddressesSelectionDialogFragment.getParentFragmentManager().o0(bundle, str);
                        importantAddressesSelectionDialogFragment.dismiss();
                    } else if (bVar instanceof b.C1008b) {
                        importantAddressesSelectionDialogFragment.dismiss();
                    } else if (bVar instanceof b.c) {
                        String tag2 = importantAddressesSelectionDialogFragment.getTag();
                        str = tag2 != null ? tag2 : "";
                        Bundle bundle2 = new Bundle(1);
                        bundle2.putParcelable("key.important_addresses_redirect_deeplink", ((b.c) bVar).f14924a);
                        G0 g03 = G0.f406611a;
                        importantAddressesSelectionDialogFragment.getParentFragmentManager().o0(bundle2, str);
                        importantAddressesSelectionDialogFragment.dismiss();
                    } else if (bVar instanceof b.d) {
                        Button button = importantAddressesSelectionDialogFragment.f169791o0;
                        if (button != null) {
                            button.setLoading(false);
                        }
                        b.d dVar = (b.d) bVar;
                        com.avito.android.component.toast.c.d(com.avito.android.component.toast.c.f125244a, (com.avito.android.lib.design.bottom_sheet.d) importantAddressesSelectionDialogFragment.getDialog(), dVar.f14925a, null, dVar.f14926b, 0, dVar.f14927c, 942);
                    }
                    G0 g04 = G0.f406611a;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    return g04;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                        return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.D
                @k
                public final InterfaceC43072x<?> getFunctionDelegate() {
                    return new C42801a(2, this.f169815b, ImportantAddressesSelectionDialogFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/important_addresses_selection/presentation/mvi/entity/ImportantAddressesSelectionOneTimeEvent;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ImportantAddressesSelectionDialogFragment importantAddressesSelectionDialogFragment, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f169814r = importantAddressesSelectionDialogFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                return new b(this.f169814r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f169813q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    ImportantAddressesSelectionDialogFragment.a aVar = ImportantAddressesSelectionDialogFragment.f169783p0;
                    ImportantAddressesSelectionDialogFragment importantAddressesSelectionDialogFragment = this.f169814r;
                    InterfaceC43160i<SM.b> events = ((com.avito.android.important_addresses_selection.presentation.mvi.l) importantAddressesSelectionDialogFragment.f169785i0.getValue()).getEvents();
                    C5021a c5021a = new C5021a(importantAddressesSelectionDialogFragment);
                    this.f169813q = 1;
                    if (events.collect(c5021a, this) == coroutine_suspended) {
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
        public C5018a(ImportantAddressesSelectionDialogFragment importantAddressesSelectionDialogFragment, d dVar, Continuation<? super C5018a> continuation) {
            super(2, continuation);
            this.f169807r = importantAddressesSelectionDialogFragment;
            this.f169808s = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            C5018a c5018a = new C5018a(this.f169807r, this.f169808s, continuation);
            c5018a.f169806q = obj;
            return c5018a;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C5018a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            T t12 = (T) this.f169806q;
            d dVar = this.f169808s;
            ImportantAddressesSelectionDialogFragment importantAddressesSelectionDialogFragment = this.f169807r;
            C43259k.d(t12, null, null, new C5019a(importantAddressesSelectionDialogFragment, dVar, null), 3);
            C43259k.d(t12, null, null, new b(importantAddressesSelectionDialogFragment, null), 3);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ImportantAddressesSelectionDialogFragment importantAddressesSelectionDialogFragment, d dVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f169804r = importantAddressesSelectionDialogFragment;
        this.f169805s = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        return new a(this.f169804r, this.f169805s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f169803q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            d dVar = this.f169805s;
            ImportantAddressesSelectionDialogFragment importantAddressesSelectionDialogFragment = this.f169804r;
            C5018a c5018a = new C5018a(importantAddressesSelectionDialogFragment, dVar, null);
            this.f169803q = 1;
            if (C23056p0.b(importantAddressesSelectionDialogFragment, state, c5018a, this) == coroutine_suspended) {
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
