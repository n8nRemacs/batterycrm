package com.avito.android.user_adverts.root_screen.adverts_host;

import com.avito.android.passport.profile_add.l;
import com.avito.android.profile_settings.u;
import com.avito.android.user_adverts.tab_screens.UserAdvertsListParams;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;

/* compiled from: UserAdvertsHostListParamsProvider.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class T extends C42801a implements Y41.r<TI0.c, u.a, l.a, Continuation<? super UserAdvertsListParams.UserInfo>, Object>, SuspendFunction {
    @Override // Y41.r
    public final Object invoke(TI0.c cVar, u.a aVar, l.a aVar2, Continuation<? super UserAdvertsListParams.UserInfo> continuation) {
        P p12 = (P) this.receiver;
        p12.getClass();
        return new UserAdvertsListParams.UserInfo(p12.f312267e, cVar.f15553b.f16335a, aVar.f228512a, aVar2.f212377a);
    }
}
