package Cv0;

import Y61.k;
import com.avito.android.services_transportation_widget.di.ServiceTransportationWidgetFieldTypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.h;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServiceTransportationWidgetTypeAdapterModule_ProvideVariantsTypeAdapterFactoriesFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"LCv0/b;", "Ldagger/internal/h;", "", "Lcom/google/gson/r;", "LX41/o;", "a", "_avito_service-transportation-widget_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements h<Set<r>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f2735a = new a(null);

    /* compiled from: ServiceTransportationWidgetTypeAdapterModule_ProvideVariantsTypeAdapterFactoriesFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCv0/b$a;", "", "<init>", "()V", "_avito_service-transportation-widget_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f2735a.getClass();
        return Collections.singleton(new ServiceTransportationWidgetFieldTypeAdapterFactory());
    }
}
