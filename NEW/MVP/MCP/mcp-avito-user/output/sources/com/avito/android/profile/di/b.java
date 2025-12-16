package com.avito.android.profile.di;

import Y41.l;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.profile.user_profile.UserProfileArguments;
import com.avito.android.profile.user_profile.h;
import com.avito.android.ui.fragments.TabBaseFragment;
import gD.f;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.reflect.n;

/* compiled from: ProfileTabFragmentFactoryModule.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "it", "Lcom/avito/android/bottom_navigation/NavigationTabSetItem;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class b extends N implements l<NavigationTabSetItem, TabBaseFragment> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f221937l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar) {
        super(1);
        this.f221937l = fVar;
    }

    @Override // Y41.l
    public final TabBaseFragment invoke(NavigationTabSetItem navigationTabSetItem) {
        f fVar = this.f221937l;
        n<Object> nVar = f.f396389r[9];
        return ((Boolean) fVar.f396398j.a().invoke()).booleanValue() ? com.avito.android.profile.host.e.a(new UserProfileArguments(null, 1, null)) : h.a(new UserProfileArguments(null, 1, null));
    }
}
