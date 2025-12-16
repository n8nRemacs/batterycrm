package com.avito.android.rating_form.step.mvi;

import ah0.InterfaceC19890a;
import ch0.C27195a;
import com.avito.android.rating_form.C34198a;
import com.avito.android.rating_form.FieldIdentifier;
import com.avito.android.rating_form.StepIdentifier;
import com.avito.android.rating_form.step.RatingFormStepArguments;
import com.avito.android.rating_form.step.mvi.entity.RatingFormStepInternalAction;
import com.avito.android.rating_form.step.validations.ValidationInfo;
import com.avito.android.remote.model.text.AttributedText;
import hh0.C40939a;
import hh0.C40940b;
import ih0.C41404c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: RatingFormStepReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/step/mvi/A;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "Lih0/c;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class A implements com.avito.android.arch.mvi.u<RatingFormStepInternalAction, C41404c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_form.y f249529b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RatingFormStepArguments f249530c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_form.i f249531d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.links.w f249532e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.links.x f249533f;

    @Inject
    public A(@Y61.k com.avito.android.rating_form.y yVar, @Y61.k RatingFormStepArguments ratingFormStepArguments, @Y61.k com.avito.android.rating_form.i iVar, @Y61.k com.avito.android.deep_linking.links.w wVar, @Y61.k com.avito.android.deep_linking.links.x xVar) {
        this.f249529b = yVar;
        this.f249530c = ratingFormStepArguments;
        this.f249531d = iVar;
        this.f249532e = wVar;
        this.f249533f = xVar;
    }

    public static ArrayList b(List list, Map map) {
        ArrayList arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TV0.a aVar = (TV0.a) it.next();
            com.avito.android.rating_form.item.file_picker.g gVar = null;
            com.avito.android.rating_form.item.file_picker.g gVar2 = aVar instanceof com.avito.android.rating_form.item.file_picker.g ? (com.avito.android.rating_form.item.file_picker.g) aVar : null;
            if (gVar2 != null) {
                List list2 = (List) map.get(gVar2.f248428c);
                if (list2 == null) {
                    list2 = C42784z0.f406748b;
                }
                gVar = new com.avito.android.rating_form.item.file_picker.g(gVar2.f248427b, gVar2.f248428c, gVar2.f248429d, gVar2.f248430e, list2);
            }
            if (gVar != null) {
                arrayList2.add(gVar);
            }
        }
        arrayList.replaceAll(new com.avito.android.rating_form.step.j(arrayList2, 1));
        return arrayList;
    }

    public static Integer c(RatingFormStepInternalAction ratingFormStepInternalAction, List list, C41404c c41404c) {
        if (!(ratingFormStepInternalAction instanceof RatingFormStepInternalAction.Content)) {
            if (!(ratingFormStepInternalAction instanceof RatingFormStepInternalAction.UpdateItems) || list.size() == c41404c.f398671b.size()) {
                return null;
            }
            return Integer.valueOf(list.size() - 1);
        }
        Iterator it = list.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            TV0.a aVar = (TV0.a) it.next();
            if ((aVar instanceof InterfaceC19890a) && ((InterfaceC19890a) aVar).b()) {
                break;
            }
            i12++;
        }
        Integer numValueOf = Integer.valueOf(i12);
        if (i12 >= 0) {
            return numValueOf;
        }
        return null;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C41404c a(RatingFormStepInternalAction ratingFormStepInternalAction, C41404c c41404c) {
        C41404c c41404cA;
        C40939a c40939a;
        C40939a c40939a2;
        RatingFormStepInternalAction ratingFormStepInternalAction2 = ratingFormStepInternalAction;
        C41404c c41404c2 = c41404c;
        boolean z12 = ratingFormStepInternalAction2 instanceof RatingFormStepInternalAction.Content;
        Map<FieldIdentifier, List<com.avito.android.rating_form.step.e>> map = c41404c2.f398676g;
        if (z12) {
            RatingFormStepInternalAction.Content content = (RatingFormStepInternalAction.Content) ratingFormStepInternalAction2;
            ArrayList arrayListB = b(content.f249570b, map);
            return C41404c.a(c41404c2, arrayListB, content.f249571c, null, content.f249572d, null, null, c(ratingFormStepInternalAction2, arrayListB, c41404c2), 52);
        }
        if (ratingFormStepInternalAction2 instanceof RatingFormStepInternalAction.FinishButton) {
            return C41404c.a(c41404c2, null, false, ((RatingFormStepInternalAction.FinishButton) ratingFormStepInternalAction2).f249574b, null, null, null, null, 59);
        }
        if (ratingFormStepInternalAction2 instanceof RatingFormStepInternalAction.ButtonList) {
            return C41404c.a(c41404c2, null, false, null, null, ((RatingFormStepInternalAction.ButtonList) ratingFormStepInternalAction2).f249567b, null, null, 47);
        }
        boolean z13 = ratingFormStepInternalAction2 instanceof RatingFormStepInternalAction.UpdateItems;
        AttributedText attributedText = null;
        C27195a c27195a = c41404c2.f398673d;
        if (!z13) {
            if (ratingFormStepInternalAction2 instanceof RatingFormStepInternalAction.ChangeRedesignDisclaimerVisibility) {
                return C41404c.a(c41404c2, null, false, c27195a != null ? new C27195a(c27195a.f58096b, ((RatingFormStepInternalAction.ChangeRedesignDisclaimerVisibility) ratingFormStepInternalAction2).f249568b, c27195a.f58098d, c27195a.f58099e, c27195a.f58095a) : null, null, null, null, null, 59);
            }
            if (!(ratingFormStepInternalAction2 instanceof RatingFormStepInternalAction.UpdateFiles)) {
                if (ratingFormStepInternalAction2 instanceof RatingFormStepInternalAction.Empty ? true : ratingFormStepInternalAction2 instanceof RatingFormStepInternalAction.Close ? true : ratingFormStepInternalAction2 instanceof RatingFormStepInternalAction.RequestFocus ? true : ratingFormStepInternalAction2 instanceof RatingFormStepInternalAction.ShowDialog ? true : ratingFormStepInternalAction2 instanceof RatingFormStepInternalAction.OpenDeeplink ? true : ratingFormStepInternalAction2 instanceof RatingFormStepInternalAction.OpenUrl ? true : ratingFormStepInternalAction2 instanceof RatingFormStepInternalAction.ShowErrorToast ? true : ratingFormStepInternalAction2 instanceof RatingFormStepInternalAction.ShowFilePicker ? true : ratingFormStepInternalAction2 instanceof RatingFormStepInternalAction.StartAddressScreen ? true : ratingFormStepInternalAction2 instanceof RatingFormStepInternalAction.StartDevelopmentScreen ? true : ratingFormStepInternalAction2 instanceof RatingFormStepInternalAction.StartSelectBottomSheet) {
                    return c41404c2;
                }
                throw new NoWhenBranchMatchedException();
            }
            RatingFormStepInternalAction.UpdateFiles updateFiles = (RatingFormStepInternalAction.UpdateFiles) ratingFormStepInternalAction2;
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put(updateFiles.f249588b, updateFiles.f249589c);
            return C41404c.a(c41404c2, b(c41404c2.f398671b, linkedHashMap), false, null, null, null, linkedHashMap, null, 30);
        }
        RatingFormStepInternalAction.UpdateItems updateItems = (RatingFormStepInternalAction.UpdateItems) ratingFormStepInternalAction2;
        z zVar = new z(this, ratingFormStepInternalAction2, c41404c2);
        RatingFormStepArguments ratingFormStepArguments = this.f249530c;
        com.avito.android.rating_form.m mVarB = this.f249529b.b(ratingFormStepArguments.f249115c);
        StepIdentifier stepIdentifier = ratingFormStepArguments.f249116d;
        ArrayList arrayListR = mVarB.r(stepIdentifier);
        if (arrayListR != null) {
            boolean zC2 = com.avito.android.rating_form.B.c(arrayListR);
            String strO = mVarB.o(stepIdentifier);
            String strL = mVarB.l(stepIdentifier);
            Map<FieldIdentifier, ValidationInfo> map2 = updateItems.f249591c;
            ArrayList arrayListA = this.f249531d.a(strO, arrayListR, map2, updateItems.f249590b, strL, zC2);
            String strQ = mVarB.q(stepIdentifier);
            AttributedText attributedTextS = mVarB.s(stepIdentifier);
            if (attributedTextS != null) {
                attributedTextS.setOnDeepLinkClickListener(this.f249532e);
                attributedTextS.setOnUrlClickListener(this.f249533f);
                attributedText = attributedTextS;
            }
            C27195a c27195a2 = new C27195a(attributedText, true, c27195a != null ? c27195a.f58098d : false, c27195a != null ? c27195a.f58099e : true, strQ);
            List<C34198a> listT = mVarB.t(stepIdentifier);
            ArrayList arrayListB2 = b(arrayListA, map);
            C40940b c40940b = c41404c2.f398675f;
            c41404cA = C41404c.a(c41404c2, arrayListB2, zC2, c27195a2, map2, new C40940b(com.avito.android.rating_form.step.d.a(listT, (c40940b == null || (c40939a2 = (C40939a) C42745f0.G(c40940b.f397358a)) == null) ? false : c40939a2.f397356d, (c40940b == null || (c40939a = (C40939a) C42745f0.G(c40940b.f397358a)) == null) ? true : c40939a.f397357e), attributedText, true), null, (Integer) zVar.invoke(arrayListB2), 32);
        } else {
            c41404cA = C41404c.a(c41404c2, null, false, null, null, null, null, null, 127);
        }
        return c41404cA;
    }
}
