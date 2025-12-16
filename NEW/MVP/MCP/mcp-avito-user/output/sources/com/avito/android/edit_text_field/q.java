package com.avito.android.edit_text_field;

import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.edit_seller_type.EditSellerTypeFragment;
import com.avito.android.edit_text_field.EditTextFieldFragment;
import com.avito.android.profile_settings_extended.adapter.about.AboutItem;
import com.avito.android.util.C35966w1;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EditTextFieldRouter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_text_field/q;", "Lcom/avito/android/edit_text_field/p;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class q implements p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Fragment f147029a;

    /* renamed from: b, reason: collision with root package name */
    public final int f147030b;

    @Inject
    public q(@Y61.k Fragment fragment, @j.D int i12) {
        this.f147029a = fragment;
        this.f147030b = i12;
    }

    @Override // com.avito.android.edit_text_field.p
    public final void a(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4) {
        EditTextFieldFragment.f146886n0.getClass();
        EditTextFieldFragment editTextFieldFragment = new EditTextFieldFragment();
        C35966w1.a(editTextFieldFragment, -1, new C30327c(str, str2, str3, str4));
        e(editTextFieldFragment);
    }

    @Override // com.avito.android.edit_text_field.p
    public final void b() {
        EditSellerTypeFragment.f146675s0.getClass();
        EditSellerTypeFragment editSellerTypeFragmentA = EditSellerTypeFragment.a.a(null, null);
        androidx.fragment.app.H hE2 = this.f147029a.getChildFragmentManager().e();
        hE2.j(this.f147030b, editSellerTypeFragmentA, "edit_seller_type_fragment_tag", 1);
        hE2.c(null);
        hE2.e();
    }

    @Override // com.avito.android.edit_text_field.p
    public final void c(@Y61.k AboutItem aboutItem) {
        EditTextFieldFragment.a aVar = EditTextFieldFragment.f146886n0;
        String str = aboutItem.f229102r;
        if (str == null) {
            str = aboutItem.f229088d;
        }
        aVar.getClass();
        EditTextFieldFragment editTextFieldFragment = new EditTextFieldFragment();
        C35966w1.a(editTextFieldFragment, -1, new C30328d(aboutItem.f229090f, str, aboutItem.f229091g, aboutItem.f229092h, aboutItem.f229089e, aboutItem.f229097m, aboutItem.f229093i, aboutItem.f229099o, aboutItem.f229100p, aboutItem.f229101q));
        e(editTextFieldFragment);
    }

    @Override // com.avito.android.edit_text_field.p
    public final boolean d() {
        FragmentManager childFragmentManager = this.f147029a.getChildFragmentManager();
        if (childFragmentManager.H("edit_text_fragment_tag") == null) {
            return false;
        }
        childFragmentManager.Y();
        return true;
    }

    public final void e(EditTextFieldFragment editTextFieldFragment) {
        FragmentManager childFragmentManager = this.f147029a.getChildFragmentManager();
        if (childFragmentManager.H("edit_text_fragment_tag") != null) {
            return;
        }
        androidx.fragment.app.H hE2 = childFragmentManager.e();
        hE2.j(this.f147030b, editTextFieldFragment, "edit_text_fragment_tag", 1);
        hE2.c(null);
        hE2.e();
    }
}
