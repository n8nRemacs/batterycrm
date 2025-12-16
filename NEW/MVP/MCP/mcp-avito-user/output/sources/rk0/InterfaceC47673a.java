package rk0;

import J81.e;
import J81.o;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ImvGoodsPollApi.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JB\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lrk0/a;", "", "", "itemId", "", "answerSlug", "comment", "slugValues", "Lcom/avito/android/remote/model/TypedResult;", "Lkotlin/G0;", "a", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-api_imv-goods-poll"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: rk0.a, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public interface InterfaceC47673a {
    @o("1/imvReportGoods/sendEstimationFeedback")
    @e
    @l
    Object a(@J81.c("itemId") long j12, @J81.c("answerSlug") @k String str, @J81.c("comment") @l String str2, @J81.c("slugValues") @l String str3, @k Continuation<? super TypedResult<G0>> continuation);
}
