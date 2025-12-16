package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.internal.http2.Settings;

/* compiled from: FontSynthesis.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/font/a0;", "", "a", "value", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.font.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22605a0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f42223b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f42224c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f42225d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f42226e = Settings.DEFAULT_INITIAL_WINDOW_SIZE;

    /* renamed from: a, reason: collision with root package name */
    public final int f42227a;

    /* compiled from: FontSynthesis.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/font/a0$a;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.font.a0$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    private /* synthetic */ C22605a0(int i12) {
        this.f42227a = i12;
    }

    public static final /* synthetic */ C22605a0 a(int i12) {
        return new C22605a0(i12);
    }

    public static final boolean b(int i12, int i13) {
        return i12 == i13;
    }

    @Y61.k
    public static String c(int i12) {
        return b(i12, 0) ? "None" : b(i12, f42224c) ? "Weight" : b(i12, f42225d) ? "Style" : b(i12, f42226e) ? "All" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C22605a0) {
            return this.f42227a == ((C22605a0) obj).f42227a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42227a);
    }

    @Y61.k
    public final String toString() {
        return c(this.f42227a);
    }
}
