package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes2.dex */
public final class hmd extends ArrayList {
    public final Collection a;

    /* JADX WARN: Illegal instructions before constructor call */
    public hmd() {
        hd5 hd5Var = hd5.a;
        super(hd5Var);
        this.a = hd5Var;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof fmd) {
            return super.contains((fmd) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hmd) && fni.a(this.a, ((hmd) obj).a);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof fmd) {
            return super.indexOf((fmd) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof fmd) {
            return super.lastIndexOf((fmd) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof fmd) {
            return super.remove((fmd) obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "ReplyButtonRow(buttons=" + this.a + ")";
    }
}
