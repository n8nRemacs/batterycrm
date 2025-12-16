package com.avito.android.advert.item.consultation;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.remote.model.advert_details.realty.ConsultationAfterIceBreaker;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SuperConsultationAfterIceBreakersItemBlueprint.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/consultation/P;", "LTV0/b;", "Lcom/avito/android/advert/item/consultation/A;", "Lcom/avito/android/advert/item/consultation/ConsultationAfterIceBreakersItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class P implements TV0.b<A, ConsultationAfterIceBreakersItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28111q f74687a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<S> f74688b = new g.a<>(R.layout.advert_details_consultation_after_icebreakers_super, a.f74689l);

    /* compiled from: SuperConsultationAfterIceBreakersItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert/item/consultation/S;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert/item/consultation/S;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<ViewGroup, View, S> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f74689l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final S invoke(ViewGroup viewGroup, View view) {
            return new S(view);
        }
    }

    @Inject
    public P(@Y61.k InterfaceC28111q interfaceC28111q) {
        this.f74687a = interfaceC28111q;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f74687a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<S> b() {
        return this.f74688b;
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
            if (consultationAfterIceBreakersItem.f74647f) {
                ConsultationAfterIceBreaker consultationAfterIceBreaker = consultationAfterIceBreakersItem.f74646e;
                if ((consultationAfterIceBreaker != null ? consultationAfterIceBreaker.getInfoV3() : null) == null) {
                    return true;
                }
            }
        }
        return false;
    }
}
