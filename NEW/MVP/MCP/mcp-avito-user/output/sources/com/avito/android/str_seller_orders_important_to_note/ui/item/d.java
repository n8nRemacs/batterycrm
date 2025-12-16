package com.avito.android.str_seller_orders_important_to_note.ui.item;

import Y41.l;
import Y61.k;
import aA0.InterfaceC19747a;
import androidx.compose.runtime.internal.P;
import com.avito.android.str_seller_orders_important_to_note.domain.BookingButton;
import com.avito.android.str_seller_orders_important_to_note.ui.item.h;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: OrderDialogItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders_important_to_note/ui/item/d;", "LTV0/d;", "Lcom/avito/android/str_seller_orders_important_to_note/ui/item/h;", "Lcom/avito/android/str_seller_orders_important_to_note/ui/i;", "_avito_str-seller-orders-important-to-note_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements TV0.d<h, com.avito.android.str_seller_orders_important_to_note.ui.i> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC19747a, G0> f291454b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super InterfaceC19747a, G0> lVar) {
        this.f291454b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        BookingButton.Preset preset;
        BookingButton.Preset preset2;
        h hVar = (h) eVar;
        com.avito.android.str_seller_orders_important_to_note.ui.i iVar = (com.avito.android.str_seller_orders_important_to_note.ui.i) aVar;
        hVar.e(iVar.f291444j);
        String str = null;
        com.avito.android.str_seller_orders_important_to_note.domain.f fVar = iVar.f291438d;
        hVar.R(fVar != null ? fVar.f291320b : null);
        com.avito.android.str_seller_orders_important_to_note.domain.g gVar = iVar.f291440f;
        hVar.CN(gVar != null ? gVar.f291323c : null);
        if ((gVar != null ? gVar.f291321a : null) != null) {
            hVar.q(gVar.f291321a);
        }
        hVar.tF(gVar != null ? gVar.f291322b : null);
        hVar.r10(fVar != null ? fVar.f291319a : null);
        if (iVar.f291439e != null) {
            hVar.a(new a(this, iVar));
        } else {
            hVar.V2();
        }
        ArrayList arrayList = iVar.f291437c;
        BookingButton bookingButton = arrayList != null ? (BookingButton) C42745f0.G(arrayList) : null;
        boolean z12 = bookingButton != null;
        String str2 = bookingButton != null ? bookingButton.f291300d : null;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = (bookingButton == null || (preset2 = bookingButton.f291299c) == null) ? null : preset2.f291305b;
        if (str3 == null) {
            str3 = "";
        }
        hVar.N70(new h.a(z12, str2, str3), new b(bookingButton, this, iVar));
        BookingButton bookingButton2 = arrayList != null ? (BookingButton) C42745f0.K(1, arrayList) : null;
        boolean z13 = bookingButton2 != null;
        String str4 = bookingButton2 != null ? bookingButton2.f291300d : null;
        if (str4 == null) {
            str4 = "";
        }
        if (bookingButton2 != null && (preset = bookingButton2.f291299c) != null) {
            str = preset.f291305b;
        }
        hVar.VL(new h.a(z13, str4, str != null ? str : ""), new c(bookingButton2, this, iVar));
    }
}
