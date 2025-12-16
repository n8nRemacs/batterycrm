package uC0;

import J81.f;
import J81.k;
import J81.t;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import vC0.g;
import wC0.s;

/* compiled from: TariffCptApi.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\t\u0010\u0007J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"LuC0/a;", "", "", "context", "Lcom/avito/android/remote/model/TypedResult;", "LvC0/g;", "c", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LwC0/s;", "a", "LxC0/f;", "b", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: uC0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC48882a {
    @f("3/tariff/cpt/info")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object a(@l @t("context") String str, @Y61.k Continuation<? super TypedResult<s>> continuation);

    @f("4/tariff/cpt/levels")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object b(@t("context") @Y61.k String str, @Y61.k Continuation<? super TypedResult<xC0.f>> continuation);

    @f("2/tariff/cpt/configure/levels")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object c(@t("context") @Y61.k String str, @Y61.k Continuation<? super TypedResult<g>> continuation);
}
