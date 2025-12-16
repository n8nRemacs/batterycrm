package com.avito.android.mortgage.root.list.items.immutable_info.description.mvi;

import Y41.l;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.mortgage.root.list.items.immutable_info.description.mvi.entity.ImmutableInfoDescriptionInternalAction;
import d10.C39483c;
import d10.InterfaceC39481a;
import d10.InterfaceC39482b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ImmutableInfoDescriptionFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Ld10/a;", "Lcom/avito/android/mortgage/root/list/items/immutable_info/description/mvi/entity/ImmutableInfoDescriptionInternalAction;", "Ld10/c;", "Ld10/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class e extends N implements l<q<InterfaceC39481a, ImmutableInfoDescriptionInternalAction, C39483c, InterfaceC39482b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f202615l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f202616m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f202617n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f202618o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f202619p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, h hVar, ScreenPerformanceTracker screenPerformanceTracker, j jVar) {
        super(1);
        this.f202615l = cVar;
        this.f202616m = aVar;
        this.f202617n = hVar;
        this.f202618o = screenPerformanceTracker;
        this.f202619p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC39481a, ImmutableInfoDescriptionInternalAction, C39483c, InterfaceC39482b> qVar) {
        q<InterfaceC39481a, ImmutableInfoDescriptionInternalAction, C39483c, InterfaceC39482b> qVar2 = qVar;
        qVar2.f92008d = this.f202615l;
        qVar2.f92009e = this.f202616m;
        qVar2.f92010f = this.f202617n;
        qVar2.f92011g = new o(this.f202618o, this.f202619p);
        return G0.f406611a;
    }
}
