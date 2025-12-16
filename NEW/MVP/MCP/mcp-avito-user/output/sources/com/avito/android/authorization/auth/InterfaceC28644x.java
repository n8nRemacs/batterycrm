package com.avito.android.authorization.auth;

import com.avito.android.remote.model.Profile;
import com.avito.android.remote.model.Session;
import com.avito.android.util.Kundle;
import kotlin.Metadata;

/* compiled from: AuthPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/auth/x;", "", "b", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.authorization.auth.x, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC28644x {

    /* compiled from: AuthPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.authorization.auth.x$a */
    public static final class a {
    }

    /* compiled from: AuthPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/auth/x$b;", "", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.authorization.auth.x$b */
    public interface b {

        /* compiled from: AuthPresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.authorization.auth.x$b$a */
        public static final class a {
        }
    }

    void a();

    void b(@Y61.k Profile profile, @Y61.k Session session);

    void c();

    void c0();

    void d(@Y61.k AuthFragment authFragment);

    @Y61.k
    Kundle d0();

    void e(@Y61.k h0 h0Var);

    void e0();

    void f(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.l String str8);

    void g();

    void h();

    void i();

    void j();

    void k(@Y61.l String str);
}
