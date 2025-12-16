package com.avito.android.advert.item.icebreakers_redesign;

import com.avito.android.remote.model.IceBreaker;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IceBreakersRedesignPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/remote/model/IceBreaker;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class j extends N implements Y41.l<IceBreaker, CharSequence> {

    /* renamed from: l, reason: collision with root package name */
    public static final j f76552l = new j();

    public j() {
        super(1);
    }

    @Override // Y41.l
    public final CharSequence invoke(IceBreaker iceBreaker) {
        return iceBreaker.getPreviewText();
    }
}
