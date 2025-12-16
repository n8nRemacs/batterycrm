package Gs;

import X41.g;
import Y61.k;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CriticalSection.kt */
@g
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"LGs/a;", "", "a", "name", "", "_common_critical-sections_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Gs.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13912a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C0376a f6752b = new C0376a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f6753a;

    /* compiled from: CriticalSection.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LGs/a$a;", "", "<init>", "()V", "_common_critical-sections_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gs.a$a, reason: collision with other inner class name */
    public static final class C0376a {
        public /* synthetic */ C0376a(C42822w c42822w) {
            this();
        }

        public C0376a() {
        }
    }

    private /* synthetic */ C13912a(String str) {
        this.f6753a = str;
    }

    public static final /* synthetic */ C13912a a(String str) {
        return new C13912a(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C13912a) {
            return L.f(this.f6753a, ((C13912a) obj).f6753a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6753a.hashCode();
    }

    public final String toString() {
        return C22026a.c(new StringBuilder("CriticalSection(name="), this.f6753a, ')');
    }
}
