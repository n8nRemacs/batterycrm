package com.avito.android.edit_basic_info;

import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.H;
import com.avito.android.edit_basic_info.EditBasicInfoFragment;
import com.avito.android.edit_basic_info.model.EditBasicInfoArguments;
import com.avito.android.edit_seller_type.EditSellerTypeFragment;
import com.avito.android.profile_settings_extended.adapter.basic_info_v2.BasicInfoV2Item;
import com.avito.android.util.C35966w1;
import j.D;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EditBasicInfoRouter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_basic_info/i;", "Lcom/avito/android/edit_basic_info/h;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Fragment f146081a;

    /* renamed from: b, reason: collision with root package name */
    public final int f146082b;

    @Inject
    public i(@Y61.k Fragment fragment, @D int i12) {
        this.f146081a = fragment;
        this.f146082b = i12;
    }

    @Override // com.avito.android.edit_basic_info.h
    public final void a(int i12, @Y61.l Integer num) {
        EditSellerTypeFragment.a aVar = EditSellerTypeFragment.f146675s0;
        Integer numValueOf = Integer.valueOf(i12);
        aVar.getClass();
        EditSellerTypeFragment editSellerTypeFragmentA = EditSellerTypeFragment.a.a(numValueOf, num);
        H hE2 = this.f146081a.getChildFragmentManager().e();
        hE2.j(this.f146082b, editSellerTypeFragmentA, "edit_seller_type_fragment_tag", 1);
        hE2.c(null);
        hE2.e();
    }

    @Override // com.avito.android.edit_basic_info.h
    public final boolean b() {
        FragmentManager childFragmentManager = this.f146081a.getChildFragmentManager();
        if (childFragmentManager.H("edit_basic_info_fragment_tag") == null) {
            return false;
        }
        childFragmentManager.Y();
        return true;
    }

    @Override // com.avito.android.edit_basic_info.h
    public final void c(@Y61.k BasicInfoV2Item basicInfoV2Item) {
        EditBasicInfoFragment.a aVar = EditBasicInfoFragment.f146014u0;
        EditBasicInfoArguments editBasicInfoArguments = new EditBasicInfoArguments(basicInfoV2Item, "edit_basic_info_result_key");
        aVar.getClass();
        EditBasicInfoFragment editBasicInfoFragment = new EditBasicInfoFragment();
        C35966w1.a(editBasicInfoFragment, -1, new e(editBasicInfoArguments));
        FragmentManager childFragmentManager = this.f146081a.getChildFragmentManager();
        if (childFragmentManager.H("edit_basic_info_fragment_tag") != null) {
            return;
        }
        H hE2 = childFragmentManager.e();
        hE2.j(this.f146082b, editBasicInfoFragment, "edit_basic_info_fragment_tag", 1);
        hE2.c(null);
        hE2.e();
    }
}
