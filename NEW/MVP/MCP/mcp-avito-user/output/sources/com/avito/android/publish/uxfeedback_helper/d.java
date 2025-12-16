package com.avito.android.publish.uxfeedback_helper;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.publish.uxfeedback_helper.a;
import com.avito.android.ux.feedback.impl.x;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.reflect.n;

/* compiled from: PublishUxFeedbackHelper.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/uxfeedback_helper/d;", "Lcom/avito/android/publish/uxfeedback_helper/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f245515a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.ux.feedback.impl.f f245516b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Q1 f245517c;

    @Inject
    public d(@k f fVar, @k com.avito.android.ux.feedback.impl.f fVar2, @k Q1 q12) {
        this.f245515a = fVar;
        this.f245516b = fVar2;
        this.f245517c = q12;
    }

    @Override // com.avito.android.publish.uxfeedback_helper.b
    @k
    public final z a(@k a.C7356a c7356a) {
        Q1 q12 = this.f245517c;
        q12.getClass();
        n<Object> nVar = Q1.f67448x0[10];
        return (((Boolean) q12.f67496l.a().invoke()).booleanValue() && this.f245515a.b(c7356a)) ? this.f245516b.b(c7356a).K(new c(this, c7356a)) : z.c0(x.a.f319183a);
    }
}
