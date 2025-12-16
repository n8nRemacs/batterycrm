package com.avito.android.authorization.upgrade_password;

import com.avito.android.P;
import com.avito.android.account.G;
import com.avito.android.remote.InterfaceC34258d;
import com.avito.android.remote.model.Session;
import com.avito.android.remote.model.SessionKt;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.TypedResultKt;
import com.avito.android.remote.model.password.PasswordChangeResult;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: UpgradePasswordInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/upgrade_password/f;", "Lcom/avito/android/authorization/upgrade_password/e;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements InterfaceC28695e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34258d f94805a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final G f94806b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final P f94807c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f94808d;

    /* compiled from: UpgradePasswordInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/Session;", "session", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/password/PasswordChangeResult;", "apply", "(Lcom/avito/android/remote/model/Session;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f94810c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f94811d;

        public a(String str, String str2) {
            this.f94810c = str;
            this.f94811d = str2;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            Session session = (Session) obj;
            if (!SessionKt.isAuthorized(session)) {
                return TypedResultKt.toTypedObservable(com.avito.android.remote.error.j.c());
            }
            return f.this.f94805a.g(this.f94810c, session.getPhash(), !r0.f94807c.v().invoke().booleanValue(), this.f94811d);
        }
    }

    /* compiled from: UpgradePasswordInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/password/PasswordChangeResult;", "it", "Lcom/avito/android/util/P2;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T, R> f94812b = new b<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                return new P2.b(((TypedResult.Success) typedResult).getResult());
            }
            if (typedResult instanceof TypedResult.Error) {
                return new P2.a(((TypedResult.Error) typedResult).getError());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Inject
    public f(@Y61.k InterfaceC34258d interfaceC34258d, @Y61.k G g12, @Y61.k P p12, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f94805a = interfaceC34258d;
        this.f94806b = g12;
        this.f94807c = p12;
        this.f94808d = interfaceC35745a5;
    }

    @Override // com.avito.android.authorization.upgrade_password.InterfaceC28695e
    @Y61.k
    public final io.reactivex.rxjava3.core.z<P2<PasswordChangeResult>> a(@Y61.k String str, @Y61.l String str2) {
        return io.reactivex.rxjava3.core.z.q(io.reactivex.rxjava3.core.z.c0(P2.c.f318721a), this.f94806b.getF68056k().S().p(new a(str, str2)).x0(this.f94808d.a()).d0(b.f94812b));
    }
}
