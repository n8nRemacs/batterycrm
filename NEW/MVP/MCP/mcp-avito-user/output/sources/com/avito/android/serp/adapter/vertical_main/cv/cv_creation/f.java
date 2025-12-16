package com.avito.android.serp.adapter.vertical_main.cv.cv_creation;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.button.Button;
import com.avito.android.search.filter.adapter.select.m;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import javax.inject.Inject;
import kotlin.Metadata;
import rn0.InterfaceC47690b;

/* compiled from: CvCreationItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/cv/cv_creation/f;", "LTV0/d;", "Lcom/avito/android/serp/adapter/vertical_main/cv/cv_creation/h;", "Lcom/avito/android/serp/adapter/vertical_main/cv/cv_creation/CvCreationItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements TV0.d<h, CvCreationItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC47690b> f272759b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.serp.analytics.widgets_tracker.g f272760c;

    @Inject
    public f(@k com.avito.android.serp.analytics.widgets_tracker.g gVar, @k h31.e eVar) {
        this.f272759b = eVar;
        this.f272760c = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        CvCreationItem cvCreationItem = (CvCreationItem) aVar;
        I5.a(hVar.f272764b, cvCreationItem.f272736c, false);
        I5.a(hVar.f272765c, cvCreationItem.f272737d, false);
        e eVar2 = new e(this, i12, cvCreationItem);
        CvCreationItemAction cvCreationItemAction = cvCreationItem.f272738e;
        String str = cvCreationItemAction.f272746b;
        Button button = hVar.f272766d;
        button.setText(str);
        Integer num = cvCreationItemAction.f272748d;
        if (num != null) {
            Button.g(button, C35835l0.h(num.intValue(), button.getContext()), null, false, null, 14);
        } else {
            Button.g(button, null, null, false, null, 14);
        }
        button.setOnClickListener(new m(22, eVar2, cvCreationItemAction));
    }
}
