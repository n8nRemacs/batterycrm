package com.avito.android.photo_list_view.blueprints;

import com.avito.android.Q1;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.image.enhancement.C30979j;
import com.avito.android.image.enhancement.InterfaceC30978i;
import com.avito.android.items.ItemWithState;
import com.avito.android.photo_list_view.G;
import com.avito.android.photo_list_view.s;
import com.avito.android.remote.model.category_parameters.slot.images_enhancement.ImagesEnhancementSlotConfig;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.InterfaceC35807h4;
import com.avito.android.util.T3;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import io.reactivex.rxjava3.internal.operators.observable.U;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import l41.InterfaceC43543a;

/* compiled from: MultiStatePhotoItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/blueprints/k;", "Lcom/avito/android/photo_list_view/blueprints/c;", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final s f218138b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f218139c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35807h4 f218140d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Q1 f218141e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final InterfaceC30978i f218142f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f218143g = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e<Boolean> f218144h = new io.reactivex.rxjava3.subjects.e<>();

    public k(@Y61.k s sVar, @Y61.k com.avito.android.util.text.a aVar, @Y61.k InterfaceC35807h4 interfaceC35807h4, @Y61.k Q1 q12, @Y61.l InterfaceC30978i interfaceC30978i) {
        this.f218138b = sVar;
        this.f218139c = aVar;
        this.f218140d = interfaceC35807h4;
        this.f218141e = q12;
        this.f218142f = interfaceC30978i;
    }

    @Override // com.avito.android.photo_list_view.blueprints.c
    @Y61.k
    public final z<C30979j.a> B0() {
        InterfaceC30978i interfaceC30978i = this.f218142f;
        return interfaceC30978i != null ? interfaceC30978i.B0() : U.f403867b;
    }

    @Override // com.avito.android.photo_list_view.blueprints.c
    @Y61.k
    /* renamed from: D6, reason: from getter */
    public final io.reactivex.rxjava3.subjects.e getF218144h() {
        return this.f218144h;
    }

    public final void O(l lVar, ParameterElement.y yVar) {
        ItemWithState.State state = yVar.f117605j;
        CharSequence charSequenceB = null;
        if (state instanceof ItemWithState.State.Normal) {
            CharSequence charSequence = ((ItemWithState.State.Normal) state).f173899b;
            if (charSequence == null) {
                AttributedText attributedText = yVar.f117606k;
                if (attributedText != null) {
                    charSequenceB = this.f218139c.b(attributedText);
                }
            } else {
                charSequenceB = charSequence;
            }
            lVar.u(charSequenceB);
        } else if (state instanceof ItemWithState.State.Warning) {
            lVar.H(((ItemWithState.State.Warning) state).f173900b);
        } else if (state instanceof ItemWithState.State.Error.ErrorWithMessage) {
            lVar.H(((ItemWithState.State.Error.ErrorWithMessage) state).f173897b);
        } else if (state instanceof ItemWithState.State.Error.ErrorWithoutMessage) {
            lVar.H(null);
        }
        this.f218138b.p(yVar.f117605j instanceof ItemWithState.State.Error);
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((l) eVar, (ParameterElement.y) aVar);
    }

    @Override // com.avito.android.photo_list_view.blueprints.c
    @Y61.k
    public final z<String> X6() {
        InterfaceC30978i interfaceC30978i = this.f218142f;
        return interfaceC30978i != null ? interfaceC30978i.w() : U.f403867b;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        l lVar = (l) eVar;
        ParameterElement.y yVar = (ParameterElement.y) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof T3) {
                obj = obj2;
            }
        }
        T3 t32 = (T3) (obj instanceof T3 ? obj : null);
        if (t32 == null) {
            k(lVar, yVar);
            return;
        }
        if (t32.f318741a) {
            O(lVar, yVar);
        }
        if (t32.f318742b) {
            this.f218138b.c(yVar.f117602g);
        }
    }

    public final void k(@Y61.k l lVar, @Y61.k ParameterElement.y yVar) {
        String title;
        ImagesEnhancementSlotConfig.MainToggle mainToggle;
        InterfaceC30978i interfaceC30978i;
        io.reactivex.rxjava3.disposables.c cVar = this.f218143g;
        cVar.e();
        boolean z12 = yVar.f117604i;
        s sVar = this.f218138b;
        sVar.x(z12);
        boolean zBooleanValue = this.f218141e.w().invoke().booleanValue();
        boolean z13 = yVar.f117607l;
        String str = yVar.f117599d;
        if (zBooleanValue) {
            lVar.setTitle(this.f218140d.a(str, z13, yVar.f117609n));
        } else {
            if (z13) {
                str = null;
            }
            lVar.setTitle(str);
        }
        lVar.T(yVar.f117600e);
        O(lVar, yVar);
        sVar.c(yVar.f117602g);
        lVar.B2(sVar);
        lVar.d(new d(this));
        ImagesEnhancementSlotConfig imagesEnhancementSlotConfig = yVar.f117603h;
        if (imagesEnhancementSlotConfig != null && (interfaceC30978i = this.f218142f) != null) {
            interfaceC30978i.I0(imagesEnhancementSlotConfig);
            interfaceC30978i.E0();
            I0 state = interfaceC30978i.getState();
            e eVar = new e(this, lVar, yVar);
            l41.g<? super Throwable> gVar = f.f218133b;
            InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
            cVar.b(state.v0(eVar, gVar, interfaceC43543a));
            cVar.b(interfaceC30978i.G0().v0(new g(this, lVar), h.f218136b, interfaceC43543a));
            cVar.b(A1.h(interfaceC30978i.getError(), null, new i(1, lVar, l.class, "showErrorToast", "showErrorToast(Lcom/avito/android/printable_text/PrintableText;)V", 0), 3));
        }
        boolean z14 = imagesEnhancementSlotConfig != null;
        if (imagesEnhancementSlotConfig == null || (mainToggle = imagesEnhancementSlotConfig.getMainToggle()) == null || (title = mainToggle.getTitle()) == null) {
            title = "";
        }
        lVar.kX(title, z14);
        String title2 = imagesEnhancementSlotConfig != null ? imagesEnhancementSlotConfig.getTitle() : null;
        if (title2 == null || C43066x.K(title2)) {
            return;
        }
        lVar.setTitle(imagesEnhancementSlotConfig != null ? imagesEnhancementSlotConfig.getTitle() : null);
    }

    @Override // com.avito.android.photo_list_view.blueprints.c
    @Y61.k
    public final z<G> n7() {
        return this.f218138b.w();
    }
}
