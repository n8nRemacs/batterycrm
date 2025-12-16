package l60;

import J81.f;
import J81.i;
import J81.k;
import J81.o;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import m60.InterfaceC43891a;
import o60.d;

/* compiled from: PassportLibApi.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H§@¢\u0006\u0004\b\t\u0010\nJ\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\f\u0010\u0007J \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ll60/a;", "", "", "mergekey", "Lcom/avito/android/remote/model/TypedResult;", "Lm60/a;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lp60/b;", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/passport_lib/generated/api/check_accounts_mergeability_api_v_3/a;", "d", "Lo60/d;", "request", "Lcom/avito/android/passport_lib/generated/api/profile_switch_api_v_3/a;", "b", "(Lo60/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: l60.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC43550a {
    @o("1/accounts_merge/phone_number_input")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object a(@i("Mergekey") @l String str, @Y61.k Continuation<? super TypedResult<InterfaceC43891a>> continuation);

    @o("3/profile/switch")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object b(@J81.a @Y61.k d dVar, @Y61.k Continuation<? super TypedResult<com.avito.android.passport_lib.generated.api.profile_switch_api_v_3.a>> continuation);

    @f("2/profiles/list")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object c(@Y61.k Continuation<? super TypedResult<p60.b>> continuation);

    @o("3/accounts_merge/check")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object d(@i("Mergekey") @l String str, @Y61.k Continuation<? super TypedResult<com.avito.android.passport_lib.generated.api.check_accounts_mergeability_api_v_3.a>> continuation);
}
