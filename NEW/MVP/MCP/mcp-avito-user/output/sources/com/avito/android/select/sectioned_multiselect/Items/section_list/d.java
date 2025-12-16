package com.avito.android.select.sectioned_multiselect.Items.section_list;

import androidx.compose.runtime.internal.P;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: SectionedMultiselectItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/Items/section_list/d;", "LTV0/f;", "Lcom/avito/android/select/sectioned_multiselect/Items/section_list/f;", "Lcom/avito/android/select/sectioned_multiselect/Items/section_list/a;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements TV0.f<f, a> {
    @Inject
    public d() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        a aVar2 = (a) aVar;
        String str = aVar2.f266391c;
        if (str != null) {
            fVar.setTitle(str);
        }
        fVar.B(aVar2.f266392d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.List] */
    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        f fVar = (f) eVar;
        Object objG = C42745f0.G(list);
        com.avito.android.select.sectioned_multiselect.tab.a aVar2 = objG instanceof com.avito.android.select.sectioned_multiselect.tab.a ? (com.avito.android.select.sectioned_multiselect.tab.a) objG : null;
        if (aVar2 == null) {
            return;
        }
        fVar.B(aVar2.f266704a);
    }
}
