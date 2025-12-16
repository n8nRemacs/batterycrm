package com.google.net.cronet.okhttptransport;

import com.google.common.base.M;
import com.google.net.cronet.okhttptransport.e;
import com.google.net.cronet.okhttptransport.o;
import org.chromium.net.CronetEngine;

/* compiled from: RequestResponseConverterBasedBuilder.java */
/* loaded from: classes14.dex */
abstract class o<SubBuilderT extends o<?, ? extends ObjectBeingBuiltT>, ObjectBeingBuiltT> {

    /* renamed from: a, reason: collision with root package name */
    public final CronetEngine f362572a;

    /* renamed from: b, reason: collision with root package name */
    public h f362573b = null;

    public o(CronetEngine cronetEngine) {
        this.f362572a = cronetEngine;
        M.g(getClass().equals(e.b.class));
    }
}
