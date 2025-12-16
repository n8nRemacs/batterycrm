package IZ;

import J81.d;
import J81.e;
import J81.f;
import J81.i;
import J81.o;
import J81.q;
import J81.s;
import J81.t;
import J81.u;
import JZ.h;
import JZ.m;
import MZ.g;
import Y61.k;
import Y61.l;
import com.avito.android.mortgage.api.model.ApplicationsListModel;
import com.avito.android.mortgage.api.model.CheckAccessModel;
import com.avito.android.mortgage.api.model.ConfirmAccessModel;
import com.avito.android.mortgage.api.model.DictionariesResult;
import com.avito.android.mortgage.api.model.DocumentsForm;
import com.avito.android.mortgage.api.model.OffersResult;
import com.avito.android.mortgage.api.model.suggestions.AddressSuggestion;
import com.avito.android.mortgage.api.model.suggestions.FioSuggestion;
import com.avito.android.mortgage.api.model.suggestions.FmsUnitSuggestion;
import com.avito.android.mortgage.api.model.suggestions.OrganizationSuggestion;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import e30.InterfaceC39936a;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody;

/* compiled from: MortgageLegacyApi.kt */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005JP\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00062\u0014\b\u0001\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\nH§@¢\u0006\u0004\b\f\u0010\rJB\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00062\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0014\b\u0001\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\nH§@¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00022\u0014\b\u0001\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\nH§@¢\u0006\u0004\b\u0013\u0010\u0014J6\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u00062\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0004\b\u0016\u0010\u0017J4\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\u0018\u001a\u00020\u00062\b\b\u0001\u0010\u0019\u001a\u00020\u0006H§@¢\u0006\u0004\b\u001b\u0010\u0017J0\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u00022\b\b\u0001\u0010\u001c\u001a\u00020\u00062\b\b\u0001\u0010\u001e\u001a\u00020\u001dH§@¢\u0006\u0004\b!\u0010\"J0\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001f0\u00022\b\b\u0001\u0010\u001c\u001a\u00020\u00062\b\b\u0001\u0010\u001e\u001a\u00020\u001dH§@¢\u0006\u0004\b$\u0010\"J0\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u001f0\u00022\b\b\u0001\u0010\u001c\u001a\u00020\u00062\b\b\u0001\u0010\u001e\u001a\u00020\u001dH§@¢\u0006\u0004\b&\u0010\"J0\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u001f0\u00022\b\b\u0001\u0010\u001c\u001a\u00020\u00062\b\b\u0001\u0010\u001e\u001a\u00020\u001dH§@¢\u0006\u0004\b(\u0010\"JJ\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00022\b\b\u0001\u0010)\u001a\u00020\u00062\b\b\u0001\u0010*\u001a\u00020\u00062\b\b\u0001\u0010+\u001a\u00020\u00062\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010-\u001a\u00020,H§@¢\u0006\u0004\b/\u00100J4\u00102\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010)\u001a\u00020\u00062\b\b\u0001\u0010*\u001a\u00020\u00062\b\b\u0001\u00101\u001a\u00020\u0006H§@¢\u0006\u0004\b2\u0010\u0017JL\u00105\u001a\b\u0012\u0004\u0012\u0002040\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\u0018\u001a\u00020\u00062\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0014\b\u0001\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\nH§@¢\u0006\u0004\b5\u0010\rJ\u0016\u00107\u001a\b\u0012\u0004\u0012\u0002060\u0002H§@¢\u0006\u0004\b7\u0010\u0005J,\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u00022\u0014\b\u0001\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\nH§@¢\u0006\u0004\b:\u0010\u0014J,\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u00022\u0014\b\u0001\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\nH§@¢\u0006\u0004\b<\u0010\u0014J \u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0006H§@¢\u0006\u0004\b>\u0010?J,\u0010@\u001a\b\u0012\u0004\u0012\u00020=0\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00062\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0004\b@\u0010AJ,\u0010B\u001a\b\u0012\u0004\u0012\u00020=0\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00062\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0004\bB\u0010AJ@\u0010F\u001a\b\u0012\u0004\u0012\u00020E0\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010C\u001a\u00020\u00062\b\b\u0001\u0010D\u001a\u00020\u00062\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0004\bF\u0010GJ6\u0010I\u001a\b\u0012\u0004\u0012\u00020H0\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\u0018\u001a\u00020\u00062\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0004\bI\u0010\u0017J4\u0010K\u001a\b\u0012\u0004\u0012\u00020J0\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\u0018\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\bK\u0010\u0017J4\u0010N\u001a\b\u0012\u0004\u0012\u00020M0\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\u0018\u001a\u00020\u00062\b\b\u0001\u0010L\u001a\u00020\u0006H§@¢\u0006\u0004\bN\u0010\u0017J\u0016\u0010P\u001a\b\u0012\u0004\u0012\u00020O0\u0002H§@¢\u0006\u0004\bP\u0010\u0005J \u0010Q\u001a\b\u0012\u0004\u0012\u00020H0\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0006H§@¢\u0006\u0004\bQ\u0010?J*\u0010S\u001a\b\u0012\u0004\u0012\u00020R0\u00022\b\b\u0001\u0010)\u001a\u00020\u00062\b\b\u0001\u0010*\u001a\u00020\u0006H§@¢\u0006\u0004\bS\u0010AJ,\u0010U\u001a\b\u0012\u0004\u0012\u00020H0\u00022\u0014\b\u0001\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020T0\nH§@¢\u0006\u0004\bU\u0010\u0014¨\u0006V"}, d2 = {"LIZ/a;", "", "Lcom/avito/android/remote/model/TypedResult;", "LJZ/b;", "j", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "flowType", "leadType", "sourceType", "", RequestReviewResultKt.INFO_TYPE, "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applicationId", "processId", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LJZ/o;", "x", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "status", "t", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applicantId", "step", "LJZ/m;", "v", "query", "", "count", "LJZ/s;", "Lcom/avito/android/mortgage/api/model/suggestions/AddressSuggestion;", "g", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/mortgage/api/model/suggestions/FioSuggestion;", "i", "Lcom/avito/android/mortgage/api/model/suggestions/FmsUnitSuggestion;", "f", "Lcom/avito/android/mortgage/api/model/suggestions/OrganizationSuggestion;", "p", "packageId", "documentId", "clientProfileId", "Lokhttp3/MultipartBody$Part;", "file", "LJZ/h;", "n", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fileId", "s", "form", "LJZ/l;", "y", "Lcom/avito/android/mortgage/api/model/DictionariesResult;", "b", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "Lcom/avito/android/mortgage/api/model/OffersResult;", "c", "LMZ/g;", "z", "LJZ/e;", "l", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "w", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "k", "name", "applicantType", "LJZ/f;", "r", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/G0;", "u", "Lcom/avito/android/mortgage/api/model/CheckAccessModel;", "h", "code", "Lcom/avito/android/mortgage/api/model/ConfirmAccessModel;", "A", "Lcom/avito/android/mortgage/api/model/ApplicationsListModel;", "m", "o", "Lcom/avito/android/mortgage/api/model/DocumentsForm;", "a", "", "q", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes15.dex */
public interface a {
    @o("1/mortgage-form/confirm-access")
    @e
    @l
    Object A(@J81.c("applicationId") @k String str, @J81.c("clientProfileId") @k String str2, @J81.c("code") @k String str3, @k Continuation<? super TypedResult<ConfirmAccessModel>> continuation);

    @f("1/package/{packageId}/document/{documentId}/form")
    @l
    Object a(@s("packageId") @k String str, @s("documentId") @k String str2, @k Continuation<? super TypedResult<DocumentsForm>> continuation);

    @f("1/mortgage-form/dictionaries")
    @l
    Object b(@k Continuation<? super TypedResult<DictionariesResult>> continuation);

    @f("1/mortgage-form/offers")
    @l
    Object c(@u @k Map<String, String> map, @k Continuation<? super TypedResult<OffersResult>> continuation);

    @o("1/mortgage-form/application/create")
    @e
    @l
    Object d(@l @t("flowType") String str, @l @t("leadType") String str2, @l @t("sourceType") String str3, @d @k Map<String, String> map, @k Continuation<? super TypedResult<JZ.b>> continuation);

    @o("1/mortgage-form/application/{applicationId}/update-mortgage-info")
    @e
    @l
    Object e(@s("applicationId") @k String str, @i("X-Business-Process-Id") @l String str2, @d @k Map<String, String> map, @k Continuation<? super TypedResult<Object>> continuation);

    @o("2/mortgage-form/fms-unit-suggestions")
    @e
    @l
    Object f(@J81.c("query") @k String str, @J81.c("count") int i12, @k Continuation<? super TypedResult<JZ.s<FmsUnitSuggestion>>> continuation);

    @o("2/mortgage-form/address-suggestions")
    @e
    @l
    Object g(@J81.c("query") @k String str, @J81.c("count") int i12, @k Continuation<? super TypedResult<JZ.s<AddressSuggestion>>> continuation);

    @o("1/mortgage-form/check-access")
    @e
    @l
    Object h(@J81.c("applicationId") @k String str, @J81.c("clientProfileId") @k String str2, @J81.c("flowType") @k String str3, @k Continuation<? super TypedResult<CheckAccessModel>> continuation);

    @o("2/mortgage-form/fio-suggestions")
    @e
    @l
    Object i(@J81.c("query") @k String str, @J81.c("count") int i12, @k Continuation<? super TypedResult<JZ.s<FioSuggestion>>> continuation);

    @f("1/mortgage-form/application/check")
    @l
    Object j(@k Continuation<? super TypedResult<JZ.b>> continuation);

    @o("2/mortgage-form/application/{applicationId}/previous")
    @l
    Object k(@s("applicationId") @k String str, @i("X-Business-Process-Id") @l String str2, @k Continuation<? super TypedResult<JZ.e>> continuation);

    @f("2/mortgage-form/application/{applicationId}/get")
    @l
    Object l(@s("applicationId") @k String str, @k Continuation<? super TypedResult<JZ.e>> continuation);

    @f("1/mortgage-form/application/list")
    @l
    Object m(@k Continuation<? super TypedResult<ApplicationsListModel>> continuation);

    @o("1/package/{packageId}/document/{documentId}/upload")
    @J81.l
    @J81.k({"forceAsQuery: true"})
    @l
    Object n(@s("packageId") @k String str, @s("documentId") @k String str2, @t("clientProfileId") @k String str3, @i("X-Business-Process-Id") @l String str4, @q @k MultipartBody.Part part, @k Continuation<? super TypedResult<h>> continuation);

    @o("1/mortgage-form/application/delete")
    @e
    @l
    Object o(@J81.c("applicationId") @k String str, @k Continuation<? super TypedResult<G0>> continuation);

    @o("2/mortgage-form/organization-suggestions")
    @e
    @l
    Object p(@J81.c("query") @k String str, @J81.c("count") int i12, @k Continuation<? super TypedResult<JZ.s<OrganizationSuggestion>>> continuation);

    @o("1/legal/register-permissions")
    @e
    @l
    Object q(@d @k Map<String, Boolean> map, @k Continuation<? super TypedResult<G0>> continuation);

    @o("1/mortgage-form/participant/create")
    @e
    @l
    Object r(@J81.c("applicationId") @k String str, @J81.c("name") @k String str2, @J81.c("participationType") @k String str3, @i("X-Business-Process-Id") @l String str4, @k Continuation<? super TypedResult<JZ.f>> continuation);

    @o("1/package/{packageId}/document/{documentId}/file/{fileId}/remove")
    @l
    Object s(@s("packageId") @k String str, @s("documentId") @k String str2, @s("fileId") @k String str3, @k Continuation<? super TypedResult<Object>> continuation);

    @o("1/mortgage-form/verification/update-status")
    @l
    Object t(@t("applicationId") @k String str, @t("status") @k String str2, @i("X-Business-Process-Id") @l String str3, @k Continuation<? super TypedResult<Object>> continuation);

    @o("1/mortgage-form/participant/delete")
    @e
    @l
    Object u(@J81.c("applicationId") @k String str, @J81.c("applicantId") @k String str2, @i("X-Business-Process-Id") @l String str3, @k Continuation<? super TypedResult<G0>> continuation);

    @f("3/mortgage-form/application/{applicationId}/profile/{applicantId}/get")
    @l
    Object v(@s("applicationId") @k String str, @s("applicantId") @k String str2, @t("stepId") @k String str3, @k Continuation<? super TypedResult<m>> continuation);

    @o("2/mortgage-form/application/{applicationId}/next")
    @l
    Object w(@s("applicationId") @k String str, @i("X-Business-Process-Id") @l String str2, @k Continuation<? super TypedResult<JZ.e>> continuation);

    @o("1/mortgage-form/pre-approval/get-scoring")
    @e
    @l
    Object x(@d @k Map<String, String> map, @k Continuation<? super TypedResult<JZ.o>> continuation);

    @o("3/mortgage-form/form/update")
    @e
    @l
    Object y(@J81.c("applicationId") @k String str, @J81.c("clientProfileId") @k String str2, @i("X-Business-Process-Id") @l String str3, @d @k Map<String, String> map, @k Continuation<? super TypedResult<JZ.l>> continuation);

    @o("1/mortgage-form/landing-calculation")
    @e
    @l
    Object z(@d @k Map<String, String> map, @k Continuation<? super TypedResult<g>> continuation);
}
