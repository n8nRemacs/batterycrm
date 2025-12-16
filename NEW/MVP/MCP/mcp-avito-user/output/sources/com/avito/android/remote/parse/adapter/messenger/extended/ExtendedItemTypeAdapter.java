package com.avito.android.remote.parse.adapter.messenger.extended;

import com.avito.android.authorization.auto_recovery.phone_confirm.b;
import com.avito.android.remote.C34328m0;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.f;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.o;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedItemTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/parse/adapter/messenger/extended/ExtendedItemTypeAdapter;", "Lcom/google/gson/o;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$ItemExtended;", "Lcom/google/gson/h;", "<init>", "()V", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ExtendedItemTypeAdapter implements o<MessageBody.SystemMessageBody.Platform.ItemExtended>, h<MessageBody.SystemMessageBody.Platform.ItemExtended> {
    @Override // com.google.gson.o
    public final i a(Object obj, n nVar) {
        MessageBody.SystemMessageBody.Platform.ItemExtended itemExtended = (MessageBody.SystemMessageBody.Platform.ItemExtended) obj;
        k kVar = new k();
        kVar.t("price", nVar != null ? nVar.c(itemExtended.getPrice()) : null);
        kVar.t("images", nVar != null ? nVar.c(itemExtended.getImages()) : null);
        kVar.t("textFields", nVar != null ? nVar.c(itemExtended.getTextFields()) : null);
        kVar.t("actions", nVar != null ? nVar.c(itemExtended.getActions()) : null);
        return kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r10v5 */
    @Override // com.google.gson.h
    public final MessageBody.SystemMessageBody.Platform.ItemExtended deserialize(i iVar, Type type, g gVar) {
        ?? arrayList;
        ArrayList arrayList2;
        k kVarI = iVar.i();
        i iVarD = kVarI.D("price");
        AttributedText attributedText = (AttributedText) (iVarD == null ? null : gVar.b(iVarD, AttributedText.class));
        if (kVarI.f362194b.containsKey("images")) {
            f fVarC = C34328m0.c(kVarI.D("images"));
            if (fVarC == null) {
                arrayList = 0;
            } else {
                int size = fVarC.f362000b.size();
                arrayList = new ArrayList(size);
                int iC2 = 0;
                while (iC2 < size) {
                    i iVarW = fVarC.w(iC2);
                    iC2 = b.c(gVar, iVarW != null ? iVarW.i() : null, UniversalImage.class, arrayList, iC2, 1);
                }
            }
            if (arrayList == 0) {
                arrayList = C42784z0.f406748b;
            }
        } else {
            arrayList = C42784z0.f406748b;
        }
        f fVarE = kVarI.E("textFields");
        if (fVarE == null) {
            arrayList2 = null;
        } else {
            int size2 = fVarE.f362000b.size();
            arrayList2 = new ArrayList(size2);
            int iC3 = 0;
            while (iC3 < size2) {
                i iVarW2 = fVarE.w(iC3);
                iC3 = b.c(gVar, iVarW2 != null ? iVarW2.i() : null, MessageBody.SystemMessageBody.ExtendedTextFields.class, arrayList2, iC3, 1);
            }
        }
        i iVarD2 = kVarI.D("actions");
        MessageBody.SystemMessageBody.ExtendedActions extendedActions = (MessageBody.SystemMessageBody.ExtendedActions) (iVarD2 != null ? gVar.b(iVarD2, MessageBody.SystemMessageBody.ExtendedActions.class) : null);
        List list = arrayList2;
        if (arrayList2 == null) {
            list = C42784z0.f406748b;
        }
        return new MessageBody.SystemMessageBody.Platform.ItemExtended(attributedText, arrayList, list, extendedActions);
    }
}
