package com.avito.android.beduin.common.component.file_uploader.data;

import J81.p;
import J81.q;
import J81.s;
import J81.t;
import J81.u;
import com.avito.android.remote.model.file_uploader.FileDeleteResult;
import com.avito.android.remote.model.file_uploader.FileUploadResult;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.I;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.MultipartBody;

/* compiled from: FileUploaderApi.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J?\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H'¢\u0006\u0004\b\n\u0010\u000bJ?\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H'¢\u0006\u0004\b\f\u0010\u000bJ?\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u00022\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H'¢\u0006\u0004\b\u000f\u0010\u0010J?\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u00022\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H'¢\u0006\u0004\b\u0011\u0010\u0010J?\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u00022\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H'¢\u0006\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/data/a;", "", "", "path", "Lokhttp3/MultipartBody$Part;", "file", "", "params", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/file_uploader/FileUploadResult;", "d", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Ljava/util/Map;)Lio/reactivex/rxjava3/core/I;", "b", "id", "Lcom/avito/android/remote/model/file_uploader/FileDeleteResult;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/rxjava3/core/I;", "e", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes11.dex */
public interface a {
    @J81.b("{deletePath}")
    @Y61.k
    I<FileDeleteResult> a(@s(encoded = true, value = "deletePath") @Y61.k String path, @t("fileId") @Y61.k String id2, @u @Y61.k Map<String, String> params);

    @J81.l
    @p("{uploadPath}")
    @Y61.k
    I<FileUploadResult> b(@s(encoded = true, value = "uploadPath") @Y61.k String path, @q @Y61.k MultipartBody.Part file, @u @Y61.k Map<String, String> params);

    @J81.o("{deletePath}")
    @J81.e
    @Y61.k
    I<FileDeleteResult> c(@s(encoded = true, value = "deletePath") @Y61.k String path, @J81.c("fileId") @Y61.k String id2, @J81.d @Y61.k Map<String, String> params);

    @J81.o("{uploadPath}")
    @J81.l
    @Y61.k
    I<FileUploadResult> d(@s(encoded = true, value = "uploadPath") @Y61.k String path, @q @Y61.k MultipartBody.Part file, @u @Y61.k Map<String, String> params);

    @J81.f("{deletePath}")
    @Y61.k
    I<FileDeleteResult> e(@s(encoded = true, value = "deletePath") @Y61.k String path, @t("fileId") @Y61.k String id2, @u @Y61.k Map<String, String> params);
}
