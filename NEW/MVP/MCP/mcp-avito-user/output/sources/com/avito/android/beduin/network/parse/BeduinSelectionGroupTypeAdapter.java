package com.avito.android.beduin.network.parse;

import Y61.k;
import com.avito.android.beduin.common.component.selection_group.BeduinSelectionGroupModel;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: BeduinSelectionGroupTypeAdapter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/network/parse/BeduinSelectionGroupTypeAdapter;", "", "()V", "SelectionType", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinSelectionGroupTypeAdapter {

    /* compiled from: BeduinSelectionGroupTypeAdapter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/network/parse/BeduinSelectionGroupTypeAdapter$SelectionType;", "Lcom/google/gson/h;", "Lcom/avito/android/beduin/common/component/selection_group/BeduinSelectionGroupModel$SelectionType;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SelectionType implements h<BeduinSelectionGroupModel.SelectionType> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Map<String, Class<BeduinSelectionGroupModel.SelectionType.Single>> f104046a = Collections.singletonMap("single", BeduinSelectionGroupModel.SelectionType.Single.class);

        @Override // com.google.gson.h
        public final BeduinSelectionGroupModel.SelectionType deserialize(i iVar, Type type, g gVar) {
            com.google.gson.k kVarI = iVar.i();
            i iVarD = kVarI.D("type");
            String strS = iVarD != null ? iVarD.s() : null;
            if (strS == null) {
                strS = "";
            }
            Class<BeduinSelectionGroupModel.SelectionType.Single> cls = this.f104046a.get(strS);
            if (cls == null) {
                return null;
            }
            return (BeduinSelectionGroupModel.SelectionType) gVar.b(kVarI, cls);
        }
    }
}
