package JY;

import AK0.l;
import Ag.CallableC13028a;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.di.U0;
import io.reactivex.rxjava3.internal.operators.completable.C41826q;
import io.reactivex.rxjava3.internal.operators.single.G;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PersistentMessengerConfigStorage.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJY/e;", "LY81/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements Y81.d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f9030a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Object f9031b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public volatile Y81.a f9032c;

    @Inject
    public e(@U0.d @k l lVar) {
        this.f9030a = lVar;
    }

    @Override // Y81.d
    @k
    public final G a(@k Y81.a aVar) {
        return new G(new CallableC13028a(2, this, aVar));
    }

    @Override // Y81.d
    @k
    public final C41826q b(@k Y81.a aVar) {
        return new C41826q(new GL.a(1, this, aVar));
    }
}
