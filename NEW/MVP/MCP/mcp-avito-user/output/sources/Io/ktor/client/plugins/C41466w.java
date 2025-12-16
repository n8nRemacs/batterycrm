package io.ktor.client.plugins;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HttpCallValidator.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.HttpCallValidator", f = "HttpCallValidator.kt", i = {0, 0, 1, 1}, l = {58, 59}, m = "processException", n = {"cause", "request", "cause", "request"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* renamed from: io.ktor.client.plugins.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41466w extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Throwable f399650q;

    /* renamed from: r, reason: collision with root package name */
    public io.ktor.client.request.c0 f399651r;

    /* renamed from: s, reason: collision with root package name */
    public Iterator f399652s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f399653t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C41465v f399654u;

    /* renamed from: v, reason: collision with root package name */
    public int f399655v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41466w(C41465v c41465v, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f399654u = c41465v;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f399653t = obj;
        this.f399655v |= BeduinInputModel.MIN_TEXT_VERSION;
        return C41465v.a(this.f399654u, null, null, this);
    }
}
