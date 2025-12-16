package com.avito.android.advert.item.consultation;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ConsultationAfterIceBreakersItemBlueprint.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/consultation/o;", "LTV0/b;", "Lcom/avito/android/advert/item/consultation/A;", "Lcom/avito/android/advert/item/consultation/ConsultationAfterIceBreakersItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.consultation.o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28109o implements TV0.b<A, ConsultationAfterIceBreakersItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28111q f74788a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<D> f74789b = new g.a<>(R.layout.advert_details_consultation_after_icebreakers, a.f74790l);

    /* compiled from: ConsultationAfterIceBreakersItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert/item/consultation/D;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert/item/consultation/D;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.consultation.o$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<ViewGroup, View, D> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f74790l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final D invoke(ViewGroup viewGroup, View view) {
            return new D(view);
        }
    }

    @Inject
    public C28109o(@Y61.k InterfaceC28111q interfaceC28111q) {
        this.f74788a = interfaceC28111q;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f74788a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<D> b() {
        return this.f74789b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof ConsultationAfterIceBreakersItem) {
            ConsultationAfterIceBreakersItem consultationAfterIceBreakersItem = (ConsultationAfterIceBreakersItem) aVar;
            if (!consultationAfterIceBreakersItem.f74647f && !consultationAfterIceBreakersItem.f74648g) {
                return true;
            }
        }
        return false;
    }
}
