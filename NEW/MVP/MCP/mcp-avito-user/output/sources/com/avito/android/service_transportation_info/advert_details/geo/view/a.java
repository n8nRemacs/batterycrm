package com.avito.android.service_transportation_info.advert_details.geo.view;

import Y41.p;
import Y61.k;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.remote.model.text.FontStyleKt;
import com.avito.android.service_transportation_info.model.TransportationGeo;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServicesTransportationGeoRaw.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f279747a = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C22096n f279748b = new C22096n(176718900, C8314a.f279749l, false);

    /* compiled from: ServicesTransportationGeoRaw.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.service_transportation_info.advert_details.geo.view.a$a, reason: collision with other inner class name */
    public static final class C8314a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C8314a f279749l = new C8314a();

        public C8314a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                c.a(new TransportationGeo.Raw("География перевозок", new AttributedText("По всей России {{distance}}", Collections.singletonList(new FontAttribute("distance", "от 100 км", Collections.singletonList(new FontParameter.StyleParameter(FontStyleKt.BOLD)))), 0)), a13, 8);
            }
            return G0.f406611a;
        }
    }
}
