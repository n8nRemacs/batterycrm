package io.ktor.client.plugins.contentnegotiation;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.client.plugins.contentnegotiation.a;
import io.ktor.client.request.d0;
import io.ktor.http.C41524i;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ContentNegotiation.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.contentnegotiation.ContentNegotiation", f = "ContentNegotiation.kt", i = {0, 0, 0, 0, 0}, l = {180}, m = "convertRequest$ktor_client_content_negotiation", n = {"request", "body", "contentType", "matchingRegistrations", "registration"}, s = {"L$0", "L$1", "L$2", "L$3", "L$5"})
/* loaded from: classes8.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public d0 f399321q;

    /* renamed from: r, reason: collision with root package name */
    public Object f399322r;

    /* renamed from: s, reason: collision with root package name */
    public C41524i f399323s;

    /* renamed from: t, reason: collision with root package name */
    public List f399324t;

    /* renamed from: u, reason: collision with root package name */
    public Iterator f399325u;

    /* renamed from: v, reason: collision with root package name */
    public a.C11402a.C11403a f399326v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f399327w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a f399328x;

    /* renamed from: y, reason: collision with root package name */
    public int f399329y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f399328x = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f399327w = obj;
        this.f399329y |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f399328x.a(null, null, this);
    }
}
