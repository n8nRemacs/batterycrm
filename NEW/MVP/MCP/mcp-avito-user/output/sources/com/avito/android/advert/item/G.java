package com.avito.android.advert.item;

import Ju.InterfaceC14249c;
import android.view.View;
import com.avito.android.rating_form.deep_link.RatingFormLink;
import kotlin.Metadata;

/* compiled from: Views.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class G implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f71624b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsFragment f71625c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14249c f71626d;

    public G(View view, AdvertDetailsFragment advertDetailsFragment, InterfaceC14249c interfaceC14249c) {
        this.f71624b = view;
        this.f71625c = advertDetailsFragment;
        this.f71626d = interfaceC14249c;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        AdvertDetailsFragment advertDetailsFragment = this.f71625c;
        InterfaceC28130g0 interfaceC28130g0 = advertDetailsFragment.f71529v0;
        if (interfaceC28130g0 == null) {
            interfaceC28130g0 = null;
        }
        interfaceC28130g0.Wd((RatingFormLink.b) this.f71626d, new F(advertDetailsFragment));
        this.f71624b.removeOnLayoutChangeListener(this);
    }
}
