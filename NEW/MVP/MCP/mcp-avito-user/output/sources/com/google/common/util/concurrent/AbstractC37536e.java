package com.google.common.util.concurrent;

/* compiled from: AbstractIdleService.java */
@XY0.c
@InterfaceC37531b0
@XY0.d
/* renamed from: com.google.common.util.concurrent.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC37536e implements Service {

    /* renamed from: a, reason: collision with root package name */
    public final Service f360596a;

    /* compiled from: AbstractIdleService.java */
    /* renamed from: com.google.common.util.concurrent.e$b */
    public final class b extends AbstractC37550l {
        public b(a aVar) {
        }

        @Override // com.google.common.util.concurrent.AbstractC37550l
        public final String toString() {
            return AbstractC37536e.this.toString();
        }
    }

    /* compiled from: AbstractIdleService.java */
    /* renamed from: com.google.common.util.concurrent.e$c */
    public final class c implements com.google.common.base.e0<String> {
        public c(a aVar) {
        }

        @Override // com.google.common.base.e0
        public final String get() {
            StringBuilder sb2 = new StringBuilder();
            AbstractC37536e abstractC37536e = AbstractC37536e.this;
            sb2.append(abstractC37536e.getClass().getSimpleName());
            sb2.append(" ");
            sb2.append(((AbstractC37550l) abstractC37536e.f360596a).a());
            return sb2.toString();
        }
    }

    public AbstractC37536e() {
        new c(null);
        this.f360596a = new b(null);
    }

    public final String toString() {
        return getClass().getSimpleName() + " [" + ((AbstractC37550l) this.f360596a).a() + "]";
    }
}
