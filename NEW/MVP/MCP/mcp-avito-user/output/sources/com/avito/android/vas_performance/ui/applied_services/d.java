package com.avito.android.vas_performance.ui.applied_services;

import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.vas_performance.ui.applied_services.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AppliedServicesDialogFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/vas_performance/ui/applied_services/j$b;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/vas_performance/ui/applied_services/j$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class d extends N implements Y41.l<j.b, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AppliedServicesDialogFragment f321421l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AppliedServicesDialogFragment appliedServicesDialogFragment) {
        super(1);
        this.f321421l = appliedServicesDialogFragment;
    }

    @Override // Y41.l
    public final G0 invoke(j.b bVar) {
        j.b bVar2 = bVar;
        if (bVar2 instanceof j.b.a) {
            j.b.a aVar = (j.b.a) bVar2;
            AppliedServicesDialogFragment appliedServicesDialogFragment = this.f321421l;
            com.avito.android.deeplink_handler.handler.composite.a aVar2 = appliedServicesDialogFragment.f321412n0;
            if (aVar2 == null) {
                aVar2 = null;
            }
            b.a.a(aVar2, aVar.f321431a, null, null, 6);
            if (aVar.f321432b) {
                com.avito.android.lib.design.bottom_sheet.d dVar = (com.avito.android.lib.design.bottom_sheet.d) appliedServicesDialogFragment.getDialog();
                dVar.R(new f(appliedServicesDialogFragment));
                dVar.r();
            }
        }
        return G0.f406611a;
    }
}
