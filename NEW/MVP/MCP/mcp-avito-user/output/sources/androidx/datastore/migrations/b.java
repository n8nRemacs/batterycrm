package androidx.datastore.migrations;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SharedPreferencesMigration.kt */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@DebugMetadata(c = "androidx.datastore.migrations.SharedPreferencesMigration", f = "SharedPreferencesMigration.kt", i = {0}, l = {147}, m = "shouldMigrate", n = {"this"}, s = {"L$0"})
/* loaded from: classes.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public a f45537q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f45538r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a<Object> f45539s;

    /* renamed from: t, reason: collision with root package name */
    public int f45540t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f45539s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f45538r = obj;
        this.f45540t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f45539s.t(null, this);
    }
}
