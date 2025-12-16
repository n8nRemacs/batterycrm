package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.yandex.mobile.ads.impl.w71;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class w81 extends ff implements Handler.Callback {

    /* renamed from: A, reason: collision with root package name */
    private int f391337A;

    /* renamed from: B, reason: collision with root package name */
    private long f391338B;

    /* renamed from: n, reason: collision with root package name */
    @j.P
    private final Handler f391339n;

    /* renamed from: o, reason: collision with root package name */
    private final v81 f391340o;

    /* renamed from: p, reason: collision with root package name */
    private final w71 f391341p;

    /* renamed from: q, reason: collision with root package name */
    private final ww f391342q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f391343r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f391344s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f391345t;

    /* renamed from: u, reason: collision with root package name */
    private int f391346u;

    /* renamed from: v, reason: collision with root package name */
    @j.P
    private vw f391347v;

    /* renamed from: w, reason: collision with root package name */
    @j.P
    private u71 f391348w;

    /* renamed from: x, reason: collision with root package name */
    @j.P
    private x71 f391349x;

    /* renamed from: y, reason: collision with root package name */
    @j.P
    private y71 f391350y;

    /* renamed from: z, reason: collision with root package name */
    @j.P
    private y71 f391351z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w81(v81 v81Var, @j.P Looper looper) {
        super(3);
        w71 w71Var = w71.f391328a;
        this.f391340o = (v81) db.a(v81Var);
        this.f391339n = looper == null ? null : pc1.a(looper, (Handler.Callback) this);
        this.f391341p = w71Var;
        this.f391342q = new ww();
        this.f391338B = -9223372036854775807L;
    }

    private long y() {
        if (this.f391337A == -1) {
            return Long.MAX_VALUE;
        }
        this.f391350y.getClass();
        if (this.f391337A >= this.f391350y.a()) {
            return Long.MAX_VALUE;
        }
        return this.f391350y.a(this.f391337A);
    }

    private void z() {
        this.f391349x = null;
        this.f391337A = -1;
        y71 y71Var = this.f391350y;
        if (y71Var != null) {
            y71Var.h();
            this.f391350y = null;
        }
        y71 y71Var2 = this.f391351z;
        if (y71Var2 != null) {
            y71Var2.h();
            this.f391351z = null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.vx0
    public final int a(vw vwVar) {
        if (((w71.a) this.f391341p).b(vwVar)) {
            return vx0.a(vwVar.f391168E == 0 ? 4 : 2);
        }
        return qg0.c(vwVar.f391181l) ? vx0.a(1) : vx0.a(0);
    }

    public final void c(long j12) {
        db.b(k());
        this.f391338B = j12;
    }

    @Override // com.yandex.mobile.ads.impl.ux0
    public final boolean d() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.ux0, com.yandex.mobile.ads.impl.vx0
    public final String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        List<vm> list = (List) message.obj;
        this.f391340o.onCues(list);
        this.f391340o.a(new xm(list));
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.ff
    public final void u() {
        this.f391347v = null;
        this.f391338B = -9223372036854775807L;
        List<vm> listEmptyList = Collections.emptyList();
        Handler handler = this.f391339n;
        if (handler != null) {
            handler.obtainMessage(0, listEmptyList).sendToTarget();
        } else {
            this.f391340o.onCues(listEmptyList);
            this.f391340o.a(new xm(listEmptyList));
        }
        z();
        u71 u71Var = this.f391348w;
        u71Var.getClass();
        u71Var.release();
        this.f391348w = null;
        this.f391346u = 0;
    }

    @Override // com.yandex.mobile.ads.impl.ff
    public final void a(vw[] vwVarArr, long j12, long j13) {
        vw vwVar = vwVarArr[0];
        this.f391347v = vwVar;
        if (this.f391348w != null) {
            this.f391346u = 1;
            return;
        }
        this.f391345t = true;
        w71 w71Var = this.f391341p;
        vwVar.getClass();
        this.f391348w = ((w71.a) w71Var).a(vwVar);
    }

    @Override // com.yandex.mobile.ads.impl.ux0
    public final void a(long j12, long j13) {
        boolean z12;
        if (k()) {
            long j14 = this.f391338B;
            if (j14 != -9223372036854775807L && j12 >= j14) {
                z();
                this.f391344s = true;
            }
        }
        if (this.f391344s) {
            return;
        }
        if (this.f391351z == null) {
            u71 u71Var = this.f391348w;
            u71Var.getClass();
            u71Var.a(j12);
            try {
                u71 u71Var2 = this.f391348w;
                u71Var2.getClass();
                this.f391351z = u71Var2.a();
            } catch (v71 e12) {
                StringBuilder sbA = Cif.a("Subtitle decoding failed. streamFormat=");
                sbA.append(this.f391347v);
                ka0.a("TextRenderer", sbA.toString(), e12);
                List<vm> listEmptyList = Collections.emptyList();
                Handler handler = this.f391339n;
                if (handler != null) {
                    handler.obtainMessage(0, listEmptyList).sendToTarget();
                } else {
                    this.f391340o.onCues(listEmptyList);
                    this.f391340o.a(new xm(listEmptyList));
                }
                z();
                u71 u71Var3 = this.f391348w;
                u71Var3.getClass();
                u71Var3.release();
                this.f391348w = null;
                this.f391346u = 0;
                this.f391345t = true;
                w71 w71Var = this.f391341p;
                vw vwVar = this.f391347v;
                vwVar.getClass();
                this.f391348w = ((w71.a) w71Var).a(vwVar);
                return;
            }
        }
        if (c() != 2) {
            return;
        }
        if (this.f391350y != null) {
            long jY2 = y();
            z12 = false;
            while (jY2 <= j12) {
                this.f391337A++;
                jY2 = y();
                z12 = true;
            }
        } else {
            z12 = false;
        }
        y71 y71Var = this.f391351z;
        if (y71Var != null) {
            if (y71Var.f()) {
                if (!z12 && y() == Long.MAX_VALUE) {
                    if (this.f391346u == 2) {
                        z();
                        u71 u71Var4 = this.f391348w;
                        u71Var4.getClass();
                        u71Var4.release();
                        this.f391348w = null;
                        this.f391346u = 0;
                        this.f391345t = true;
                        w71 w71Var2 = this.f391341p;
                        vw vwVar2 = this.f391347v;
                        vwVar2.getClass();
                        this.f391348w = ((w71.a) w71Var2).a(vwVar2);
                    } else {
                        z();
                        this.f391344s = true;
                    }
                }
            } else if (y71Var.f391444b <= j12) {
                y71 y71Var2 = this.f391350y;
                if (y71Var2 != null) {
                    y71Var2.h();
                }
                this.f391337A = y71Var.a(j12);
                this.f391350y = y71Var;
                this.f391351z = null;
                z12 = true;
            }
        }
        if (z12) {
            this.f391350y.getClass();
            List<vm> listB = this.f391350y.b(j12);
            Handler handler2 = this.f391339n;
            if (handler2 != null) {
                handler2.obtainMessage(0, listB).sendToTarget();
            } else {
                this.f391340o.onCues(listB);
                this.f391340o.a(new xm(listB));
            }
        }
        if (this.f391346u == 2) {
            return;
        }
        while (!this.f391343r) {
            try {
                x71 x71VarB = this.f391349x;
                if (x71VarB == null) {
                    u71 u71Var5 = this.f391348w;
                    u71Var5.getClass();
                    x71VarB = u71Var5.b();
                    if (x71VarB == null) {
                        return;
                    } else {
                        this.f391349x = x71VarB;
                    }
                }
                if (this.f391346u == 1) {
                    x71VarB.d(4);
                    u71 u71Var6 = this.f391348w;
                    u71Var6.getClass();
                    u71Var6.a(x71VarB);
                    this.f391349x = null;
                    this.f391346u = 2;
                    return;
                }
                int iA2 = a(this.f391342q, x71VarB, 0);
                if (iA2 == -4) {
                    if (x71VarB.f()) {
                        this.f391343r = true;
                        this.f391345t = false;
                    } else {
                        vw vwVar3 = this.f391342q.f391506b;
                        if (vwVar3 == null) {
                            return;
                        }
                        x71VarB.f391573i = vwVar3.f391185p;
                        x71VarB.h();
                        this.f391345t &= !x71VarB.g();
                    }
                    if (!this.f391345t) {
                        u71 u71Var7 = this.f391348w;
                        u71Var7.getClass();
                        u71Var7.a(x71VarB);
                        this.f391349x = null;
                    }
                } else if (iA2 == -3) {
                    return;
                }
            } catch (v71 e13) {
                StringBuilder sbA2 = Cif.a("Subtitle decoding failed. streamFormat=");
                sbA2.append(this.f391347v);
                ka0.a("TextRenderer", sbA2.toString(), e13);
                List<vm> listEmptyList2 = Collections.emptyList();
                Handler handler3 = this.f391339n;
                if (handler3 != null) {
                    handler3.obtainMessage(0, listEmptyList2).sendToTarget();
                } else {
                    this.f391340o.onCues(listEmptyList2);
                    this.f391340o.a(new xm(listEmptyList2));
                }
                z();
                u71 u71Var8 = this.f391348w;
                u71Var8.getClass();
                u71Var8.release();
                this.f391348w = null;
                this.f391346u = 0;
                this.f391345t = true;
                w71 w71Var3 = this.f391341p;
                vw vwVar4 = this.f391347v;
                vwVar4.getClass();
                this.f391348w = ((w71.a) w71Var3).a(vwVar4);
                return;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ux0
    public final boolean a() {
        return this.f391344s;
    }

    @Override // com.yandex.mobile.ads.impl.ff
    public final void a(long j12, boolean z12) {
        List<vm> listEmptyList = Collections.emptyList();
        Handler handler = this.f391339n;
        if (handler != null) {
            handler.obtainMessage(0, listEmptyList).sendToTarget();
        } else {
            this.f391340o.onCues(listEmptyList);
            this.f391340o.a(new xm(listEmptyList));
        }
        this.f391343r = false;
        this.f391344s = false;
        this.f391338B = -9223372036854775807L;
        if (this.f391346u != 0) {
            z();
            u71 u71Var = this.f391348w;
            u71Var.getClass();
            u71Var.release();
            this.f391348w = null;
            this.f391346u = 0;
            this.f391345t = true;
            w71 w71Var = this.f391341p;
            vw vwVar = this.f391347v;
            vwVar.getClass();
            this.f391348w = ((w71.a) w71Var).a(vwVar);
            return;
        }
        z();
        u71 u71Var2 = this.f391348w;
        u71Var2.getClass();
        u71Var2.flush();
    }
}
