package com.avito.android.mortgage.document_upload.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.mortgage.document_upload.mvi.entity.DocumentUploadInternalAction;
import f00.C40196c;
import f00.InterfaceC40194a;
import f00.InterfaceC40195b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DocumentUploadFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lf00/a;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction;", "Lf00/c;", "Lf00/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class f extends N implements Y41.l<q<InterfaceC40194a, DocumentUploadInternalAction, C40196c, InterfaceC40195b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f199426l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f199427m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f199428n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f199429o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f199430p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, b bVar, ScreenPerformanceTracker screenPerformanceTracker, k kVar, i iVar) {
        super(1);
        this.f199426l = dVar;
        this.f199427m = bVar;
        this.f199428n = screenPerformanceTracker;
        this.f199429o = kVar;
        this.f199430p = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC40194a, DocumentUploadInternalAction, C40196c, InterfaceC40195b> qVar) {
        q<InterfaceC40194a, DocumentUploadInternalAction, C40196c, InterfaceC40195b> qVar2 = qVar;
        qVar2.f92008d = this.f199426l;
        qVar2.f92009e = this.f199427m;
        qVar2.f92011g = new o(this.f199428n, this.f199429o);
        qVar2.f92010f = this.f199430p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
