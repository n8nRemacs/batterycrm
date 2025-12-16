package com.avito.android.details;

import JO.m;
import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.details.b;
import com.avito.android.remote.model.District;
import com.avito.android.remote.model.Metro;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.Sublocation;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.DistrictParameter;
import com.avito.android.remote.model.category_parameters.IntParameter;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import com.avito.android.remote.model.category_parameters.MultiGeoParameter;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.PublishMethodWithAllSelectedValueParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.SubLocationParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.HasError;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.select.Arguments;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.inject.Inject;
import kl0.C42711b;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ItemDetailsSelectResultHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/details/c;", "Lcom/avito/android/details/b;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Q1 f135898b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public com.avito.android.publish.details.parameters_filter.c f135899c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public e f135900d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public a f135901e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public b.InterfaceC4110b f135902f;

    @Inject
    public c(@Y61.k Q1 q12) {
        this.f135898b = q12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String b(ParameterSlot parameterSlot, List list) {
        String id2;
        Object next;
        String id3;
        SelectParameter.Widget.Config config;
        List<ParameterSlot> parameters;
        ParcelableEntity parcelableEntity = (ParcelableEntity) C42745f0.G(list);
        String id4 = null;
        String str = parcelableEntity != null ? (String) parcelableEntity.getId() : null;
        String title = parcelableEntity != null ? parcelableEntity.getTitle() : null;
        if (parameterSlot instanceof SelectParameter) {
            SelectParameter selectParameter = (SelectParameter) parameterSlot;
            if (L.f(selectParameter.getValue(), str)) {
                SelectParameter.Displaying displaying = selectParameter.getDisplaying();
                if (!L.f(displaying != null ? displaying.getType() : null, "switcher")) {
                    return null;
                }
            }
            selectParameter.setError(null);
            Boolean updatesForm = selectParameter.getUpdatesForm();
            Boolean bool = Boolean.TRUE;
            if (L.f(updatesForm, bool) || L.f(selectParameter.getUpdatesObjectForm(), bool)) {
                SelectParameter.Widget widget = selectParameter.getWidget();
                String emptyValueId = (widget == null || (config = widget.getConfig()) == null) ? null : config.getEmptyValueId();
                selectParameter.setChosenValue((!selectParameter.getHasSuggest() || str == null || str.length() == 0 || title == null || title.length() == 0) ? str != null ? new SelectParameter.UserChosenValue.ValueId(str) : emptyValueId != null ? new SelectParameter.UserChosenValue.ValueId(emptyValueId) : SelectParameter.UserChosenValue.ClearValue.INSTANCE : new SelectParameter.UserChosenValue.SuggestedValue(str, title));
                id3 = selectParameter.getId();
            } else {
                selectParameter.setValue(str);
                selectParameter.setDisplayTitle(parcelableEntity != null ? parcelableEntity.getTitle() : null);
                id3 = null;
            }
            SelectParameter.Value chosenOrCurrentSelectedValue = selectParameter.getChosenOrCurrentSelectedValue();
            if (chosenOrCurrentSelectedValue != null && (parameters = chosenOrCurrentSelectedValue.getParameters()) != null) {
                for (ParameterSlot parameterSlot2 : parameters) {
                    if (parameterSlot2 instanceof EditableParameter) {
                        ((EditableParameter) parameterSlot2).setError(null);
                    }
                }
            }
            return id3;
        }
        if (parameterSlot instanceof SubLocationParameter) {
            SubLocationParameter subLocationParameter = (SubLocationParameter) parameterSlot;
            Iterator<T> it = subLocationParameter.getValues().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (L.f(((Sublocation) next).getId(), str)) {
                    break;
                }
            }
            subLocationParameter.setValue((Sublocation) next);
            subLocationParameter.setError(null);
            return null;
        }
        if (parameterSlot instanceof MultiselectParameter) {
            MultiselectParameter multiselectParameter = (MultiselectParameter) parameterSlot;
            Boolean updatesForm2 = multiselectParameter.getUpdatesForm();
            Boolean bool2 = Boolean.TRUE;
            if (L.f(updatesForm2, bool2) || L.f(multiselectParameter.getUpdatesObjectForm(), bool2)) {
                id4 = multiselectParameter.getId();
                multiselectParameter.setOldValue(multiselectParameter.getValue());
            }
            List list2 = list;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add((String) ((ParcelableEntity) it2.next()).getId());
            }
            multiselectParameter.setValue(arrayList);
            return id4;
        }
        if (parameterSlot instanceof MetroParameter) {
            MetroParameter metroParameter = (MetroParameter) parameterSlot;
            if (L.f(metroParameter.getUpdatesForm(), Boolean.TRUE)) {
                id2 = metroParameter.getId();
                metroParameter.setOldValue(metroParameter.getValue());
            } else {
                id2 = null;
            }
            EditableParameter editableParameter = (EditableParameter) parameterSlot;
            List<ParcelableEntity> list3 = list;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list3, 10));
            for (ParcelableEntity parcelableEntity2 : list3) {
                String str2 = (String) parcelableEntity2.getId();
                String title2 = parcelableEntity2.getTitle();
                if (title2 == null) {
                    title2 = "";
                }
                arrayList2.add(new Metro(str2, title2, null));
            }
            if (!L.f(editableParameter.getValue(), arrayList2)) {
                editableParameter.setValue(arrayList2);
                editableParameter.setError(null);
            }
        } else {
            if (!(parameterSlot instanceof DistrictParameter)) {
                return null;
            }
            DistrictParameter districtParameter = (DistrictParameter) parameterSlot;
            if (L.f(districtParameter.getUpdatesForm(), Boolean.TRUE)) {
                id2 = districtParameter.getId();
                districtParameter.setOldValue(districtParameter.getValue());
            } else {
                id2 = null;
            }
            EditableParameter editableParameter2 = (EditableParameter) parameterSlot;
            List<ParcelableEntity> list4 = list;
            ArrayList arrayList3 = new ArrayList(C42745f0.q(list4, 10));
            for (ParcelableEntity parcelableEntity3 : list4) {
                String str3 = (String) parcelableEntity3.getId();
                String title3 = parcelableEntity3.getTitle();
                arrayList3.add(new District(str3, title3 == null ? "" : title3, null, null, 8, null));
            }
            if (!L.f(editableParameter2.getValue(), arrayList3)) {
                editableParameter2.setValue(arrayList3);
                editableParameter2.setError(null);
            }
        }
        return id2;
    }

    @Override // com.avito.android.details.b
    public final void D4() {
        ParametersTree parametersTreeWa;
        e eVar = this.f135900d;
        if (eVar == null || (parametersTreeWa = eVar.wa()) == null) {
            return;
        }
        EditableParameter editableParameter = (EditableParameter) parametersTreeWa.getFirstParameterOfType(AddressParameter.class);
        if (editableParameter != null && !L.f(editableParameter.getValue(), null)) {
            editableParameter.setValue(null);
            editableParameter.setError(null);
        }
        b.InterfaceC4110b interfaceC4110b = this.f135902f;
        if (interfaceC4110b != null) {
            interfaceC4110b.c3(editableParameter, editableParameter != null ? editableParameter.getId() : null);
        }
        b.InterfaceC4110b interfaceC4110b2 = this.f135902f;
        if (interfaceC4110b2 != null) {
            interfaceC4110b2.h5(editableParameter != null ? editableParameter.getId() : null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    @Override // com.avito.android.details.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(@Y61.l com.avito.android.remote.model.category_parameters.AddressParameter.Value r6, @Y61.l java.lang.String r7) {
        /*
            r5 = this;
            com.avito.android.details.e r0 = r5.f135900d
            r1 = 0
            if (r0 == 0) goto La
            com.avito.android.remote.model.category_parameters.ParametersTree r0 = r0.wa()
            goto Lb
        La:
            r0 = r1
        Lb:
            com.avito.android.Q1 r2 = r5.f135898b
            r2.getClass()
            kotlin.reflect.n<java.lang.Object>[] r3 = com.avito.android.Q1.f67448x0
            r4 = 38
            r3 = r3[r4]
            com.avito.android.A0$a r2 = r2.f67460L
            DE0.a r2 = r2.a()
            java.lang.Object r2 = r2.invoke()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.lang.Class<com.avito.android.remote.model.category_parameters.AddressParameter> r3 = com.avito.android.remote.model.category_parameters.AddressParameter.class
            if (r2 == 0) goto L49
            if (r7 == 0) goto L3e
            if (r0 == 0) goto L33
            com.avito.android.remote.model.category_parameters.base.ParameterSlot r7 = r0.findParameter(r7)
            goto L34
        L33:
            r7 = r1
        L34:
            boolean r2 = r7 instanceof com.avito.android.remote.model.category_parameters.AddressParameter
            if (r2 == 0) goto L3b
            com.avito.android.remote.model.category_parameters.AddressParameter r7 = (com.avito.android.remote.model.category_parameters.AddressParameter) r7
            goto L3c
        L3b:
            r7 = r1
        L3c:
            if (r7 != 0) goto L51
        L3e:
            if (r0 == 0) goto L47
            com.avito.android.remote.model.category_parameters.base.ParameterSlot r7 = r0.getFirstParameterOfType(r3)
            com.avito.android.remote.model.category_parameters.AddressParameter r7 = (com.avito.android.remote.model.category_parameters.AddressParameter) r7
            goto L51
        L47:
            r7 = r1
            goto L51
        L49:
            if (r0 == 0) goto L47
            com.avito.android.remote.model.category_parameters.base.ParameterSlot r7 = r0.getFirstParameterOfType(r3)
            com.avito.android.remote.model.category_parameters.AddressParameter r7 = (com.avito.android.remote.model.category_parameters.AddressParameter) r7
        L51:
            if (r0 == 0) goto Lab
            if (r7 == 0) goto Lab
            java.lang.Object r0 = r7.getValue()
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto La4
            java.lang.Object r0 = r7.getValue()
            boolean r0 = kotlin.jvm.internal.L.f(r0, r6)
            if (r0 != 0) goto L6f
            r7.setValue(r6)
            r7.setError(r1)
        L6f:
            java.lang.Boolean r6 = r7.getUpdatesForm()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r6 = kotlin.jvm.internal.L.f(r6, r0)
            if (r6 == 0) goto L88
            com.avito.android.details.b$b r6 = r5.f135902f
            if (r6 == 0) goto L8f
            java.lang.String r0 = r7.getId()
            r2 = 2
            com.avito.android.details.b.InterfaceC4110b.a.a(r6, r0, r2)
            goto L8f
        L88:
            com.avito.android.details.b$b r6 = r5.f135902f
            if (r6 == 0) goto L8f
            r6.C5(r7)
        L8f:
            java.lang.Object r6 = r7.getValue()
            com.avito.android.remote.model.category_parameters.AddressParameter$Value r6 = (com.avito.android.remote.model.category_parameters.AddressParameter.Value) r6
            if (r6 == 0) goto La4
            java.lang.String r6 = r6.getJsonWebToken()
            if (r6 == 0) goto La4
            com.avito.android.details.b$b r7 = r5.f135902f
            if (r7 == 0) goto La4
            r7.I9(r6)
        La4:
            com.avito.android.details.b$b r6 = r5.f135902f
            if (r6 == 0) goto Lab
            r6.h5(r1)
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.details.c.E(com.avito.android.remote.model.category_parameters.AddressParameter$Value, java.lang.String):void");
    }

    @Override // com.avito.android.select.p
    @Y61.l
    public final InterfaceC19588c<? super InterfaceC19587b> E4(@Y61.k Arguments arguments) {
        com.avito.android.publish.details.parameters_filter.c cVar = this.f135899c;
        if (cVar != null) {
            return cVar.a(arguments);
        }
        return null;
    }

    @Override // com.avito.android.details.b
    public final void F4(@Y61.l AddressParameter.Value value) {
        String jsonWebToken;
        b.InterfaceC4110b interfaceC4110b;
        e eVar = this.f135900d;
        ParametersTree parametersTreeWa = eVar != null ? eVar.wa() : null;
        AddressParameter addressParameter = parametersTreeWa != null ? (AddressParameter) parametersTreeWa.getFirstParameterOfType(AddressParameter.class) : null;
        if (parametersTreeWa == null || addressParameter == null) {
            return;
        }
        if (!value.equals(addressParameter.getValue())) {
            if (!L.f(addressParameter.getValue(), value)) {
                addressParameter.setValue(value);
                addressParameter.setError(null);
            }
            if (L.f(addressParameter.getUpdatesForm(), Boolean.TRUE)) {
                b.InterfaceC4110b interfaceC4110b2 = this.f135902f;
                if (interfaceC4110b2 != null) {
                    b.InterfaceC4110b.a.a(interfaceC4110b2, addressParameter.getId(), 2);
                }
            } else {
                b.InterfaceC4110b interfaceC4110b3 = this.f135902f;
                if (interfaceC4110b3 != null) {
                    interfaceC4110b3.C5(addressParameter);
                }
            }
            AddressParameter.Value value2 = addressParameter.getValue();
            if (value2 != null && (jsonWebToken = value2.getJsonWebToken()) != null && (interfaceC4110b = this.f135902f) != null) {
                interfaceC4110b.I9(jsonWebToken);
            }
        }
        b.InterfaceC4110b interfaceC4110b4 = this.f135902f;
        if (interfaceC4110b4 != null) {
            interfaceC4110b4.h5(null);
        }
    }

    @Override // com.avito.android.details.b
    public final void I(@Y61.k e eVar) {
        this.f135901e = null;
        this.f135900d = eVar;
        if (eVar instanceof a) {
            this.f135901e = (a) eVar;
        }
    }

    @Override // com.avito.android.details.b
    public final void J(@Y61.l String str) {
        ParametersTree parametersTreeWa;
        e eVar = this.f135900d;
        if (eVar == null || (parametersTreeWa = eVar.wa()) == null) {
            return;
        }
        ParameterSlot firstParameterOfType = parametersTreeWa.getFirstParameterOfType(MultiGeoParameter.class);
        if (firstParameterOfType == null) {
            for (ParameterSlot parameterSlot : parametersTreeWa) {
                if (parameterSlot instanceof CharParameter) {
                    CharParameter.Widget widget = ((CharParameter) parameterSlot).getWidget();
                    if (L.f(widget != null ? widget.getType() : null, "job_multi_geo")) {
                        firstParameterOfType = parameterSlot;
                    }
                }
            }
        }
        if (firstParameterOfType == null) {
            return;
        }
        EditableParameter editableParameter = (EditableParameter) firstParameterOfType;
        if (!L.f(editableParameter.getValue(), str)) {
            editableParameter.setValue(str);
            editableParameter.setError(null);
        }
        if (L.f(editableParameter.getUpdatesForm(), Boolean.TRUE)) {
            b.InterfaceC4110b interfaceC4110b = this.f135902f;
            if (interfaceC4110b != null) {
                b.InterfaceC4110b.a.a(interfaceC4110b, editableParameter.getId(), 2);
            }
        } else {
            b.InterfaceC4110b interfaceC4110b2 = this.f135902f;
            if (interfaceC4110b2 != null) {
                interfaceC4110b2.n9();
            }
        }
        b.InterfaceC4110b interfaceC4110b3 = this.f135902f;
        if (interfaceC4110b3 != null) {
            interfaceC4110b3.h5(null);
        }
    }

    @Override // com.avito.android.details.b
    public final void L(@Y61.l String str) {
        ParametersTree parametersTreeWa;
        PublishMethodWithAllSelectedValueParameter publishMethodWithAllSelectedValueParameter;
        b.InterfaceC4110b interfaceC4110b;
        e eVar = this.f135900d;
        if (eVar == null || (parametersTreeWa = eVar.wa()) == null || (publishMethodWithAllSelectedValueParameter = (PublishMethodWithAllSelectedValueParameter) parametersTreeWa.getFirstParameterOfType(PublishMethodWithAllSelectedValueParameter.class)) == null) {
            return;
        }
        if (!L.f(publishMethodWithAllSelectedValueParameter.getValue(), str)) {
            publishMethodWithAllSelectedValueParameter.setValue(str);
            publishMethodWithAllSelectedValueParameter.setError(null);
        }
        if (L.f(publishMethodWithAllSelectedValueParameter.getUpdatesForm(), Boolean.TRUE) && (interfaceC4110b = this.f135902f) != null) {
            b.InterfaceC4110b.a.a(interfaceC4110b, publishMethodWithAllSelectedValueParameter.getId(), 2);
        }
        b.InterfaceC4110b interfaceC4110b2 = this.f135902f;
        if (interfaceC4110b2 != null) {
            interfaceC4110b2.N7(publishMethodWithAllSelectedValueParameter);
        }
    }

    @Override // com.avito.android.details.b
    public final void L3(@Y61.k b.InterfaceC4110b interfaceC4110b) {
        this.f135902f = interfaceC4110b;
    }

    @Override // com.avito.android.details.b
    public final void S(@Y61.k AddressParameter.Value value) {
        ParametersTree parametersTreeWa;
        e eVar = this.f135900d;
        if (eVar == null || (parametersTreeWa = eVar.wa()) == null) {
            return;
        }
        EditableParameter editableParameter = (EditableParameter) parametersTreeWa.getFirstParameterOfType(AddressParameter.class);
        if (editableParameter != null && !L.f(editableParameter.getValue(), value)) {
            editableParameter.setValue(value);
            editableParameter.setError(null);
        }
        if (editableParameter != null) {
            editableParameter.clearError();
        }
        b.InterfaceC4110b interfaceC4110b = this.f135902f;
        if (interfaceC4110b != null) {
            interfaceC4110b.c3(editableParameter, editableParameter != null ? editableParameter.getId() : null);
        }
        b.InterfaceC4110b interfaceC4110b2 = this.f135902f;
        if (interfaceC4110b2 != null) {
            interfaceC4110b2.h5(null);
        }
    }

    @Override // com.avito.android.category_parameters.h
    public final void a(@Y61.k com.avito.android.category_parameters.i iVar) {
        ParametersTree parametersTreeWa;
        ParameterSlot parameterSlotFindParameter;
        ParameterSlot parameterSlotFindParameter2;
        a aVar = this.f135901e;
        if (aVar == null || (parametersTreeWa = aVar.C0()) == null) {
            e eVar = this.f135900d;
            parametersTreeWa = eVar != null ? eVar.wa() : null;
        }
        for (Ij.b bVar : iVar.f117645a) {
            if (parametersTreeWa != null && (parameterSlotFindParameter2 = parametersTreeWa.findParameter(bVar.f8494a)) != null) {
                m3(bVar, parameterSlotFindParameter2, false);
            }
        }
        Iterator it = C42745f0.H(iVar.f117646b.values()).iterator();
        while (it.hasNext()) {
            Ij.b bVar2 = (Ij.b) it.next();
            if (parametersTreeWa != null && (parameterSlotFindParameter = parametersTreeWa.findParameter(bVar2.f8494a)) != null) {
                m3(bVar2, parameterSlotFindParameter, false);
            }
        }
        for (com.avito.android.items.a aVar2 : iVar.f117647c) {
            ParameterSlot parameterSlotFindParameter3 = parametersTreeWa != null ? parametersTreeWa.findParameter(aVar2.getF74797c()) : null;
            if (parameterSlotFindParameter3 instanceof CharParameter) {
                EditableParameter editableParameter = (EditableParameter) parameterSlotFindParameter3;
                String f117481f = aVar2.getF117481f();
                if (!L.f(editableParameter.getValue(), f117481f)) {
                    editableParameter.setValue(f117481f);
                    editableParameter.setError(null);
                }
            }
        }
        b.InterfaceC4110b interfaceC4110b = this.f135902f;
        if (interfaceC4110b != null) {
            interfaceC4110b.h5(null);
        }
    }

    @Override // com.avito.android.details.b
    public final void a0(@Y61.k String str, @Y61.l String str2) {
        ParametersTree parametersTreeWa;
        e eVar = this.f135900d;
        if (eVar == null || (parametersTreeWa = eVar.wa()) == null) {
            return;
        }
        ParameterSlot parameterSlotFindParameter = parametersTreeWa.findParameter(str);
        CharParameter charParameter = parameterSlotFindParameter instanceof CharParameter ? (CharParameter) parameterSlotFindParameter : null;
        if (charParameter != null) {
            if (!L.f(charParameter.getValue(), str2)) {
                charParameter.setValue(str2);
                charParameter.setError(null);
            }
            b.InterfaceC4110b interfaceC4110b = this.f135902f;
            if (interfaceC4110b != null) {
                interfaceC4110b.c3(charParameter, charParameter.getId());
            }
            b.InterfaceC4110b interfaceC4110b2 = this.f135902f;
            if (interfaceC4110b2 != null) {
                interfaceC4110b2.h5(null);
            }
        }
    }

    @Override // com.avito.android.select.p
    public final void j(@Y61.k String str, @Y61.l String str2, @Y61.k List list) {
        ParametersTree parametersTreeWa;
        CategoryParameters categoryParametersC0;
        e eVar = this.f135900d;
        if (eVar == null || (parametersTreeWa = eVar.wa()) == null) {
            return;
        }
        ParameterSlot parameterSlotFindParameter = parametersTreeWa.findParameter(str);
        if (parameterSlotFindParameter == null) {
            a aVar = this.f135901e;
            if (aVar == null || (categoryParametersC0 = aVar.C0()) == null) {
                return;
            } else {
                parameterSlotFindParameter = categoryParametersC0.findParameter(str);
            }
        }
        String strB = b(parameterSlotFindParameter, list);
        b.InterfaceC4110b interfaceC4110b = this.f135902f;
        if (interfaceC4110b != null) {
            interfaceC4110b.c3(parameterSlotFindParameter, strB);
        }
    }

    @Override // com.avito.android.details.b
    public final void j2(@Y61.k C42711b c42711b) {
        ParametersTree parametersTreeWa;
        e eVar = this.f135900d;
        if (eVar == null || (parametersTreeWa = eVar.wa()) == null) {
            return;
        }
        EditableParameter editableParameter = (EditableParameter) parametersTreeWa.getFirstParameterOfType(AddressParameter.class);
        AddressParameter.Value value = new AddressParameter.Value(c42711b.getValue().getLat(), c42711b.getValue().getLng(), c42711b.getValue().getText(), c42711b.getValue().getJwt(), new AddressParameter.Value.PublishValueSellerAddressData(c42711b.getHouse(), c42711b.getId(), Boolean.FALSE, c42711b.getLocation(), c42711b.getName()));
        if (editableParameter != null && !L.f(editableParameter.getValue(), value)) {
            editableParameter.setValue(value);
            editableParameter.setError(null);
        }
        if (editableParameter != null) {
            editableParameter.clearError();
        }
        b.InterfaceC4110b interfaceC4110b = this.f135902f;
        if (interfaceC4110b != null) {
            interfaceC4110b.vd();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009a A[PHI: r3
  0x009a: PHI (r3v7 java.util.List) = (r3v5 java.util.List), (r3v8 java.util.List) binds: [B:37:0x0095, B:29:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.avito.android.details.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3(@Y61.k Ij.b r7, @Y61.k com.avito.android.remote.model.category_parameters.base.ParameterSlot r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.details.c.m3(Ij.b, com.avito.android.remote.model.category_parameters.base.ParameterSlot, boolean):void");
    }

    @Override // com.avito.android.details.b
    public final void u4(int i12, @Y61.l Integer num) {
        ParameterSlot parameterSlot;
        CategoryParameters categoryParametersC0;
        ParameterSlot next;
        a aVar = this.f135901e;
        if (aVar == null || (categoryParametersC0 = aVar.C0()) == null) {
            parameterSlot = null;
        } else {
            Iterator<ParameterSlot> it = categoryParametersC0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (L.f(next.getId(), String.valueOf(i12))) {
                        break;
                    }
                }
            }
            parameterSlot = next;
        }
        IntParameter intParameter = parameterSlot instanceof IntParameter ? (IntParameter) parameterSlot : null;
        if (intParameter != null) {
            Long lValueOf = num != null ? Long.valueOf(num.intValue()) : null;
            if (!L.f(intParameter.getValue(), lValueOf)) {
                intParameter.setValue(lValueOf);
                intParameter.setError(null);
            }
            if (L.f(intParameter.getUpdatesForm(), Boolean.TRUE)) {
                b.InterfaceC4110b interfaceC4110b = this.f135902f;
                if (interfaceC4110b != null) {
                    b.InterfaceC4110b.a.a(interfaceC4110b, intParameter.getId(), 2);
                }
            } else {
                b.InterfaceC4110b interfaceC4110b2 = this.f135902f;
                if (interfaceC4110b2 != null) {
                    interfaceC4110b2.Nc();
                }
            }
        }
        b.InterfaceC4110b interfaceC4110b3 = this.f135902f;
        if (interfaceC4110b3 != null) {
            interfaceC4110b3.h5(null);
        }
    }

    @Override // com.avito.android.details.b
    public final void v(@Y61.k AddressParameter.Value value) {
        ParametersTree parametersTreeWa;
        AddressParameter.Widget widget;
        AddressParameter.Widget.Config config;
        AddressParameter.SellerAddresses sellerAddressesFlow;
        AddressParameter.Widget widget2;
        AddressParameter.Widget.Config config2;
        AddressParameter.SellerAddresses sellerAddressesFlow2;
        e eVar = this.f135900d;
        if (eVar == null || (parametersTreeWa = eVar.wa()) == null) {
            return;
        }
        AddressParameter addressParameter = (AddressParameter) parametersTreeWa.getFirstParameterOfType(AddressParameter.class);
        AddressParameter.Value value2 = new AddressParameter.Value(value.getLat(), value.getLng(), value.getText(), value.getJsonWebToken(), value.getAddressData());
        String invalidAddress = (addressParameter == null || (widget2 = addressParameter.getWidget()) == null || (config2 = widget2.getConfig()) == null || (sellerAddressesFlow2 = config2.getSellerAddressesFlow()) == null) ? null : sellerAddressesFlow2.getInvalidAddress();
        String addressError = (addressParameter == null || (widget = addressParameter.getWidget()) == null || (config = widget.getConfig()) == null || (sellerAddressesFlow = config.getSellerAddressesFlow()) == null) ? null : sellerAddressesFlow.getAddressError();
        if ((addressParameter != null ? addressParameter.getSelectedValue() : null) == null && addressParameter != null) {
            addressParameter.setError(addressError != null ? new HasError.Error.WithMessage(addressError) : null);
        }
        AddressParameter.Value.PublishValueSellerAddressData addressData = value.getAddressData();
        if ((addressData != null ? L.f(addressData.getIsDisabled(), Boolean.TRUE) : false) && addressParameter != null) {
            addressParameter.setError(invalidAddress != null ? new HasError.Error.WithMessage(invalidAddress) : null);
        }
        if (addressParameter != null && !L.f(addressParameter.getValue(), value2)) {
            addressParameter.setValue(value2);
            addressParameter.setError(null);
        }
        b.InterfaceC4110b interfaceC4110b = this.f135902f;
        if (interfaceC4110b != null) {
            interfaceC4110b.h5(null);
        }
    }

    @Override // com.avito.android.details.b
    public final void v3(@Y61.k ParameterSlot parameterSlot, @Y61.k List list) {
        b.InterfaceC4110b interfaceC4110b;
        if (parameterSlot instanceof HasError) {
            ((HasError) parameterSlot).clearError();
        }
        if (parameterSlot instanceof MultiselectParameter) {
            MultiselectParameter multiselectParameter = (MultiselectParameter) parameterSlot;
            List<? extends String> value = multiselectParameter.getValue();
            LinkedHashSet linkedHashSetO0 = value != null ? C42745f0.O0(value) : new LinkedHashSet();
            List<MultiselectParameter.Value> values = multiselectParameter.getValues();
            ArrayList arrayList = new ArrayList();
            for (Object obj : values) {
                if (linkedHashSetO0.contains(((MultiselectParameter.Value) obj).getId())) {
                    arrayList.add(obj);
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m mVar = ((Ij.b) it.next()).f8495b;
                boolean z12 = mVar.f8964e;
                String str = mVar.f8961b;
                if (z12) {
                    linkedHashSetO0.add(str);
                } else {
                    linkedHashSetO0.remove(str);
                }
            }
            List<MultiselectParameter.Value> values2 = multiselectParameter.getValues();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : values2) {
                if (linkedHashSetO0.contains(((MultiselectParameter.Value) obj2).getId())) {
                    arrayList2.add(obj2);
                }
            }
            String strB = b(parameterSlot, arrayList2);
            if (arrayList.equals(arrayList2) || (interfaceC4110b = this.f135902f) == null) {
                return;
            }
            interfaceC4110b.c3(parameterSlot, strB);
        }
    }

    @Override // com.avito.android.details.b
    public final void x4(@Y61.l String str) {
        b.InterfaceC4110b interfaceC4110b = this.f135902f;
        if (interfaceC4110b != null) {
            interfaceC4110b.h5(str);
        }
    }

    @Override // com.avito.android.select.p
    public final void q(@Y61.k String str) {
    }

    @Override // com.avito.android.select.p
    public final void s3(@Y61.k String str) {
    }
}
