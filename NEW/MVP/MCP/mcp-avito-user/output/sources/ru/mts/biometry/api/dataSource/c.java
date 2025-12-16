package ru.mts.biometry.api.dataSource;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: IdentificationDataSourceImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ru.mts.biometry.api.dataSource.IdentificationDataSourceImpl", f = "IdentificationDataSourceImpl.kt", i = {}, l = {37}, m = "checkSelfie", n = {}, s = {})
/* loaded from: classes9.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f436320q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f436321r;

    /* renamed from: s, reason: collision with root package name */
    public int f436322s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f436321r = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f436320q = obj;
        this.f436322s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f436321r.c(null, this);
    }
}
