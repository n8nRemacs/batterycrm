package com.avito.android.evidence_request.mvi.domain.evidence_details;

import com.avito.android.R;
import com.avito.android.photo_list_view.InterfaceC33208b;
import com.avito.android.photo_list_view.InterfaceC33218l;
import com.avito.android.photo_list_view.L;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: EvidenceListItemsConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/evidence_request/mvi/domain/evidence_details/m;", "Lcom/avito/android/photo_list_view/l;", "<init>", "()V", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class m implements InterfaceC33218l {
    @Override // com.avito.android.photo_list_view.InterfaceC33218l
    @Y61.k
    public final List a(int i12, @Y61.k List list, boolean z12) {
        if (list.size() < i12) {
            return C42745f0.h0(list, Collections.singletonList(new L("9223372036854775806", null, z12 ? new InterfaceC33208b.InterfaceC6540b.C6541b(false) : InterfaceC33208b.InterfaceC6540b.d.f218120a, null, Integer.valueOf(R.string.evidence_add_file_button), Integer.valueOf(R.drawable.ic_clip), null, 72, null)));
        }
        return list;
    }
}
