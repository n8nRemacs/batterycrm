package com.avito.android.serp.adapter.vertical_main.featured;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.constructor_advert.ui.serp.constructor.f;
import com.avito.android.remote.model.vertical_main.DisplayConfig;
import com.avito.android.remote.model.vertical_main.FeaturedWidget;
import com.avito.android.remote.model.vertical_main.TabsStyle;
import com.avito.android.serp.adapter.InterfaceC34904z0;
import com.avito.android.serp.adapter.advert_xl.D;
import com.avito.android.serp.adapter.vertical_main.featured.action.FeaturedActionItem;
import com.avito.android.serp.adapter.vertical_main.featured.header.FeaturedHeaderItem;
import com.avito.android.serp.adapter.vertical_main.featured.navigation.FeaturedNavigation;
import com.avito.android.serp.adapter.vertical_main.featured.navigation.FeaturedTabsItem;
import com.avito.android.serp.adapter.witcher.InterfaceC34887f;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: VerticalFeaturedItemsConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/featured/c;", "Lcom/avito/android/serp/adapter/vertical_main/featured/b;", "a", "b", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements com.avito.android.serp.adapter.vertical_main.featured.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC34904z0 f272828a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final D f272829b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final f f272830c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC34887f f272831d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Set<com.avito.android.serp.b<?, ?>> f272832e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f272833f;

    /* compiled from: VerticalFeaturedItemsConverter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/featured/c$a;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final b f272834a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f272835b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final FeaturedActionItem f272836c;

        public a(@k b bVar, @k ArrayList arrayList, @l FeaturedActionItem featuredActionItem) {
            this.f272834a = bVar;
            this.f272835b = arrayList;
            this.f272836c = featuredActionItem;
        }
    }

    /* compiled from: VerticalFeaturedItemsConverter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/featured/c$b;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final FeaturedHeaderItem f272837a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final FeaturedTabsItem f272838b;

        public b(@l FeaturedHeaderItem featuredHeaderItem, @l FeaturedTabsItem featuredTabsItem) {
            this.f272837a = featuredHeaderItem;
            this.f272838b = featuredTabsItem;
        }
    }

    /* compiled from: VerticalFeaturedItemsConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.serp.adapter.vertical_main.featured.c$c, reason: collision with other inner class name */
    public /* synthetic */ class C8098c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f272839a;

        static {
            int[] iArr = new int[TabsStyle.values().length];
            try {
                iArr[TabsStyle.CHIPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f272839a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k Resources resources, @k InterfaceC34904z0 interfaceC34904z0, @k D d12, @k f fVar, @k InterfaceC34887f interfaceC34887f, @k Set<? extends com.avito.android.serp.b<?, ?>> set) {
        this.f272828a = interfaceC34904z0;
        this.f272829b = d12;
        this.f272830c = fVar;
        this.f272831d = interfaceC34887f;
        this.f272832e = set;
        this.f272833f = resources.getBoolean(R.bool.is_tablet);
    }

    public static FeaturedNavigation b(FeaturedWidget featuredWidget) {
        FeaturedNavigation tab;
        String title = featuredWidget.getTitle();
        if (title == null || title.length() <= 0) {
            title = null;
        }
        if (title == null || featuredWidget.getItems().isEmpty()) {
            return null;
        }
        int size = C42745f0.i0(featuredWidget.getAction(), featuredWidget.getItems()).size();
        DisplayConfig displayConfig = featuredWidget.getDisplayConfig();
        TabsStyle tabsStyle = displayConfig != null ? displayConfig.getTabsStyle() : null;
        if ((tabsStyle == null ? -1 : C8098c.f272839a[tabsStyle.ordinal()]) == 1) {
            String type = featuredWidget.getType();
            tab = new FeaturedNavigation.Chips(title, size, new FeaturedNavigation.Analytics(type != null ? type : ""));
        } else {
            String type2 = featuredWidget.getType();
            tab = new FeaturedNavigation.Tab(title, size, new FeaturedNavigation.Analytics(type2 != null ? type2 : ""));
        }
        return tab;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0396 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [com.avito.android.serp.adapter.vertical_main.featured.action.FeaturedActionItem] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v24 */
    @Override // com.avito.android.serp.adapter.vertical_main.featured.b
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.collections.builders.b a(@Y61.k com.avito.android.remote.model.vertical_main.FeaturedWidget r35, int r36, @Y61.l java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 1099
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.serp.adapter.vertical_main.featured.c.a(com.avito.android.remote.model.vertical_main.FeaturedWidget, int, java.lang.String):kotlin.collections.builders.b");
    }
}
