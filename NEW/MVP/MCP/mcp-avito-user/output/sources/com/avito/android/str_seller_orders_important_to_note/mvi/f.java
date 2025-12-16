package com.avito.android.str_seller_orders_important_to_note.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.str_seller_orders_important_to_note.ImportantToNoteOpenParams;
import com.avito.android.str_seller_orders_important_to_note.mvi.entity.StrSellerImportantToNoteInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: StrSellerImportantToNoteBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders_important_to_note/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/str_seller_orders_important_to_note/mvi/entity/StrSellerImportantToNoteInternalAction;", "_avito_str-seller-orders-important-to-note_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements com.avito.android.arch.mvi.b<StrSellerImportantToNoteInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ImportantToNoteOpenParams f291403a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_seller_orders_important_to_note.domain.k f291404b;

    @Inject
    public f(@Y61.k ImportantToNoteOpenParams importantToNoteOpenParams, @Y61.k com.avito.android.str_seller_orders_important_to_note.domain.k kVar) {
        this.f291403a = importantToNoteOpenParams;
        this.f291404b = kVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<StrSellerImportantToNoteInternalAction> a() {
        return this.f291404b.a(this.f291403a);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
