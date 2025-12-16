package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.category_parameters.AttributeNode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AttributeNodeDeserializer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/AttributeNodeSerializer;", "Lcom/google/gson/o;", "Lcom/avito/android/remote/model/category_parameters/AttributeNode;", "<init>", "()V", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AttributeNodeSerializer implements com.google.gson.o<AttributeNode> {
    @Override // com.google.gson.o
    public final com.google.gson.i a(Object obj, com.google.gson.n nVar) {
        AttributeNode attributeNode = (AttributeNode) obj;
        if (attributeNode instanceof AttributeNode.ListNode) {
            return nVar.c(attributeNode);
        }
        if (attributeNode instanceof AttributeNode.StringNode) {
            return nVar.c(attributeNode);
        }
        throw new NoWhenBranchMatchedException();
    }
}
