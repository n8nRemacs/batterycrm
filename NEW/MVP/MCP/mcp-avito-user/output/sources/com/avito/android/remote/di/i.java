package com.avito.android.remote.di;

import com.avito.android.remote.model.ExtendedProfilePhoneResponse;
import com.avito.android.remote.model.ExtendedProfileResult;
import com.avito.android.remote.model.ExtendedProfileResultOk;
import com.avito.android.remote.model.ExtendedProfileResultPlaceholder;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.util.C35866p0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.collections.b1;

/* compiled from: ExtendedProfileJsonModule_ProvideCustomTypeAdaptersFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/di/i;", "Ldagger/internal/h;", "", "Lcom/avito/android/util/p0;", "LX41/o;", "<init>", "()V", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class i implements dagger.internal.h<Set<C35866p0>> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final i f253368a = new i();

    @Override // javax.inject.Provider
    public final Object get() {
        h.f253367a.getClass();
        return b1.g(new C35866p0(ExtendedProfilePhoneResponse.class, P0.g(new Q("ok", ExtendedProfilePhoneResponse.Ok.class), new Q("failure", ExtendedProfilePhoneResponse.Failure.class))), new C35866p0(ExtendedProfileResult.class, P0.g(new Q("ok", ExtendedProfileResultOk.class), new Q(ChannelContext.Item.PLACEHOLDER, ExtendedProfileResultPlaceholder.class))));
    }
}
