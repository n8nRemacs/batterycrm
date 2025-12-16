package com.avito.android.newcars_mark_model_filter.link;

import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.newcars_mark_model_filter.link.NewCarsBrandModelFilterDeepLink;
import com.avito.android.newcars_mark_model_filter.presentation.NewCarsBrandModelFilterFragment;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NewCarsBrandModelFilterDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/link/a;", "Lev/a;", "Lcom/avito/android/newcars_mark_model_filter/link/NewCarsBrandModelFilterDeepLink;", "a", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a extends AbstractC40161a<NewCarsBrandModelFilterDeepLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.d f207273f;

    /* compiled from: NewCarsBrandModelFilterDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/link/a$a;", "", "<init>", "()V", "", "NEW_CARS_BRAND_MODEL_FRAGMENT_TAG", "Ljava/lang/String;", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.newcars_mark_model_filter.link.a$a, reason: collision with other inner class name */
    public static final class C6182a {
        public /* synthetic */ C6182a(C42822w c42822w) {
            this();
        }

        public C6182a() {
        }
    }

    static {
        new C6182a(null);
    }

    @Inject
    public a(@k a.d dVar) {
        this.f207273f = dVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        NewCarsBrandModelFilterFragment.f207276u0.getClass();
        this.f207273f.w1(new NewCarsBrandModelFilterFragment(), "NEW_CARS_BRAND_MODEL_FRAGMENT_TAG");
        j(NewCarsBrandModelFilterDeepLink.b.f207272b);
    }
}
