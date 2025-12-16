package com.avito.android.rating_form.step.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RatingFormStepBootstrap.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.rating_form.step.mvi.RatingFormStepBootstrap", f = "RatingFormStepBootstrap.kt", i = {0}, l = {86}, m = "handleRatingFormFiles", n = {"this"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class o extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public s f249663q;

    /* renamed from: r, reason: collision with root package name */
    public Iterator f249664r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f249665s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s f249666t;

    /* renamed from: u, reason: collision with root package name */
    public int f249667u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(s sVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f249666t = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f249665s = obj;
        this.f249667u |= BeduinInputModel.MIN_TEXT_VERSION;
        return s.c(this.f249666t, this);
    }
}
