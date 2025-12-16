package com.avito.android.authorization.reset_password;

import com.avito.android.remote.InterfaceC34258d;
import com.avito.android.remote.model.ResetPasswordResult;
import com.avito.android.util.C5;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ResetPasswordInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/reset_password/i;", "Lcom/avito/android/authorization/reset_password/c;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC34258d> f94174a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.remote.r> f94175b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final x f94176c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f94177d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f94178e;

    @Inject
    public i(@Y61.k h31.e<InterfaceC34258d> eVar, @Y61.k h31.e<com.avito.android.remote.r> eVar2, @Y61.k x xVar, @Y61.k com.avito.android.remote.error.f fVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f94174a = eVar;
        this.f94175b = eVar2;
        this.f94176c = xVar;
        this.f94177d = fVar;
        this.f94178e = interfaceC35745a5;
    }

    @Override // com.avito.android.authorization.reset_password.c
    @Y61.k
    public final I<ResetPasswordResult> a(@Y61.k final String str) {
        boolean zE2 = C5.f318567a.e(str);
        InterfaceC35745a5 interfaceC35745a5 = this.f94178e;
        if (zE2) {
            final int i12 = 0;
            return g1.a(new C42007e(new l41.s(this) { // from class: com.avito.android.authorization.reset_password.d

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ i f94142c;

                {
                    this.f94142c = this;
                }

                @Override // l41.s
                public final Object get() {
                    switch (i12) {
                        case 0:
                            return this.f94142c.f94174a.get().k(str);
                        default:
                            return this.f94142c.f94175b.get().h(str);
                    }
                }
            }).z(interfaceC35745a5.a()).t(new e(this))).n(new f(this, str));
        }
        final int i13 = 1;
        return g1.a(new C42007e(new l41.s(this) { // from class: com.avito.android.authorization.reset_password.d

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ i f94142c;

            {
                this.f94142c = this;
            }

            @Override // l41.s
            public final Object get() {
                switch (i13) {
                    case 0:
                        return this.f94142c.f94174a.get().k(str);
                    default:
                        return this.f94142c.f94175b.get().h(str);
                }
            }
        }).z(interfaceC35745a5.a())).n(new g(this, str)).r(h.f94173b);
    }
}
