package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class rfi implements Iterator {
    public Map.Entry a;
    public final /* synthetic */ Iterator b;

    public rfi(mfi mfiVar, Iterator it) {
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.b.next();
        this.a = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        rui.e("no calls to next() since the last call to remove()", this.a != null);
        Collection collection = (Collection) this.a.getValue();
        this.b.remove();
        collection.size();
        collection.clear();
        this.a = null;
    }
}
