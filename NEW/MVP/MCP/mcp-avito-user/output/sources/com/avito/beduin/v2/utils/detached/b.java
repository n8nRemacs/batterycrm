package com.avito.beduin.v2.utils.detached;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.advert.item.C28156p;
import com.avito.beduin.v2.avito.component.button.state.C36216a;
import com.avito.beduin.v2.engine.D;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetContentPaddings;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetHeight;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetModalSize;
import com.avito.beduin.v2.interaction.detached.flow.modal.ModalButtonsOrientation;
import com.avito.beduin.v2.logger.LogLevel;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: ScreenAwareDetachComponentClient.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/avito/beduin/v2/utils/detached/b;", "Lcom/avito/beduin/v2/interaction/detached/flow/a;", "<init>", "()V", "a", "b", "c", "d", "detached-client_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements com.avito.beduin.v2.interaction.detached.flow.a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f338382d = 0;

    /* renamed from: b, reason: collision with root package name */
    @l
    public com.avito.beduin.v2.interaction.detached.flow.b f338383b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashMap f338384c = new LinkedHashMap();

    /* compiled from: ScreenAwareDetachComponentClient.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/beduin/v2/utils/detached/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "detached-client_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ScreenAwareDetachComponentClient.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/beduin/v2/utils/detached/b$b;", "", "a", "b", "Lcom/avito/beduin/v2/utils/detached/b$b$a;", "Lcom/avito/beduin/v2/utils/detached/b$b$b;", "detached-client_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.utils.detached.b$b, reason: collision with other inner class name */
    public interface InterfaceC10485b {

        /* compiled from: ScreenAwareDetachComponentClient.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/utils/detached/b$b$a;", "Lcom/avito/beduin/v2/utils/detached/b$b;", "detached-client_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.beduin.v2.utils.detached.b$b$a */
        public static final /* data */ class a implements InterfaceC10485b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final D f338385a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final BottomSheetHeight f338386b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final BottomSheetContentPaddings f338387c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final LinkedHashMap f338388d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final Y41.a<G0> f338389e;

            /* renamed from: f, reason: collision with root package name */
            @k
            public final BottomSheetModalSize f338390f;

            public a(@k Y41.a aVar, @k D d12, @k BottomSheetContentPaddings bottomSheetContentPaddings, @k BottomSheetHeight bottomSheetHeight, @k BottomSheetModalSize bottomSheetModalSize, @l LinkedHashMap linkedHashMap) {
                this.f338385a = d12;
                this.f338386b = bottomSheetHeight;
                this.f338387c = bottomSheetContentPaddings;
                this.f338388d = linkedHashMap;
                this.f338389e = aVar;
                this.f338390f = bottomSheetModalSize;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f338385a.equals(aVar.f338385a) && this.f338386b == aVar.f338386b && this.f338387c == aVar.f338387c && L.f(this.f338388d, aVar.f338388d) && this.f338389e.equals(aVar.f338389e) && this.f338390f == aVar.f338390f;
            }

            public final int hashCode() {
                int iHashCode = (this.f338387c.hashCode() + ((this.f338386b.hashCode() + (this.f338385a.hashCode() * 31)) * 31)) * 31;
                LinkedHashMap linkedHashMap = this.f338388d;
                return this.f338390f.hashCode() + r.h((iHashCode + (linkedHashMap == null ? 0 : linkedHashMap.hashCode())) * 31, 31, this.f338389e);
            }

            @k
            public final String toString() {
                return "DetachedBottomSheetParams(rendererState=" + this.f338385a + ", height=" + this.f338386b + ", contentPaddings=" + this.f338387c + ", metaInfo=" + this.f338388d + ", onDismiss=" + this.f338389e + ", modalSize=" + this.f338390f + ')';
            }
        }

        /* compiled from: ScreenAwareDetachComponentClient.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/utils/detached/b$b$b;", "Lcom/avito/beduin/v2/utils/detached/b$b;", "detached-client_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.beduin.v2.utils.detached.b$b$b, reason: collision with other inner class name */
        public static final /* data */ class C10486b implements InterfaceC10485b {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final String f338391a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f338392b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final C36216a[] f338393c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final ModalButtonsOrientation f338394d;

            /* renamed from: e, reason: collision with root package name */
            public final boolean f338395e;

            /* renamed from: f, reason: collision with root package name */
            @l
            public final Y41.a<G0> f338396f;

            /* renamed from: g, reason: collision with root package name */
            @l
            public final com.avito.beduin.v2.interaction.detached.flow.modal.a f338397g;

            /* renamed from: h, reason: collision with root package name */
            public final boolean f338398h;

            /* renamed from: i, reason: collision with root package name */
            @k
            public final Y41.a<G0> f338399i;

            public C10486b(@l String str, @l String str2, @l C36216a[] c36216aArr, @l ModalButtonsOrientation modalButtonsOrientation, boolean z12, @l Y41.a<G0> aVar, @l com.avito.beduin.v2.interaction.detached.flow.modal.a aVar2, boolean z13, @k Y41.a<G0> aVar3) {
                this.f338391a = str;
                this.f338392b = str2;
                this.f338393c = c36216aArr;
                this.f338394d = modalButtonsOrientation;
                this.f338395e = z12;
                this.f338396f = aVar;
                this.f338397g = aVar2;
                this.f338398h = z13;
                this.f338399i = aVar3;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C10486b)) {
                    return false;
                }
                C10486b c10486b = (C10486b) obj;
                return L.f(this.f338391a, c10486b.f338391a) && L.f(this.f338392b, c10486b.f338392b) && L.f(this.f338393c, c10486b.f338393c) && this.f338394d == c10486b.f338394d && this.f338395e == c10486b.f338395e && L.f(this.f338396f, c10486b.f338396f) && L.f(this.f338397g, c10486b.f338397g) && this.f338398h == c10486b.f338398h && L.f(this.f338399i, c10486b.f338399i);
            }

            public final int hashCode() {
                String str = this.f338391a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f338392b;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                C36216a[] c36216aArr = this.f338393c;
                int iHashCode3 = (iHashCode2 + (c36216aArr == null ? 0 : Arrays.hashCode(c36216aArr))) * 31;
                ModalButtonsOrientation modalButtonsOrientation = this.f338394d;
                int i12 = r.i((iHashCode3 + (modalButtonsOrientation == null ? 0 : modalButtonsOrientation.hashCode())) * 31, 31, this.f338395e);
                Y41.a<G0> aVar = this.f338396f;
                int iHashCode4 = (i12 + (aVar == null ? 0 : aVar.hashCode())) * 31;
                com.avito.beduin.v2.interaction.detached.flow.modal.a aVar2 = this.f338397g;
                return this.f338399i.hashCode() + r.i((iHashCode4 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31, 31, this.f338398h);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("DetachedModalParams(title=");
                sb2.append(this.f338391a);
                sb2.append(", subtitle=");
                sb2.append(this.f338392b);
                sb2.append(", buttons=");
                sb2.append(Arrays.toString(this.f338393c));
                sb2.append(", buttonsOrientation=");
                sb2.append(this.f338394d);
                sb2.append(", closeButtonVisible=");
                sb2.append(this.f338395e);
                sb2.append(", onCloseClick=");
                sb2.append(this.f338396f);
                sb2.append(", image=");
                sb2.append(this.f338397g);
                sb2.append(", cancelable=");
                sb2.append(this.f338398h);
                sb2.append(", onDismiss=");
                return r.v(sb2, this.f338399i, ')');
            }
        }
    }

    /* compiled from: ScreenAwareDetachComponentClient.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/beduin/v2/utils/detached/b$c;", "", "a", "b", "Lcom/avito/beduin/v2/utils/detached/b$c$a;", "Lcom/avito/beduin/v2/utils/detached/b$c$b;", "detached-client_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {

        /* compiled from: ScreenAwareDetachComponentClient.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/utils/detached/b$c$a;", "Lcom/avito/beduin/v2/utils/detached/b$c;", "detached-client_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final com.avito.beduin.v2.interaction.detached.flow.b f338400a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final InterfaceC10485b.a f338401b;

            public a(@k com.avito.beduin.v2.interaction.detached.flow.b bVar, @k InterfaceC10485b.a aVar) {
                this.f338400a = bVar;
                this.f338401b = aVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f338400a, aVar.f338400a) && L.f(this.f338401b, aVar.f338401b);
            }

            @Override // com.avito.beduin.v2.utils.detached.b.c
            public final InterfaceC10485b getParams() {
                return this.f338401b;
            }

            public final int hashCode() {
                return this.f338401b.hashCode() + (this.f338400a.hashCode() * 31);
            }

            @k
            public final String toString() {
                return "BottomSheet(host=" + this.f338400a + ", params=" + this.f338401b + ')';
            }
        }

        /* compiled from: ScreenAwareDetachComponentClient.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/utils/detached/b$c$b;", "Lcom/avito/beduin/v2/utils/detached/b$c;", "detached-client_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.beduin.v2.utils.detached.b$c$b, reason: collision with other inner class name */
        public static final /* data */ class C10487b implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final com.avito.beduin.v2.interaction.detached.flow.b f338402a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final InterfaceC10485b.C10486b f338403b;

            public C10487b(@k com.avito.beduin.v2.interaction.detached.flow.b bVar, @k InterfaceC10485b.C10486b c10486b) {
                this.f338402a = bVar;
                this.f338403b = c10486b;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C10487b)) {
                    return false;
                }
                C10487b c10487b = (C10487b) obj;
                return L.f(this.f338402a, c10487b.f338402a) && L.f(this.f338403b, c10487b.f338403b);
            }

            @Override // com.avito.beduin.v2.utils.detached.b.c
            public final InterfaceC10485b getParams() {
                return this.f338403b;
            }

            public final int hashCode() {
                return this.f338403b.hashCode() + (this.f338402a.hashCode() * 31);
            }

            @k
            public final String toString() {
                return "Modal(host=" + this.f338402a + ", params=" + this.f338403b + ')';
            }
        }

        @k
        InterfaceC10485b getParams();
    }

    /* compiled from: ScreenAwareDetachComponentClient.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/utils/detached/b$d;", "", "detached-client_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final InterfaceC10485b f338404a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public HV0.b f338405b;

        public d(@k InterfaceC10485b interfaceC10485b, @l HV0.b bVar) {
            this.f338404a = interfaceC10485b;
            this.f338405b = bVar;
        }
    }

    /* compiled from: ScreenAwareDetachComponentClient.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.beduin.v2.utils.detached.ScreenAwareDetachComponentClient$bind$1$2", f = "ScreenAwareDetachComponentClient.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f338406q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ FV0.a f338407r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ FV0.a f338408s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ b f338409t;

        /* compiled from: ScreenAwareDetachComponentClient.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.beduin.v2.utils.detached.ScreenAwareDetachComponentClient$bind$1$2$1", f = "ScreenAwareDetachComponentClient.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ FV0.a f338410q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ b f338411r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(FV0.a aVar, b bVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f338410q = aVar;
                this.f338411r = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new a(this.f338410q, this.f338411r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                c c10487b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                FV0.a aVar = this.f338410q;
                if (aVar instanceof com.avito.beduin.v2.interaction.detached.flow.b) {
                    com.avito.beduin.v2.interaction.detached.flow.b bVar = (com.avito.beduin.v2.interaction.detached.flow.b) aVar;
                    b bVar2 = this.f338411r;
                    bVar2.f338383b = bVar;
                    for (Map.Entry entry : bVar2.f338384c.entrySet()) {
                        InterfaceC10485b interfaceC10485b = ((d) entry.getValue()).f338404a;
                        if (interfaceC10485b instanceof InterfaceC10485b.a) {
                            c10487b = new c.a(bVar, (InterfaceC10485b.a) interfaceC10485b);
                        } else {
                            if (!(interfaceC10485b instanceof InterfaceC10485b.C10486b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c10487b = new c.C10487b(bVar, (InterfaceC10485b.C10486b) interfaceC10485b);
                        }
                        bVar2.k(c10487b, (String) entry.getKey());
                    }
                } else {
                    RU0.b bVar3 = RU0.b.f14467a;
                    LogLevel[] logLevelArr = LogLevel.f337864b;
                    bVar3.getClass();
                    if (3 >= RU0.b.f14469c) {
                        RU0.b.f14468b.e(AK.c.s(new StringBuilder(), RU0.b.f14470d, ":PlatformDetachedClient"), "Unable to show detached component: " + aVar + " is not a DetachedComponentHolder");
                    }
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(FV0.a aVar, FV0.a aVar2, b bVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f338407r = aVar;
            this.f338408s = aVar2;
            this.f338409t = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new e(this.f338407r, this.f338408s, this.f338409t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f338406q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46681d;
                a aVar = new a(this.f338408s, this.f338409t, null);
                this.f338406q = 1;
                if (C23056p0.b(this.f338407r, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: ScreenAwareDetachComponentClient.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f338412l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b f338413m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f338414n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Y41.a<G0> aVar, b bVar, String str) {
            super(0);
            this.f338412l = (N) aVar;
            this.f338413m = bVar;
            this.f338414n = str;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final G0 invoke() {
            this.f338412l.invoke();
            this.f338413m.f338384c.remove(this.f338414n);
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    @Override // FV0.h
    public final void P() {
        this.f338383b = null;
        Iterator it = this.f338384c.entrySet().iterator();
        while (it.hasNext()) {
            ((d) ((Map.Entry) it.next()).getValue()).f338405b = null;
        }
    }

    @Override // FV0.h
    public final void Q(@k FV0.a aVar) {
        if (!(aVar instanceof com.avito.beduin.v2.interaction.detached.flow.b)) {
            RU0.b bVar = RU0.b.f14467a;
            LogLevel[] logLevelArr = LogLevel.f337864b;
            bVar.getClass();
            if (3 >= RU0.b.f14469c) {
                RU0.b.f14468b.e(AK.c.s(new StringBuilder(), RU0.b.f14470d, ":PlatformDetachedClient"), aVar + " is not implementing DetachedComponentHolder interface");
            }
        }
        C43259k.d(C22981N.a(aVar.getLifecycle()), null, null, new e(aVar, aVar, this, null), 3);
    }

    @Override // com.avito.beduin.v2.interaction.detached.flow.b
    @k
    public final HV0.b Y2(@l String str, @l String str2, @l C36216a[] c36216aArr, @l ModalButtonsOrientation modalButtonsOrientation, boolean z12, @l Y41.a<G0> aVar, @l com.avito.beduin.v2.interaction.detached.flow.modal.a aVar2, boolean z13, @k Y41.a<G0> aVar3) {
        com.avito.beduin.v2.interaction.detached.flow.b bVar = this.f338383b;
        if (bVar != null) {
            String strA = com.avito.beduin.v2.engine.utils.f.a();
            k(new c.C10487b(bVar, new InterfaceC10485b.C10486b(str, str2, c36216aArr, modalButtonsOrientation, z12, aVar, aVar2, z13, new f(aVar3, this, strA))), strA);
            return new com.avito.beduin.v2.utils.detached.a(this, strA, 0);
        }
        RU0.b bVar2 = RU0.b.f14467a;
        LogLevel[] logLevelArr = LogLevel.f337864b;
        bVar2.getClass();
        if (3 >= RU0.b.f14469c) {
            RU0.b.f14468b.e(RU0.b.f14470d + ":PlatformDetachedClient", "DetachedComponentHolder is null");
        }
        this.f338384c.clear();
        return new C28156p(4);
    }

    public final void b(String str) {
        HV0.b bVar;
        LinkedHashMap linkedHashMap = this.f338384c;
        d dVar = (d) linkedHashMap.get(str);
        if (dVar != null && (bVar = dVar.f338405b) != null) {
            bVar.close();
        }
        linkedHashMap.remove(str);
    }

    public final void k(c cVar, String str) {
        HV0.b bVarY2;
        if (cVar instanceof c.a) {
            InterfaceC10485b.a aVar = ((c.a) cVar).f338401b;
            D d12 = aVar.f338385a;
            BottomSheetHeight bottomSheetHeight = aVar.f338386b;
            BottomSheetContentPaddings bottomSheetContentPaddings = aVar.f338387c;
            bVarY2 = ((c.a) cVar).f338400a.y2(aVar.f338389e, d12, bottomSheetContentPaddings, bottomSheetHeight, aVar.f338390f, aVar.f338388d);
        } else {
            if (!(cVar instanceof c.C10487b)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC10485b.C10486b c10486b = ((c.C10487b) cVar).f338403b;
            bVarY2 = ((c.C10487b) cVar).f338402a.Y2(c10486b.f338391a, c10486b.f338392b, c10486b.f338393c, c10486b.f338394d, c10486b.f338395e, c10486b.f338396f, c10486b.f338397g, c10486b.f338398h, c10486b.f338399i);
        }
        this.f338384c.put(str, new d(cVar.getParams(), bVarY2));
    }

    @Override // com.avito.beduin.v2.interaction.detached.flow.b
    @k
    public final HV0.b y2(@k Y41.a aVar, @k D d12, @k BottomSheetContentPaddings bottomSheetContentPaddings, @k BottomSheetHeight bottomSheetHeight, @k BottomSheetModalSize bottomSheetModalSize, @l LinkedHashMap linkedHashMap) {
        com.avito.beduin.v2.interaction.detached.flow.b bVar = this.f338383b;
        if (bVar != null) {
            String strA = com.avito.beduin.v2.engine.utils.f.a();
            k(new c.a(bVar, new InterfaceC10485b.a(new com.avito.beduin.v2.utils.detached.c(aVar, this, strA), d12, bottomSheetContentPaddings, bottomSheetHeight, bottomSheetModalSize, linkedHashMap)), strA);
            return new com.avito.beduin.v2.utils.detached.a(this, strA, 1);
        }
        RU0.b bVar2 = RU0.b.f14467a;
        LogLevel[] logLevelArr = LogLevel.f337864b;
        bVar2.getClass();
        if (3 >= RU0.b.f14469c) {
            RU0.b.f14468b.e(RU0.b.f14470d + ":PlatformDetachedClient", "DetachedComponentHolder is null");
        }
        this.f338384c.clear();
        return new C28156p(4);
    }
}
