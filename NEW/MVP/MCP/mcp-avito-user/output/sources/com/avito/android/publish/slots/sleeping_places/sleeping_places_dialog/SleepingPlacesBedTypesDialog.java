package com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog;

import Cd.r;
import Y41.p;
import Y61.k;
import Y61.l;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.core.os.C22777e;
import androidx.fragment.app.C22960s;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.C23060r0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.lib.design.floating_container.FloatingContainer;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
import com.avito.android.util.C35976x4;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import vf0.C49322c;
import vf0.C49323d;
import wf0.InterfaceC49616a;
import wf0.InterfaceC49617b;
import z1.AbstractC50339a;

/* compiled from: SleepingPlacesBedTypesDialog.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/SleepingPlacesBedTypesDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class SleepingPlacesBedTypesDialog extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: m0, reason: collision with root package name */
    @k
    public static final a f244929m0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.g f244930h0;

    /* renamed from: i0, reason: collision with root package name */
    @k
    public final O0 f244931i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f244932j0;

    /* renamed from: k0, reason: collision with root package name */
    @l
    public FloatingContainer f244933k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f244934l0;

    /* compiled from: SleepingPlacesBedTypesDialog.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/SleepingPlacesBedTypesDialog$a;", "", "<init>", "()V", "", "SELECTED_BED_TYPE_BED_LIST_DATA", "Ljava/lang/String;", "SELECTED_BED_TYPE_ID", "SELECTED_BED_TYPE_ID_KEY", "SELECTED_BED_TYPE_ID_RESULT", "SELECTED_BED_TYPE_REDESIGNED", "SELECTED_BED_TYPE_SUBTITLE", "SELECTED_BED_TYPE_TITLE", "", "SPAN_COUNT", "I", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static SleepingPlacesBedTypesDialog a(@l Integer num, @l String str, @l String str2, @l ArrayList arrayList, boolean z12) {
            SleepingPlacesBedTypesDialog sleepingPlacesBedTypesDialog = new SleepingPlacesBedTypesDialog();
            C35966w1.a(sleepingPlacesBedTypesDialog, -1, new com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.a(num, str, str2, arrayList, z12));
            return sleepingPlacesBedTypesDialog;
        }

        public a() {
        }
    }

    /* compiled from: SleepingPlacesBedTypesDialog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.SleepingPlacesBedTypesDialog$onCreate$1", f = "SleepingPlacesBedTypesDialog.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f244935q;

        /* compiled from: SleepingPlacesBedTypesDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.SleepingPlacesBedTypesDialog$onCreate$1$1", f = "SleepingPlacesBedTypesDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f244937q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ SleepingPlacesBedTypesDialog f244938r;

            /* compiled from: SleepingPlacesBedTypesDialog.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.SleepingPlacesBedTypesDialog$onCreate$1$1$1", f = "SleepingPlacesBedTypesDialog.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.SleepingPlacesBedTypesDialog$b$a$a, reason: collision with other inner class name */
            public static final class C7336a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f244939q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ SleepingPlacesBedTypesDialog f244940r;

                /* compiled from: SleepingPlacesBedTypesDialog.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.SleepingPlacesBedTypesDialog$b$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C7337a extends H implements Y41.l<wf0.d, G0> {
                    @Override // Y41.l
                    public final G0 invoke(wf0.d dVar) {
                        wf0.d dVar2 = dVar;
                        SleepingPlacesBedTypesDialog sleepingPlacesBedTypesDialog = (SleepingPlacesBedTypesDialog) this.receiver;
                        FloatingContainer floatingContainer = sleepingPlacesBedTypesDialog.f244933k0;
                        if (floatingContainer != null) {
                            floatingContainer.setEnabled(dVar2.f441735c);
                        }
                        com.avito.konveyor.adapter.d dVar3 = sleepingPlacesBedTypesDialog.f244932j0;
                        if (dVar3 == null) {
                            dVar3 = null;
                        }
                        dVar3.l(dVar2.f441734b, null);
                        return G0.f406611a;
                    }
                }

                /* compiled from: SafeCollector.common.kt */
                @s0
                @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.SleepingPlacesBedTypesDialog$b$a$a$b, reason: collision with other inner class name */
                public static final class C7338b implements InterfaceC43160i<wf0.d> {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ n2 f244941b;

                    /* compiled from: Emitters.kt */
                    @s0
                    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.SleepingPlacesBedTypesDialog$b$a$a$b$a, reason: collision with other inner class name */
                    public static final class C7339a<T> implements InterfaceC43172j {

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ InterfaceC43172j f244942b;

                        /* compiled from: Emitters.kt */
                        @s0
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @DebugMetadata(c = "com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.SleepingPlacesBedTypesDialog$onCreate$1$1$1$invokeSuspend$$inlined$map$1$2", f = "SleepingPlacesBedTypesDialog.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        /* renamed from: com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.SleepingPlacesBedTypesDialog$b$a$a$b$a$a, reason: collision with other inner class name */
                        public static final class C7340a extends ContinuationImpl {

                            /* renamed from: q, reason: collision with root package name */
                            public /* synthetic */ Object f244943q;

                            /* renamed from: r, reason: collision with root package name */
                            public int f244944r;

                            public C7340a(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @l
                            public final Object invokeSuspend(@k Object obj) {
                                this.f244943q = obj;
                                this.f244944r |= BeduinInputModel.MIN_TEXT_VERSION;
                                return C7339a.this.emit(null, this);
                            }
                        }

                        public C7339a(InterfaceC43172j interfaceC43172j) {
                            this.f244942b = interfaceC43172j;
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
                                boolean r0 = r6 instanceof com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.SleepingPlacesBedTypesDialog.b.a.C7336a.C7338b.C7339a.C7340a
                                if (r0 == 0) goto L13
                                r0 = r6
                                com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.SleepingPlacesBedTypesDialog$b$a$a$b$a$a r0 = (com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.SleepingPlacesBedTypesDialog.b.a.C7336a.C7338b.C7339a.C7340a) r0
                                int r1 = r0.f244944r
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.f244944r = r1
                                goto L18
                            L13:
                                com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.SleepingPlacesBedTypesDialog$b$a$a$b$a$a r0 = new com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.SleepingPlacesBedTypesDialog$b$a$a$b$a$a
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.f244943q
                                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r2 = r0.f244944r
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
                                wf0.c r5 = (wf0.C49618c) r5
                                wf0.d r5 = r5.f441731f
                                r0.f244944r = r3
                                kotlinx.coroutines.flow.j r6 = r4.f244942b
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L43
                                return r1
                            L43:
                                kotlin.G0 r5 = kotlin.G0.f406611a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.SleepingPlacesBedTypesDialog.b.a.C7336a.C7338b.C7339a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    public C7338b(n2 n2Var) {
                        this.f244941b = n2Var;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43160i
                    @l
                    public final Object collect(@k InterfaceC43172j<? super wf0.d> interfaceC43172j, @k Continuation continuation) {
                        Object objCollect = this.f244941b.collect(new C7339a(interfaceC43172j), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C7336a(SleepingPlacesBedTypesDialog sleepingPlacesBedTypesDialog, Continuation<? super C7336a> continuation) {
                    super(2, continuation);
                    this.f244940r = sleepingPlacesBedTypesDialog;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    return new C7336a(this.f244940r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C7336a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f244939q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = SleepingPlacesBedTypesDialog.f244929m0;
                        SleepingPlacesBedTypesDialog sleepingPlacesBedTypesDialog = this.f244940r;
                        InterfaceC43160i interfaceC43160iR = C43175k.r(new C7338b(sleepingPlacesBedTypesDialog.f5().getState()));
                        ScreenPerformanceTracker screenPerformanceTracker = sleepingPlacesBedTypesDialog.f244934l0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C7337a c7337a = new C7337a(1, sleepingPlacesBedTypesDialog, SleepingPlacesBedTypesDialog.class, "render", "render(Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/mvi/entity/SleepingPlacesViewState;)V", 0);
                        this.f244939q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(interfaceC43160iR, screenPerformanceTracker, c7337a, this) == coroutine_suspended) {
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

            /* compiled from: SleepingPlacesBedTypesDialog.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.SleepingPlacesBedTypesDialog$onCreate$1$1$2", f = "SleepingPlacesBedTypesDialog.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.SleepingPlacesBedTypesDialog$b$a$b, reason: collision with other inner class name */
            public static final class C7341b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f244946q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ SleepingPlacesBedTypesDialog f244947r;

                /* compiled from: SleepingPlacesBedTypesDialog.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.SleepingPlacesBedTypesDialog$b$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C7342a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ SleepingPlacesBedTypesDialog f244948b;

                    public C7342a(SleepingPlacesBedTypesDialog sleepingPlacesBedTypesDialog) {
                        this.f244948b = sleepingPlacesBedTypesDialog;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        InterfaceC49617b interfaceC49617b = (InterfaceC49617b) obj;
                        a aVar = SleepingPlacesBedTypesDialog.f244929m0;
                        SleepingPlacesBedTypesDialog sleepingPlacesBedTypesDialog = this.f244948b;
                        sleepingPlacesBedTypesDialog.getClass();
                        if (interfaceC49617b instanceof InterfaceC49617b.a) {
                            C22960s.a(C22777e.b(new Q("selected_bed_type_bed_id_key", Integer.valueOf(((InterfaceC49617b.a) interfaceC49617b).f441724a))), sleepingPlacesBedTypesDialog, "selected_bed_type_bed_result");
                            sleepingPlacesBedTypesDialog.dismiss();
                        }
                        G0 g02 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g02;
                    }

                    public final boolean equals(@l Object obj) {
                        if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.D
                    @k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f244948b, SleepingPlacesBedTypesDialog.class, "handleEvent", "handleEvent(Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/mvi/entity/SleepingPlacesOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C7341b(SleepingPlacesBedTypesDialog sleepingPlacesBedTypesDialog, Continuation<? super C7341b> continuation) {
                    super(2, continuation);
                    this.f244947r = sleepingPlacesBedTypesDialog;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    return new C7341b(this.f244947r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C7341b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f244946q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = SleepingPlacesBedTypesDialog.f244929m0;
                        SleepingPlacesBedTypesDialog sleepingPlacesBedTypesDialog = this.f244947r;
                        InterfaceC43160i<InterfaceC49617b> events = sleepingPlacesBedTypesDialog.f5().getEvents();
                        C7342a c7342a = new C7342a(sleepingPlacesBedTypesDialog);
                        this.f244946q = 1;
                        if (events.collect(c7342a, this) == coroutine_suspended) {
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
            public a(SleepingPlacesBedTypesDialog sleepingPlacesBedTypesDialog, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f244938r = sleepingPlacesBedTypesDialog;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f244938r, continuation);
                aVar.f244937q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f244937q;
                SleepingPlacesBedTypesDialog sleepingPlacesBedTypesDialog = this.f244938r;
                C43259k.d(t12, null, null, new C7336a(sleepingPlacesBedTypesDialog, null), 3);
                C43259k.d(t12, null, null, new C7341b(sleepingPlacesBedTypesDialog, null), 3);
                return G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return SleepingPlacesBedTypesDialog.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f244935q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                SleepingPlacesBedTypesDialog sleepingPlacesBedTypesDialog = SleepingPlacesBedTypesDialog.this;
                a aVar = new a(sleepingPlacesBedTypesDialog, null);
                this.f244935q = 1;
                if (C23056p0.b(sleepingPlacesBedTypesDialog, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: SleepingPlacesBedTypesDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            SleepingPlacesBedTypesDialog sleepingPlacesBedTypesDialog = (SleepingPlacesBedTypesDialog) this.receiver;
            a aVar = SleepingPlacesBedTypesDialog.f244929m0;
            sleepingPlacesBedTypesDialog.getClass();
            RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.recycler_view);
            C49323d c49323d = new C49323d();
            com.avito.konveyor.adapter.d dVar = sleepingPlacesBedTypesDialog.f244932j0;
            if (dVar == null) {
                dVar = null;
            }
            recyclerView.setAdapter(dVar);
            recyclerView.getContext();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
            gridLayoutManager.f53667M = c49323d;
            recyclerView.setLayoutManager(gridLayoutManager);
            recyclerView.setItemAnimator(null);
            C35976x4.a(recyclerView);
            recyclerView.l(new C49322c(c49323d), -1);
            FloatingContainer floatingContainer = (FloatingContainer) view2.findViewById(R.id.footer_button);
            sleepingPlacesBedTypesDialog.f244933k0 = floatingContainer;
            if (floatingContainer != null) {
                floatingContainer.setOnClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.a(sleepingPlacesBedTypesDialog, 19));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SleepingPlacesBedTypesDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwf0/a;", "it", "Lkotlin/G0;", "invoke", "(Lwf0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<InterfaceC49616a, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC49616a interfaceC49616a) {
            a aVar = SleepingPlacesBedTypesDialog.f244929m0;
            SleepingPlacesBedTypesDialog.this.f5().accept(interfaceC49616a);
            return G0.f406611a;
        }
    }

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/B", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f244951m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.l lVar) {
            super(0);
            this.f244951m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new r(SleepingPlacesBedTypesDialog.this, this.f244951m);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/v", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<Fragment> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return SleepingPlacesBedTypesDialog.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/w", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f244953l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f244953l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f244953l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/x", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f244954l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f244954l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f244954l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f244955l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f244955l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f244955l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: SleepingPlacesBedTypesDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/f;", "kotlin.jvm.PlatformType", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.l<C23060r0, com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.f> {
        public j() {
            super(1);
        }

        @Override // Y41.l
        public final com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.f invoke(C23060r0 c23060r0) {
            com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.g gVar = SleepingPlacesBedTypesDialog.this.f244930h0;
            if (gVar == null) {
                gVar = null;
            }
            return (com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.f) gVar.get();
        }
    }

    public SleepingPlacesBedTypesDialog() {
        super(0, 1, null);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f244931i0 = new O0(m0.f406844a.b(com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.f.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e5(@Y61.l android.os.Bundle r13) {
        /*
            r12 = this;
            com.avito.android.analytics.screens.D$a r13 = com.avito.android.analytics.screens.D.f90335a
            r13.getClass()
            com.avito.android.analytics.screens.F r13 = com.avito.android.analytics.screens.D.a.a()
            android.os.Bundle r0 = r12.getArguments()
            r1 = 0
            if (r0 == 0) goto L18
            java.lang.String r2 = "selected_bed_type_subtitle"
            java.lang.String r0 = r0.getString(r2)
            r3 = r0
            goto L19
        L18:
            r3 = r1
        L19:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r0 < r2) goto L34
            android.os.Bundle r0 = r12.getArguments()
            if (r0 == 0) goto L32
            java.lang.Object[] r0 = com.avito.android.publish.screen.objects.a.c(r0)
            com.avito.android.remote.model.category_parameters.slot.sleeping_places.SleepingPlacesBedType[] r0 = (com.avito.android.remote.model.category_parameters.slot.sleeping_places.SleepingPlacesBedType[]) r0
            if (r0 == 0) goto L32
            java.util.List r0 = kotlin.collections.C42756l.g0(r0)
            goto L58
        L32:
            r0 = r1
            goto L58
        L34:
            android.os.Bundle r0 = r12.getArguments()
            if (r0 == 0) goto L32
            java.lang.String r2 = "selected_bed_type_bed_list_data"
            android.os.Parcelable[] r0 = r0.getParcelableArray(r2)
            if (r0 == 0) goto L32
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r4 = r0.length
            r5 = 0
        L49:
            if (r5 >= r4) goto L57
            r6 = r0[r5]
            boolean r7 = r6 instanceof com.avito.android.remote.model.category_parameters.slot.sleeping_places.SleepingPlacesBedType
            if (r7 == 0) goto L54
            r2.add(r6)
        L54:
            int r5 = r5 + 1
            goto L49
        L57:
            r0 = r2
        L58:
            android.os.Bundle r2 = r12.getArguments()
            if (r2 == 0) goto L72
            java.lang.String r4 = "selected_bed_type_id"
            boolean r5 = r2.containsKey(r4)
            if (r5 == 0) goto L6f
            int r2 = r2.getInt(r4)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L70
        L6f:
            r2 = r1
        L70:
            r4 = r2
            goto L73
        L72:
            r4 = r1
        L73:
            com.avito.android.analytics.screens.k r11 = new com.avito.android.analytics.screens.k
            com.avito.android.analytics.screens.SleepingPlacesBedTypesSelectorScreen r6 = com.avito.android.analytics.screens.SleepingPlacesBedTypesSelectorScreen.f90495d
            com.avito.android.analytics.screens.r r7 = com.avito.android.analytics.screens.s.b(r12)
            r10 = 0
            r8 = 0
            r9 = 4
            r5 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.di.d$a r2 = com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.di.b.a()
            com.avito.android.K r5 = com.avito.android.di.C29972i.b(r12)
            java.lang.Class<com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.di.l> r6 = com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.di.l.class
            com.avito.android.di.h r5 = com.avito.android.di.C29972i.a(r5, r6)
            r8 = r5
            com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.di.l r8 = (com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.di.l) r8
            if (r0 != 0) goto L97
            kotlin.collections.z0 r0 = kotlin.collections.C42784z0.f406748b
        L97:
            r5 = r0
            com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.SleepingPlacesBedTypesDialog$d r6 = new com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.SleepingPlacesBedTypesDialog$d
            r6.<init>()
            r7 = r11
            com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.di.d r0 = r2.a(r3, r4, r5, r6, r7, r8)
            r0.a(r12)
            com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker r0 = r12.f244934l0
            if (r0 == 0) goto Laa
            r1 = r0
        Laa:
            long r2 = r13.b()
            r1.a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.SleepingPlacesBedTypesDialog.e5(android.os.Bundle):void");
    }

    public final com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.f f5() {
        return (com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.f) this.f244931i0.getValue();
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f244934l0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        C43259k.d(C22981N.a(getLifecycle()), null, null, new b(null), 3);
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("selected_bed_type_title") : null;
        Bundle arguments2 = getArguments();
        boolean z12 = arguments2 != null ? arguments2.getBoolean("selected_bed_type_redesigned") : false;
        int i12 = z12 ? R.style.SleepingPlacesBedTypesDialog : R.style.Theme_DesignSystem_Re23;
        int i13 = z12 ? 4 : 0;
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(new androidx.appcompat.view.d(getContext(), i12), 0, 2, null);
        com.avito.android.lib.design.bottom_sheet.j.c(dVar, string, false, 0, 0, i13, 88);
        dVar.C(R.layout.sleeping_places_bed_types_dialog, new c(1, this, SleepingPlacesBedTypesDialog.class, "onViewInflated", "onViewInflated(Landroid/view/View;)V", 0));
        dVar.S(C35835l0.g(dVar.getContext()).y);
        return dVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f244933k0 = null;
        super.onDestroy();
    }
}
