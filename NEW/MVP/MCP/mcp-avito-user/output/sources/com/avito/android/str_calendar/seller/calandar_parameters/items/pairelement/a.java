package com.avito.android.str_calendar.seller.calandar_parameters.items.pairelement;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.category_parameters.ParameterElement;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PairElementBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/items/pairelement/a;", "LTV0/b;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/items/pairelement/f;", "Lcom/avito/android/category_parameters/ParameterElement$x;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements TV0.b<f, ParameterElement.x> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f287235a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<g> f287236b = new g.a<>(R.layout.item_calendar_pair_element, C8622a.f287237l);

    /* compiled from: PairElementBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/str_calendar/seller/calandar_parameters/items/pairelement/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/str_calendar/seller/calandar_parameters/items/pairelement/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.str_calendar.seller.calandar_parameters.items.pairelement.a$a, reason: collision with other inner class name */
    public static final class C8622a extends N implements p<ViewGroup, View, g> {

        /* renamed from: l, reason: collision with root package name */
        public static final C8622a f287237l = new C8622a();

        public C8622a() {
            super(2);
        }

        @Override // Y41.p
        public final g invoke(ViewGroup viewGroup, View view) {
            return new g(view);
        }
    }

    @Inject
    public a(@k c cVar) {
        this.f287235a = cVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f287235a;
    }

    @Override // TV0.b
    @k
    public final g.a<g> b() {
        return this.f287236b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof ParameterElement.x;
    }
}
