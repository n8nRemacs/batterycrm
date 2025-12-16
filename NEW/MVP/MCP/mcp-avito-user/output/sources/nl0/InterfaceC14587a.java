package Nl0;

import J81.f;
import J81.t;
import J81.u;
import Ol0.d;
import Pl0.i;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: SparePartsApi.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001Jf\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LNl0/a;", "", "", "itemId", "carBrand", "carModel", "carGeneration", "carModification", Navigation.MICRO_CATEGORY_ID, "subMicrocategoryId", "Lcom/avito/android/remote/model/TypedResult;", "LOl0/d;", "b", "(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;JLjava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LPl0/i;", "params", "itemID", "LPl0/f;", "a", "(LPl0/i;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-api_spare-parts"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Nl0.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC14587a {
    @f("4/parts/compatibilities")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@u @k i iVar, @t("itemID") long j12, @k Continuation<? super TypedResult<Pl0.f>> continuation);

    @f("3/parts/compatibilities")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object b(@t("itemId") long j12, @l @t("carBrand") Long l12, @l @t("carModel") Long l13, @l @t("carGeneration") Long l14, @l @t("carModification") Long l15, @t(Navigation.MICRO_CATEGORY_ID) long j13, @l @t("subMicrocategoryId") Long l16, @k Continuation<? super TypedResult<d>> continuation);
}
