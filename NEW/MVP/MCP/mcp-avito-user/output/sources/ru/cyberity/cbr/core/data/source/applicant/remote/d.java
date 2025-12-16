package ru.cyberity.cbr.core.data.source.applicant.remote;

import com.adjust.sdk.Constants;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import ru.cyberity.cbr.core.data.model.remote.response.d;

/* compiled from: ApplicantService.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J[\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0014\b\u0001\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\r\u001a\u00020\u00112\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0012J\u001d\u0010\r\u001a\u00020\u00132\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0014J)\u0010\r\u001a\u00020\u00182\b\b\u0001\u0010\u0016\u001a\u00020\u00152\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0019J3\u0010\r\u001a\u00020\u001a2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u00062\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u001bJ'\u0010\r\u001a\u00020\u001d2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u001cH§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u001eJ1\u0010\r\u001a\u00020\u001d2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u001f\u001a\u00020\u00022\b\b\u0001\u0010 \u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010!J\u001d\u0010$\u001a\u00020#2\b\b\u0001\u0010\"\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b$\u0010\u0014J\u001d\u0010\r\u001a\u00020#2\b\b\u0001\u0010\u0016\u001a\u00020%H§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010&J3\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010'J\u001d\u0010(\u001a\u00020\u00182\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b(\u0010\u0014J'\u0010\r\u001a\u00020*2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020)H§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010+J1\u0010\r\u001a\u00020*2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010,\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020-H§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010.J\u001d\u00100\u001a\u00020/2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0014J\u0013\u0010\r\u001a\u000201H§@ø\u0001\u0000¢\u0006\u0004\b\r\u00102ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u00063À\u0006\u0001"}, d2 = {"Lru/cyberity/cbr/core/data/source/applicant/remote/d;", "", "", "applicantId", "Lokhttp3/MultipartBody$Part;", "image", "Lokhttp3/RequestBody;", Constants.REFERRER_API_META, "", "headers", "idDocSetType", "Lretrofit2/y;", "Lru/cyberity/cbr/core/data/model/remote/k;", "a", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lokhttp3/RequestBody;Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "imageId", "Lkotlin/G0;", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/source/applicant/remote/f;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/model/remote/d;", "data", "unsetFields", "Lru/cyberity/cbr/core/data/model/remote/response/d$c$d;", "(Lru/cyberity/cbr/core/data/model/remote/d;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/model/remote/response/d$c$c;", "(Ljava/lang/String;Lokhttp3/RequestBody;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/source/applicant/remote/w;", "Lru/cyberity/cbr/core/data/source/applicant/remote/x;", "(Ljava/lang/String;Lru/cyberity/cbr/core/data/source/applicant/remote/w;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verificationId", "code", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "questionnaireId", "Lru/cyberity/cbr/core/data/source/applicant/remote/t;", "f", "Lru/cyberity/cbr/core/data/source/applicant/remote/r;", "(Lru/cyberity/cbr/core/data/source/applicant/remote/r;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "Lru/cyberity/cbr/core/data/source/applicant/remote/b;", "Lru/cyberity/cbr/core/data/source/applicant/remote/a0;", "(Ljava/lang/String;Lru/cyberity/cbr/core/data/source/applicant/remote/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmationId", "Lru/cyberity/cbr/core/data/source/applicant/remote/a;", "(Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/source/applicant/remote/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/source/applicant/remote/z;", "d", "Lru/cyberity/cbr/core/data/source/applicant/remote/e;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public interface d {
    @J81.b("/resources/applicants/{applicantId}/resources/{imageId}")
    @Y61.l
    Object a(@J81.s("applicantId") @Y61.k String str, @J81.s("imageId") int i12, @Y61.k Continuation<? super G0> continuation);

    @J81.o("resources/applicants/{applicantId}/identifierConfirmation/{verificationId}/verify")
    @Y61.l
    Object a(@J81.s("applicantId") @Y61.k String str, @J81.s("verificationId") @Y61.k String str2, @J81.t("code") @Y61.k String str3, @Y61.k Continuation<? super x> continuation);

    @J81.o("resources/applicants/{applicantId}/ekyc/confirm/{confirmationId}")
    @Y61.l
    Object a(@J81.s("applicantId") @Y61.k String str, @J81.s("confirmationId") @Y61.k String str2, @J81.a @Y61.k a aVar, @Y61.k Continuation<? super a0> continuation);

    @J81.o("/resources/applicants/{applicantId}/status/pending")
    @Y61.l
    Object a(@J81.s("applicantId") @Y61.k String str, @Y61.k Continuation<? super f> continuation);

    @J81.o("/resources/applicants/{applicantId}/info/idDoc")
    @Y61.l
    @J81.l
    Object a(@J81.s("applicantId") @Y61.k String str, @J81.q @Y61.k MultipartBody.Part part, @J81.q("metadata") @Y61.k RequestBody requestBody, @J81.j @Y61.k Map<String, String> map, @Y61.l @J81.t("idDocSetType") String str2, @Y61.k Continuation<? super retrofit2.y<ru.cyberity.cbr.core.data.model.remote.k>> continuation);

    @J81.n("/resources/applicants/{applicantId}/fixedInfo")
    @Y61.l
    Object a(@J81.s("applicantId") @Y61.k String str, @J81.a @Y61.k RequestBody requestBody, @Y61.l @J81.t("unsetFields") String str2, @Y61.k Continuation<? super d.c.C12459c> continuation);

    @J81.o("/resources/applicants/{applicantId}/info/location")
    @Y61.l
    Object a(@J81.s("applicantId") @Y61.k String str, @J81.a @Y61.k RequestBody requestBody, @Y61.k Continuation<? super Map<String, ? extends Object>> continuation);

    @J81.o("resources/applicants/{applicantId}/ekyc/submit")
    @Y61.l
    Object a(@J81.s("applicantId") @Y61.k String str, @J81.a @Y61.k b bVar, @Y61.k Continuation<? super a0> continuation);

    @J81.o("resources/applicants/{applicantId}/identifierConfirmation/-/request")
    @Y61.l
    Object a(@J81.s("applicantId") @Y61.k String str, @J81.a @Y61.k w wVar, @Y61.k Continuation<? super x> continuation);

    @J81.f("resources/videoIdent/-/availableLanguages")
    @Y61.l
    Object a(@Y61.k Continuation<? super e> continuation);

    @J81.n("/resources/applicants")
    @Y61.l
    Object a(@J81.a @Y61.k ru.cyberity.cbr.core.data.model.remote.d dVar, @Y61.l @J81.t("unsetFields") String str, @Y61.k Continuation<? super d.c.C12460d> continuation);

    @J81.o("/resources/sdk/applicant/questionnaires")
    @Y61.l
    Object a(@J81.a @Y61.k r rVar, @Y61.k Continuation<? super t> continuation);

    @J81.o("resources/applicants/{applicantId}/ekyc/skip")
    @Y61.l
    Object d(@J81.s("applicantId") @Y61.k String str, @Y61.k Continuation<? super z> continuation);

    @J81.f("resources/applicants/{applicantId}/one")
    @Y61.l
    Object e(@J81.s("applicantId") @Y61.k String str, @Y61.k Continuation<? super d.c.C12460d> continuation);

    @J81.f("/resources/questionnaires/-;id={questionnaireId}/one")
    @Y61.l
    Object f(@J81.s("questionnaireId") @Y61.k String str, @Y61.k Continuation<? super t> continuation);
}
