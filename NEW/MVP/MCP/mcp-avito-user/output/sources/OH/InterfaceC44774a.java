package oh;

import J81.e;
import J81.f;
import J81.o;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ph.C47085a;
import qh.C47397a;
import rh.C47656a;
import th.C48672a;
import uh.C49058a;
import vh.C49328a;

/* compiled from: BblApi.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\fJ4\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\b\b\u0001\u0010\u0011\u001a\u00020\b2\b\b\u0001\u0010\u0012\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0014\u0010\fJ \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\b\b\u0001\u0010\u0011\u001a\u00020\bH§@¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0001\u0010\u0011\u001a\u00020\bH§@¢\u0006\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, d2 = {"Loh/a;", "", "", "itemId", "Lcom/avito/android/remote/model/TypedResult;", "Lph/a;", "e", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "context", "Lqh/a;", "d", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "limit", "Lrh/a;", "c", "(Ljava/lang/String;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkoutContext", "configId", "Lth/a;", "b", "Luh/a;", "f", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lvh/a;", "a", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: oh.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC44774a {
    @f("4/bbl/configure")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@t("checkoutContext") @k String str, @k Continuation<? super TypedResult<C49328a>> continuation);

    @o("2/bbl/configure/save")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object b(@J81.c("checkoutContext") @k String str, @J81.c("configId") long j12, @k Continuation<? super TypedResult<C48672a>> continuation);

    @o("1/bbl/setContact")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object c(@t("context") @k String str, @t("itemId") long j12, @t("limit") long j13, @k Continuation<? super TypedResult<C47656a>> continuation);

    @f("1/bbl/getAvailableContacts")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object d(@t("context") @k String str, @t("itemId") long j12, @k Continuation<? super TypedResult<C47397a>> continuation);

    @f("1/bbl/contact-history")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object e(@t("itemId") long j12, @k Continuation<? super TypedResult<C47085a>> continuation);

    @f("3/bbl/configure")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object f(@t("checkoutContext") @k String str, @k Continuation<? super TypedResult<C49058a>> continuation);
}
