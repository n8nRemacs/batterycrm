package io.ktor.client.plugins;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HttpCallValidator.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.HttpCallValidator", f = "HttpCallValidator.kt", i = {0}, l = {51}, m = "validateResponse", n = {"response"}, s = {"L$0"})
/* renamed from: io.ktor.client.plugins.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41474x extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public io.ktor.client.statement.d f399687q;

    /* renamed from: r, reason: collision with root package name */
    public Iterator f399688r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f399689s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C41465v f399690t;

    /* renamed from: u, reason: collision with root package name */
    public int f399691u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41474x(C41465v c41465v, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f399690t = c41465v;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f399689s = obj;
        this.f399691u |= BeduinInputModel.MIN_TEXT_VERSION;
        return C41465v.b(this.f399690t, null, this);
    }
}
