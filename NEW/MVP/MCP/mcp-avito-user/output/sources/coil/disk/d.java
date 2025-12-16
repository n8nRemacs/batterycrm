package coil.disk;

import Y41.l;
import java.io.IOException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DiskLruCache.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/io/IOException;", "Lokio/IOException;", "it", "Lkotlin/G0;", "invoke", "(Ljava/io/IOException;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements l<IOException, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f58354l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar) {
        super(1);
        this.f58354l = bVar;
    }

    @Override // Y41.l
    public final G0 invoke(IOException iOException) {
        this.f58354l.f58331l = true;
        return G0.f406611a;
    }
}
