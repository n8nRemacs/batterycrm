package com.avito.android.edit_address;

import androidx.compose.runtime.internal.P;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.H;
import com.avito.android.edit_address.entity.ExtendedProfilesSettingsAddress;
import com.avito.android.util.C35966w1;
import j.D;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;

/* compiled from: EditAddressRouter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/edit_address/v;", "Lcom/avito/android/edit_address/u;", "a", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class v implements u {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f146007d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Fragment f146008a;

    /* renamed from: b, reason: collision with root package name */
    public final int f146009b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.edit_address.a f146010c;

    /* compiled from: EditAddressRouter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/edit_address/v$a;", "", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Inject
    public v(@Y61.k Fragment fragment, @D int i12, @Y61.k com.avito.android.edit_address.a aVar) {
        this.f146008a = fragment;
        this.f146009b = i12;
        this.f146010c = aVar;
    }

    @Override // com.avito.android.edit_address.u
    public final void a(@Y61.k String str, @Y61.l ExtendedProfilesSettingsAddress extendedProfilesSettingsAddress) {
        EditAddressMviFragment.f145750u0.getClass();
        EditAddressMviFragment editAddressMviFragment = new EditAddressMviFragment();
        C35966w1.a(editAddressMviFragment, -1, new j(str, extendedProfilesSettingsAddress));
        FragmentManager childFragmentManager = this.f146008a.getChildFragmentManager();
        if (childFragmentManager.H("edit_address_fragment_tag") != null) {
            return;
        }
        H hE2 = childFragmentManager.e();
        hE2.j(this.f146009b, editAddressMviFragment, "edit_address_fragment_tag", 1);
        hE2.c(null);
        hE2.e();
    }

    @Override // com.avito.android.edit_address.u
    public final boolean b(boolean z12) {
        this.f146008a.getChildFragmentManager().o0(C22777e.b(new Q("address_result_has_changed", Boolean.valueOf(z12))), "edit_address_result_result_key");
        return c();
    }

    @Override // com.avito.android.edit_address.u
    public final boolean c() {
        FragmentManager childFragmentManager = this.f146008a.getChildFragmentManager();
        if (childFragmentManager.H("edit_address_fragment_tag") == null) {
            return false;
        }
        childFragmentManager.Y();
        return true;
    }

    @Override // com.avito.android.edit_address.u
    public final void d(@Y61.k Fragment fragment) {
        fragment.startActivityForResult(this.f146010c.a(), 801);
    }
}
