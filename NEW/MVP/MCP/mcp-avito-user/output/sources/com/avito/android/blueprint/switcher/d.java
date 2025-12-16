package com.avito.android.blueprint.switcher;

import Y41.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.SwitcherAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PublishSwitcherPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isChecked", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.items.b f105769l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f105770m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.avito.android.items.b bVar, e eVar) {
        super(1);
        this.f105769l = bVar;
        this.f105770m = eVar;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        com.avito.android.items.b bVar = this.f105769l;
        bVar.f173929d = zBooleanValue;
        e eVar = this.f105770m;
        eVar.f105771b.accept(bVar);
        SwitcherAction switcherAction = bVar.f173939n;
        DeepLink off = null;
        if (zBooleanValue) {
            if (switcherAction != null) {
                off = switcherAction.getOn();
            }
        } else if (switcherAction != null) {
            off = switcherAction.getOff();
        }
        if (off != null) {
            eVar.f105773d.accept(off);
        }
        return G0.f406611a;
    }
}
