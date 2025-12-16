package RB0;

import J81.f;
import J81.o;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: TariffApi.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0005J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H§@¢\u0006\u0004\b\t\u0010\u0005¨\u0006\n"}, d2 = {"LRB0/a;", "", "Lcom/avito/android/remote/model/TypedResult;", "LSB0/a;", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LTB0/a;", "a", "LUB0/c;", "b", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes4.dex */
public interface a {
    @f("2/sf/tariffLimits")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@k Continuation<? super TypedResult<TB0.a>> continuation);

    @f("4/tariff/cpx/info")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @J81.k({"X-Geo-required: true"})
    @l
    Object b(@k Continuation<? super TypedResult<UB0.c>> continuation);

    @o("1/sf/terms/accept")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object c(@k Continuation<? super TypedResult<SB0.a>> continuation);
}
