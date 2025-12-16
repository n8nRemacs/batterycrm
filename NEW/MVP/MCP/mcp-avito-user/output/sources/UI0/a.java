package UI0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: IndexedShortcut.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LUI0/a;", "", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final C1116a f16328d = new C1116a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f16329e = new a(0 == true ? 1 : 0, 0, 3, 0 == true ? 1 : 0);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f16330a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16331b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16332c;

    /* compiled from: IndexedShortcut.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LUI0/a$a;", "", "<init>", "()V", "", "EMPTY_SHORTCUT_INDEX", "I", "", "EMPTY_SHORTCUT_NAME", "Ljava/lang/String;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: UI0.a$a, reason: collision with other inner class name */
    public static final class C1116a {
        public /* synthetic */ C1116a(C42822w c42822w) {
            this();
        }

        public C1116a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f16330a, aVar.f16330a) && this.f16331b == aVar.f16331b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16331b) + (this.f16330a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IndexedShortcut(shortcut=");
        sb2.append(this.f16330a);
        sb2.append(", index=");
        return r.t(sb2, this.f16331b, ')');
    }

    public a(@k String str, int i12) {
        this.f16330a = str;
        this.f16331b = i12;
        this.f16332c = !equals(f16329e);
    }

    public /* synthetic */ a(String str, int i12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? -1 : i12);
    }
}
