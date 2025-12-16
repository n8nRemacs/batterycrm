package com.my.tracker.core.o;

import defpackage.xc0;

/* loaded from: classes.dex */
public final class c {
    public final String a;
    public final int b;

    public c(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AppSetIdData{id='");
        sb.append(this.a);
        sb.append("', scope=");
        return xc0.h(sb, this.b, '}');
    }
}
