package com.avito.android.employee_mode_impl.generated.api;

import J81.f;
import Y61.k;
import Y61.l;
import Yy.C18347a;
import com.avito.android.employee_mode_impl.generated.api.api_messenger_info_v_2.ApiMessengerInfoV2Response;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.parse.adapter.stream_gson.b;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: EmployeeModeApi.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/avito/android/employee_mode_impl/generated/api/EmployeeModeApi;", "", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/employee_mode_impl/generated/api/api_messenger_info_v_2/ApiMessengerInfoV2Response;", "apiMessengerInfoV2", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LYy/a;", "apiUserInfoV2", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes13.dex */
public interface EmployeeModeApi {
    @f("2/ah/messenger_info")
    @b
    @InterfaceC39938c
    @l
    Object apiMessengerInfoV2(@k Continuation<? super TypedResult<ApiMessengerInfoV2Response>> continuation);

    @f("2/ah/user_info")
    @b
    @InterfaceC39938c
    @l
    Object apiUserInfoV2(@k Continuation<? super TypedResult<C18347a>> continuation);
}
