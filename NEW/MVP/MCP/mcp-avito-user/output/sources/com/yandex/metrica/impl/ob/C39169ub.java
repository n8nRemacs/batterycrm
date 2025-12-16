package com.yandex.metrica.impl.ob;

import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.ub, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39169ub {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    public final C39145tb f381928a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final U0 f381929b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public final String f381930c;

    public C39169ub() {
        this(null, U0.UNKNOWN, "identifier info has never been updated");
    }

    public boolean a() {
        C39145tb c39145tb = this.f381928a;
        return (c39145tb == null || TextUtils.isEmpty(c39145tb.f381872b)) ? false : true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdTrackingInfoResult{mAdTrackingInfo=");
        sb2.append(this.f381928a);
        sb2.append(", mStatus=");
        sb2.append(this.f381929b);
        sb2.append(", mErrorExplanation='");
        return AK.c.s(sb2, this.f381930c, "'}");
    }

    public C39169ub(@j.P C39145tb c39145tb, @j.N U0 u02, @j.P String str) {
        this.f381928a = c39145tb;
        this.f381929b = u02;
        this.f381930c = str;
    }
}
