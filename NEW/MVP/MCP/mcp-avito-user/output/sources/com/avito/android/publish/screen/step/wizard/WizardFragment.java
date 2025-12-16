package com.avito.android.publish.screen.step.wizard;

import Cd.r;
import Pe0.InterfaceC14777a;
import Pe0.InterfaceC14779c;
import Y41.p;
import Zd.InterfaceC19542a;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.C23060r0;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC23487e;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.adjust.sdk.Constants;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.blueprints.publish.wizard.WizardItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.publish.C0;
import com.avito.android.publish.C33862g0;
import com.avito.android.publish.screen.step.wizard.c;
import com.avito.android.publish.screen.step.wizard.mvi.entity.WizardState;
import com.avito.android.publish.view.result_handler.PublishResultReceiverFragment;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.C35966w1;
import io.reactivex.rxjava3.core.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.rx3.y;
import z1.AbstractC50339a;

/* compiled from: WizardFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0007\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/publish/screen/step/wizard/WizardFragment;", "Lcom/avito/android/publish/view/result_handler/PublishResultReceiverFragment;", "Lcom/avito/android/ui/fragments/c;", "LId0/e;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "b", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class WizardFragment extends PublishResultReceiverFragment implements com.avito.android.ui.fragments.c, Id0.e, InterfaceC28477j.a {

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public static final b f242389y0 = new b(null);

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public c.a f242390o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public final O0 f242391p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public InterfaceC19542a f242392q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f242393r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public C0 f242394s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f242395t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f242396u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f242397v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f242398w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.publish.screen.step.wizard.b f242399x0;

    /* compiled from: WizardFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/wizard/WizardFragment$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.progress_overlay.l f242400a;

        public a(@Y61.k FrameLayout frameLayout, @Y61.k RecyclerView recyclerView, @Y61.k com.avito.android.progress_overlay.l lVar, @Y61.k C33862g0 c33862g0) {
            this.f242400a = lVar;
        }
    }

    /* compiled from: WizardFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/publish/screen/step/wizard/WizardFragment$b;", "", "<init>", "()V", "", "ARGS_LEAVES", "Ljava/lang/String;", "ARGS_NAVIGATION", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* compiled from: WizardFragment.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Navigation f242401l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ List<Navigation> f242402m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Navigation navigation2, List<Navigation> list) {
                super(1);
                this.f242401l = navigation2;
                this.f242402m = list;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                Bundle bundle2 = bundle;
                bundle2.putParcelable("args.navigation", this.f242401l);
                List<Navigation> list = this.f242402m;
                if (list != null) {
                    bundle2.putParcelableArrayList("args.leaves", new ArrayList<>(list));
                }
                return G0.f406611a;
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static WizardFragment a(@Y61.k Navigation navigation2, @Y61.l List list) {
            WizardFragment wizardFragment = new WizardFragment();
            C35966w1.a(wizardFragment, -1, new a(navigation2, list));
            return wizardFragment;
        }

        public b() {
        }
    }

    /* compiled from: WizardFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            b bVar = WizardFragment.f242389y0;
            WizardFragment.this.r5().accept(InterfaceC14777a.e.f13194a);
            return G0.f406611a;
        }
    }

    /* compiled from: WizardFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            b bVar = WizardFragment.f242389y0;
            WizardFragment.this.r5().accept(InterfaceC14777a.b.f13191a);
            return G0.f406611a;
        }
    }

    /* compiled from: WizardFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            b bVar = WizardFragment.f242389y0;
            WizardFragment.this.r5().accept(InterfaceC14777a.C0853a.f13190a);
            return G0.f406611a;
        }
    }

    /* compiled from: WizardFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.screen.step.wizard.WizardFragment$onViewCreated$4", f = "WizardFragment.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f242406q;

        /* compiled from: WizardFragment.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.publish.screen.step.wizard.WizardFragment$onViewCreated$4$1", f = "WizardFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f242408q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ WizardFragment f242409r;

            /* compiled from: WizardFragment.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.publish.screen.step.wizard.WizardFragment$onViewCreated$4$1$1", f = "WizardFragment.kt", i = {}, l = {157}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.publish.screen.step.wizard.WizardFragment$f$a$a, reason: collision with other inner class name */
            public static final class C7263a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f242410q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ com.avito.android.blueprints.publish.wizard.d f242411r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ com.avito.android.blueprints.publish.checkable.d f242412s;

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ WizardFragment f242413t;

                /* compiled from: WizardFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "navigationId", "Lkotlin/G0;", "emit", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.publish.screen.step.wizard.WizardFragment$f$a$a$a, reason: collision with other inner class name */
                public static final class C7264a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ WizardFragment f242414b;

                    public C7264a(WizardFragment wizardFragment) {
                        this.f242414b = wizardFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        b bVar = WizardFragment.f242389y0;
                        this.f242414b.r5().accept(new InterfaceC14777a.d((String) obj));
                        return G0.f406611a;
                    }
                }

                /* compiled from: SafeCollector.common.kt */
                @s0
                @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.publish.screen.step.wizard.WizardFragment$f$a$a$b */
                public static final class b implements InterfaceC43160i<String> {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ InterfaceC43160i f242415b;

                    /* compiled from: Emitters.kt */
                    @s0
                    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.avito.android.publish.screen.step.wizard.WizardFragment$f$a$a$b$a, reason: collision with other inner class name */
                    public static final class C7265a<T> implements InterfaceC43172j {

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ InterfaceC43172j f242416b;

                        /* compiled from: Emitters.kt */
                        @s0
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @DebugMetadata(c = "com.avito.android.publish.screen.step.wizard.WizardFragment$onViewCreated$4$1$1$invokeSuspend$$inlined$map$1$2", f = "WizardFragment.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        /* renamed from: com.avito.android.publish.screen.step.wizard.WizardFragment$f$a$a$b$a$a, reason: collision with other inner class name */
                        public static final class C7266a extends ContinuationImpl {

                            /* renamed from: q, reason: collision with root package name */
                            public /* synthetic */ Object f242417q;

                            /* renamed from: r, reason: collision with root package name */
                            public int f242418r;

                            public C7266a(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Y61.l
                            public final Object invokeSuspend(@Y61.k Object obj) {
                                this.f242417q = obj;
                                this.f242418r |= BeduinInputModel.MIN_TEXT_VERSION;
                                return C7265a.this.emit(null, this);
                            }
                        }

                        public C7265a(InterfaceC43172j interfaceC43172j) {
                            this.f242416b = interfaceC43172j;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.InterfaceC43172j
                        @Y61.l
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof com.avito.android.publish.screen.step.wizard.WizardFragment.f.a.C7263a.b.C7265a.C7266a
                                if (r0 == 0) goto L13
                                r0 = r6
                                com.avito.android.publish.screen.step.wizard.WizardFragment$f$a$a$b$a$a r0 = (com.avito.android.publish.screen.step.wizard.WizardFragment.f.a.C7263a.b.C7265a.C7266a) r0
                                int r1 = r0.f242418r
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.f242418r = r1
                                goto L18
                            L13:
                                com.avito.android.publish.screen.step.wizard.WizardFragment$f$a$a$b$a$a r0 = new com.avito.android.publish.screen.step.wizard.WizardFragment$f$a$a$b$a$a
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.f242417q
                                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r2 = r0.f242418r
                                r3 = 1
                                if (r2 == 0) goto L31
                                if (r2 != r3) goto L29
                                kotlin.C42729a0.b(r6)
                                goto L43
                            L29:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L31:
                                kotlin.C42729a0.b(r6)
                                com.avito.android.blueprints.publish.wizard.WizardItem r5 = (com.avito.android.blueprints.publish.wizard.WizardItem) r5
                                java.lang.String r5 = r5.f106500f
                                r0.f242418r = r3
                                kotlinx.coroutines.flow.j r6 = r4.f242416b
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L43
                                return r1
                            L43:
                                kotlin.G0 r5 = kotlin.G0.f406611a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.screen.step.wizard.WizardFragment.f.a.C7263a.b.C7265a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    public b(InterfaceC43160i interfaceC43160i) {
                        this.f242415b = interfaceC43160i;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43160i
                    @Y61.l
                    public final Object collect(@Y61.k InterfaceC43172j<? super String> interfaceC43172j, @Y61.k Continuation continuation) {
                        Object objCollect = ((AbstractC43168f) this.f242415b).collect(new C7265a(interfaceC43172j), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C7263a(com.avito.android.blueprints.publish.wizard.d dVar, com.avito.android.blueprints.publish.checkable.d dVar2, WizardFragment wizardFragment, Continuation<? super C7263a> continuation) {
                    super(2, continuation);
                    this.f242411r = dVar;
                    this.f242412s = dVar2;
                    this.f242413t = wizardFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C7263a(this.f242411r, this.f242412s, this.f242413t, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C7263a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    z<String> zVarD;
                    z<WizardItem> zVarD2;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f242410q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        com.avito.android.blueprints.publish.wizard.d dVar = this.f242411r;
                        InterfaceC43160i interfaceC43160iW = (dVar == null || (zVarD2 = dVar.d()) == null) ? C43175k.w() : new b(y.a(zVarD2));
                        com.avito.android.blueprints.publish.checkable.d dVar2 = this.f242412s;
                        kotlinx.coroutines.flow.internal.m mVarN = C43175k.N(interfaceC43160iW, (dVar2 == null || (zVarD = dVar2.d()) == null) ? C43175k.w() : y.a(zVarD));
                        C7264a c7264a = new C7264a(this.f242413t);
                        this.f242410q = 1;
                        if (mVarN.collect(c7264a, this) == coroutine_suspended) {
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

            /* compiled from: WizardFragment.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.publish.screen.step.wizard.WizardFragment$onViewCreated$4$1$2", f = "WizardFragment.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f242420q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ com.avito.android.blueprints.publish.checkable.d f242421r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ WizardFragment f242422s;

                /* compiled from: WizardFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lkotlin/G0;", "emit", "(Lcom/avito/android/deep_linking/links/DeepLink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.publish.screen.step.wizard.WizardFragment$f$a$b$a, reason: collision with other inner class name */
                public static final class C7267a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ WizardFragment f242423b;

                    public C7267a(WizardFragment wizardFragment) {
                        this.f242423b = wizardFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        b bVar = WizardFragment.f242389y0;
                        this.f242423b.r5().accept(new InterfaceC14777a.c((DeepLink) obj));
                        return G0.f406611a;
                    }
                }

                /* compiled from: SafeCollector.common.kt */
                @s0
                @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.publish.screen.step.wizard.WizardFragment$f$a$b$b, reason: collision with other inner class name */
                public static final class C7268b implements InterfaceC43160i<DeepLink> {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ InterfaceC43160i f242424b;

                    /* compiled from: Emitters.kt */
                    @s0
                    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.avito.android.publish.screen.step.wizard.WizardFragment$f$a$b$b$a, reason: collision with other inner class name */
                    public static final class C7269a<T> implements InterfaceC43172j {

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ InterfaceC43172j f242425b;

                        /* compiled from: Emitters.kt */
                        @s0
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @DebugMetadata(c = "com.avito.android.publish.screen.step.wizard.WizardFragment$onViewCreated$4$1$2$invokeSuspend$$inlined$map$1$2", f = "WizardFragment.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        /* renamed from: com.avito.android.publish.screen.step.wizard.WizardFragment$f$a$b$b$a$a, reason: collision with other inner class name */
                        public static final class C7270a extends ContinuationImpl {

                            /* renamed from: q, reason: collision with root package name */
                            public /* synthetic */ Object f242426q;

                            /* renamed from: r, reason: collision with root package name */
                            public int f242427r;

                            public C7270a(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Y61.l
                            public final Object invokeSuspend(@Y61.k Object obj) {
                                this.f242426q = obj;
                                this.f242427r |= BeduinInputModel.MIN_TEXT_VERSION;
                                return C7269a.this.emit(null, this);
                            }
                        }

                        public C7269a(InterfaceC43172j interfaceC43172j) {
                            this.f242425b = interfaceC43172j;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.InterfaceC43172j
                        @Y61.l
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof com.avito.android.publish.screen.step.wizard.WizardFragment.f.a.b.C7268b.C7269a.C7270a
                                if (r0 == 0) goto L13
                                r0 = r6
                                com.avito.android.publish.screen.step.wizard.WizardFragment$f$a$b$b$a$a r0 = (com.avito.android.publish.screen.step.wizard.WizardFragment.f.a.b.C7268b.C7269a.C7270a) r0
                                int r1 = r0.f242427r
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.f242427r = r1
                                goto L18
                            L13:
                                com.avito.android.publish.screen.step.wizard.WizardFragment$f$a$b$b$a$a r0 = new com.avito.android.publish.screen.step.wizard.WizardFragment$f$a$b$b$a$a
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.f242426q
                                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r2 = r0.f242427r
                                r3 = 1
                                if (r2 == 0) goto L31
                                if (r2 != r3) goto L29
                                kotlin.C42729a0.b(r6)
                                goto L45
                            L29:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L31:
                                kotlin.C42729a0.b(r6)
                                kotlin.Q r5 = (kotlin.Q) r5
                                B r5 = r5.f406620c
                                com.avito.android.deep_linking.links.DeepLink r5 = (com.avito.android.deep_linking.links.DeepLink) r5
                                r0.f242427r = r3
                                kotlinx.coroutines.flow.j r6 = r4.f242425b
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L45
                                return r1
                            L45:
                                kotlin.G0 r5 = kotlin.G0.f406611a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.screen.step.wizard.WizardFragment.f.a.b.C7268b.C7269a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    public C7268b(InterfaceC43160i interfaceC43160i) {
                        this.f242424b = interfaceC43160i;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43160i
                    @Y61.l
                    public final Object collect(@Y61.k InterfaceC43172j<? super DeepLink> interfaceC43172j, @Y61.k Continuation continuation) {
                        Object objCollect = ((AbstractC43168f) this.f242424b).collect(new C7269a(interfaceC43172j), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(com.avito.android.blueprints.publish.checkable.d dVar, WizardFragment wizardFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f242421r = dVar;
                    this.f242422s = wizardFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f242421r, this.f242422s, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    com.jakewharton.rxrelay3.c f106098e;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f242420q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        com.avito.android.blueprints.publish.checkable.d dVar = this.f242421r;
                        if (dVar != null && (f106098e = dVar.getF106098e()) != null) {
                            C7268b c7268b = new C7268b(y.a(f106098e));
                            C7267a c7267a = new C7267a(this.f242422s);
                            this.f242420q = 1;
                            if (c7268b.collect(c7267a, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
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
            public a(WizardFragment wizardFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f242409r = wizardFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f242409r, continuation);
                aVar.f242408q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object next;
                Object next2;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f242408q;
                WizardFragment wizardFragment = this.f242409r;
                Set<TV0.d<?, ?>> set = wizardFragment.f242397v0;
                if (set == null) {
                    set = null;
                }
                Iterator<T> it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (next instanceof com.avito.android.blueprints.publish.wizard.d) {
                        break;
                    }
                }
                if (!(next instanceof com.avito.android.blueprints.publish.wizard.d)) {
                    next = null;
                }
                com.avito.android.blueprints.publish.wizard.d dVar = (com.avito.android.blueprints.publish.wizard.d) next;
                Set<TV0.d<?, ?>> set2 = wizardFragment.f242397v0;
                if (set2 == null) {
                    set2 = null;
                }
                Iterator<T> it2 = set2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    if (next2 instanceof com.avito.android.blueprints.publish.checkable.d) {
                        break;
                    }
                }
                if (!(next2 instanceof com.avito.android.blueprints.publish.checkable.d)) {
                    next2 = null;
                }
                com.avito.android.blueprints.publish.checkable.d dVar2 = (com.avito.android.blueprints.publish.checkable.d) next2;
                C43259k.d(t12, null, null, new C7263a(dVar, dVar2, wizardFragment, null), 3);
                C43259k.d(t12, null, null, new b(dVar2, wizardFragment, null), 3);
                return G0.f406611a;
            }
        }

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return WizardFragment.this.new f(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f242406q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                WizardFragment wizardFragment = WizardFragment.this;
                a aVar = new a(wizardFragment, null);
                this.f242406q = 1;
                if (C23056p0.b(wizardFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: WizardFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class g extends C42801a implements Y41.l<InterfaceC14779c, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC14779c interfaceC14779c) {
            InterfaceC14779c interfaceC14779c2 = interfaceC14779c;
            WizardFragment wizardFragment = (WizardFragment) this.receiver;
            b bVar = WizardFragment.f242389y0;
            wizardFragment.getClass();
            if (interfaceC14779c2 instanceof InterfaceC14779c.b) {
                com.avito.android.publish.screen.step.wizard.b bVar2 = wizardFragment.f242399x0;
                if (bVar2 != null) {
                    bVar2.Z2();
                    G0 g02 = G0.f406611a;
                }
            } else if (interfaceC14779c2 instanceof InterfaceC14779c.C0855c) {
                com.avito.android.publish.screen.step.wizard.b bVar3 = wizardFragment.f242399x0;
                if (bVar3 != null) {
                    bVar3.Q0();
                    G0 g03 = G0.f406611a;
                }
            } else if (interfaceC14779c2 instanceof InterfaceC14779c.e) {
                com.avito.android.publish.screen.step.wizard.b bVar4 = wizardFragment.f242399x0;
                if (bVar4 != null) {
                    InterfaceC14779c.e eVar = (InterfaceC14779c.e) interfaceC14779c2;
                    bVar4.J3(eVar.f13207a, eVar.f13208b);
                    G0 g04 = G0.f406611a;
                }
            } else {
                if (interfaceC14779c2 instanceof InterfaceC14779c.a) {
                    ((InterfaceC14779c.a) interfaceC14779c2).getClass();
                    wizardFragment.onActivityResult(0, 0, null);
                    G0 g05 = G0.f406611a;
                } else if (interfaceC14779c2 instanceof InterfaceC14779c.d) {
                    com.avito.android.deeplink_handler.handler.composite.a aVar = wizardFragment.f242398w0;
                    if (aVar == null) {
                        aVar = null;
                    }
                    b.a.a(aVar, ((InterfaceC14779c.d) interfaceC14779c2).f13206a, null, null, 6);
                    G0 g06 = G0.f406611a;
                } else {
                    if (!(interfaceC14779c2 instanceof InterfaceC14779c.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i12 = wizardFragment.requireArguments().getInt("step_index");
                    C0 c02 = wizardFragment.f242394s0;
                    (c02 != null ? c02 : null).f231861Y.p(i12);
                    G0 g07 = G0.f406611a;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: WizardFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/screen/step/wizard/mvi/entity/WizardState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/publish/screen/step/wizard/mvi/entity/WizardState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.l<WizardState, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a f242430m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(a aVar) {
            super(1);
            this.f242430m = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(WizardState wizardState) {
            WizardState wizardState2 = wizardState;
            b bVar = WizardFragment.f242389y0;
            WizardFragment wizardFragment = WizardFragment.this;
            boolean z12 = wizardState2.f242531b;
            com.avito.android.progress_overlay.l lVar = this.f242430m.f242400a;
            if (z12) {
                lVar.k(null);
            } else if (wizardState2.f242532c) {
                lVar.a("");
            } else {
                lVar.j();
                com.avito.konveyor.adapter.a aVar = wizardFragment.f242396u0;
                if (aVar == null) {
                    aVar = null;
                }
                com.avito.konveyor.util.a.a(aVar, wizardState2.f242534e);
                com.avito.konveyor.adapter.j jVar = wizardFragment.f242395t0;
                (jVar != null ? jVar : null).notifyDataSetChanged();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/B", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f242432m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Y41.l lVar) {
            super(0);
            this.f242432m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new r(WizardFragment.this, this.f242432m);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/v", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<Fragment> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return WizardFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/w", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ j f242434l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.f242434l = jVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f242434l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/x", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f242435l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f242435l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f242435l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f242436l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f242436l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f242436l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: WizardFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/publish/screen/step/wizard/c;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/publish/screen/step/wizard/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.l<C23060r0, com.avito.android.publish.screen.step.wizard.c> {
        public n() {
            super(1);
        }

        @Override // Y41.l
        public final com.avito.android.publish.screen.step.wizard.c invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            c.a aVar = WizardFragment.this.f242390o0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    public WizardFragment() {
        i iVar = new i(new n());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new k(new j()));
        this.f242391p0 = new O0(m0.f406844a.b(com.avito.android.publish.screen.step.wizard.c.class), new l(interfaceC42726CB), iVar, new m(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        r5().accept(InterfaceC14777a.C0853a.f13190a);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        InterfaceC23487e parentFragment = getParentFragment();
        com.avito.android.publish.screen.step.wizard.b bVar = parentFragment instanceof com.avito.android.publish.screen.step.wizard.b ? (com.avito.android.publish.screen.step.wizard.b) parentFragment : null;
        if (bVar == null) {
            bVar = (com.avito.android.publish.screen.step.wizard.b) l1();
        }
        this.f242399x0 = bVar;
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.wizard, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f242399x0 = null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.wizard_screen_root);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.wizard_screen_root);
        InterfaceC28373a interfaceC28373a = this.f242393r0;
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l(viewGroup, R.id.recycler_view, interfaceC28373a != null ? interfaceC28373a : null, R.layout.publish_progress_overlay, 0, 16, null);
        View rootView = view.getRootView();
        C0 c02 = this.f242394s0;
        if (c02 == null) {
            c02 = null;
        }
        C33862g0 c33862g0 = new C33862g0(rootView, c02.qe());
        a aVar = new a(frameLayout, recyclerView, lVar, c33862g0);
        com.avito.konveyor.adapter.j jVar = this.f242395t0;
        if (jVar == null) {
            jVar = null;
        }
        recyclerView.setAdapter(jVar);
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        RecyclerView.j itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f53829c = 500L;
        }
        recyclerView.l(new com.avito.android.blueprints.publish.header.a(getResources()), -1);
        recyclerView.o(new com.avito.android.publish.view.p(frameLayout));
        lVar.f231600j = new c();
        c33862g0.c(R.drawable.ic_back_24_black);
        c33862g0.b(new d(), new e());
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new f(null), 3);
        com.avito.android.arch.mvi.android.f.a(r5(), getViewLifecycleOwner(), Lifecycle.State.f46682e, new g(1, this, WizardFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/publish/screen/step/wizard/mvi/entity/WizardOneTimeEvent;)Lkotlin/Unit;", 8), new h(aVar));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        Bundle arguments = getArguments();
        if (arguments == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int i12 = arguments.getInt("step_index");
        Navigation navigation2 = (Navigation) arguments.getParcelable("args.navigation");
        List parcelableArrayList = arguments.getParcelableArrayList("args.leaves");
        if (parcelableArrayList == null) {
            parcelableArrayList = C42784z0.f406748b;
        }
        com.avito.android.publish.screen.step.wizard.di.a.a().a((com.avito.android.publish.screen.step.wizard.di.c) C29972i.a(C29972i.b(this), com.avito.android.publish.screen.step.wizard.di.c.class), cv.c.b(this), i12, navigation2, parcelableArrayList).a(this);
    }

    public final com.avito.android.publish.screen.step.wizard.c r5() {
        return (com.avito.android.publish.screen.step.wizard.c) this.f242391p0.getValue();
    }
}
