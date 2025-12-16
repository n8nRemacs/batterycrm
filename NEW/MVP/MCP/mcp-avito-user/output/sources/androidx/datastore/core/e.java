package androidx.datastore.core;

import androidx.datastore.core.g;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DataMigrationInitializer.kt */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", i = {0, 1}, l = {42, 57}, m = "runMigrations", n = {"cleanUps", "cleanUpFailure"}, s = {"L$0", "L$0"})
/* loaded from: classes.dex */
final class e<T> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Serializable f45405q;

    /* renamed from: r, reason: collision with root package name */
    public Iterator f45406r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f45407s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g.a f45408t;

    /* renamed from: u, reason: collision with root package name */
    public int f45409u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g.a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f45408t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f45407s = obj;
        this.f45409u |= BeduinInputModel.MIN_TEXT_VERSION;
        return g.a.a(this.f45408t, null, null, this);
    }
}
