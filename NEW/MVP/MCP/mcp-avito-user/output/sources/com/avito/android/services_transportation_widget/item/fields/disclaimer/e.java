package com.avito.android.services_transportation_widget.item.fields.disclaimer;

import Y61.k;
import com.avito.android.services_transportation_widget.item.l;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServicesTransportationWidgetDisclaimerPresenterImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/services_transportation_widget/item/fields/disclaimer/e;", "Ldagger/internal/h;", "Lcom/avito/android/services_transportation_widget/item/fields/disclaimer/d;", "a", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements h<d> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f280563b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<l> f280564a;

    /* compiled from: ServicesTransportationWidgetDisclaimerPresenterImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/services_transportation_widget/item/fields/disclaimer/e$a;", "", "<init>", "()V", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@k Provider<l> provider) {
        this.f280564a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        l lVar = this.f280564a.get();
        f280563b.getClass();
        return new d(lVar);
    }
}
