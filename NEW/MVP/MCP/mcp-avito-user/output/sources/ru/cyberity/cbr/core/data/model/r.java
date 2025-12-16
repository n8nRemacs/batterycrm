package ru.cyberity.cbr.core.data.model;

import com.avito.android.remote.model.payment.PaymentMethodTypeKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.u0;
import kotlin.text.C43066x;
import ru.cyberity.cbr.core.common.x0;
import ru.cyberity.cbr.core.data.source.dynamic.c;

/* compiled from: IdentityType.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000f2\u00020\u0001:\n\u0006\t\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\u0019\b\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0006\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0006\u0010\n\u0082\u0001\t\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lru/cyberity/cbr/core/data/model/r;", "", "Lru/cyberity/cbr/core/data/source/dynamic/c$c;", "strings", "", "fallback", "a", "", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "value", "iconValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "c", "d", "e", "f", "g", "h", "i", "j", "Lru/cyberity/cbr/core/data/model/r$b;", "Lru/cyberity/cbr/core/data/model/r$c;", "Lru/cyberity/cbr/core/data/model/r$d;", "Lru/cyberity/cbr/core/data/model/r$e;", "Lru/cyberity/cbr/core/data/model/r$f;", "Lru/cyberity/cbr/core/data/model/r$g;", "Lru/cyberity/cbr/core/data/model/r$h;", "Lru/cyberity/cbr/core/data/model/r$i;", "Lru/cyberity/cbr/core/data/model/r$j;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public abstract class r {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final String value;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final String iconValue;

    /* compiled from: IdentityType.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lru/cyberity/cbr/core/data/model/r$a;", "", "", "value", "Lru/cyberity/cbr/core/data/model/r;", "a", "OTHER", "Ljava/lang/String;", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.model.r$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Y61.k
        public final r a(@Y61.k String value) {
            switch (value.hashCode()) {
                case -1895130188:
                    if (value.equals("ID_CARD")) {
                        return c.f433185e;
                    }
                    break;
                case -1852691096:
                    if (value.equals("SELFIE")) {
                        return g.f433189e;
                    }
                    break;
                case -1656620757:
                    if (value.equals("DRIVERS")) {
                        return b.f433184e;
                    }
                    break;
                case -790387854:
                    if (value.equals("INSURANCE_CERTIFICATE")) {
                        return d.f433186e;
                    }
                    break;
                case 2634817:
                    if (value.equals("VISA")) {
                        return j.f433191e;
                    }
                    break;
                case 79048533:
                    if (value.equals("SNILS")) {
                        return h.f433190e;
                    }
                    break;
                case 1305942932:
                    if (value.equals("RESIDENCE_PERMIT")) {
                        return f.f433188e;
                    }
                    break;
                case 1999404050:
                    if (value.equals("PASSPORT")) {
                        return e.f433187e;
                    }
                    break;
            }
            return new i(value, x0.a(C43066x.e0(value, new char[]{'_'})));
        }

        private Companion() {
        }
    }

    /* compiled from: IdentityType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/cyberity/cbr/core/data/model/r$b;", "Lru/cyberity/cbr/core/data/model/r;", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends r {

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final b f433184e = new b();

        private b() {
            super("DRIVERS", "drivers", null);
        }
    }

    /* compiled from: IdentityType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/cyberity/cbr/core/data/model/r$c;", "Lru/cyberity/cbr/core/data/model/r;", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class c extends r {

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final c f433185e = new c();

        private c() {
            super("ID_CARD", "idCard", null);
        }
    }

    /* compiled from: IdentityType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/cyberity/cbr/core/data/model/r$d;", "Lru/cyberity/cbr/core/data/model/r;", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class d extends r {

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final d f433186e = new d();

        private d() {
            super("INSURANCE_CERTIFICATE", "insuranceCertificate", null);
        }
    }

    /* compiled from: IdentityType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/cyberity/cbr/core/data/model/r$e;", "Lru/cyberity/cbr/core/data/model/r;", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class e extends r {

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final e f433187e = new e();

        private e() {
            super("PASSPORT", "passport", null);
        }
    }

    /* compiled from: IdentityType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/cyberity/cbr/core/data/model/r$f;", "Lru/cyberity/cbr/core/data/model/r;", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class f extends r {

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final f f433188e = new f();

        private f() {
            super("RESIDENCE_PERMIT", "residencePermit", null);
        }
    }

    /* compiled from: IdentityType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/cyberity/cbr/core/data/model/r$g;", "Lru/cyberity/cbr/core/data/model/r;", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class g extends r {

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final g f433189e = new g();

        private g() {
            super("SELFIE", "selfie", null);
        }
    }

    /* compiled from: IdentityType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/cyberity/cbr/core/data/model/r$h;", "Lru/cyberity/cbr/core/data/model/r;", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class h extends r {

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final h f433190e = new h();

        private h() {
            super("SNILS", "snils", null);
        }
    }

    /* compiled from: IdentityType.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/r$i;", "Lru/cyberity/cbr/core/data/model/r;", "", "value", "iconValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class i extends r {
        public i(@Y61.k String str, @Y61.k String str2) {
            super(str, str2, null);
        }
    }

    /* compiled from: IdentityType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/cyberity/cbr/core/data/model/r$j;", "Lru/cyberity/cbr/core/data/model/r;", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class j extends r {

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final j f433191e = new j();

        private j() {
            super("VISA", PaymentMethodTypeKt.PAYMENT_METHOD_TYPE_VISA, null);
        }
    }

    public /* synthetic */ r(String str, String str2, C42822w c42822w) {
        this(str, str2);
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getIconValue() {
        return this.iconValue;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    private r(String str, String str2) {
        this.value = str;
        this.iconValue = str2;
    }

    public static /* synthetic */ CharSequence a(r rVar, c.C12476c c12476c, CharSequence charSequence, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTitle");
        }
        if ((i12 & 2) != 0) {
            charSequence = null;
        }
        return rVar.a(c12476c, charSequence);
    }

    @Y61.k
    public final CharSequence a(@Y61.k c.C12476c strings, @Y61.l CharSequence fallback) {
        u0 u0Var = u0.f406856a;
        String strA = strings.a(String.format("sns_iddoc_type_%s", Arrays.copyOf(new Object[]{this.value}, 1)));
        return strA != null ? strA : fallback == null ? this.value : fallback;
    }
}
