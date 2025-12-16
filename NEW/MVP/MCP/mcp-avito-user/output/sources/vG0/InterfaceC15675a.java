package Vg0;

import J81.l;
import J81.o;
import J81.q;
import J81.r;
import Y61.k;
import com.avito.android.rating_form.api.remote.model.RatingFormUploadImageResult;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.I;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* compiled from: RatingFormApi.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJE\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH'¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LVg0/a;", "", "Lokhttp3/MultipartBody$Part;", "file", "categoryId", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormUploadImageResult;", "b", "(Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;)Lio/reactivex/rxjava3/core/I;", "fid", "", "", "Lokhttp3/RequestBody;", "customParams", "a", "(Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Ljava/util/Map;)Lio/reactivex/rxjava3/core/I;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Vg0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC15675a {
    @o("1/reviews/image/add")
    @l
    @X41.o
    @k
    I<TypedResult<RatingFormUploadImageResult>> a(@q @k MultipartBody.Part file, @q @k MultipartBody.Part fid, @r @k Map<String, RequestBody> customParams);

    @o("1/rating/model/image")
    @l
    @k
    I<TypedResult<RatingFormUploadImageResult>> b(@q @k MultipartBody.Part file, @q @k MultipartBody.Part categoryId);
}
