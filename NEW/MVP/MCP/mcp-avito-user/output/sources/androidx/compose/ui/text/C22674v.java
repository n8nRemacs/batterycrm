package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: EmojiSupportMatch.android.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/v;", "", "a", "value", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22674v {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f42730b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f42731c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f42732d = 2;

    /* renamed from: a, reason: collision with root package name */
    public final int f42733a;

    /* compiled from: EmojiSupportMatch.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/v$a;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.v$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    private /* synthetic */ C22674v(int i12) {
        this.f42733a = i12;
    }

    public static final /* synthetic */ C22674v a(int i12) {
        return new C22674v(i12);
    }

    @Y61.k
    public static String b(int i12) {
        return i12 == 0 ? "EmojiSupportMatch.Default" : i12 == f42731c ? "EmojiSupportMatch.None" : i12 == f42732d ? "EmojiSupportMatch.All" : androidx.appcompat.app.r.p("Invalid(value=", i12, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C22674v) {
            return this.f42733a == ((C22674v) obj).f42733a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42733a);
    }

    @Y61.k
    public final String toString() {
        return b(this.f42733a);
    }
}
