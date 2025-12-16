package y91;

import J81.f;
import J81.o;
import J81.q;
import J81.s;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody;
import retrofit2.y;
import ru.mts.biometry.api.entity.AddressBody;
import ru.mts.biometry.api.entity.ChoiceRequestBody;
import ru.mts.biometry.api.entity.SelectDocumentBody;
import ru.mts.biometry.api.entity.config.IdentificationsConfigResponse;
import ru.mts.biometry.api.entity.inn.InnRequestBody;
import ru.mts.biometry.api.entity.inn.InnRequestResponse;
import ru.mts.biometry.api.entity.locationSuggestion.LocationSuggestionsResponse;
import ru.mts.biometry.api.entity.locationSuggestion.SuggestionBody;
import ru.mts.biometry.api.entity.state.IdentificationsStateResponse;

/* compiled from: IdentificationApi.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004H§@¢\u0006\u0004\b\u0011\u0010\u000fJ \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0017\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0018\u0010\u000fJ\u0010\u0010\u0019\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0019\u0010\u000fJ\u0010\u0010\u001a\u001a\u00020\u0005H§@¢\u0006\u0004\b\u001a\u0010\u000fJ*\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u001e\u001a\u00020\u001dH§@¢\u0006\u0004\b\u001f\u0010 J0\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u001c\u001a\u00020\u001b2\u000e\b\u0001\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0!H§@¢\u0006\u0004\b\"\u0010#J \u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020$H§@¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\b\u0001\u0010\u0003\u001a\u00020'H§@¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020(2\b\b\u0001\u0010+\u001a\u00020\u001bH§@¢\u0006\u0004\b,\u0010-¨\u0006."}, d2 = {"Ly91/a;", "", "Lru/mts/biometry/api/entity/ChoiceRequestBody;", "body", "Lretrofit2/y;", "Lkotlin/G0;", "m", "(Lru/mts/biometry/api/entity/ChoiceRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/mts/biometry/api/entity/locationSuggestion/SuggestionBody;", "suggestionBody", "Lru/mts/biometry/api/entity/locationSuggestion/LocationSuggestionsResponse;", "f", "(Lru/mts/biometry/api/entity/locationSuggestion/SuggestionBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/mts/biometry/api/entity/config/IdentificationsConfigResponse;", "h", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/mts/biometry/api/entity/state/IdentificationsStateResponse;", "c", "Lru/mts/biometry/api/entity/SelectDocumentBody;", "selectDocumentBody", "a", "(Lru/mts/biometry/api/entity/SelectDocumentBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "j", "n", "l", "o", "", "step", "Lokhttp3/MultipartBody$Part;", "file", "g", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/mts/biometry/api/entity/AddressBody;", "i", "(Lru/mts/biometry/api/entity/AddressBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/mts/biometry/api/entity/inn/InnRequestBody;", "Lru/mts/biometry/api/entity/inn/InnRequestResponse;", "k", "(Lru/mts/biometry/api/entity/inn/InnRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestUuid", "e", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: y91.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC50088a {
    @o("document-type-selected")
    @l
    Object a(@J81.a @k SelectDocumentBody selectDocumentBody, @k Continuation<? super y<G0>> continuation);

    @o("files/{step}")
    @l
    @J81.l
    Object b(@s("step") @k String str, @q @k List<MultipartBody.Part> list, @k Continuation<? super y<G0>> continuation);

    @f(VoiceInfo.STATE)
    @l
    Object c(@k Continuation<? super y<IdentificationsStateResponse>> continuation);

    @o("document-retry-proceeded")
    @l
    Object d(@k Continuation<? super G0> continuation);

    @f("inn-request/{requestId}")
    @l
    Object e(@s("requestId") @k String str, @k Continuation<? super InnRequestResponse> continuation);

    @o("address/suggest")
    @l
    Object f(@J81.a @k SuggestionBody suggestionBody, @k Continuation<? super LocationSuggestionsResponse> continuation);

    @o("files/{step}")
    @l
    @J81.l
    Object g(@s("step") @k String str, @q @k MultipartBody.Part part, @k Continuation<? super y<G0>> continuation);

    @f(Navigation.CONFIG)
    @l
    Object h(@k Continuation<? super IdentificationsConfigResponse> continuation);

    @o("address-data")
    @l
    Object i(@J81.a @k AddressBody addressBody, @k Continuation<? super y<G0>> continuation);

    @o("selfie-retry-proceeded")
    @l
    Object j(@k Continuation<? super G0> continuation);

    @o("inn-request")
    @l
    Object k(@J81.a @k InnRequestBody innRequestBody, @k Continuation<? super InnRequestResponse> continuation);

    @o("recognition-onboarding-proceeded")
    @l
    Object l(@k Continuation<? super G0> continuation);

    @o("choice")
    @l
    Object m(@J81.a @k ChoiceRequestBody choiceRequestBody, @k Continuation<? super y<G0>> continuation);

    @o("document-data-confirmed")
    @l
    Object n(@k Continuation<? super G0> continuation);

    @o("change-document-type-proceeded")
    @l
    Object o(@k Continuation<? super G0> continuation);
}
