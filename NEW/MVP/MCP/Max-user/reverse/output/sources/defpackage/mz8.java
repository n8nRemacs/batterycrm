package defpackage;

import android.net.Uri;
import java.util.List;

/* loaded from: classes.dex */
public final class mz8 {
    public String a;
    public Uri b;
    public String c;
    public oz8 d;
    public uz8 e;
    public List f;
    public String g;
    public wg7 h;
    public lz8 i;
    public long j;
    public w19 k;
    public wz8 l;
    public d09 m;

    public final k09 a() {
        a09 a09Var;
        uz8 uz8Var = this.e;
        hsi.g(uz8Var.b == null || uz8Var.a != null);
        Uri uri = this.b;
        if (uri != null) {
            String str = this.c;
            uz8 uz8Var2 = this.e;
            a09Var = new a09(uri, str, uz8Var2.a != null ? new vz8(uz8Var2) : null, this.i, this.f, this.g, this.h, this.j);
        } else {
            a09Var = null;
        }
        String str2 = this.a;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        oz8 oz8Var = this.d;
        oz8Var.getClass();
        sz8 sz8Var = new sz8(oz8Var);
        wz8 wz8Var = this.l;
        wz8Var.getClass();
        yz8 yz8Var = new yz8(wz8Var);
        w19 w19Var = this.k;
        if (w19Var == null) {
            w19Var = w19.K;
        }
        return new k09(str3, sz8Var, a09Var, yz8Var, w19Var, this.m);
    }
}
