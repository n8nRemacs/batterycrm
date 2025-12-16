package androidx.media3.session;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.media3.common.InterfaceC23096j;
import androidx.media3.common.util.C23110a;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.N4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: SessionCommands.java */
/* loaded from: classes.dex */
public final class L1 implements InterfaceC23096j {

    /* renamed from: c, reason: collision with root package name */
    public static final L1 f52123c = new b().b();

    /* renamed from: d, reason: collision with root package name */
    public static final String f52124d;

    /* renamed from: e, reason: collision with root package name */
    @androidx.media3.common.util.J
    public static final M1 f52125e;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.common.collect.H1<K1> f52126b;

    static {
        int i12 = androidx.media3.common.util.M.f47887a;
        f52124d = Integer.toString(0, 36);
        f52125e = new M1(14);
    }

    public L1() {
        throw null;
    }

    public L1(Collection collection, a aVar) {
        this.f52126b = com.google.common.collect.H1.v(collection);
    }

    public final boolean a(int i12) {
        C23110a.a("Use contains(Command) for custom command", i12 != 0);
        Iterator<K1> it = this.f52126b.iterator();
        while (it.hasNext()) {
            if (it.next().f52115b == i12) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof L1) {
            return this.f52126b.equals(((L1) obj).f52126b);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f52126b);
    }

    @Override // androidx.media3.common.InterfaceC23096j
    @androidx.media3.common.util.J
    public final Bundle k() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        N4<K1> it = this.f52126b.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().k());
        }
        bundle.putParcelableArrayList(f52124d, arrayList);
        return bundle;
    }

    /* compiled from: SessionCommands.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final HashSet f52127a;

        public b() {
            this.f52127a = new HashSet();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(AbstractC37401r1 abstractC37401r1) {
            for (int i12 = 0; i12 < abstractC37401r1.size(); i12++) {
                this.f52127a.add(new K1(((Integer) abstractC37401r1.get(i12)).intValue()));
            }
        }

        public final L1 b() {
            return new L1(this.f52127a, null);
        }

        public b(L1 l12, a aVar) {
            l12.getClass();
            this.f52127a = new HashSet(l12.f52126b);
        }
    }
}
