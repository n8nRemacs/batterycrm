package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class t24 extends sj0 {
    public final List b;

    public t24(long j) {
        this.b = Collections.singletonList(Long.valueOf(j));
    }

    @Override // defpackage.sj0
    public final String toString() {
        return "ContactsUpdateEvent{idList=" + this.b + '}';
    }

    public t24(Collection collection) {
        this.b = new ArrayList(collection);
    }

    public t24(long j, Collection collection) {
        super(j);
        this.b = new ArrayList(collection);
    }
}
