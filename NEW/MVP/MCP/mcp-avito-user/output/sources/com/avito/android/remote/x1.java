package com.avito.android.remote;

import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.adverts.PretendAdvertResult;
import e30.InterfaceC39936a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ValidateAdvertCoroutinesApi.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001Jd\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0003H§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/x1;", "", "", "", "navigation", "phone", "manager", "paramsAndSlots", "publishSessionId", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/adverts/PretendAdvertResult;", "a", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes17.dex */
public interface x1 {

    /* compiled from: ValidateAdvertCoroutinesApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @J81.o("12/items/add/pretend")
    @J81.e
    @Y61.l
    Object a(@J81.d @Y61.k Map<String, String> map, @J81.c("phone") @Y61.l String str, @J81.c("manager") @Y61.l String str2, @J81.d @Y61.k Map<String, String> map2, @J81.c("publishSessionId") @Y61.k String str3, @Y61.k Continuation<? super TypedResult<PretendAdvertResult>> continuation);
}
