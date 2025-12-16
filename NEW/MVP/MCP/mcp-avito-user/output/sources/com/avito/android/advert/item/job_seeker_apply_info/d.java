package com.avito.android.advert.item.job_seeker_apply_info;

import Y41.l;
import Y61.k;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.di.C27710t;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35821j2;
import com.avito.android.util.C35835l0;
import com.avito.android.util.text.j;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SeekerResponsesInfoItemV2Presenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/job_seeker_apply_info/d;", "LTV0/d;", "Lcom/avito/android/advert/item/job_seeker_apply_info/f;", "Lcom/avito/android/advert/item/job_seeker_apply_info/SeekerResponsesInfoItemV2;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements TV0.d<f, SeekerResponsesInfoItemV2> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f77235b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@C27710t.u @k l<? super DeepLink, G0> lVar) {
        this.f77235b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        SeekerResponsesInfoItemV2 seekerResponsesInfoItemV2 = (SeekerResponsesInfoItemV2) aVar;
        c cVar = new c(this);
        TextView textView = fVar.f77238b;
        C35821j2.a(fVar.f77239c, C35835l0.m(textView.getContext(), R.attr.ic_info20, com.avito.android.lib.util.darkTheme.c.a(textView.getContext()) ? R.attr.gray88 : R.attr.black));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        AttributedText attributedText = seekerResponsesInfoItemV2.f77229d;
        j.a(textView, attributedText, null);
        attributedText.setOnDeepLinkClickListener(new SE0.a(3, cVar));
    }
}
