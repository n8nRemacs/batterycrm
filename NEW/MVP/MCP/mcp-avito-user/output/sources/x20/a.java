package X20;

import J81.f;
import J81.p;
import Y61.k;
import Y61.l;
import com.avito.android.navigation_config.generated.api.get_navigation_config.GetNavigationConfigResponse;
import com.avito.android.navigation_config.generated.api.set_alternative_main.MainType;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: NavigationConfigApi.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LX20/a;", "", "Lcom/avito/android/navigation_config/generated/api/set_alternative_main/MainType;", "request", "Lcom/avito/android/remote/model/TypedResult;", "LY20/a;", "a", "(Lcom/avito/android/navigation_config/generated/api/set_alternative_main/MainType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/navigation_config/generated/api/get_navigation_config/GetNavigationConfigResponse;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_navigation-config_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes15.dex */
public interface a {
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    @p("1/alternative_main")
    Object a(@J81.a @k MainType mainType, @k Continuation<? super TypedResult<Y20.a>> continuation);

    @f("1/navigation_config")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object b(@k Continuation<? super TypedResult<GetNavigationConfigResponse>> continuation);
}
