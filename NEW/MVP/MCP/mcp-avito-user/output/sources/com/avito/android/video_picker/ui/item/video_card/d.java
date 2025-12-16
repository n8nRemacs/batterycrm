package com.avito.android.video_picker.ui.item.video_card;

import Y41.l;
import Y61.k;
import android.net.Uri;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: VideoCardPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/video_picker/ui/item/video_card/d;", "LTV0/d;", "Lcom/avito/android/video_picker/ui/item/video_card/f;", "Lcom/avito/android/video_picker/ui/item/video_card/c;", "_avito_video-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements TV0.d<f, c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<Uri, G0> f325991b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super Uri, G0> lVar) {
        this.f325991b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ((f) eVar).AN((c) aVar, this.f325991b);
    }
}
