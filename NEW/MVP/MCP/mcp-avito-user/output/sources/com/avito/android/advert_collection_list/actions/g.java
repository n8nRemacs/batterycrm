package com.avito.android.advert_collection_list.actions;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InterfaceC22532u2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CollectionActionsBottomSheet.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class g extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ComposeView f82022l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.collections.builders.b f82023m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p<String, a, G0> f82024n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f82025o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f82026p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ComposeView composeView, kotlin.collections.builders.b bVar, p pVar, String str, com.avito.android.lib.design.bottom_sheet.d dVar) {
        super(2);
        this.f82022l = composeView;
        this.f82023m = bVar;
        this.f82024n = pVar;
        this.f82025o = str;
        this.f82026p = dVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            this.f82022l.setViewCompositionStrategy(InterfaceC22532u2.e.f41618b);
            com.akita.compose.theme.re23.c.a(false, r.c(1519084416, new f(this.f82024n, this.f82026p, this.f82025o, this.f82023m), a13), a13, 48, 1);
        }
        return G0.f406611a;
    }
}
