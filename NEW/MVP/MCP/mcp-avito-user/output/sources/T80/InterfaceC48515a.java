package t80;

import J81.d;
import J81.e;
import J81.l;
import J81.o;
import J81.q;
import J81.t;
import Y61.k;
import com.avito.android.remote.model.ImageUploadResult;
import com.avito.android.remote.model.ParamSuggestionsByPhotoResponse;
import com.avito.android.remote.model.PublishSuggestsUploadPhotoResponse;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.I;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.MultipartBody;

/* compiled from: PickerApi.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J+\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\b\u0010\tJ;\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00062\u0014\b\u0001\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\n2\b\b\u0001\u0010\f\u001a\u00020\u0004H'¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u0002H'¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lt80/a;", "", "Lokhttp3/MultipartBody$Part;", "file", "", "exif", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/ImageUploadResult;", "c", "(Lokhttp3/MultipartBody$Part;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "", "images", "publishSessionId", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/ParamSuggestionsByPhotoResponse;", "b", "(Ljava/util/Map;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/PublishSuggestsUploadPhotoResponse;", "a", "(Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;)Lio/reactivex/rxjava3/core/I;", "_avito-discouraged_avito-api_photo-picker"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: t80.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC48515a {

    /* compiled from: PickerApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: t80.a$a, reason: collision with other inner class name */
    public static final class C12660a {
    }

    @o("1/publish/categories/suggest/upload_photo")
    @l
    @k
    I<TypedResult<PublishSuggestsUploadPhotoResponse>> a(@q @k MultipartBody.Part file, @q @k MultipartBody.Part publishSessionId);

    @o("3/publish/categories/suggest/by_photo")
    @e
    @k
    I<TypedResult<ParamSuggestionsByPhotoResponse>> b(@d @k Map<String, String> images, @J81.c("publishSessionId") @k String publishSessionId);

    @o("2/images/upload")
    @l
    @k
    I<ImageUploadResult> c(@q @k MultipartBody.Part file, @Y61.l @t("exif") String exif);
}
