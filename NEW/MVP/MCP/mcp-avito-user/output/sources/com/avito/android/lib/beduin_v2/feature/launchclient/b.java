package com.avito.android.lib.beduin_v2.feature.launchclient;

import Ju.InterfaceC14249c;
import Y41.p;
import Y61.k;
import Y61.l;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.lib.beduin_v2.feature.di.V0;
import com.avito.beduin.v2.interaction.launch.flow.ResultStatus;
import com.avito.beduin.v2.interaction.launch.flow.i;
import com.avito.beduin.v2.interaction.launch.flow.j;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.rx3.y;
import kv.C43501a;

/* compiled from: BeduinV2DeeplinkLaunchClient.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/launchclient/b;", "Lcom/avito/beduin/v2/interaction/launch/flow/a;", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@V0
/* loaded from: classes14.dex */
public final class b implements com.avito.beduin.v2.interaction.launch.flow.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f176198b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final x f176199c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Map<Class<?>, g> f176200d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final LinkedHashMap f176201e = new LinkedHashMap();

    /* compiled from: BeduinV2DeeplinkLaunchClient.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.lib.beduin_v2.feature.launchclient.BeduinV2DeeplinkLaunchClient$bind$1$1", f = "BeduinV2DeeplinkLaunchClient.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f176202q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ FV0.a f176203r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ b f176204s;

        /* compiled from: BeduinV2DeeplinkLaunchClient.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.lib.beduin_v2.feature.launchclient.BeduinV2DeeplinkLaunchClient$bind$1$1$1", f = "BeduinV2DeeplinkLaunchClient.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.lib.beduin_v2.feature.launchclient.b$a$a, reason: collision with other inner class name */
        public static final class C5215a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f176205q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ b f176206r;

            /* compiled from: BeduinV2DeeplinkLaunchClient.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "emit", "(Lkv/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.lib.beduin_v2.feature.launchclient.b$a$a$a, reason: collision with other inner class name */
            public static final class C5216a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b f176207b;

                public C5216a(b bVar) {
                    this.f176207b = bVar;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    C43501a c43501a = (C43501a) obj;
                    com.avito.android.deeplink_handler.handler.bundle.a aVar = c43501a.f413260a;
                    b bVar = this.f176207b;
                    g orDefault = bVar.f176200d.getOrDefault(aVar.f134520a.getClass(), new h());
                    InterfaceC14249c.b bVar2 = (InterfaceC14249c.b) c43501a.f413261b;
                    ResultStatus resultStatusB = orDefault.b(bVar2);
                    j jVarA = orDefault.a(bVar2);
                    p pVar = (p) bVar.f176201e.remove(aVar.f134521b);
                    if (pVar != null) {
                        pVar.invoke(resultStatusB, jVarA);
                    }
                    return G0.f406611a;
                }
            }

            /* compiled from: SafeCollector.common.kt */
            @s0
            @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.lib.beduin_v2.feature.launchclient.b$a$a$b, reason: collision with other inner class name */
            public static final class C5217b implements InterfaceC43160i<C43501a> {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43160i f176208b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ b f176209c;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.lib.beduin_v2.feature.launchclient.b$a$a$b$a, reason: collision with other inner class name */
                public static final class C5218a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ InterfaceC43172j f176210b;

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ b f176211c;

                    /* compiled from: Emitters.kt */
                    @s0
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    @DebugMetadata(c = "com.avito.android.lib.beduin_v2.feature.launchclient.BeduinV2DeeplinkLaunchClient$bind$1$1$1$invokeSuspend$$inlined$filter$1$2", f = "BeduinV2DeeplinkLaunchClient.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                    /* renamed from: com.avito.android.lib.beduin_v2.feature.launchclient.b$a$a$b$a$a, reason: collision with other inner class name */
                    public static final class C5219a extends ContinuationImpl {

                        /* renamed from: q, reason: collision with root package name */
                        public /* synthetic */ Object f176212q;

                        /* renamed from: r, reason: collision with root package name */
                        public int f176213r;

                        public C5219a(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @l
                        public final Object invokeSuspend(@k Object obj) {
                            this.f176212q = obj;
                            this.f176213r |= BeduinInputModel.MIN_TEXT_VERSION;
                            return C5218a.this.emit(null, this);
                        }
                    }

                    public C5218a(InterfaceC43172j interfaceC43172j, b bVar) {
                        this.f176210b = interfaceC43172j;
                        this.f176211c = bVar;
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
                            boolean r0 = r6 instanceof com.avito.android.lib.beduin_v2.feature.launchclient.b.a.C5215a.C5217b.C5218a.C5219a
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.avito.android.lib.beduin_v2.feature.launchclient.b$a$a$b$a$a r0 = (com.avito.android.lib.beduin_v2.feature.launchclient.b.a.C5215a.C5217b.C5218a.C5219a) r0
                            int r1 = r0.f176213r
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.f176213r = r1
                            goto L18
                        L13:
                            com.avito.android.lib.beduin_v2.feature.launchclient.b$a$a$b$a$a r0 = new com.avito.android.lib.beduin_v2.feature.launchclient.b$a$a$b$a$a
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.f176212q
                            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r2 = r0.f176213r
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            kotlin.C42729a0.b(r6)
                            goto L50
                        L29:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L31:
                            kotlin.C42729a0.b(r6)
                            r6 = r5
                            kv.a r6 = (kv.C43501a) r6
                            com.avito.android.lib.beduin_v2.feature.launchclient.b r2 = r4.f176211c
                            java.util.LinkedHashMap r2 = r2.f176201e
                            com.avito.android.deeplink_handler.handler.bundle.a r6 = r6.f413260a
                            java.lang.String r6 = r6.f134521b
                            boolean r6 = r2.containsKey(r6)
                            if (r6 == 0) goto L50
                            r0.f176213r = r3
                            kotlinx.coroutines.flow.j r6 = r4.f176210b
                            java.lang.Object r5 = r6.emit(r5, r0)
                            if (r5 != r1) goto L50
                            return r1
                        L50:
                            kotlin.G0 r5 = kotlin.G0.f406611a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.beduin_v2.feature.launchclient.b.a.C5215a.C5217b.C5218a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                public C5217b(InterfaceC43160i interfaceC43160i, b bVar) {
                    this.f176208b = interfaceC43160i;
                    this.f176209c = bVar;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43160i
                @l
                public final Object collect(@k InterfaceC43172j<? super C43501a> interfaceC43172j, @k Continuation continuation) {
                    Object objCollect = ((AbstractC43168f) this.f176208b).collect(new C5218a(interfaceC43172j, this.f176209c), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5215a(b bVar, Continuation<? super C5215a> continuation) {
                super(2, continuation);
                this.f176206r = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new C5215a(this.f176206r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C5215a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f176205q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    b bVar = this.f176206r;
                    C5217b c5217b = new C5217b(y.a(bVar.f176198b.d9()), bVar);
                    C5216a c5216a = new C5216a(bVar);
                    this.f176205q = 1;
                    if (c5217b.collect(c5216a, this) == coroutine_suspended) {
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
        public a(FV0.a aVar, b bVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f176203r = aVar;
            this.f176204s = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new a(this.f176203r, this.f176204s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f176202q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46681d;
                C5215a c5215a = new C5215a(this.f176204s, null);
                this.f176202q = 1;
                if (C23056p0.b(this.f176203r, state, c5215a, this) == coroutine_suspended) {
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

    @Inject
    public b(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k x xVar, @k Map<Class<?>, g> map) {
        this.f176198b = aVar;
        this.f176199c = xVar;
        this.f176200d = map;
    }

    @Override // FV0.h
    public final void Q(@k FV0.a aVar) {
        C43259k.d(C22984Q.a(aVar), null, null, new a(aVar, this, null), 3);
    }

    public final DeepLink b(String str, i iVar) {
        HV0.e eVar = new HV0.e(str);
        com.avito.beduin.v2.interaction.launch.flow.k[] kVarArr = iVar.f337466a;
        int iF2 = P0.f(kVarArr.length);
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (com.avito.beduin.v2.interaction.launch.flow.k kVar : kVarArr) {
            linkedHashMap.put(kVar.f337468a, kVar.f337469b);
        }
        eVar.a(linkedHashMap);
        return this.f176199c.b(eVar.b());
    }

    @Override // com.avito.beduin.v2.interaction.launch.flow.a
    @k
    public final com.avito.android.lib.beduin_v2.feature.launchclient.a d(@k String str, @k i iVar, @k p pVar) {
        String string = UUID.randomUUID().toString();
        this.f176201e.put(string, pVar);
        b.a.a(this.f176198b, b(str, iVar), string, null, 4);
        return new com.avito.android.lib.beduin_v2.feature.launchclient.a(0, this, string);
    }

    @Override // com.avito.beduin.v2.interaction.launch.flow.a
    public final void i(@k String str, @k i iVar) {
        b.a.a(this.f176198b, b(str, iVar), null, null, 6);
    }

    @Override // FV0.h
    public final void P() {
    }
}
