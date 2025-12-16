package com.avito.android.serp.adapter.recomendations;

import androidx.compose.runtime.internal.P;
import com.avito.android.features.auto.ab_tests.configs.AutoAdvertDetailsI2IDealerBlockTestGroup;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExpandableSectionPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/recomendations/g;", "Lcom/avito/android/serp/adapter/recomendations/d;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final o f270556b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final u3.g<AutoAdvertDetailsI2IDealerBlockTestGroup> f270557c;

    @Inject
    public g(@Y61.k o oVar, @Y61.k @oD.j u3.g<AutoAdvertDetailsI2IDealerBlockTestGroup> gVar) {
        this.f270556b = oVar;
        this.f270557c = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        m mVar = (m) eVar;
        ExpandableSectionItem expandableSectionItem = (ExpandableSectionItem) aVar;
        AutoAdvertDetailsI2IDealerBlockTestGroup autoAdvertDetailsI2IDealerBlockTestGroup = this.f270557c.f439742a.f439749b;
        autoAdvertDetailsI2IDealerBlockTestGroup.getClass();
        if (autoAdvertDetailsI2IDealerBlockTestGroup != AutoAdvertDetailsI2IDealerBlockTestGroup.f157638c && expandableSectionItem.f270547i && L.f(expandableSectionItem.f270545g, "i2i_ranker_top100")) {
            mVar.j8(new e(this));
        }
        mVar.setTitle(expandableSectionItem.f270541c);
        mVar.Z(expandableSectionItem.f270542d);
        mVar.a(new f(this, expandableSectionItem));
        mVar.y5(expandableSectionItem.f270543e);
    }
}
