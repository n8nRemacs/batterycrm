package com.avito.android.publish.details;

import com.avito.android.publish.PhotoUploadObserver;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PublishDetailsPhotoSyncInteractor.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/k1;", "Lcom/avito/android/publish/details/a1;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.details.k1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33765k1 implements InterfaceC33677a1 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.connection_quality.connectivity.a f234809b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_cache.j f234810c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_picker.b0 f234811d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.C0 f234812e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f234813f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final PhotoUploadObserver f234814g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33678b f234815h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final S0 f234816i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f234817j = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public C33765k1(@Y61.k com.avito.android.connection_quality.connectivity.a aVar, @Y61.k com.avito.android.photo_cache.j jVar, @Y61.k com.avito.android.photo_picker.b0 b0Var, @Y61.k com.avito.android.publish.C0 c02, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k PhotoUploadObserver photoUploadObserver, @Y61.k InterfaceC33678b interfaceC33678b, @Y61.k S0 s02) {
        this.f234809b = aVar;
        this.f234810c = jVar;
        this.f234811d = b0Var;
        this.f234812e = c02;
        this.f234813f = interfaceC35745a5;
        this.f234814g = photoUploadObserver;
        this.f234815h = interfaceC33678b;
        this.f234816i = s02;
    }

    @Override // com.avito.android.publish.details.w2
    public final void e0() {
        this.f234817j.e();
    }

    @Override // com.avito.android.publish.details.w2
    public final void p2(@Y61.k ItemDetailsView itemDetailsView) {
        boolean zBe = this.f234812e.Be();
        io.reactivex.rxjava3.disposables.c cVar = this.f234817j;
        if (zBe) {
            cVar.b(new io.reactivex.rxjava3.internal.operators.mixed.v(this.f234809b.d().D(io.reactivex.rxjava3.internal.functions.a.f401991a).N(C33753g1.f234634b), new C33759i1(this)).v(new com.avito.android.advert_core.task.a(10), C33762j1.f234802b));
        }
        C33750f1 c33750f1 = new C33750f1(this);
        ParametersTree parametersTreeWa = this.f234816i.wa();
        PhotoParameter photoParameter = parametersTreeWa != null ? (PhotoParameter) parametersTreeWa.getFirstParameterOfType(PhotoParameter.class) : null;
        if (photoParameter == null) {
            cVar.b(io.reactivex.rxjava3.kotlin.A1.h(this.f234814g.a(c33750f1, false), C33680b1.f233553l, null, 6));
        } else {
            cVar.b(io.reactivex.rxjava3.kotlin.A1.h(io.reactivex.rxjava3.core.z.c0(photoParameter).T(new C33683c1(this, c33750f1), Integer.MAX_VALUE).j0(this.f234813f.e()), C33686d1.f233598l, new C33747e1(this), 2));
        }
    }
}
