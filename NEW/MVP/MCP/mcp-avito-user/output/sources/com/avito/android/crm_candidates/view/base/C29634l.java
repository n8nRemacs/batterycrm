package com.avito.android.crm_candidates.view.base;

import com.avito.android.R;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: JobCrmCandidatesFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.crm_candidates.view.base.l, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29634l extends kotlin.jvm.internal.N implements Y41.l<ContentPlaceholder, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ JobCrmCandidatesFragment f129924l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29634l(JobCrmCandidatesFragment jobCrmCandidatesFragment) {
        super(1);
        this.f129924l = jobCrmCandidatesFragment;
    }

    @Override // Y41.l
    public final G0 invoke(ContentPlaceholder contentPlaceholder) {
        ContentPlaceholder contentPlaceholder2 = contentPlaceholder;
        contentPlaceholder2.setTitle(contentPlaceholder2.getContext().getText(R.string.crm_error));
        contentPlaceholder2.setSubtitle(contentPlaceholder2.getContext().getText(R.string.crm_error_description));
        contentPlaceholder2.setButtonTitle(contentPlaceholder2.getContext().getText(R.string.crm_error_retry));
        contentPlaceholder2.setButtonOnClickListener(new ViewOnClickListenerC29632j(this.f129924l, 2));
        return G0.f406611a;
    }
}
