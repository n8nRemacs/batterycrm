package EL;

import Y61.k;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.internal.operators.completable.v;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: IacCallRequestInteractorImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEL/b;", "LEL/a;", "_avito_iac-incoming-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.iac_incoming_call_ability.impl_module.api.a f3933a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f3934b;

    @Inject
    public b(@k com.avito.android.iac_incoming_call_ability.impl_module.api.a aVar, @k InterfaceC35745a5 interfaceC35745a5) {
        this.f3933a = aVar;
        this.f3934b = interfaceC35745a5;
    }

    @Override // EL.a
    @k
    public final v a(@k String str, @k String str2, @k String str3) {
        return new v(g1.a(this.f3933a.e(str, str2, str3).z(this.f3934b.a())));
    }
}
