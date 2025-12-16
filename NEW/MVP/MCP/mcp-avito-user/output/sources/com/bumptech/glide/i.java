package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.ImageView;
import androidx.collection.C20199a;
import com.bumptech.glide.request.target.q;
import j.InterfaceC42154j;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: RequestBuilder.java */
/* loaded from: classes5.dex */
public class i<TranscodeType> extends com.bumptech.glide.request.a<i<TranscodeType>> implements Cloneable, g<i<TranscodeType>> {

    /* renamed from: A, reason: collision with root package name */
    @P
    public Object f338801A;

    /* renamed from: B, reason: collision with root package name */
    @P
    public final ArrayList f338802B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f338803C;

    /* renamed from: v, reason: collision with root package name */
    public final Context f338804v;

    /* renamed from: w, reason: collision with root package name */
    public final j f338805w;

    /* renamed from: x, reason: collision with root package name */
    public final Class<TranscodeType> f338806x;

    /* renamed from: y, reason: collision with root package name */
    public final e f338807y;

    /* renamed from: z, reason: collision with root package name */
    @N
    public k<?, ? super TranscodeType> f338808z;

    /* compiled from: RequestBuilder.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f338809a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f338810b;

        static {
            int[] iArr = new int[Priority.values().length];
            f338810b = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f338810b[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f338810b[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f338810b[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f338809a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f338809a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f338809a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f338809a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f338809a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f338809a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f338809a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f338809a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"CheckResult"})
    public i(@N b bVar, j jVar, Class<TranscodeType> cls, Context context) {
        com.bumptech.glide.request.g gVar;
        this.f338805w = jVar;
        this.f338806x = cls;
        this.f338804v = context;
        C20199a c20199a = jVar.f338812b.f338684d.f338746f;
        k<?, ? super TranscodeType> kVar = (k) c20199a.get(cls);
        if (kVar == null) {
            for (Map.Entry entry : c20199a.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    kVar = (k) entry.getValue();
                }
            }
        }
        this.f338808z = kVar == null ? e.f338740j : kVar;
        this.f338807y = bVar.f338684d;
        Iterator<com.bumptech.glide.request.f<Object>> it = jVar.f338821k.iterator();
        while (it.hasNext()) {
            com.bumptech.glide.request.f<Object> next = it.next();
            if (next != null) {
                if (this.f338802B == null) {
                    this.f338802B = new ArrayList();
                }
                this.f338802B.add(next);
            }
        }
        synchronized (jVar) {
            gVar = jVar.f338822l;
        }
        a(gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    @j.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(@j.N android.widget.ImageView r5) {
        /*
            r4 = this;
            char[] r0 = com.bumptech.glide.util.m.f339649a
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto Lbe
            com.bumptech.glide.util.k.b(r5)
            int r0 = r4.f339538b
            r1 = 2048(0x800, float:2.87E-42)
            boolean r0 = com.bumptech.glide.request.a.l(r0, r1)
            if (r0 != 0) goto L7a
            boolean r0 = r4.f339549m
            if (r0 == 0) goto L7a
            android.widget.ImageView$ScaleType r0 = r5.getScaleType()
            if (r0 == 0) goto L7a
            int[] r0 = com.bumptech.glide.i.a.f338809a
            android.widget.ImageView$ScaleType r1 = r5.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            switch(r0) {
                case 1: goto L6a;
                case 2: goto L58;
                case 3: goto L46;
                case 4: goto L46;
                case 5: goto L46;
                case 6: goto L34;
                default: goto L33;
            }
        L33:
            goto L7a
        L34:
            com.bumptech.glide.i r0 = r4.clone()
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r2 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.f339333b
            com.bumptech.glide.load.resource.bitmap.m r3 = new com.bumptech.glide.load.resource.bitmap.m
            r3.<init>()
            com.bumptech.glide.request.a r0 = r0.m(r2, r3)
            r0.f339556t = r1
            goto L7b
        L46:
            com.bumptech.glide.i r0 = r4.clone()
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r2 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.f339332a
            com.bumptech.glide.load.resource.bitmap.s r3 = new com.bumptech.glide.load.resource.bitmap.s
            r3.<init>()
            com.bumptech.glide.request.a r0 = r0.m(r2, r3)
            r0.f339556t = r1
            goto L7b
        L58:
            com.bumptech.glide.i r0 = r4.clone()
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r2 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.f339333b
            com.bumptech.glide.load.resource.bitmap.m r3 = new com.bumptech.glide.load.resource.bitmap.m
            r3.<init>()
            com.bumptech.glide.request.a r0 = r0.m(r2, r3)
            r0.f339556t = r1
            goto L7b
        L6a:
            com.bumptech.glide.i r0 = r4.clone()
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r1 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.f339334c
            com.bumptech.glide.load.resource.bitmap.l r2 = new com.bumptech.glide.load.resource.bitmap.l
            r2.<init>()
            com.bumptech.glide.request.a r0 = r0.m(r1, r2)
            goto L7b
        L7a:
            r0 = r4
        L7b:
            com.bumptech.glide.e r1 = r4.f338807y
            com.bumptech.glide.request.target.l r1 = r1.f338743c
            r1.getClass()
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            java.lang.Class<TranscodeType> r2 = r4.f338806x
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L92
            com.bumptech.glide.request.target.c r1 = new com.bumptech.glide.request.target.c
            r1.<init>(r5)
            goto L9f
        L92:
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto La5
            com.bumptech.glide.request.target.h r1 = new com.bumptech.glide.request.target.h
            r1.<init>(r5)
        L9f:
            java.util.concurrent.Executor r5 = com.bumptech.glide.util.e.f339638a
            r4.C(r1, r0, r5)
            return
        La5:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unhandled class: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = ", try .as*(Class).transcode(ResourceTranscoder)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        Lbe:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "You must call this method on the main thread"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.i.A(android.widget.ImageView):void");
    }

    @N
    public final void B(@N q qVar) {
        C(qVar, this, com.bumptech.glide.util.e.f339638a);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x00ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(@j.N com.bumptech.glide.request.target.q r19, com.bumptech.glide.request.a r20, java.util.concurrent.Executor r21) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.i.C(com.bumptech.glide.request.target.q, com.bumptech.glide.request.a, java.util.concurrent.Executor):void");
    }

    @Override // com.bumptech.glide.request.a
    @N
    @InterfaceC42154j
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final i<TranscodeType> a(@N com.bumptech.glide.request.a<?> aVar) {
        com.bumptech.glide.util.k.b(aVar);
        return (i) super.a(aVar);
    }

    @Override // com.bumptech.glide.request.a
    @InterfaceC42154j
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final i<TranscodeType> clone() {
        i<TranscodeType> iVar = (i) super.clone();
        iVar.f338808z = iVar.f338808z.clone();
        return iVar;
    }
}
