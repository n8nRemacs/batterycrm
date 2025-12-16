package com.avito.android.advert_collection_list.actions;

import Y41.p;
import androidx.compose.runtime.A;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CollectionActionsBottomSheet.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class f extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.collections.builders.b f82018l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p<String, a, G0> f82019m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f82020n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f82021o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p pVar, com.avito.android.lib.design.bottom_sheet.d dVar, String str, kotlin.collections.builders.b bVar) {
        super(2);
        this.f82018l = bVar;
        this.f82019m = pVar;
        this.f82020n = str;
        this.f82021o = dVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            b.b(this.f82018l, new e(this.f82019m, this.f82020n, this.f82021o), a13, 8);
        }
        return G0.f406611a;
    }
}
