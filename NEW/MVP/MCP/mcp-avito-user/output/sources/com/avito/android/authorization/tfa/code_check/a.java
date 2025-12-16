package com.avito.android.authorization.tfa.code_check;

import Y61.k;
import com.avito.android.code_check_public.CodeCheckLink;
import com.avito.android.code_check_public.a;
import com.avito.android.code_check_public.d;
import com.avito.android.code_check_public.e;
import com.avito.android.code_check_public.f;
import com.avito.android.deep_linking.links.auth.RequireTfaRecoveryLink;
import com.avito.android.remote.model.TfaFlow;
import com.avito.android.remote.model.TfaSource;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;

/* compiled from: TfaCodeCheckScenarioBuilder.kt */
@C11.a
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/tfa/code_check/a;", "Lcom/avito/android/code_check_public/e;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@f
/* loaded from: classes11.dex */
public final class a extends e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Map<TfaSource, Provider<com.avito.android.authorization.tfa.code_check.screen_builder.a>> f94640b;

    /* compiled from: TfaCodeCheckScenarioBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.authorization.tfa.code_check.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C2810a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f94641a;

        static {
            int[] iArr = new int[TfaFlow.values().length];
            try {
                iArr[TfaFlow.PUSH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TfaFlow.SMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TfaFlow.SUPPORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f94641a = iArr;
        }
    }

    /* compiled from: TfaCodeCheckScenarioBuilder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/code_check_public/a;", "invoke", "()Lcom/avito/android/code_check_public/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.android.code_check_public.a> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.code_check_public.a invoke() {
            return new a.InterfaceC3494a.b(new RequireTfaRecoveryLink(((CodeCheckLink.Flow.TfaCheck) a.this.b()).f119259c), null, 2, null);
        }
    }

    @Inject
    public a(@k Map<TfaSource, Provider<com.avito.android.authorization.tfa.code_check.screen_builder.a>> map) {
        this.f94640b = map;
    }

    @Override // com.avito.android.code_check_public.e
    @k
    public final d a() {
        com.avito.android.code_check_public.a aVarC;
        CodeCheckLink.Flow.TfaCheck tfaCheck = (CodeCheckLink.Flow.TfaCheck) b();
        int i12 = C2810a.f94641a[((CodeCheckLink.Flow.TfaCheck) b()).f119258b.ordinal()];
        CodeCheckLink.Flow.TfaCheck.LoginInfo loginInfo = tfaCheck.f119260d;
        if (i12 == 1) {
            aVarC = c().c(loginInfo);
        } else if (i12 == 2) {
            aVarC = c().d(loginInfo);
        } else {
            if (i12 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            aVarC = new a.b.C3496a(new b());
        }
        return new d(aVarC);
    }

    public final com.avito.android.authorization.tfa.code_check.screen_builder.a c() {
        Provider<com.avito.android.authorization.tfa.code_check.screen_builder.a> provider = this.f94640b.get(((CodeCheckLink.Flow.TfaCheck) b()).f119259c);
        if (provider != null) {
            return provider.get();
        }
        throw new IllegalArgumentException(("CodeCheckScreenBuilder must be provided for TfaReason=" + ((CodeCheckLink.Flow.TfaCheck) b()).f119259c).toString());
    }
}
