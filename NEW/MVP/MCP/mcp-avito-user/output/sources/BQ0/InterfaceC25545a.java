package bQ0;

import J81.f;
import Y61.k;
import Y61.l;
import cQ0.e;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: WorkProfileApi.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0005J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H§@¢\u0006\u0004\b\t\u0010\u0005¨\u0006\n"}, d2 = {"LbQ0/a;", "", "Lcom/avito/android/remote/model/TypedResult;", "LdQ0/b;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LeQ0/l;", "b", "LcQ0/e;", "c", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: bQ0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC25545a {
    @f("2/job/seekers/applies/toVacancy")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@k Continuation<? super TypedResult<dQ0.b>> continuation);

    @f("2/job/seekers/cvs")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object b(@k Continuation<? super TypedResult<eQ0.l>> continuation);

    @f("3/gig/worker/profile/about")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @J81.k({"X-Geo-required: true"})
    @l
    Object c(@k Continuation<? super TypedResult<e>> continuation);
}
