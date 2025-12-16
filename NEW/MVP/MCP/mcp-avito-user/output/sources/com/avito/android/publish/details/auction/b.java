package com.avito.android.publish.details.auction;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.AttributeNode;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: AuctionAttributesTreeToJsonConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/details/auction/b;", "Lcom/avito/android/publish/details/auction/a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Gson f233466a = new Gson();

    @Inject
    public b() {
    }

    public static LinkedHashMap b(List list) {
        Object objM0;
        Object objB;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AttributeNode attributeNode = (AttributeNode) it.next();
            if (attributeNode instanceof AttributeNode.StringNode) {
                linkedHashMap.put(attributeNode.getId(), ((AttributeNode.StringNode) attributeNode).getValue());
            } else if (attributeNode instanceof AttributeNode.ListNode) {
                AttributeNode.ListNode listNode = (AttributeNode.ListNode) attributeNode;
                if (listNode.getValue().isEmpty()) {
                    continue;
                } else {
                    String id2 = attributeNode.getId();
                    Iterator<T> it2 = listNode.getValue().iterator();
                    Integer num = null;
                    while (it2.hasNext()) {
                        Integer numY0 = C43066x.y0(((AttributeNode) it2.next()).getId());
                        if (numY0 != null) {
                            int iIntValue = numY0.intValue();
                            if ((num != null || iIntValue == 0) && (num == null || num.intValue() + 1 == iIntValue)) {
                                num = numY0;
                            }
                        }
                        objM0 = b(listNode.getValue());
                    }
                    List<AttributeNode> value = listNode.getValue();
                    ArrayList arrayList = new ArrayList(C42745f0.q(value, 10));
                    for (AttributeNode attributeNode2 : value) {
                        if (attributeNode2 instanceof AttributeNode.StringNode) {
                            objB = ((AttributeNode.StringNode) attributeNode2).getValue();
                        } else {
                            if (!(attributeNode2 instanceof AttributeNode.ListNode)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            objB = b(((AttributeNode.ListNode) attributeNode2).getValue());
                        }
                        arrayList.add(objB);
                    }
                    objM0 = C42745f0.M0(arrayList);
                    linkedHashMap.put(id2, objM0);
                }
            } else {
                continue;
            }
        }
        return linkedHashMap;
    }

    @Override // com.avito.android.publish.details.auction.a
    @k
    public final String a(@k List<? extends AttributeNode> list) {
        return this.f233466a.l(b(list));
    }
}
