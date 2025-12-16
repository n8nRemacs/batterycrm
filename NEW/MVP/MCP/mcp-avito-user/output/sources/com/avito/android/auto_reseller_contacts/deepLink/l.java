package com.avito.android.auto_reseller_contacts.deepLink;

import Fc1.E0;
import Ue.C15512a;
import com.avito.android.deep_linking.links.RequestMessageLink;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import io.reactivex.rxjava3.internal.operators.single.C42023v;
import io.reactivex.rxjava3.internal.operators.single.G;
import java.util.concurrent.Callable;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;

/* compiled from: RequestMessageLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class l extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f95744l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ RequestMessageLink f95745m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, RequestMessageLink requestMessageLink) {
        super(0);
        this.f95744l = mVar;
        this.f95745m = requestMessageLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        final m mVar = this.f95744l;
        final RequestMessageLink requestMessageLink = this.f95745m;
        C42007e c42007e = new C42007e(new l41.s() { // from class: com.avito.android.auto_reseller_contacts.deepLink.f
            @Override // l41.s
            public final Object get() {
                final m mVar2 = mVar;
                C15512a c15512a = mVar2.f95754n;
                c15512a.getClass();
                kotlin.reflect.n<Object> nVar = C15512a.f16526c[0];
                boolean zBooleanValue = ((Boolean) c15512a.f16527b.a().getValue()).booleanValue();
                final RequestMessageLink requestMessageLink2 = requestMessageLink;
                return zBooleanValue ? new G(new Callable() { // from class: com.avito.android.auto_reseller_contacts.deepLink.g
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return (TypedResult) C43259k.e(EmptyCoroutineContext.INSTANCE, new h(mVar2, requestMessageLink2, null));
                    }
                }) : mVar2.f95746f.get().a(requestMessageLink2.f133636b, requestMessageLink2.f133637c);
            }
        });
        InterfaceC35745a5 interfaceC35745a5 = mVar.f95751k;
        mVar.f95757q = (io.reactivex.rxjava3.internal.observers.m) new C42023v(c42007e.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).j(new i(mVar)), new E0(mVar, 18)).x(new j(mVar, requestMessageLink), new k(mVar));
        return G0.f406611a;
    }
}
