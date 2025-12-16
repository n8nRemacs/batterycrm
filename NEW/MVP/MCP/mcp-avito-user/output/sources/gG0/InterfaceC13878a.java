package Gg0;

import Hg0.C13990c;
import Ig0.C14106c;
import J81.f;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: RatingApi.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J|\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0001\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fH§@¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e2\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LGg0/a;", "", "", "offset", "limit", "", "context", "sortRating", "cursor", "step", "", "photoOnly", "", "requiredFilters", "Lcom/avito/android/remote/model/TypedResult;", "LHg0/c;", "a", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LIg0/c;", "b", "(Ljava/lang/Long;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Gg0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC13878a {
    @f("11/profile/ratings")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@l @t("offset") Long l12, @l @t("limit") Long l13, @l @t("context") String str, @l @t("sortRating") String str2, @l @t("cursor") Long l14, @l @t("step") Long l15, @l @t("photoOnly") Boolean bool, @l @t("requiredFilters") List<String> list, @k Continuation<? super TypedResult<C13990c>> continuation);

    @f("9/profile/reviews")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object b(@l @t("cursor") Long l12, @l @t("limit") Long l13, @k Continuation<? super TypedResult<C14106c>> continuation);
}
