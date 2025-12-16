package if0;

import Y61.k;
import com.avito.android.remote.model.category_parameters.AttributeNode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AttributesTreeExtensions.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_publish_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: if0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C41394a {
    public static final void a(HashMap map, AttributeNode attributeNode) {
        if (!(attributeNode instanceof AttributeNode.ListNode)) {
            if (attributeNode instanceof AttributeNode.StringNode) {
                map.put(attributeNode.getId(), ((AttributeNode.StringNode) attributeNode).getValue());
                return;
            }
            return;
        }
        for (AttributeNode attributeNode2 : ((AttributeNode.ListNode) attributeNode).getValue()) {
            String id2 = attributeNode.getId();
            if (map.get(id2) == null) {
                map.put(id2, new HashMap());
            }
            a((HashMap) map.get(attributeNode.getId()), attributeNode2);
        }
    }

    @k
    public static final HashMap b(@k List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a(map, (AttributeNode) it.next());
        }
        return map;
    }
}
