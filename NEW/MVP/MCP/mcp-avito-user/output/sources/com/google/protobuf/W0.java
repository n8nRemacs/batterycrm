package com.google.protobuf;

import com.google.protobuf.V;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: SmallSortedMap.java */
/* loaded from: classes7.dex */
class W0 extends X0<Object, Object> {
    @Override // com.google.protobuf.X0
    public final void f() {
        if (!this.f362831e) {
            for (int i12 = 0; i12 < this.f362829c.size(); i12++) {
                Map.Entry<Object, Object> entryC = c(i12);
                if (((V.c) entryC.getKey()).isRepeated()) {
                    entryC.setValue(Collections.unmodifiableList((List) entryC.getValue()));
                }
            }
            for (Map.Entry<Object, Object> entry : d()) {
                if (((V.c) entry.getKey()).isRepeated()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.f();
    }
}
