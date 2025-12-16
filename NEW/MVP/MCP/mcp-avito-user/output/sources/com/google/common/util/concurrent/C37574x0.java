package com.google.common.util.concurrent;

import com.google.common.base.InterfaceC37276u;
import com.google.common.collect.AbstractC37429w3;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: FuturesGetChecked.java */
@XY0.c
@InterfaceC37531b0
@XY0.d
/* renamed from: com.google.common.util.concurrent.x0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37574x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f360664a = 0;

    /* compiled from: FuturesGetChecked.java */
    @XY0.e
    /* renamed from: com.google.common.util.concurrent.x0$a */
    public interface a {
    }

    /* compiled from: FuturesGetChecked.java */
    @XY0.e
    /* renamed from: com.google.common.util.concurrent.x0$b */
    public static class b {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: FuturesGetChecked.java */
        /* renamed from: com.google.common.util.concurrent.x0$b$a */
        public static final class a implements a {

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ a[] f360665b = {new a("INSTANCE", 0)};

            /* JADX INFO: Fake field, exist only in values array */
            a EF5;

            static {
                new CopyOnWriteArraySet();
            }

            public a() {
                throw null;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f360665b.clone();
            }
        }

        static {
            int i12 = C37574x0.f360664a;
            a[] aVarArr = a.f360665b;
        }
    }

    static {
        final int i12 = 0;
        final int i13 = 1;
        AbstractC37429w3 abstractC37429w3H = AbstractC37429w3.d().g(new InterfaceC37276u() { // from class: com.google.common.util.concurrent.w0
            @Override // com.google.common.base.InterfaceC37276u
            public final Object apply(Object obj) {
                switch (i12) {
                    case 0:
                        int i14 = C37574x0.f360664a;
                        return Boolean.valueOf(((List) obj).contains(String.class));
                    case 1:
                        int i15 = C37574x0.f360664a;
                        return Boolean.valueOf(((List) obj).contains(Throwable.class));
                    default:
                        int i16 = C37574x0.f360664a;
                        return Arrays.asList(((Constructor) obj).getParameterTypes());
                }
            }
        }).a(AbstractC37429w3.d().g(new InterfaceC37276u() { // from class: com.google.common.util.concurrent.w0
            @Override // com.google.common.base.InterfaceC37276u
            public final Object apply(Object obj) {
                switch (i13) {
                    case 0:
                        int i14 = C37574x0.f360664a;
                        return Boolean.valueOf(((List) obj).contains(String.class));
                    case 1:
                        int i15 = C37574x0.f360664a;
                        return Boolean.valueOf(((List) obj).contains(Throwable.class));
                    default:
                        int i16 = C37574x0.f360664a;
                        return Arrays.asList(((Constructor) obj).getParameterTypes());
                }
            }
        })).h();
        final int i14 = 2;
        abstractC37429w3H.g(new InterfaceC37276u() { // from class: com.google.common.util.concurrent.w0
            @Override // com.google.common.base.InterfaceC37276u
            public final Object apply(Object obj) {
                switch (i14) {
                    case 0:
                        int i142 = C37574x0.f360664a;
                        return Boolean.valueOf(((List) obj).contains(String.class));
                    case 1:
                        int i15 = C37574x0.f360664a;
                        return Boolean.valueOf(((List) obj).contains(Throwable.class));
                    default:
                        int i16 = C37574x0.f360664a;
                        return Arrays.asList(((Constructor) obj).getParameterTypes());
                }
            }
        });
    }
}
