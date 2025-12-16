package com.avito.android.str_seller_orders_important_to_note.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.str_seller_orders_important_to_note.mvi.entity.StrSellerImportantToNoteInternalAction;
import com.avito.android.util.O2;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: StrSellerImportantToNoteReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/str_seller_orders_important_to_note/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/str_seller_orders_important_to_note/mvi/entity/StrSellerImportantToNoteInternalAction;", "LaA0/c;", "<init>", "()V", "a", "_avito_str-seller-orders-important-to-note_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m implements u<StrSellerImportantToNoteInternalAction, aA0.c> {

    /* compiled from: StrSellerImportantToNoteReducer.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/str_seller_orders_important_to_note/mvi/m$a;", "", "<init>", "()V", "", "DEFAULT_STUB_COUNT", "I", "", "STUB_ITEM", "Ljava/lang/String;", "_avito_str-seller-orders-important-to-note_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public m() {
    }

    public static aA0.c b(aA0.c cVar) {
        List<com.avito.android.str_seller_orders_important_to_note.ui.i> list;
        if (cVar.f20801d) {
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < 5; i12++) {
                arrayList.add(new com.avito.android.str_seller_orders_important_to_note.ui.stub_item.a());
            }
            G0 g02 = G0.f406611a;
            list = arrayList;
        } else {
            List<com.avito.android.str_seller_orders_important_to_note.ui.i> list2 = cVar.f20800c;
            list = list2;
            if (list2 == null) {
                list = C42784z0.f406748b;
            }
        }
        cVar.f20802e.getClass();
        return aA0.c.a(cVar, null, null, false, new aA0.d(list, cVar.f20799b), 7);
    }

    @Override // com.avito.android.arch.mvi.u
    public final aA0.c a(StrSellerImportantToNoteInternalAction strSellerImportantToNoteInternalAction, aA0.c cVar) {
        StrSellerImportantToNoteInternalAction strSellerImportantToNoteInternalAction2 = strSellerImportantToNoteInternalAction;
        aA0.c cVar2 = cVar;
        if (strSellerImportantToNoteInternalAction2 instanceof StrSellerImportantToNoteInternalAction.Loading) {
            return b(aA0.c.a(cVar2, null, null, true, null, 11));
        }
        if (!(strSellerImportantToNoteInternalAction2 instanceof StrSellerImportantToNoteInternalAction.UpdateContent)) {
            return ((strSellerImportantToNoteInternalAction2 instanceof StrSellerImportantToNoteInternalAction.ShowError) && cVar2.f20801d && O2.a(cVar2.f20802e.f20805a)) ? b(aA0.c.a(cVar2, null, null, false, null, 11)) : cVar2;
        }
        com.avito.android.str_seller_orders_important_to_note.domain.j jVar = ((StrSellerImportantToNoteInternalAction.UpdateContent) strSellerImportantToNoteInternalAction2).f291402b;
        return b(aA0.c.a(cVar2, jVar.f291333a, jVar.f291334b, false, null, 8));
    }
}
