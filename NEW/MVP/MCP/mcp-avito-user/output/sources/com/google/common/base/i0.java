package com.google.common.base;

/* compiled from: Ticker.java */
@InterfaceC37268l
@XY0.b
/* loaded from: classes6.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final i0 f359050a = new a();

    /* compiled from: Ticker.java */
    public class a extends i0 {
        @Override // com.google.common.base.i0
        public final long a() {
            return System.nanoTime();
        }
    }

    public abstract long a();
}
