package com.avito.android.account;

import com.avito.android.remote.model.Session;
import com.avito.android.remote.model.SessionKt;
import kotlin.Metadata;

/* compiled from: AccountStorageInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/remote/model/Session;", "apply", "(Lcom/avito/android/remote/model/Session;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class J<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final J<T, R> f68043b = new J<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        return Boolean.valueOf(SessionKt.isAuthorized((Session) obj));
    }
}
