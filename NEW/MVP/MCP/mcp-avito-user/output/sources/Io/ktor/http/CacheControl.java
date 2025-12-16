package io.ktor.http;

import com.avito.android.remote.model.UserTypeCode;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: CacheControl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/http/CacheControl;", "", "a", "b", "c", "Visibility", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class CacheControl {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Visibility f399842a;

    /* compiled from: CacheControl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/http/CacheControl$Visibility;", "", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Visibility {
        /* JADX INFO: Fake field, exist only in values array */
        Public("public"),
        /* JADX INFO: Fake field, exist only in values array */
        Private(UserTypeCode.PRIVATE);


        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f399844b;

        Visibility(String str) {
            this.f399844b = str;
        }
    }

    /* compiled from: CacheControl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/http/CacheControl$a;", "Lio/ktor/http/CacheControl;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends CacheControl {

        /* renamed from: b, reason: collision with root package name */
        public final int f399845b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Integer f399846c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f399847d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f399848e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12, Integer num, boolean z12, boolean z13, Visibility visibility, int i13, C42822w c42822w) {
            super((i13 & 16) != 0 ? null : visibility);
            num = (i13 & 2) != 0 ? null : num;
            z12 = (i13 & 4) != 0 ? false : z12;
            z13 = (i13 & 8) != 0 ? false : z13;
            this.f399845b = i12;
            this.f399846c = num;
            this.f399847d = z12;
            this.f399848e = z13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (obj != this) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (aVar.f399845b != this.f399845b || !kotlin.jvm.internal.L.f(aVar.f399846c, this.f399846c) || aVar.f399847d != this.f399847d || aVar.f399848e != this.f399848e || aVar.f399842a != this.f399842a) {
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i12 = this.f399845b * 31;
            Integer num = this.f399846c;
            int i13 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((i12 + (num != null ? num.intValue() : 0)) * 31, 31, this.f399847d), 31, this.f399848e);
            Visibility visibility = this.f399842a;
            return i13 + (visibility != null ? visibility.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            ArrayList arrayList = new ArrayList(5);
            arrayList.add("max-age=" + this.f399845b);
            Integer num = this.f399846c;
            if (num != null) {
                arrayList.add("s-maxage=" + num);
            }
            if (this.f399847d) {
                arrayList.add("must-revalidate");
            }
            if (this.f399848e) {
                arrayList.add("proxy-revalidate");
            }
            Visibility visibility = this.f399842a;
            if (visibility != null) {
                arrayList.add(visibility.f399844b);
            }
            return C42745f0.O(arrayList, ", ", null, null, null, 62);
        }
    }

    /* compiled from: CacheControl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/http/CacheControl$b;", "Lio/ktor/http/CacheControl;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends CacheControl {
        public final boolean equals(@Y61.l Object obj) {
            if (obj instanceof b) {
                if (this.f399842a == ((b) obj).f399842a) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            Visibility visibility = this.f399842a;
            if (visibility != null) {
                return visibility.hashCode();
            }
            return 0;
        }

        @Y61.k
        public final String toString() {
            Visibility visibility = this.f399842a;
            if (visibility == null) {
                return "no-cache";
            }
            return "no-cache, " + visibility.f399844b;
        }
    }

    /* compiled from: CacheControl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/http/CacheControl$c;", "Lio/ktor/http/CacheControl;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends CacheControl {
        public final boolean equals(@Y61.l Object obj) {
            return (obj instanceof c) && ((c) obj).f399842a == this.f399842a;
        }

        public final int hashCode() {
            Visibility visibility = this.f399842a;
            if (visibility != null) {
                return visibility.hashCode();
            }
            return 0;
        }

        @Y61.k
        public final String toString() {
            Visibility visibility = this.f399842a;
            if (visibility == null) {
                return "no-store";
            }
            return "no-store, " + visibility.f399844b;
        }
    }

    public CacheControl(@Y61.l Visibility visibility) {
        this.f399842a = visibility;
    }
}
