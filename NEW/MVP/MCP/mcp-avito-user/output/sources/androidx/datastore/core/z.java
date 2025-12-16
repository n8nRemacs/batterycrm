package androidx.datastore.core;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SingleProcessDataStore.kt */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0, 0, 0}, l = {426}, m = "writeData$datastore_core", n = {"this", "scratchFile", "stream"}, s = {"L$0", "L$1", "L$4"})
/* loaded from: classes.dex */
final class z extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public o f45522q;

    /* renamed from: r, reason: collision with root package name */
    public File f45523r;

    /* renamed from: s, reason: collision with root package name */
    public FileOutputStream f45524s;

    /* renamed from: t, reason: collision with root package name */
    public FileOutputStream f45525t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f45526u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o<Object> f45527v;

    /* renamed from: w, reason: collision with root package name */
    public int f45528w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f45527v = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f45526u = obj;
        this.f45528w |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f45527v.j(null, this);
    }
}
