package com.avito.android.services_transportation_widget.di;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.c;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ServiceTransportationWidgetFieldTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/services_transportation_widget/di/ServiceTransportationWidgetFieldTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "a", "_avito_service-transportation-widget_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ServiceTransportationWidgetFieldTypeAdapterFactory implements r {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinkedHashMap<String, Class<? extends ServiceTransportationWidget.Field<?>>> f280494b = new LinkedHashMap<>();

    /* compiled from: ServiceTransportationWidgetFieldTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/services_transportation_widget/di/ServiceTransportationWidgetFieldTypeAdapterFactory$a;", "", "<init>", "()V", "", "TYPE_FIELD_NAME", "Ljava/lang/String;", "_avito_service-transportation-widget_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public ServiceTransportationWidgetFieldTypeAdapterFactory() {
        b(ServiceTransportationWidget.CardSelectField.class, ServiceTransportationWidget.CardSelectField.TYPE);
        b(ServiceTransportationWidget.DisclaimerField.class, ServiceTransportationWidget.DisclaimerField.TYPE);
        b(ServiceTransportationWidget.EmptyPriceField.class, ServiceTransportationWidget.EmptyPriceField.TYPE);
        b(ServiceTransportationWidget.LocationField.class, "location");
        b(ServiceTransportationWidget.PriceField.class, "price");
        b(ServiceTransportationWidget.SelectField.class, "select");
        b(ServiceTransportationWidget.SwitchGroupField.class, ServiceTransportationWidget.SwitchGroupField.TYPE);
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (!L.f(aVar.getRawType(), ServiceTransportationWidget.Field.class)) {
            return null;
        }
        LinkedHashMap<String, Class<? extends ServiceTransportationWidget.Field<?>>> linkedHashMap = this.f280494b;
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap.size());
        for (Map.Entry<String, Class<? extends ServiceTransportationWidget.Field<?>>> entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), gson.f(com.google.gson.reflect.a.get((Class) entry.getValue())));
        }
        return new TypeAdapter<T>() { // from class: com.avito.android.services_transportation_widget.di.ServiceTransportationWidgetFieldTypeAdapterFactory$create$1
            /* JADX WARN: Removed duplicated region for block: B:4:0x0013  */
            @Override // com.google.gson.TypeAdapter
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final T read(@Y61.k com.google.gson.stream.a r5) {
                /*
                    r4 = this;
                    com.google.gson.i r5 = com.google.gson.internal.C.a(r5)
                    com.google.gson.k r0 = r5.i()
                    java.lang.String r1 = "type"
                    com.google.gson.i r0 = r0.K(r1)
                    java.util.LinkedHashMap<java.lang.String, com.google.gson.TypeAdapter<? extends T>> r1 = r1
                    r2 = 0
                    if (r0 != 0) goto L15
                L13:
                    r0 = r2
                    goto L2e
                L15:
                    java.lang.String r0 = r0.s()
                    java.lang.Object r0 = r1.get(r0)
                    boolean r3 = r0 instanceof com.google.gson.TypeAdapter
                    if (r3 == 0) goto L24
                    com.google.gson.TypeAdapter r0 = (com.google.gson.TypeAdapter) r0
                    goto L25
                L24:
                    r0 = r2
                L25:
                    if (r0 != 0) goto L28
                    r0 = r2
                L28:
                    if (r0 == 0) goto L13
                    java.lang.Object r0 = r0.fromJsonTree(r5)
                L2e:
                    if (r0 != 0) goto L5a
                    com.google.gson.k r5 = r5.i()
                    com.google.gson.internal.x<java.lang.String, com.google.gson.i> r5 = r5.f362194b
                    java.util.Set r5 = r5.entrySet()
                    java.lang.Object r5 = kotlin.collections.C42745f0.D(r5)
                    java.util.Map$Entry r5 = (java.util.Map.Entry) r5
                    java.lang.Object r0 = r5.getKey()
                    java.lang.Object r0 = r1.get(r0)
                    com.google.gson.TypeAdapter r0 = (com.google.gson.TypeAdapter) r0
                    if (r0 != 0) goto L4d
                    r0 = r2
                L4d:
                    if (r0 == 0) goto L59
                    java.lang.Object r5 = r5.getValue()
                    com.google.gson.i r5 = (com.google.gson.i) r5
                    java.lang.Object r2 = r0.fromJsonTree(r5)
                L59:
                    r0 = r2
                L5a:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.services_transportation_widget.di.ServiceTransportationWidgetFieldTypeAdapterFactory$create$1.read(com.google.gson.stream.a):java.lang.Object");
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(@k c cVar, T t12) {
                throw new UnsupportedOperationException();
            }
        }.nullSafe();
    }

    public final void b(Class cls, String str) {
        LinkedHashMap<String, Class<? extends ServiceTransportationWidget.Field<?>>> linkedHashMap = this.f280494b;
        if (linkedHashMap.containsKey(str)) {
            throw new IllegalArgumentException("types and labels must be unique");
        }
        linkedHashMap.put(str, cls);
    }
}
