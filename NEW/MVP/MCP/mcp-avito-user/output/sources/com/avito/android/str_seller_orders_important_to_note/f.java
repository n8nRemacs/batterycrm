package com.avito.android.str_seller_orders_important_to_note;

import Y41.p;
import androidx.compose.runtime.A;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StrSellerImportantToNoteFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class f extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.str_seller_orders_important_to_note.domain.d f291357l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ StrSellerImportantToNoteFragment f291358m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.str_seller_orders_important_to_note.domain.b f291359n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f291360o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f291361p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.avito.android.str_seller_orders_important_to_note.domain.d dVar, StrSellerImportantToNoteFragment strSellerImportantToNoteFragment, com.avito.android.str_seller_orders_important_to_note.domain.b bVar, String str, com.avito.android.lib.design.bottom_sheet.d dVar2) {
        super(2);
        this.f291357l = dVar;
        this.f291358m = strSellerImportantToNoteFragment;
        this.f291359n = bVar;
        this.f291360o = str;
        this.f291361p = dVar2;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            com.avito.android.str_seller_orders_important_to_note.domain.d dVar = this.f291357l;
            String str = dVar.f291317e;
            StrSellerImportantToNoteFragment strSellerImportantToNoteFragment = this.f291358m;
            com.avito.android.lib.design.bottom_sheet.d dVar2 = this.f291361p;
            com.avito.android.str_seller_orders_important_to_note.domain.b bVar = this.f291359n;
            c cVar = new c(strSellerImportantToNoteFragment, bVar, this.f291360o, dVar2);
            d dVar3 = new d(strSellerImportantToNoteFragment, bVar, dVar2);
            e eVar = new e(dVar2);
            com.avito.android.str_seller_orders_important_to_note.ui.d.a(str, dVar.f291316d, dVar.f291314b, dVar.f291315c, cVar, dVar3, eVar, a13, 64);
        }
        return G0.f406611a;
    }
}
