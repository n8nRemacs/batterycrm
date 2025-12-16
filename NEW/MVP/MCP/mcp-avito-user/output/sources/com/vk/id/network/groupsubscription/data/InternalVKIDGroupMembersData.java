package com.vk.id.network.groupsubscription.data;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.vk.id.common.InternalVKIDApi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InternalVKIDGroupMembersData.kt */
@InternalVKIDApi
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupMembersData;", "", "", "count", "", "Lcom/vk/id/network/groupsubscription/data/InternalVKIDMemberData;", "members", "<init>", "(ILjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "I", "getCount", "Ljava/util/List;", "getMembers", "()Ljava/util/List;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class InternalVKIDGroupMembersData {
    private final int count;

    @k
    private final List<InternalVKIDMemberData> members;

    public InternalVKIDGroupMembersData(int i12, @k List<InternalVKIDMemberData> list) {
        this.count = i12;
        this.members = list;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalVKIDGroupMembersData)) {
            return false;
        }
        InternalVKIDGroupMembersData internalVKIDGroupMembersData = (InternalVKIDGroupMembersData) other;
        return this.count == internalVKIDGroupMembersData.count && L.f(this.members, internalVKIDGroupMembersData.members);
    }

    public final int getCount() {
        return this.count;
    }

    @k
    public final List<InternalVKIDMemberData> getMembers() {
        return this.members;
    }

    public int hashCode() {
        return this.members.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    @k
    public String toString() {
        return "InternalVKIDGroupMembersData(count=" + this.count + ", members=" + this.members + ")";
    }
}
