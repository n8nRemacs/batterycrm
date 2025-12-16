package com.avito.android.iac_dialer_watcher.impl_module.logging.writing;

import com.avito.android.util.V2;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: IacLogSaver.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "apply", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class z<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f168137b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f168138c;

    public z(q qVar, String str) {
        this.f168137b = qVar;
        this.f168138c = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        if (((Boolean) this.f168137b.f168113j.getValue()).booleanValue()) {
            V2.f318762a.c("In_app_calls_logging:", this.f168138c, null);
        }
        return G0.f406611a;
    }
}
