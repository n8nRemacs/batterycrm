package com.avito.android.virtual_deal_room.client_edit.mvi;

import CN0.a;
import com.avito.android.R;
import com.avito.android.arch.mvi.a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.R0;
import com.avito.android.virtual_deal_room.client_edit.mvi.entity.ClientEditInternalAction;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ClientEditActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_edit/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LCN0/a;", "Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction;", "LCN0/c;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements com.avito.android.arch.mvi.a<CN0.a, ClientEditInternalAction, CN0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final IN0.a f326209a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f326210b;

    @Inject
    public b(@Y61.k IN0.a aVar, @Y61.k R0 r02) {
        this.f326209a = aVar;
        this.f326210b = r02;
    }

    public static PrintableText c(String str, boolean z12) {
        if (str.length() > 50) {
            return com.avito.android.printable_text.b.c(R.string.virtual_deal_room_too_long_field_error, new Serializable[0]);
        }
        if (!z12 && C43066x.K(str)) {
            return com.avito.android.printable_text.b.c(R.string.virtual_deal_room_empty_field_error, new Serializable[0]);
        }
        return null;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ClientEditInternalAction> b(CN0.a aVar, CN0.c cVar) {
        C43210w c43210w;
        CN0.a aVar2 = aVar;
        CN0.c cVar2 = cVar;
        if (aVar2 instanceof a.C0105a) {
            return new C43210w(ClientEditInternalAction.Close.f326216b);
        }
        if (aVar2 instanceof a.b) {
            c43210w = new C43210w(new ClientEditInternalAction.EmailInput(((a.b) aVar2).f2132a));
        } else if (aVar2 instanceof a.c) {
            c43210w = new C43210w(new ClientEditInternalAction.NameInput(((a.c) aVar2).f2133a));
        } else if (aVar2 instanceof a.d) {
            c43210w = new C43210w(new ClientEditInternalAction.PatronymicInput(((a.d) aVar2).f2134a));
        } else if (aVar2 instanceof a.e) {
            c43210w = new C43210w(new ClientEditInternalAction.PhoneInput(((a.e) aVar2).f2135a));
        } else {
            if (!(aVar2 instanceof a.g)) {
                if (!(aVar2 instanceof a.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                return C43175k.I(this.f326210b.a(), C43175k.G(new a(this, cVar2, null)));
            }
            c43210w = new C43210w(new ClientEditInternalAction.SurnameInput(((a.g) aVar2).f2137a));
        }
        return c43210w;
    }
}
