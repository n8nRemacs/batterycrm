package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ProducerContext.java */
@Nullsafe
/* loaded from: classes15.dex */
public interface k0 {

    /* compiled from: ProducerContext.java */
    public @interface a {
    }

    Object a();

    void b(C36401e c36401e);

    com.facebook.imagepipeline.core.s c();

    void d(@I41.h Map<String, ?> map);

    void e(@I41.h Object obj, String str);

    @I41.h
    Object f();

    @I41.h
    String g();

    HashMap getExtras();

    String getId();

    Priority getPriority();

    boolean h();

    m0 i();

    ImageRequest j();

    void k(@I41.h String str, @I41.h String str2);

    void l(@I41.h String str);

    boolean m();

    ImageRequest.RequestLevel n();
}
