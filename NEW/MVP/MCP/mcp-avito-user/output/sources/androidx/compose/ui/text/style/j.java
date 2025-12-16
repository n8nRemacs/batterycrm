package androidx.compose.ui.text.style;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.H0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: TextDecoration.kt */
@H0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/style/j;", "", "a", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f42684b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final j f42685c = new j(0);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final j f42686d = new j(1);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final j f42687e = new j(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f42688a;

    /* compiled from: TextDecoration.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/style/j$a;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public j(int i12) {
        this.f42688a = i12;
    }

    public final boolean a(@Y61.k j jVar) {
        int i12 = jVar.f42688a;
        int i13 = this.f42688a;
        return (i12 | i13) == i13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return this.f42688a == ((j) obj).f42688a;
        }
        return false;
    }

    /* renamed from: hashCode, reason: from getter */
    public final int getF42688a() {
        return this.f42688a;
    }

    @Y61.k
    public final String toString() {
        int i12 = this.f42688a;
        if (i12 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((f42686d.f42688a & i12) != 0) {
            arrayList.add("Underline");
        }
        if ((i12 & f42687e.f42688a) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return C22026a.c(new StringBuilder("TextDecoration["), E0.d.b(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
