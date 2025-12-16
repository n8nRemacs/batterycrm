package io.ktor.client.plugins.logging;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HttpClientCallLogger.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.logging.HttpClientCallLogger", f = "HttpClientCallLogger.kt", i = {0, 0}, l = {AvailableCode.HMS_IS_SPOOF}, m = "logResponseException", n = {"this", "message"}, s = {"L$0", "L$1"})
/* renamed from: io.ktor.client.plugins.logging.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41456c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public d f399504q;

    /* renamed from: r, reason: collision with root package name */
    public String f399505r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f399506s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f399507t;

    /* renamed from: u, reason: collision with root package name */
    public int f399508u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41456c(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f399507t = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f399506s = obj;
        this.f399508u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f399507t.d(null, this);
    }
}
