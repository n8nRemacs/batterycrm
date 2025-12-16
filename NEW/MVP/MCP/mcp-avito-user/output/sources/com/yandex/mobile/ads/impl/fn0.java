package com.yandex.mobile.ads.impl;

import android.content.Context;
import j.InterfaceC42148d;

/* loaded from: classes8.dex */
public final class fn0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final mq0 f385422a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final en0 f385423b = new en0();

    public static final class a implements kq0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        private final b f385424a;

        public a(@Y61.k b bVar) {
            this.f385424a = bVar;
        }

        @Override // com.yandex.mobile.ads.impl.kq0
        public final void a() {
            this.f385424a.a();
        }
    }

    @InterfaceC42148d
    public interface b {
        void a();
    }

    public fn0(@Y61.k Context context) {
        this.f385422a = new mq0(context);
    }

    public final void a(@Y61.k uj0 uj0Var, @Y61.k b bVar) {
        if (!this.f385423b.a(uj0Var)) {
            ((um0) bVar).a();
        } else {
            this.f385422a.a(new a(bVar));
        }
    }

    public final void a() {
        this.f385422a.a();
    }
}
