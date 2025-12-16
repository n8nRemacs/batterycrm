package com.yandex.div.core.view2.errors;

import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: ErrorVisualMonitor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
final class j extends N implements Y41.l<Throwable, CharSequence> {

    /* renamed from: l, reason: collision with root package name */
    public static final j f369082l = new j();

    public j() {
        super(1);
    }

    @Override // Y41.l
    public final CharSequence invoke(Throwable th2) {
        return L.j(q.a(th2), " - ");
    }
}
