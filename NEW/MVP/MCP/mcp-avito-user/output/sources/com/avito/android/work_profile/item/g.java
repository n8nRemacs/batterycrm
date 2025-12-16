package com.avito.android.work_profile.item;

import Y41.l;
import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.cv_snippet.CvSnippet;
import com.avito.android.cv_snippet.CvSnippetView;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import nQ0.InterfaceC44322a;

/* compiled from: CvSnippetItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/work_profile/item/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/work_profile/item/f;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CvSnippetView f330706b;

    /* compiled from: CvSnippetItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements l<DeepLink, G0> {
        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            ((InterfaceC44322a) this.receiver).V4(deepLink);
            return G0.f406611a;
        }
    }

    /* compiled from: CvSnippetItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements l<DeepLink, G0> {
        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            ((InterfaceC44322a) this.receiver).W2(deepLink);
            return G0.f406611a;
        }
    }

    public g(@k View view) {
        super(view);
        this.f330706b = (CvSnippetView) view.findViewById(R.id.cv_snippet);
    }

    @Override // com.avito.android.work_profile.item.f
    public final void po(@k CvSnippet cvSnippet, @k InterfaceC44322a interfaceC44322a) {
        this.f330706b.i(cvSnippet, new a(1, interfaceC44322a, InterfaceC44322a.class, "snippetClickListener", "snippetClickListener(Lcom/avito/android/deep_linking/links/DeepLink;)V", 0), new b(1, interfaceC44322a, InterfaceC44322a.class, "editClickListener", "editClickListener(Lcom/avito/android/deep_linking/links/DeepLink;)V", 0));
    }
}
