package com.avito.android.permissions;

import androidx.fragment.app.Fragment;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FragmentPermissionHelper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/permissions/b;", "Lcom/avito/android/permissions/x;", "Lcom/avito/android/permissions/u;", "_common_permissions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.permissions.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C33032b implements x, u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Fragment f215111a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f215112b;

    @Inject
    public C33032b(@Y61.k Fragment fragment) {
        this.f215111a = fragment;
        this.f215112b = new v(fragment.requireContext());
    }

    @Override // com.avito.android.permissions.x
    public final boolean a(@Y61.k String str) {
        return this.f215111a.shouldShowRequestPermissionRationale(str);
    }

    @Override // com.avito.android.permissions.u
    public final boolean b(@Y61.k String str) {
        return this.f215112b.b(str);
    }

    @Override // com.avito.android.permissions.u
    public final boolean c(@Y61.k String[] strArr, @Y61.k int[] iArr, @Y61.k String str) {
        return this.f215112b.c(strArr, iArr, str);
    }

    @Override // com.avito.android.permissions.x
    public final void d(int i12, @Y61.k String... strArr) {
        Fragment fragment = this.f215111a;
        if (fragment.isAdded()) {
            fragment.requestPermissions(strArr, i12);
        }
    }
}
