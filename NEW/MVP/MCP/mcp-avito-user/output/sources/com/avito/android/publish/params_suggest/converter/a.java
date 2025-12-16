package com.avito.android.publish.params_suggest.converter;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.AttributeNode;
import h31.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: AttributesTreeToParamsMapConverter.kt */
@P
@j
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/params_suggest/converter/a;", "", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a {
    @Inject
    public a() {
    }

    public static Object a(List list) {
        Object value;
        List<AttributeNode> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (AttributeNode attributeNode : list2) {
            if (attributeNode instanceof AttributeNode.ListNode) {
                value = Collections.singletonMap(attributeNode.getId(), a(((AttributeNode.ListNode) attributeNode).getValue()));
            } else {
                if (!(attributeNode instanceof AttributeNode.StringNode)) {
                    throw new NoWhenBranchMatchedException();
                }
                value = ((AttributeNode.StringNode) attributeNode).getValue();
            }
            arrayList.add(value);
        }
        Object objW0 = C42745f0.w0(arrayList);
        return objW0 == null ? arrayList : objW0;
    }
}
