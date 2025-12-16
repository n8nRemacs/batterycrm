package com.avito.android.computer_vision;

import com.avito.android.advert.deeplinks.delivery.p;
import com.avito.android.util.rx3.g1;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import kotlin.Metadata;
import l41.o;
import okhttp3.MultipartBody;

/* compiled from: MultiUploadComputerVisionInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lokhttp3/MultipartBody$Part;", "imageMultipart", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/remote/model/PublishSuggestsUploadPhotoResponse;", "apply", "(Lokhttp3/MultipartBody$Part;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class g<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f125471b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MultipartBody.Part f125472c;

    public g(c cVar, MultipartBody.Part part) {
        this.f125471b = cVar;
        this.f125472c = part;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return g1.a(new C42007e(new p(this.f125471b, (MultipartBody.Part) obj, this.f125472c, 6)));
    }
}
