package com.google.common.util.concurrent;

import java.util.logging.Logger;

/* compiled from: AbstractExecutionThreadService.java */
@XY0.c
@InterfaceC37531b0
@XY0.d
/* renamed from: com.google.common.util.concurrent.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC37530b implements Service {

    /* renamed from: a, reason: collision with root package name */
    public final Service f360555a = new a();

    /* compiled from: AbstractExecutionThreadService.java */
    /* renamed from: com.google.common.util.concurrent.b$a */
    public class a extends AbstractC37550l {
        public a() {
        }

        @Override // com.google.common.util.concurrent.AbstractC37550l
        public final String toString() {
            return AbstractC37530b.this.toString();
        }
    }

    static {
        Logger.getLogger(AbstractC37530b.class.getName());
    }

    public final String toString() {
        return getClass().getSimpleName() + " [" + ((AbstractC37550l) this.f360555a).a() + "]";
    }
}
