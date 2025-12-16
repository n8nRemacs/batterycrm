package bD0;

import J81.e;
import J81.f;
import J81.o;
import J81.t;
import Y61.k;
import cD0.C27012f;
import cD0.C27015i;
import cD0.C27020n;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.z;
import kotlin.Metadata;

/* compiled from: TariffLfOldApi.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJ%\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\u00052\b\b\u0001\u0010\n\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00060\u00052\b\b\u0001\u0010\u000e\u001a\u00020\u0002H'¢\u0006\u0004\b\u0010\u0010\rJ\u001b\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00060\u0005H'¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LbD0/a;", "", "", "contractId", "packageId", "Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/TypedResult;", "LcD0/n;", "c", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "context", "LcD0/i;", "d", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "autoProlong", "LcD0/f;", "b", "a", "()Lio/reactivex/rxjava3/core/z;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: bD0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC25499a {
    @o("1/tariff/editInfo/applyChange")
    @k
    z<TypedResult<Object>> a();

    @o("1/tariff/set/autoprolong")
    @e
    @k
    z<TypedResult<C27012f>> b(@J81.c("autoProlong") @k String autoProlong);

    @f("2/tariff/package")
    @k
    z<TypedResult<C27020n>> c(@t("contractId") @k String contractId, @t("packageId") @k String packageId);

    @f("4/tariff/info")
    @k
    z<TypedResult<C27015i>> d(@t("checkoutContext") @k String context);
}
