package pF;

import J81.f;
import J81.k;
import J81.o;
import J81.s;
import Y61.l;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import qF.C47287a;
import rF.C47532a;
import sF.C48041a;

/* compiled from: GeoCommonApi.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"LpF/a;", "", "LsF/a;", "request", "Lcom/avito/android/remote/model/TypedResult;", "b", "(LsF/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", SearchParamsConverterKt.LOCATION_ID, "LqF/a;", "c", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LrF/a;", "a", "_avito_geo-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: pF.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC46942a {
    @f("3/locations/{locationId}/districts")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object a(@s(SearchParamsConverterKt.LOCATION_ID) long j12, @Y61.k Continuation<? super TypedResult<C47532a>> continuation);

    @o("1/job/cv/assistant/location/save")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object b(@J81.a @Y61.k C48041a c48041a, @Y61.k Continuation<? super TypedResult<Object>> continuation);

    @f("3/locations/{locationId}/directions")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object c(@s(SearchParamsConverterKt.LOCATION_ID) long j12, @Y61.k Continuation<? super TypedResult<C47287a>> continuation);
}
