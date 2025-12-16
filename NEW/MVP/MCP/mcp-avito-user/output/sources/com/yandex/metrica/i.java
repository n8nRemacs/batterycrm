package com.yandex.metrica;

import java.util.HashMap;

/* loaded from: classes7.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public String f377709a;

    /* renamed from: b, reason: collision with root package name */
    public String f377710b;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f377711c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        String str = this.f377709a;
        if (str == null ? iVar.f377709a != null : !str.equals(iVar.f377709a)) {
            return false;
        }
        String str2 = this.f377710b;
        if (str2 == null ? iVar.f377710b != null : !str2.equals(iVar.f377710b)) {
            return false;
        }
        HashMap map = this.f377711c;
        HashMap map2 = iVar.f377711c;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public final int hashCode() {
        String str = this.f377709a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f377710b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        HashMap map = this.f377711c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }
}
