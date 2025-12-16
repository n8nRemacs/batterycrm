package com.avito.android.publish.view;

import android.net.Uri;
import android.text.TextUtils;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deep_linking.x;
import com.avito.android.external_apps.deep_linking.ExternalAppLink;
import com.avito.android.items.ItemWithAdditionalButton;
import com.avito.android.publish.view.a;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.DateTimeParameter;
import com.avito.android.remote.model.category_parameters.IntParameter;
import com.avito.android.remote.model.category_parameters.LocationParameter;
import com.avito.android.remote.model.category_parameters.NumericParameter;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.PriceParameter;
import com.avito.android.remote.model.category_parameters.SubLocationParameter;
import com.avito.android.remote.model.category_parameters.base.CategoryParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.search.Theme;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: BasicParameterClickListener.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/view/b;", "Lcom/avito/android/publish/view/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final m f245630b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.details.j f245631c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final x f245632d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public a.b f245633e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public com.avito.android.details.a f245634f;

    @Inject
    public b(@Y61.k m mVar, @Y61.k com.avito.android.details.j jVar, @Y61.k x xVar) {
        this.f245630b = mVar;
        this.f245631c = jVar;
        this.f245632d = xVar;
    }

    public static ParameterSlot a(com.avito.android.details.a aVar, com.avito.conveyor_item.a aVar2) {
        ParametersTree parametersTreeWa;
        if (aVar == null || (parametersTreeWa = aVar.wa()) == null) {
            return null;
        }
        return parametersTreeWa.findParameter(aVar2.getF200606b());
    }

    @Override // com.avito.android.details.a
    @Y61.l
    public final CategoryParameters C0() {
        com.avito.android.details.a aVar = this.f245634f;
        if (aVar != null) {
            return aVar.C0();
        }
        return null;
    }

    @Override // com.avito.android.publish.view.a
    public final void F(@Y61.k com.avito.android.details.a aVar) {
        this.f245634f = aVar;
        this.f245631c.F(aVar);
    }

    @Override // com.avito.android.publish.view.a
    public final void G(@Y61.k com.avito.conveyor_item.a aVar) {
        Theme f117608m;
        if (aVar instanceof com.avito.android.items.e) {
            ((com.avito.android.items.e) aVar).o();
        }
        ParameterSlot parameterSlotA = a(this.f245634f, aVar);
        if (parameterSlotA == null) {
            return;
        }
        String resName = null;
        if (parameterSlotA instanceof CategoryParameter) {
            CategoryParameter categoryParameter = (CategoryParameter) parameterSlotA;
            if (categoryParameter instanceof EditableParameter) {
                ((EditableParameter) categoryParameter).setError(null);
            }
        }
        com.avito.android.category_parameters.g gVar = aVar instanceof com.avito.android.category_parameters.g ? (com.avito.android.category_parameters.g) aVar : null;
        if (gVar != null && (f117608m = gVar.getF117608m()) != null) {
            resName = f117608m.getResName();
        }
        boolean zC2 = C43066x.C(resName, Theme.AVITO_RE_23.getResName(), false);
        if (!(parameterSlotA instanceof AddressParameter)) {
            if (parameterSlotA instanceof LocationParameter ? true : parameterSlotA instanceof SubLocationParameter) {
                this.f245630b.a(aVar, (CategoryParameter) parameterSlotA);
                return;
            } else {
                this.f245631c.G(aVar);
                return;
            }
        }
        AddressParameter addressParameter = (AddressParameter) parameterSlotA;
        a.b bVar = this.f245633e;
        if (bVar != null) {
            bVar.g4(addressParameter, zC2);
        }
    }

    @Override // com.avito.android.publish.view.a
    public final void Q9(@Y61.k ItemWithAdditionalButton itemWithAdditionalButton) {
        ItemWithAdditionalButton.AdditionalButton f117488m = itemWithAdditionalButton.getF117488m();
        String str = f117488m != null ? f117488m.f173891c : null;
        DeepLink deepLinkE = str != null ? this.f245632d.e(Uri.parse(str)) : null;
        if (deepLinkE != null) {
            if (deepLinkE instanceof NoMatchLink) {
                a.b bVar = this.f245633e;
                if (bVar != null) {
                    bVar.K2(new ExternalAppLink(Uri.parse(str), null, 2, null), null);
                    return;
                }
                return;
            }
            a.b bVar2 = this.f245633e;
            if (bVar2 != null) {
                bVar2.K2(deepLinkE, null);
            }
        }
    }

    @Override // com.avito.android.publish.view.a
    public final void U7(@Y61.k ParameterElement.C29377e c29377e, @Y61.l Long l12) {
        DateTimeParameter.Value.Timestamp timestamp = l12 != null ? new DateTimeParameter.Value.Timestamp(l12.longValue()) : null;
        ParametersTree parametersTreeWa = wa();
        ParameterSlot parameterSlotFindParameter = parametersTreeWa != null ? parametersTreeWa.findParameter(c29377e.f117181b) : null;
        DateTimeParameter dateTimeParameter = parameterSlotFindParameter instanceof DateTimeParameter ? (DateTimeParameter) parameterSlotFindParameter : null;
        if (dateTimeParameter == null || L.f(dateTimeParameter.getValue(), timestamp)) {
            return;
        }
        dateTimeParameter.setValue(timestamp);
        dateTimeParameter.setError(null);
    }

    @Override // com.avito.android.publish.view.a
    public final void Z2(@Y61.k com.avito.android.items.d dVar, @Y61.k String str, boolean z12) {
        if (z12) {
            dVar.m(str);
            dVar.o();
        }
        ParameterSlot parameterSlotA = a(this.f245634f, dVar);
        if (parameterSlotA == null) {
            return;
        }
        if (parameterSlotA instanceof CharParameter) {
            EditableParameter editableParameter = (EditableParameter) parameterSlotA;
            if (L.f(editableParameter.getValue(), str)) {
                return;
            }
            editableParameter.setValue(str);
            editableParameter.setError(null);
            return;
        }
        try {
            if (parameterSlotA instanceof PriceParameter) {
                EditableParameter editableParameter2 = (EditableParameter) parameterSlotA;
                if (str.length() == 0) {
                    if (L.f(editableParameter2.getValue(), null)) {
                        return;
                    }
                    editableParameter2.setValue(null);
                    editableParameter2.setError(null);
                    return;
                }
                if (!TextUtils.isDigitsOnly(str)) {
                    str = ((PriceParameter) parameterSlotA).getValue();
                }
                if (L.f(editableParameter2.getValue(), str)) {
                    return;
                }
                editableParameter2.setValue(str);
                editableParameter2.setError(null);
                return;
            }
            if (parameterSlotA instanceof IntParameter) {
                EditableParameter editableParameter3 = (EditableParameter) parameterSlotA;
                if (str.length() == 0) {
                    if (L.f(editableParameter3.getValue(), null)) {
                        return;
                    }
                    editableParameter3.setValue(null);
                    editableParameter3.setError(null);
                    return;
                }
                Long lValueOf = Long.valueOf(Long.parseLong(str));
                if (L.f(editableParameter3.getValue(), lValueOf)) {
                    return;
                }
                editableParameter3.setValue(lValueOf);
                editableParameter3.setError(null);
                return;
            }
            if (parameterSlotA instanceof NumericParameter) {
                EditableParameter editableParameter4 = (EditableParameter) parameterSlotA;
                if (str.length() == 0) {
                    if (L.f(editableParameter4.getValue(), null)) {
                        return;
                    }
                    editableParameter4.setValue(null);
                    editableParameter4.setError(null);
                    return;
                }
                Double dValueOf = Double.valueOf(Double.parseDouble(str));
                if (L.f(editableParameter4.getValue(), dValueOf)) {
                    return;
                }
                editableParameter4.setValue(dValueOf);
                editableParameter4.setError(null);
            }
        } catch (NumberFormatException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cf  */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.avito.android.remote.model.category_parameters.DateTimeParameter$Value$Timestamp] */
    @Override // com.avito.android.publish.view.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void be(@Y61.k com.avito.android.category_parameters.ParameterElement.C29376d r4, @Y61.k com.avito.android.category_parameters.ParameterElement.C29377e r5, @Y61.l java.lang.Long r6, boolean r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.view.b.be(com.avito.android.category_parameters.ParameterElement$d, com.avito.android.category_parameters.ParameterElement$e, java.lang.Long, boolean, boolean):void");
    }

    @Override // com.avito.android.publish.view.a
    public final void c0() {
        this.f245633e = null;
        this.f245630b.c0();
        this.f245631c.c0();
    }

    @Override // com.avito.android.publish.view.a
    public final void e(@Y61.k a.b bVar) {
        this.f245633e = bVar;
        this.f245630b.e(bVar);
        this.f245631c.e(bVar);
    }

    @Override // com.avito.android.details.e
    @Y61.l
    public final ParametersTree wa() {
        com.avito.android.details.a aVar = this.f245634f;
        if (aVar != null) {
            return aVar.wa();
        }
        return null;
    }
}
