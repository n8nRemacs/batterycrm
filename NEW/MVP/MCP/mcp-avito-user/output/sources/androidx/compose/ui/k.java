package androidx.compose.ui;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: Modifier.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/k;", "Landroidx/compose/ui/v;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k implements v {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final v f40317b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final v f40318c;

    /* compiled from: Modifier.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "acc", "Landroidx/compose/ui/v$c;", "element", "invoke", "(Ljava/lang/String;Landroidx/compose/ui/v$c;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<String, v.c, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f40319l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final String invoke(String str, v.c cVar) {
            String str2 = str;
            v.c cVar2 = cVar;
            if (str2.length() == 0) {
                return cVar2.toString();
            }
            return str2 + ", " + cVar2;
        }
    }

    public k(@Y61.k v vVar, @Y61.k v vVar2) {
        this.f40317b = vVar;
        this.f40318c = vVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.v
    public final <R> R C(R r12, @Y61.k Y41.p<? super R, ? super v.c, ? extends R> pVar) {
        return (R) this.f40318c.C(this.f40317b.C(r12, pVar), pVar);
    }

    @Override // androidx.compose.ui.v
    public final boolean I(@Y61.k Y41.l<? super v.c, Boolean> lVar) {
        return this.f40317b.I(lVar) && this.f40318c.I(lVar);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (L.f(this.f40317b, kVar.f40317b) && L.f(this.f40318c, kVar.f40318c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f40318c.hashCode() * 31) + this.f40317b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("["), (String) C("", a.f40319l), ']');
    }
}
