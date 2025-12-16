package com.yandex.div.core.resources;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.util.TypedValue;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PrimitiveResourceCache.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/resources/c;", "Lcom/yandex/div/core/resources/d;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class c extends d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ConcurrentHashMap<Integer, Boolean> f367643b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ConcurrentHashMap<Integer, Float> f367644c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ConcurrentHashMap<Integer, Integer> f367645d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ConcurrentHashMap<Integer, Integer> f367646e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ConcurrentHashMap<Integer, Integer> f367647f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public TypedValue f367648g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Object f367649h;

    public c(@k Resources resources) {
        super(resources);
        this.f367643b = new ConcurrentHashMap<>();
        this.f367644c = new ConcurrentHashMap<>();
        this.f367645d = new ConcurrentHashMap<>();
        this.f367646e = new ConcurrentHashMap<>();
        this.f367647f = new ConcurrentHashMap<>();
        this.f367648g = new TypedValue();
        this.f367649h = new Object();
    }

    public final TypedValue a() {
        TypedValue typedValue;
        synchronized (this.f367649h) {
            try {
                typedValue = this.f367648g;
                if (typedValue != null) {
                    this.f367648g = null;
                } else {
                    typedValue = null;
                }
                G0 g02 = G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return typedValue == null ? new TypedValue() : typedValue;
    }

    public final void b(TypedValue typedValue) {
        synchronized (this.f367649h) {
            try {
                if (this.f367648g == null) {
                    this.f367648g = typedValue;
                }
                G0 g02 = G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.yandex.div.core.resources.d, android.content.res.Resources
    public final boolean getBoolean(int i12) {
        ConcurrentHashMap<Integer, Boolean> concurrentHashMap = this.f367643b;
        Boolean bool = concurrentHashMap.get(Integer.valueOf(i12));
        if (bool == null) {
            TypedValue typedValueA = a();
            boolean z12 = true;
            try {
                getValue(i12, typedValueA, true);
                int i13 = typedValueA.type;
                if (i13 < 16 || i13 > 31) {
                    throw new Resources.NotFoundException("Resource ID #0x" + ((Object) Integer.toHexString(i12)) + " type #0x" + ((Object) Integer.toHexString(typedValueA.type)) + " is not valid");
                }
                if (typedValueA.data == 0) {
                    z12 = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z12);
                if (typedValueA.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i12), boolValueOf);
                }
                b(typedValueA);
                bool = boolValueOf;
            } catch (Throwable th2) {
                b(typedValueA);
                throw th2;
            }
        }
        return bool.booleanValue();
    }

    @Override // com.yandex.div.core.resources.d, android.content.res.Resources
    public final float getDimension(int i12) {
        ConcurrentHashMap<Integer, Float> concurrentHashMap = this.f367644c;
        Float f12 = concurrentHashMap.get(Integer.valueOf(i12));
        if (f12 == null) {
            TypedValue typedValueA = a();
            try {
                getValue(i12, typedValueA, true);
                if (typedValueA.type != 5) {
                    throw new Resources.NotFoundException("Resource ID #0x" + ((Object) Integer.toHexString(i12)) + " type #0x" + ((Object) Integer.toHexString(typedValueA.type)) + " is not valid");
                }
                Float fValueOf = Float.valueOf(TypedValue.complexToDimension(typedValueA.data, this.f367650a.getDisplayMetrics()));
                if (typedValueA.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i12), fValueOf);
                }
                b(typedValueA);
                f12 = fValueOf;
            } catch (Throwable th2) {
                b(typedValueA);
                throw th2;
            }
        }
        return f12.floatValue();
    }

    @Override // com.yandex.div.core.resources.d, android.content.res.Resources
    public final int getDimensionPixelOffset(int i12) {
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = this.f367645d;
        Integer num = concurrentHashMap.get(Integer.valueOf(i12));
        if (num == null) {
            TypedValue typedValueA = a();
            try {
                getValue(i12, typedValueA, true);
                if (typedValueA.type != 5) {
                    throw new Resources.NotFoundException("Resource ID #0x" + ((Object) Integer.toHexString(i12)) + " type #0x" + ((Object) Integer.toHexString(typedValueA.type)) + " is not valid");
                }
                Integer numValueOf = Integer.valueOf(TypedValue.complexToDimensionPixelOffset(typedValueA.data, this.f367650a.getDisplayMetrics()));
                if (typedValueA.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i12), numValueOf);
                }
                b(typedValueA);
                num = numValueOf;
            } catch (Throwable th2) {
                b(typedValueA);
                throw th2;
            }
        }
        return num.intValue();
    }

    @Override // com.yandex.div.core.resources.d, android.content.res.Resources
    public final int getDimensionPixelSize(int i12) {
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = this.f367646e;
        Integer num = concurrentHashMap.get(Integer.valueOf(i12));
        if (num == null) {
            TypedValue typedValueA = a();
            try {
                getValue(i12, typedValueA, true);
                if (typedValueA.type != 5) {
                    throw new Resources.NotFoundException("Resource ID #0x" + ((Object) Integer.toHexString(i12)) + " type #0x" + ((Object) Integer.toHexString(typedValueA.type)) + " is not valid");
                }
                Integer numValueOf = Integer.valueOf(TypedValue.complexToDimensionPixelSize(typedValueA.data, this.f367650a.getDisplayMetrics()));
                if (typedValueA.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i12), numValueOf);
                }
                b(typedValueA);
                num = numValueOf;
            } catch (Throwable th2) {
                b(typedValueA);
                throw th2;
            }
        }
        return num.intValue();
    }

    @Override // com.yandex.div.core.resources.d, android.content.res.Resources
    public final int getInteger(int i12) {
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = this.f367647f;
        Integer num = concurrentHashMap.get(Integer.valueOf(i12));
        if (num == null) {
            TypedValue typedValueA = a();
            try {
                getValue(i12, typedValueA, true);
                int i13 = typedValueA.type;
                if (i13 < 16 || i13 > 31) {
                    throw new Resources.NotFoundException("Resource ID #0x" + ((Object) Integer.toHexString(i12)) + " type #0x" + ((Object) Integer.toHexString(typedValueA.type)) + " is not valid");
                }
                Integer numValueOf = Integer.valueOf(typedValueA.data);
                if (typedValueA.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i12), numValueOf);
                }
                b(typedValueA);
                num = numValueOf;
            } catch (Throwable th2) {
                b(typedValueA);
                throw th2;
            }
        }
        return num.intValue();
    }
}
