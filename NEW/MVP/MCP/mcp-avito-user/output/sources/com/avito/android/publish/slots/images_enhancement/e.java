package com.avito.android.publish.slots.images_enhancement;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.f;
import com.avito.android.category_parameters.j;
import com.avito.android.publish.C0;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.slots.q;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.images_enhancement.ImagesEnhancementSlot;
import com.avito.android.util.InterfaceC35745a5;
import i31.InterfaceC41220a;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41998x0;
import io.reactivex.rxjava3.internal.operators.observable.W;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;

/* compiled from: ImagesEnhancementSlotWrapper.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/images_enhancement/e;", "Lcom/avito/android/category_parameters/j;", "Lcom/avito/android/remote/model/category_parameters/slot/images_enhancement/ImagesEnhancementSlot;", "Lcom/avito/android/publish/slots/q;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e extends j<ImagesEnhancementSlot> implements q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ImagesEnhancementSlot f244109b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C0 f244110c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.photo_cache.b f244111d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f244112e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC33535v f244113f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f244114g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C41998x0 f244115h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public Object f244116i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public Object f244117j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public Object f244118k;

    @i31.c
    public e(@InterfaceC41220a @k ImagesEnhancementSlot imagesEnhancementSlot, @k C0 c02, @k com.avito.android.photo_cache.b bVar, @k InterfaceC35745a5 interfaceC35745a5, @k InterfaceC33535v interfaceC33535v) {
        this.f244109b = imagesEnhancementSlot;
        this.f244110c = c02;
        this.f244111d = bVar;
        this.f244112e = interfaceC35745a5;
        this.f244113f = interfaceC33535v;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f244114g = cVar;
        this.f244115h = z.c0(f.c.f117644b);
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f244116i = c42784z0;
        this.f244117j = c42784z0;
        this.f244118k = c42784z0;
        cVar.b(j(false).t0(new a(this)));
        cVar.b(j(true).t0(new d(this)));
    }

    @Override // com.avito.android.publish.slots.q
    @k
    public final z<com.avito.android.category_parameters.f> a() {
        return this.f244115h;
    }

    @Override // com.avito.android.publish.slots.q
    public final void clear() {
        this.f244114g.e();
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f244109b;
    }

    public final W j(boolean z12) {
        String str = this.f244110c.f231866d0;
        if (str == null) {
            str = null;
        }
        return this.f244111d.a(str).x0(this.f244112e.a()).d0(b.f244106b).N(new c(z12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final void l() {
        ?? r02 = this.f244117j;
        ?? r12 = this.f244116i;
        ArrayList arrayListH0 = C42745f0.h0((Iterable) r02, (Collection) r12);
        if (L.f(this.f244118k, arrayListH0) || arrayListH0.isEmpty()) {
            return;
        }
        this.f244113f.q0(r02, r12);
        this.f244118k = arrayListH0;
    }
}
