package com.google.common.collect;

import java.lang.Comparable;

/* compiled from: AbstractRangeSet.java */
@XY0.c
@InterfaceC37329f0
/* renamed from: com.google.common.collect.l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC37364l<C extends Comparable> implements E3<C> {
    public boolean equals(@I41.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof E3) {
            return a().equals(((E3) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
