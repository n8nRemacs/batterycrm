package com.avito.android.early_access.mvi;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.v;
import com.avito.android.early_access.adapter.bundle.EarlyAccessBundleDividerItem;
import com.avito.android.early_access.adapter.bundle.EarlyAccessSelectableBundleItem;
import com.avito.android.early_access.adapter.short_bundle.EarlyAccessShortBundleItem;
import com.avito.android.early_access.adapter.short_bundle.EarlyAccessShortBundlesItem;
import com.avito.android.early_access.adapter.title.EarlyAccessTitleItem;
import com.avito.android.early_access.entities.ReEarlyAccessData;
import com.avito.android.early_access.mvi.entity.ButtonContent;
import com.avito.android.early_access.mvi.entity.EarlyAccessState;
import com.avito.android.early_access.mvi.entity.PopupContentType;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: EarlyAccessScreenPreview.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class d0 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f145450l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(int i12) {
        super(2);
        this.f145450l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f145450l | 1);
        androidx.compose.runtime.B bE2 = a12.E(-152948748);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            List<ReEarlyAccessData.Package> listA = f0.a();
            kotlin.collections.builders.b bVarT = C42745f0.t();
            bVarT.add(new EarlyAccessShortBundlesItem(null, C42745f0.U(new EarlyAccessShortBundleItem(listA.get(1), true), new EarlyAccessShortBundleItem(listA.get(2), false)), 1, null));
            bVarT.add(new EarlyAccessBundleDividerItem(null, "или", 1, null));
            bVarT.add(new EarlyAccessSelectableBundleItem(listA.get(0), false, false, false, 8, null));
            kotlin.collections.builders.b bVarP = C42745f0.p(bVarT);
            ButtonContent buttonContent = new ButtonContent("Выбрать доступ на*7*дней", null, null, 6, null);
            kotlin.collections.builders.b bVarT2 = C42745f0.t();
            bVarT2.add(new EarlyAccessTitleItem(null, "Первыми связывайтесь с*собственниками", null, 5, null));
            bVarT2.addAll(f0.e(true));
            bVarT2.addAll(bVarP);
            EarlyAccessState.Content content = new EarlyAccessState.Content(buttonContent, f0.c(), C42745f0.p(bVarT2), PopupContentType.Default.f145482b, false, false, 48, null);
            c0 c0Var = c0.f145445l;
            v.a aVar = androidx.compose.ui.v.f42878y1;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.b.f63987e.getClass();
            com.akita.compose.theme.re23.semantic.b.f65954b.c().getClass();
            A.a(content, c0Var, androidx.compose.foundation.A.b(aVar, X2.b.f18125d.c(bE2), Y0.f39346a), bE2, 56, 0);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new d0(iA2);
        }
        return G0.f406611a;
    }
}
