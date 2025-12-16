package FL;

import Y61.k;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.internal.operators.completable.v;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: IacChatButtonsInteractorImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFL/a;", "LLL/b;", "_avito_iac-incoming-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements LL.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.iac_incoming_call_ability.impl_module.chat_button.api.a f4683a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f4684b;

    @Inject
    public a(@k com.avito.android.iac_incoming_call_ability.impl_module.chat_button.api.a aVar, @k InterfaceC35745a5 interfaceC35745a5) {
        this.f4683a = aVar;
        this.f4684b = interfaceC35745a5;
    }

    @Override // LL.b
    @k
    public final v a(@k String str) {
        return new v(g1.a(this.f4683a.a(str).z(this.f4684b.a())));
    }
}
