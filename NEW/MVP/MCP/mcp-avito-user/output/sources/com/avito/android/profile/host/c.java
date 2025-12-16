package com.avito.android.profile.host;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import q90.d;

/* compiled from: UserProfileHostFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/fragment/app/Fragment;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class c extends N implements Y41.a<Fragment> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UserProfileHostFragment f222341l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d.b.a f222342m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(UserProfileHostFragment userProfileHostFragment, d.b.a aVar) {
        super(0);
        this.f222341l = userProfileHostFragment;
        this.f222342m = aVar;
    }

    @Override // Y41.a
    public final Fragment invoke() {
        UserProfileHostFragment userProfileHostFragment = this.f222341l;
        s90.d dVar = userProfileHostFragment.f222330v0;
        if (dVar == null) {
            dVar = null;
        }
        return dVar.a(UserProfileHostFragment.D5(userProfileHostFragment, this.f222342m));
    }
}
