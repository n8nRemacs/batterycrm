package com.google.firebase.platforminfo;

import androidx.compose.ui.platform.C22491k0;
import com.google.firebase.components.b;
import com.google.firebase.components.n;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: DefaultUserAgentPublisher.java */
/* loaded from: classes6.dex */
public class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final String f361944a;

    /* renamed from: b, reason: collision with root package name */
    public final d f361945b;

    public c(Set<f> set, d dVar) {
        this.f361944a = c(set);
        this.f361945b = dVar;
    }

    public static com.google.firebase.components.b<i> b() {
        b.C10697b c10697bB = com.google.firebase.components.b.b(i.class);
        c10697bB.a(new n(2, 0, f.class));
        c10697bB.f360737f = new b();
        return c10697bB.b();
    }

    public static String c(Set<f> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb2.append(next.a());
            sb2.append('/');
            sb2.append(next.b());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // com.google.firebase.platforminfo.i
    public final String a() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        d dVar = this.f361945b;
        synchronized (dVar.f361947a) {
            setUnmodifiableSet = Collections.unmodifiableSet(dVar.f361947a);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.f361944a;
        if (zIsEmpty) {
            return str;
        }
        StringBuilder sbB = C22491k0.b(str, ' ');
        synchronized (dVar.f361947a) {
            setUnmodifiableSet2 = Collections.unmodifiableSet(dVar.f361947a);
        }
        sbB.append(c(setUnmodifiableSet2));
        return sbB.toString();
    }
}
