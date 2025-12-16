package JK0;

import Y61.k;
import android.text.Editable;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CompositePreFormatterRule.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJK0/b;", "LJK0/h;", "_avito_text-formatters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Set<MK0.a> f8876a;

    public b(@k Set<MK0.a> set) {
        this.f8876a = set;
    }

    @Override // JK0.h
    @k
    public final String a(@k String str) {
        Iterator<T> it = this.f8876a.iterator();
        while (it.hasNext()) {
            str = ((MK0.a) it.next()).a(str);
        }
        return str;
    }

    @Override // JK0.h
    public final void c(@k Editable editable) {
        Iterator<T> it = this.f8876a.iterator();
        while (it.hasNext()) {
            ((MK0.a) it.next()).b(editable);
        }
    }
}
