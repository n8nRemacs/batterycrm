package com.avito.android.str_calendar.seller.warning_dialog;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InterfaceC22532u2;
import androidx.fragment.app.Fragment;
import androidx.view.P0;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.str_calendar.seller.warning_dialog.models.WarningDialogData;
import com.avito.android.ui.fragments.BaseDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: StrCalendarWarningDialogFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_calendar/seller/warning_dialog/StrCalendarWarningDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StrCalendarWarningDialogFragment extends BaseDialogFragment implements InterfaceC28477j.a {

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public static final a f288060i0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    public WarningDialogData f288061h0;

    /* compiled from: StrCalendarWarningDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/str_calendar/seller/warning_dialog/StrCalendarWarningDialogFragment$a;", "", "<init>", "()V", "", "NULL_WARNING_DATA_ERROR_MESSAGE", "Ljava/lang/String;", "WARNING_DIALOG_DATA_KEY", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public StrCalendarWarningDialogFragment() {
        super(0, 1, null);
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        if (bundle == null) {
            bundle = requireArguments();
        }
        WarningDialogData warningDialogData = (WarningDialogData) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("warning_dialog_data", WarningDialogData.class) : bundle.getParcelable("warning_dialog_data"));
        if (warningDialogData == null) {
            throw new IllegalArgumentException("warningDialogData can't be null");
        }
        this.f288061h0 = warningDialogData;
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = null;
        }
        f fVar = parentFragment != null ? (f) new P0(parentFragment).a(f.class) : null;
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), 0, 2, null);
        WarningDialogData warningDialogData2 = this.f288061h0;
        WarningDialogData warningDialogData3 = warningDialogData2 != null ? warningDialogData2 : null;
        ComposeView composeView = new ComposeView(requireContext(), null, 0, 6, null);
        composeView.setViewCompositionStrategy(InterfaceC22532u2.e.f41618b);
        composeView.setContent(new C22096n(-9215717, new l(warningDialogData3, fVar, this), true));
        dVar.setContentView(composeView);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        com.avito.android.lib.design.bottom_sheet.j.b(dVar, false, 4);
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        WarningDialogData warningDialogData = this.f288061h0;
        if (warningDialogData == null) {
            warningDialogData = null;
        }
        bundle.putParcelable("warning_dialog_data", warningDialogData);
    }
}
