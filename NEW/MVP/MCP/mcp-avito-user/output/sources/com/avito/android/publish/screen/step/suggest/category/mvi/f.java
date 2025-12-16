package com.avito.android.publish.screen.step.suggest.category.mvi;

import Oe0.InterfaceC14678a;
import Oe0.InterfaceC14679b;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.publish.C0;
import com.avito.android.publish.PublishState;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.di.W;
import com.avito.android.publish.screen.step.suggest.category.mvi.entity.SuggestCategoryState;
import com.avito.android.remote.model.CategoryModel;
import com.avito.android.util.NotFoundException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SuggestCategoryActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/screen/step/suggest/category/mvi/f;", "Lcom/avito/android/arch/mvi/a;", "LOe0/a;", "LOe0/b;", "Lcom/avito/android/publish/screen/step/suggest/category/mvi/entity/SuggestCategoryState;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements com.avito.android.arch.mvi.a<InterfaceC14678a, InterfaceC14679b, SuggestCategoryState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C0 f242368a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.screen.step.suggest.category.data.a f242369b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f242370c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final PublishState.StepState.CategoriesSuggestions f242371d;

    @Inject
    public f(@Y61.k C0 c02, @Y61.k com.avito.android.publish.screen.step.suggest.category.data.a aVar, @Y61.k InterfaceC33535v interfaceC33535v, @W int i12) throws NotFoundException {
        PublishState.StepState imei;
        this.f242368a = c02;
        this.f242369b = aVar;
        this.f242370c = interfaceC33535v;
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
        this.f242371d = (PublishState.StepState.CategoriesSuggestions) parcelable;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.publish.screen.step.suggest.category.mvi.f r7, com.avito.android.remote.model.CategoryModel r8, boolean r9, kotlinx.coroutines.flow.InterfaceC43172j r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r7.getClass()
            boolean r0 = r11 instanceof com.avito.android.publish.screen.step.suggest.category.mvi.e
            if (r0 == 0) goto L16
            r0 = r11
            com.avito.android.publish.screen.step.suggest.category.mvi.e r0 = (com.avito.android.publish.screen.step.suggest.category.mvi.e) r0
            int r1 = r0.f242360u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f242360u = r1
            goto L1b
        L16:
            com.avito.android.publish.screen.step.suggest.category.mvi.e r0 = new com.avito.android.publish.screen.step.suggest.category.mvi.e
            r0.<init>(r7, r11)
        L1b:
            java.lang.Object r11 = r0.f242358s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f242360u
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4a
            if (r2 == r5) goto L46
            if (r2 == r4) goto L42
            if (r2 != r3) goto L3a
            com.avito.android.remote.model.CategoryModel r7 = r0.f242357r
            com.avito.android.publish.screen.step.suggest.category.mvi.f r8 = r0.f242356q
            kotlin.C42729a0.b(r11)
            r6 = r8
            r8 = r7
            r7 = r6
            goto Lbe
        L3a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L42:
            kotlin.C42729a0.b(r11)
            goto La6
        L46:
            kotlin.C42729a0.b(r11)
            goto L6c
        L4a:
            kotlin.C42729a0.b(r11)
            boolean r11 = r8 instanceof com.avito.android.remote.model.WizardParameter
            if (r11 == 0) goto L6f
            r11 = r8
            com.avito.android.remote.model.WizardParameter r11 = (com.avito.android.remote.model.WizardParameter) r11
            boolean r11 = r11.getHasChildren()
            if (r11 == 0) goto L6f
            Oe0.b$d r7 = new Oe0.b$d
            com.avito.android.remote.model.Navigation r8 = r8.getNavigation()
            r7.<init>(r8)
            r0.f242360u = r5
            java.lang.Object r7 = r10.emit(r7, r0)
            if (r7 != r1) goto L6c
            goto Lc4
        L6c:
            kotlin.G0 r1 = kotlin.G0.f406611a
            goto Lc4
        L6f:
            com.avito.android.publish.PublishState$StepState$CategoriesSuggestions r11 = r7.f242371d
            java.util.List r11 = r11.g()
            com.avito.android.remote.model.Navigation r2 = r8.getNavigation()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            kotlin.collections.s0 r5 = new kotlin.collections.s0
            r5.<init>(r11)
            com.avito.android.publish.screen.step.suggest.category.mvi.g r11 = new com.avito.android.publish.screen.step.suggest.category.mvi.g
            r11.<init>(r2)
            kotlin.sequences.h r11 = kotlin.sequences.C43033p.y(r5, r11)
            java.lang.Object r11 = kotlin.sequences.C43033p.n(r11)
            com.avito.android.remote.model.WizardParameter r11 = (com.avito.android.remote.model.WizardParameter) r11
            if (r11 == 0) goto L92
            r8 = r11
        L92:
            boolean r11 = r8.getIsVerticalChange()
            if (r11 == 0) goto La9
            Oe0.b$a r7 = new Oe0.b$a
            r7.<init>(r8)
            r0.f242360u = r4
            java.lang.Object r7 = r10.emit(r7, r0)
            if (r7 != r1) goto La6
            goto Lc4
        La6:
            kotlin.G0 r1 = kotlin.G0.f406611a
            goto Lc4
        La9:
            if (r9 == 0) goto Lbe
            Oe0.b$b r9 = new Oe0.b$b
            r11 = 0
            r9.<init>(r11)
            r0.f242356q = r7
            r0.f242357r = r8
            r0.f242360u = r3
            java.lang.Object r9 = r10.emit(r9, r0)
            if (r9 != r1) goto Lbe
            goto Lc4
        Lbe:
            com.avito.android.publish.C0 r7 = r7.f242368a
            r7.Re(r8)
            goto La6
        Lc4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.screen.step.suggest.category.mvi.f.c(com.avito.android.publish.screen.step.suggest.category.mvi.f, com.avito.android.remote.model.CategoryModel, boolean, kotlinx.coroutines.flow.j, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC14679b> b(InterfaceC14678a interfaceC14678a, SuggestCategoryState suggestCategoryState) {
        InterfaceC43160i<InterfaceC14679b> c43210w;
        InterfaceC14678a interfaceC14678a2 = interfaceC14678a;
        if (interfaceC14678a2.equals(InterfaceC14678a.C0797a.f12444a) ? true : interfaceC14678a2.equals(InterfaceC14678a.f.f12449a)) {
            return new C43210w(InterfaceC14679b.e.f12459a);
        }
        if (interfaceC14678a2.equals(InterfaceC14678a.b.f12445a) ? true : interfaceC14678a2.equals(InterfaceC14678a.c.f12446a)) {
            return new C43210w(InterfaceC14679b.c.f12457a);
        }
        if (interfaceC14678a2 instanceof InterfaceC14678a.e) {
            return C43175k.G(new b(this, (InterfaceC14678a.e) interfaceC14678a2, null));
        }
        if (interfaceC14678a2.equals(InterfaceC14678a.g.f12450a)) {
            return C43175k.G(new c(this, null));
        }
        if (interfaceC14678a2.equals(InterfaceC14678a.i.f12452a)) {
            CategoryModel chosenCategory = this.f242371d.getChosenCategory();
            c43210w = chosenCategory != null ? C43175k.G(new d(this, chosenCategory, null)) : C43175k.w();
        } else {
            boolean zEquals = interfaceC14678a2.equals(InterfaceC14678a.j.f12453a);
            com.avito.android.publish.screen.step.suggest.category.data.a aVar = this.f242369b;
            if (zEquals) {
                return aVar.a(true);
            }
            if (interfaceC14678a2 instanceof InterfaceC14678a.d) {
                return C43175k.G(new a(((InterfaceC14678a.d) interfaceC14678a2).f12447a, this, null));
            }
            if (interfaceC14678a2.equals(InterfaceC14678a.k.f12454a)) {
                return aVar.a(false);
            }
            if (!(interfaceC14678a2 instanceof InterfaceC14678a.h)) {
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(new InterfaceC14679b.i(((InterfaceC14678a.h) interfaceC14678a2).f12451a));
        }
        return c43210w;
    }
}
