package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public final class D6 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    private final String f377954a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    private final String f377955b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    private final Integer f377956c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    private final Integer f377957d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    private final String f377958e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    private final Boolean f377959f;

    public D6(@Y61.l String str, @Y61.l String str2, @Y61.l Integer num, @Y61.l Integer num2, @Y61.l String str3, @Y61.l Boolean bool) {
        this.f377954a = str;
        this.f377955b = str2;
        this.f377956c = num;
        this.f377957d = num2;
        this.f377958e = str3;
        this.f377959f = bool;
    }

    @Y61.l
    public final String a() {
        return this.f377954a;
    }

    @Y61.l
    public final Integer b() {
        return this.f377957d;
    }

    @Y61.l
    public final String c() {
        return this.f377955b;
    }

    @Y61.l
    public final Integer d() {
        return this.f377956c;
    }

    @Y61.l
    public final String e() {
        return this.f377958e;
    }

    @Y61.l
    public final Boolean f() {
        return this.f377959f;
    }

    public D6(@Y61.k StackTraceElement stackTraceElement) {
        this(stackTraceElement.getClassName(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber()), null, stackTraceElement.getMethodName(), Boolean.valueOf(stackTraceElement.isNativeMethod()));
    }
}
