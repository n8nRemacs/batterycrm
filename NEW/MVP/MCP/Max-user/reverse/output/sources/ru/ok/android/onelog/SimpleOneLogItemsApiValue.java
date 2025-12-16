package ru.ok.android.onelog;

import defpackage.gy7;
import defpackage.jt0;
import java.io.IOException;
import java.util.Iterator;
import ru.ok.android.api.json.JsonSerializeException;

/* loaded from: classes2.dex */
class SimpleOneLogItemsApiValue extends jt0 {
    private final Iterable<OneLogItem> items;

    public SimpleOneLogItemsApiValue(Iterable<OneLogItem> iterable) {
        this.items = iterable;
    }

    @Override // defpackage.jt0
    public void write(gy7 gy7Var) throws JsonSerializeException, IOException {
        gy7Var.r();
        Iterator<OneLogItem> it = this.items.iterator();
        while (it.hasNext()) {
            ItemSerializer.INSTANCE.serialize(gy7Var, it.next());
        }
        gy7Var.q();
    }
}
