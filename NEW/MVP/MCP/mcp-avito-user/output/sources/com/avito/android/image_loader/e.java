package com.avito.android.image_loader;

import android.content.Context;
import com.avito.android.di.C29972i;
import com.avito.android.image_loader.di.b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ForegroundConverterFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/image_loader/e;", "", "<init>", "()V", "_avito_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @Inject
    public d f169522a;

    @Y61.k
    public final d a(@Y61.k Context context) {
        b.a aVarA = com.avito.android.image_loader.di.a.a();
        aVarA.a((com.avito.android.image_loader.di.c) C29972i.a(C29972i.b(context), com.avito.android.image_loader.di.c.class));
        aVarA.b(com.avito.android.image_loader.di.d.f169520a);
        aVarA.build().a(this);
        d dVar = this.f169522a;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }
}
