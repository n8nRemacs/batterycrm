package com.avito.android.remote.model.category_parameters;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AttributesTree.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/AttributeNode;", "", "()V", "id", "", "getId", "()Ljava/lang/String;", "ListNode", "StringNode", "Lcom/avito/android/remote/model/category_parameters/AttributeNode$ListNode;", "Lcom/avito/android/remote/model/category_parameters/AttributeNode$StringNode;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class AttributeNode {

    /* compiled from: AttributesTree.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/AttributeNode$StringNode;", "Lcom/avito/android/remote/model/category_parameters/AttributeNode;", "id", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StringNode extends AttributeNode {

        @c("id")
        @k
        private final String id;

        @c("value")
        @k
        private final String value;

        public StringNode(@k String str, @k String str2) {
            super(null);
            this.id = str;
            this.value = str2;
        }

        public static /* synthetic */ StringNode copy$default(StringNode stringNode, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = stringNode.id;
            }
            if ((i12 & 2) != 0) {
                str2 = stringNode.value;
            }
            return stringNode.copy(str, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @k
        public final StringNode copy(@k String id2, @k String value) {
            return new StringNode(id2, value);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StringNode)) {
                return false;
            }
            StringNode stringNode = (StringNode) other;
            return L.f(this.id, stringNode.id) && L.f(this.value, stringNode.value);
        }

        @Override // com.avito.android.remote.model.category_parameters.AttributeNode
        @k
        public String getId() {
            return this.id;
        }

        @k
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + (this.id.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("StringNode(id=");
            sb2.append(this.id);
            sb2.append(", value=");
            return C22026a.c(sb2, this.value, ')');
        }
    }

    public /* synthetic */ AttributeNode(C42822w c42822w) {
        this();
    }

    @k
    public abstract String getId();

    /* compiled from: AttributesTree.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/AttributeNode$ListNode;", "Lcom/avito/android/remote/model/category_parameters/AttributeNode;", "id", "", "value", "", "(Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getValue", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ListNode extends AttributeNode {

        @c("id")
        @k
        private final String id;

        @c("value")
        @k
        private final List<AttributeNode> value;

        public /* synthetic */ ListNode(String str, List list, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? new ArrayList() : list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ListNode copy$default(ListNode listNode, String str, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = listNode.id;
            }
            if ((i12 & 2) != 0) {
                list = listNode.value;
            }
            return listNode.copy(str, list);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @k
        public final List<AttributeNode> component2() {
            return this.value;
        }

        @k
        public final ListNode copy(@k String id2, @k List<AttributeNode> value) {
            return new ListNode(id2, value);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ListNode)) {
                return false;
            }
            ListNode listNode = (ListNode) other;
            return L.f(this.id, listNode.id) && L.f(this.value, listNode.value);
        }

        @Override // com.avito.android.remote.model.category_parameters.AttributeNode
        @k
        public String getId() {
            return this.id;
        }

        @k
        public final List<AttributeNode> getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + (this.id.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ListNode(id=");
            sb2.append(this.id);
            sb2.append(", value=");
            return H.p(sb2, this.value, ')');
        }

        public ListNode(@k String str, @k List<AttributeNode> list) {
            super(null);
            this.id = str;
            this.value = list;
        }
    }

    private AttributeNode() {
    }
}
