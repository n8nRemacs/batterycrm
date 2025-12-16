package com.avito.android.remote.parse.adapter.messenger.extended;

import com.avito.android.remote.C34328m0;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.internal.x;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.o;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedContentTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/parse/adapter/messenger/extended/ExtendedContentTypeAdapter;", "Lcom/google/gson/o;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedContent;", "Lcom/google/gson/h;", "<init>", "()V", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ExtendedContentTypeAdapter implements o<MessageBody.SystemMessageBody.ExtendedContent>, h<MessageBody.SystemMessageBody.ExtendedContent> {
    @Override // com.google.gson.o
    public final i a(Object obj, n nVar) {
        MessageBody.SystemMessageBody.ExtendedContent extendedContent = (MessageBody.SystemMessageBody.ExtendedContent) obj;
        k kVar = new k();
        kVar.t("distance", nVar != null ? nVar.c(extendedContent.getDistance()) : null);
        kVar.t("distanceInTime", nVar != null ? nVar.c(extendedContent.getDistanceInTime()) : null);
        List<MessageBody.SystemMessageBody.ExtendedColor> lines = extendedContent.getLines();
        if (lines != null) {
            i iVarC = nVar != null ? nVar.c(lines) : null;
            if (iVarC != null) {
                kVar.t("lines", iVarC);
            }
        }
        kVar.t("name", nVar != null ? nVar.c(extendedContent.getName()) : null);
        kVar.t(AddressParameter.TYPE, nVar != null ? nVar.c(extendedContent.getAddress()) : null);
        return kVar;
    }

    @Override // com.google.gson.h
    public final MessageBody.SystemMessageBody.ExtendedContent deserialize(i iVar, Type type, g gVar) {
        k kVarI = iVar.i();
        ArrayList arrayList = kVarI.D("lines").h().f362000b;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(gVar.b((i) it.next(), MessageBody.SystemMessageBody.ExtendedColor.class));
        }
        x<String, i> xVar = kVarI.f362194b;
        return new MessageBody.SystemMessageBody.ExtendedContent(xVar.containsKey("distance") ? C34328m0.e(kVarI.D("distance")) : null, xVar.containsKey("distanceInTime") ? C34328m0.e(kVarI.D("distanceInTime")) : null, arrayList2, C34328m0.e(kVarI.D("name")), C34328m0.e(kVarI.D(AddressParameter.TYPE)));
    }
}
