package com.avito.android.item_map.routes;

import android.view.View;
import com.avito.android.R;
import com.avito.android.item_map.remote.model.route.Type;
import com.avito.android.lib.design.list_item.BaseListItem;
import com.avito.android.lib.design.list_item.ListItemCheckmark;
import kotlin.Metadata;

/* compiled from: RouteItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/routes/b;", "Lcom/avito/android/item_map/routes/a;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements com.avito.android.item_map.routes.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f173374a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Type f173375b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f173376c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final BaseListItem f173377d;

    /* compiled from: RouteItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f173378a;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.Driving.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.Walking.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f173378a = iArr;
        }
    }

    public b(@Y61.k View view, @Y61.k Type type, @Y61.k com.avito.android.util.text.a aVar) {
        this.f173374a = view;
        this.f173375b = type;
        this.f173376c = aVar;
        this.f173377d = (BaseListItem) view.findViewById(R.id.container);
        RouteButtonViewState routeButtonViewState = RouteButtonViewState.f173367b;
    }

    @Override // com.avito.android.item_map.routes.a
    public final void a() {
        this.f173377d.setVisibility(0);
    }

    @Override // com.avito.android.item_map.routes.a
    public final void b(@Y61.k RouteButtonViewState routeButtonViewState) {
        BaseListItem baseListItem = this.f173377d;
        if (baseListItem instanceof ListItemCheckmark) {
            ((ListItemCheckmark) baseListItem).setChecked(routeButtonViewState == RouteButtonViewState.f173368c);
        }
    }
}
