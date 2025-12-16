package com.google.android.exoplayer2.extractor.ts;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.android.exoplayer2.util.O;
import j.P;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: TsPayloadReader.java */
/* loaded from: classes6.dex */
public interface D {

    /* compiled from: TsPayloadReader.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f345031a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f345032b;

        public a(String str, byte[] bArr) {
            this.f345031a = str;
            this.f345032b = bArr;
        }
    }

    /* compiled from: TsPayloadReader.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @P
        public final String f345033a;

        /* renamed from: b, reason: collision with root package name */
        public final List<a> f345034b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f345035c;

        public b(int i12, @P String str, @P ArrayList arrayList, byte[] bArr) {
            this.f345033a = str;
            this.f345034b = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
            this.f345035c = bArr;
        }
    }

    /* compiled from: TsPayloadReader.java */
    public interface c {
    }

    /* compiled from: TsPayloadReader.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    /* compiled from: TsPayloadReader.java */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final String f345036a;

        /* renamed from: b, reason: collision with root package name */
        public final int f345037b;

        /* renamed from: c, reason: collision with root package name */
        public final int f345038c;

        /* renamed from: d, reason: collision with root package name */
        public int f345039d;

        /* renamed from: e, reason: collision with root package name */
        public String f345040e;

        public e(int i12, int i13) {
            this(BeduinInputModel.MIN_TEXT_VERSION, i12, i13);
        }

        public final void a() {
            int i12 = this.f345039d;
            this.f345039d = i12 == Integer.MIN_VALUE ? this.f345037b : i12 + this.f345038c;
            this.f345040e = this.f345036a + this.f345039d;
        }

        public final void b() {
            if (this.f345039d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public e(int i12, int i13, int i14) {
            String str;
            if (i12 != Integer.MIN_VALUE) {
                str = i12 + "/";
            } else {
                str = "";
            }
            this.f345036a = str;
            this.f345037b = i13;
            this.f345038c = i14;
            this.f345039d = BeduinInputModel.MIN_TEXT_VERSION;
            this.f345040e = "";
        }
    }

    void a();

    void b(O o12, com.google.android.exoplayer2.extractor.l lVar, e eVar);

    void c(int i12, com.google.android.exoplayer2.util.F f12);
}
