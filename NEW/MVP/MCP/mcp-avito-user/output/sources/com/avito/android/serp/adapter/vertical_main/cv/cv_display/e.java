package com.avito.android.serp.adapter.vertical_main.cv.cv_display;

import Y41.l;
import androidx.core.os.C22777e;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;
import rn0.InterfaceC47691c;

/* compiled from: CvDisplayItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class e extends N implements l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f272784l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CvDisplayItem f272785m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CvDisplayItem cvDisplayItem, h hVar) {
        super(1);
        this.f272784l = hVar;
        this.f272785m = cvDisplayItem;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        InterfaceC47691c.a.a(this.f272784l.f272791b.get(), this.f272785m.f272769d.f131601k, C22777e.b(new Q("up_intent", null)), 12);
        return G0.f406611a;
    }
}
