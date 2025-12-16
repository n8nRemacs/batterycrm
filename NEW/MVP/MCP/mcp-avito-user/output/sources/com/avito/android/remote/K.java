package com.avito.android.remote;

import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.confirmation.EvidenceConfirmationResult;
import com.avito.android.remote.model.files.UploadFilesResult;
import com.avito.android.remote.model.validation.EvidenceRequestStructure;
import com.avito.android.remote.model.validation.ValidationForm;
import e30.InterfaceC39936a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody;

/* compiled from: EvidenceApi.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J1\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00060\u00052\b\b\u0001\u0010\n\u001a\u00020\u00032\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0001\u0010\n\u001a\u00020\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u0003H'¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00052\b\b\u0001\u0010\n\u001a\u00020\u0003H'¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00062\b\b\u0001\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u0016\u001a\u00020\u0003H§@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/avito/android/remote/K;", "", "", "", "params", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/confirmation/EvidenceConfirmationResult;", "d", "(Ljava/util/Map;)Lio/reactivex/rxjava3/core/I;", "appealId", "Lokhttp3/MultipartBody$Part;", "file", "Lcom/avito/android/remote/model/files/UploadFilesResult;", "b", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;)Lio/reactivex/rxjava3/core/I;", "fileId", "e", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/validation/ValidationForm;", "c", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "version", "Lcom/avito/android/remote/model/validation/EvidenceRequestStructure;", "a", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-api_evidence-request"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes17.dex */
public interface K {

    /* compiled from: EvidenceApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @J81.f("1/appeals/getFormStructureV2")
    @Y61.l
    Object a(@J81.t("appealKind") @Y61.k String str, @J81.t("version") @Y61.k String str2, @Y61.k Continuation<? super TypedResult<EvidenceRequestStructure>> continuation);

    @J81.o("1/appeals/file/upload")
    @J81.l
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<UploadFilesResult>> b(@J81.t("uuid") @Y61.k String appealId, @J81.q @Y61.k MultipartBody.Part file);

    @J81.f("2/appeals/getFormStructure")
    @Y61.k
    io.reactivex.rxjava3.core.I<ValidationForm> c(@J81.t("appealKind") @Y61.k String appealId);

    @J81.o("1/evidence/update")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<EvidenceConfirmationResult>> d(@J81.d @Y61.k Map<String, String> params);

    @J81.o("1/appeals/file/delete")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<String> e(@J81.c("uuid") @Y61.k String appealId, @J81.c("path") @Y61.k String fileId);
}
