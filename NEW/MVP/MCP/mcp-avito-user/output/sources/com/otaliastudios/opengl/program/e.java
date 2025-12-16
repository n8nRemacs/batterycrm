package com.otaliastudios.opengl.program;

import Y61.k;
import android.opengl.GLES20;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.s0;

/* compiled from: GlProgramLocation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/otaliastudios/opengl/program/e;", "", "a", "b", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f365941c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f365942a;

    /* renamed from: b, reason: collision with root package name */
    public final int f365943b;

    /* compiled from: GlProgramLocation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/otaliastudios/opengl/program/e$a;", "", "<init>", "()V", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GlProgramLocation.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/opengl/program/e$b;", "", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f365944b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f365945c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ b[] f365946d;

        static {
            b bVar = new b("ATTRIB", 0);
            f365944b = bVar;
            b bVar2 = new b("UNIFORM", 1);
            f365945c = bVar2;
            f365946d = new b[]{bVar, bVar2};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f365946d.clone();
        }
    }

    /* compiled from: GlProgramLocation.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class c {
        static {
            int[] iArr = new int[b.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
        }
    }

    public e(int i12, b bVar, String str, C42822w c42822w) {
        int iGlGetAttribLocation;
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == 0) {
            int i13 = s0.f410475c;
            iGlGetAttribLocation = GLES20.glGetAttribLocation(i12, str);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            int i14 = s0.f410475c;
            iGlGetAttribLocation = GLES20.glGetUniformLocation(i12, str);
        }
        this.f365942a = iGlGetAttribLocation;
        float[] fArr = com.otaliastudios.opengl.core.f.f365917a;
        if (iGlGetAttribLocation < 0) {
            throw new RuntimeException(AK.c.k("Unable to locate ", str, " in program"));
        }
        this.f365943b = iGlGetAttribLocation;
    }
}
