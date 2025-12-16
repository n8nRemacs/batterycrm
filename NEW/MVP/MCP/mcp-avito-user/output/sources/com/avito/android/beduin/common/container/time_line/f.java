package com.avito.android.beduin.common.container.time_line;

import Y61.k;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_shared.model.utils.q;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import oj.InterfaceC44784a;

/* compiled from: TimeLineExtractionStrategy.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/container/time_line/f;", "Loj/a;", "Lcom/avito/android/beduin/common/container/time_line/BeduinTimeLineContainerModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements InterfaceC44784a<BeduinTimeLineContainerModel> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC44784a<BeduinModel>> f103249a;

    @Inject
    public f(@k h31.e<InterfaceC44784a<BeduinModel>> eVar) {
        this.f103249a = eVar;
    }

    @Override // oj.InterfaceC44784a
    public final Map m(BeduinModel beduinModel) {
        return q.a(((BeduinTimeLineContainerModel) beduinModel).getChildren(), this.f103249a.get());
    }
}
