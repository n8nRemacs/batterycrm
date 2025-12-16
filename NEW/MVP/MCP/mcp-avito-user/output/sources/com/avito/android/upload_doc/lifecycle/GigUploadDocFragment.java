package com.avito.android.upload_doc.lifecycle;

import Cd.C13243a;
import OG0.a;
import OG0.c;
import Y41.p;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.GigUploadDocScreen;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.GigUploadDocDeeplink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.upload_doc.helpers.h;
import com.avito.android.upload_doc.view.checkbox.GigUploadDocCheckboxItem;
import com.avito.android.upload_doc.view.document.GigUploadDocDocumentItem;
import com.avito.android.upload_doc.view.sections.GigUploadDocSectionsItem;
import java.util.List;
import javax.inject.Inject;
import kd0.C42670a;
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
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import z1.AbstractC50339a;

/* compiled from: GigUploadDocFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/upload_doc/lifecycle/GigUploadDocFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GigUploadDocFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public static final a f306812w0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.upload_doc.lifecycle.i f306813n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f306814o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f306815p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f306816q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public PhotoPickerIntentFactory f306817r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f306818s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.upload_doc.helpers.e f306819t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.upload_doc.helpers.c f306820u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.l
    public String f306821v0;

    /* compiled from: GigUploadDocFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/upload_doc/lifecycle/GigUploadDocFragment$a;", "", "<init>", "()V", "", "EXTRA_FLOW_TYPE", "Ljava/lang/String;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: GigUploadDocFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LOG0/a;", "action", "Lkotlin/G0;", "invoke", "(LOG0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<OG0.a, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(OG0.a aVar) {
            GigUploadDocFragment.q5(GigUploadDocFragment.this).accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: GigUploadDocFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.upload_doc.lifecycle.GigUploadDocFragment$onViewCreated$2", f = "GigUploadDocFragment.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f306823q;

        /* compiled from: GigUploadDocFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.upload_doc.lifecycle.GigUploadDocFragment$onViewCreated$2$1", f = "GigUploadDocFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f306825q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ GigUploadDocFragment f306826r;

            /* compiled from: GigUploadDocFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.upload_doc.lifecycle.GigUploadDocFragment$onViewCreated$2$1$1", f = "GigUploadDocFragment.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.upload_doc.lifecycle.GigUploadDocFragment$c$a$a, reason: collision with other inner class name */
            public static final class C9430a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f306827q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ GigUploadDocFragment f306828r;

                /* compiled from: GigUploadDocFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LOG0/d;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LOG0/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.upload_doc.lifecycle.GigUploadDocFragment$c$a$a$a, reason: collision with other inner class name */
                public static final class C9431a extends N implements Y41.l<OG0.d, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ GigUploadDocFragment f306829l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C9431a(GigUploadDocFragment gigUploadDocFragment) {
                        super(1);
                        this.f306829l = gigUploadDocFragment;
                    }

                    @Override // Y41.l
                    public final G0 invoke(OG0.d dVar) {
                        OG0.d dVar2 = dVar;
                        GigUploadDocFragment gigUploadDocFragment = this.f306829l;
                        com.avito.android.upload_doc.helpers.e eVar = gigUploadDocFragment.f306819t0;
                        if (eVar != null) {
                            eVar.a(dVar2);
                        }
                        String str = gigUploadDocFragment.f306821v0;
                        if (str != null) {
                            com.avito.android.upload_doc.helpers.i iVar = com.avito.android.upload_doc.helpers.i.f306810a;
                            List<GigUploadDocSectionsItem> list = dVar2.f12138d;
                            iVar.getClass();
                            GigUploadDocDocumentItem gigUploadDocDocumentItemA = com.avito.android.upload_doc.helpers.i.a(str, list);
                            if (gigUploadDocDocumentItemA != null) {
                                ((com.avito.android.upload_doc.lifecycle.h) gigUploadDocFragment.f306814o0.getValue()).accept(new a.j(gigUploadDocDocumentItemA));
                            }
                            gigUploadDocFragment.f306821v0 = null;
                        }
                        com.avito.android.upload_doc.helpers.c cVar = gigUploadDocFragment.f306820u0;
                        if (cVar != null) {
                            cVar.f306795d = new com.avito.android.upload_doc.lifecycle.b(dVar2, gigUploadDocFragment);
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C9430a(GigUploadDocFragment gigUploadDocFragment, Continuation<? super C9430a> continuation) {
                    super(2, continuation);
                    this.f306828r = gigUploadDocFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C9430a(this.f306828r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C9430a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f306827q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        GigUploadDocFragment gigUploadDocFragment = this.f306828r;
                        n2<OG0.d> state = ((com.avito.android.upload_doc.lifecycle.h) gigUploadDocFragment.f306814o0.getValue()).getState();
                        ScreenPerformanceTracker screenPerformanceTracker = gigUploadDocFragment.f306815p0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C9431a c9431a = new C9431a(gigUploadDocFragment);
                        this.f306827q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c9431a, this) == coroutine_suspended) {
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

            /* compiled from: GigUploadDocFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.upload_doc.lifecycle.GigUploadDocFragment$onViewCreated$2$1$2", f = "GigUploadDocFragment.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f306830q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ GigUploadDocFragment f306831r;

                /* compiled from: GigUploadDocFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.upload_doc.lifecycle.GigUploadDocFragment$c$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C9432a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ GigUploadDocFragment f306832b;

                    public C9432a(GigUploadDocFragment gigUploadDocFragment) {
                        this.f306832b = gigUploadDocFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        com.avito.android.upload_doc.lifecycle.g gVar;
                        OG0.c cVar = (OG0.c) obj;
                        a aVar = GigUploadDocFragment.f306812w0;
                        GigUploadDocFragment gigUploadDocFragment = this.f306832b;
                        if (cVar instanceof c.a) {
                            androidx.core.content.j jVarL1 = gigUploadDocFragment.l1();
                            gVar = jVarL1 instanceof com.avito.android.upload_doc.lifecycle.g ? (com.avito.android.upload_doc.lifecycle.g) jVarL1 : null;
                            if (gVar != null) {
                                gVar.y0();
                            }
                        } else if (cVar instanceof c.C0784c) {
                            com.avito.android.upload_doc.helpers.c cVar2 = gigUploadDocFragment.f306820u0;
                            if (cVar2 != null) {
                                c.C0784c c0784c = (c.C0784c) cVar;
                                cVar2.f306794c.b(new h.a(c0784c.f12132a, c0784c.f12133b));
                            }
                        } else if (cVar instanceof c.e) {
                            gigUploadDocFragment.f306821v0 = ((c.e) cVar).f12135a.f307011b;
                        } else if (cVar instanceof c.b) {
                            com.avito.android.deeplink_handler.handler.composite.a aVar2 = gigUploadDocFragment.f306818s0;
                            if (aVar2 == null) {
                                aVar2 = null;
                            }
                            b.a.a(aVar2, ((c.b) cVar).f12131a, null, null, 6);
                            androidx.core.content.j jVarL12 = gigUploadDocFragment.l1();
                            gVar = jVarL12 instanceof com.avito.android.upload_doc.lifecycle.g ? (com.avito.android.upload_doc.lifecycle.g) jVarL12 : null;
                            if (gVar != null) {
                                gVar.q0();
                            }
                        } else if (cVar instanceof c.d) {
                            com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, gigUploadDocFragment, com.avito.android.printable_text.b.f(gigUploadDocFragment.getResources().getString(R.string.gig_upload_error)), null, null, new f.c(new ApiError.UnknownError("GigUploadDocFragment - showError.", null, null, 6, null)), 0, null, ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
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
                        return new C42801a(2, this.f306832b, GigUploadDocFragment.class, "handleEvents", "handleEvents(Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(GigUploadDocFragment gigUploadDocFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f306831r = gigUploadDocFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f306831r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f306830q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        GigUploadDocFragment gigUploadDocFragment = this.f306831r;
                        InterfaceC43160i<OG0.c> events = ((com.avito.android.upload_doc.lifecycle.h) gigUploadDocFragment.f306814o0.getValue()).getEvents();
                        C9432a c9432a = new C9432a(gigUploadDocFragment);
                        this.f306830q = 1;
                        if (events.collect(c9432a, this) == coroutine_suspended) {
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
            public a(GigUploadDocFragment gigUploadDocFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f306826r = gigUploadDocFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f306826r, continuation);
                aVar.f306825q = obj;
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
                T t12 = (T) this.f306825q;
                GigUploadDocFragment gigUploadDocFragment = this.f306826r;
                C43259k.d(t12, null, null, new C9430a(gigUploadDocFragment, null), 3);
                C43259k.d(t12, null, null, new b(gigUploadDocFragment, null), 3);
                return G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return GigUploadDocFragment.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f306823q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46681d;
                GigUploadDocFragment gigUploadDocFragment = GigUploadDocFragment.this;
                a aVar = new a(gigUploadDocFragment, null);
                this.f306823q = 1;
                if (C23056p0.b(gigUploadDocFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: GigUploadDocFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<View> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f306833l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View view) {
            super(0);
            this.f306833l = view;
        }

        @Override // Y41.a
        public final View invoke() {
            return this.f306833l.findViewById(R.id.content_container);
        }
    }

    /* compiled from: GigUploadDocFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", BeduinCartItemModel.CHECKED_STRING, "Lcom/avito/android/upload_doc/view/checkbox/GigUploadDocCheckboxItem;", "item", "Lkotlin/G0;", "invoke", "(ZLcom/avito/android/upload_doc/view/checkbox/GigUploadDocCheckboxItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements p<Boolean, GigUploadDocCheckboxItem, G0> {
        public e() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(Boolean bool, GigUploadDocCheckboxItem gigUploadDocCheckboxItem) {
            GigUploadDocCheckboxItem gigUploadDocCheckboxItem2 = gigUploadDocCheckboxItem;
            ((com.avito.android.upload_doc.lifecycle.h) GigUploadDocFragment.this.f306814o0.getValue()).accept(bool.booleanValue() ? new a.C0783a(gigUploadDocCheckboxItem2) : new a.c(gigUploadDocCheckboxItem2));
            return G0.f406611a;
        }
    }

    /* compiled from: GigUploadDocFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/upload_doc/view/document/GigUploadDocDocumentItem;", "item", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/upload_doc/view/document/GigUploadDocDocumentItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<GigUploadDocDocumentItem, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(GigUploadDocDocumentItem gigUploadDocDocumentItem) {
            ((com.avito.android.upload_doc.lifecycle.h) GigUploadDocFragment.this.f306814o0.getValue()).accept(new a.e(gigUploadDocDocumentItem));
            return G0.f406611a;
        }
    }

    /* compiled from: GigUploadDocFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/upload_doc/view/document/GigUploadDocDocumentItem;", "item", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/upload_doc/view/document/GigUploadDocDocumentItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<GigUploadDocDocumentItem, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(GigUploadDocDocumentItem gigUploadDocDocumentItem) {
            ((com.avito.android.upload_doc.lifecycle.h) GigUploadDocFragment.this.f306814o0.getValue()).accept(new a.g(gigUploadDocDocumentItem));
            return G0.f406611a;
        }
    }

    /* compiled from: GigUploadDocFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/upload_doc/view/document/GigUploadDocDocumentItem;", "item", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/upload_doc/view/document/GigUploadDocDocumentItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.l<GigUploadDocDocumentItem, G0> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(GigUploadDocDocumentItem gigUploadDocDocumentItem) {
            GigUploadDocFragment.q5(GigUploadDocFragment.this).accept(new a.j(gigUploadDocDocumentItem));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f306838l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Y41.a aVar) {
            super(0);
            this.f306838l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f306838l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<Fragment> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return GigUploadDocFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ j f306840l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.f306840l = jVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f306840l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f306841l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f306841l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f306841l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f306842l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f306842l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f306842l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: GigUploadDocFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/upload_doc/lifecycle/h;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/upload_doc/lifecycle/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<com.avito.android.upload_doc.lifecycle.h> {
        public n() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.upload_doc.lifecycle.h invoke() {
            com.avito.android.upload_doc.lifecycle.i iVar = GigUploadDocFragment.this.f306813n0;
            if (iVar == null) {
                iVar = null;
            }
            return (com.avito.android.upload_doc.lifecycle.h) iVar.get();
        }
    }

    public GigUploadDocFragment() {
        super(R.layout.gig_upload_doc_fragment);
        i iVar = new i(new n());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new k(new j()));
        this.f306814o0 = new O0(m0.f406844a.b(com.avito.android.upload_doc.lifecycle.h.class), new l(interfaceC42726CB), iVar, new m(interfaceC42726CB));
    }

    public static final com.avito.android.upload_doc.lifecycle.h q5(GigUploadDocFragment gigUploadDocFragment) {
        return (com.avito.android.upload_doc.lifecycle.h) gigUploadDocFragment.f306814o0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f306815p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.items_list);
        C42670a c42670a = new C42670a((ViewGroup) view.findViewById(R.id.progress_root), new d(view), 0, 4, null);
        NavBar navBar = (NavBar) view.findViewById(R.id.navbar);
        Button button = (Button) view.findViewById(R.id.send_button);
        TextView textView = (TextView) view.findViewById(R.id.privacy_policy);
        com.avito.konveyor.adapter.d dVar = this.f306816q0;
        this.f306819t0 = new com.avito.android.upload_doc.helpers.e(navBar, button, textView, recyclerView, dVar != null ? dVar : null, c42670a, new b());
        PhotoPickerIntentFactory photoPickerIntentFactory = this.f306817r0;
        if (photoPickerIntentFactory == null) {
            photoPickerIntentFactory = null;
        }
        this.f306820u0 = new com.avito.android.upload_doc.helpers.c(this, photoPickerIntentFactory);
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new c(null), 3);
        ScreenPerformanceTracker screenPerformanceTracker = this.f306815p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.b(recyclerView);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f306815p0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(GigUploadDocScreen.f90363d, s.c(this), null, 4, null);
        Parcelable parcelable = requireArguments().getParcelable("EXTRA_FLOW_TYPE");
        GigUploadDocDeeplink.FlowType flowType = parcelable instanceof GigUploadDocDeeplink.FlowType ? (GigUploadDocDeeplink.FlowType) parcelable : null;
        if (flowType == null) {
            flowType = new GigUploadDocDeeplink.FlowType.Default("");
        }
        com.avito.android.upload_doc.di.a.a().a((com.avito.android.upload_doc.di.d) C29972i.a(C29972i.b(this), com.avito.android.upload_doc.di.d.class), cv.c.b(this), c28478k, getResources(), new e(), flowType, new f(), new g(), new h()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f306815p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f306815p0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, g5());
    }
}
