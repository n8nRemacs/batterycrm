package Vg0;

import J81.k;
import J81.o;
import J81.q;
import J81.t;
import J81.y;
import Y61.l;
import com.avito.android.rating_form.api.remote.model.FileDeleteResponse;
import com.avito.android.rating_form.api.remote.model.FileUploadResponse;
import com.avito.android.rating_form.api.remote.model.RatingFormResult;
import com.avito.android.rating_form.api.remote.model.RatingFormSearchItemsResult;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody;

/* compiled from: RatingFormCoroutineApi.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\t\u0010\nJ,\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u00022\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0011\u0010\u0007J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\b\b\u0001\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\u0012\u001a\u00020\bH§@¢\u0006\u0004\b\u0014\u0010\u0015J,\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\u0014\b\u0001\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0016H§@¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LVg0/d;", "", "", "data", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormResult;", "f", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/MultipartBody$Part;", "d", "(Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fid", "query", "Lcom/avito/android/rating_form/api/remote/model/RatingFormSearchItemsResult;", "a", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nextPage", "e", "file", "Lcom/avito/android/rating_form/api/remote/model/FileUploadResponse;", "b", "(Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "params", "Lcom/avito/android/rating_form/api/remote/model/FileDeleteResponse;", "c", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes16.dex */
public interface d {
    @k({"Accept-Encoding: identity"})
    @J81.f("1/reviews/items/search")
    @l
    Object a(@t("fid") @Y61.k String str, @l @t("query") String str2, @Y61.k Continuation<? super TypedResult<RatingFormSearchItemsResult>> continuation);

    @o("1/reviews/file/add")
    @l
    @J81.l
    Object b(@q @Y61.k MultipartBody.Part part, @q @Y61.k MultipartBody.Part part2, @Y61.k Continuation<? super TypedResult<FileUploadResponse>> continuation);

    @o("1/reviews/file/delete")
    @J81.e
    @l
    Object c(@J81.d @Y61.k Map<String, String> map, @Y61.k Continuation<? super TypedResult<FileDeleteResponse>> continuation);

    @o("2/reviews/form/add")
    @l
    @J81.l
    Object d(@q @Y61.k MultipartBody.Part part, @Y61.k Continuation<? super TypedResult<RatingFormResult>> continuation);

    @k({"Accept-Encoding: identity"})
    @J81.f
    @l
    Object e(@y @Y61.k String str, @Y61.k Continuation<? super TypedResult<RatingFormSearchItemsResult>> continuation);

    @o("1/rating/model/add")
    @J81.e
    @l
    Object f(@J81.c("data") @Y61.k String str, @Y61.k Continuation<? super TypedResult<RatingFormResult>> continuation);
}
