package com.avito.android.beduin.common.component.adapter;

import Y61.k;
import androidx.recyclerview.widget.C23424o;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00050\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/beduin/common/component/adapter/e;", "Landroidx/recyclerview/widget/o$f;", "Lej/a;", "Lcom/avito/android/beduin_models/BeduinModel;", "Lej/e;", "Lcom/avito/android/beduin_shared/model/component/BeduinComponentItem;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e extends C23424o.f<AbstractC40112a<BeduinModel, InterfaceC40116e>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final e f100616a = new e();

    public static boolean d(@k AbstractC40112a abstractC40112a, @k AbstractC40112a abstractC40112a2) {
        if (L.f(abstractC40112a.S().getF100853b(), abstractC40112a2.S().getF100853b())) {
            if (abstractC40112a.S().getClass() == abstractC40112a2.S().getClass()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(AbstractC40112a<BeduinModel, InterfaceC40116e> abstractC40112a, AbstractC40112a<BeduinModel, InterfaceC40116e> abstractC40112a2) {
        return L.f(abstractC40112a.S(), abstractC40112a2.S());
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final /* bridge */ /* synthetic */ boolean b(AbstractC40112a<BeduinModel, InterfaceC40116e> abstractC40112a, AbstractC40112a<BeduinModel, InterfaceC40116e> abstractC40112a2) {
        return d(abstractC40112a, abstractC40112a2);
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final Object c(AbstractC40112a<BeduinModel, InterfaceC40116e> abstractC40112a, AbstractC40112a<BeduinModel, InterfaceC40116e> abstractC40112a2) {
        AbstractC40112a<BeduinModel, InterfaceC40116e> abstractC40112a3 = abstractC40112a;
        AbstractC40112a<BeduinModel, InterfaceC40116e> abstractC40112a4 = abstractC40112a2;
        if (abstractC40112a3.S().getClass() == abstractC40112a4.S().getClass()) {
            return abstractC40112a3.l(abstractC40112a4.S());
        }
        return null;
    }
}
