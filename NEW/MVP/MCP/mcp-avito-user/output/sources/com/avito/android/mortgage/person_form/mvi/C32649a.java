package com.avito.android.mortgage.person_form.mvi;

import E00.b;
import com.avito.android.arch.mvi.utils.n;
import com.avito.android.arch.mvi.utils.o;
import com.avito.android.mortgage.api.model.items.form.FormContentItemType;
import com.avito.android.mortgage.api.model.items.form.SuggestFormContentItemValue;
import com.avito.android.mortgage.api.model.suggestions.Suggestion;
import com.avito.android.mortgage.person_form.list.items.select.SelectItem;
import com.avito.android.mortgage.person_form.mvi.entity.PersonFormInternalAction;
import com.avito.android.select.Arguments;
import com.avito.android.util.R0;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.internal.C43238h;
import okhttp3.internal.http.StatusLine;

/* compiled from: PersonFormActor.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LE00/b;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "LG00/c;", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.mortgage.person_form.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32649a implements com.avito.android.arch.mvi.a<E00.b, PersonFormInternalAction, G00.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.person_form.mvi.domain.a f200895a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.person_form.mvi.domain.e f200896b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.person_form.mvi.domain.j f200897c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.person_form.mvi.domain.n f200898d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final v f200899e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final H f200900f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.util.d f200901g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final R0 f200902h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C43238h f200903i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.arch.mvi.utils.o f200904j;

    /* compiled from: PersonFormActor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/a$a;", "", "a", "b", "Lcom/avito/android/mortgage/person_form/mvi/a$a$a;", "Lcom/avito/android/mortgage/person_form/mvi/a$a$b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage.person_form.mvi.a$a, reason: collision with other inner class name */
    public interface InterfaceC5953a {

        /* compiled from: PersonFormActor.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/a$a$a;", "Lcom/avito/android/mortgage/person_form/mvi/a$a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.mortgage.person_form.mvi.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C5954a implements InterfaceC5953a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C5954a f200905a = new C5954a();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C5954a);
            }

            public final int hashCode() {
                return -474810136;
            }

            @Y61.k
            public final String toString() {
                return "PassThrough";
            }
        }

        /* compiled from: PersonFormActor.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/a$a$b;", "Lcom/avito/android/mortgage/person_form/mvi/a$a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.mortgage.person_form.mvi.a$a$b */
        public static final /* data */ class b implements InterfaceC5953a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f200906a = new b();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1442007069;
            }

            @Y61.k
            public final String toString() {
                return "Process";
            }
        }
    }

    /* compiled from: PersonFormActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$flowWithMutablePrivateStateAccess$1", f = "PersonFormActor.kt", i = {}, l = {428}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.mortgage.person_form.mvi.a$b */
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super PersonFormInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f200907q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f200908r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ SuspendLambda f200909s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.arch.mvi.utils.n<F00.a, ?, F00.c> f200910t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ F00.c f200911u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.q<? super InterfaceC43172j<? super PersonFormInternalAction>, ? super com.avito.android.arch.mvi.utils.l<F00.a>, ? super Continuation<? super G0>, ? extends Object> qVar, com.avito.android.arch.mvi.utils.n<F00.a, ?, F00.c> nVar, F00.c cVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f200909s = (SuspendLambda) qVar;
            this.f200910t = nVar;
            this.f200911u = cVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f200909s, this.f200910t, this.f200911u, continuation);
            bVar.f200908r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [Y41.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f200907q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f200908r;
                o.a aVarA = this.f200910t.a(this.f200911u);
                this.f200907q = 1;
                if (this.f200909s.invoke(interfaceC43172j, aVarA, this) == coroutine_suspended) {
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

    /* compiled from: PersonFormActor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lcom/avito/android/arch/mvi/utils/l;", "LF00/a;", "privateState", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/l;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$process$10", f = "PersonFormActor.kt", i = {0, 0, 0, 1, 1}, l = {191, 192, 193}, m = "invokeSuspend", n = {"$this$flowWithMutablePrivateStateAccess", "privateState", "processId", "$this$flowWithMutablePrivateStateAccess", "privateState"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    /* renamed from: com.avito.android.mortgage.person_form.mvi.a$c */
    public static final class c extends SuspendLambda implements Y41.q<InterfaceC43172j<? super PersonFormInternalAction>, com.avito.android.arch.mvi.utils.l<F00.a>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public String f200912q;

        /* renamed from: r, reason: collision with root package name */
        public int f200913r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f200914s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ com.avito.android.arch.mvi.utils.l f200915t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ C32649a f200916u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ E00.b f200917v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ G00.c f200918w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(E00.b bVar, G00.c cVar, C32649a c32649a, Continuation continuation) {
            super(3, continuation);
            this.f200916u = c32649a;
            this.f200917v = bVar;
            this.f200918w = cVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.l<F00.a> lVar, Continuation<? super G0> continuation) {
            C32649a c32649a = this.f200916u;
            c cVar = new c(this.f200917v, this.f200918w, c32649a, continuation);
            cVar.f200914s = interfaceC43172j;
            cVar.f200915t = lVar;
            return cVar.invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00d6 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r14.f200913r
                com.avito.android.mortgage.person_form.mvi.a r2 = r14.f200916u
                r3 = 0
                r4 = 3
                r5 = 2
                r6 = 1
                E00.b r7 = r14.f200917v
                if (r1 == 0) goto L37
                if (r1 == r6) goto L2c
                if (r1 == r5) goto L23
                if (r1 != r4) goto L1b
                kotlin.C42729a0.b(r15)
                goto Ld7
            L1b:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L23:
                com.avito.android.arch.mvi.utils.l r1 = r14.f200915t
                kotlinx.coroutines.flow.j r5 = r14.f200914s
                kotlin.C42729a0.b(r15)
                goto Lba
            L2c:
                java.lang.String r1 = r14.f200912q
                com.avito.android.arch.mvi.utils.l r6 = r14.f200915t
                kotlinx.coroutines.flow.j r8 = r14.f200914s
                kotlin.C42729a0.b(r15)
                r15 = r8
                goto L9f
            L37:
                kotlin.C42729a0.b(r15)
                kotlinx.coroutines.flow.j r15 = r14.f200914s
                com.avito.android.arch.mvi.utils.l r1 = r14.f200915t
                com.avito.android.mortgage.person_form.mvi.H r8 = r2.f200900f
                java.lang.Object r9 = r1.getValue()
                F00.a r9 = (F00.a) r9
                java.util.List<LZ.c> r9 = r9.f4470a
                r10 = r7
                E00.b$w r10 = (E00.b.w) r10
                java.lang.String r11 = r10.f3644b
                boolean r12 = r10.f3645c
                r8.getClass()
                com.avito.android.mortgage.person_form.mvi.G r13 = new com.avito.android.mortgage.person_form.mvi.G
                r13.<init>(r8, r12)
                java.util.List r9 = com.avito.android.mortgage.person_form.mvi.H.l(r13, r11, r9)
                java.util.ArrayList r9 = r8.g(r9, r6)
                java.util.List r8 = r8.f(r9)
                com.avito.android.mortgage.util.d r9 = r2.f200901g
                r9.getClass()
                java.lang.String r9 = com.avito.android.mortgage.util.d.a()
                java.lang.Object r11 = r1.getValue()
                F00.a r11 = (F00.a) r11
                java.lang.String r12 = r10.f3644b
                com.avito.android.mortgage.person_form.mvi.H r13 = r2.f200900f
                r13.getClass()
                java.util.ArrayList r8 = com.avito.android.mortgage.person_form.mvi.H.j(r9, r12, r8)
                r12 = 6
                F00.a r8 = F00.a.a(r11, r8, r3, r12)
                r1.setValue(r8)
                com.avito.android.mortgage.person_form.mvi.entity.PersonFormInternalAction$UpdateStepsByBooleanField r8 = new com.avito.android.mortgage.person_form.mvi.entity.PersonFormInternalAction$UpdateStepsByBooleanField
                java.lang.String r11 = r10.f3644b
                boolean r10 = r10.f3645c
                r8.<init>(r11, r10)
                r14.f200914s = r15
                r14.f200915t = r1
                r14.f200912q = r9
                r14.f200913r = r6
                java.lang.Object r6 = r15.emit(r8, r14)
                if (r6 != r0) goto L9d
                return r0
            L9d:
                r6 = r1
                r1 = r9
            L9f:
                com.avito.android.mortgage.person_form.mvi.entity.PersonFormInternalAction$FieldUpdated r8 = new com.avito.android.mortgage.person_form.mvi.entity.PersonFormInternalAction$FieldUpdated
                r9 = r7
                E00.b$w r9 = (E00.b.w) r9
                java.lang.String r9 = r9.f3644b
                r8.<init>(r9, r1)
                r14.f200914s = r15
                r14.f200915t = r6
                r14.f200912q = r3
                r14.f200913r = r5
                java.lang.Object r1 = r15.emit(r8, r14)
                if (r1 != r0) goto Lb8
                return r0
            Lb8:
                r5 = r15
                r1 = r6
            Lba:
                java.lang.Object r15 = r1.getValue()
                F00.a r15 = (F00.a) r15
                E00.b$w r7 = (E00.b.w) r7
                java.lang.String r1 = r7.f3644b
                G00.c r6 = r14.f200918w
                kotlinx.coroutines.flow.i r15 = r2.g(r6, r15, r1, r3)
                r14.f200914s = r3
                r14.f200915t = r3
                r14.f200913r = r4
                java.lang.Object r15 = kotlinx.coroutines.flow.C43175k.u(r14, r15, r5)
                if (r15 != r0) goto Ld7
                return r0
            Ld7:
                kotlin.G0 r15 = kotlin.G0.f406611a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.person_form.mvi.C32649a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: PersonFormActor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lcom/avito/android/arch/mvi/utils/l;", "LF00/a;", "privateState", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/l;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$process$11", f = "PersonFormActor.kt", i = {0, 0, 0, 1, 1}, l = {JfifUtil.MARKER_RST0, 209, 210}, m = "invokeSuspend", n = {"$this$flowWithMutablePrivateStateAccess", "privateState", "processId", "$this$flowWithMutablePrivateStateAccess", "privateState"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    /* renamed from: com.avito.android.mortgage.person_form.mvi.a$d */
    public static final class d extends SuspendLambda implements Y41.q<InterfaceC43172j<? super PersonFormInternalAction>, com.avito.android.arch.mvi.utils.l<F00.a>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public String f200919q;

        /* renamed from: r, reason: collision with root package name */
        public int f200920r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f200921s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ com.avito.android.arch.mvi.utils.l f200922t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ C32649a f200923u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ E00.b f200924v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ G00.c f200925w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(E00.b bVar, G00.c cVar, C32649a c32649a, Continuation continuation) {
            super(3, continuation);
            this.f200923u = c32649a;
            this.f200924v = bVar;
            this.f200925w = cVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.l<F00.a> lVar, Continuation<? super G0> continuation) {
            C32649a c32649a = this.f200923u;
            d dVar = new d(this.f200924v, this.f200925w, c32649a, continuation);
            dVar.f200921s = interfaceC43172j;
            dVar.f200922t = lVar;
            return dVar.invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00c6 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r14.f200920r
                com.avito.android.mortgage.person_form.mvi.a r2 = r14.f200923u
                r3 = 0
                r4 = 3
                r5 = 2
                r6 = 1
                E00.b r7 = r14.f200924v
                if (r1 == 0) goto L37
                if (r1 == r6) goto L2c
                if (r1 == r5) goto L23
                if (r1 != r4) goto L1b
                kotlin.C42729a0.b(r15)
                goto Lc7
            L1b:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L23:
                com.avito.android.arch.mvi.utils.l r1 = r14.f200922t
                kotlinx.coroutines.flow.j r5 = r14.f200921s
                kotlin.C42729a0.b(r15)
                goto Laa
            L2c:
                java.lang.String r1 = r14.f200919q
                com.avito.android.arch.mvi.utils.l r6 = r14.f200922t
                kotlinx.coroutines.flow.j r8 = r14.f200921s
                kotlin.C42729a0.b(r15)
                r15 = r8
                goto L8f
            L37:
                kotlin.C42729a0.b(r15)
                kotlinx.coroutines.flow.j r15 = r14.f200921s
                com.avito.android.arch.mvi.utils.l r1 = r14.f200922t
                com.avito.android.mortgage.person_form.mvi.H r8 = r2.f200900f
                java.lang.Object r9 = r1.getValue()
                F00.a r9 = (F00.a) r9
                java.util.List<LZ.c> r9 = r9.f4470a
                r10 = r7
                E00.b$z r10 = (E00.b.z) r10
                java.lang.String r11 = r10.f3654b
                java.lang.String r12 = r10.f3655c
                java.util.List r8 = r8.i(r11, r12, r9)
                com.avito.android.mortgage.util.d r9 = r2.f200901g
                r9.getClass()
                java.lang.String r9 = com.avito.android.mortgage.util.d.a()
                java.lang.Object r11 = r1.getValue()
                F00.a r11 = (F00.a) r11
                java.lang.String r12 = r10.f3654b
                com.avito.android.mortgage.person_form.mvi.H r13 = r2.f200900f
                r13.getClass()
                java.util.ArrayList r8 = com.avito.android.mortgage.person_form.mvi.H.j(r9, r12, r8)
                r12 = 6
                F00.a r8 = F00.a.a(r11, r8, r3, r12)
                r1.setValue(r8)
                com.avito.android.mortgage.person_form.mvi.entity.PersonFormInternalAction$UpdateStepsByStringField r8 = new com.avito.android.mortgage.person_form.mvi.entity.PersonFormInternalAction$UpdateStepsByStringField
                java.lang.String r11 = r10.f3654b
                java.lang.String r10 = r10.f3655c
                r8.<init>(r11, r10)
                r14.f200921s = r15
                r14.f200922t = r1
                r14.f200919q = r9
                r14.f200920r = r6
                java.lang.Object r6 = r15.emit(r8, r14)
                if (r6 != r0) goto L8d
                return r0
            L8d:
                r6 = r1
                r1 = r9
            L8f:
                com.avito.android.mortgage.person_form.mvi.entity.PersonFormInternalAction$FieldUpdated r8 = new com.avito.android.mortgage.person_form.mvi.entity.PersonFormInternalAction$FieldUpdated
                r9 = r7
                E00.b$z r9 = (E00.b.z) r9
                java.lang.String r9 = r9.f3654b
                r8.<init>(r9, r1)
                r14.f200921s = r15
                r14.f200922t = r6
                r14.f200919q = r3
                r14.f200920r = r5
                java.lang.Object r1 = r15.emit(r8, r14)
                if (r1 != r0) goto La8
                return r0
            La8:
                r5 = r15
                r1 = r6
            Laa:
                java.lang.Object r15 = r1.getValue()
                F00.a r15 = (F00.a) r15
                E00.b$z r7 = (E00.b.z) r7
                java.lang.String r1 = r7.f3654b
                G00.c r6 = r14.f200925w
                kotlinx.coroutines.flow.i r15 = r2.g(r6, r15, r1, r3)
                r14.f200921s = r3
                r14.f200922t = r3
                r14.f200920r = r4
                java.lang.Object r15 = kotlinx.coroutines.flow.C43175k.u(r14, r15, r5)
                if (r15 != r0) goto Lc7
                return r0
            Lc7:
                kotlin.G0 r15 = kotlin.G0.f406611a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.person_form.mvi.C32649a.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: PersonFormActor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lcom/avito/android/arch/mvi/utils/l;", "LF00/a;", "privateState", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/l;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$process$12", f = "PersonFormActor.kt", i = {0, 0}, l = {223, 224}, m = "invokeSuspend", n = {"$this$flowWithMutablePrivateStateAccess", "privateState"}, s = {"L$0", "L$1"})
    /* renamed from: com.avito.android.mortgage.person_form.mvi.a$e */
    public static final class e extends SuspendLambda implements Y41.q<InterfaceC43172j<? super PersonFormInternalAction>, com.avito.android.arch.mvi.utils.l<F00.a>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f200926q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f200927r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ com.avito.android.arch.mvi.utils.l f200928s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ E00.b f200929t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ C32649a f200930u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ G00.c f200931v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(E00.b bVar, G00.c cVar, C32649a c32649a, Continuation continuation) {
            super(3, continuation);
            this.f200929t = bVar;
            this.f200930u = c32649a;
            this.f200931v = cVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.l<F00.a> lVar, Continuation<? super G0> continuation) {
            E00.b bVar = this.f200929t;
            C32649a c32649a = this.f200930u;
            e eVar = new e(bVar, this.f200931v, c32649a, continuation);
            eVar.f200927r = interfaceC43172j;
            eVar.f200928s = lVar;
            return eVar.invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            com.avito.android.arch.mvi.utils.l lVar;
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f200926q;
            C32649a c32649a = this.f200930u;
            E00.b bVar = this.f200929t;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j2 = this.f200927r;
                lVar = this.f200928s;
                b.C c12 = (b.C) bVar;
                SelectItem.Option option = (SelectItem.Option) C42745f0.G(c12.f3613c);
                lVar.setValue(F00.a.a((F00.a) lVar.getValue(), c32649a.f200900f.i(c12.f3612b, option != null ? option.f200754b : null, ((F00.a) lVar.getValue()).f4470a), null, 6));
                PersonFormInternalAction.UpdateStepsByStringField updateStepsByStringField = new PersonFormInternalAction.UpdateStepsByStringField(c12.f3612b, option != null ? option.f200754b : null);
                this.f200927r = interfaceC43172j2;
                this.f200928s = lVar;
                this.f200926q = 1;
                if (interfaceC43172j2.emit(updateStepsByStringField, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interfaceC43172j = interfaceC43172j2;
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                lVar = this.f200928s;
                interfaceC43172j = this.f200927r;
                C42729a0.b(obj);
            }
            InterfaceC43160i<PersonFormInternalAction> interfaceC43160iG = c32649a.g(this.f200931v, (F00.a) lVar.getValue(), ((b.C) bVar).f3612b, null);
            this.f200927r = null;
            this.f200928s = null;
            this.f200926q = 2;
            if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PersonFormActor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lcom/avito/android/arch/mvi/utils/l;", "LF00/a;", "privateState", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/l;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$process$13", f = "PersonFormActor.kt", i = {}, l = {236}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.mortgage.person_form.mvi.a$f */
    public static final class f extends SuspendLambda implements Y41.q<InterfaceC43172j<? super PersonFormInternalAction>, com.avito.android.arch.mvi.utils.l<F00.a>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f200932q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f200933r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ com.avito.android.arch.mvi.utils.l f200934s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C32649a f200935t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ E00.b f200936u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ G00.c f200937v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(E00.b bVar, G00.c cVar, C32649a c32649a, Continuation continuation) {
            super(3, continuation);
            this.f200935t = c32649a;
            this.f200936u = bVar;
            this.f200937v = cVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.l<F00.a> lVar, Continuation<? super G0> continuation) {
            C32649a c32649a = this.f200935t;
            f fVar = new f(this.f200936u, this.f200937v, c32649a, continuation);
            fVar.f200933r = interfaceC43172j;
            fVar.f200934s = lVar;
            return fVar.invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to find 'out' block for switch in B:57:0x00fe. Please report as an issue. */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:112:0x01cf A[PHI: r18
  0x01cf: PHI (r18v8 java.util.Iterator) = (r18v0 java.util.Iterator), (r18v1 java.util.Iterator), (r18v9 java.util.Iterator) binds: [B:111:0x01cd, B:107:0x01b6, B:58:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 596
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.person_form.mvi.C32649a.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: PersonFormActor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lcom/avito/android/arch/mvi/utils/l;", "LF00/a;", "privateState", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/l;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$process$14", f = "PersonFormActor.kt", i = {}, l = {251}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.mortgage.person_form.mvi.a$g */
    public static final class g extends SuspendLambda implements Y41.q<InterfaceC43172j<? super PersonFormInternalAction>, com.avito.android.arch.mvi.utils.l<F00.a>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f200938q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f200939r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ com.avito.android.arch.mvi.utils.l f200940s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C32649a f200941t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ E00.b f200942u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(E00.b bVar, C32649a c32649a, Continuation continuation) {
            super(3, continuation);
            this.f200941t = c32649a;
            this.f200942u = bVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.l<F00.a> lVar, Continuation<? super G0> continuation) {
            C32649a c32649a = this.f200941t;
            g gVar = new g(this.f200942u, c32649a, continuation);
            gVar.f200939r = interfaceC43172j;
            gVar.f200940s = lVar;
            return gVar.invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object next;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f200938q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f200939r;
                com.avito.android.arch.mvi.utils.l lVar = this.f200940s;
                C32649a c32649a = this.f200941t;
                H h12 = c32649a.f200900f;
                List<LZ.c> list = ((F00.a) lVar.getValue()).f4470a;
                b.g gVar = (b.g) this.f200942u;
                String str = gVar.f3626b;
                Suggestion suggestion = gVar.f3627c;
                h12.getClass();
                Iterator<LZ.c> it = list.iterator();
                int i13 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i13 = -1;
                        break;
                    }
                    if (kotlin.jvm.internal.L.f(it.next().f9996b.getId(), str)) {
                        break;
                    }
                    i13++;
                }
                LZ.c cVar = (LZ.c) C42745f0.K(i13, list);
                if (cVar != null) {
                    List<LZ.c> list2 = list;
                    ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
                    for (LZ.c cVarA : list2) {
                        if (kotlin.jvm.internal.L.f(cVarA.f9996b.getName(), cVar.f9996b.getName())) {
                            com.avito.android.mortgage.api.model.items.form.d dVar = cVarA.f9996b;
                            if (dVar instanceof SuggestFormContentItemValue) {
                                cVarA = LZ.c.a(cVar, ((SuggestFormContentItemValue) dVar).c());
                            }
                        }
                        arrayList.add(cVarA);
                    }
                    list = arrayList;
                }
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (kotlin.jvm.internal.L.f(((LZ.c) next).f9996b.getId(), str)) {
                        break;
                    }
                }
                LZ.c cVar2 = (LZ.c) next;
                com.avito.android.mortgage.api.model.items.form.d dVar2 = cVar2 != null ? cVar2.f9996b : null;
                SuggestFormContentItemValue suggestFormContentItemValue = dVar2 instanceof SuggestFormContentItemValue ? (SuggestFormContentItemValue) dVar2 : null;
                List<String> listE = suggestFormContentItemValue != null ? suggestFormContentItemValue.e() : null;
                if (listE == null) {
                    listE = C42784z0.f406748b;
                }
                List listF = h12.f(h12.g(h12.c(list, suggestion, listE), true));
                c32649a.f200901g.getClass();
                String strA = com.avito.android.mortgage.util.d.a();
                F00.a aVar = (F00.a) lVar.getValue();
                String str2 = gVar.f3626b;
                c32649a.f200900f.getClass();
                lVar.setValue(F00.a.a(aVar, H.j(strA, str2, listF), null, 6));
                PersonFormInternalAction.DiscloseSuggestionClicked discloseSuggestionClicked = new PersonFormInternalAction.DiscloseSuggestionClicked(gVar.f3626b, strA);
                this.f200939r = null;
                this.f200938q = 1;
                if (interfaceC43172j.emit(discloseSuggestionClicked, this) == coroutine_suspended) {
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

    /* compiled from: PersonFormActor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lcom/avito/android/arch/mvi/utils/l;", "LF00/a;", "privateState", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/l;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$process$15", f = "PersonFormActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.mortgage.person_form.mvi.a$h */
    public static final class h extends SuspendLambda implements Y41.q<InterfaceC43172j<? super PersonFormInternalAction>, com.avito.android.arch.mvi.utils.l<F00.a>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ com.avito.android.arch.mvi.utils.l f200943q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C32649a f200944r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ E00.b f200945s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(E00.b bVar, C32649a c32649a, Continuation continuation) {
            super(3, continuation);
            this.f200944r = c32649a;
            this.f200945s = bVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.l<F00.a> lVar, Continuation<? super G0> continuation) {
            C32649a c32649a = this.f200944r;
            h hVar = new h(this.f200945s, c32649a, continuation);
            hVar.f200943q = lVar;
            return hVar.invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            com.avito.android.arch.mvi.utils.l lVar = this.f200943q;
            H h12 = this.f200944r.f200900f;
            List<LZ.c> list = ((F00.a) lVar.getValue()).f4470a;
            String str = ((b.v) this.f200945s).f3643b;
            h12.getClass();
            Iterator<LZ.c> it = list.iterator();
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                }
                if (kotlin.jvm.internal.L.f(it.next().f9996b.getId(), str)) {
                    break;
                }
                i12++;
            }
            LZ.c cVar = (LZ.c) C42745f0.K(i12, list);
            if (cVar != null) {
                List<LZ.c> list2 = list;
                ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
                for (LZ.c cVarA : list2) {
                    if (kotlin.jvm.internal.L.f(cVarA.f9996b.getName(), cVar.f9996b.getName())) {
                        com.avito.android.mortgage.api.model.items.form.d dVar = cVarA.f9996b;
                        if (dVar instanceof SuggestFormContentItemValue) {
                            cVarA = LZ.c.a(cVar, SuggestFormContentItemValue.a((SuggestFormContentItemValue) dVar, false, false, null, false, true, false, null, null, 15728639));
                        }
                    }
                    arrayList.add(cVarA);
                }
                list = arrayList;
            }
            lVar.setValue(F00.a.a((F00.a) lVar.getValue(), list, null, 6));
            return G0.f406611a;
        }
    }

    /* compiled from: PersonFormActor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lcom/avito/android/arch/mvi/utils/l;", "LF00/a;", "privateState", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/l;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$process$16", f = "PersonFormActor.kt", i = {}, l = {271}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.mortgage.person_form.mvi.a$i */
    public static final class i extends SuspendLambda implements Y41.q<InterfaceC43172j<? super PersonFormInternalAction>, com.avito.android.arch.mvi.utils.l<F00.a>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f200946q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f200947r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ com.avito.android.arch.mvi.utils.l f200948s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C32649a f200949t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ E00.b f200950u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(E00.b bVar, C32649a c32649a, Continuation continuation) {
            super(3, continuation);
            this.f200949t = c32649a;
            this.f200950u = bVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.l<F00.a> lVar, Continuation<? super G0> continuation) {
            C32649a c32649a = this.f200949t;
            i iVar = new i(this.f200950u, c32649a, continuation);
            iVar.f200947r = interfaceC43172j;
            iVar.f200948s = lVar;
            return iVar.invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f200946q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f200947r;
                com.avito.android.arch.mvi.utils.l lVar = this.f200948s;
                C32649a c32649a = this.f200949t;
                c32649a.f200901g.getClass();
                String strA = com.avito.android.mortgage.util.d.a();
                F00.a aVar = (F00.a) lVar.getValue();
                List<LZ.c> list = ((F00.a) lVar.getValue()).f4470a;
                b.C13466d c13466d = (b.C13466d) this.f200950u;
                String str = c13466d.f3619c;
                String str2 = c13466d.f3618b;
                String str3 = c13466d.f3620d;
                c32649a.f200900f.getClass();
                lVar.setValue(F00.a.a(aVar, H.e(strA, str, str2, str3, list), null, 6));
                PersonFormInternalAction.InputFieldClicked inputFieldClicked = new PersonFormInternalAction.InputFieldClicked(c13466d.f3620d, strA);
                this.f200947r = null;
                this.f200946q = 1;
                if (interfaceC43172j.emit(inputFieldClicked, this) == coroutine_suspended) {
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

    /* compiled from: PersonFormActor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lcom/avito/android/arch/mvi/utils/x;", "LF00/a;", "privateState", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/x;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$process$17", f = "PersonFormActor.kt", i = {}, l = {275}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.mortgage.person_form.mvi.a$j */
    public static final class j extends SuspendLambda implements Y41.q<InterfaceC43172j<? super PersonFormInternalAction>, com.avito.android.arch.mvi.utils.x<F00.a>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f200951q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f200952r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ com.avito.android.arch.mvi.utils.x f200953s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C32649a f200954t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ G00.c f200955u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ E00.b f200956v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(E00.b bVar, G00.c cVar, C32649a c32649a, Continuation continuation) {
            super(3, continuation);
            this.f200954t = c32649a;
            this.f200955u = cVar;
            this.f200956v = bVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.x<F00.a> xVar, Continuation<? super G0> continuation) {
            C32649a c32649a = this.f200954t;
            G00.c cVar = this.f200955u;
            j jVar = new j(this.f200956v, cVar, c32649a, continuation);
            jVar.f200952r = interfaceC43172j;
            jVar.f200953s = xVar;
            return jVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f200951q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f200952r;
                F00.a aVar = (F00.a) this.f200953s.getValue();
                b.e eVar = (b.e) this.f200956v;
                InterfaceC43160i<PersonFormInternalAction> interfaceC43160iG = this.f200954t.g(this.f200955u, aVar, eVar.f3623d, eVar.f3624e);
                this.f200952r = null;
                this.f200951q = 1;
                if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
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

    /* compiled from: PersonFormActor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lcom/avito/android/arch/mvi/utils/l;", "LF00/a;", "privateState", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/l;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$process$18", f = "PersonFormActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.mortgage.person_form.mvi.a$k */
    public static final class k extends SuspendLambda implements Y41.q<InterfaceC43172j<? super PersonFormInternalAction>, com.avito.android.arch.mvi.utils.l<F00.a>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ com.avito.android.arch.mvi.utils.l f200957q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C32649a f200958r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ E00.b f200959s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(E00.b bVar, C32649a c32649a, Continuation continuation) {
            super(3, continuation);
            this.f200958r = c32649a;
            this.f200959s = bVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.l<F00.a> lVar, Continuation<? super G0> continuation) {
            C32649a c32649a = this.f200958r;
            k kVar = new k(this.f200959s, c32649a, continuation);
            kVar.f200957q = lVar;
            return kVar.invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            com.avito.android.arch.mvi.utils.l lVar = this.f200957q;
            H h12 = this.f200958r.f200900f;
            List<LZ.c> list = ((F00.a) lVar.getValue()).f4470a;
            b.y yVar = (b.y) this.f200959s;
            String str = yVar.f3652c;
            String str2 = yVar.f3651b;
            String str3 = yVar.f3653d;
            h12.getClass();
            lVar.setValue(F00.a.a((F00.a) lVar.getValue(), h12.f(h12.g(H.l(new z(h12, str2, str3), str, list), true)), null, 6));
            return G0.f406611a;
        }
    }

    /* compiled from: PersonFormActor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lcom/avito/android/arch/mvi/utils/l;", "LF00/a;", "privateState", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/l;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$process$19", f = "PersonFormActor.kt", i = {0, 0}, l = {StatusLine.HTTP_PERM_REDIRECT, 309}, m = "invokeSuspend", n = {"$this$flowWithMutablePrivateStateAccess", "privateState"}, s = {"L$0", "L$1"})
    /* renamed from: com.avito.android.mortgage.person_form.mvi.a$l */
    public static final class l extends SuspendLambda implements Y41.q<InterfaceC43172j<? super PersonFormInternalAction>, com.avito.android.arch.mvi.utils.l<F00.a>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f200960q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f200961r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ com.avito.android.arch.mvi.utils.l f200962s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C32649a f200963t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ E00.b f200964u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ G00.c f200965v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(E00.b bVar, G00.c cVar, C32649a c32649a, Continuation continuation) {
            super(3, continuation);
            this.f200963t = c32649a;
            this.f200964u = bVar;
            this.f200965v = cVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.l<F00.a> lVar, Continuation<? super G0> continuation) {
            C32649a c32649a = this.f200963t;
            l lVar2 = new l(this.f200964u, this.f200965v, c32649a, continuation);
            lVar2.f200961r = interfaceC43172j;
            lVar2.f200962s = lVar;
            return lVar2.invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            com.avito.android.arch.mvi.utils.l lVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f200960q;
            E00.b bVar = this.f200964u;
            C32649a c32649a = this.f200963t;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j2 = this.f200961r;
                com.avito.android.arch.mvi.utils.l lVar2 = this.f200962s;
                H h12 = c32649a.f200900f;
                List<LZ.c> list = ((F00.a) lVar2.getValue()).f4470a;
                b.x xVar = (b.x) bVar;
                String str = xVar.f3647c;
                String str2 = xVar.f3646b;
                boolean z12 = xVar.f3650f;
                h12.getClass();
                List listF = h12.f(h12.g(H.l(new A(h12, str2, z12), str, list), true));
                c32649a.f200901g.getClass();
                String strA = com.avito.android.mortgage.util.d.a();
                F00.a aVar = (F00.a) lVar2.getValue();
                String str3 = xVar.f3647c;
                String str4 = xVar.f3646b;
                String str5 = xVar.f3648d;
                c32649a.f200900f.getClass();
                lVar2.setValue(F00.a.a(aVar, H.e(strA, str3, str4, str5, listF), null, 6));
                PersonFormInternalAction.FieldUpdated fieldUpdated = new PersonFormInternalAction.FieldUpdated(xVar.f3648d, strA);
                this.f200961r = interfaceC43172j2;
                this.f200962s = lVar2;
                this.f200960q = 1;
                if (interfaceC43172j2.emit(fieldUpdated, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interfaceC43172j = interfaceC43172j2;
                lVar = lVar2;
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                lVar = this.f200962s;
                interfaceC43172j = this.f200961r;
                C42729a0.b(obj);
            }
            b.x xVar2 = (b.x) bVar;
            InterfaceC43160i<PersonFormInternalAction> interfaceC43160iG = c32649a.g(this.f200965v, (F00.a) lVar.getValue(), xVar2.f3648d, xVar2.f3649e);
            this.f200961r = null;
            this.f200962s = null;
            this.f200960q = 2;
            if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PersonFormActor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lcom/avito/android/arch/mvi/utils/l;", "LF00/a;", "privateState", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/l;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$process$20", f = "PersonFormActor.kt", i = {}, l = {320}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.mortgage.person_form.mvi.a$m */
    public static final class m extends SuspendLambda implements Y41.q<InterfaceC43172j<? super PersonFormInternalAction>, com.avito.android.arch.mvi.utils.l<F00.a>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f200966q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f200967r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ com.avito.android.arch.mvi.utils.l f200968s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C32649a f200969t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ E00.b f200970u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ G00.c f200971v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(E00.b bVar, G00.c cVar, C32649a c32649a, Continuation continuation) {
            super(3, continuation);
            this.f200969t = c32649a;
            this.f200970u = bVar;
            this.f200971v = cVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.l<F00.a> lVar, Continuation<? super G0> continuation) {
            C32649a c32649a = this.f200969t;
            m mVar = new m(this.f200970u, this.f200971v, c32649a, continuation);
            mVar.f200967r = interfaceC43172j;
            mVar.f200968s = lVar;
            return mVar.invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f200966q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f200967r;
                com.avito.android.arch.mvi.utils.l lVar = this.f200968s;
                C32649a c32649a = this.f200969t;
                H h12 = c32649a.f200900f;
                List<LZ.c> list = ((F00.a) lVar.getValue()).f4470a;
                b.C0208b c0208b = (b.C0208b) this.f200970u;
                String str = c0208b.f3616b;
                h12.getClass();
                lVar.setValue(F00.a.a((F00.a) lVar.getValue(), H.l(new x(h12), str, list), null, 6));
                InterfaceC43160i<PersonFormInternalAction> interfaceC43160iG = c32649a.g(this.f200971v, (F00.a) lVar.getValue(), c0208b.f3616b, null);
                this.f200967r = null;
                this.f200966q = 1;
                if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
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

    /* compiled from: PersonFormActor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lcom/avito/android/arch/mvi/utils/l;", "LF00/a;", "privateState", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/l;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$process$21", f = "PersonFormActor.kt", i = {}, l = {332}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.mortgage.person_form.mvi.a$n */
    public static final class n extends SuspendLambda implements Y41.q<InterfaceC43172j<? super PersonFormInternalAction>, com.avito.android.arch.mvi.utils.l<F00.a>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f200972q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f200973r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ com.avito.android.arch.mvi.utils.l f200974s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C32649a f200975t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ E00.b f200976u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ G00.c f200977v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(E00.b bVar, G00.c cVar, C32649a c32649a, Continuation continuation) {
            super(3, continuation);
            this.f200975t = c32649a;
            this.f200976u = bVar;
            this.f200977v = cVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.l<F00.a> lVar, Continuation<? super G0> continuation) {
            C32649a c32649a = this.f200975t;
            n nVar = new n(this.f200976u, this.f200977v, c32649a, continuation);
            nVar.f200973r = interfaceC43172j;
            nVar.f200974s = lVar;
            return nVar.invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f200972q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f200973r;
                com.avito.android.arch.mvi.utils.l lVar = this.f200974s;
                C32649a c32649a = this.f200975t;
                H h12 = c32649a.f200900f;
                List<LZ.c> list = ((F00.a) lVar.getValue()).f4470a;
                b.n nVar = (b.n) this.f200976u;
                String str = nVar.f3635c;
                String str2 = nVar.f3634b;
                h12.getClass();
                lVar.setValue(F00.a.a((F00.a) lVar.getValue(), H.l(new y(h12, str2), str, list), null, 6));
                InterfaceC43160i<PersonFormInternalAction> interfaceC43160iG = c32649a.g(this.f200977v, (F00.a) lVar.getValue(), nVar.f3635c, null);
                this.f200973r = null;
                this.f200972q = 1;
                if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
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

    /* compiled from: PersonFormActor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lcom/avito/android/arch/mvi/utils/l;", "LF00/a;", "privateState", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/l;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$process$3", f = "PersonFormActor.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.mortgage.person_form.mvi.a$o */
    public static final class o extends SuspendLambda implements Y41.q<InterfaceC43172j<? super PersonFormInternalAction>, com.avito.android.arch.mvi.utils.l<F00.a>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f200978q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f200979r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ com.avito.android.arch.mvi.utils.l f200980s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C32649a f200981t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ G00.c f200982u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ E00.b f200983v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(E00.b bVar, G00.c cVar, C32649a c32649a, Continuation continuation) {
            super(3, continuation);
            this.f200981t = c32649a;
            this.f200982u = cVar;
            this.f200983v = bVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.l<F00.a> lVar, Continuation<? super G0> continuation) {
            C32649a c32649a = this.f200981t;
            G00.c cVar = this.f200982u;
            o oVar = new o(this.f200983v, cVar, c32649a, continuation);
            oVar.f200979r = interfaceC43172j;
            oVar.f200980s = lVar;
            return oVar.invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f200978q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f200979r;
                com.avito.android.arch.mvi.utils.l lVar = this.f200980s;
                G00.a aVar = ((F00.a) lVar.getValue()).f4471b;
                Integer numBoxInt = aVar != null ? Boxing.boxInt(aVar.f6135b) : null;
                if (numBoxInt == null || numBoxInt.intValue() != 0) {
                    G00.a aVar2 = ((F00.a) lVar.getValue()).f4471b;
                    lVar.setValue(F00.a.a((F00.a) lVar.getValue(), null, aVar2 != null ? G00.a.a(aVar2, 0, -1, false, 5) : null, 5));
                    F00.c cVar = (F00.c) this.f200983v;
                    C32649a c32649a = this.f200981t;
                    c32649a.getClass();
                    InterfaceC43160i interfaceC43160iE = C32649a.e(c32649a.f200904j, cVar, new C32662n(this.f200982u, c32649a, null));
                    this.f200979r = null;
                    this.f200978q = 1;
                    if (C43175k.u(this, interfaceC43160iE, interfaceC43172j) == coroutine_suspended) {
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

    /* compiled from: PersonFormActor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lcom/avito/android/arch/mvi/utils/l;", "LF00/a;", "privateState", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/l;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$process$4", f = "PersonFormActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.mortgage.person_form.mvi.a$p */
    public static final class p extends SuspendLambda implements Y41.q<InterfaceC43172j<? super PersonFormInternalAction>, com.avito.android.arch.mvi.utils.l<F00.a>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ com.avito.android.arch.mvi.utils.l f200984q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ E00.b f200985r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(E00.b bVar, Continuation<? super p> continuation) {
            super(3, continuation);
            this.f200985r = bVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.l<F00.a> lVar, Continuation<? super G0> continuation) {
            p pVar = new p(this.f200985r, continuation);
            pVar.f200984q = lVar;
            return pVar.invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            com.avito.android.arch.mvi.utils.l lVar = this.f200984q;
            G00.a aVar = ((F00.a) lVar.getValue()).f4471b;
            lVar.setValue(F00.a.a((F00.a) lVar.getValue(), null, aVar != null ? G00.a.a(aVar, 0, 0, !((b.k) this.f200985r).f3631b, 3) : null, 5));
            return G0.f406611a;
        }
    }

    /* compiled from: PersonFormActor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lcom/avito/android/arch/mvi/utils/l;", "LF00/a;", "privateState", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/l;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$process$5", f = "PersonFormActor.kt", i = {0, 0}, l = {137, 145}, m = "invokeSuspend", n = {"$this$flowWithMutablePrivateStateAccess", "privateState"}, s = {"L$0", "L$1"})
    /* renamed from: com.avito.android.mortgage.person_form.mvi.a$q */
    public static final class q extends SuspendLambda implements Y41.q<InterfaceC43172j<? super PersonFormInternalAction>, com.avito.android.arch.mvi.utils.l<F00.a>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f200986q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f200987r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ com.avito.android.arch.mvi.utils.l f200988s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C32649a f200989t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ E00.b f200990u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ G00.c f200991v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(E00.b bVar, G00.c cVar, C32649a c32649a, Continuation continuation) {
            super(3, continuation);
            this.f200989t = c32649a;
            this.f200990u = bVar;
            this.f200991v = cVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.l<F00.a> lVar, Continuation<? super G0> continuation) {
            C32649a c32649a = this.f200989t;
            q qVar = new q(this.f200990u, this.f200991v, c32649a, continuation);
            qVar.f200987r = interfaceC43172j;
            qVar.f200988s = lVar;
            return qVar.invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            com.avito.android.arch.mvi.utils.l lVar;
            InterfaceC43172j interfaceC43172j;
            Object next;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f200986q;
            E00.b bVar = this.f200990u;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j2 = this.f200987r;
                lVar = this.f200988s;
                C32649a c32649a = this.f200989t;
                c32649a.f200901g.getClass();
                String strA = com.avito.android.mortgage.util.d.a();
                F00.a aVar = (F00.a) lVar.getValue();
                List<LZ.c> list = ((F00.a) lVar.getValue()).f4470a;
                b.i iVar = (b.i) bVar;
                String str = iVar.f3629b;
                c32649a.f200900f.getClass();
                lVar.setValue(F00.a.a(aVar, H.j(strA, str, list), null, 6));
                PersonFormInternalAction.InputFieldClicked inputFieldClicked = new PersonFormInternalAction.InputFieldClicked(iVar.f3629b, strA);
                this.f200987r = interfaceC43172j2;
                this.f200988s = lVar;
                this.f200986q = 1;
                if (interfaceC43172j2.emit(inputFieldClicked, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interfaceC43172j = interfaceC43172j2;
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                lVar = this.f200988s;
                interfaceC43172j = this.f200987r;
                C42729a0.b(obj);
            }
            Iterator<T> it = ((F00.a) lVar.getValue()).f4470a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (kotlin.jvm.internal.L.f(((LZ.c) next).f9996b.getId(), ((b.i) bVar).f3629b)) {
                    break;
                }
            }
            LZ.c cVar = (LZ.c) next;
            com.avito.android.mortgage.api.model.items.form.d dVar = cVar != null ? cVar.f9996b : null;
            SuggestFormContentItemValue suggestFormContentItemValue = dVar instanceof SuggestFormContentItemValue ? (SuggestFormContentItemValue) dVar : null;
            if (suggestFormContentItemValue == null) {
                return G0.f406611a;
            }
            G00.c cVar2 = this.f200991v;
            String str2 = (String) C42745f0.K(cVar2.f6150h, cVar2.f6149g);
            if (str2 != null) {
                PersonFormInternalAction.OpenSuggestion openSuggestion = new PersonFormInternalAction.OpenSuggestion(suggestFormContentItemValue, str2);
                this.f200987r = null;
                this.f200988s = null;
                this.f200986q = 2;
                if (interfaceC43172j.emit(openSuggestion, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PersonFormActor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lcom/avito/android/arch/mvi/utils/x;", "LF00/a;", "privateState", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/x;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$process$6", f = "PersonFormActor.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.mortgage.person_form.mvi.a$r */
    public static final class r extends SuspendLambda implements Y41.q<InterfaceC43172j<? super PersonFormInternalAction>, com.avito.android.arch.mvi.utils.x<F00.a>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f200992q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f200993r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ com.avito.android.arch.mvi.utils.x f200994s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C32649a f200995t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ G00.c f200996u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ E00.b f200997v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(E00.b bVar, G00.c cVar, C32649a c32649a, Continuation continuation) {
            super(3, continuation);
            this.f200995t = c32649a;
            this.f200996u = cVar;
            this.f200997v = bVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.x<F00.a> xVar, Continuation<? super G0> continuation) {
            C32649a c32649a = this.f200995t;
            G00.c cVar = this.f200996u;
            r rVar = new r(this.f200997v, cVar, c32649a, continuation);
            rVar.f200993r = interfaceC43172j;
            rVar.f200994s = xVar;
            return rVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f200992q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f200993r;
                InterfaceC43160i<PersonFormInternalAction> interfaceC43160iG = this.f200995t.g(this.f200996u, (F00.a) this.f200994s.getValue(), ((b.j) this.f200997v).f3630b, null);
                this.f200993r = null;
                this.f200992q = 1;
                if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
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

    /* compiled from: PersonFormActor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lcom/avito/android/arch/mvi/utils/l;", "LF00/a;", "privateState", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/l;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$process$7", f = "PersonFormActor.kt", i = {0, 0}, l = {158}, m = "invokeSuspend", n = {"privateState", "processId"}, s = {"L$0", "L$1"})
    /* renamed from: com.avito.android.mortgage.person_form.mvi.a$s */
    public static final class s extends SuspendLambda implements Y41.q<InterfaceC43172j<? super PersonFormInternalAction>, com.avito.android.arch.mvi.utils.l<F00.a>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f200998q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f200999r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f201000s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ E00.b f201001t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ C32649a f201002u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(E00.b bVar, C32649a c32649a, Continuation<? super s> continuation) {
            super(3, continuation);
            this.f201001t = bVar;
            this.f201002u = c32649a;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.l<F00.a> lVar, Continuation<? super G0> continuation) {
            s sVar = new s(this.f201001t, this.f201002u, continuation);
            sVar.f200999r = interfaceC43172j;
            sVar.f201000s = lVar;
            return sVar.invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            com.avito.android.arch.mvi.utils.l lVar;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f200998q;
            C32649a c32649a = this.f201002u;
            E00.b bVar = this.f201001t;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f200999r;
                com.avito.android.arch.mvi.utils.l lVar2 = (com.avito.android.arch.mvi.utils.l) this.f201000s;
                b.t tVar = (b.t) bVar;
                if (!(tVar.f3641b instanceof SelectItem)) {
                    return G0.f406611a;
                }
                c32649a.f200901g.getClass();
                String strA = com.avito.android.mortgage.util.d.a();
                SelectItem selectItem = (SelectItem) tVar.f3641b;
                List<SelectItem.Option> list = selectItem.f200749h;
                boolean z12 = list.size() > 10;
                PersonFormInternalAction.OpenSelector openSelector = new PersonFormInternalAction.OpenSelector(tVar.f3641b.getF84108c(), new Arguments(false, selectItem.f200743b, null, list, C42745f0.V(selectItem.f200750i), selectItem.f200744c, null, z12, false, false, false, selectItem.f200751j, true, false, false, null, false, null, null, null, null, false, false, false, false, false, false, false, null, null, null, false, false, null, false, z12, false, 0, null, null, -7867, 247, null), strA);
                this.f200999r = lVar2;
                this.f201000s = strA;
                this.f200998q = 1;
                if (interfaceC43172j.emit(openSelector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                lVar = lVar2;
                str = strA;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.f201000s;
                lVar = (com.avito.android.arch.mvi.utils.l) this.f200999r;
                C42729a0.b(obj);
            }
            F00.a aVar = (F00.a) lVar.getValue();
            H h12 = c32649a.f200900f;
            List<LZ.c> list2 = ((F00.a) lVar.getValue()).f4470a;
            String f84108c = ((b.t) bVar).f3641b.getF84108c();
            h12.getClass();
            lVar.setValue(F00.a.a(aVar, H.j(str, f84108c, list2), null, 6));
            return G0.f406611a;
        }
    }

    /* compiled from: PersonFormActor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lcom/avito/android/arch/mvi/utils/x;", "LF00/a;", "privateState", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/x;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$process$8", f = "PersonFormActor.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.mortgage.person_form.mvi.a$t */
    public static final class t extends SuspendLambda implements Y41.q<InterfaceC43172j<? super PersonFormInternalAction>, com.avito.android.arch.mvi.utils.x<F00.a>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f201003q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f201004r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ com.avito.android.arch.mvi.utils.x f201005s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C32649a f201006t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ G00.c f201007u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ E00.b f201008v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(E00.b bVar, G00.c cVar, C32649a c32649a, Continuation continuation) {
            super(3, continuation);
            this.f201006t = c32649a;
            this.f201007u = cVar;
            this.f201008v = bVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.x<F00.a> xVar, Continuation<? super G0> continuation) {
            C32649a c32649a = this.f201006t;
            G00.c cVar = this.f201007u;
            t tVar = new t(this.f201008v, cVar, c32649a, continuation);
            tVar.f201004r = interfaceC43172j;
            tVar.f201005s = xVar;
            return tVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f201003q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f201004r;
                InterfaceC43160i<PersonFormInternalAction> interfaceC43160iG = this.f201006t.g(this.f201007u, (F00.a) this.f201005s.getValue(), ((b.u) this.f201008v).f3642b, null);
                this.f201004r = null;
                this.f201003q = 1;
                if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
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

    /* compiled from: PersonFormActor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lcom/avito/android/arch/mvi/utils/l;", "LF00/a;", "privateState", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/l;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$process$9", f = "PersonFormActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.mortgage.person_form.mvi.a$u */
    public static final class u extends SuspendLambda implements Y41.q<InterfaceC43172j<? super PersonFormInternalAction>, com.avito.android.arch.mvi.utils.l<F00.a>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ com.avito.android.arch.mvi.utils.l f201009q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C32649a f201010r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ E00.b f201011s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(E00.b bVar, C32649a c32649a, Continuation continuation) {
            super(3, continuation);
            this.f201010r = c32649a;
            this.f201011s = bVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.l<F00.a> lVar, Continuation<? super G0> continuation) {
            C32649a c32649a = this.f201010r;
            u uVar = new u(this.f201011s, c32649a, continuation);
            uVar.f201009q = lVar;
            return uVar.invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            com.avito.android.arch.mvi.utils.l lVar = this.f201009q;
            H h12 = this.f201010r.f200900f;
            List<LZ.c> list = ((F00.a) lVar.getValue()).f4470a;
            b.B b12 = (b.B) this.f201011s;
            lVar.setValue(F00.a.a((F00.a) lVar.getValue(), h12.i(b12.f3610b, b12.f3611c, list), null, 6));
            return G0.f406611a;
        }
    }

    @Inject
    public C32649a(@Y61.k com.avito.android.mortgage.person_form.mvi.domain.a aVar, @Y61.k com.avito.android.mortgage.person_form.mvi.domain.e eVar, @Y61.k com.avito.android.mortgage.person_form.mvi.domain.j jVar, @Y61.k com.avito.android.mortgage.person_form.mvi.domain.n nVar, @Y61.k v vVar, @Y61.k H h12, @Y61.k com.avito.android.mortgage.util.d dVar, @Y61.k R0 r02) {
        this.f200895a = aVar;
        this.f200896b = eVar;
        this.f200897c = jVar;
        this.f200898d = nVar;
        this.f200899e = vVar;
        this.f200900f = h12;
        this.f200901g = dVar;
        this.f200902h = r02;
        this.f200903i = U.a(r02.a());
        n.a aVar2 = com.avito.android.arch.mvi.utils.n.f92111a;
        F00.a.f4468d.getClass();
        F00.a aVar3 = F00.a.f4469e;
        aVar2.getClass();
        this.f200904j = new com.avito.android.arch.mvi.utils.o(aVar3);
    }

    public static final int c(C32649a c32649a, List list) {
        c32649a.getClass();
        Iterator it = list.iterator();
        int iP2 = 0;
        while (it.hasNext()) {
            iP2 += ((LZ.c) it.next()).f9996b.P2();
        }
        return iP2;
    }

    public static final void d(C32649a c32649a, com.avito.android.arch.mvi.utils.o oVar, F00.c cVar, Y41.l lVar) {
        c32649a.getClass();
        o.a aVar = oVar.f92114c;
        aVar.setValue(lVar.invoke(aVar.getValue()));
    }

    public static InterfaceC43160i e(com.avito.android.arch.mvi.utils.n nVar, F00.c cVar, Y41.q qVar) {
        return C43175k.G(new b(qVar, nVar, cVar, null));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        v vVar = this.f200899e;
        vVar.getClass();
        com.avito.android.mortgage.person_form.mvi.u uVar = new com.avito.android.mortgage.person_form.mvi.u(this.f200904j.f92113b);
        InterfaceC43160i interfaceC43160iG = C43175k.G(new com.avito.android.mortgage.person_form.mvi.t(vVar, null));
        R0 r02 = vVar.f201328e;
        return C43175k.I(this.f200902h.c(), new C43197r1(new C32654f(aVar, this, null), new C43197r1(new C32663o(this, null), C43175k.C(new C32659k(aVar, this, null), com.avito.android.arch.mvi.utils.h.a(C43175k.N(c43197r1, C43175k.I(r02.c(), C43175k.N(uVar, C43175k.I(r02.a(), interfaceC43160iG), vVar.f201327d.getF201066c()))), C32658j.f201245l)))));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<PersonFormInternalAction> b(@Y61.k E00.b bVar, @Y61.k G00.c cVar) {
        if (bVar instanceof b.h) {
            return C43175k.G(new C32653e(2, null));
        }
        if (bVar instanceof b.f) {
            return C43175k.G(new C32651c(2, null));
        }
        if (bVar instanceof b.l) {
            return C43175k.G(new C32656h(cVar, this, null));
        }
        if (bVar instanceof b.p) {
            return C43175k.G(new C32660l(cVar, this, null));
        }
        boolean z12 = bVar instanceof b.q;
        R0 r02 = this.f200902h;
        if (z12) {
            return C43175k.I(r02.a(), C43175k.G(new C32661m(cVar, this, null)));
        }
        if (bVar instanceof b.m) {
            return C43175k.I(r02.a(), C43175k.G(new C32657i(cVar, this, null)));
        }
        if (bVar instanceof b.C13465c) {
            return C43175k.G(new C32650b(cVar, this, null));
        }
        if (bVar instanceof b.D) {
            return C43175k.G(new C32665q(cVar, this, null));
        }
        if (bVar instanceof b.C13464a) {
            return new C43210w(new PersonFormInternalAction.HandleDeeplink(((b.C13464a) bVar).f3615b));
        }
        if (bVar instanceof b.r) {
            return new C43210w(PersonFormInternalAction.ScrollStarted.f201207b);
        }
        boolean z13 = bVar instanceof b.s;
        com.avito.android.arch.mvi.utils.o oVar = this.f200904j;
        if (z13) {
            return e(oVar, (F00.c) bVar, new C32662n(cVar, this, null));
        }
        if (bVar instanceof b.o) {
            return e(oVar, (F00.c) bVar, new o(bVar, cVar, this, null));
        }
        if (bVar instanceof b.k) {
            return e(oVar, (F00.c) bVar, new p(bVar, null));
        }
        if (bVar instanceof b.i) {
            return e(oVar, (F00.c) bVar, new q(bVar, cVar, this, null));
        }
        if (bVar instanceof b.j) {
            return C43175k.G(new C32652d(new r(bVar, cVar, this, null), oVar, (F00.b) bVar, null));
        }
        if (bVar instanceof b.t) {
            return e(oVar, (F00.c) bVar, new s(bVar, this, null));
        }
        if (bVar instanceof b.u) {
            return C43175k.G(new C32652d(new t(bVar, cVar, this, null), oVar, (F00.b) bVar, null));
        }
        if (bVar instanceof b.B) {
            return e(oVar, (F00.c) bVar, new u(bVar, this, null));
        }
        if (bVar instanceof b.w) {
            return e(oVar, (F00.c) bVar, new c(bVar, cVar, this, null));
        }
        if (bVar instanceof b.z) {
            return e(oVar, (F00.c) bVar, new d(bVar, cVar, this, null));
        }
        if (bVar instanceof b.C) {
            return e(oVar, (F00.c) bVar, new e(bVar, cVar, this, null));
        }
        if (bVar instanceof b.A) {
            return e(oVar, (F00.c) bVar, new f(bVar, cVar, this, null));
        }
        if (bVar instanceof b.g) {
            return e(oVar, (F00.c) bVar, new g(bVar, this, null));
        }
        if (bVar instanceof b.v) {
            return e(oVar, (F00.c) bVar, new h(bVar, this, null));
        }
        if (bVar instanceof b.C13466d) {
            return e(oVar, (F00.c) bVar, new i(bVar, this, null));
        }
        if (bVar instanceof b.e) {
            return C43175k.G(new C32652d(new j(bVar, cVar, this, null), oVar, (F00.b) bVar, null));
        }
        if (bVar instanceof b.y) {
            return e(oVar, (F00.c) bVar, new k(bVar, this, null));
        }
        if (bVar instanceof b.x) {
            return e(oVar, (F00.c) bVar, new l(bVar, cVar, this, null));
        }
        if (bVar instanceof b.C0208b) {
            return e(oVar, (F00.c) bVar, new m(bVar, cVar, this, null));
        }
        if (bVar instanceof b.n) {
            return e(oVar, (F00.c) bVar, new n(bVar, cVar, this, null));
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC43160i<PersonFormInternalAction> g(G00.c cVar, F00.a aVar, String str, String str2) {
        Object next;
        Iterable iterableSingletonList;
        List<LZ.c> list = aVar.f4470a;
        ArrayList arrayList = new ArrayList();
        for (LZ.c cVar2 : list) {
            com.avito.android.mortgage.api.model.items.form.d dVar = cVar2.f9996b;
            if (dVar instanceof LZ.b) {
                List<LZ.a> listD = ((LZ.b) dVar).d();
                ArrayList arrayList2 = new ArrayList();
                for (LZ.a aVar2 : listD) {
                    C42745f0.h(C42745f0.U(new LZ.c(FormContentItemType.INPUT, aVar2.getInput()), new LZ.c(FormContentItemType.CHECKBOX, aVar2.getCheckbox())), arrayList2);
                }
                iterableSingletonList = C42745f0.i0(cVar2, arrayList2);
            } else {
                iterableSingletonList = Collections.singletonList(cVar2);
            }
            C42745f0.h(iterableSingletonList, arrayList);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            LZ.c cVar3 = (LZ.c) next;
            String name = str2 == null ? cVar3.f9996b.getName() : str2;
            if (kotlin.jvm.internal.L.f(cVar3.f9996b.getId(), str) && kotlin.jvm.internal.L.f(cVar3.f9996b.getName(), name)) {
                break;
            }
        }
        LZ.c cVar4 = (LZ.c) next;
        if (cVar4 == null) {
            return C43175k.w();
        }
        return this.f200897c.a(cVar.f6144b, cVar.f6145c, cVar.c(), arrayList, cVar4);
    }
}
