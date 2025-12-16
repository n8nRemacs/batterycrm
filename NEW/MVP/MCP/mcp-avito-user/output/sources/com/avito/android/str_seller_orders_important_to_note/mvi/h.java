package com.avito.android.str_seller_orders_important_to_note.mvi;

import aA0.InterfaceC19747a;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.str_seller_orders_important_to_note.mvi.entity.StrSellerImportantToNoteInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StrSellerImportantToNoteFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LaA0/a;", "Lcom/avito/android/str_seller_orders_important_to_note/mvi/entity/StrSellerImportantToNoteInternalAction;", "LaA0/c;", "LaA0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class h extends N implements Y41.l<q<InterfaceC19747a, StrSellerImportantToNoteInternalAction, aA0.c, aA0.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f291407l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f291408m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f291409n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m f291410o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k f291411p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, m mVar, k kVar) {
        super(1);
        this.f291407l = fVar;
        this.f291408m = aVar;
        this.f291409n = screenPerformanceTracker;
        this.f291410o = mVar;
        this.f291411p = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC19747a, StrSellerImportantToNoteInternalAction, aA0.c, aA0.b> qVar) {
        q<InterfaceC19747a, StrSellerImportantToNoteInternalAction, aA0.c, aA0.b> qVar2 = qVar;
        qVar2.f92008d = this.f291407l;
        qVar2.f92009e = this.f291408m;
        qVar2.f92011g = new o(this.f291409n, this.f291410o);
        qVar2.f92010f = this.f291411p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
