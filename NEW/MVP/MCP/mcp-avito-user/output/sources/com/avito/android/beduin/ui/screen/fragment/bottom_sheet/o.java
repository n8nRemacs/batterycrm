package com.avito.android.beduin.ui.screen.fragment.bottom_sheet;

import com.avito.android.beduin.network.model.screen.BottomSheetScreenModel;
import com.avito.android.beduin_models.BeduinForm;
import gj.InterfaceC40691b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import pi.C47093d;
import qi.C47404e;
import qi.InterfaceC47401b;

/* compiled from: BottomSheetToStateMapper.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/bottom_sheet/o;", "Lcom/avito/android/beduin/ui/screen/fragment/j;", "Lcom/avito/android/beduin/network/model/screen/BottomSheetScreenModel;", "Lcom/avito/android/beduin/ui/screen/fragment/bottom_sheet/n;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class o implements com.avito.android.beduin.ui.screen.fragment.j<BottomSheetScreenModel, n> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f104200a;

    @Inject
    public o(@Y61.k InterfaceC40691b interfaceC40691b) {
        this.f104200a = interfaceC40691b;
    }

    @Override // com.avito.android.beduin.ui.screen.fragment.j
    public final com.avito.android.beduin.ui.screen.fragment.i a(InterfaceC47401b interfaceC47401b) {
        BottomSheetScreenModel bottomSheetScreenModel = (BottomSheetScreenModel) interfaceC47401b;
        BeduinForm topForm = bottomSheetScreenModel.getBottomSheet().getTopForm();
        InterfaceC40691b interfaceC40691b = this.f104200a;
        if (topForm != null) {
            com.avito.android.beduin_shared.model.utils.m.b(interfaceC40691b.j(), topForm);
        }
        com.avito.android.beduin_shared.model.utils.m.b(interfaceC40691b.j(), bottomSheetScreenModel.getBottomSheet().getMainForm());
        pi.e navBar = bottomSheetScreenModel.getNavBar();
        pi.e bottomSheetNavBar = bottomSheetScreenModel.getBottomSheetNavBar();
        C47093d gallery = bottomSheetScreenModel.getGallery();
        C47404e bottomSheet = bottomSheetScreenModel.getBottomSheet();
        return new n(navBar, bottomSheetNavBar, gallery, bottomSheetScreenModel.getExtraContent(), bottomSheetScreenModel.getAnalyticsParams(), bottomSheet);
    }
}
