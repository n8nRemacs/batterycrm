package com.avito.android.beduin.common.container.card_item;

import Y61.k;
import com.avito.android.beduin_models.BeduinModel;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import oj.InterfaceC44784a;

/* compiled from: BeduinCardItemExtractionStrategy.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/container/card_item/f;", "Loj/a;", "Lcom/avito/android/beduin/common/container/card_item/BeduinCardItemContainerModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements InterfaceC44784a<BeduinCardItemContainerModel> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC44784a<BeduinModel>> f102957a;

    @Inject
    public f(@k h31.e<InterfaceC44784a<BeduinModel>> eVar) {
        this.f102957a = eVar;
    }

    @Override // oj.InterfaceC44784a
    public final Map m(BeduinModel beduinModel) {
        return this.f102957a.get().m(((BeduinCardItemContainerModel) beduinModel).getChild());
    }
}
