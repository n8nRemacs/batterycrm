package androidx.datastore.core;

import androidx.datastore.core.o;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.io.FileInputStream;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SingleProcessDataStore.kt */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0}, l = {381}, m = "readData", n = {"this"}, s = {"L$0"})
/* loaded from: classes.dex */
final class v extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public o f45503q;

    /* renamed from: r, reason: collision with root package name */
    public FileInputStream f45504r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f45505s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o<Object> f45506t;

    /* renamed from: u, reason: collision with root package name */
    public int f45507u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f45506t = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f45505s = obj;
        this.f45507u |= BeduinInputModel.MIN_TEXT_VERSION;
        o.a aVar = o.f45433k;
        return this.f45506t.g(this);
    }
}
