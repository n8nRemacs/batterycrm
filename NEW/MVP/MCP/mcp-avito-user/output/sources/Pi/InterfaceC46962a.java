package pI;

import J81.f;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import e30.InterfaceC39936a;
import e30.InterfaceC39937b;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import qI.C47298a;
import qI.C47299b;
import qI.C47301d;
import qI.e;
import qI.g;

/* compiled from: LocationApi.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0004H§@¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b0\u0004H§@¢\u0006\u0004\b\r\u0010\u000bJ4\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u000e2\b\b\u0003\u0010\u0011\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LpI/a;", "", "", AddressParameter.TYPE, "Lcom/avito/android/remote/model/TypedResult;", "LqI/g;", "b", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LqI/d;", "LqI/b;", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LqI/e;", "a", "", "latitude", "longitude", "flowType", "LqI/a;", "n", "(DDLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: pI.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC46962a {

    /* compiled from: LocationApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pI.a$a, reason: collision with other inner class name */
    public static final class C12262a {
    }

    @f("2/location/suggest/by_query")
    @l
    @InterfaceC39937b
    Object a(@k Continuation<? super TypedResult<C47301d<e>>> continuation);

    @f("2/coords/by_address")
    @l
    @InterfaceC39937b
    Object b(@t(AddressParameter.TYPE) @k String str, @k Continuation<? super TypedResult<g>> continuation);

    @f("1/location/suggest/by_query")
    @l
    @InterfaceC39937b
    Object c(@k Continuation<? super TypedResult<C47301d<C47299b>>> continuation);

    @f("1/location/suggest/by_coordinates")
    @l
    @InterfaceC39937b
    Object n(@t("lat") double d12, @t(AddressParameter.Value.LNG) double d13, @t("flowType") @k String str, @k Continuation<? super TypedResult<C47298a>> continuation);
}
