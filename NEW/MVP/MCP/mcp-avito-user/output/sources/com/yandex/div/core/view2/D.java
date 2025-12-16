package com.yandex.div.core.view2;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.yandex.div.core.InterfaceC37914i;
import com.yandex.div.core.RunnableC37906d;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DivPlaceholderLoader.kt */
@com.yandex.div.core.dagger.z
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0011\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/D;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class D {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC37914i f367844a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ExecutorService f367845b;

    /* compiled from: DivPlaceholderLoader.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/graphics/Bitmap;", "bitmap", "Lkotlin/G0;", "invoke", "(Landroid/graphics/Bitmap;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Bitmap, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.core.view2.errors.d f367846l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f367847m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ D f367848n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f367849o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f367850p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(com.yandex.div.core.view2.errors.d dVar, Y41.l<? super Drawable, G0> lVar, D d12, int i12, Y41.l<? super Bitmap, G0> lVar2) {
            super(1);
            this.f367846l = dVar;
            this.f367847m = (kotlin.jvm.internal.N) lVar;
            this.f367848n = d12;
            this.f367849o = i12;
            this.f367850p = (kotlin.jvm.internal.N) lVar2;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r0v4, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final G0 invoke(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            if (bitmap2 == null) {
                this.f367846l.b(new Throwable("Preview doesn't contain base64 image"));
                this.f367847m.invoke(this.f367848n.f367844a.a(this.f367849o));
            } else {
                this.f367850p.invoke(bitmap2);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public D(@Y61.k InterfaceC37914i interfaceC37914i, @Y61.k ExecutorService executorService) {
        this.f367844a = interfaceC37914i;
        this.f367845b = executorService;
    }

    @j.K
    public final void a(@Y61.k com.yandex.div.core.view2.divs.widgets.A a12, @Y61.k com.yandex.div.core.view2.errors.d dVar, @Y61.l String str, int i12, boolean z12, @Y61.k Y41.l<? super Drawable, G0> lVar, @Y61.k Y41.l<? super Bitmap, G0> lVar2) {
        G0 g02 = null;
        Future<?> futureSubmit = null;
        if (str != null) {
            a aVar = new a(dVar, lVar, this, i12, lVar2);
            Future<?> loadingTask = a12.getLoadingTask();
            if (loadingTask != null) {
                loadingTask.cancel(true);
            }
            RunnableC37906d runnableC37906d = new RunnableC37906d(str, z12, new E(aVar, a12));
            if (z12) {
                runnableC37906d.run();
            } else {
                futureSubmit = this.f367845b.submit(runnableC37906d);
            }
            if (futureSubmit != null) {
                a12.d(futureSubmit);
            }
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            lVar.invoke(this.f367844a.a(i12));
        }
    }
}
