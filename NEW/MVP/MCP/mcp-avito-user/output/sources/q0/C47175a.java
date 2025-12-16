package q0;

import X41.g;
import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: InputModeManager.kt */
@g
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lq0/a;", "", "a", "value", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: q0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47175a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C12301a f428938b = new C12301a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f428939c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f428940d = 2;

    /* renamed from: a, reason: collision with root package name */
    public final int f428941a;

    /* compiled from: InputModeManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq0/a$a;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: q0.a$a, reason: collision with other inner class name */
    public static final class C12301a {
        public /* synthetic */ C12301a(C42822w c42822w) {
            this();
        }

        public C12301a() {
        }
    }

    private /* synthetic */ C47175a(int i12) {
        this.f428941a = i12;
    }

    public static final /* synthetic */ C47175a a(int i12) {
        return new C47175a(i12);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C47175a) {
            return this.f428941a == ((C47175a) obj).f428941a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f428941a);
    }

    @k
    public final String toString() {
        int i12 = f428939c;
        int i13 = this.f428941a;
        return i13 == i12 ? "Touch" : i13 == f428940d ? "Keyboard" : "Error";
    }
}
