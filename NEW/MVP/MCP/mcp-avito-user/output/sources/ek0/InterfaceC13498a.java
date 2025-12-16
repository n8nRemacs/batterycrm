package Ek0;

import Fk0.C13813a;
import Gk0.C13893a;
import Hk0.C14000a;
import J81.e;
import J81.f;
import J81.n;
import J81.o;
import J81.p;
import J81.s;
import J81.t;
import Jk0.C14209c;
import Kk0.C14323b;
import Lk0.C14405a;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: NotificationsApi.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\r\u001a\u00020\u00022\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0007JP\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00132\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00132\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001a\u0010\u001bJ4\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\b\b\u0001\u0010\u001c\u001a\u00020\u00022\b\b\u0001\u0010\u001d\u001a\u00020\u00022\b\b\u0001\u0010\u001e\u001a\u00020\u0013H§@¢\u0006\u0004\b \u0010!J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0004H§@¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"LEk0/a;", "", "", "platform", "Lcom/avito/android/remote/model/TypedResult;", "LFk0/a;", "d", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "offset", "LIk0/c;", "a", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "LHk0/a;", "e", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LGk0/a;", "f", "", "forceCreate", "isSandbox", "isVoip", "provider", "token", "LKk0/b;", "g", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "channel", "section", "value", "LLk0/a;", "b", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LJk0/c;", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Ek0.a, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public interface InterfaceC13498a {
    @f("2/notifications/search")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@l @t("offset") Long l12, @k Continuation<? super TypedResult<Ik0.c>> continuation);

    @n("4/notifications/settings")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object b(@J81.c("channel") @k String str, @J81.c("section") @k String str2, @J81.c("value") boolean z12, @k Continuation<? super TypedResult<C14405a>> continuation);

    @f("4/notifications/settings")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object c(@k Continuation<? super TypedResult<C14209c>> continuation);

    @f("2/notifications/count")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @J81.k({"X-Employeemode-required: true"})
    @l
    Object d(@l @t("platform") String str, @k Continuation<? super TypedResult<C13813a>> continuation);

    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    @p("2/notifications/{id}/read")
    Object e(@s("id") @k String str, @J81.c("platform") @l String str2, @k Continuation<? super TypedResult<C14000a>> continuation);

    @f("3/notifications/count")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @J81.k({"X-Employeemode-required: true"})
    @l
    Object f(@l @t("platform") String str, @k Continuation<? super TypedResult<C13893a>> continuation);

    @o("3/notifications/token")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object g(@J81.c("forceCreate") @l Boolean bool, @J81.c("isSandbox") @l Boolean bool2, @J81.c("isVoip") @l Boolean bool3, @J81.c("provider") @l String str, @J81.c("token") @k String str2, @k Continuation<? super TypedResult<C14323b>> continuation);
}
