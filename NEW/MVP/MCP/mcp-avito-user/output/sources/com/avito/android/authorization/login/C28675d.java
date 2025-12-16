package com.avito.android.authorization.login;

import com.avito.android.account.InterfaceC27663a;
import com.avito.android.account.X;
import com.avito.android.remote.model.LoginResult;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.C35936s;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.internal.operators.observable.H0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: LoginInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/login/d;", "Lcom/avito/android/authorization/login/c;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.authorization.login.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28675d implements InterfaceC28674c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27663a f94003a;

    /* compiled from: TypedResults.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "T", "Lcom/avito/android/util/P2;", VoiceInfo.STATE, "Lio/reactivex/rxjava3/core/E;", "apply", "(Lcom/avito/android/util/P2;)Lio/reactivex/rxjava3/core/E;", "com/avito/android/util/a6", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.authorization.login.d$a */
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f94004b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            P2 p22 = (P2) obj;
            if (p22 instanceof P2.c) {
                return H0.f403644b;
            }
            if (p22 instanceof P2.b) {
                return io.reactivex.rxjava3.core.z.c0(((P2.b) p22).f318720a);
            }
            if (p22 instanceof P2.a) {
                return io.reactivex.rxjava3.core.z.M(C35936s.a(((P2.a) p22).f318719a, null));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Inject
    public C28675d(@Y61.k InterfaceC27663a interfaceC27663a) {
        this.f94003a = interfaceC27663a;
    }

    @Override // com.avito.android.authorization.login.InterfaceC28674c
    @Y61.k
    public final io.reactivex.rxjava3.core.z<LoginResult> b(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4) {
        return this.f94003a.c(new X.a(str, str2), str3, str4).T(a.f94004b, Integer.MAX_VALUE).S().F();
    }
}
