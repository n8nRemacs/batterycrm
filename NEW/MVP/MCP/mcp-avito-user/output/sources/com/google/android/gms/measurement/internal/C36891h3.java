package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.util.InterfaceC36753g;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.h3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36891h3 implements InterfaceC36905j3 {

    /* renamed from: a, reason: collision with root package name */
    public final I2 f355183a;

    public C36891h3(I2 i22) {
        C36729v.j(i22);
        this.f355183a = i22;
    }

    @Pure
    public C36876f2 b() {
        C36876f2 c36876f2 = this.f355183a.f354716h;
        I2.d(c36876f2);
        return c36876f2;
    }

    @Pure
    public N5 c() {
        N5 n52 = this.f355183a.f354720l;
        I2.d(n52);
        return n52;
    }

    public void d() {
        A2 a22 = this.f355183a.f354718j;
        I2.c(a22);
        if (Thread.currentThread() != a22.f354512d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public void e() {
        A2 a22 = this.f355183a.f354718j;
        I2.c(a22);
        a22.e();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public Context zza() {
        return this.f355183a.f354709a;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public InterfaceC36753g zzb() {
        return this.f355183a.f354722n;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public C36852c zzd() {
        return this.f355183a.f354714f;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public S1 zzj() {
        S1 s12 = this.f355183a.f354717i;
        I2.c(s12);
        return s12;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public A2 zzl() {
        A2 a22 = this.f355183a.f354718j;
        I2.c(a22);
        return a22;
    }
}
