package com.otaliastudios.opengl.texture;

import X41.j;
import Y61.l;
import android.opengl.GLES20;
import com.otaliastudios.opengl.core.f;
import com.otaliastudios.opengl.core.g;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.s0;

/* compiled from: GlTexture.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/opengl/texture/c;", "Lcom/otaliastudios/opengl/core/g;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final int f365959a;

    /* renamed from: b, reason: collision with root package name */
    public final int f365960b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f365961c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f365962d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f365963e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Integer f365964f;

    /* renamed from: g, reason: collision with root package name */
    public final int f365965g;

    /* compiled from: GlTexture.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 5, 1})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Integer f365967m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Integer num) {
            super(0);
            this.f365967m = num;
        }

        @Override // Y41.a
        public final G0 invoke() {
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            c cVar = c.this;
            if (cVar.f365961c != null && (num = cVar.f365962d) != null && (num2 = cVar.f365963e) != null && (num3 = this.f365967m) != null && (num4 = cVar.f365964f) != null) {
                int i12 = s0.f410475c;
                GLES20.glTexImage2D(cVar.f365960b, 0, num3.intValue(), cVar.f365961c.intValue(), num.intValue(), 0, num2.intValue(), num4.intValue(), null);
            }
            int i13 = s0.f410475c;
            int i14 = q11.g.f428983g;
            float f12 = q11.g.f428988l;
            int i15 = cVar.f365960b;
            GLES20.glTexParameterf(i15, i14, f12);
            GLES20.glTexParameterf(i15, q11.g.f428984h, q11.g.f428989m);
            int i16 = q11.g.f428985i;
            int i17 = q11.g.f428987k;
            GLES20.glTexParameteri(i15, i16, i17);
            GLES20.glTexParameteri(i15, q11.g.f428986j, i17);
            f.b("glTexParameter");
            return G0.f406611a;
        }
    }

    @j
    public c() {
        this(0, 0, null, 7, null);
    }

    public final void a() {
        int i12 = s0.f410475c;
        GLES20.glActiveTexture(this.f365959a);
        GLES20.glBindTexture(this.f365960b, this.f365965g);
        f.b("bind");
    }

    public final void b() {
        int i12 = s0.f410475c;
        GLES20.glBindTexture(this.f365960b, 0);
        GLES20.glActiveTexture(q11.g.f428981e);
        f.b("unbind");
    }

    public c(int i12, int i13, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
        int iIntValue;
        this.f365959a = i12;
        this.f365960b = i13;
        this.f365961c = num2;
        this.f365962d = num3;
        this.f365963e = num4;
        this.f365964f = num6;
        if (num == null) {
            int[] iArr = {iArr[0]};
            int i14 = iArr[0];
            int i15 = s0.f410475c;
            int[] iArr2 = {i14};
            GLES20.glGenTextures(1, iArr2, 0);
            G0 g02 = G0.f406611a;
            f.b("glGenTextures");
            iIntValue = iArr[0];
        } else {
            iIntValue = num.intValue();
        }
        this.f365965g = iIntValue;
        if (num == null) {
            a aVar = new a(num5);
            a();
            aVar.invoke();
            b();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, C42822w c42822w) {
        int i22 = (i19 & 16) != 0 ? q11.g.f428979c : i16;
        this(i12, i13, null, Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i22), Integer.valueOf((i19 & 32) != 0 ? i22 : i17), Integer.valueOf((i19 & 64) != 0 ? q11.g.f428977a : i18));
    }

    public c(int i12, int i13, Integer num, int i14, C42822w c42822w) {
        this((i14 & 1) != 0 ? q11.g.f428981e : i12, (i14 & 2) != 0 ? q11.g.f428982f : i13, (i14 & 4) != 0 ? null : num, null, null, null, null, null);
    }
}
