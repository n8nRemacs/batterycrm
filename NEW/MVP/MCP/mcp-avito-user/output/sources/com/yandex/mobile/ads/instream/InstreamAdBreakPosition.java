package com.yandex.mobile.ads.instream;

import j.N;

/* loaded from: classes8.dex */
public class InstreamAdBreakPosition {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final Type f392469a;

    /* renamed from: b, reason: collision with root package name */
    private final long f392470b;

    public enum Type {
        PERCENTS,
        MILLISECONDS,
        POSITION;

        Type() {
        }
    }

    public InstreamAdBreakPosition(@N Type type, long j12) {
        this.f392470b = j12;
        this.f392469a = type;
    }

    @N
    public Type getPositionType() {
        return this.f392469a;
    }

    public long getValue() {
        return this.f392470b;
    }
}
