package com.avito.android.str_seller_orders_important_to_note;

import aA0.InterfaceC19747a;
import com.avito.android.str_seller_orders_important_to_note.StrSellerImportantToNoteFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StrSellerImportantToNoteFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ StrSellerImportantToNoteFragment f291252l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.str_seller_orders_important_to_note.domain.b f291253m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f291254n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(StrSellerImportantToNoteFragment strSellerImportantToNoteFragment, com.avito.android.str_seller_orders_important_to_note.domain.b bVar, com.avito.android.lib.design.bottom_sheet.d dVar) {
        super(0);
        this.f291252l = strSellerImportantToNoteFragment;
        this.f291253m = bVar;
        this.f291254n = dVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        StrSellerImportantToNoteFragment.a aVar = StrSellerImportantToNoteFragment.f291216p0;
        this.f291252l.f5().accept(new InterfaceC19747a.b(this.f291253m));
        this.f291254n.r();
        return G0.f406611a;
    }
}
