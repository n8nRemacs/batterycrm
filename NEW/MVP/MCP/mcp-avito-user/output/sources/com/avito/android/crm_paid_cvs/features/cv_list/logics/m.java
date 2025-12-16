package com.avito.android.crm_paid_cvs.features.cv_list.logics;

import com.avito.android.arch.mvi.t;
import com.avito.android.crm_paid_cvs.dto.CvItem;
import com.avito.android.crm_paid_cvs.dto.CvStatus;
import com.avito.android.crm_paid_cvs.dto.FilterItem;
import com.avito.android.crm_paid_cvs.features.cv_list.entity.CvListInternalAction;
import et.InterfaceC40155a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CvListProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/logics/m;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction;", "Let/a;", "<init>", "()V", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m implements t<CvListInternalAction, InterfaceC40155a> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC40155a b(CvListInternalAction cvListInternalAction) {
        CvListInternalAction cvListInternalAction2 = cvListInternalAction;
        if (cvListInternalAction2 instanceof CvListInternalAction.ShowError) {
            CvListInternalAction.LoadType loadType = CvListInternalAction.LoadType.f130467c;
            CvListInternalAction.LoadType loadType2 = ((CvListInternalAction.ShowError) cvListInternalAction2).f130479b;
            if (loadType2 == loadType || loadType2 == CvListInternalAction.LoadType.f130469e) {
                return InterfaceC40155a.d.f395412a;
            }
            return null;
        }
        if (cvListInternalAction2 instanceof CvListInternalAction.ToggleComparison) {
            CvListInternalAction.ToggleComparison toggleComparison = (CvListInternalAction.ToggleComparison) cvListInternalAction2;
            if (toggleComparison.f130490c) {
                return InterfaceC40155a.d.f395412a;
            }
            com.avito.android.toggle_comparison_state.a aVar = toggleComparison.f130492e;
            if (aVar == null) {
                return null;
            }
            boolean z12 = toggleComparison.f130491d;
            CvItem cvItem = toggleComparison.f130489b;
            return new InterfaceC40155a.c(z12 ? cvItem.f130342r : !cvItem.f130342r, aVar);
        }
        if (cvListInternalAction2 instanceof CvListInternalAction.ShowNote) {
            CvListInternalAction.ShowNote showNote = (CvListInternalAction.ShowNote) cvListInternalAction2;
            CvItem cvItem2 = showNote.f130483b;
            CvStatus cvStatus = cvItem2.f130331g;
            if (cvStatus != null) {
                return new InterfaceC40155a.e(cvItem2, showNote.f130484c, cvStatus, cvItem2.f130332h);
            }
            return null;
        }
        if (cvListInternalAction2 instanceof CvListInternalAction.ShowStatus) {
            CvListInternalAction.ShowStatus showStatus = (CvListInternalAction.ShowStatus) cvListInternalAction2;
            return new InterfaceC40155a.f(showStatus.f130485b, showStatus.f130487d, showStatus.f130488e);
        }
        if (cvListInternalAction2 instanceof CvListInternalAction.CloseStatus) {
            CvListInternalAction.CloseStatus closeStatus = (CvListInternalAction.CloseStatus) cvListInternalAction2;
            return new InterfaceC40155a.e(closeStatus.f130461b, closeStatus.f130462c, closeStatus.f130463d, closeStatus.f130464e);
        }
        if (!(cvListInternalAction2 instanceof CvListInternalAction.OpenFilter)) {
            return null;
        }
        CvListInternalAction.OpenFilter openFilter = (CvListInternalAction.OpenFilter) cvListInternalAction2;
        FilterItem filterItem = openFilter.f130472b;
        return filterItem.f130358c == FilterItem.FilterType.f130367h ? new InterfaceC40155a.b(openFilter.f130473c) : new InterfaceC40155a.C11109a(filterItem);
    }
}
