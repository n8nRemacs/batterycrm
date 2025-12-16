package com.avito.android.validation;

import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.DisplayingOptions;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.validation.n1;
import kotlin.Metadata;

/* compiled from: Items.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-libs_publish-common"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.validation.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36018l {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Y61.k
    public static final String a(@Y61.k n1.a.c cVar, @Y61.k EditableParameter<?> editableParameter) {
        String type;
        boolean z12 = editableParameter instanceof MultiselectParameter;
        String str = cVar.f319404c;
        if (z12) {
            MultiselectParameter.Displaying displaying = ((MultiselectParameter) editableParameter).getDisplaying();
            type = displaying != null ? displaying.getType() : null;
            if (type != null) {
                switch (type.hashCode()) {
                    case -1183997287:
                        if (type.equals("inline")) {
                            return str;
                        }
                        break;
                    case 94631335:
                        if (type.equals("chips")) {
                            return str;
                        }
                        break;
                    case 1622181829:
                        if (type.equals("ds_multiselect")) {
                            return str;
                        }
                        break;
                    case 1950789867:
                        if (type.equals("inlined")) {
                            return str;
                        }
                        break;
                }
            }
        } else if (editableParameter instanceof SelectParameter) {
            SelectParameter.Displaying displaying2 = ((SelectParameter) editableParameter).getDisplaying();
            type = displaying2 != null ? displaying2.getType() : null;
            if (type != null) {
                int iHashCode = type.hashCode();
                if (iHashCode != 5318500) {
                    if (iHashCode != 94631335) {
                        if (iHashCode == 1536891843 && type.equals("checkbox")) {
                            return str;
                        }
                    } else if (type.equals("chips")) {
                        return str;
                    }
                } else if (type.equals("radiogroup")) {
                    return str;
                }
            }
        } else if (editableParameter instanceof CharParameter) {
            DisplayingOptions displayingOptions = ((CharParameter) editableParameter).getDisplayingOptions();
            if (kotlin.jvm.internal.L.f(displayingOptions != null ? displayingOptions.getType() : null, "vehicleRegNumber")) {
                return str;
            }
        } else if (editableParameter instanceof ObjectsParameter) {
            return str;
        }
        return "Required field is empty";
    }

    @Y61.k
    public static final String b(@Y61.k n1.a.c cVar, @Y61.k com.avito.conveyor_item.a aVar) {
        boolean z12 = aVar instanceof ParameterElement.v;
        String str = cVar.f319404c;
        if (z12) {
            ParameterElement.DisplayType displayType = ((ParameterElement.v) aVar).f117547h;
            if ((displayType instanceof ParameterElement.DisplayType.k) || (displayType instanceof ParameterElement.DisplayType.Chips)) {
                return str;
            }
        } else if (aVar instanceof ParameterElement.C) {
            ParameterElement.DisplayType displayType2 = ((ParameterElement.C) aVar).f117213i;
            if ((displayType2 instanceof ParameterElement.DisplayType.Chips) || (displayType2 instanceof ParameterElement.DisplayType.o) || (displayType2 instanceof ParameterElement.DisplayType.e)) {
                return str;
            }
        } else if (aVar instanceof com.avito.android.items.d) {
            DisplayingOptions f117489n = ((com.avito.android.items.d) aVar).getF117489n();
            String type = f117489n != null ? f117489n.getType() : null;
            if (kotlin.jvm.internal.L.f(type, "vehicleRegNumber") || kotlin.jvm.internal.L.f(type, "educationList")) {
                return str;
            }
        } else if (!(aVar instanceof ParameterElement.H)) {
            boolean z13 = aVar instanceof ParameterElement.w;
            return str;
        }
        return "Required field is empty";
    }
}
