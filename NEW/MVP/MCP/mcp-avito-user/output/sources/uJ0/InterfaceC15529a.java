package Uj0;

import J81.f;
import J81.s;
import Vj0.C15687a;
import Y61.k;
import Y61.l;
import com.avito.android.remote.config.generated.api.api_4_config_by_config_get.Api4ConfigByConfigGetResponse;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ConfigApi.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b0\u0004H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LUj0/a;", "", "", Navigation.CONFIG, "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/config/generated/api/api_4_config_by_config_get/Api4ConfigByConfigGetResponse;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "LVj0/a;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-api_config"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Uj0.a, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public interface InterfaceC15529a {
    @f("4/config/{config}")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@s(Navigation.CONFIG) @k String str, @k Continuation<? super TypedResult<Api4ConfigByConfigGetResponse>> continuation);

    @f("4/features")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object b(@k Continuation<? super TypedResult<Map<String, C15687a>>> continuation);
}
