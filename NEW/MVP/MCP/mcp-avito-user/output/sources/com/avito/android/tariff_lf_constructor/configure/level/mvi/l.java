package com.avito.android.tariff_lf_constructor.configure.level.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.remote.model.Image;
import com.avito.android.tariff_lf_constructor.configure.level.mvi.entity.ConstructorConfigureLevelInternalAction;
import com.avito.android.tariff_lf_constructor.configure.remote.model.level.ConfigureLevelFeature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import mD0.C43950b;
import mD0.C43952d;
import tD0.C48537a;
import tD0.C48538b;

/* compiled from: ConstructorConfigureLevelReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/level/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/tariff_lf_constructor/configure/level/mvi/entity/ConstructorConfigureLevelInternalAction;", "LmD0/d;", "<init>", "()V", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l implements u<ConstructorConfigureLevelInternalAction, C43952d> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C43952d a(ConstructorConfigureLevelInternalAction constructorConfigureLevelInternalAction, C43952d c43952d) {
        ConstructorConfigureLevelInternalAction constructorConfigureLevelInternalAction2 = constructorConfigureLevelInternalAction;
        C43952d c43952d2 = c43952d;
        if (constructorConfigureLevelInternalAction2 instanceof ConstructorConfigureLevelInternalAction.Loading) {
            return C43952d.a(c43952d2, true, null);
        }
        if (constructorConfigureLevelInternalAction2 instanceof ConstructorConfigureLevelInternalAction.Error) {
            return C43952d.a(c43952d2, false, ((ConstructorConfigureLevelInternalAction.Error) constructorConfigureLevelInternalAction2).f299835b);
        }
        if (!(constructorConfigureLevelInternalAction2 instanceof ConstructorConfigureLevelInternalAction.Content)) {
            return c43952d2;
        }
        C48538b c48538b = ((ConstructorConfigureLevelInternalAction.Content) constructorConfigureLevelInternalAction2).f299834b;
        String headerTitle = c48538b.getHeaderTitle();
        String title = c48538b.getTitle();
        List<C48537a> listB = c48538b.b();
        int i12 = 10;
        ArrayList arrayList = new ArrayList(C42745f0.q(listB, 10));
        int i13 = 0;
        for (Object obj : listB) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            C48537a c48537a = (C48537a) obj;
            Image image = c48537a.getImage();
            String title2 = c48537a.getTitle();
            String description = c48537a.getDescription();
            List<ConfigureLevelFeature> listD = c48537a.d();
            ArrayList arrayList2 = new ArrayList(C42745f0.q(listD, i12));
            Iterator<T> it = listD.iterator();
            while (it.hasNext()) {
                String title3 = ((ConfigureLevelFeature) it.next()).getTitle();
                com.akita.compose.theme.re23.b.f63983a.getClass();
                arrayList2.add(new C43950b.a(title3, com.akita.compose.theme.re23.b.f63984b.f63938l));
            }
            arrayList.add(new C43950b(i13, image, title2, description, arrayList2, c48537a.getPrice(), c48537a.getActionLink(), c48537a.getButton()));
            i13 = i14;
            i12 = 10;
        }
        return new C43952d(false, null, headerTitle, title, arrayList);
    }
}
