package com.avito.android.serp.adapter.vertical_main.cv.cv_creation;

import Y41.l;
import com.avito.android.deep_linking.links.DeepLink;
import js0.d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import rn0.InterfaceC47691c;

/* compiled from: CvCreationItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class e extends N implements l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f272756l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f272757m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ CvCreationItem f272758n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, int i12, CvCreationItem cvCreationItem) {
        super(1);
        this.f272756l = fVar;
        this.f272757m = i12;
        this.f272758n = cvCreationItem;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        f fVar = this.f272756l;
        com.avito.android.serp.analytics.widgets_tracker.g gVar = fVar.f272760c;
        Integer numValueOf = Integer.valueOf(this.f272757m);
        CvCreationItem cvCreationItem = this.f272758n;
        d.a.a(gVar, numValueOf, "cvCreateWidget", cvCreationItem.f272736c, null, null, null, null, cvCreationItem.f272739f, 120);
        InterfaceC47691c.a.a(fVar.f272759b.get(), deepLink, null, 14);
        return G0.f406611a;
    }
}
