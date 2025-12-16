package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.AdvertActions;
import com.avito.android.remote.model.ContactsPosition;
import com.avito.android.remote.model.PriorityContactsMethod;
import com.avito.android.remote.model.text.AttributedText;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertActionDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/AdvertActionsDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/AdvertActions;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdvertActionsDeserializer implements com.google.gson.h<AdvertActions> {
    @Override // com.google.gson.h
    public final AdvertActions deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        com.google.gson.k kVarI = iVar.i();
        com.google.gson.i iVarD = kVarI.D("title");
        AttributedText attributedText = iVarD == null ? null : (AttributedText) gVar.b(iVarD, AttributedText.class);
        com.google.gson.i iVarD2 = kVarI.D("position");
        ContactsPosition contactsPosition = iVarD2 == null ? null : (ContactsPosition) gVar.b(iVarD2, ContactsPosition.class);
        com.google.gson.i iVarD3 = kVarI.D("access");
        List listSingletonList = iVarD3 == null ? null : Collections.singletonList((AdvertAction.Access) gVar.b(iVarD3.i().D("action"), AdvertAction.Access.class));
        if (listSingletonList == null) {
            com.google.gson.i iVarD4 = kVarI.D("list");
            if (iVarD4 == null) {
                listSingletonList = C42784z0.f406748b;
            } else {
                ArrayList arrayList = iVarD4.h().f362000b;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(gVar.b((com.google.gson.i) it.next(), AdvertAction.class));
                }
                listSingletonList = arrayList2;
            }
        }
        List list = listSingletonList;
        com.google.gson.i iVarD5 = kVarI.D("priorityMethod");
        PriorityContactsMethod priorityContactsMethod = iVarD5 == null ? null : (PriorityContactsMethod) gVar.b(iVarD5, PriorityContactsMethod.class);
        com.google.gson.i iVarD6 = kVarI.D("earlyAccessEndInfo");
        return new AdvertActions(list, attributedText, contactsPosition, priorityContactsMethod, iVarD6 != null ? (String) gVar.b(iVarD6, String.class) : null);
    }
}
