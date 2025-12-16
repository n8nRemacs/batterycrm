package com.avito.android.rating.details.answer.text.mvi;

import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.rating.details.answer.text.mvi.entity.RatingAddAnswerTextInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import ug0.C49057c;

/* compiled from: RatingAddAnswerTextBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/details/answer/text/mvi/c;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/rating/details/answer/text/mvi/entity/RatingAddAnswerTextInternalAction;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements com.avito.android.arch.mvi.b<RatingAddAnswerTextInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f246866a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Long f246867b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f246868c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f246869d;

    @Inject
    public c(@Y61.k InterfaceC28373a interfaceC28373a, @l Long l12, boolean z12) {
        this.f246866a = interfaceC28373a;
        this.f246867b = l12;
        this.f246868c = z12;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<RatingAddAnswerTextInternalAction> a() {
        if (!this.f246869d && !this.f246868c) {
            this.f246866a.c(new C49057c(this.f246867b));
        }
        this.f246869d = true;
        return new C43210w(RatingAddAnswerTextInternalAction.ShowKeyboard.f246880b);
    }

    @Override // com.avito.android.arch.mvi.b
    @l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
