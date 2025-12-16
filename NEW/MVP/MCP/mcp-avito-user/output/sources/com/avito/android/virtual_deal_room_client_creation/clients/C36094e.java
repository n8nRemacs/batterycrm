package com.avito.android.virtual_deal_room_client_creation.clients;

import androidx.compose.ui.platform.ComposeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ClientsFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.virtual_deal_room_client_creation.clients.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36094e extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ClientsFragment f326539l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ComposeView f326540m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36094e(ClientsFragment clientsFragment, ComposeView composeView) {
        super(2);
        this.f326539l = clientsFragment;
        this.f326540m = composeView;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            ClientsFragment clientsFragment = this.f326539l;
            com.avito.android.analytics.screens.compose.q.b((com.avito.android.analytics.screens.compose.a) clientsFragment.f326488q0.getValue(), androidx.compose.runtime.internal.r.c(-1005728198, new C36093d(clientsFragment, this.f326540m), a13), a13, 48);
        }
        return G0.f406611a;
    }
}
