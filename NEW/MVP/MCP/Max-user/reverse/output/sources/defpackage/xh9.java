package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import androidx.work.WorkRequest;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class xh9 {
    public static final ThreadLocal w = ThreadLocal.withInitial(new ik(4));
    public final Context a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final bwf f;
    public final bwf g;
    public final bwf h;
    public final bwf i;
    public final bwf j;
    public final bwf k;
    public final bwf l;
    public final bwf m;
    public final bwf n;
    public final bwf o;
    public final bwf p;
    public final bwf q;
    public final bwf r;
    public final bwf s;
    public final bwf t;
    public final bwf u;
    public final bwf v;

    public xh9(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, Context context) {
        this.a = context;
        this.b = k18Var;
        this.c = k18Var2;
        this.d = k18Var3;
        this.e = k18Var4;
        final int i = 8;
        this.f = new bwf(new cm6(this) { // from class: vh9
            public final /* synthetic */ xh9 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return this.b.a.getString(l7b.B0);
                    case 1:
                        return this.b.a.getString(l7b.C0);
                    case 2:
                        return this.b.a.getString(l7b.F0);
                    case 3:
                        return this.b.a.getString(l7b.A0);
                    case 4:
                        return this.b.a.getString(avd.e);
                    case 5:
                        Drawable drawableB = r34.b(this.b.a, yud.Q);
                        if (drawableB != null) {
                            return drawableB;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 6:
                        Drawable drawableB2 = r34.b(this.b.a, yud.l1);
                        if (drawableB2 != null) {
                            return drawableB2;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 7:
                        Drawable drawableB3 = r34.b(this.b.a, yud.y0);
                        if (drawableB3 != null) {
                            return drawableB3;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 8:
                        return az1.i(this.b.a.getString(l7b.D0), ":");
                    case 9:
                        Drawable drawableB4 = r34.b(this.b.a, yud.q);
                        if (drawableB4 != null) {
                            return drawableB4;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 10:
                        Drawable drawableB5 = r34.b(this.b.a, yud.v1);
                        if (drawableB5 != null) {
                            return drawableB5;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 11:
                        Drawable drawableB6 = r34.b(this.b.a, yud.i0);
                        if (drawableB6 != null) {
                            return drawableB6;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        Drawable drawableB7 = r34.b(this.b.a, yud.u1);
                        if (drawableB7 != null) {
                            return drawableB7;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 13:
                        Drawable drawableB8 = r34.b(this.b.a, i7b.h);
                        if (drawableB8 != null) {
                            return drawableB8;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        Drawable drawableB9 = r34.b(this.b.a, i7b.f);
                        if (drawableB9 != null) {
                            return drawableB9;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        return r34.b(this.b.a, i7b.e).mutate();
                    default:
                        return this.b.a.getString(l7b.E0);
                }
            }
        });
        final int i2 = 16;
        this.g = new bwf(new cm6(this) { // from class: vh9
            public final /* synthetic */ xh9 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return this.b.a.getString(l7b.B0);
                    case 1:
                        return this.b.a.getString(l7b.C0);
                    case 2:
                        return this.b.a.getString(l7b.F0);
                    case 3:
                        return this.b.a.getString(l7b.A0);
                    case 4:
                        return this.b.a.getString(avd.e);
                    case 5:
                        Drawable drawableB = r34.b(this.b.a, yud.Q);
                        if (drawableB != null) {
                            return drawableB;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 6:
                        Drawable drawableB2 = r34.b(this.b.a, yud.l1);
                        if (drawableB2 != null) {
                            return drawableB2;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 7:
                        Drawable drawableB3 = r34.b(this.b.a, yud.y0);
                        if (drawableB3 != null) {
                            return drawableB3;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 8:
                        return az1.i(this.b.a.getString(l7b.D0), ":");
                    case 9:
                        Drawable drawableB4 = r34.b(this.b.a, yud.q);
                        if (drawableB4 != null) {
                            return drawableB4;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 10:
                        Drawable drawableB5 = r34.b(this.b.a, yud.v1);
                        if (drawableB5 != null) {
                            return drawableB5;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 11:
                        Drawable drawableB6 = r34.b(this.b.a, yud.i0);
                        if (drawableB6 != null) {
                            return drawableB6;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        Drawable drawableB7 = r34.b(this.b.a, yud.u1);
                        if (drawableB7 != null) {
                            return drawableB7;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 13:
                        Drawable drawableB8 = r34.b(this.b.a, i7b.h);
                        if (drawableB8 != null) {
                            return drawableB8;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        Drawable drawableB9 = r34.b(this.b.a, i7b.f);
                        if (drawableB9 != null) {
                            return drawableB9;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        return r34.b(this.b.a, i7b.e).mutate();
                    default:
                        return this.b.a.getString(l7b.E0);
                }
            }
        });
        final int i3 = 0;
        this.h = new bwf(new cm6(this) { // from class: vh9
            public final /* synthetic */ xh9 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return this.b.a.getString(l7b.B0);
                    case 1:
                        return this.b.a.getString(l7b.C0);
                    case 2:
                        return this.b.a.getString(l7b.F0);
                    case 3:
                        return this.b.a.getString(l7b.A0);
                    case 4:
                        return this.b.a.getString(avd.e);
                    case 5:
                        Drawable drawableB = r34.b(this.b.a, yud.Q);
                        if (drawableB != null) {
                            return drawableB;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 6:
                        Drawable drawableB2 = r34.b(this.b.a, yud.l1);
                        if (drawableB2 != null) {
                            return drawableB2;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 7:
                        Drawable drawableB3 = r34.b(this.b.a, yud.y0);
                        if (drawableB3 != null) {
                            return drawableB3;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 8:
                        return az1.i(this.b.a.getString(l7b.D0), ":");
                    case 9:
                        Drawable drawableB4 = r34.b(this.b.a, yud.q);
                        if (drawableB4 != null) {
                            return drawableB4;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 10:
                        Drawable drawableB5 = r34.b(this.b.a, yud.v1);
                        if (drawableB5 != null) {
                            return drawableB5;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 11:
                        Drawable drawableB6 = r34.b(this.b.a, yud.i0);
                        if (drawableB6 != null) {
                            return drawableB6;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        Drawable drawableB7 = r34.b(this.b.a, yud.u1);
                        if (drawableB7 != null) {
                            return drawableB7;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 13:
                        Drawable drawableB8 = r34.b(this.b.a, i7b.h);
                        if (drawableB8 != null) {
                            return drawableB8;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        Drawable drawableB9 = r34.b(this.b.a, i7b.f);
                        if (drawableB9 != null) {
                            return drawableB9;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        return r34.b(this.b.a, i7b.e).mutate();
                    default:
                        return this.b.a.getString(l7b.E0);
                }
            }
        });
        final int i4 = 1;
        this.i = new bwf(new cm6(this) { // from class: vh9
            public final /* synthetic */ xh9 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return this.b.a.getString(l7b.B0);
                    case 1:
                        return this.b.a.getString(l7b.C0);
                    case 2:
                        return this.b.a.getString(l7b.F0);
                    case 3:
                        return this.b.a.getString(l7b.A0);
                    case 4:
                        return this.b.a.getString(avd.e);
                    case 5:
                        Drawable drawableB = r34.b(this.b.a, yud.Q);
                        if (drawableB != null) {
                            return drawableB;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 6:
                        Drawable drawableB2 = r34.b(this.b.a, yud.l1);
                        if (drawableB2 != null) {
                            return drawableB2;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 7:
                        Drawable drawableB3 = r34.b(this.b.a, yud.y0);
                        if (drawableB3 != null) {
                            return drawableB3;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 8:
                        return az1.i(this.b.a.getString(l7b.D0), ":");
                    case 9:
                        Drawable drawableB4 = r34.b(this.b.a, yud.q);
                        if (drawableB4 != null) {
                            return drawableB4;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 10:
                        Drawable drawableB5 = r34.b(this.b.a, yud.v1);
                        if (drawableB5 != null) {
                            return drawableB5;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 11:
                        Drawable drawableB6 = r34.b(this.b.a, yud.i0);
                        if (drawableB6 != null) {
                            return drawableB6;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        Drawable drawableB7 = r34.b(this.b.a, yud.u1);
                        if (drawableB7 != null) {
                            return drawableB7;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 13:
                        Drawable drawableB8 = r34.b(this.b.a, i7b.h);
                        if (drawableB8 != null) {
                            return drawableB8;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        Drawable drawableB9 = r34.b(this.b.a, i7b.f);
                        if (drawableB9 != null) {
                            return drawableB9;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        return r34.b(this.b.a, i7b.e).mutate();
                    default:
                        return this.b.a.getString(l7b.E0);
                }
            }
        });
        final int i5 = 2;
        this.j = new bwf(new cm6(this) { // from class: vh9
            public final /* synthetic */ xh9 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return this.b.a.getString(l7b.B0);
                    case 1:
                        return this.b.a.getString(l7b.C0);
                    case 2:
                        return this.b.a.getString(l7b.F0);
                    case 3:
                        return this.b.a.getString(l7b.A0);
                    case 4:
                        return this.b.a.getString(avd.e);
                    case 5:
                        Drawable drawableB = r34.b(this.b.a, yud.Q);
                        if (drawableB != null) {
                            return drawableB;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 6:
                        Drawable drawableB2 = r34.b(this.b.a, yud.l1);
                        if (drawableB2 != null) {
                            return drawableB2;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 7:
                        Drawable drawableB3 = r34.b(this.b.a, yud.y0);
                        if (drawableB3 != null) {
                            return drawableB3;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 8:
                        return az1.i(this.b.a.getString(l7b.D0), ":");
                    case 9:
                        Drawable drawableB4 = r34.b(this.b.a, yud.q);
                        if (drawableB4 != null) {
                            return drawableB4;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 10:
                        Drawable drawableB5 = r34.b(this.b.a, yud.v1);
                        if (drawableB5 != null) {
                            return drawableB5;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 11:
                        Drawable drawableB6 = r34.b(this.b.a, yud.i0);
                        if (drawableB6 != null) {
                            return drawableB6;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        Drawable drawableB7 = r34.b(this.b.a, yud.u1);
                        if (drawableB7 != null) {
                            return drawableB7;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 13:
                        Drawable drawableB8 = r34.b(this.b.a, i7b.h);
                        if (drawableB8 != null) {
                            return drawableB8;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        Drawable drawableB9 = r34.b(this.b.a, i7b.f);
                        if (drawableB9 != null) {
                            return drawableB9;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        return r34.b(this.b.a, i7b.e).mutate();
                    default:
                        return this.b.a.getString(l7b.E0);
                }
            }
        });
        final int i6 = 3;
        this.k = new bwf(new cm6(this) { // from class: vh9
            public final /* synthetic */ xh9 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return this.b.a.getString(l7b.B0);
                    case 1:
                        return this.b.a.getString(l7b.C0);
                    case 2:
                        return this.b.a.getString(l7b.F0);
                    case 3:
                        return this.b.a.getString(l7b.A0);
                    case 4:
                        return this.b.a.getString(avd.e);
                    case 5:
                        Drawable drawableB = r34.b(this.b.a, yud.Q);
                        if (drawableB != null) {
                            return drawableB;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 6:
                        Drawable drawableB2 = r34.b(this.b.a, yud.l1);
                        if (drawableB2 != null) {
                            return drawableB2;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 7:
                        Drawable drawableB3 = r34.b(this.b.a, yud.y0);
                        if (drawableB3 != null) {
                            return drawableB3;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 8:
                        return az1.i(this.b.a.getString(l7b.D0), ":");
                    case 9:
                        Drawable drawableB4 = r34.b(this.b.a, yud.q);
                        if (drawableB4 != null) {
                            return drawableB4;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 10:
                        Drawable drawableB5 = r34.b(this.b.a, yud.v1);
                        if (drawableB5 != null) {
                            return drawableB5;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 11:
                        Drawable drawableB6 = r34.b(this.b.a, yud.i0);
                        if (drawableB6 != null) {
                            return drawableB6;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        Drawable drawableB7 = r34.b(this.b.a, yud.u1);
                        if (drawableB7 != null) {
                            return drawableB7;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 13:
                        Drawable drawableB8 = r34.b(this.b.a, i7b.h);
                        if (drawableB8 != null) {
                            return drawableB8;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        Drawable drawableB9 = r34.b(this.b.a, i7b.f);
                        if (drawableB9 != null) {
                            return drawableB9;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        return r34.b(this.b.a, i7b.e).mutate();
                    default:
                        return this.b.a.getString(l7b.E0);
                }
            }
        });
        final int i7 = 4;
        this.l = new bwf(new cm6(this) { // from class: vh9
            public final /* synthetic */ xh9 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return this.b.a.getString(l7b.B0);
                    case 1:
                        return this.b.a.getString(l7b.C0);
                    case 2:
                        return this.b.a.getString(l7b.F0);
                    case 3:
                        return this.b.a.getString(l7b.A0);
                    case 4:
                        return this.b.a.getString(avd.e);
                    case 5:
                        Drawable drawableB = r34.b(this.b.a, yud.Q);
                        if (drawableB != null) {
                            return drawableB;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 6:
                        Drawable drawableB2 = r34.b(this.b.a, yud.l1);
                        if (drawableB2 != null) {
                            return drawableB2;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 7:
                        Drawable drawableB3 = r34.b(this.b.a, yud.y0);
                        if (drawableB3 != null) {
                            return drawableB3;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 8:
                        return az1.i(this.b.a.getString(l7b.D0), ":");
                    case 9:
                        Drawable drawableB4 = r34.b(this.b.a, yud.q);
                        if (drawableB4 != null) {
                            return drawableB4;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 10:
                        Drawable drawableB5 = r34.b(this.b.a, yud.v1);
                        if (drawableB5 != null) {
                            return drawableB5;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 11:
                        Drawable drawableB6 = r34.b(this.b.a, yud.i0);
                        if (drawableB6 != null) {
                            return drawableB6;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        Drawable drawableB7 = r34.b(this.b.a, yud.u1);
                        if (drawableB7 != null) {
                            return drawableB7;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 13:
                        Drawable drawableB8 = r34.b(this.b.a, i7b.h);
                        if (drawableB8 != null) {
                            return drawableB8;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        Drawable drawableB9 = r34.b(this.b.a, i7b.f);
                        if (drawableB9 != null) {
                            return drawableB9;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        return r34.b(this.b.a, i7b.e).mutate();
                    default:
                        return this.b.a.getString(l7b.E0);
                }
            }
        });
        final int i8 = 5;
        this.m = new bwf(new cm6(this) { // from class: vh9
            public final /* synthetic */ xh9 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        return this.b.a.getString(l7b.B0);
                    case 1:
                        return this.b.a.getString(l7b.C0);
                    case 2:
                        return this.b.a.getString(l7b.F0);
                    case 3:
                        return this.b.a.getString(l7b.A0);
                    case 4:
                        return this.b.a.getString(avd.e);
                    case 5:
                        Drawable drawableB = r34.b(this.b.a, yud.Q);
                        if (drawableB != null) {
                            return drawableB;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 6:
                        Drawable drawableB2 = r34.b(this.b.a, yud.l1);
                        if (drawableB2 != null) {
                            return drawableB2;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 7:
                        Drawable drawableB3 = r34.b(this.b.a, yud.y0);
                        if (drawableB3 != null) {
                            return drawableB3;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 8:
                        return az1.i(this.b.a.getString(l7b.D0), ":");
                    case 9:
                        Drawable drawableB4 = r34.b(this.b.a, yud.q);
                        if (drawableB4 != null) {
                            return drawableB4;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 10:
                        Drawable drawableB5 = r34.b(this.b.a, yud.v1);
                        if (drawableB5 != null) {
                            return drawableB5;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 11:
                        Drawable drawableB6 = r34.b(this.b.a, yud.i0);
                        if (drawableB6 != null) {
                            return drawableB6;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        Drawable drawableB7 = r34.b(this.b.a, yud.u1);
                        if (drawableB7 != null) {
                            return drawableB7;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 13:
                        Drawable drawableB8 = r34.b(this.b.a, i7b.h);
                        if (drawableB8 != null) {
                            return drawableB8;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        Drawable drawableB9 = r34.b(this.b.a, i7b.f);
                        if (drawableB9 != null) {
                            return drawableB9;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        return r34.b(this.b.a, i7b.e).mutate();
                    default:
                        return this.b.a.getString(l7b.E0);
                }
            }
        });
        final int i9 = 6;
        this.n = new bwf(new cm6(this) { // from class: vh9
            public final /* synthetic */ xh9 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        return this.b.a.getString(l7b.B0);
                    case 1:
                        return this.b.a.getString(l7b.C0);
                    case 2:
                        return this.b.a.getString(l7b.F0);
                    case 3:
                        return this.b.a.getString(l7b.A0);
                    case 4:
                        return this.b.a.getString(avd.e);
                    case 5:
                        Drawable drawableB = r34.b(this.b.a, yud.Q);
                        if (drawableB != null) {
                            return drawableB;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 6:
                        Drawable drawableB2 = r34.b(this.b.a, yud.l1);
                        if (drawableB2 != null) {
                            return drawableB2;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 7:
                        Drawable drawableB3 = r34.b(this.b.a, yud.y0);
                        if (drawableB3 != null) {
                            return drawableB3;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 8:
                        return az1.i(this.b.a.getString(l7b.D0), ":");
                    case 9:
                        Drawable drawableB4 = r34.b(this.b.a, yud.q);
                        if (drawableB4 != null) {
                            return drawableB4;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 10:
                        Drawable drawableB5 = r34.b(this.b.a, yud.v1);
                        if (drawableB5 != null) {
                            return drawableB5;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 11:
                        Drawable drawableB6 = r34.b(this.b.a, yud.i0);
                        if (drawableB6 != null) {
                            return drawableB6;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        Drawable drawableB7 = r34.b(this.b.a, yud.u1);
                        if (drawableB7 != null) {
                            return drawableB7;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 13:
                        Drawable drawableB8 = r34.b(this.b.a, i7b.h);
                        if (drawableB8 != null) {
                            return drawableB8;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        Drawable drawableB9 = r34.b(this.b.a, i7b.f);
                        if (drawableB9 != null) {
                            return drawableB9;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        return r34.b(this.b.a, i7b.e).mutate();
                    default:
                        return this.b.a.getString(l7b.E0);
                }
            }
        });
        final int i10 = 7;
        this.o = new bwf(new cm6(this) { // from class: vh9
            public final /* synthetic */ xh9 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return this.b.a.getString(l7b.B0);
                    case 1:
                        return this.b.a.getString(l7b.C0);
                    case 2:
                        return this.b.a.getString(l7b.F0);
                    case 3:
                        return this.b.a.getString(l7b.A0);
                    case 4:
                        return this.b.a.getString(avd.e);
                    case 5:
                        Drawable drawableB = r34.b(this.b.a, yud.Q);
                        if (drawableB != null) {
                            return drawableB;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 6:
                        Drawable drawableB2 = r34.b(this.b.a, yud.l1);
                        if (drawableB2 != null) {
                            return drawableB2;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 7:
                        Drawable drawableB3 = r34.b(this.b.a, yud.y0);
                        if (drawableB3 != null) {
                            return drawableB3;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 8:
                        return az1.i(this.b.a.getString(l7b.D0), ":");
                    case 9:
                        Drawable drawableB4 = r34.b(this.b.a, yud.q);
                        if (drawableB4 != null) {
                            return drawableB4;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 10:
                        Drawable drawableB5 = r34.b(this.b.a, yud.v1);
                        if (drawableB5 != null) {
                            return drawableB5;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 11:
                        Drawable drawableB6 = r34.b(this.b.a, yud.i0);
                        if (drawableB6 != null) {
                            return drawableB6;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        Drawable drawableB7 = r34.b(this.b.a, yud.u1);
                        if (drawableB7 != null) {
                            return drawableB7;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 13:
                        Drawable drawableB8 = r34.b(this.b.a, i7b.h);
                        if (drawableB8 != null) {
                            return drawableB8;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        Drawable drawableB9 = r34.b(this.b.a, i7b.f);
                        if (drawableB9 != null) {
                            return drawableB9;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        return r34.b(this.b.a, i7b.e).mutate();
                    default:
                        return this.b.a.getString(l7b.E0);
                }
            }
        });
        final int i11 = 9;
        this.p = new bwf(new cm6(this) { // from class: vh9
            public final /* synthetic */ xh9 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return this.b.a.getString(l7b.B0);
                    case 1:
                        return this.b.a.getString(l7b.C0);
                    case 2:
                        return this.b.a.getString(l7b.F0);
                    case 3:
                        return this.b.a.getString(l7b.A0);
                    case 4:
                        return this.b.a.getString(avd.e);
                    case 5:
                        Drawable drawableB = r34.b(this.b.a, yud.Q);
                        if (drawableB != null) {
                            return drawableB;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 6:
                        Drawable drawableB2 = r34.b(this.b.a, yud.l1);
                        if (drawableB2 != null) {
                            return drawableB2;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 7:
                        Drawable drawableB3 = r34.b(this.b.a, yud.y0);
                        if (drawableB3 != null) {
                            return drawableB3;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 8:
                        return az1.i(this.b.a.getString(l7b.D0), ":");
                    case 9:
                        Drawable drawableB4 = r34.b(this.b.a, yud.q);
                        if (drawableB4 != null) {
                            return drawableB4;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 10:
                        Drawable drawableB5 = r34.b(this.b.a, yud.v1);
                        if (drawableB5 != null) {
                            return drawableB5;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 11:
                        Drawable drawableB6 = r34.b(this.b.a, yud.i0);
                        if (drawableB6 != null) {
                            return drawableB6;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        Drawable drawableB7 = r34.b(this.b.a, yud.u1);
                        if (drawableB7 != null) {
                            return drawableB7;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 13:
                        Drawable drawableB8 = r34.b(this.b.a, i7b.h);
                        if (drawableB8 != null) {
                            return drawableB8;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        Drawable drawableB9 = r34.b(this.b.a, i7b.f);
                        if (drawableB9 != null) {
                            return drawableB9;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        return r34.b(this.b.a, i7b.e).mutate();
                    default:
                        return this.b.a.getString(l7b.E0);
                }
            }
        });
        final int i12 = 10;
        this.q = new bwf(new cm6(this) { // from class: vh9
            public final /* synthetic */ xh9 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return this.b.a.getString(l7b.B0);
                    case 1:
                        return this.b.a.getString(l7b.C0);
                    case 2:
                        return this.b.a.getString(l7b.F0);
                    case 3:
                        return this.b.a.getString(l7b.A0);
                    case 4:
                        return this.b.a.getString(avd.e);
                    case 5:
                        Drawable drawableB = r34.b(this.b.a, yud.Q);
                        if (drawableB != null) {
                            return drawableB;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 6:
                        Drawable drawableB2 = r34.b(this.b.a, yud.l1);
                        if (drawableB2 != null) {
                            return drawableB2;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 7:
                        Drawable drawableB3 = r34.b(this.b.a, yud.y0);
                        if (drawableB3 != null) {
                            return drawableB3;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 8:
                        return az1.i(this.b.a.getString(l7b.D0), ":");
                    case 9:
                        Drawable drawableB4 = r34.b(this.b.a, yud.q);
                        if (drawableB4 != null) {
                            return drawableB4;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 10:
                        Drawable drawableB5 = r34.b(this.b.a, yud.v1);
                        if (drawableB5 != null) {
                            return drawableB5;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 11:
                        Drawable drawableB6 = r34.b(this.b.a, yud.i0);
                        if (drawableB6 != null) {
                            return drawableB6;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        Drawable drawableB7 = r34.b(this.b.a, yud.u1);
                        if (drawableB7 != null) {
                            return drawableB7;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 13:
                        Drawable drawableB8 = r34.b(this.b.a, i7b.h);
                        if (drawableB8 != null) {
                            return drawableB8;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        Drawable drawableB9 = r34.b(this.b.a, i7b.f);
                        if (drawableB9 != null) {
                            return drawableB9;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        return r34.b(this.b.a, i7b.e).mutate();
                    default:
                        return this.b.a.getString(l7b.E0);
                }
            }
        });
        final int i13 = 11;
        this.r = new bwf(new cm6(this) { // from class: vh9
            public final /* synthetic */ xh9 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return this.b.a.getString(l7b.B0);
                    case 1:
                        return this.b.a.getString(l7b.C0);
                    case 2:
                        return this.b.a.getString(l7b.F0);
                    case 3:
                        return this.b.a.getString(l7b.A0);
                    case 4:
                        return this.b.a.getString(avd.e);
                    case 5:
                        Drawable drawableB = r34.b(this.b.a, yud.Q);
                        if (drawableB != null) {
                            return drawableB;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 6:
                        Drawable drawableB2 = r34.b(this.b.a, yud.l1);
                        if (drawableB2 != null) {
                            return drawableB2;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 7:
                        Drawable drawableB3 = r34.b(this.b.a, yud.y0);
                        if (drawableB3 != null) {
                            return drawableB3;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 8:
                        return az1.i(this.b.a.getString(l7b.D0), ":");
                    case 9:
                        Drawable drawableB4 = r34.b(this.b.a, yud.q);
                        if (drawableB4 != null) {
                            return drawableB4;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 10:
                        Drawable drawableB5 = r34.b(this.b.a, yud.v1);
                        if (drawableB5 != null) {
                            return drawableB5;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 11:
                        Drawable drawableB6 = r34.b(this.b.a, yud.i0);
                        if (drawableB6 != null) {
                            return drawableB6;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        Drawable drawableB7 = r34.b(this.b.a, yud.u1);
                        if (drawableB7 != null) {
                            return drawableB7;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 13:
                        Drawable drawableB8 = r34.b(this.b.a, i7b.h);
                        if (drawableB8 != null) {
                            return drawableB8;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        Drawable drawableB9 = r34.b(this.b.a, i7b.f);
                        if (drawableB9 != null) {
                            return drawableB9;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        return r34.b(this.b.a, i7b.e).mutate();
                    default:
                        return this.b.a.getString(l7b.E0);
                }
            }
        });
        final int i14 = 12;
        this.s = new bwf(new cm6(this) { // from class: vh9
            public final /* synthetic */ xh9 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return this.b.a.getString(l7b.B0);
                    case 1:
                        return this.b.a.getString(l7b.C0);
                    case 2:
                        return this.b.a.getString(l7b.F0);
                    case 3:
                        return this.b.a.getString(l7b.A0);
                    case 4:
                        return this.b.a.getString(avd.e);
                    case 5:
                        Drawable drawableB = r34.b(this.b.a, yud.Q);
                        if (drawableB != null) {
                            return drawableB;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 6:
                        Drawable drawableB2 = r34.b(this.b.a, yud.l1);
                        if (drawableB2 != null) {
                            return drawableB2;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 7:
                        Drawable drawableB3 = r34.b(this.b.a, yud.y0);
                        if (drawableB3 != null) {
                            return drawableB3;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 8:
                        return az1.i(this.b.a.getString(l7b.D0), ":");
                    case 9:
                        Drawable drawableB4 = r34.b(this.b.a, yud.q);
                        if (drawableB4 != null) {
                            return drawableB4;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 10:
                        Drawable drawableB5 = r34.b(this.b.a, yud.v1);
                        if (drawableB5 != null) {
                            return drawableB5;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 11:
                        Drawable drawableB6 = r34.b(this.b.a, yud.i0);
                        if (drawableB6 != null) {
                            return drawableB6;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        Drawable drawableB7 = r34.b(this.b.a, yud.u1);
                        if (drawableB7 != null) {
                            return drawableB7;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 13:
                        Drawable drawableB8 = r34.b(this.b.a, i7b.h);
                        if (drawableB8 != null) {
                            return drawableB8;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        Drawable drawableB9 = r34.b(this.b.a, i7b.f);
                        if (drawableB9 != null) {
                            return drawableB9;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        return r34.b(this.b.a, i7b.e).mutate();
                    default:
                        return this.b.a.getString(l7b.E0);
                }
            }
        });
        final int i15 = 13;
        this.t = new bwf(new cm6(this) { // from class: vh9
            public final /* synthetic */ xh9 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return this.b.a.getString(l7b.B0);
                    case 1:
                        return this.b.a.getString(l7b.C0);
                    case 2:
                        return this.b.a.getString(l7b.F0);
                    case 3:
                        return this.b.a.getString(l7b.A0);
                    case 4:
                        return this.b.a.getString(avd.e);
                    case 5:
                        Drawable drawableB = r34.b(this.b.a, yud.Q);
                        if (drawableB != null) {
                            return drawableB;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 6:
                        Drawable drawableB2 = r34.b(this.b.a, yud.l1);
                        if (drawableB2 != null) {
                            return drawableB2;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 7:
                        Drawable drawableB3 = r34.b(this.b.a, yud.y0);
                        if (drawableB3 != null) {
                            return drawableB3;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 8:
                        return az1.i(this.b.a.getString(l7b.D0), ":");
                    case 9:
                        Drawable drawableB4 = r34.b(this.b.a, yud.q);
                        if (drawableB4 != null) {
                            return drawableB4;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 10:
                        Drawable drawableB5 = r34.b(this.b.a, yud.v1);
                        if (drawableB5 != null) {
                            return drawableB5;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 11:
                        Drawable drawableB6 = r34.b(this.b.a, yud.i0);
                        if (drawableB6 != null) {
                            return drawableB6;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        Drawable drawableB7 = r34.b(this.b.a, yud.u1);
                        if (drawableB7 != null) {
                            return drawableB7;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 13:
                        Drawable drawableB8 = r34.b(this.b.a, i7b.h);
                        if (drawableB8 != null) {
                            return drawableB8;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        Drawable drawableB9 = r34.b(this.b.a, i7b.f);
                        if (drawableB9 != null) {
                            return drawableB9;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        return r34.b(this.b.a, i7b.e).mutate();
                    default:
                        return this.b.a.getString(l7b.E0);
                }
            }
        });
        final int i16 = 14;
        this.u = new bwf(new cm6(this) { // from class: vh9
            public final /* synthetic */ xh9 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return this.b.a.getString(l7b.B0);
                    case 1:
                        return this.b.a.getString(l7b.C0);
                    case 2:
                        return this.b.a.getString(l7b.F0);
                    case 3:
                        return this.b.a.getString(l7b.A0);
                    case 4:
                        return this.b.a.getString(avd.e);
                    case 5:
                        Drawable drawableB = r34.b(this.b.a, yud.Q);
                        if (drawableB != null) {
                            return drawableB;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 6:
                        Drawable drawableB2 = r34.b(this.b.a, yud.l1);
                        if (drawableB2 != null) {
                            return drawableB2;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 7:
                        Drawable drawableB3 = r34.b(this.b.a, yud.y0);
                        if (drawableB3 != null) {
                            return drawableB3;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 8:
                        return az1.i(this.b.a.getString(l7b.D0), ":");
                    case 9:
                        Drawable drawableB4 = r34.b(this.b.a, yud.q);
                        if (drawableB4 != null) {
                            return drawableB4;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 10:
                        Drawable drawableB5 = r34.b(this.b.a, yud.v1);
                        if (drawableB5 != null) {
                            return drawableB5;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 11:
                        Drawable drawableB6 = r34.b(this.b.a, yud.i0);
                        if (drawableB6 != null) {
                            return drawableB6;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        Drawable drawableB7 = r34.b(this.b.a, yud.u1);
                        if (drawableB7 != null) {
                            return drawableB7;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 13:
                        Drawable drawableB8 = r34.b(this.b.a, i7b.h);
                        if (drawableB8 != null) {
                            return drawableB8;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        Drawable drawableB9 = r34.b(this.b.a, i7b.f);
                        if (drawableB9 != null) {
                            return drawableB9;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        return r34.b(this.b.a, i7b.e).mutate();
                    default:
                        return this.b.a.getString(l7b.E0);
                }
            }
        });
        final int i17 = 15;
        this.v = new bwf(new cm6(this) { // from class: vh9
            public final /* synthetic */ xh9 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        return this.b.a.getString(l7b.B0);
                    case 1:
                        return this.b.a.getString(l7b.C0);
                    case 2:
                        return this.b.a.getString(l7b.F0);
                    case 3:
                        return this.b.a.getString(l7b.A0);
                    case 4:
                        return this.b.a.getString(avd.e);
                    case 5:
                        Drawable drawableB = r34.b(this.b.a, yud.Q);
                        if (drawableB != null) {
                            return drawableB;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 6:
                        Drawable drawableB2 = r34.b(this.b.a, yud.l1);
                        if (drawableB2 != null) {
                            return drawableB2;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 7:
                        Drawable drawableB3 = r34.b(this.b.a, yud.y0);
                        if (drawableB3 != null) {
                            return drawableB3;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 8:
                        return az1.i(this.b.a.getString(l7b.D0), ":");
                    case 9:
                        Drawable drawableB4 = r34.b(this.b.a, yud.q);
                        if (drawableB4 != null) {
                            return drawableB4;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 10:
                        Drawable drawableB5 = r34.b(this.b.a, yud.v1);
                        if (drawableB5 != null) {
                            return drawableB5;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 11:
                        Drawable drawableB6 = r34.b(this.b.a, yud.i0);
                        if (drawableB6 != null) {
                            return drawableB6;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        Drawable drawableB7 = r34.b(this.b.a, yud.u1);
                        if (drawableB7 != null) {
                            return drawableB7;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 13:
                        Drawable drawableB8 = r34.b(this.b.a, i7b.h);
                        if (drawableB8 != null) {
                            return drawableB8;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        Drawable drawableB9 = r34.b(this.b.a, i7b.f);
                        if (drawableB9 != null) {
                            return drawableB9;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        return r34.b(this.b.a, i7b.e).mutate();
                    default:
                        return this.b.a.getString(l7b.E0);
                }
            }
        });
    }

    public static int f(boolean z, boolean z2) {
        if (!z2 || z) {
            return z ? kti.d(20 * vw4.d().getDisplayMetrics().density) : kti.d(8 * vw4.d().getDisplayMetrics().density);
        }
        return 0;
    }

    public final Layout a(lz lzVar, boolean z) {
        return h18.a(g(), az1.i((String) this.k.getValue(), ":"), h().a(vz2.h), b(lzVar, f(z, true)), 1, false, null, 0.0f, false, 496);
    }

    public final int b(lz lzVar, int i) {
        int iD;
        int iQ;
        int iD2;
        m00 m00Var = lzVar.b;
        if (m00Var instanceof bff) {
            iQ = kti.d(((bff) m00Var).a.Y * vw4.d().getDisplayMetrics().density);
            iD2 = kti.d(10 * vw4.d().getDisplayMetrics().density);
        } else {
            boolean z = m00Var instanceof m40;
            k18 k18Var = this.c;
            if (!z) {
                iD = m00Var instanceof b5h ? kti.d(228 * vw4.d().getDisplayMetrics().density) : ((dza) ((eu0) k18Var.getValue())).a();
                return iD - i;
            }
            int iIntValue = ((Number) ((dza) ((eu0) k18Var.getValue())).d.getValue()).intValue();
            float f = 192;
            iQ = (int) ((u45.q(f, vw4.d().getDisplayMetrics().density, iIntValue) * ((n7j.e(((m40) m00Var).i, 1000L, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) - 1000) / 29000)) + kti.d(vw4.d().getDisplayMetrics().density * f));
            iD2 = kti.d(10 * vw4.d().getDisplayMetrics().density);
        }
        iD = iQ - (iD2 * 2);
        return iD - i;
    }

    public final Layout c(CharSequence charSequence, lz lzVar, boolean z, boolean z2, boolean z3, boolean z4) {
        int iF = f(z4, false);
        if (z) {
            iF = u45.c(36, vw4.d().getDisplayMetrics().density, iF);
        }
        int iB = b(lzVar, iF);
        if (!z2) {
            return h18.a(g(), charSequence, h().a(vz2.k), iB, 1, false, null, 0.0f, false, 496);
        }
        return kpi.b(this.a, g(), charSequence, iB, h().a(vz2.k), new xn3(z3, 3));
    }

    public final Layout d(String str, lz lzVar, boolean z, Drawable drawable) {
        CharSequence spannedString = str;
        if (drawable != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            gbj.b(spannableStringBuilder, "\u200b", new wh9(drawable));
            gbj.b(spannableStringBuilder, "\u200b", new h7f(kti.d(2 * vw4.d().getDisplayMetrics().density)));
            spannableStringBuilder.append((CharSequence) str);
            spannedString = new SpannedString(spannableStringBuilder);
        }
        return h18.a(g(), spannedString, h().a(vz2.g), b(lzVar, f(z, false)), 1, false, null, 0.0f, false, 496);
    }

    public final Layout e(CharSequence charSequence, lz lzVar, boolean z) {
        h18 h18VarG = g();
        if (charSequence == null) {
            charSequence = "";
        }
        return h18.a(h18VarG, charSequence, h().a(vz2.g), b(lzVar, f(z, false)), 1, false, null, 0.0f, false, 496);
    }

    public final h18 g() {
        return (h18) this.b.getValue();
    }

    public final b5g h() {
        return (b5g) this.e.getValue();
    }
}
