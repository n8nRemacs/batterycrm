package Mc0;

import J81.f;
import J81.o;
import J81.t;
import Nc0.C14560b;
import Nc0.InterfaceC14559a;
import Oc0.e;
import Rc0.d;
import Tc0.C15351a;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ProfileVkLinkingApi.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H§@¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H§@¢\u0006\u0004\b\f\u0010\nJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004H§@¢\u0006\u0004\b\u000e\u0010\nJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004H§@¢\u0006\u0004\b\u0019\u0010\n¨\u0006\u001a"}, d2 = {"LMc0/a;", "", "", "groupId", "Lcom/avito/android/remote/model/TypedResult;", "LTc0/a;", "b", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LOc0/e;", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LQc0/d;", "d", "LRc0/d;", "c", "LNc0/b;", "request", "LNc0/a;", "a", "(LNc0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LPc0/f;", "LPc0/d;", "g", "(LPc0/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LSc0/d;", "e", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Mc0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC14468a {
    @o("2/profile/vk/code")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@J81.a @k C14560b c14560b, @k Continuation<? super TypedResult<InterfaceC14559a>> continuation);

    @f("1/profile/vk/group-oauth-url")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object b(@t("groupId") long j12, @k Continuation<? super TypedResult<C15351a>> continuation);

    @f("1/profile/vk/linking")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object c(@k Continuation<? super TypedResult<d>> continuation);

    @f("1/profile/vk/linked")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object d(@k Continuation<? super TypedResult<Qc0.d>> continuation);

    @o("2/profile/vk/unlink")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object e(@k Continuation<? super TypedResult<Sc0.d>> continuation);

    @f("1/profile/vk/groups")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object f(@k Continuation<? super TypedResult<e>> continuation);

    @o("2/profile/vk/link")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object g(@J81.a @k Pc0.f fVar, @k Continuation<? super TypedResult<Pc0.d>> continuation);
}
