package com.avito.android.auto_loans_cabinet.data;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AutoLoanBlanksDataSource.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.auto_loans_cabinet.data.AutoLoanBlanksDataSourceImpl", f = "AutoLoanBlanksDataSource.kt", i = {0}, l = {22}, m = "getBlanksStatus", n = {"this"}, s = {"L$0"})
/* loaded from: classes11.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public b f95346q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f95347r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f95348s;

    /* renamed from: t, reason: collision with root package name */
    public int f95349t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f95348s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f95347r = obj;
        this.f95349t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f95348s.a(this);
    }
}
