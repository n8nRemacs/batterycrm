package cv0;

import J81.f;
import J81.o;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import dv0.C39807a;
import dv0.C39808b;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import ev0.C40165c;
import fv0.C40484a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ServicesPortfolioApi.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JR\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\f\u0010\rJ,\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\b\b\u0001\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcv0/a;", "", "", "id", "", "itemId", "", "canCall", "canMessage", "x", "Lcom/avito/android/remote/model/TypedResult;", "Lev0/c;", "a", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lfv0/a;", "b", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ldv0/b;", "request", "Ldv0/a;", "c", "(Ldv0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: cv0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC39418a {
    @f("1/portfolio/project")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@l @t("id") Long l12, @l @t("itemId") String str, @l @t("canCall") Boolean bool, @l @t("canMessage") Boolean bool2, @l @t("x") String str2, @k Continuation<? super TypedResult<C40165c>> continuation);

    @f("1/profile/portfolio/project")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object b(@t("id") long j12, @l @t("itemId") String str, @k Continuation<? super TypedResult<C40484a>> continuation);

    @o("1/profile/portfolio/project/delete")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object c(@J81.a @k C39808b c39808b, @k Continuation<? super TypedResult<C39807a>> continuation);
}
