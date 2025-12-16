package com.avito.android.services_transportation_widget.interactor;

import Bv0.C13190b;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import zv0.InterfaceC50633a;

/* compiled from: ServiceTransportationWidgetInteractor.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_transportation_widget/interactor/b;", "Lcom/avito/android/services_transportation_widget/interactor/a;", "_avito_service-transportation-widget_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.services_transportation_widget.interactor.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50633a f280517a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C13190b f280518b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final f f280519c;

    /* compiled from: ServiceTransportationWidgetInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f280520a;

        static {
            int[] iArr = new int[ServiceTransportationWidgetSource.values().length];
            try {
                ServiceTransportationWidgetSource serviceTransportationWidgetSource = ServiceTransportationWidgetSource.f280514b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f280520a = iArr;
        }
    }

    @Inject
    public b(@Y61.k InterfaceC50633a interfaceC50633a, @Y61.k C13190b c13190b, @Y61.k f fVar) {
        this.f280517a = interfaceC50633a;
        this.f280518b = c13190b;
        this.f280519c = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    @Override // com.avito.android.services_transportation_widget.interactor.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.l com.avito.android.services_transportation_widget.item.ServiceTransportationWidgetItem r17, @Y61.k com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget.Field r18, @Y61.k com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget.FieldValue r19, @Y61.k com.avito.android.services_transportation_widget.interactor.ServiceTransportationWidgetSource r20, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.services_transportation_widget.interactor.b.a(com.avito.android.services_transportation_widget.item.ServiceTransportationWidgetItem, com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget$Field, com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget$FieldValue, com.avito.android.services_transportation_widget.interactor.ServiceTransportationWidgetSource, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
