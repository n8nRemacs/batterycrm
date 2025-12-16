package com.avito.android.virtual_deal_room.client_room.interactor;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.virtual_deal_room.client_room.model.ClientRoomArguments;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;

/* compiled from: ClientRoomAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_room/interactor/b;", "Lcom/avito/android/virtual_deal_room/client_room/interactor/a;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements com.avito.android.virtual_deal_room.client_room.interactor.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f326288a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC42726C f326289b;

    /* compiled from: ClientRoomAnalyticsInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<String> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ClientRoomArguments f326290l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ClientRoomArguments clientRoomArguments) {
            super(0);
            this.f326290l = clientRoomArguments;
        }

        @Override // Y41.a
        public final String invoke() {
            String str = this.f326290l.f326342e;
            return str == null ? "direct" : str;
        }
    }

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a, @k ClientRoomArguments clientRoomArguments) {
        this.f326288a = interfaceC28373a;
        this.f326289b = C42727D.c(new a(clientRoomArguments));
    }

    @Override // com.avito.android.virtual_deal_room.client_room.interactor.a
    public final void a() {
        this.f326288a.c(new com.avito.android.analytics.provider.clickstream.b(12946, 0));
    }

    @Override // com.avito.android.virtual_deal_room.client_room.interactor.a
    public final void b(@k String str, @k String str2, boolean z12) {
        this.f326288a.c(new ParametrizedClickStreamEvent(12945, 2, P0.g(new Q("from_page", (String) this.f326289b.getValue()), new Q("vdr_tab_process_id", str), new Q("vdr_tab_process_type", str2), new Q("hide_real_phone_number_flg", Boolean.valueOf(z12))), null, 8, null));
    }

    @Override // com.avito.android.virtual_deal_room.client_room.interactor.a
    public final void c() {
        this.f326288a.c(new com.avito.android.analytics.provider.clickstream.b(12967, 0));
    }

    @Override // com.avito.android.virtual_deal_room.client_room.interactor.a
    public final void d() {
        this.f326288a.c(new com.avito.android.analytics.provider.clickstream.b(12947, 0));
    }
}
