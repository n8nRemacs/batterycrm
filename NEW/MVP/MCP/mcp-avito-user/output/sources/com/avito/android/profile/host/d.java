package com.avito.android.profile.host;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.avito.android.profile.pro.ProfileProArguments;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import q90.d;

/* compiled from: UserProfileHostFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UserProfileHostFragment f222343l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d.b.a f222344m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(UserProfileHostFragment userProfileHostFragment, d.b.a aVar) {
        super(0);
        this.f222343l = userProfileHostFragment;
        this.f222344m = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        UserProfileHostFragment userProfileHostFragment = this.f222343l;
        FragmentManager childFragmentManager = userProfileHostFragment.getChildFragmentManager();
        ProfileProArguments.a aVar = ProfileProArguments.f222422d;
        Bundle bundle = new Bundle(1);
        ProfileProArguments profileProArgumentsD5 = UserProfileHostFragment.D5(userProfileHostFragment, this.f222344m);
        aVar.getClass();
        bundle.putParcelable("com.avito.android.profile.pro.ProfileProArguments", profileProArgumentsD5);
        childFragmentManager.o0(bundle, "profile-pro-update-key");
        return G0.f406611a;
    }
}
