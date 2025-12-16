package com.avito.android.authorization.auth;

import com.avito.android.remote.model.Profile;
import com.avito.android.remote.model.Session;
import com.avito.android.remote.model.SocialAuthResult;
import kotlin.Metadata;

/* compiled from: AuthInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/auth/o;", "", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.authorization.auth.o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC28636o {

    /* compiled from: AuthInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.authorization.auth.o$a */
    public static final class a {
    }

    @Y61.k
    io.reactivex.rxjava3.core.z<SocialAuthResult> c(@Y61.k String str, @Y61.l String str2, @Y61.l String str3);

    @Y61.k
    io.reactivex.rxjava3.internal.operators.completable.M d(@Y61.k Profile profile, @Y61.k Session session, @Y61.l String str);

    @Y61.k
    io.reactivex.rxjava3.core.z<SocialAuthResult> e(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.l String str8);

    @Y61.k
    io.reactivex.rxjava3.internal.operators.single.O f(@Y61.l String str);
}
