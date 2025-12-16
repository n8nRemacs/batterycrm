package com.avito.android.remote.model;

import Y61.k;
import kotlin.Metadata;

/* compiled from: Session.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"isAuthorized", "", "Lcom/avito/android/remote/model/Session;", "_avito-discouraged_avito-api_profile"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SessionKt {
    public static final boolean isAuthorized(@k Session session) {
        return !session.equals(Session.INSTANCE.getNULL());
    }
}
