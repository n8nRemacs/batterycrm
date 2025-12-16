package com.facebook.common.internal;

import com.facebook.infer.annotation.Nullsafe;

/* compiled from: Suppliers.java */
@Nullsafe
/* loaded from: classes5.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public static final r<Boolean> f339828a;

    /* compiled from: Suppliers.java */
    public static class a implements r<Boolean> {
        @Override // com.facebook.common.internal.r
        public final /* bridge */ /* synthetic */ Boolean get() {
            return Boolean.TRUE;
        }
    }

    /* compiled from: Suppliers.java */
    public static class b implements r<Boolean> {
        @Override // com.facebook.common.internal.r
        public final /* bridge */ /* synthetic */ Boolean get() {
            return Boolean.FALSE;
        }
    }

    static {
        new a();
        f339828a = new b();
    }

    public static r a(Boolean bool) {
        return new s(bool);
    }
}
