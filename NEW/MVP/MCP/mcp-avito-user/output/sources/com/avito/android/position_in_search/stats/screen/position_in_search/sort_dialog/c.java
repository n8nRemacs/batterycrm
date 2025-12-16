package com.avito.android.position_in_search.stats.screen.position_in_search.sort_dialog;

import Y41.p;
import androidx.compose.runtime.A;
import com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.SearchPositionSortBody;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SearchInPositionSortDialogFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class c extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SearchPositionSortBody f221545l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f221546m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f221547n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ SearchInPositionSortDialogFragment f221548o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SearchPositionSortBody searchPositionSortBody, String str, com.avito.android.lib.design.bottom_sheet.d dVar, SearchInPositionSortDialogFragment searchInPositionSortDialogFragment) {
        super(2);
        this.f221545l = searchPositionSortBody;
        this.f221546m = str;
        this.f221547n = dVar;
        this.f221548o = searchInPositionSortDialogFragment;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            com.avito.android.lib.design.bottom_sheet.d dVar = this.f221547n;
            d.b(this.f221545l, this.f221546m, new a(0, dVar, com.avito.android.lib.design.bottom_sheet.d.class, "dismiss", "dismiss()V", 0), new b(this.f221548o, dVar), a13, 8);
        }
        return G0.f406611a;
    }
}
