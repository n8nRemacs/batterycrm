package com.yandex.mobile.ads.impl;

import android.content.Context;
import j.InterfaceC42148d;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class rd1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final mq0 f389491a;

    public final class a implements kq0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        private final b f389492a;

        public a(@Y61.k od1 od1Var) {
            this.f389492a = od1Var;
        }

        @Override // com.yandex.mobile.ads.impl.kq0
        public final void a() {
            this.f389492a.a();
        }
    }

    @InterfaceC42148d
    public interface b {
        void a();
    }

    public rd1(@Y61.k Context context) {
        this.f389491a = new mq0(context);
    }

    public final void a(@Y61.k List list, @Y61.k od1 od1Var) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((ne1) it.next()).d().isEmpty()) {
                    this.f389491a.a(new a(od1Var));
                    return;
                }
            }
        }
        od1Var.a();
    }
}
