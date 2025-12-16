package io.ktor.client.plugins.logging;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HttpClientCallLogger.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.logging.HttpClientCallLogger", f = "HttpClientCallLogger.kt", i = {0}, l = {52}, m = "closeResponseLog", n = {"this"}, s = {"L$0"})
/* renamed from: io.ktor.client.plugins.logging.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41454a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public d f399495q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f399496r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f399497s;

    /* renamed from: t, reason: collision with root package name */
    public int f399498t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41454a(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f399497s = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f399496r = obj;
        this.f399498t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f399497s.b(this);
    }
}
