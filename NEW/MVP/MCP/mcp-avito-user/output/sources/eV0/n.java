package Ev0;

import Ev0.m;
import android.app.Activity;
import com.avito.android.location.r;
import com.avito.android.util.R0;
import java.lang.ref.WeakReference;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServiceTransportationWidgetItemModule_Provider_BindServiceTransportationWidgetDialogResolverFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LEv0/n;", "Ldagger/internal/h;", "Lcom/avito/android/services_transportation_widget/dialog/a;", "a", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<com.avito.android.services_transportation_widget.dialog.a> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f4395e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<r> f4396a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f4397b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.util.text.a> f4398c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<R0> f4399d;

    /* compiled from: ServiceTransportationWidgetItemModule_Provider_BindServiceTransportationWidgetDialogResolverFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEv0/n$a;", "", "<init>", "()V", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public n(@Y61.k m.a aVar, @Y61.k Provider provider, @Y61.k dagger.internal.l lVar, @Y61.k Provider provider2, @Y61.k Provider provider3) {
        this.f4396a = provider;
        this.f4397b = lVar;
        this.f4398c = provider2;
        this.f4399d = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = this.f4396a.get();
        Activity activity = (Activity) this.f4397b.f393949a;
        com.avito.android.util.text.a aVar = this.f4398c.get();
        R0 r02 = this.f4399d.get();
        f4395e.getClass();
        return new com.avito.android.services_transportation_widget.dialog.f(rVar, new WeakReference(activity), aVar, r02);
    }
}
