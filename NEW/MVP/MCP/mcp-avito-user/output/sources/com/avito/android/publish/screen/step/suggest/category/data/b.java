package com.avito.android.publish.screen.step.suggest.category.data;

import Oe0.InterfaceC14679b;
import Y41.p;
import Y61.k;
import Y61.l;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.R;
import com.avito.android.blueprints.publish.checkable.CheckableItem;
import com.avito.android.blueprints.publish.wizard.WizardItem;
import com.avito.android.publish.C0;
import com.avito.android.publish.PublishState;
import com.avito.android.publish.di.W;
import com.avito.android.publish.screen.step.suggest.category.mvi.h;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.CategoryModel;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.WizardParameter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.util.NotFoundException;
import com.avito.android.util.R0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SuggestCategoryInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/suggest/category/data/b;", "Lcom/avito/android/publish/screen/step/suggest/category/data/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.android.publish.screen.step.suggest.category.data.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C0 f242263a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e f242264b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.publish.items.e f242265c;

    /* renamed from: d, reason: collision with root package name */
    public final int f242266d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final R0 f242267e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Q1 f242268f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final PublishState.StepState.CategoriesSuggestions f242269g;

    /* compiled from: SuggestCategoryInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LOe0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.screen.step.suggest.category.data.SuggestCategoryInteractorImpl$load$1", f = "SuggestCategoryInteractor.kt", i = {0, 0, 0, 1, 2}, l = {50, 55, 58, 67}, m = "invokeSuspend", n = {"$this$flow", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "navigation", "$this$flow", "$this$flow"}, s = {"L$0", "L$1", "L$2", "L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC14679b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public CategoryParameters f242270q;

        /* renamed from: r, reason: collision with root package name */
        public Navigation f242271r;

        /* renamed from: s, reason: collision with root package name */
        public int f242272s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f242273t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ boolean f242274u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ b f242275v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z12, b bVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f242274u = z12;
            this.f242275v = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f242274u, this.f242275v, continuation);
            aVar.f242273t = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC14679b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00ae A[Catch: CancellationException -> 0x002d, all -> 0x0045, TRY_LEAVE, TryCatch #0 {all -> 0x0045, blocks: (B:20:0x0041, B:37:0x0080, B:39:0x0084, B:41:0x00a3, B:45:0x00ae), top: B:58:0x0041 }] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00c7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00e6 A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.flow.j] */
        /* JADX WARN: Type inference failed for: r1v5 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 260
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.screen.step.suggest.category.data.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public b(@k C0 c02, @k e eVar, @k com.avito.android.publish.items.e eVar2, @W int i12, @k R0 r02, @k Q1 q12) throws NotFoundException {
        PublishState.StepState imei;
        this.f242263a = c02;
        this.f242264b = eVar;
        this.f242265c = eVar2;
        this.f242266d = i12;
        this.f242267e = r02;
        this.f242268f = q12;
        PublishState publishState = c02.f231861Y;
        Parcelable parcelable = (PublishState.StepState) publishState.k().get(Integer.valueOf(i12));
        if (!(parcelable instanceof PublishState.StepState.CategoriesSuggestions)) {
            n0 n0Var = m0.f406844a;
            kotlin.reflect.d dVarB = n0Var.b(PublishState.StepState.CategoriesSuggestions.class);
            if (dVarB.equals(n0Var.b(PublishState.StepState.Wizard.class))) {
                imei = new PublishState.StepState.Wizard(null, null, null, 7, null);
            } else if (dVarB.equals(n0Var.b(PublishState.StepState.CategoriesSuggestions.class))) {
                imei = new PublishState.StepState.CategoriesSuggestions(null, null, null, null, 15, null);
            } else if (dVarB.equals(n0Var.b(PublishState.StepState.Vin.class))) {
                imei = new PublishState.StepState.Vin(null, 1, null);
            } else {
                if (!dVarB.equals(n0Var.b(PublishState.StepState.Imei.class))) {
                    throw new NotFoundException(n0Var.b(PublishState.StepState.CategoriesSuggestions.class).toString(), (Throwable) null, 2, (C42822w) null);
                }
                imei = new PublishState.StepState.Imei(null, 1, null);
            }
            publishState.k().put(Integer.valueOf(i12), imei);
            parcelable = (PublishState.StepState.CategoriesSuggestions) imei;
        }
        this.f242269g = (PublishState.StepState.CategoriesSuggestions) parcelable;
    }

    public static final ArrayList b(b bVar) {
        String description;
        String title;
        String str;
        String description2;
        String title2;
        String str2;
        bVar.getClass();
        ArrayList arrayList = new ArrayList();
        com.avito.conveyor_item.a aVarA = bVar.f242265c.a();
        if (aVarA != null) {
            arrayList.add(aVarA);
        }
        PublishState.StepState.CategoriesSuggestions categoriesSuggestions = bVar.f242269g;
        if (!h.b(categoriesSuggestions)) {
            CategoryModel chosenCategory = categoriesSuggestions.getChosenCategory();
            Q1 q12 = bVar.f242268f;
            if (chosenCategory != null) {
                if (q12.z().invoke().booleanValue() || (description2 = chosenCategory.getDescription()) == null) {
                    description2 = chosenCategory.getTitle();
                }
                String str3 = description2;
                if (q12.z().invoke().booleanValue()) {
                    title2 = chosenCategory.getDescription();
                } else {
                    title2 = chosenCategory.getTitle();
                    if (chosenCategory.getDescription() == null) {
                        str2 = null;
                    }
                    arrayList.add(new CheckableItem("chosen_id", str3, true, str2, null, 16, null));
                }
                str2 = title2;
                arrayList.add(new CheckableItem("chosen_id", str3, true, str2, null, 16, null));
            }
            for (WizardParameter wizardParameter : categoriesSuggestions.g()) {
                if (!wizardParameter.equals(chosenCategory)) {
                    if (q12.z().invoke().booleanValue() || (description = wizardParameter.getDescription()) == null) {
                        description = wizardParameter.getTitle();
                    }
                    if (q12.z().invoke().booleanValue()) {
                        title = wizardParameter.getDescription();
                    } else {
                        title = wizardParameter.getTitle();
                        if (wizardParameter.getDescription() == null) {
                            str = null;
                        }
                        arrayList.add(new WizardItem(com.avito.android.printable_text.b.f(description), str, wizardParameter.getNavigation(), null, null, 24, null));
                    }
                    str = title;
                    arrayList.add(new WizardItem(com.avito.android.printable_text.b.f(description), str, wizardParameter.getNavigation(), null, null, 24, null));
                }
            }
            arrayList.add(new WizardItem(com.avito.android.printable_text.b.c(R.string.publish_general_another_category, new Serializable[0]), null, d.f242282a, null, null, 26, null));
        }
        return arrayList;
    }

    public static final void c(b bVar, WizardParameter wizardParameter, List list) {
        PublishState.StepState.CategoriesSuggestions categoriesSuggestions = bVar.f242269g;
        if (L.f(categoriesSuggestions.g(), list)) {
            return;
        }
        if (!categoriesSuggestions.g().isEmpty() || h.a(categoriesSuggestions)) {
            if (wizardParameter != null) {
                categoriesSuggestions.h(wizardParameter);
            } else if (!C42745f0.r(list, categoriesSuggestions.getChosenCategory())) {
                categoriesSuggestions.h(null);
            }
        }
        categoriesSuggestions.i(list);
    }

    @Override // com.avito.android.publish.screen.step.suggest.category.data.a
    @k
    public final InterfaceC43160i<InterfaceC14679b> a(boolean z12) {
        return C43175k.I(this.f242267e.a(), C43175k.G(new a(z12, this, null)));
    }
}
