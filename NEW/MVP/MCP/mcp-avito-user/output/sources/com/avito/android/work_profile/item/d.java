package com.avito.android.work_profile.item;

import Y61.k;
import com.avito.android.cv_snippet.CvSnippet;
import javax.inject.Inject;
import kotlin.Metadata;
import nQ0.InterfaceC44322a;

/* compiled from: CvSnippetItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/work_profile/item/d;", "Lcom/avito/android/work_profile/item/c;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC44322a f330704b;

    @Inject
    public d(@k InterfaceC44322a interfaceC44322a) {
        this.f330704b = interfaceC44322a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ((f) eVar).po((CvSnippet) aVar, this.f330704b);
    }
}
