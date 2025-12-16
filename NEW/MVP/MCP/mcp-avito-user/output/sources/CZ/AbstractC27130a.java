package cZ;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CrmEntryPointStatus.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LcZ/a;", "", "<init>", "()V", "a", "b", "LcZ/a$a;", "LcZ/a$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cZ.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC27130a {

    /* compiled from: CrmEntryPointStatus.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LcZ/a$a;", "LcZ/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cZ.a$a, reason: collision with other inner class name */
    public static final /* data */ class C2047a extends AbstractC27130a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f57929a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f57930b;

        public C2047a(@k String str, @k DeepLink deepLink) {
            super(null);
            this.f57929a = str;
            this.f57930b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2047a)) {
                return false;
            }
            C2047a c2047a = (C2047a) obj;
            return L.f(this.f57929a, c2047a.f57929a) && L.f(this.f57930b, c2047a.f57930b);
        }

        public final int hashCode() {
            return this.f57930b.hashCode() + (this.f57929a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Available(title=");
            sb2.append(this.f57929a);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f57930b, ')');
        }
    }

    /* compiled from: CrmEntryPointStatus.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LcZ/a$b;", "LcZ/a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cZ.a$b */
    public static final /* data */ class b extends AbstractC27130a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f57931a = new b();

        public b() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 74716301;
        }

        @k
        public final String toString() {
            return "Unavailable";
        }
    }

    public /* synthetic */ AbstractC27130a(C42822w c42822w) {
        this();
    }

    public AbstractC27130a() {
    }
}
