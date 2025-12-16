package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.common.items.VerificationTextItem;
import com.avito.android.remote.model.text.AttributedText;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VerificationAttributedTextAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/VerificationAttributedTextAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/common/items/VerificationTextItem;", "<init>", "()V", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class VerificationAttributedTextAdapter implements com.google.gson.h<VerificationTextItem> {
    @Override // com.google.gson.h
    public final VerificationTextItem deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        try {
            return new VerificationTextItem((AttributedText) gVar.b(iVar, AttributedText.class));
        } catch (Exception unused) {
            return new VerificationTextItem(null);
        }
    }
}
