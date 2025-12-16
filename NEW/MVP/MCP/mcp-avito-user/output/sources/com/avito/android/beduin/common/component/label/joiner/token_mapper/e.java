package com.avito.android.beduin.common.component.label.joiner.token_mapper;

import Ui.InterfaceC15523b;
import com.avito.android.beduin_models.BeduinAction;
import ii.InterfaceC41409e;
import java.util.List;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;

/* compiled from: LinkTokenMapper.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class e implements InterfaceC41409e, D {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC15523b<BeduinAction> f101671b;

    public e(InterfaceC15523b<BeduinAction> interfaceC15523b) {
        this.f101671b = interfaceC15523b;
    }

    @Override // ii.InterfaceC41409e
    public final void a(@Y61.l List<? extends BeduinAction> list) {
        com.avito.android.beduin_shared.model.utils.a.a(this.f101671b, list);
    }

    public final boolean equals(@Y61.l Object obj) {
        if ((obj instanceof InterfaceC41409e) && (obj instanceof D)) {
            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.D
    @Y61.k
    public final InterfaceC43072x<?> getFunctionDelegate() {
        return new H(1, this.f101671b, com.avito.android.beduin_shared.model.utils.a.class, "handle", "handle(Lcom/avito/android/beduin_shared/model/action/BeduinActionHandler;Ljava/util/List;)V", 1);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
