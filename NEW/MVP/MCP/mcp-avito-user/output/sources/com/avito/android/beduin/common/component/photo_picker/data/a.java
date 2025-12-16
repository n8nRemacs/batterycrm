package com.avito.android.beduin.common.component.photo_picker.data;

import J81.l;
import J81.o;
import J81.q;
import J81.u;
import J81.y;
import Y61.k;
import com.avito.android.beduin.common.component.photo_picker.BeduinPhotoPickerModel;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.I;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.MultipartBody;

/* compiled from: BeduinPhotoPickerApi.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J?\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H'¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H'¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/data/a;", "", "", "path", "Lokhttp3/MultipartBody$Part;", "file", "", "params", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerImage;", "a", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Ljava/util/Map;)Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/beduin/common/component/photo_picker/data/i;", "b", "(Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/rxjava3/core/I;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes11.dex */
public interface a {
    @o
    @l
    @k
    I<BeduinPhotoPickerModel.PhotoPickerImage> a(@y @k String path, @q @k MultipartBody.Part file, @u @k Map<String, String> params);

    @J81.b
    @k
    I<i> b(@y @k String path, @u @k Map<String, String> params);
}
