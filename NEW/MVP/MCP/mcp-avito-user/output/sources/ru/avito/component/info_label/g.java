package ru.avito.component.info_label;

import hw.InterfaceC41178c;
import kotlin.Metadata;

/* compiled from: InfoLabelItem.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/component/info_label/g;", "Lcom/avito/conveyor_item/a;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class g implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f430363b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f430364c;

    public g(@Y61.k String str, @Y61.k String str2) {
        InfoLevel infoLevel = InfoLevel.f430349b;
        this.f430363b = str;
        this.f430364c = str2;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF222258b() {
        return getF266981b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF266981b() {
        return this.f430363b;
    }
}
