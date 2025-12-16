package Nu0;

import Pu0.InterfaceC14839a;
import Su0.C15227c;
import Y61.k;
import Y61.l;
import com.avito.android.preloading.coroutines.C;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.service_orders.ServiceOrdersArguments;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ServiceListPreloadingPromise.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001¨\u0006\u0005"}, d2 = {"LNu0/a;", "Lcom/avito/android/preloading/coroutines/C;", "", "Lcom/avito/android/remote/model/TypedResult;", "LSu0/c;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Nu0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14613a extends C<String, TypedResult<C15227c>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC14839a f11798a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final ServiceOrdersArguments f11799b;

    @Inject
    public C14613a(@k InterfaceC14839a interfaceC14839a, @l ServiceOrdersArguments serviceOrdersArguments) {
        this.f11798a = interfaceC14839a;
        this.f11799b = serviceOrdersArguments;
    }

    @Override // com.avito.android.preloading.coroutines.C
    public final Object b(String str, Continuation<? super TypedResult<C15227c>> continuation) {
        String str2 = str;
        ServiceOrdersArguments serviceOrdersArguments = this.f11799b;
        return this.f11798a.a(serviceOrdersArguments != null ? serviceOrdersArguments.f279052c : null, str2, continuation);
    }
}
