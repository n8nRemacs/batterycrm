package com.avito.android.tariff.cpa.prepaid_expense;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PublicationAdvanceFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "isEnabled", "Lkotlin/G0;", "invoke", "(Ljava/lang/Boolean;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class m extends N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PublicationAdvanceFragment f295061l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(PublicationAdvanceFragment publicationAdvanceFragment) {
        super(1);
        this.f295061l = publicationAdvanceFragment;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        Boolean bool2 = bool;
        PublicationAdvanceFragment publicationAdvanceFragment = this.f295061l;
        if (publicationAdvanceFragment.getContext() != null) {
            publicationAdvanceFragment.q5().setEnabled(bool2.booleanValue());
        }
        return G0.f406611a;
    }
}
