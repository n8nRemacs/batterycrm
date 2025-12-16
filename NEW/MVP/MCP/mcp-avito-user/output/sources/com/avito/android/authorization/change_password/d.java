package com.avito.android.authorization.change_password;

import com.avito.android.remote.InterfaceC34258d;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.recover_by_phone.ResetPasswordResult;
import com.avito.android.util.ApiException;
import com.avito.android.util.C5;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Y5;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: ChangeResettedPasswordInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/change_password/d;", "Lcom/avito/android/authorization/change_password/c;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f93327a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34258d f93328b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f93329c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f93330d;

    /* compiled from: ChangeResettedPasswordInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/recover_by_phone/ResetPasswordResult;", "result", "Lio/reactivex/rxjava3/core/E;", "Lkotlin/G0;", "apply", "(Lcom/avito/android/remote/model/recover_by_phone/ResetPasswordResult;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {
        public a() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            ResetPasswordResult resetPasswordResult = (ResetPasswordResult) obj;
            if (resetPasswordResult instanceof ResetPasswordResult.Ok) {
                return z.c0(G0.f406611a);
            }
            boolean z12 = resetPasswordResult instanceof ResetPasswordResult.Failure;
            d dVar = d.this;
            if (z12) {
                ApiError.UnknownError unknownErrorA = com.avito.android.remote.error.j.a(2, ((ResetPasswordResult.Failure) resetPasswordResult).getMessage(), null);
                dVar.getClass();
                return z.M(new ApiException(unknownErrorA, null, 2, null));
            }
            if (!(resetPasswordResult instanceof ResetPasswordResult.IncorrectData)) {
                throw new NoWhenBranchMatchedException();
            }
            ApiError.IncorrectData incorrectData = new ApiError.IncorrectData(((ResetPasswordResult.IncorrectData) resetPasswordResult).getMessages());
            dVar.getClass();
            return z.M(new ApiException(incorrectData, null, 2, null));
        }
    }

    @Inject
    public d(@com.avito.android.authorization.change_password.di.g @Y61.k String str, @com.avito.android.authorization.change_password.di.f @Y61.k String str2, @Y61.k InterfaceC34258d interfaceC34258d, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f93327a = str2;
        this.f93328b = interfaceC34258d;
        this.f93329c = interfaceC35745a5;
        this.f93330d = C5.f318567a.e(str) ? "email" : "phone";
    }

    @Override // com.avito.android.authorization.change_password.c
    @Y61.k
    public final z<G0> a(@Y61.k String str) {
        return Y5.a(this.f93328b.n(str, this.f93327a, this.f93330d).x0(this.f93329c.a())).T(new a(), Integer.MAX_VALUE);
    }
}
