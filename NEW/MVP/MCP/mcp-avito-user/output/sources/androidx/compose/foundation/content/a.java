package androidx.compose.foundation.content;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MediaType.android.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/content/a;", "", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C1561a f26972b = new C1561a(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f26973c = new a("text/*");

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f26974d = new a("*/*");

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f26975a;

    /* compiled from: MediaType.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/content/a$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.content.a$a, reason: collision with other inner class name */
    public static final class C1561a {
        public /* synthetic */ C1561a(C42822w c42822w) {
            this();
        }

        public C1561a() {
        }
    }

    public a(@k String str) {
        this.f26975a = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return L.f(this.f26975a, ((a) obj).f26975a);
    }

    public final int hashCode() {
        return this.f26975a.hashCode();
    }

    @k
    public final String toString() {
        return AK.c.s(new StringBuilder("MediaType(representation='"), this.f26975a, "')");
    }
}
