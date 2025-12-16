package ZP0;

import J81.f;
import J81.i;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.work_profile.api.about_me.AboutMeResponse;
import com.avito.android.work_profile.api.profile_tabs.ProfileTabsResponse;
import e30.InterfaceC39936a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: WorkProfileApi.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LZP0/a;", "", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/work_profile/api/profile_tabs/ProfileTabsResponse;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "components", "beduinAgent", "Lcom/avito/android/work_profile/api/about_me/AboutMeResponse;", "b", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes5.dex */
public interface a {
    @f("1/job/seeker/profile/tabs")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @l
    Object a(@k Continuation<? super TypedResult<ProfileTabsResponse>> continuation);

    @f("1/job/seeker/profile/about")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @l
    Object b(@i("Beduin-Components") @k String str, @i("Beduin-Agent") @k String str2, @k Continuation<? super TypedResult<AboutMeResponse>> continuation);
}
