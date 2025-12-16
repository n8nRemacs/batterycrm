package androidx.media3.extractor.ts;

import androidx.media3.common.util.J;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
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
@J
/* loaded from: classes.dex */
public interface D {

    /* compiled from: TsPayloadReader.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f51533a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f51534b;

        public a(String str, byte[] bArr) {
            this.f51533a = str;
            this.f51534b = bArr;
        }
    }

    /* compiled from: TsPayloadReader.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @P
        public final String f51535a;

        /* renamed from: b, reason: collision with root package name */
        public final List<a> f51536b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f51537c;

        public b(int i12, @P String str, @P ArrayList arrayList, byte[] bArr) {
            this.f51535a = str;
            this.f51536b = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
            this.f51537c = bArr;
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
        public final String f51538a;

        /* renamed from: b, reason: collision with root package name */
        public final int f51539b;

        /* renamed from: c, reason: collision with root package name */
        public final int f51540c;

        /* renamed from: d, reason: collision with root package name */
        public int f51541d;

        /* renamed from: e, reason: collision with root package name */
        public String f51542e;

        public e(int i12, int i13) {
            this(BeduinInputModel.MIN_TEXT_VERSION, i12, i13);
        }

        public final void a() {
            int i12 = this.f51541d;
            this.f51541d = i12 == Integer.MIN_VALUE ? this.f51539b : i12 + this.f51540c;
            this.f51542e = this.f51538a + this.f51541d;
        }

        public final void b() {
            if (this.f51541d == Integer.MIN_VALUE) {
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
            this.f51538a = str;
            this.f51539b = i13;
            this.f51540c = i14;
            this.f51541d = BeduinInputModel.MIN_TEXT_VERSION;
            this.f51542e = "";
        }
    }

    void a();

    void b(androidx.media3.common.util.G g12, androidx.media3.extractor.r rVar, e eVar);

    void c(int i12, androidx.media3.common.util.z zVar);
}
