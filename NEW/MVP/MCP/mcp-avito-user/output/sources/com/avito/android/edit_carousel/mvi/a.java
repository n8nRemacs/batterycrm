package com.avito.android.edit_carousel.mvi;

import Y41.p;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.edit_carousel.analytics.CarouselAnalyticsScenario;
import com.avito.android.edit_carousel.analytics.ExtendedProfileCarouselActionEvent;
import com.avito.android.edit_carousel.analytics.ExtendedProfileCarouselAddItemEvent;
import com.avito.android.edit_carousel.entity.CarouselEditorData;
import com.avito.android.edit_carousel.mvi.entity.EditCarouselInternalAction;
import com.avito.android.edit_carousel.mvi.entity.EditCarouselState;
import com.avito.android.profile_settings_extended.entity.CarouselEditorSettings;
import com.avito.android.profile_settings_extended.entity.ExtendedProfileSettingsAdvert;
import com.avito.android.util.O2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import qy.C47460a;
import qy.C47462c;
import ry.DialogC47939a;
import sy.C48432a;
import ty.InterfaceC48738a;

/* compiled from: EditCarouselActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lty/a;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselState;", "a", "b", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC48738a, EditCarouselInternalAction, EditCarouselState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final CarouselEditorData f146419a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.edit_carousel.e f146420b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f146421c;

    /* compiled from: EditCarouselActor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/a$a;", "", "a", "b", "Lcom/avito/android/edit_carousel/mvi/a$a$a;", "Lcom/avito/android/edit_carousel/mvi/a$a$b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.edit_carousel.mvi.a$a, reason: collision with other inner class name */
    public interface InterfaceC4255a {

        /* compiled from: EditCarouselActor.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/a$a$a;", "Lcom/avito/android/edit_carousel/mvi/a$a;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.edit_carousel.mvi.a$a$a, reason: collision with other inner class name */
        public static final class C4256a implements InterfaceC4255a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C4256a f146422a = new C4256a();
        }

        /* compiled from: EditCarouselActor.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/a$a$b;", "Lcom/avito/android/edit_carousel/mvi/a$a;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.edit_carousel.mvi.a$a$b */
        public static final class b implements InterfaceC4255a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f146423a = new b();
        }
    }

    /* compiled from: EditCarouselActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/a$b;", "", "<init>", "()V", "", "PAGE_SIZE", "J", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: EditCarouselActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {
        static {
            int[] iArr = new int[EditCarouselState.Mode.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EditCarouselState.Mode mode = EditCarouselState.Mode.f146491b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: EditCarouselActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.edit_carousel.mvi.EditCarouselActor$process$4", f = "EditCarouselActor.kt", i = {0}, l = {79, 80}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class d extends SuspendLambda implements p<InterfaceC43172j<? super EditCarouselInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f146424q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f146425r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC48738a f146427t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ EditCarouselState f146428u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(EditCarouselState editCarouselState, Continuation continuation, InterfaceC48738a interfaceC48738a) {
            super(2, continuation);
            this.f146427t = interfaceC48738a;
            this.f146428u = editCarouselState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            InterfaceC48738a interfaceC48738a = this.f146427t;
            d dVar = a.this.new d(this.f146428u, continuation, interfaceC48738a);
            dVar.f146425r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super EditCarouselInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f146424q;
            InterfaceC48738a interfaceC48738a = this.f146427t;
            a aVar = a.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f146425r;
                aVar.f146421c.c(new C47462c());
                EditCarouselInternalAction.OnSortTypePicked onSortTypePicked = new EditCarouselInternalAction.OnSortTypePicked(((InterfaceC48738a.i) interfaceC48738a).f439684a);
                this.f146425r = interfaceC43172j;
                this.f146424q = 1;
                if (interfaceC43172j.emit(onSortTypePicked, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f146425r;
                C42729a0.b(obj);
            }
            InterfaceC43160i interfaceC43160iB = aVar.f146420b.b(this.f146428u.f146488d.f146499b, Boxing.boxLong(0L), Boxing.boxLong(10L), Boxing.boxInt(((InterfaceC48738a.i) interfaceC48738a).f439684a));
            this.f146425r = null;
            this.f146424q = 2;
            if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: EditCarouselActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.edit_carousel.mvi.EditCarouselActor$process$5", f = "EditCarouselActor.kt", i = {0}, l = {93, 94}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class e extends SuspendLambda implements p<InterfaceC43172j<? super EditCarouselInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f146429q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f146430r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ EditCarouselState f146431s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ a f146432t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ InterfaceC48738a f146433u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(a aVar, EditCarouselState editCarouselState, Continuation continuation, InterfaceC48738a interfaceC48738a) {
            super(2, continuation);
            this.f146431s = editCarouselState;
            this.f146432t = aVar;
            this.f146433u = interfaceC48738a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = new e(this.f146432t, this.f146431s, continuation, this.f146433u);
            eVar.f146430r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super EditCarouselInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x007a A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.f146429q
                ty.a r2 = r8.f146433u
                com.avito.android.edit_carousel.mvi.a r3 = r8.f146432t
                com.avito.android.edit_carousel.mvi.entity.EditCarouselState r4 = r8.f146431s
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L28
                if (r1 == r6) goto L20
                if (r1 != r5) goto L18
                kotlin.C42729a0.b(r9)
                goto L7b
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L20:
                java.lang.Object r1 = r8.f146430r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L55
            L28:
                kotlin.C42729a0.b(r9)
                java.lang.Object r9 = r8.f146430r
                r1 = r9
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                com.avito.android.edit_carousel.mvi.entity.EditCarouselState$Mode r9 = r4.f146489e
                com.avito.android.edit_carousel.mvi.entity.EditCarouselState$Mode r7 = com.avito.android.edit_carousel.mvi.entity.EditCarouselState.Mode.f146492c
                if (r9 != r7) goto L7b
                com.avito.android.analytics.a r9 = r3.f146421c
                qy.b r7 = new qy.b
                r7.<init>()
                r9.c(r7)
                com.avito.android.edit_carousel.mvi.entity.EditCarouselInternalAction$OnQueryUpdated r9 = new com.avito.android.edit_carousel.mvi.entity.EditCarouselInternalAction$OnQueryUpdated
                r7 = r2
                ty.a$m r7 = (ty.InterfaceC48738a.m) r7
                java.lang.String r7 = r7.f439689a
                r9.<init>(r7)
                r8.f146430r = r1
                r8.f146429q = r6
                java.lang.Object r9 = r1.emit(r9, r8)
                if (r9 != r0) goto L55
                return r0
            L55:
                com.avito.android.edit_carousel.e r9 = r3.f146420b
                ty.a$m r2 = (ty.InterfaceC48738a.m) r2
                java.lang.String r2 = r2.f439689a
                com.avito.android.edit_carousel.mvi.entity.EditCarouselState$c r3 = r4.f146488d
                java.lang.Integer r3 = r3.f146501d
                r6 = 0
                java.lang.Long r4 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r6)
                r6 = 10
                java.lang.Long r6 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r6)
                kotlinx.coroutines.flow.i r9 = r9.b(r2, r4, r6, r3)
                r2 = 0
                r8.f146430r = r2
                r8.f146429q = r5
                java.lang.Object r9 = kotlinx.coroutines.flow.C43175k.u(r8, r9, r1)
                if (r9 != r0) goto L7b
                return r0
            L7b:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.edit_carousel.mvi.a.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: EditCarouselActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.edit_carousel.mvi.EditCarouselActor$process$7", f = "EditCarouselActor.kt", i = {0}, l = {160, 161}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class f extends SuspendLambda implements p<InterfaceC43172j<? super EditCarouselInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f146434q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f146435r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ EditCarouselState f146437t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(EditCarouselState editCarouselState, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f146437t = editCarouselState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = a.this.new f(this.f146437t, continuation);
            fVar.f146435r = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super EditCarouselInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f146434q;
            a aVar = a.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f146435r;
                InterfaceC28373a interfaceC28373a = aVar.f146421c;
                ExtendedProfileCarouselAddItemEvent.FromPage fromPage = this.f146437t.f146490f ? ExtendedProfileCarouselAddItemEvent.FromPage.f146333c : ExtendedProfileCarouselAddItemEvent.FromPage.f146334d;
                CarouselEditorData carouselEditorData = aVar.f146419a;
                List<ExtendedProfileSettingsAdvert> list = carouselEditorData.f146380e;
                interfaceC28373a.c(new ExtendedProfileCarouselAddItemEvent(fromPage, list != null ? list.size() : 0, carouselEditorData.f146378c == null ? CarouselAnalyticsScenario.f146321c : CarouselAnalyticsScenario.f146322d));
                EditCarouselInternalAction.SwitchModeToSearch switchModeToSearch = EditCarouselInternalAction.SwitchModeToSearch.f146483b;
                this.f146435r = interfaceC43172j;
                this.f146434q = 1;
                if (interfaceC43172j.emit(switchModeToSearch, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f146435r;
                C42729a0.b(obj);
            }
            InterfaceC43160i interfaceC43160iB = aVar.f146420b.b(null, Boxing.boxLong(0L), Boxing.boxLong(10L), null);
            this.f146435r = null;
            this.f146434q = 2;
            if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: EditCarouselActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.edit_carousel.mvi.EditCarouselActor$process$8", f = "EditCarouselActor.kt", i = {0}, l = {172, 173}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class g extends SuspendLambda implements p<InterfaceC43172j<? super EditCarouselInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f146438q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f146439r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC48738a f146440s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ a f146441t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ EditCarouselState f146442u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(a aVar, EditCarouselState editCarouselState, Continuation continuation, InterfaceC48738a interfaceC48738a) {
            super(2, continuation);
            this.f146440s = interfaceC48738a;
            this.f146441t = aVar;
            this.f146442u = editCarouselState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            g gVar = new g(this.f146441t, this.f146442u, continuation, this.f146440s);
            gVar.f146439r = obj;
            return gVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super EditCarouselInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f146438q;
            InterfaceC48738a interfaceC48738a = this.f146440s;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f146439r;
                EditCarouselInternalAction.PagingBarItemAction pagingBarItemAction = new EditCarouselInternalAction.PagingBarItemAction(((InterfaceC48738a.j) interfaceC48738a).f439685a);
                this.f146439r = interfaceC43172j;
                this.f146438q = 1;
                if (interfaceC43172j.emit(pagingBarItemAction, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f146439r;
                C42729a0.b(obj);
            }
            com.avito.android.edit_carousel.e eVar = this.f146441t.f146420b;
            EditCarouselState.c cVar = this.f146442u.f146488d;
            InterfaceC43160i interfaceC43160iB = eVar.b(cVar.f146499b, Boxing.boxLong((((InterfaceC48738a.j) interfaceC48738a).f439685a - 1) * 10), Boxing.boxLong(10L), cVar.f146501d);
            this.f146439r = null;
            this.f146438q = 2;
            if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    static {
        new b(null);
    }

    @Inject
    public a(@Y61.k CarouselEditorData carouselEditorData, @Y61.k com.avito.android.edit_carousel.e eVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f146419a = carouselEditorData;
        this.f146420b = eVar;
        this.f146421c = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.C(new com.avito.android.edit_carousel.mvi.c(aVar, this, null), com.avito.android.arch.mvi.utils.h.a(c43197r1, com.avito.android.edit_carousel.mvi.b.f146443l));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<EditCarouselInternalAction> b(@Y61.k InterfaceC48738a interfaceC48738a, @Y61.k EditCarouselState editCarouselState) {
        C43210w c43210w;
        String str;
        boolean z12 = interfaceC48738a instanceof InterfaceC48738a.e;
        EditCarouselState.c cVar = editCarouselState.f146488d;
        com.avito.android.edit_carousel.e eVar = this.f146420b;
        if (z12) {
            return eVar.b(cVar.f146499b, Long.valueOf(cVar.f146503f), 10L, cVar.f146501d);
        }
        if (interfaceC48738a instanceof InterfaceC48738a.h) {
            return new C43210w(new EditCarouselInternalAction.OnNamePicked(((InterfaceC48738a.h) interfaceC48738a).f439683a));
        }
        if (interfaceC48738a instanceof InterfaceC48738a.k) {
            List<C48432a> list = cVar.f146500c;
            if (list == null) {
                return C43175k.w();
            }
            List<C48432a> list2 = list;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            for (C48432a c48432a : list2) {
                int i12 = c48432a.f438935b;
                Integer num = cVar.f146501d;
                arrayList.add(new DialogC47939a.C12603a(c48432a.f438934a, i12, num != null && i12 == num.intValue()));
            }
            c43210w = new C43210w(new EditCarouselInternalAction.SelectSortType(arrayList));
        } else {
            if (interfaceC48738a instanceof InterfaceC48738a.i) {
                return C43175k.G(new d(editCarouselState, null, interfaceC48738a));
            }
            if (interfaceC48738a instanceof InterfaceC48738a.m) {
                return C43175k.G(new e(this, editCarouselState, null, interfaceC48738a));
            }
            boolean z13 = interfaceC48738a instanceof InterfaceC48738a.g;
            CarouselEditorData carouselEditorData = this.f146419a;
            InterfaceC28373a interfaceC28373a = this.f146421c;
            EditCarouselState.Mode mode = editCarouselState.f146489e;
            EditCarouselState.b bVar = editCarouselState.f146487c;
            if (z13) {
                int iOrdinal = mode.ordinal();
                if (iOrdinal == 0) {
                    Integer num2 = bVar.f146495a;
                    if (num2 != null) {
                        Set<ExtendedProfileSettingsAdvert> set = bVar.f146497c;
                        if (n.a(set, carouselEditorData)) {
                            if (!O2.a(carouselEditorData.f146380e) || (str = carouselEditorData.f146378c) == null) {
                                int iIntValue = num2.intValue();
                                Set<ExtendedProfileSettingsAdvert> set2 = set;
                                ArrayList arrayList2 = new ArrayList(C42745f0.q(set2, 10));
                                Iterator<T> it = set2.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(Long.valueOf(((ExtendedProfileSettingsAdvert) it.next()).f230267b));
                                }
                                return eVar.c(iIntValue, carouselEditorData.f146377b, C42745f0.M0(arrayList2));
                            }
                            int iIntValue2 = num2.intValue();
                            Set<ExtendedProfileSettingsAdvert> set3 = set;
                            ArrayList arrayList3 = new ArrayList(C42745f0.q(set3, 10));
                            Iterator<T> it2 = set3.iterator();
                            while (it2.hasNext()) {
                                arrayList3.add(Long.valueOf(((ExtendedProfileSettingsAdvert) it2.next()).f230267b));
                            }
                            return this.f146420b.a(carouselEditorData.f146377b, str, iIntValue2, C42745f0.M0(arrayList3), carouselEditorData.f146382g);
                        }
                    }
                    return C43175k.w();
                }
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC28373a.c(new C47460a(bVar.f146497c.size(), carouselEditorData.f146378c == null ? CarouselAnalyticsScenario.f146321c : CarouselAnalyticsScenario.f146322d));
                c43210w = new C43210w(new EditCarouselInternalAction.SwitchModeToEdit(true));
            } else if (interfaceC48738a instanceof InterfaceC48738a.d) {
                ArrayList<CarouselEditorSettings.CarouselNameItem> arrayList4 = carouselEditorData.f146379d.f230262j;
                ArrayList arrayList5 = new ArrayList(C42745f0.q(arrayList4, 10));
                for (CarouselEditorSettings.CarouselNameItem carouselNameItem : arrayList4) {
                    int i13 = carouselNameItem.f230263b;
                    Integer num3 = bVar.f146495a;
                    if (num3 == null) {
                        num3 = carouselEditorData.f146381f;
                    }
                    arrayList5.add(new DialogC47939a.C12603a(carouselNameItem.f230264c, i13, num3 != null && i13 == num3.intValue()));
                }
                c43210w = new C43210w(new EditCarouselInternalAction.HeaderSelectItemAction(arrayList5));
            } else if (interfaceC48738a instanceof InterfaceC48738a.b) {
                if (cVar.f146504g.size() != carouselEditorData.f146379d.f230261i || ((InterfaceC48738a.b) interfaceC48738a).f439677a.f146241d) {
                    return new C43210w(new EditCarouselInternalAction.AdvertSelectedItemAction(((InterfaceC48738a.b) interfaceC48738a).f439677a));
                }
                c43210w = new C43210w(EditCarouselInternalAction.RefreshAdverts.f146478b);
            } else {
                if (interfaceC48738a instanceof InterfaceC48738a.C12695a) {
                    interfaceC28373a.c(new ExtendedProfileCarouselActionEvent(ExtendedProfileCarouselActionEvent.ActionType.f146328d, carouselEditorData.f146378c == null ? CarouselAnalyticsScenario.f146321c : CarouselAnalyticsScenario.f146322d));
                    return new C43210w(new EditCarouselInternalAction.AdvertDeleteItemAction(((InterfaceC48738a.C12695a) interfaceC48738a).f439676a));
                }
                if (interfaceC48738a instanceof InterfaceC48738a.c) {
                    return C43175k.G(new f(editCarouselState, null));
                }
                if (interfaceC48738a instanceof InterfaceC48738a.j) {
                    return C43175k.G(new g(this, editCarouselState, null, interfaceC48738a));
                }
                if (interfaceC48738a instanceof InterfaceC48738a.l) {
                    interfaceC28373a.c(new ExtendedProfileCarouselActionEvent(ExtendedProfileCarouselActionEvent.ActionType.f146327c, carouselEditorData.f146378c == null ? CarouselAnalyticsScenario.f146321c : CarouselAnalyticsScenario.f146322d));
                    InterfaceC48738a.l lVar = (InterfaceC48738a.l) interfaceC48738a;
                    return new C43210w(new EditCarouselInternalAction.SwapAdverts(lVar.f439687a, lVar.f439688b));
                }
                if (!interfaceC48738a.equals(InterfaceC48738a.f.f439681a)) {
                    throw new NoWhenBranchMatchedException();
                }
                c43210w = mode == EditCarouselState.Mode.f146492c ? new C43210w(new EditCarouselInternalAction.SwitchModeToEdit(false)) : new C43210w(EditCarouselInternalAction.LeaveScreen.f146473b);
            }
        }
        return c43210w;
    }
}
