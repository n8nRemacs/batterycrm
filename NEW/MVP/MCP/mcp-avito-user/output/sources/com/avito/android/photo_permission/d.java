package com.avito.android.photo_permission;

import Y61.l;
import android.os.Bundle;
import androidx.core.os.C22777e;
import androidx.fragment.app.C;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23057q;
import com.avito.android.permissions.u;
import com.avito.android.photo_permission.PhotoPermissionResult;
import com.avito.android.photo_permission.a;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;

/* compiled from: PhotoPermissionDialogDelegate.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_permission/d;", "Lcom/avito/android/photo_permission/a;", "Landroidx/lifecycle/q;", "Landroidx/fragment/app/C;", "_avito_photo-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements a, InterfaceC23057q, C {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22983P f218726b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final FragmentManager f218727c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final u f218728d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public a.InterfaceC6567a f218729e;

    public d(@Y61.k InterfaceC22983P interfaceC22983P, @Y61.k FragmentManager fragmentManager, @Y61.k u uVar) {
        this.f218726b = interfaceC22983P;
        this.f218727c = fragmentManager;
        this.f218728d = uVar;
        interfaceC22983P.getLifecycle().a(this);
    }

    @Override // com.avito.android.photo_permission.a
    public final void a(@Y61.k PhotoPermissionDialogData photoPermissionDialogData) {
        FragmentManager fragmentManager = this.f218727c;
        Fragment fragmentH = fragmentManager.H("com.avito.android.photo_permission_dialog_tag");
        PhotoPermissionDialogFragment photoPermissionDialogFragment = fragmentH instanceof PhotoPermissionDialogFragment ? (PhotoPermissionDialogFragment) fragmentH : null;
        if (photoPermissionDialogFragment == null) {
            PhotoPermissionDialogFragment.f218699t0.getClass();
            photoPermissionDialogFragment = new PhotoPermissionDialogFragment();
            photoPermissionDialogFragment.setArguments(C22777e.b(new Q("key_photo_permission_dialog_data", photoPermissionDialogData)));
        }
        if (!d(photoPermissionDialogData.f218698b.keySet()).isEmpty()) {
            if (photoPermissionDialogFragment.isAdded()) {
                return;
            }
            photoPermissionDialogFragment.showNow(fragmentManager, "com.avito.android.photo_permission_dialog_tag");
        } else {
            if (photoPermissionDialogFragment.isAdded()) {
                photoPermissionDialogFragment.dismissAllowingStateLoss();
            }
            a.InterfaceC6567a interfaceC6567a = this.f218729e;
            if (interfaceC6567a != null) {
                interfaceC6567a.o3(PhotoPermissionResult.Allow.f218723b);
            }
        }
    }

    @Override // com.avito.android.photo_permission.a
    @Y61.k
    public final LinkedHashSet b(@Y61.k PhotoPermissionDialogData photoPermissionDialogData) {
        return d(photoPermissionDialogData.f218698b.keySet());
    }

    @Override // com.avito.android.photo_permission.a
    public final void c(@Y61.k a.InterfaceC6567a interfaceC6567a) {
        this.f218729e = interfaceC6567a;
        this.f218727c.p0("com.avito.android.photo_permission_dialog_request_key", this.f218726b, this);
    }

    public final LinkedHashSet d(Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (!this.f218728d.b(((PhotoPermission) obj).o3())) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    @Override // androidx.fragment.app.C
    public final void k(@Y61.k Bundle bundle, @Y61.k String str) {
        a.InterfaceC6567a interfaceC6567a;
        if (!str.equals("com.avito.android.photo_permission_dialog_request_key") || (interfaceC6567a = this.f218729e) == null) {
            return;
        }
        PhotoPermissionResult photoPermissionResult = (PhotoPermissionResult) bundle.getParcelable("com.avito.android.photo_permission_result_bundle_key");
        if (photoPermissionResult == null) {
            photoPermissionResult = PhotoPermissionResult.Disallow.f218724b;
        }
        interfaceC6567a.o3(photoPermissionResult);
    }

    @Override // androidx.view.InterfaceC23057q
    public final void onDestroy(@Y61.k InterfaceC22983P interfaceC22983P) {
        this.f218726b.getLifecycle().c(this);
        this.f218729e = null;
    }
}
