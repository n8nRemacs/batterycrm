package org.slf4j.helpers;

import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;

/* compiled from: SubstituteLoggerFactory.java */
/* loaded from: classes7.dex */
public class l implements ILoggerFactory {

    /* renamed from: a, reason: collision with root package name */
    public boolean f421831a = false;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f421832b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedBlockingQueue<u81.d> f421833c = new LinkedBlockingQueue<>();

    @Override // org.slf4j.ILoggerFactory
    public final synchronized org.slf4j.a a(String str) {
        k kVar;
        kVar = (k) this.f421832b.get(str);
        if (kVar == null) {
            kVar = new k(str, this.f421833c, this.f421831a);
            this.f421832b.put(str, kVar);
        }
        return kVar;
    }
}
