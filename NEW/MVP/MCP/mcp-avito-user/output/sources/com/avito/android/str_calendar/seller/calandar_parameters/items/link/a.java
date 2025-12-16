package com.avito.android.str_calendar.seller.calandar_parameters.items.link;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.str_calendar.seller.calandar_parameters.items.dialog.f;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LinkFormItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/items/link/a;", "LTV0/b;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/items/dialog/f;", "Lcom/avito/android/category_parameters/ParameterElement$C$b;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements TV0.b<f, ParameterElement.C.b> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f287225a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f287226b = new g.a<>(R.layout.item_calendar_dialog_form, C8621a.f287227l);

    /* compiled from: LinkFormItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/konveyor/adapter/b;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/konveyor/adapter/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.str_calendar.seller.calandar_parameters.items.link.a$a, reason: collision with other inner class name */
    public static final class C8621a extends N implements p<ViewGroup, View, com.avito.konveyor.adapter.b> {

        /* renamed from: l, reason: collision with root package name */
        public static final C8621a f287227l = new C8621a();

        public C8621a() {
            super(2);
        }

        @Override // Y41.p
        public final com.avito.konveyor.adapter.b invoke(ViewGroup viewGroup, View view) {
            return new com.avito.android.str_calendar.seller.calandar_parameters.items.dialog.g(view);
        }
    }

    @Inject
    public a(@k d dVar) {
        this.f287225a = dVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f287225a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f287226b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return (aVar instanceof ParameterElement.C.b) && (((ParameterElement.C.b) aVar).f117213i instanceof ParameterElement.DisplayType.l);
    }
}
