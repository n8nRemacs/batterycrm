package com.avito.android.user_viewed.screen.mvi;

import android.os.Bundle;
import android.os.SystemClock;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.ScreenIdField;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.arch.mvi.a;
import com.avito.android.user_viewed.screen.mvi.entity.UserViewedInternalAction;
import com.avito.android.user_viewed.screen.mvi.entity.UserViewedState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import lK0.InterfaceC43650a;

/* compiled from: UserViewedActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_viewed/screen/mvi/e;", "Lcom/avito/android/arch/mvi/a;", "LlK0/a;", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedInternalAction;", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedState;", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements com.avito.android.arch.mvi.a<InterfaceC43650a, UserViewedInternalAction, UserViewedState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_viewed.domain.business.a f318407a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.h f318408b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.provider.e f318409c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f318410d;

    @Inject
    public e(@Y61.k com.avito.android.user_viewed.domain.business.a aVar, @Y61.k com.avito.android.favorite.h hVar, @Y61.k com.avito.android.analytics.provider.e eVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f318407a = aVar;
        this.f318408b = hVar;
        this.f318409c = eVar;
        this.f318410d = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<UserViewedInternalAction> b(InterfaceC43650a interfaceC43650a, UserViewedState userViewedState) {
        InterfaceC43650a interfaceC43650a2 = interfaceC43650a;
        UserViewedState userViewedState2 = userViewedState;
        if (interfaceC43650a2.equals(InterfaceC43650a.f.f413724a)) {
            return C43175k.G(new a(userViewedState2, this, null));
        }
        if (interfaceC43650a2.equals(InterfaceC43650a.d.f413720a)) {
            return C43175k.G(new b(this, null));
        }
        if (!(interfaceC43650a2 instanceof InterfaceC43650a.b)) {
            if (interfaceC43650a2 instanceof InterfaceC43650a.c) {
                return C43175k.G(new c(this, interfaceC43650a2, null));
            }
            if (interfaceC43650a2 instanceof InterfaceC43650a.e) {
                return C43175k.G(new d(this, interfaceC43650a2, null));
            }
            if (interfaceC43650a2.equals(InterfaceC43650a.C11783a.f413710a)) {
                return new C43210w(UserViewedInternalAction.ListResetting.f318413b);
            }
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC43650a.b bVar = (InterfaceC43650a.b) interfaceC43650a2;
        Bundle bundle = new Bundle();
        String str = bVar.f413715e;
        if (str != null) {
            bundle.putString("old_price", str);
        }
        bundle.putString("title", bVar.f413713c);
        bundle.putString("price", bVar.f413714d);
        bundle.putBoolean("active", bVar.f413716f);
        bundle.putString("key_category_id", bVar.f413712b);
        bundle.putLong("click_time", SystemClock.elapsedRealtime());
        long jA2 = this.f318409c.a();
        ScreenIdField screenIdField = ScreenIdField.f90251c;
        bundle.putParcelable("tree_parent", new TreeClickStreamParent(jA2, "user_viewed", null, null));
        return new C43210w(new UserViewedInternalAction.OpenDeeplink(bVar.f413711a, bundle));
    }
}
