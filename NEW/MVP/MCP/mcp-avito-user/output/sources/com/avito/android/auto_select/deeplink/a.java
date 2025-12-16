package com.avito.android.auto_select.deeplink;

import com.avito.android.auto_select.booking.domain.models.AutoSelectConfirmationDialogData;
import com.avito.android.auto_select.confirmation_dialog.AutoSelectConfirmationBottomSheetV2;
import com.avito.android.auto_select.confirmation_dialog.ui.models.AutoSelectButtonType;
import com.avito.android.auto_select.confirmation_dialog.ui.models.AutoSelectConfirmationDialogContent;
import com.avito.android.auto_select.confirmation_dialog.ui.models.AutoSelectTypedButton;
import com.avito.android.auto_select_core.ui.models.AutoSelectButtonStyle;
import com.avito.android.deep_linking.links.AutoSelectBookingCompletionLink;
import com.avito.android.deep_linking.links.models.AutoSelectButtonTypeDto;
import com.avito.android.deep_linking.links.models.AutoSelectConfirmationDialogContentDto;
import com.avito.android.deep_linking.links.models.AutoSelectTypedButtonDto;
import com.avito.android.remote.model.auto_select.AutoSelectButtonStyleDto;
import ff.C40410a;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import mf.C44075a;

/* compiled from: AutoSelectBookingCompletionLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f96032l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AutoSelectBookingCompletionLink f96033m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, AutoSelectBookingCompletionLink autoSelectBookingCompletionLink) {
        super(0);
        this.f96032l = bVar;
        this.f96033m = autoSelectBookingCompletionLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        AutoSelectButtonType autoSelectButtonType;
        b bVar = this.f96032l;
        AutoSelectConfirmationBottomSheetV2.a aVar = AutoSelectConfirmationBottomSheetV2.f95869m0;
        AutoSelectBookingCompletionLink autoSelectBookingCompletionLink = this.f96033m;
        String str = autoSelectBookingCompletionLink.f133029b;
        AutoSelectConfirmationDialogContentDto autoSelectConfirmationDialogContentDto = autoSelectBookingCompletionLink.f133030c;
        String title = autoSelectConfirmationDialogContentDto.getTitle();
        String description = autoSelectConfirmationDialogContentDto.getDescription();
        List<AutoSelectTypedButtonDto> listC = autoSelectConfirmationDialogContentDto.c();
        ArrayList arrayList = new ArrayList(C42745f0.q(listC, 10));
        for (AutoSelectTypedButtonDto autoSelectTypedButtonDto : listC) {
            String title2 = autoSelectTypedButtonDto.getTitle();
            AutoSelectButtonTypeDto type = autoSelectTypedButtonDto.getType();
            AutoSelectButtonStyle autoSelectButtonStyleA = null;
            if (type != null) {
                int i12 = C40410a.C11165a.f396021a[type.ordinal()];
                if (i12 == 1) {
                    autoSelectButtonType = AutoSelectButtonType.f95916b;
                } else {
                    if (i12 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    autoSelectButtonType = AutoSelectButtonType.f95917c;
                }
            } else {
                autoSelectButtonType = null;
            }
            AutoSelectButtonStyleDto style = autoSelectTypedButtonDto.getStyle();
            if (style != null) {
                autoSelectButtonStyleA = C44075a.a(style);
            }
            arrayList.add(new AutoSelectTypedButton(title2, autoSelectButtonType, autoSelectButtonStyleA, autoSelectTypedButtonDto.getDeepLink()));
        }
        AutoSelectConfirmationDialogData autoSelectConfirmationDialogData = new AutoSelectConfirmationDialogData(str, new AutoSelectConfirmationDialogContent(title, description, arrayList, autoSelectConfirmationDialogContentDto.getIsReloadOnClose()), bVar.f395444b);
        aVar.getClass();
        AutoSelectConfirmationBottomSheetV2 autoSelectConfirmationBottomSheetV2 = new AutoSelectConfirmationBottomSheetV2();
        autoSelectConfirmationBottomSheetV2.f95871h0.setValue(autoSelectConfirmationBottomSheetV2, AutoSelectConfirmationBottomSheetV2.f95870n0[0], autoSelectConfirmationDialogData);
        bVar.f96034f.w1(autoSelectConfirmationBottomSheetV2, "AutoSelectConfirmationBottomSheetV2");
        return G0.f406611a;
    }
}
