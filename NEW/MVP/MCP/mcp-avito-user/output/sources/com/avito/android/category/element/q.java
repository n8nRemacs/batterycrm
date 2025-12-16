package com.avito.android.category.element;

import android.app.Application;
import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.util.C;
import com.avito.android.util.L0;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CategoryWidgetElementItemWidthProviderImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/category/element/q;", "Lcom/avito/android/category/element/p;", "a", "_avito_bx-content_widget_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class q implements p {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f116627e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final L0 f116628a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C f116629b;

    /* renamed from: c, reason: collision with root package name */
    public final int f116630c;

    /* renamed from: d, reason: collision with root package name */
    public final int f116631d;

    /* compiled from: CategoryWidgetElementItemWidthProviderImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/category/element/q$a;", "", "<init>", "()V", "", "BIG_TABLET_WIDTH_DP", "I", "_avito_bx-content_widget_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Inject
    public q(@Y61.k L0 l02, @Y61.k Application application) {
        this.f116628a = l02;
        Resources resources = application.getResources();
        this.f116629b = l02.getF318655a();
        this.f116630c = resources.getDimensionPixelOffset(R.dimen.vertical_content_horizontal_redesign_padding);
        this.f116631d = resources.getDimensionPixelOffset(R.dimen.serp_vertical_category_element_width_many_items_offset);
    }
}
