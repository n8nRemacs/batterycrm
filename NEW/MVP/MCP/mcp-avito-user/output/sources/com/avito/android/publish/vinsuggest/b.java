package com.avito.android.publish.vinsuggest;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: VinSuggestInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.publish.vinsuggest.VinSuggestInteractor", f = "VinSuggestInteractor.kt", i = {0}, l = {108}, m = "getPhotoIdsFromDraft", n = {"this"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public c f245705q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f245706r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f245707s;

    /* renamed from: t, reason: collision with root package name */
    public int f245708t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f245707s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f245706r = obj;
        this.f245708t |= BeduinInputModel.MIN_TEXT_VERSION;
        return c.a(this.f245707s, this);
    }
}
