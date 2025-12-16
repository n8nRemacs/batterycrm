package com.avito.android.interior_photos_block.compose;

import Y41.q;
import android.net.Uri;
import com.avito.android.remote.model.Image;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InteriorPhotos.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q<List<Image>, Integer, String, G0> f173020l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List<Image> f173021m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f173022n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Uri f173023o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(q<? super List<Image>, ? super Integer, ? super String, G0> qVar, List<Image> list, int i12, Uri uri) {
        super(0);
        this.f173020l = qVar;
        this.f173021m = list;
        this.f173022n = i12;
        this.f173023o = uri;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Integer numValueOf = Integer.valueOf(this.f173022n);
        Uri uri = this.f173023o;
        this.f173020l.invoke(this.f173021m, numValueOf, uri != null ? uri.toString() : null);
        return G0.f406611a;
    }
}
