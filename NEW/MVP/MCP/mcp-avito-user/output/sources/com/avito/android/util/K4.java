package com.avito.android.util;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Rotation.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/util/K4;", "", "a", "b", "c", "d", "e", "Lcom/avito/android/util/K4$a;", "Lcom/avito/android/util/K4$b;", "Lcom/avito/android/util/K4$c;", "Lcom/avito/android/util/K4$d;", "Lcom/avito/android/util/K4$e;", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class K4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f318644a;

    /* compiled from: Rotation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/K4$a;", "Lcom/avito/android/util/K4;", "<init>", "()V", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends K4 {
        public a() {
            super(0, null);
        }
    }

    /* compiled from: Rotation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/K4$b;", "Lcom/avito/android/util/K4;", "<init>", "()V", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends K4 {
        public b() {
            super(180, null);
        }
    }

    /* compiled from: Rotation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/K4$c;", "Lcom/avito/android/util/K4;", "<init>", "()V", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends K4 {
        public c() {
            super(270, null);
        }
    }

    /* compiled from: Rotation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/K4$d;", "Lcom/avito/android/util/K4;", "<init>", "()V", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends K4 {
        public d() {
            super(90, null);
        }
    }

    /* compiled from: Rotation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/K4$e;", "Lcom/avito/android/util/K4;", "<init>", "()V", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends K4 {
        public e() {
            super(-1, null);
        }
    }

    public K4(int i12, C42822w c42822w) {
        this.f318644a = i12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return kotlin.jvm.internal.L.f(obj != null ? obj.getClass() : null, getClass()) && this.f318644a == ((K4) obj).f318644a;
    }

    /* renamed from: hashCode, reason: from getter */
    public final int getF318644a() {
        return this.f318644a;
    }
}
