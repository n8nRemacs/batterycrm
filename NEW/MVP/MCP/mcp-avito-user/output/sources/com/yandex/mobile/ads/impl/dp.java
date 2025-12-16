package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.gn;
import com.yandex.mobile.ads.impl.jd0;
import com.yandex.mobile.ads.impl.po;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes8.dex */
public final class dp implements jd0.a {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f384645a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private final HashMap f384646b;

        /* renamed from: c, reason: collision with root package name */
        private gn.a f384647c;

        public a(uo uoVar) {
            new HashSet();
            this.f384646b = new HashMap();
        }

        public final void a(po.a aVar) {
            if (aVar != this.f384647c) {
                this.f384647c = aVar;
                this.f384645a.clear();
                this.f384646b.clear();
            }
        }
    }

    public dp(po.a aVar, uo uoVar) {
        new a(uoVar).a(aVar);
    }
}
