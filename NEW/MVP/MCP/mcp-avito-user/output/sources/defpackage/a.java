package defpackage;

import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.C23424o;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ConstructorConfigureVerticalDiffCallback.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"La;", "Landroidx/recyclerview/widget/o$f;", "LTV0/a;", "<init>", "()V", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a extends C23424o.f<TV0.a> {
    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        if ((aVar3 instanceof com.avito.android.tariff_lf_constructor.configure.vertical.items.content.a) && (aVar4 instanceof com.avito.android.tariff_lf_constructor.configure.vertical.items.content.a)) {
            if (((com.avito.android.tariff_lf_constructor.configure.vertical.items.content.a) aVar3).getId() != ((com.avito.android.tariff_lf_constructor.configure.vertical.items.content.a) aVar4).getId()) {
                return false;
            }
            com.avito.android.tariff_lf_constructor.configure.vertical.items.content.a aVar5 = (com.avito.android.tariff_lf_constructor.configure.vertical.items.content.a) aVar3;
            com.avito.android.tariff_lf_constructor.configure.vertical.items.content.a aVar6 = (com.avito.android.tariff_lf_constructor.configure.vertical.items.content.a) aVar4;
            if (!L.f(aVar5.f300608c, aVar6.f300608c) || !L.f(aVar5.f300609d, aVar6.f300609d) || !L.f(aVar5.f300611f.getPath(), aVar6.f300611f.getPath())) {
                return false;
            }
        } else {
            if (!(aVar3 instanceof com.avito.android.tariff_lf_constructor.configure.vertical.items.profile_selector.a) || !(aVar4 instanceof com.avito.android.tariff_lf_constructor.configure.vertical.items.profile_selector.a)) {
                return aVar3.equals(aVar4);
            }
            ((com.avito.android.tariff_lf_constructor.configure.vertical.items.profile_selector.a) aVar3).getClass();
            long j12 = 734040925;
            ((com.avito.android.tariff_lf_constructor.configure.vertical.items.profile_selector.a) aVar4).getClass();
            if (j12 != j12 || !L.f(((com.avito.android.tariff_lf_constructor.configure.vertical.items.profile_selector.a) aVar3).f300638b, ((com.avito.android.tariff_lf_constructor.configure.vertical.items.profile_selector.a) aVar4).f300638b)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(TV0.a aVar, TV0.a aVar2) {
        return aVar.getId() == aVar2.getId();
    }
}
