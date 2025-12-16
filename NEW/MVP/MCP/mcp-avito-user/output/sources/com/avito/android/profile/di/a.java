package com.avito.android.profile.di;

import Y61.k;
import com.avito.android.bottom_navigation.InterfaceC28898u;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.avito.android.profile.user_profile.UserProfileArguments;
import com.avito.android.profile.user_profile.UserProfileFragmentData;
import com.avito.android.profile.user_profile.h;
import com.avito.android.ui.fragments.TabBaseFragment;
import gD.f;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;

/* compiled from: DataTabFragmentFactory.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/bottom_navigation/t", "Lcom/avito/android/bottom_navigation/u;", "_avito_base-component_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements InterfaceC28898u {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f221936b;

    public a(f fVar) {
        this.f221936b = fVar;
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28898u
    @k
    public final Class<?> a() {
        return UserProfileFragmentData.class;
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28898u
    @k
    public final TabBaseFragment b(@k TabFragmentFactory.Data data) {
        f fVar = this.f221936b;
        n<Object> nVar = f.f396389r[9];
        boolean zBooleanValue = ((Boolean) fVar.f396398j.a().invoke()).booleanValue();
        UserProfileArguments userProfileArguments = ((UserProfileFragmentData) data).f224262b;
        return zBooleanValue ? com.avito.android.profile.host.e.a(userProfileArguments) : h.a(userProfileArguments);
    }
}
