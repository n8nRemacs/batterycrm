package com.avito.android.comfortable_deal.clients.mvi.builder;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.comfortable_deal.clients.model.RequestType;
import com.avito.android.comfortable_deal.common.view.client.ClientCardData;
import com.avito.android.comfortable_deal.paging.PagingState;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kp.C43476b;
import kp.C43477c;
import kp.C43481g;
import kp.C43482h;
import kp.C43483i;
import kp.InterfaceC43479e;

/* compiled from: ClientsViewStateBuilder.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/clients/mvi/builder/b;", "Lcom/avito/android/comfortable_deal/clients/mvi/builder/a;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements com.avito.android.comfortable_deal.clients.mvi.builder.a {

    /* compiled from: ClientsViewStateBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f120291a;

        static {
            int[] iArr = new int[RequestType.values().length];
            try {
                RequestType requestType = RequestType.f120269c;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RequestType requestType2 = RequestType.f120269c;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                RequestType requestType3 = RequestType.f120269c;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                RequestType requestType4 = RequestType.f120269c;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f120291a = iArr;
        }
    }

    @Inject
    public b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.comfortable_deal.clients.mvi.builder.a
    @k
    public final C43481g a(@k C43481g c43481g) {
        InterfaceC43479e bVar;
        InterfaceC43479e aVar;
        RequestType requestTypeC = c43481g.c();
        int[] iArr = a.f120291a;
        int i12 = iArr[requestTypeC.ordinal()];
        C43477c c43477c = c43481g.f413210d;
        C43477c c43477c2 = i12 == 1 ? c43477c : null;
        C43476b c43476b = iArr[c43481g.c().ordinal()] == 1 ? c43481g.f413211e : null;
        C43483i c43483i = iArr[c43481g.c().ordinal()] == 1 ? c43481g.f413212f : null;
        List<ClientCardData> list = c43481g.f413213g;
        PagingState pagingState = c43481g.f413208b;
        if (list == null && pagingState == PagingState.f122409c) {
            bVar = InterfaceC43479e.d.f413204a;
        } else if (list != null && list.isEmpty() && pagingState == PagingState.f122409c) {
            bVar = InterfaceC43479e.d.f413204a;
        } else if (list == null && pagingState == PagingState.f122408b) {
            bVar = InterfaceC43479e.d.f413204a;
        } else if (list == null && pagingState == PagingState.f122410d) {
            bVar = InterfaceC43479e.c.f413203a;
        } else if (list != null && list.isEmpty()) {
            int iOrdinal = ((RequestType) RequestType.f120272f.get(c43481g.f413216j)).ordinal();
            if (iOrdinal == 0) {
                bVar = new InterfaceC43479e.b(R.string.empty_state, Integer.valueOf(R.string.go_to_requests), 1, R.string.empty_state_message_all_clients);
            } else if (iOrdinal == 1) {
                bVar = new InterfaceC43479e.b(R.string.empty_state, Integer.valueOf(R.string.go_to_clients), 0, R.string.empty_state_message_new_requests);
            } else if (iOrdinal == 2) {
                bVar = new InterfaceC43479e.b(R.string.empty_state, null, null, (c43477c == null || !c43477c.f413194b) ? R.string.empty_state_message_mortgage_applications : R.string.empty_state_message_archived_mortgage_applications);
            } else {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = new InterfaceC43479e.b(R.string.empty_state, Integer.valueOf(R.string.go_to_requests), 1, R.string.empty_state_message_archive);
            }
        } else {
            if (list != null && (!list.isEmpty())) {
                aVar = new InterfaceC43479e.a(list, pagingState);
                return C43481g.a(c43481g, null, 0, null, null, null, null, null, null, 0, new C43482h(c43481g.f413214h, c43481g.f413215i, c43481g.f413216j, c43477c2, c43476b, c43483i, aVar), 511);
            }
            bVar = InterfaceC43479e.c.f413203a;
        }
        aVar = bVar;
        return C43481g.a(c43481g, null, 0, null, null, null, null, null, null, 0, new C43482h(c43481g.f413214h, c43481g.f413215i, c43481g.f413216j, c43477c2, c43476b, c43483i, aVar), 511);
    }
}
