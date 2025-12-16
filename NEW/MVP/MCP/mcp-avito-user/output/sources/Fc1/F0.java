package Fc1;

import androidx.compose.runtime.C22061e3;
import androidx.compose.runtime.C22082i3;
import feedback.shared.sdk.api.network.entities.CampaignInfo;
import feedback.shared.sdk.api.network.entities.FieldResult;
import feedback.shared.sdk.api.network.entities.PageResult;
import feedback.shared.sdk.api.network.entities.PageType;
import feedback.shared.sdk.api.network.entities.Transform;
import feedback.shared.sdk.api.network.entities.TransformAction;
import feedback.shared.sdk.api.network.entities.TransformCondition;
import feedback.shared.sdk.api.network.entities.TransformRule;
import feedback.shared.sdk.api.network.entities.TransformScenario;
import feedback.shared.sdk.api.network.entities.TransformTo;
import feedback.shared.sdk.api.network.entities.TransformType;
import io.reactivex.rxjava3.core.AbstractC41768a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.C42729a0;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;

@kotlin.jvm.internal.s0
/* loaded from: classes9.dex */
public final class F0 implements InterfaceC13642j0 {

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final ArrayList f4928l = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final CampaignInfo f4929a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final U7 f4930b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13715r2 f4931c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f4932d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final F4 f4933e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final J2 f4934f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.T f4935g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ArrayList f4936h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public AbstractC13717r4 f4937i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public androidx.compose.foundation.d2 f4938j;

    /* renamed from: k, reason: collision with root package name */
    public int f4939k;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4940a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f4941b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f4942c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f4943d;

        static {
            int[] iArr = new int[PageType.values().length];
            try {
                iArr[PageType.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PageType.LAST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f4940a = iArr;
            int[] iArr2 = new int[xyz.n.a.i4.values().length];
            try {
                iArr2[12] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            f4941b = iArr2;
            int[] iArr3 = new int[TransformRule.values().length];
            try {
                iArr3[TransformRule.EQUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr3[TransformRule.FILLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[TransformRule.CONTAIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[TransformRule.UNFILLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f4942c = iArr3;
            int[] iArr4 = new int[TransformType.values().length];
            try {
                iArr4[TransformType.URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[TransformType.DEEPLINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[TransformType.PAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            f4943d = iArr4;
        }
    }

    @DebugMetadata(c = "feedback.shared.sdk.ui.pages.transforms.impl.TransformManagerImpl$modifyScrollPosition$1", f = "TransformManagerImpl.kt", i = {}, l = {200}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f4944q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f4946s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i12, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f4946s = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return F0.this.new b(this.f4946s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f4944q;
            if (i12 == 0) {
                C42729a0.b(obj);
                androidx.compose.foundation.d2 d2Var = F0.this.f4938j;
                if (d2Var != null) {
                    int iE2 = ((C22061e3) d2Var.f27081a).e() + this.f4946s;
                    this.f4944q = 1;
                    if (d2Var.h(iE2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    public static final class c extends kotlin.jvm.internal.N implements Y41.p<Boolean, String, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AbstractC13717r4 f4947l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC13717r4 abstractC13717r4) {
            super(2);
            this.f4947l = abstractC13717r4;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(Boolean bool, String str) {
            boolean zBooleanValue = bool.booleanValue();
            String str2 = str;
            AbstractC13717r4 abstractC13717r4 = this.f4947l;
            if (zBooleanValue) {
                ArrayList arrayList = abstractC13717r4.f5784b.f5778c;
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
            } else if (!zBooleanValue) {
                abstractC13717r4.f5784b.f5778c.remove(str2);
            }
            return kotlin.G0.f406611a;
        }
    }

    public static final class d extends kotlin.jvm.internal.N implements Y41.l<AbstractC13717r4, kotlin.G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(AbstractC13717r4 abstractC13717r4) {
            AbstractC13717r4 abstractC13717r42 = abstractC13717r4;
            F0 f02 = F0.this;
            f02.getClass();
            if (a.f4941b[abstractC13717r42.f5783a.d().ordinal()] == 1) {
                f02.g(abstractC13717r42);
            } else {
                f02.d(abstractC13717r42, null);
            }
            return kotlin.G0.f406611a;
        }
    }

    @DebugMetadata(c = "feedback.shared.sdk.ui.pages.transforms.impl.TransformManagerImpl$setupFields$5", f = "TransformManagerImpl.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f4949q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ List<AbstractC13717r4> f4951s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(List<? extends AbstractC13717r4> list, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f4951s = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return F0.this.new e(this.f4951s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((e) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f4949q;
            if (i12 == 0) {
                C42729a0.b(obj);
                androidx.compose.foundation.d2 d2Var = F0.this.f4938j;
                if (d2Var != null) {
                    C13609f3 c13609f3 = ((AbstractC13717r4) C42745f0.E(this.f4951s)).f5789g;
                    kotlin.reflect.n<Object> nVar = AbstractC13717r4.f5782k[0];
                    c13609f3.getClass();
                    int iH2 = (int) l0.g.h(((l0.g) ((C22082i3) c13609f3.f5502b).getF42167b()).f413387a);
                    this.f4949q = 1;
                    obj = d2Var.h(iH2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return kotlin.G0.f406611a;
            }
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return kotlin.G0.f406611a;
        }
    }

    @Inject
    public F0(@Y61.k CampaignInfo campaignInfo, @Y61.k U7 u72, @Y61.k InterfaceC13715r2 interfaceC13715r2, @Y61.k io.reactivex.rxjava3.disposables.c cVar, @Y61.k F4 f42, @Y61.k J2 j22, @Y61.k @Named("Main") kotlinx.coroutines.T t12) {
        this.f4929a = campaignInfo;
        this.f4930b = u72;
        this.f4931c = interfaceC13715r2;
        this.f4932d = cVar;
        this.f4933e = f42;
        this.f4934f = j22;
        this.f4935g = t12;
        int i12 = kotlin.jvm.internal.J.f406821a;
        this.f4939k = 0;
    }

    @Override // Fc1.InterfaceC13642j0
    public final void a(int i12) {
        C43259k.d(this.f4935g, null, null, new b(i12, null), 3);
    }

    @Override // Fc1.InterfaceC13642j0
    public final void b(@Y61.k androidx.compose.foundation.d2 d2Var) {
        this.f4938j = d2Var;
    }

    public final PageResult c(int i12, int i13) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f4936h;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!C42745f0.U(xyz.n.a.i4.f442741m, xyz.n.a.i4.f442735g, xyz.n.a.i4.f442731c, xyz.n.a.i4.f442730b, xyz.n.a.i4.f442742n).contains(((AbstractC13717r4) next).f5783a.d())) {
                arrayList3.add(next);
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            AbstractC13717r4 abstractC13717r4 = (AbstractC13717r4) it2.next();
            if (!abstractC13717r4.f5784b.f5779d.isEmpty()) {
                arrayList.add(FieldResult.INSTANCE.fromFeedbackFieldResult(abstractC13717r4.f5784b));
            }
        }
        return new PageResult(this.f4930b.a().getId(), i12, arrayList, i13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0120 A[LOOP:2: B:12:0x0082->B:44:0x0120, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(Fc1.AbstractC13717r4 r19, Fc1.F0.c r20) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Fc1.F0.d(Fc1.r4, Fc1.F0$c):void");
    }

    public final void e(AbstractC13717r4 abstractC13717r4) {
        Object next;
        Transform[] transformArrF = f();
        TransformAction transformAction = TransformAction.SHOW;
        ArrayList arrayList = new ArrayList();
        for (Transform transform : transformArrF) {
            if (transform.getTo().getAction() == transformAction) {
                arrayList.add(transform);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next2 = it.next();
            List<TransformScenario> scenarios = ((Transform) next2).getScenarios();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : scenarios) {
                List<TransformCondition> conditions = ((TransformScenario) obj).getConditions();
                ArrayList arrayList4 = new ArrayList(C42745f0.q(conditions, 10));
                Iterator<T> it2 = conditions.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((TransformCondition) it2.next()).getFrom().getField());
                }
                if (arrayList4.contains(abstractC13717r4.f5783a.getId())) {
                    arrayList3.add(obj);
                }
            }
            if (!arrayList3.isEmpty()) {
                arrayList2.add(next2);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Transform transform2 = (Transform) it3.next();
            ArrayList arrayList5 = this.f4936h;
            TransformTo to2 = transform2.getTo();
            Iterator it4 = arrayList5.iterator();
            while (true) {
                if (it4.hasNext()) {
                    next = it4.next();
                    if (kotlin.jvm.internal.L.f(((AbstractC13717r4) next).f5783a.getId(), to2.getValue())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AbstractC13717r4 abstractC13717r42 = (AbstractC13717r4) next;
            if (abstractC13717r42 != null) {
                if (a.f4941b[abstractC13717r42.f5783a.d().ordinal()] == 1) {
                    g(abstractC13717r42);
                } else {
                    d(abstractC13717r42, new c(abstractC13717r4));
                }
            }
        }
        this.f4931c.a(abstractC13717r4);
    }

    public final Transform[] f() {
        Transform[] transformArr;
        List<Transform> transforms = this.f4929a.getTransforms();
        return (transforms == null || (transformArr = (Transform[]) transforms.toArray(new Transform[0])) == null) ? new Transform[0] : transformArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f4 A[LOOP:2: B:12:0x0069->B:41:0x00f4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(Fc1.AbstractC13717r4 r17) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Fc1.F0.g(Fc1.r4):void");
    }

    @Override // Fc1.InterfaceC13642j0
    public final void a() {
        kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
        int i12 = kotlin.jvm.internal.J.f406821a;
        this.f4931c.b("", c(1, this.f4939k));
        f4928l.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0370 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:252:? A[LOOP:15: B:111:0x02da->B:252:?, LOOP_END, SYNTHETIC] */
    @Override // Fc1.InterfaceC13642j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@Y61.k Fc1.AbstractC13717r4 r19) {
        /*
            Method dump skipped, instructions count: 1157
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Fc1.F0.a(Fc1.r4):void");
    }

    @Override // Fc1.InterfaceC13642j0
    public final void a(@Y61.k List<? extends AbstractC13717r4> list) {
        xyz.n.a.i4 i4Var;
        Object obj;
        Object next;
        xyz.n.a.i4 i4Var2;
        boolean zIsEmpty;
        int iIntValue;
        Iterator<T> it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            i4Var = xyz.n.a.i4.f442741m;
            obj = null;
            if (!zHasNext) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((AbstractC13717r4) next).f5783a.d() == i4Var) {
                    break;
                }
            }
        }
        AbstractC13717r4 abstractC13717r4 = (AbstractC13717r4) next;
        ArrayList arrayList = this.f4936h;
        if (abstractC13717r4 != null) {
            this.f4937i = abstractC13717r4;
            if (arrayList.contains(abstractC13717r4)) {
                return;
            }
            arrayList.add(abstractC13717r4);
            return;
        }
        f4928l.addAll(C13748v.c(arrayList));
        arrayList.clear();
        arrayList.addAll(list);
        AbstractC13717r4 abstractC13717r42 = this.f4937i;
        if (abstractC13717r42 != null && !arrayList.contains(abstractC13717r42)) {
            arrayList.add(abstractC13717r42);
        }
        Transform[] transformArrF = f();
        d dVar = new d();
        Iterator it2 = arrayList.iterator();
        while (true) {
            int i12 = 0;
            if (!it2.hasNext()) {
                break;
            }
            AbstractC13717r4 abstractC13717r43 = (AbstractC13717r4) it2.next();
            int length = transformArrF.length;
            while (true) {
                if (i12 < length) {
                    Transform transform = transformArrF[i12];
                    if (transform.getTo().getAction() == TransformAction.SHOW && ((transform.getTo().getType() == TransformType.BUTTON || transform.getTo().getType() == TransformType.FIELD) && kotlin.jvm.internal.L.f(transform.getTo().getValue(), abstractC13717r43.f5783a.getId()))) {
                        dVar.invoke(abstractC13717r43);
                        break;
                    }
                    i12++;
                }
            }
        }
        C43259k.d(this.f4935g, null, null, new e(list, null), 3);
        int i13 = a.f4940a[this.f4930b.a().getType().ordinal()];
        if (i13 != 1) {
            if (i13 != 2) {
                return;
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                AbstractC13717r4 abstractC13717r44 = (AbstractC13717r4) it3.next();
                Y0 y0B = abstractC13717r44.f5783a.b();
                if (y0B != null && y0B.f5334a) {
                    kotlin.reflect.n<Object> nVar = AbstractC13717r4.f5782k[3];
                    C13609f3 c13609f3 = abstractC13717r44.f5791i;
                    c13609f3.getClass();
                    if (((Boolean) ((C22082i3) c13609f3.f5502b).getF42167b()).booleanValue() && abstractC13717r44.f5784b.f5779d.isEmpty()) {
                        return;
                    }
                }
            }
            Integer autoclose = this.f4929a.getAutoclose();
            if (autoclose == null || (iIntValue = autoclose.intValue()) <= 0) {
                return;
            }
            this.f4932d.b(AbstractC41768a.y(iIntValue, TimeUnit.SECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).q(io.reactivex.rxjava3.android.schedulers.b.b()).v(new E0(this, 0), io.reactivex.rxjava3.internal.functions.a.f401996f));
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it4 = arrayList.iterator();
        while (true) {
            boolean zHasNext2 = it4.hasNext();
            i4Var2 = xyz.n.a.i4.f442742n;
            if (!zHasNext2) {
                break;
            }
            Object next2 = it4.next();
            if (!C42745f0.U(i4Var, xyz.n.a.i4.f442735g, xyz.n.a.i4.f442731c, xyz.n.a.i4.f442730b, i4Var2).contains(((AbstractC13717r4) next2).f5783a.d())) {
                arrayList2.add(next2);
            }
        }
        if (arrayList2.isEmpty()) {
            zIsEmpty = false;
        } else {
            ArrayList arrayList3 = new ArrayList();
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                Object next3 = it5.next();
                C13609f3 c13609f32 = ((AbstractC13717r4) next3).f5791i;
                kotlin.reflect.n<Object> nVar2 = AbstractC13717r4.f5782k[3];
                c13609f32.getClass();
                if (((Boolean) ((C22082i3) c13609f32.f5502b).getF42167b()).booleanValue()) {
                    arrayList3.add(next3);
                }
            }
            zIsEmpty = arrayList3.isEmpty();
        }
        if (zIsEmpty) {
            Iterator it6 = arrayList.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                Object next4 = it6.next();
                if (((AbstractC13717r4) next4).f5783a.d() == i4Var2) {
                    obj = next4;
                    break;
                }
            }
            AbstractC13717r4 abstractC13717r45 = (AbstractC13717r4) obj;
            if (abstractC13717r45 != null) {
                a(abstractC13717r45);
            }
        }
    }
}
