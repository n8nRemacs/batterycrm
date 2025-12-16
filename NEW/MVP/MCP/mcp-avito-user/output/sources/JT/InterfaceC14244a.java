package Jt;

import J81.f;
import J81.l;
import J81.o;
import J81.q;
import J81.t;
import Y61.k;
import com.avito.android.cv_upload.generated.api.v_1__job_cv_import_from_file_status.V1JobCvImportFromFileStatusResponse;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody;

/* compiled from: CvUploadApi.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LJt/a;", "", "", "fileUid", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/cv_upload/generated/api/v_1__job_cv_import_from_file_status/V1JobCvImportFromFileStatusResponse;", "b", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/MultipartBody$Part;", "file", "LLt/b;", "a", "(Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Jt.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC14244a {
    @o("1/job/cv/import/fromFile/upload")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    @Y61.l
    Object a(@q @k MultipartBody.Part part, @k Continuation<? super TypedResult<Lt.b>> continuation);

    @f("1/job/cv/import/fromFile/status")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @Y61.l
    Object b(@t("fileUid") @k String str, @k Continuation<? super TypedResult<V1JobCvImportFromFileStatusResponse>> continuation);
}
