package com.avito.android.widget_filters;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.util.C35961v3;
import com.avito.android.widget_filters.ui.WidgetFiltersFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: WidgetFiltersActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/widget_filters/WidgetFiltersActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WidgetFiltersActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final a f329686n = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @k
    public final Object f329687m = C35961v3.a(this);

    /* compiled from: WidgetFiltersActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/widget_filters/WidgetFiltersActivity$a;", "", "<init>", "()V", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fragment_container);
        if (bundle == null) {
            H hE2 = getSupportFragmentManager().e();
            WidgetFiltersFragment.a aVar = WidgetFiltersFragment.f330270x0;
            WidgetFiltersOpenParams widgetFiltersOpenParams = (WidgetFiltersOpenParams) this.f329687m.getValue();
            aVar.getClass();
            WidgetFiltersFragment widgetFiltersFragment = new WidgetFiltersFragment();
            widgetFiltersFragment.f330279u0.setValue(widgetFiltersFragment, WidgetFiltersFragment.f330271y0[0], widgetFiltersOpenParams);
            hE2.j(R.id.fragment_container, widgetFiltersFragment, null, 1);
            hE2.e();
        }
    }
}
