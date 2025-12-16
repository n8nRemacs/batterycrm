package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.ts.C36516a;
import com.google.android.exoplayer2.extractor.ts.C36518c;
import com.google.android.exoplayer2.extractor.ts.C36520e;
import j.P;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: DefaultExtractorsFactory.java */
/* loaded from: classes6.dex */
public final class g implements n {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f344546b = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* renamed from: c, reason: collision with root package name */
    public static final a f344547c = new a(new com.google.android.exoplayer2.analytics.h(18));

    /* renamed from: d, reason: collision with root package name */
    public static final a f344548d = new a(new com.google.android.exoplayer2.analytics.h(19));

    /* compiled from: DefaultExtractorsFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC10578a f344549a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicBoolean f344550b = new AtomicBoolean(false);

        /* compiled from: DefaultExtractorsFactory.java */
        /* renamed from: com.google.android.exoplayer2.extractor.g$a$a, reason: collision with other inner class name */
        public interface InterfaceC10578a {
            @P
            Constructor<? extends j> b();
        }

        public a(InterfaceC10578a interfaceC10578a) {
            this.f344549a = interfaceC10578a;
        }

        @P
        public final j a(Object... objArr) {
            Constructor<? extends j> constructorB;
            synchronized (this.f344550b) {
                if (!this.f344550b.get()) {
                    try {
                        constructorB = this.f344549a.b();
                    } catch (ClassNotFoundException unused) {
                        this.f344550b.set(true);
                    } catch (Exception e12) {
                        throw new RuntimeException("Error instantiating extension", e12);
                    }
                }
                constructorB = null;
            }
            if (constructorB == null) {
                return null;
            }
            try {
                return constructorB.newInstance(objArr);
            } catch (Exception e13) {
                throw new IllegalStateException("Unexpected error creating extractor", e13);
            }
        }
    }

    public final void a(int i12, ArrayList arrayList) {
        switch (i12) {
            case 0:
                arrayList.add(new C36516a());
                break;
            case 1:
                arrayList.add(new C36518c());
                break;
            case 2:
                arrayList.add(new C36520e(0));
                break;
            case 3:
                arrayList.add(new com.google.android.exoplayer2.extractor.amr.a(0));
                break;
            case 4:
                j jVarA = f344547c.a(0);
                if (jVarA == null) {
                    arrayList.add(new com.google.android.exoplayer2.extractor.flac.c(0));
                    break;
                } else {
                    arrayList.add(jVarA);
                    break;
                }
            case 5:
                arrayList.add(new com.google.android.exoplayer2.extractor.flv.b());
                break;
            case 6:
                arrayList.add(new com.google.android.exoplayer2.extractor.mkv.d(0));
                break;
            case 7:
                arrayList.add(new com.google.android.exoplayer2.extractor.mp3.d(0));
                break;
            case 8:
                arrayList.add(new com.google.android.exoplayer2.extractor.mp4.e(0));
                arrayList.add(new com.google.android.exoplayer2.extractor.mp4.g(0));
                break;
            case 9:
                arrayList.add(new com.google.android.exoplayer2.extractor.ogg.c());
                break;
            case 10:
                arrayList.add(new com.google.android.exoplayer2.extractor.ts.w());
                break;
            case 11:
                arrayList.add(new com.google.android.exoplayer2.extractor.ts.C(0));
                break;
            case 12:
                arrayList.add(new com.google.android.exoplayer2.extractor.wav.a());
                break;
            case 14:
                arrayList.add(new com.google.android.exoplayer2.extractor.jpeg.a());
                break;
            case 15:
                j jVarA2 = f344548d.a(new Object[0]);
                if (jVarA2 != null) {
                    arrayList.add(jVarA2);
                    break;
                }
                break;
            case 16:
                arrayList.add(new com.google.android.exoplayer2.extractor.avi.b());
                break;
        }
    }
}
