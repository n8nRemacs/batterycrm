package io.noties.markwon;

import android.content.Context;
import android.widget.TextView;
import g41.C40531b;
import io.noties.markwon.core.q;
import io.noties.markwon.e;
import io.noties.markwon.g;
import io.noties.markwon.m;
import io.noties.markwon.q;
import j.N;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.commonmark.parser.d;

/* compiled from: MarkwonBuilderImpl.java */
/* loaded from: classes8.dex */
class f implements e.a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f401708a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f401709b = new ArrayList(3);

    /* renamed from: c, reason: collision with root package name */
    public final boolean f401710c;

    public f(@N Context context) {
        TextView.BufferType bufferType = TextView.BufferType.SPANNABLE;
        this.f401710c = true;
        this.f401708a = context;
    }

    @Override // io.noties.markwon.e.a
    @N
    public final e.a a(@N AbstractC41740a abstractC41740a) {
        this.f401709b.add(abstractC41740a);
        return this;
    }

    @Override // io.noties.markwon.e.a
    @N
    public final e build() {
        ArrayList arrayList = this.f401709b;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No plugins were added to this builder. Use #usePlugin method to add them");
        }
        x xVar = new x(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            xVar.c((j) it.next());
        }
        ArrayList arrayList2 = xVar.f401938b;
        d.b bVar = new d.b();
        io.noties.markwon.utils.b bVar2 = new io.noties.markwon.utils.b(this.f401708a.getResources().getDisplayMetrics().density);
        q.a aVar = new q.a();
        aVar.f401676e = bVar2.a(8);
        aVar.f401672a = bVar2.a(24);
        aVar.f401673b = bVar2.a(4);
        aVar.f401674c = bVar2.a(1);
        aVar.f401677f = bVar2.a(1);
        aVar.f401678g = bVar2.a(4);
        g.b bVar3 = new g.b();
        q.a aVar2 = new q.a();
        m.a aVar3 = new m.a();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            j jVar = (j) it2.next();
            jVar.configureParser(bVar);
            jVar.configureTheme(aVar);
            jVar.configureConfiguration(bVar3);
            jVar.configureVisitor(aVar2);
            jVar.configureSpansFactory(aVar3);
        }
        io.noties.markwon.core.q qVar = new io.noties.markwon.core.q(aVar);
        m mVar = new m(Collections.unmodifiableMap(aVar3.f401922a));
        bVar3.f401718a = qVar;
        bVar3.f401724g = mVar;
        if (bVar3.f401719b == null) {
            bVar3.f401719b = io.noties.markwon.image.b.a();
        }
        if (bVar3.f401720c == null) {
            bVar3.f401720c = new C40531b();
        }
        if (bVar3.f401721d == null) {
            bVar3.f401721d = new d();
        }
        if (bVar3.f401722e == null) {
            bVar3.f401722e = io.noties.markwon.image.destination.a.a();
        }
        if (bVar3.f401723f == null) {
            bVar3.f401723f = new io.noties.markwon.image.k();
        }
        return new i(new org.commonmark.parser.d(bVar, null), new o(aVar2, new g(bVar3, null)), Collections.unmodifiableList(arrayList2), this.f401710c);
    }
}
