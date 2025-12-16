package com.avito.android.str_calendar.seller.calandar_parameters.items.chips;

import Gy0.InterfaceC13931a;
import JO.m;
import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.auction.details.i;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.chips.SelectStrategy;
import com.avito.android.remote.model.category_parameters.CustomPaddings;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.str_calendar.seller.calandar_parameters.C35100k;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ChipsSelectItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/items/chips/c;", "LTV0/f;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/items/chips/f;", "Lcom/avito/android/category_parameters/ParameterElement$C$b;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements TV0.f<f, ParameterElement.C.b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC13931a, G0> f287098b;

    /* compiled from: ChipsSelectItemPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f287099a;

        static {
            int[] iArr = new int[ParameterElement.DisplayType.Chips.Style.values().length];
            try {
                ParameterElement.DisplayType.Chips.Style style = ParameterElement.DisplayType.Chips.Style.f117248b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ParameterElement.DisplayType.Chips.Style style2 = ParameterElement.DisplayType.Chips.Style.f117248b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ParameterElement.DisplayType.Chips.Style style3 = ParameterElement.DisplayType.Chips.Style.f117248b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ParameterElement.DisplayType.Chips.Style style4 = ParameterElement.DisplayType.Chips.Style.f117248b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f287099a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public c(@k l<? super InterfaceC13931a, G0> lVar) {
        this.f287098b = lVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((f) eVar, (ParameterElement.C.b) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        f fVar = (f) eVar;
        ParameterElement.C.b bVar = (ParameterElement.C.b) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof C35100k) {
                obj = obj2;
            }
        }
        C35100k c35100k = (C35100k) (obj instanceof C35100k ? obj : null);
        if (c35100k == null) {
            k(fVar, bVar);
        } else {
            fVar.setError(c35100k.f287306a);
        }
    }

    public final void k(@k f fVar, @k ParameterElement.C.b bVar) {
        CustomPaddings customPaddings;
        fVar.setTitle(bVar.f117208d);
        fVar.setError(bVar.f117214j);
        AttributedText attributedText = bVar.f117209e;
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link.e(this, 25));
            attributedText.setOnUrlClickListener(new i(this, 14));
        } else {
            attributedText = null;
        }
        fVar.k(attributedText);
        fVar.Sb(bVar.f117236E, bVar.f117212h, new d(bVar, this));
        m mVar = bVar.f117212h;
        if (mVar != null) {
            fVar.E50(mVar);
        }
        fVar.r3(SelectStrategy.f178716b);
        fVar.i2(true);
        SelectParameter.Displaying displaying = bVar.f117223s;
        if (displaying != null && (customPaddings = displaying.getCustomPaddings()) != null) {
            fVar.jr(customPaddings);
        }
        ParameterElement.DisplayType displayType = bVar.f117213i;
        ParameterElement.DisplayType.Chips chips = displayType instanceof ParameterElement.DisplayType.Chips ? (ParameterElement.DisplayType.Chips) displayType : null;
        ParameterElement.DisplayType.Chips.Style style = chips != null ? chips.f117247b : null;
        int i12 = style == null ? -1 : a.f287099a[style.ordinal()];
        fVar.DA(i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? Chips.DisplayType.f178701b : Chips.DisplayType.f178704e : Chips.DisplayType.f178703d : Chips.DisplayType.f178702c : Chips.DisplayType.f178701b);
    }
}
