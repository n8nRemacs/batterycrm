package ru.mts.biometry.api.dataSource;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RecognitionDataSourceImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ru.mts.biometry.api.dataSource.RecognitionDataSourceImpl", f = "RecognitionDataSourceImpl.kt", i = {}, l = {34}, m = "sendFiles", n = {}, s = {})
/* loaded from: classes9.dex */
final class m extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f436345q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o f436346r;

    /* renamed from: s, reason: collision with root package name */
    public int f436347s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f436346r = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f436345q = obj;
        this.f436347s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f436346r.b(null, this);
    }
}
