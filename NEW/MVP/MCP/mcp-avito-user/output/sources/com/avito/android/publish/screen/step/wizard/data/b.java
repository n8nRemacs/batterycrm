package com.avito.android.publish.screen.step.wizard.data;

import Pe0.InterfaceC14778b;
import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.blueprints.publish.checkable.CheckableItem;
import com.avito.android.blueprints.publish.header.HeaderItem;
import com.avito.android.blueprints.publish.wizard.WizardItem;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.WizardParameter;
import com.avito.android.remote.model.category_parameters.slot.header.SectionSeparatorSlotConfig;
import com.avito.android.remote.model.search.Theme;
import com.avito.android.util.R0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: WizardInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/wizard/data/b;", "Lcom/avito/android/publish/screen/step/wizard/data/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.android.publish.screen.step.wizard.data.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f242439a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f242440b;

    /* compiled from: WizardInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LPe0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.screen.step.wizard.data.WizardInteractorImpl$load$1", f = "WizardInteractor.kt", i = {0}, l = {36, 37, 38}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC14778b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f242441q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f242442r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(continuation);
            aVar.f242442r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC14778b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f242441q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f242442r;
                e eVar = b.this.f242439a;
                this.f242442r = interfaceC43172j;
                this.f242441q = 1;
                obj = eVar.a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2 && i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f242442r;
                C42729a0.b(obj);
            }
            InterfaceC43172j interfaceC43172j2 = interfaceC43172j;
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                WizardParameter wizardParameter = (WizardParameter) ((TypedResult.Success) typedResult).getResult();
                this.f242442r = null;
                this.f242441q = 2;
                if (b.this.a(wizardParameter, null, true, interfaceC43172j2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (typedResult instanceof TypedResult.Error) {
                InterfaceC14778b.g gVar = InterfaceC14778b.g.f13201a;
                this.f242442r = null;
                this.f242441q = 3;
                if (interfaceC43172j2.emit(gVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    @Inject
    public b(@k e eVar, @k R0 r02) {
        this.f242439a = eVar;
        this.f242440b = r02;
    }

    public static ArrayList b(WizardParameter wizardParameter, WizardParameter wizardParameter2, List list) {
        HeaderItem headerItem = new HeaderItem("wizard_step_header_id", wizardParameter.getTitle(), (String) null, (String) null, false, (Integer) null, (Integer) null, (SectionSeparatorSlotConfig.Tooltip) null, (Theme) null, false, 1016, (C42822w) null);
        List<WizardParameter> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (WizardParameter wizardParameter3 : list2) {
            arrayList.add(L.f(wizardParameter3, wizardParameter2) ? new CheckableItem(wizardParameter3.getDeeplink(), wizardParameter3.getNavigation().toString(), wizardParameter3.getTitle(), wizardParameter3.getDescription(), true) : new WizardItem(com.avito.android.printable_text.b.f(wizardParameter3.getTitle()), wizardParameter3.getDescription(), wizardParameter3.getNavigation(), wizardParameter3.getDeeplink(), null, 16, null));
        }
        return C42745f0.h0(arrayList, Collections.singletonList(headerItem));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.publish.screen.step.wizard.data.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k com.avito.android.remote.model.WizardParameter r11, @Y61.l com.avito.android.remote.model.WizardParameter r12, boolean r13, @Y61.k kotlinx.coroutines.flow.InterfaceC43172j r14, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.screen.step.wizard.data.b.a(com.avito.android.remote.model.WizardParameter, com.avito.android.remote.model.WizardParameter, boolean, kotlinx.coroutines.flow.j, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.publish.screen.step.wizard.data.a
    @k
    public final InterfaceC43160i<InterfaceC14778b> load() {
        return C43175k.I(this.f242440b.a(), C43175k.G(new a(null)));
    }
}
