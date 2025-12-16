package okio.internal;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42754k;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.sequences.AbstractC43032o;
import okio.AbstractC44811v;
import okio.S;

/* compiled from: FileSystem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "okio.internal.-FileSystem", f = "FileSystem.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {116, 135, 145}, m = "collectRecursively", n = {"$this$collectRecursively", "fileSystem", "stack", "path", "followSymlinks", "postorder", "$this$collectRecursively", "fileSystem", "stack", "path", "followSymlinks", "postorder"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1"})
/* loaded from: classes7.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public AbstractC43032o f420072q;

    /* renamed from: r, reason: collision with root package name */
    public AbstractC44811v f420073r;

    /* renamed from: s, reason: collision with root package name */
    public C42754k f420074s;

    /* renamed from: t, reason: collision with root package name */
    public S f420075t;

    /* renamed from: u, reason: collision with root package name */
    public Iterator f420076u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f420077v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f420078w;

    /* renamed from: x, reason: collision with root package name */
    public int f420079x;

    public d() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f420078w = obj;
        this.f420079x |= BeduinInputModel.MIN_TEXT_VERSION;
        return g.a(null, null, null, null, false, this);
    }
}
