package com.avito.android.auto_select.deeplink;

import androidx.fragment.app.DialogFragment;
import com.avito.android.auto_select.contact_me.AutoSelectContactMeBottomSheetFragment;
import com.avito.android.auto_select.contact_me.model.AutoSelectContactMeBottomSheetOpenArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutoSelectContactMeLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/fragment/app/DialogFragment;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class o extends N implements Y41.a<DialogFragment> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AutoSelectContactMeBottomSheetOpenArguments f96065l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(AutoSelectContactMeBottomSheetOpenArguments autoSelectContactMeBottomSheetOpenArguments) {
        super(0);
        this.f96065l = autoSelectContactMeBottomSheetOpenArguments;
    }

    @Override // Y41.a
    public final DialogFragment invoke() {
        AutoSelectContactMeBottomSheetFragment.f95928m0.getClass();
        AutoSelectContactMeBottomSheetFragment autoSelectContactMeBottomSheetFragment = new AutoSelectContactMeBottomSheetFragment();
        autoSelectContactMeBottomSheetFragment.f95934l0.setValue(autoSelectContactMeBottomSheetFragment, AutoSelectContactMeBottomSheetFragment.f95929n0[0], this.f96065l);
        return autoSelectContactMeBottomSheetFragment;
    }
}
