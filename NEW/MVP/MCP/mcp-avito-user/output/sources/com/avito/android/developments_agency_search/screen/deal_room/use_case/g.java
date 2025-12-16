package com.avito.android.developments_agency_search.screen.deal_room.use_case;

import Y41.s;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.developments_agency_search.domain.GetDealRoomInfoResponse;
import com.avito.android.developments_agency_search.domain.UploadDealDocumentResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: UploadDealRevenueDocumentUseCase.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002(\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/use_case/g;", "Lkotlin/Function5;", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse;", "", "Lcom/avito/android/developments_agency_search/domain/UploadDealDocumentResponse;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements s<GetDealRoomInfoResponse, String, String, String, UploadDealDocumentResponse, GetDealRoomInfoResponse> {
    @Inject
    public g() {
    }

    @k
    public static GetDealRoomInfoResponse a(@k GetDealRoomInfoResponse getDealRoomInfoResponse, @k String str, @k String str2, @l String str3, @k UploadDealDocumentResponse uploadDealDocumentResponse) {
        List<GetDealRoomInfoResponse.Deal> list;
        List<GetDealRoomInfoResponse.Deal> deals = getDealRoomInfoResponse.getDeals();
        Iterator<GetDealRoomInfoResponse.Deal> it = deals.iterator();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            if (L.f(it.next().getId(), str)) {
                break;
            }
            i13++;
        }
        if (i13 == -1) {
            list = deals;
        } else {
            GetDealRoomInfoResponse.Deal dealCopy = deals.get(i13);
            GetDealRoomInfoResponse.Deal.Revenue revenue = dealCopy.getRevenue();
            if (revenue != null) {
                List<GetDealRoomInfoResponse.Deal.Revenue.Document> documents = revenue.getDocuments();
                if (documents != null) {
                    Iterator<GetDealRoomInfoResponse.Deal.Revenue.Document> it2 = documents.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            i12 = -1;
                            break;
                        }
                        if (L.f(it2.next().getType(), str2)) {
                            break;
                        }
                        i12++;
                    }
                    if (i12 != -1) {
                        GetDealRoomInfoResponse.Deal.Revenue.Document documentCopy$default = GetDealRoomInfoResponse.Deal.Revenue.Document.copy$default(documents.get(i12), null, null, null, null, str3, uploadDealDocumentResponse.getDownloadUrl(), uploadDealDocumentResponse.getFileId(), 15, null);
                        ArrayList arrayList = new ArrayList(documents);
                        arrayList.set(i12, documentCopy$default);
                        documents = arrayList;
                    }
                } else {
                    documents = null;
                }
                GetDealRoomInfoResponse.Deal.Revenue revenueCopy$default = GetDealRoomInfoResponse.Deal.Revenue.copy$default(revenue, null, null, null, uploadDealDocumentResponse.getAllDocumentsUploaded(), null, documents, 23, null);
                if (revenueCopy$default != null) {
                    dealCopy = dealCopy.copy((2031 & 1) != 0 ? dealCopy.id : null, (2031 & 2) != 0 ? dealCopy.title : null, (2031 & 4) != 0 ? dealCopy.notes : null, (2031 & 8) != 0 ? dealCopy.progress : null, (2031 & 16) != 0 ? dealCopy.revenue : revenueCopy$default, (2031 & 32) != 0 ? dealCopy.bookings : null, (2031 & 64) != 0 ? dealCopy.selectionHistory : null, (2031 & 128) != 0 ? dealCopy.preferences : null, (2031 & 256) != 0 ? dealCopy.preferencesUri : null, (2031 & 512) != 0 ? dealCopy.preferencesIds : null, (2031 & 1024) != 0 ? dealCopy.recalculatedConfirmedLot : null);
                }
            }
            ArrayList arrayList2 = new ArrayList(deals);
            arrayList2.set(i13, dealCopy);
            list = arrayList2;
        }
        return GetDealRoomInfoResponse.copy$default(getDealRoomInfoResponse, null, list, null, 5, null);
    }

    @Override // Y41.s
    public final /* bridge */ /* synthetic */ GetDealRoomInfoResponse invoke(GetDealRoomInfoResponse getDealRoomInfoResponse, String str, String str2, String str3, UploadDealDocumentResponse uploadDealDocumentResponse) {
        return a(getDealRoomInfoResponse, str, str2, str3, uploadDealDocumentResponse);
    }
}
