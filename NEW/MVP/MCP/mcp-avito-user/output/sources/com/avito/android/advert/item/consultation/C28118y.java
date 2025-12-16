package com.avito.android.advert.item.consultation;

import androidx.view.InterfaceC23040h0;
import com.avito.android.advert.item.InterfaceC28130g0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.developments_advice.remote.model.ContactInfoResponse;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.advert_details.realty.ConsultationAfterIceBreaker;
import com.avito.android.remote.model.advert_details.realty.ConsultationButton;
import com.avito.android.remote.model.advert_details.realty.SuperFormInfo;
import com.avito.android.remote.model.advert_details.realty.SuperFormV4;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.P2;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ConsultationAfterIceBreakersItemPresenter.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/consultation/y;", "Lcom/avito/android/advert/item/consultation/q;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.consultation.y, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28118y implements InterfaceC28111q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.consultation.view_model.a f74850b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.x f74851c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.advert.l f74852d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public A f74853e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public InterfaceC28130g0 f74854f;

    /* compiled from: ConsultationAfterIceBreakersItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/developments_advice/remote/model/ContactInfoResponse;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.consultation.y$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<P2<? super ContactInfoResponse>, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(P2<? super ContactInfoResponse> p22) {
            P2<? super ContactInfoResponse> p23 = p22;
            A a12 = C28118y.this.f74853e;
            if (a12 != null) {
                a12.p5(p23);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ConsultationAfterIceBreakersItemPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.consultation.y$b */
    public static final class b implements InterfaceC23040h0, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f74856b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l lVar) {
            this.f74856b = (kotlin.jvm.internal.N) lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof kotlin.jvm.internal.D)) {
                return this.f74856b.equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f74856b;
        }

        public final int hashCode() {
            return this.f74856b.hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f74856b.invoke(obj);
        }
    }

    @Inject
    public C28118y(@Y61.k com.avito.android.advert.item.consultation.view_model.a aVar, @Y61.k com.avito.android.deep_linking.x xVar, @Y61.k com.avito.android.advert_core.advert.l lVar) {
        this.f74850b = aVar;
        this.f74851c = xVar;
        this.f74852d = lVar;
    }

    @Override // com.avito.android.advert.item.consultation.InterfaceC28111q
    public final void M() {
        this.f74850b.j5().observe(this.f74852d.e(), new b(new a()));
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        DeepLink entryPointShowEvent;
        InterfaceC28130g0 interfaceC28130g0;
        AttributedText disclaimer;
        ButtonAction button;
        SuperFormV4 infoV4;
        ConsultationButton button2;
        String title;
        SuperFormV4 infoV42;
        A a12 = (A) eVar;
        ConsultationAfterIceBreakersItem consultationAfterIceBreakersItem = (ConsultationAfterIceBreakersItem) aVar;
        this.f74853e = a12;
        com.avito.android.advert.item.consultation.view_model.a aVar2 = this.f74850b;
        aVar2.j5().observe(this.f74852d.e(), new b(new r(consultationAfterIceBreakersItem, this)));
        ConsultationAfterIceBreaker consultationAfterIceBreaker = consultationAfterIceBreakersItem.f74646e;
        String title2 = null;
        if ((consultationAfterIceBreaker != null ? consultationAfterIceBreaker.getInfoV4() : null) != null) {
            a12.kS(consultationAfterIceBreaker.getInfoV4(), new C28112s(consultationAfterIceBreakersItem, this));
            SuperFormV4 infoV43 = consultationAfterIceBreaker.getInfoV4();
            a12.ut(infoV43 != null ? infoV43.getLanding() : null, new C28113t(consultationAfterIceBreakersItem, this));
        } else {
            if ((consultationAfterIceBreaker != null ? consultationAfterIceBreaker.getInfoV3() : null) != null) {
                a12.oW(consultationAfterIceBreaker.getInfoV3(), new C28114u(consultationAfterIceBreakersItem, this));
                SuperFormInfo infoV3 = consultationAfterIceBreaker.getInfoV3();
                if (infoV3 != null && (entryPointShowEvent = infoV3.getEntryPointShowEvent()) != null && (interfaceC28130g0 = this.f74854f) != null) {
                    interfaceC28130g0.t(entryPointShowEvent);
                }
                SuperFormInfo infoV32 = consultationAfterIceBreaker.getInfoV3();
                a12.R9(infoV32 != null ? infoV32.getLanding() : null, new C28115v(this));
            } else {
                a12.mi(consultationAfterIceBreaker != null ? consultationAfterIceBreaker.getInfo() : null, new C28116w(consultationAfterIceBreakersItem, this));
            }
        }
        a12.b(consultationAfterIceBreaker != null ? consultationAfterIceBreaker.getTitle() : null);
        a12.j(consultationAfterIceBreaker != null ? consultationAfterIceBreaker.getDescription() : null);
        if (consultationAfterIceBreaker == null || (infoV42 = consultationAfterIceBreaker.getInfoV4()) == null || (disclaimer = infoV42.getDisclaimer()) == null) {
            disclaimer = consultationAfterIceBreaker != null ? consultationAfterIceBreaker.getDisclaimer() : null;
        }
        a12.C4(disclaimer);
        if (consultationAfterIceBreaker != null && (infoV4 = consultationAfterIceBreaker.getInfoV4()) != null && (button2 = infoV4.getButton()) != null && (title = button2.getTitle()) != null) {
            title2 = title;
        } else if (consultationAfterIceBreaker != null && (button = consultationAfterIceBreaker.getButton()) != null) {
            title2 = button.getTitle();
        }
        a12.JQ(title2, new C28117x(consultationAfterIceBreakersItem, this));
        aVar2.o(consultationAfterIceBreakersItem.f74647f);
    }

    @Override // com.avito.android.advert.item.consultation.InterfaceC28111q
    public final void s(@Y61.k InterfaceC28130g0 interfaceC28130g0) {
        this.f74854f = interfaceC28130g0;
    }
}
