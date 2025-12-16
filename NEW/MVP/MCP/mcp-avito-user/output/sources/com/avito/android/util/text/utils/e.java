package com.avito.android.util.text.utils;

import com.avito.android.util.text.utils.b;
import dagger.internal.t;

/* compiled from: DaggerAttributedTextFormatterHolderComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class e {

    /* compiled from: DaggerAttributedTextFormatterHolderComponent.java */
    public static final class b implements com.avito.android.util.text.utils.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.util.text.utils.c f319086a;

        public b(com.avito.android.util.text.utils.c cVar, a aVar) {
            this.f319086a = cVar;
        }

        @Override // com.avito.android.util.text.utils.b
        public final void a(com.avito.android.util.text.utils.a aVar) {
            com.avito.android.util.text.a aVarE = this.f319086a.e();
            t.c(aVarE);
            aVar.f319085a = aVarE;
        }
    }

    /* compiled from: DaggerAttributedTextFormatterHolderComponent.java */
    public static final class c implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.util.text.utils.c f319087a;

        public c() {
        }

        @Override // com.avito.android.util.text.utils.b.a
        public final b.a a(com.avito.android.util.text.utils.c cVar) {
            this.f319087a = cVar;
            return this;
        }

        @Override // com.avito.android.util.text.utils.b.a
        public final com.avito.android.util.text.utils.b build() {
            t.a(com.avito.android.util.text.utils.c.class, this.f319087a);
            return new b(this.f319087a, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
