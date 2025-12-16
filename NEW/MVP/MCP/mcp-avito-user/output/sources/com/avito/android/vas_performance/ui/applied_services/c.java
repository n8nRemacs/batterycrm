package com.avito.android.vas_performance.ui.applied_services;

import Ju.InterfaceC14249c;
import com.avito.android.vas_planning.deeplink.VasPlannerRemoveLink;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kv.C43501a;

/* compiled from: AppliedServicesDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class c<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppliedServicesDialogFragment f321420b;

    public c(AppliedServicesDialogFragment appliedServicesDialogFragment) {
        this.f321420b = appliedServicesDialogFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        String str;
        InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
        boolean z12 = interfaceC14249c instanceof VasPlannerRemoveLink.b.a;
        AppliedServicesDialogFragment appliedServicesDialogFragment = this.f321420b;
        if (z12) {
            String str2 = ((VasPlannerRemoveLink.b.a) interfaceC14249c).f322255b;
            if (str2 != null) {
                j jVar = appliedServicesDialogFragment.f321409k0;
                (jVar != null ? jVar : null).ia(str2);
                return;
            }
            return;
        }
        if (!(interfaceC14249c instanceof VasPlannerRemoveLink.b.C9962b) || (str = ((VasPlannerRemoveLink.b.C9962b) interfaceC14249c).f322256b) == null) {
            return;
        }
        j jVar2 = appliedServicesDialogFragment.f321409k0;
        (jVar2 != null ? jVar2 : null).R7(str);
    }
}
