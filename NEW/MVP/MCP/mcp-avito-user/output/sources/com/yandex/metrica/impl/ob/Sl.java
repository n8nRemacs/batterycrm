package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public class Sl extends Vl {

    /* renamed from: c, reason: collision with root package name */
    private static final Sl f379470c = new Sl("");

    public Sl(@j.P String str) {
        super(str);
    }

    public static Sl a() {
        return f379470c;
    }

    @Override // com.yandex.metrica.coreutils.logger.a
    public String getTag() {
        return "AppMetricaInternal";
    }

    @Override // com.yandex.metrica.coreutils.logger.a
    public boolean shouldLog() {
        super.shouldLog();
        return false;
    }

    private Sl() {
        this("");
    }
}
