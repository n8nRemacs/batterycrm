package com.avito.android.services_transportation_widget.item.fields.select;

import Y61.k;
import com.avito.android.services_transportation_widget.item.l;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServicesTransportationWidgetSelectPresenterImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/services_transportation_widget/item/fields/select/f;", "Ldagger/internal/h;", "Lcom/avito/android/services_transportation_widget/item/fields/select/e;", "a", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements h<e> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f280601b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<l> f280602a;

    /* compiled from: ServicesTransportationWidgetSelectPresenterImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/services_transportation_widget/item/fields/select/f$a;", "", "<init>", "()V", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f(@k Provider<l> provider) {
        this.f280602a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        l lVar = this.f280602a.get();
        f280601b.getClass();
        return new e(lVar);
    }
}
