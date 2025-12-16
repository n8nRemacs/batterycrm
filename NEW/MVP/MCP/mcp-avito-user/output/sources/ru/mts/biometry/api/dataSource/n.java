package ru.mts.biometry.api.dataSource;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RecognitionDataSourceImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ru.mts.biometry.api.dataSource.RecognitionDataSourceImpl", f = "RecognitionDataSourceImpl.kt", i = {0}, l = {43}, m = VoiceInfo.STATE, n = {"this"}, s = {"L$0"})
/* loaded from: classes9.dex */
final class n extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public o f436348q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f436349r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o f436350s;

    /* renamed from: t, reason: collision with root package name */
    public int f436351t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f436350s = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f436349r = obj;
        this.f436351t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f436350s.c(this);
    }
}
