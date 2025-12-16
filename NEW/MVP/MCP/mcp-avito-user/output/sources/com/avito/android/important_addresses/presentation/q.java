package com.avito.android.important_addresses.presentation;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ImportantAddressesPresenter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.important_addresses.presentation.ImportantAddressesPresenterImpl", f = "ImportantAddressesPresenter.kt", i = {0, 0}, l = {190, 190}, m = "loadImportantAddressesData", n = {"this", "trackWidgetShown"}, s = {"L$0", "Z$0"})
/* loaded from: classes14.dex */
final class q extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public m f169678q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f169679r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f169680s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ m f169681t;

    /* renamed from: u, reason: collision with root package name */
    public int f169682u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f169681t = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f169680s = obj;
        this.f169682u |= BeduinInputModel.MIN_TEXT_VERSION;
        return m.c(this.f169681t, false, this);
    }
}
