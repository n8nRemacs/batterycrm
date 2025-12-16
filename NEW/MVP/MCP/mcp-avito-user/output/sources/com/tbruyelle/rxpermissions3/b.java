package com.tbruyelle.rxpermissions3;

import l41.InterfaceC43544b;

/* compiled from: Permission.java */
/* loaded from: classes7.dex */
class b implements InterfaceC43544b<StringBuilder, String> {
    @Override // l41.InterfaceC43544b
    public final void accept(StringBuilder sb2, String str) {
        StringBuilder sb3 = sb2;
        String str2 = str;
        if (sb3.length() == 0) {
            sb3.append(str2);
        } else {
            sb3.append(", ");
            sb3.append(str2);
        }
    }
}
