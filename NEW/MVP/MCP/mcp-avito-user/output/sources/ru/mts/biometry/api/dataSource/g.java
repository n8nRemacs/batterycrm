package ru.mts.biometry.api.dataSource;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: IdentificationDataSourceImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ru.mts.biometry.api.dataSource.IdentificationDataSourceImpl", f = "IdentificationDataSourceImpl.kt", i = {}, l = {146}, m = VoiceInfo.STATE, n = {}, s = {})
/* loaded from: classes9.dex */
final class g extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f436335q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f436336r;

    /* renamed from: s, reason: collision with root package name */
    public int f436337s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f436336r = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f436335q = obj;
        this.f436337s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f436336r.g(this);
    }
}
