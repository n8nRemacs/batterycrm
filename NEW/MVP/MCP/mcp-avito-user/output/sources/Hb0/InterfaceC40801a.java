package hB0;

import J81.e;
import J81.f;
import J81.o;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import iB0.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: TariffCprApi.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\u0007J*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LhB0/a;", "", "", "configureContext", "Lcom/avito/android/remote/model/TypedResult;", "LiB0/c;", "b", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LiB0/b;", "c", "context", "advance", "LiB0/d;", "a", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: hB0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC40801a {
    @o("1/tariff/cpr/configure/save")
    @e
    @l
    Object a(@J81.c("context") @k String str, @J81.c("advance") @k String str2, @k Continuation<? super TypedResult<d>> continuation);

    @f("2/tariff/cpr/configure/advance")
    @l
    Object b(@t("context") @k String str, @k Continuation<? super TypedResult<iB0.c>> continuation);

    @f("2/tariff/cpr/configure/advance/manual")
    @l
    Object c(@t("context") @k String str, @k Continuation<? super TypedResult<iB0.b>> continuation);
}
