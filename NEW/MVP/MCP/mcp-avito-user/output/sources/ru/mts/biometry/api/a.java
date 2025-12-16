package ru.mts.biometry.api;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BiometryDataSource.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ru.mts.biometry.api.BiometryDataSource", f = "BiometryDataSource.kt", i = {0}, l = {81}, m = VoiceInfo.STATE, n = {"this"}, s = {"L$0"})
/* loaded from: classes9.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public d f436304q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f436305r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f436306s;

    /* renamed from: t, reason: collision with root package name */
    public int f436307t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f436306s = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f436305r = obj;
        this.f436307t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f436306s.a(this);
    }
}
