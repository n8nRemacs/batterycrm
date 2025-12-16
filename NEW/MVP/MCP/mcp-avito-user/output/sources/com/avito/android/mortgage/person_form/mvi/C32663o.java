package com.avito.android.mortgage.person_form.mvi;

import com.avito.android.mortgage.person_form.mvi.entity.PersonFormInternalAction;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;

/* compiled from: PersonFormActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "internalAction", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$updateContentStateByInternalAction$1", f = "PersonFormActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.mortgage.person_form.mvi.o, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32663o extends SuspendLambda implements Y41.p<PersonFormInternalAction, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f201280q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C32649a f201281r;

    /* compiled from: PersonFormActor.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LF00/a;", VoiceInfo.STATE, "invoke", "(LF00/a;)LF00/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.mortgage.person_form.mvi.o$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<F00.a, F00.a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C32649a f201282l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ PersonFormInternalAction f201283m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C32649a c32649a, PersonFormInternalAction personFormInternalAction) {
            super(1);
            this.f201282l = c32649a;
            this.f201283m = personFormInternalAction;
        }

        @Override // Y41.l
        public final F00.a invoke(F00.a aVar) {
            F00.a aVar2 = aVar;
            C32649a c32649a = this.f201282l;
            H h12 = c32649a.f200900f;
            Set<com.avito.android.mortgage.person_form.mvi.domain.validators.a> set = ((PersonFormInternalAction.UploadingCompleted) this.f201283m).f201218b;
            h12.getClass();
            Set<com.avito.android.mortgage.person_form.mvi.domain.validators.a> set2 = set;
            int iF2 = P0.f(C42745f0.q(set2, 10));
            if (iF2 < 16) {
                iF2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
            for (Object obj : set2) {
                linkedHashMap.put(((com.avito.android.mortgage.person_form.mvi.domain.validators.a) obj).f201170a, obj);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(P0.f(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry.getKey(), ((com.avito.android.mortgage.person_form.mvi.domain.validators.a) entry.getValue()).f201171b);
            }
            List listF = h12.f(h12.g(H.h(linkedHashMap2, aVar2.f4470a), true));
            int iC2 = C32649a.c(c32649a, listF);
            Integer numValueOf = Integer.valueOf(iC2);
            if (iC2 <= 0) {
                numValueOf = null;
            }
            return new F00.a(listF, numValueOf != null ? new G00.a(numValueOf.intValue(), 0, false, 6, null) : null, numValueOf != null);
        }
    }

    /* compiled from: PersonFormActor.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LF00/a;", VoiceInfo.STATE, "invoke", "(LF00/a;)LF00/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.mortgage.person_form.mvi.o$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<F00.a, F00.a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C32649a f201284l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ PersonFormInternalAction f201285m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C32649a c32649a, PersonFormInternalAction personFormInternalAction) {
            super(1);
            this.f201284l = c32649a;
            this.f201285m = personFormInternalAction;
        }

        @Override // Y41.l
        public final F00.a invoke(F00.a aVar) {
            F00.a aVar2 = aVar;
            C32649a c32649a = this.f201284l;
            H h12 = c32649a.f200900f;
            Set<com.avito.android.mortgage.person_form.mvi.domain.validators.a> set = ((PersonFormInternalAction.FieldUploadingCompleted) this.f201285m).f201181b;
            h12.getClass();
            Set<com.avito.android.mortgage.person_form.mvi.domain.validators.a> set2 = set;
            int iF2 = P0.f(C42745f0.q(set2, 10));
            if (iF2 < 16) {
                iF2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
            for (Object obj : set2) {
                linkedHashMap.put(((com.avito.android.mortgage.person_form.mvi.domain.validators.a) obj).f201170a, obj);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(P0.f(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry.getKey(), ((com.avito.android.mortgage.person_form.mvi.domain.validators.a) entry.getValue()).f201171b);
            }
            List listF = h12.f(h12.g(H.h(linkedHashMap2, aVar2.f4470a), true));
            int iC2 = C32649a.c(c32649a, listF);
            Integer numValueOf = Integer.valueOf(iC2);
            G00.a aVarA = null;
            if (iC2 <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                G00.a aVar3 = aVar2.f4471b;
                if (aVar3 != null) {
                    aVarA = G00.a.a(aVar3, iIntValue, 0, false, 6);
                }
            }
            return F00.a.a(aVar2, listF, aVarA, 4);
        }
    }

    /* compiled from: PersonFormActor.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LF00/a;", VoiceInfo.STATE, "invoke", "(LF00/a;)LF00/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.mortgage.person_form.mvi.o$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<F00.a, F00.a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C32649a f201286l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C32649a c32649a) {
            super(1);
            this.f201286l = c32649a;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        @Override // Y41.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final F00.a invoke(F00.a r6) {
            /*
                r5 = this;
                F00.a r6 = (F00.a) r6
                java.util.List<LZ.c> r0 = r6.f4470a
                com.avito.android.mortgage.person_form.mvi.a r1 = r5.f201286l
                int r0 = com.avito.android.mortgage.person_form.mvi.C32649a.c(r1, r0)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                r2 = 0
                if (r0 <= 0) goto L12
                goto L13
            L12:
                r1 = r2
            L13:
                if (r1 == 0) goto L24
                int r0 = r1.intValue()
                G00.a r1 = r6.f4471b
                if (r1 == 0) goto L24
                r3 = 6
                r4 = 0
                G00.a r0 = G00.a.a(r1, r0, r4, r4, r3)
                goto L25
            L24:
                r0 = r2
            L25:
                r1 = 5
                F00.a r6 = F00.a.a(r6, r2, r0, r1)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.person_form.mvi.C32663o.c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: PersonFormActor.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LF00/a;", VoiceInfo.STATE, "invoke", "(LF00/a;)LF00/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.mortgage.person_form.mvi.o$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<F00.a, F00.a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C32649a f201287l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ PersonFormInternalAction f201288m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C32649a c32649a, PersonFormInternalAction personFormInternalAction) {
            super(1);
            this.f201287l = c32649a;
            this.f201288m = personFormInternalAction;
        }

        @Override // Y41.l
        public final F00.a invoke(F00.a aVar) {
            List<LZ.c> listC = ((PersonFormInternalAction.LoadingCompleted) this.f201288m).f201191b.c();
            C32649a c32649a = this.f201287l;
            H h12 = c32649a.f200900f;
            List listF = h12.f(h12.g(listC, false));
            int iC2 = C32649a.c(c32649a, listF);
            Integer numValueOf = Integer.valueOf(iC2);
            if (iC2 <= 0) {
                numValueOf = null;
            }
            return new F00.a(listF, numValueOf != null ? new G00.a(numValueOf.intValue(), 0, false, 6, null) : null, numValueOf != null);
        }
    }

    /* compiled from: PersonFormActor.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LF00/a;", VoiceInfo.STATE, "invoke", "(LF00/a;)LF00/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.mortgage.person_form.mvi.o$e */
    public static final class e extends kotlin.jvm.internal.N implements Y41.l<F00.a, F00.a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C32649a f201289l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ PersonFormInternalAction f201290m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C32649a c32649a, PersonFormInternalAction personFormInternalAction) {
            super(1);
            this.f201289l = c32649a;
            this.f201290m = personFormInternalAction;
        }

        @Override // Y41.l
        public final F00.a invoke(F00.a aVar) {
            F00.a aVar2 = aVar;
            List<LZ.c> listC = ((PersonFormInternalAction.ReloadingCompleted) this.f201290m).f201203b.c();
            C32649a c32649a = this.f201289l;
            H h12 = c32649a.f200900f;
            List listF = h12.f(h12.g(listC, false));
            int iC2 = C32649a.c(c32649a, listF);
            Integer numValueOf = Integer.valueOf(iC2);
            if (iC2 <= 0) {
                numValueOf = null;
            }
            return F00.a.a(aVar2, listF, numValueOf != null ? new G00.a(numValueOf.intValue(), 0, false, 6, null) : null, 4);
        }
    }

    /* compiled from: PersonFormActor.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LF00/a;", VoiceInfo.STATE, "invoke", "(LF00/a;)LF00/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.mortgage.person_form.mvi.o$f */
    public static final class f extends kotlin.jvm.internal.N implements Y41.l<F00.a, F00.a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C32649a f201291l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ PersonFormInternalAction f201292m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C32649a c32649a, PersonFormInternalAction personFormInternalAction) {
            super(1);
            this.f201291l = c32649a;
            this.f201292m = personFormInternalAction;
        }

        @Override // Y41.l
        public final F00.a invoke(F00.a aVar) {
            F00.a aVar2 = aVar;
            List<LZ.c> listC = ((PersonFormInternalAction.UpdateContent) this.f201292m).f201211b.c();
            C32649a c32649a = this.f201291l;
            H h12 = c32649a.f200900f;
            List listF = h12.f(h12.g(listC, false));
            int iC2 = C32649a.c(c32649a, listF);
            Integer numValueOf = Integer.valueOf(iC2);
            if (iC2 <= 0) {
                numValueOf = null;
            }
            return F00.a.a(aVar2, listF, numValueOf != null ? new G00.a(numValueOf.intValue(), 0, false, 6, null) : null, 4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32663o(C32649a c32649a, Continuation<? super C32663o> continuation) {
        super(2, continuation);
        this.f201281r = c32649a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C32663o c32663o = new C32663o(this.f201281r, continuation);
        c32663o.f201280q = obj;
        return c32663o;
    }

    @Override // Y41.p
    public final Object invoke(PersonFormInternalAction personFormInternalAction, Continuation<? super G0> continuation) {
        return ((C32663o) create(personFormInternalAction, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        PersonFormInternalAction personFormInternalAction = (PersonFormInternalAction) this.f201280q;
        boolean z12 = personFormInternalAction instanceof PersonFormInternalAction.UploadingCompleted;
        C32649a c32649a = this.f201281r;
        if (z12) {
            C32649a.d(c32649a, c32649a.f200904j, (F00.c) personFormInternalAction, new a(c32649a, personFormInternalAction));
        } else if (personFormInternalAction instanceof PersonFormInternalAction.FieldUploadingCompleted) {
            C32649a.d(c32649a, c32649a.f200904j, (F00.c) personFormInternalAction, new b(c32649a, personFormInternalAction));
        } else if (personFormInternalAction instanceof PersonFormInternalAction.FieldUploadingFailed) {
            C32649a.d(c32649a, c32649a.f200904j, (F00.c) personFormInternalAction, new c(c32649a));
        } else if (personFormInternalAction instanceof PersonFormInternalAction.LoadingCompleted) {
            C32649a.d(c32649a, c32649a.f200904j, (F00.c) personFormInternalAction, new d(c32649a, personFormInternalAction));
        } else if (personFormInternalAction instanceof PersonFormInternalAction.ReloadingCompleted) {
            C32649a.d(c32649a, c32649a.f200904j, (F00.c) personFormInternalAction, new e(c32649a, personFormInternalAction));
        } else if (personFormInternalAction instanceof PersonFormInternalAction.UpdateContent) {
            C32649a.d(c32649a, c32649a.f200904j, (F00.c) personFormInternalAction, new f(c32649a, personFormInternalAction));
        }
        return G0.f406611a;
    }
}
