package Fv0;

import Y61.k;
import androidx.recyclerview.widget.GridLayoutManager;
import com.avito.android.services_transportation_widget.item.ServicesTransportationWidgetBlueprintItem;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ServiceTransportationFieldsSpanSizeLookup.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFv0/a;", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Fv0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13839a extends GridLayoutManager.c {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<ServicesTransportationWidgetBlueprintItem> f6020e;

    /* JADX WARN: Multi-variable type inference failed */
    public C13839a(@k List<? extends ServicesTransportationWidgetBlueprintItem> list) {
        this.f6020e = list;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int f(int i12) {
        return this.f6020e.get(i12).i2().getSpanSize();
    }
}
