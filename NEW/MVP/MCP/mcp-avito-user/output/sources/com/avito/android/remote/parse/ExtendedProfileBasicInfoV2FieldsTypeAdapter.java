package com.avito.android.remote.parse;

import Y61.k;
import com.avito.android.remote.model.extended.BasicInfoV2Widget;
import com.avito.android.remote.model.extended.FieldModerationStatus;
import com.google.gson.f;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedProfileBasicInfoV2FieldsTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/ExtendedProfileBasicInfoV2FieldsTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$Field;", "<init>", "()V", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ExtendedProfileBasicInfoV2FieldsTypeAdapter implements h<BasicInfoV2Widget.Field> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final LinkedHashMap f254140a = P0.j(new Q("user_name", BasicInfoV2Widget.UserNameFieldValue.class), new Q("personal_link", BasicInfoV2Widget.PersonalLinkFieldValue.class));

    @Override // com.google.gson.h
    public final BasicInfoV2Widget.Field deserialize(i iVar, Type type, g gVar) {
        com.google.gson.k kVarI = iVar.i();
        i iVarD = kVarI.D("type");
        String strS = iVarD != null ? iVarD.s() : null;
        if (strS == null) {
            strS = "";
        }
        Class cls = (Class) this.f254140a.get(strS);
        if (cls == null) {
            return null;
        }
        f fVarH = kVarI.D("values").h();
        ArrayList arrayList = new ArrayList(C42745f0.q(fVarH, 10));
        Iterator it = fVarH.f362000b.iterator();
        while (it.hasNext()) {
            i iVar2 = (i) it.next();
            arrayList.add(new BasicInfoV2Widget.FieldValue((FieldModerationStatus) gVar.b(iVar2.i().D("status").i(), FieldModerationStatus.class), (BasicInfoV2Widget.Value) gVar.b(iVar2.i().D("value").i(), cls)));
        }
        return new BasicInfoV2Widget.Field(arrayList);
    }
}
