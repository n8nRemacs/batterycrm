package com.facebook.imagepipeline.decoder;

import com.facebook.common.internal.o;
import com.facebook.common.internal.u;
import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import java.io.InputStream;
import okhttp3.internal.http2.Http2;
import wW0.InterfaceC49570a;

/* compiled from: ProgressiveJpegParser.java */
@Nullsafe
/* loaded from: classes12.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public int f340399a;

    /* renamed from: b, reason: collision with root package name */
    public int f340400b;

    /* renamed from: c, reason: collision with root package name */
    public int f340401c;

    /* renamed from: d, reason: collision with root package name */
    public int f340402d;

    /* renamed from: e, reason: collision with root package name */
    public int f340403e;

    /* renamed from: f, reason: collision with root package name */
    public int f340404f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f340405g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC49570a f340406h;

    public e(InterfaceC49570a interfaceC49570a) {
        interfaceC49570a.getClass();
        this.f340406h = interfaceC49570a;
        this.f340401c = 0;
        this.f340400b = 0;
        this.f340402d = 0;
        this.f340404f = 0;
        this.f340403e = 0;
        this.f340399a = 0;
    }

    public final boolean a(wW0.f fVar) throws Throwable {
        int i12;
        int i13 = this.f340403e;
        while (this.f340399a != 6 && (i12 = fVar.read()) != -1) {
            try {
                int i14 = this.f340401c;
                this.f340401c = i14 + 1;
                if (this.f340405g) {
                    this.f340399a = 6;
                    this.f340405g = false;
                    return false;
                }
                int i15 = this.f340399a;
                if (i15 != 0) {
                    if (i15 != 1) {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                if (i15 == 4) {
                                    this.f340399a = 5;
                                } else if (i15 != 5) {
                                    o.d(false);
                                } else {
                                    int i16 = ((this.f340400b << 8) + i12) - 2;
                                    com.facebook.common.util.f.a(fVar, i16);
                                    this.f340401c += i16;
                                    this.f340399a = 2;
                                }
                            } else if (i12 == 255) {
                                this.f340399a = 3;
                            } else if (i12 == 0) {
                                this.f340399a = 2;
                            } else if (i12 == 217) {
                                this.f340405g = true;
                                int i17 = i14 - 1;
                                int i18 = this.f340402d;
                                if (i18 > 0) {
                                    this.f340404f = i17;
                                }
                                this.f340402d = i18 + 1;
                                this.f340403e = i18;
                                this.f340399a = 2;
                            } else {
                                if (i12 == 218) {
                                    int i19 = i14 - 1;
                                    int i22 = this.f340402d;
                                    if (i22 > 0) {
                                        this.f340404f = i19;
                                    }
                                    this.f340402d = i22 + 1;
                                    this.f340403e = i22;
                                }
                                if (i12 == 1 || ((i12 >= 208 && i12 <= 215) || i12 == 217 || i12 == 216)) {
                                    this.f340399a = 2;
                                } else {
                                    this.f340399a = 4;
                                }
                            }
                        } else if (i12 == 255) {
                            this.f340399a = 3;
                        }
                    } else if (i12 == 216) {
                        this.f340399a = 2;
                    } else {
                        this.f340399a = 6;
                    }
                } else if (i12 == 255) {
                    this.f340399a = 1;
                } else {
                    this.f340399a = 6;
                }
                this.f340400b = i12;
            } catch (IOException e12) {
                u.a(e12);
                throw null;
            }
        }
        return (this.f340399a == 6 || this.f340403e == i13) ? false : true;
    }

    public final boolean b(YW0.d dVar) {
        if (this.f340399a == 6 || dVar.g() <= this.f340401c) {
            return false;
        }
        InputStream inputStreamF = dVar.f();
        inputStreamF.getClass();
        InterfaceC49570a interfaceC49570a = this.f340406h;
        wW0.f fVar = new wW0.f(inputStreamF, interfaceC49570a.get(Http2.INITIAL_MAX_FRAME_SIZE), interfaceC49570a);
        try {
            try {
                com.facebook.common.util.f.a(fVar, this.f340401c);
                return a(fVar);
            } catch (IOException e12) {
                u.a(e12);
                throw null;
            }
        } finally {
            com.facebook.common.internal.e.b(fVar);
        }
    }
}
