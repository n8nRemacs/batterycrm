package sw;

import J81.f;
import J81.o;
import J81.q;
import J81.s;
import J81.t;
import J81.u;
import Y61.k;
import Y61.l;
import com.avito.android.developments_agency_search.domain.GetClientListResponse;
import com.avito.android.developments_agency_search.domain.GetDealCabinetHeader;
import com.avito.android.developments_agency_search.domain.GetDealRoomInfoResponse;
import com.avito.android.developments_agency_search.domain.GetDealUpdatesResponse;
import com.avito.android.developments_agency_search.domain.GetDevelopmentTooltipInfo;
import com.avito.android.developments_agency_search.domain.GetMapMarkersResponse;
import com.avito.android.developments_agency_search.domain.UploadDealDocumentResponse;
import com.avito.android.remote.model.SearchParameters;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39937b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody;

/* compiled from: DevelopmentsAgencySearchApi.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J,\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ>\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u00032\b\b\u0001\u0010\r\u001a\u00020\u0003H§@¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0005H§@¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0005H§@¢\u0006\u0004\b\u0015\u0010\u0013J \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00052\b\b\u0001\u0010\u0016\u001a\u00020\u0003H§@¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00052\b\b\u0001\u0010\u001a\u001a\u00020\u0003H§@¢\u0006\u0004\b\u001c\u0010\u0019J4\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00052\b\b\u0001\u0010\u001a\u001a\u00020\u00032\b\b\u0001\u0010\u001e\u001a\u00020\u001d2\b\b\u0001\u0010\u001f\u001a\u00020\u001dH§@¢\u0006\u0004\b!\u0010\"J@\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00052\u0014\b\u0001\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010$\u001a\u00020\t2\b\b\u0003\u0010&\u001a\u00020%H§@¢\u0006\u0004\b(\u0010)J \u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00052\b\b\u0001\u0010*\u001a\u00020\u0003H§@¢\u0006\u0004\b,\u0010\u0019¨\u0006-"}, d2 = {"Lsw/a;", "", "", "", "params", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/SearchParameters;", "c", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "limit", "offset", "searchQuery", "stage", "Lcom/avito/android/developments_agency_search/domain/GetClientListResponse;", "f", "(IILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/developments_agency_search/domain/GetDealUpdatesResponse;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/developments_agency_search/domain/GetDealCabinetHeader;", "i", "clientId", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse;", "e", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dealId", "Lcom/avito/android/developments_agency_search/domain/b;", "g", "Lokhttp3/MultipartBody$Part;", "file", "docType", "Lcom/avito/android/developments_agency_search/domain/UploadDealDocumentResponse;", "a", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchParamsMap", "zoomLevel", "", "filterByLocation", "Lcom/avito/android/developments_agency_search/domain/GetMapMarkersResponse;", "d", "(Ljava/util/Map;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "developmentId", "Lcom/avito/android/developments_agency_search/domain/GetDevelopmentTooltipInfo;", "h", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: sw.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC48423a {

    /* compiled from: DevelopmentsAgencySearchApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sw.a$a, reason: collision with other inner class name */
    public static final class C12650a {
    }

    @o("1/nd-trx/revenue/{dealId}/upload-documents")
    @l
    @J81.l
    Object a(@s("dealId") @k String str, @q @k MultipartBody.Part part, @q @k MultipartBody.Part part2, @k Continuation<? super TypedResult<UploadDealDocumentResponse>> continuation);

    @f("1/nd-trx/clients/deal-updates")
    @l
    Object b(@k Continuation<? super TypedResult<GetDealUpdatesResponse>> continuation);

    @f("1/nd-trx/search/parameters")
    @l
    Object c(@u @k Map<String, String> map, @k Continuation<? super TypedResult<SearchParameters>> continuation);

    @f("1/nd-trx/map/viewport")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39937b
    @l
    Object d(@u @k Map<String, String> map, @t("zoom") int i12, @t("filterByLocation") boolean z12, @k Continuation<? super TypedResult<GetMapMarkersResponse>> continuation);

    @f("1/nd-trx/client/{clientId}/deals")
    @l
    Object e(@s("clientId") @k String str, @k Continuation<? super TypedResult<GetDealRoomInfoResponse>> continuation);

    @o("1/nd-trx/clients")
    @J81.e
    @l
    Object f(@J81.c("limit") int i12, @J81.c("offset") int i13, @J81.c("query") @k String str, @J81.c("stage") @k String str2, @k Continuation<? super TypedResult<GetClientListResponse>> continuation);

    @f("1/nd-trx/deals/{dealId}")
    @l
    @InterfaceC39937b
    Object g(@s("dealId") @k String str, @k Continuation<? super TypedResult<com.avito.android.developments_agency_search.domain.b>> continuation);

    @f("1/nd-trx/map/tooltips/{developmentId}")
    @l
    @InterfaceC39937b
    Object h(@s("developmentId") @k String str, @k Continuation<? super TypedResult<GetDevelopmentTooltipInfo>> continuation);

    @f("1/nd-trx/clients/header")
    @l
    Object i(@k Continuation<? super TypedResult<GetDealCabinetHeader>> continuation);
}
