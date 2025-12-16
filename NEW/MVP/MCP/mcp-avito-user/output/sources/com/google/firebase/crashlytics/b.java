package com.google.firebase.crashlytics;

import j.B;
import jZ0.C42339f;
import jZ0.InterfaceC42334a;
import java.util.ArrayList;
import kZ0.C42653c;
import kZ0.InterfaceC42652b;
import wZ0.InterfaceC49583a;

/* compiled from: AnalyticsDeferredProxy.java */
/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC49583a<com.google.firebase.analytics.connector.a> f360862a;

    /* renamed from: b, reason: collision with root package name */
    public volatile InterfaceC42334a f360863b;

    /* renamed from: c, reason: collision with root package name */
    public volatile InterfaceC42652b f360864c;

    /* renamed from: d, reason: collision with root package name */
    @B
    public final ArrayList f360865d;

    public b() {
        throw null;
    }

    public b(InterfaceC49583a<com.google.firebase.analytics.connector.a> interfaceC49583a) {
        C42653c c42653c = new C42653c();
        C42339f c42339f = new C42339f();
        this.f360862a = interfaceC49583a;
        this.f360864c = c42653c;
        this.f360865d = new ArrayList();
        this.f360863b = c42339f;
        interfaceC49583a.a(new a(this));
    }
}
