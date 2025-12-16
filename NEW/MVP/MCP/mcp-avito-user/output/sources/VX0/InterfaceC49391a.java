package vx0;

import J81.f;
import J81.o;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.remote.models.SparePartsV2Response;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.I;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import zk0.C50581b;

/* compiled from: SparePartsApi.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lvx0/a;", "", "", "microCategoryId", "itemId", "Lcom/avito/android/remote/models/SparePartsV2Response;", "a", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "regNum", "vin", "Lio/reactivex/rxjava3/core/I;", "Lzk0/b;", "b", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "_avito-discouraged_avito-api_spare-parts"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: vx0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC49391a {
    @f("2/parts/compatibilities")
    @l
    @InterfaceC42830m
    Object a(@t("microCategoryID") @k String str, @t("itemID") @k String str2, @k Continuation<? super SparePartsV2Response> continuation);

    @o("1/garage/add")
    @k
    I<C50581b> b(@l @t("regnumber") String regNum, @l @t("vin") String vin);
}
