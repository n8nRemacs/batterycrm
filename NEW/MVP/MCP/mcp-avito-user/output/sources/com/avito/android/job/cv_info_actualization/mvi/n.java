package com.avito.android.job.cv_info_actualization.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.job.cv_info_actualization.mvi.domain.CvActualizationInfoBlockOptionsAnswerMode;
import com.avito.android.job.cv_info_actualization.mvi.entity.JsxCvInfoActualizationInternalAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: JsxCvInfoActualizationReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/job/cv_info_actualization/mvi/entity/JsxCvInfoActualizationInternalAction;", "LTP/d;", "<init>", "()V", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class n implements u<JsxCvInfoActualizationInternalAction, TP.d> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final TP.d a(JsxCvInfoActualizationInternalAction jsxCvInfoActualizationInternalAction, TP.d dVar) {
        com.avito.android.job.cv_info_actualization.mvi.domain.a aVarA;
        List listSingletonList;
        com.avito.android.job.cv_info_actualization.mvi.domain.a aVarA2;
        com.avito.android.job.cv_info_actualization.mvi.domain.a aVarA3;
        JsxCvInfoActualizationInternalAction jsxCvInfoActualizationInternalAction2 = jsxCvInfoActualizationInternalAction;
        TP.d dVar2 = dVar;
        if (jsxCvInfoActualizationInternalAction2 instanceof JsxCvInfoActualizationInternalAction.LoadingInitialInfo) {
            return TP.d.a(dVar2, null, false, true, false, 8);
        }
        if (jsxCvInfoActualizationInternalAction2 instanceof JsxCvInfoActualizationInternalAction.InitialInfoLoadedSuccess) {
            return TP.d.a(dVar2, ((JsxCvInfoActualizationInternalAction.InitialInfoLoadedSuccess) jsxCvInfoActualizationInternalAction2).f174164b, false, false, false, 10);
        }
        if (jsxCvInfoActualizationInternalAction2 instanceof JsxCvInfoActualizationInternalAction.InitialInfoLoadedFailure) {
            return TP.d.a(dVar2, null, true, false, false, 9);
        }
        boolean z12 = jsxCvInfoActualizationInternalAction2 instanceof JsxCvInfoActualizationInternalAction.OnRadioButtonClick;
        com.avito.android.job.cv_info_actualization.mvi.domain.a aVar = dVar2.f15659b;
        if (z12) {
            JsxCvInfoActualizationInternalAction.OnRadioButtonClick onRadioButtonClick = (JsxCvInfoActualizationInternalAction.OnRadioButtonClick) jsxCvInfoActualizationInternalAction2;
            if (aVar != null) {
                ArrayList<com.avito.android.job.cv_info_actualization.mvi.domain.b> arrayList = aVar.f174127c;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
                for (com.avito.android.job.cv_info_actualization.mvi.domain.b bVarA : arrayList) {
                    if (bVarA.f174130b.f174141a.equals(onRadioButtonClick.f174170b)) {
                        bVarA = com.avito.android.job.cv_info_actualization.mvi.domain.b.a(bVarA, Collections.singletonList(onRadioButtonClick.f174171c));
                    }
                    arrayList2.add(bVarA);
                }
                aVarA3 = com.avito.android.job.cv_info_actualization.mvi.domain.a.a(aVar, arrayList2);
            } else {
                aVarA3 = null;
            }
            return TP.d.a(dVar2, aVarA3, false, false, false, 14);
        }
        if (jsxCvInfoActualizationInternalAction2 instanceof JsxCvInfoActualizationInternalAction.OnCheckboxClick) {
            JsxCvInfoActualizationInternalAction.OnCheckboxClick onCheckboxClick = (JsxCvInfoActualizationInternalAction.OnCheckboxClick) jsxCvInfoActualizationInternalAction2;
            if (aVar != null) {
                ArrayList<com.avito.android.job.cv_info_actualization.mvi.domain.b> arrayList3 = aVar.f174127c;
                ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayList3, 10));
                for (com.avito.android.job.cv_info_actualization.mvi.domain.b bVarA2 : arrayList3) {
                    if (bVarA2.f174130b.f174141a.equals(onCheckboxClick.f174165b)) {
                        List<String> list = bVarA2.f174135g;
                        ArrayList arrayList5 = new ArrayList(list);
                        String str = onCheckboxClick.f174166c;
                        if (list.contains(str)) {
                            arrayList5.remove(str);
                        } else {
                            arrayList5.add(str);
                        }
                        bVarA2 = com.avito.android.job.cv_info_actualization.mvi.domain.b.a(bVarA2, arrayList5);
                    }
                    arrayList4.add(bVarA2);
                }
                aVarA2 = com.avito.android.job.cv_info_actualization.mvi.domain.a.a(aVar, arrayList4);
            } else {
                aVarA2 = null;
            }
            return TP.d.a(dVar2, aVarA2, false, false, false, 14);
        }
        if (!(jsxCvInfoActualizationInternalAction2 instanceof JsxCvInfoActualizationInternalAction.OnChipsClick)) {
            if (jsxCvInfoActualizationInternalAction2 instanceof JsxCvInfoActualizationInternalAction.SendingForm) {
                return TP.d.a(dVar2, null, false, false, true, 7);
            }
            return jsxCvInfoActualizationInternalAction2 instanceof JsxCvInfoActualizationInternalAction.FormSentSuccess ? true : jsxCvInfoActualizationInternalAction2 instanceof JsxCvInfoActualizationInternalAction.FormSentFailure ? TP.d.a(dVar2, null, false, false, false, 7) : dVar2;
        }
        JsxCvInfoActualizationInternalAction.OnChipsClick onChipsClick = (JsxCvInfoActualizationInternalAction.OnChipsClick) jsxCvInfoActualizationInternalAction2;
        if (aVar != null) {
            ArrayList<com.avito.android.job.cv_info_actualization.mvi.domain.b> arrayList6 = aVar.f174127c;
            ArrayList arrayList7 = new ArrayList(C42745f0.q(arrayList6, 10));
            for (com.avito.android.job.cv_info_actualization.mvi.domain.b bVarA3 : arrayList6) {
                if (bVarA3.f174130b.f174141a.equals(onChipsClick.f174167b)) {
                    boolean z13 = onChipsClick.f174169d;
                    List<String> list2 = bVarA3.f174135g;
                    String str2 = onChipsClick.f174168c;
                    if (!z13) {
                        ArrayList arrayList8 = new ArrayList(list2);
                        arrayList8.remove(str2);
                        listSingletonList = arrayList8;
                    } else if (bVarA3.f174130b.f174143c == CvActualizationInfoBlockOptionsAnswerMode.f174117c) {
                        ArrayList arrayList9 = new ArrayList(list2);
                        if (list2.contains(str2)) {
                            arrayList9.remove(str2);
                        } else {
                            arrayList9.add(str2);
                        }
                        listSingletonList = arrayList9;
                    } else {
                        listSingletonList = Collections.singletonList(str2);
                    }
                    bVarA3 = com.avito.android.job.cv_info_actualization.mvi.domain.b.a(bVarA3, listSingletonList);
                }
                arrayList7.add(bVarA3);
            }
            aVarA = com.avito.android.job.cv_info_actualization.mvi.domain.a.a(aVar, arrayList7);
        } else {
            aVarA = null;
        }
        return TP.d.a(dVar2, aVarA, false, false, false, 14);
    }
}
