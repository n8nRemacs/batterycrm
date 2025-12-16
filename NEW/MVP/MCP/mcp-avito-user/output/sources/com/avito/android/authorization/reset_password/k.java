package com.avito.android.authorization.reset_password;

import com.avito.android.util.Kundle;
import kotlin.Metadata;

/* compiled from: ResetPasswordPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/reset_password/k;", "", "a", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface k {

    /* compiled from: ResetPasswordPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/reset_password/k$a;", "", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: ResetPasswordPresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.authorization.reset_password.k$a$a, reason: collision with other inner class name */
        public static final class C2792a {
            public static /* synthetic */ void a(ResetPasswordActivity resetPasswordActivity, String str, int i12) {
                if ((i12 & 1) != 0) {
                    str = null;
                }
                resetPasswordActivity.a2(str, (i12 & 2) == 0);
            }
        }
    }

    void a(@Y61.k B b12);

    void b(@Y61.l String str);

    void c(@Y61.k ResetPasswordActivity resetPasswordActivity);

    void c0();

    @Y61.k
    Kundle d0();

    void e0();
}
