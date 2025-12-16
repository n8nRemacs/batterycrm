package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes8.dex */
public abstract class zl implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final ui0 f392286a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    private final ri0 f392287b;

    public static final class a extends zl {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        private final bj0 f392288c;

        public a(@Y61.k bj0 bj0Var, @Y61.k ui0 ui0Var, @Y61.l ri0 ri0Var) {
            super(ui0Var, ri0Var, 0);
            this.f392288c = bj0Var;
        }

        @Override // com.yandex.mobile.ads.impl.zl, android.view.View.OnClickListener
        public final void onClick(@Y61.l View view) {
            this.f392288c.b();
            super.onClick(view);
        }
    }

    public static final class b extends zl {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        private final bj0 f392289c;

        public b(@Y61.k bj0 bj0Var, @Y61.k ui0 ui0Var, @Y61.l ri0 ri0Var) {
            super(ui0Var, ri0Var, 0);
            this.f392289c = bj0Var;
        }

        @Override // com.yandex.mobile.ads.impl.zl, android.view.View.OnClickListener
        public final void onClick(@Y61.l View view) {
            this.f392289c.a();
            super.onClick(view);
        }
    }

    public /* synthetic */ zl(ui0 ui0Var, ri0 ri0Var, int i12) {
        this(ui0Var, ri0Var);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Y61.l View view) {
        ri0 ri0Var = this.f392287b;
        if (ri0Var != null) {
            ri0Var.a();
        }
        this.f392286a.b();
    }

    private zl(ui0 ui0Var, ri0 ri0Var) {
        this.f392286a = ui0Var;
        this.f392287b = ri0Var;
    }
}
