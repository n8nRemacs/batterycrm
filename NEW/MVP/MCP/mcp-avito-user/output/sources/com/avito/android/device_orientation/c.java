package com.avito.android.device_orientation;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DeviceRotation.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/device_orientation/c;", "", "a", "b", "c", "d", "e", "Lcom/avito/android/device_orientation/c$a;", "Lcom/avito/android/device_orientation/c$b;", "Lcom/avito/android/device_orientation/c$c;", "Lcom/avito/android/device_orientation/c$d;", "Lcom/avito/android/device_orientation/c$e;", "_avito_device-orientation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f139238a;

    /* compiled from: DeviceRotation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/device_orientation/c$a;", "Lcom/avito/android/device_orientation/c;", "<init>", "()V", "_avito_device-orientation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends c {
        public a() {
            super(0, null);
        }
    }

    /* compiled from: DeviceRotation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/device_orientation/c$b;", "Lcom/avito/android/device_orientation/c;", "<init>", "()V", "_avito_device-orientation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends c {
        public b() {
            super(180, null);
        }
    }

    /* compiled from: DeviceRotation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/device_orientation/c$c;", "Lcom/avito/android/device_orientation/c;", "<init>", "()V", "_avito_device-orientation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.device_orientation.c$c, reason: collision with other inner class name */
    public static final class C4199c extends c {
        public C4199c() {
            super(270, null);
        }
    }

    /* compiled from: DeviceRotation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/device_orientation/c$d;", "Lcom/avito/android/device_orientation/c;", "<init>", "()V", "_avito_device-orientation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends c {
        public d() {
            super(90, null);
        }
    }

    /* compiled from: DeviceRotation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/device_orientation/c$e;", "Lcom/avito/android/device_orientation/c;", "<init>", "()V", "_avito_device-orientation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends c {
        public e() {
            super(-1, null);
        }
    }

    public c(int i12, C42822w c42822w) {
        this.f139238a = i12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return L.f(obj != null ? obj.getClass() : null, getClass()) && this.f139238a == ((c) obj).f139238a;
    }

    /* renamed from: hashCode, reason: from getter */
    public final int getF139238a() {
        return this.f139238a;
    }
}
