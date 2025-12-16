package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.service_order_widget.DefaultServiceOrderWidget;
import com.avito.android.remote.model.service_order_widget.FormServiceOrderWidget;
import com.avito.android.remote.model.service_order_widget.ServiceOrderWidget;
import java.lang.reflect.Type;
import kotlin.Metadata;

/* compiled from: ServiceOrderWidgetDeserializer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/ServiceOrderWidgetDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ServiceOrderWidgetDeserializer implements com.google.gson.h<ServiceOrderWidget> {

    /* compiled from: ServiceOrderWidgetDeserializer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f254243a;

        static {
            int[] iArr = new int[ServiceOrderWidget.ServiceOrderWidgetLayoutType.values().length];
            try {
                iArr[ServiceOrderWidget.ServiceOrderWidgetLayoutType.FORM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f254243a = iArr;
        }
    }

    @Override // com.google.gson.h
    public final ServiceOrderWidget deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        ServiceOrderWidget.ServiceOrderWidgetLayoutType serviceOrderWidgetLayoutType = (ServiceOrderWidget.ServiceOrderWidgetLayoutType) gVar.b(iVar.i().D("layoutType"), ServiceOrderWidget.ServiceOrderWidgetLayoutType.class);
        return (ServiceOrderWidget) gVar.b(iVar, (serviceOrderWidgetLayoutType == null ? -1 : a.f254243a[serviceOrderWidgetLayoutType.ordinal()]) == 1 ? FormServiceOrderWidget.class : DefaultServiceOrderWidget.class);
    }
}
