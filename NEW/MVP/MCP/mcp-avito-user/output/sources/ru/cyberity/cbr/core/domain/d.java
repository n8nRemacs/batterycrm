package ru.cyberity.cbr.core.domain;

import android.content.Context;
import android.os.Build;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.android.gms.common.C36687f;
import com.google.android.gms.common.C36688g;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;
import org.json.JSONObject;

/* compiled from: CBRFaceDetector.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00052\u00020\u0001:\u0002\u0005\tB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0007H\u0002J\u0010\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\f"}, d2 = {"Lru/cyberity/cbr/core/domain/d;", "", "Landroid/content/Context;", "context", "", "a", "enabledInConfig", "Lru/cyberity/cbr/core/domain/d$b;", "Lru/cyberity/cbr/core/domain/a;", "b", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private static final a f433932a = new a(null);

    /* compiled from: CBRFaceDetector.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/domain/d$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: CBRFaceDetector.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lru/cyberity/cbr/core/domain/d$b;", "", "", "mlKit", "tflow", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "d", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean mlKit;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean tflow;

        /* JADX WARN: Illegal instructions before constructor call */
        public b() {
            boolean z12 = false;
            this(z12, z12, 3, null);
        }

        /* renamed from: c, reason: from getter */
        public final boolean getMlKit() {
            return this.mlKit;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getTflow() {
            return this.tflow;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.mlKit == bVar.mlKit && this.tflow == bVar.tflow;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z12 = this.mlKit;
            ?? r02 = z12;
            if (z12) {
                r02 = 1;
            }
            int i12 = r02 * 31;
            boolean z13 = this.tflow;
            return i12 + (z13 ? 1 : z13 ? 1 : 0);
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("FaceDetectorConfig(mlKit=");
            sb2.append(this.mlKit);
            sb2.append(", tflow=");
            return r.x(sb2, this.tflow, ')');
        }

        public b(boolean z12, boolean z13) {
            this.mlKit = z12;
            this.tflow = z13;
        }

        public /* synthetic */ b(boolean z12, boolean z13, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? false : z13);
        }
    }

    private final boolean a(Context context) {
        if (context == null) {
            e.a(e.f433935a, "FaceDetectorFactory", "@isGooglePlayServicesAvailable, Context is null", null, 4, null);
            return false;
        }
        try {
            boolean z12 = C36687f.f349287e.c(C36688g.f349288a, context) == 0;
            e.a(e.f433935a, "FaceDetectorFactory", "@isGooglePlayServicesAvailable, Has connection to GP Services: " + z12, null, 4, null);
            return z12;
        } catch (Throwable th2) {
            e.f433935a.a("FaceDetectorFactory", "@isGooglePlayServicesAvailable, Failed to check GP Services", th2);
            return false;
        }
    }

    @Y61.k
    public final ru.cyberity.cbr.core.domain.a b(@Y61.l Context context) {
        b bVarA = a();
        if (bVarA.getTflow() && context != null) {
            try {
                e.a(e.f433935a, "FaceDetectorFactory", "Using TensorFlow Face detector", null, 4, null);
                return new h(context.getApplicationContext());
            } catch (Throwable th2) {
                e.f433935a.a("FaceDetectorFactory", "Using native Face detector", th2);
                return new g();
            }
        }
        if (a(context, bVarA.getMlKit())) {
            e.a(e.f433935a, "FaceDetectorFactory", "MLKit is disabled. Using native Face detector", null, 4, null);
            return new g();
        }
        try {
            e.a(e.f433935a, "FaceDetectorFactory", "Using MLKit Face detector", null, 4, null);
            return new f();
        } catch (Throwable th3) {
            e.f433935a.a("FaceDetectorFactory", "Using native Face detector", th3);
            return new g();
        }
    }

    private final boolean a(Context context, boolean enabledInConfig) {
        e eVar = e.f433935a;
        e.a(eVar, "FaceDetectorFactory", "@isMlKitDisabled, Checking is MLKit disabled", null, 4, null);
        if (!enabledInConfig) {
            e.a(eVar, "FaceDetectorFactory", "@isMlKitDisabled, MLKit disabled with FF", null, 4, null);
            return true;
        }
        String str = Build.MANUFACTURER;
        if (str != null && C43066x.q(str.toLowerCase(Locale.ROOT), "huawei", false)) {
            e.a(eVar, "FaceDetectorFactory", "@isMlKitDisabled, manufacturer is Huawei", null, 4, null);
            return true;
        }
        if (a(context)) {
            return false;
        }
        e.a(eVar, "FaceDetectorFactory", "@isMlKitDisabled, no connection to GP Services", null, 4, null);
        return true;
    }

    private final b a() {
        boolean z12 = false;
        try {
            JSONObject jSONObject = new JSONObject(ru.cyberity.ff.a.f435638a.h().f());
            return new b(jSONObject.optBoolean("mlkit", false), jSONObject.optBoolean("tflow", false));
        } catch (Exception e12) {
            ru.cyberity.log.b.b(ru.cyberity.log.a.f436064a, "FaceDetectorFactory", "Failed to parse config: " + ru.cyberity.ff.a.f435638a.h().f(), e12);
            return new b(z12, z12, 3, null);
        }
    }
}
