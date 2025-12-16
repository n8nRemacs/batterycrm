package com.avito.android.messenger.service;

import com.avito.android.remote.model.Session;
import kotlin.Metadata;

/* compiled from: MessengerSessionProvider.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/remote/model/Session;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class g<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final g<T, R> f197257b = new g<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        return ((Session) obj).getAccessToken();
    }
}
