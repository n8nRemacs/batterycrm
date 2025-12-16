package com.tbruyelle.rxpermissions3;

import androidx.appcompat.app.r;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41950g;
import io.reactivex.rxjava3.internal.operators.observable.C41959j;
import java.util.List;

/* compiled from: Permission.java */
/* loaded from: classes7.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f366508a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f366509b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f366510c;

    public f(String str, boolean z12, boolean z13) {
        this.f366508a = str;
        this.f366509b = z12;
        this.f366510c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f366509b == fVar.f366509b && this.f366510c == fVar.f366510c) {
            return this.f366508a.equals(fVar.f366508a);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f366508a.hashCode() * 31) + (this.f366509b ? 1 : 0)) * 31) + (this.f366510c ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Permission{name='");
        sb2.append(this.f366508a);
        sb2.append("', granted=");
        sb2.append(this.f366509b);
        sb2.append(", shouldShowRequestPermissionRationale=");
        return r.x(sb2, this.f366510c, '}');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(List<f> list) {
        this.f366508a = ((StringBuilder) z.X(list).d0(new c()).h(new StringBuilder(), new b()).e()).toString();
        this.f366509b = new C41950g(z.X(list), new d()).e().booleanValue();
        this.f366510c = new C41959j(z.X(list), new e()).e().booleanValue();
    }
}
