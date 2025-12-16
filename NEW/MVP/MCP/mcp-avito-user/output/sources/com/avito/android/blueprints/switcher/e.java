package com.avito.android.blueprints.switcher;

import Y41.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.SwitcherAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MultiStateSwitcherItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isChecked", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e extends N implements l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.items.b f106752l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f106753m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.avito.android.items.b bVar, f fVar) {
        super(1);
        this.f106752l = bVar;
        this.f106753m = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        com.avito.android.items.b bVar = this.f106752l;
        bVar.f173929d = zBooleanValue;
        f fVar = this.f106753m;
        fVar.f106757e.accept(bVar);
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
            fVar.f106758f.accept(off);
        }
        return G0.f406611a;
    }
}
