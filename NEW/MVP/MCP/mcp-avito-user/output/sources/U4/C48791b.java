package u4;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.ab_tests.InterfaceC27642e;
import com.avito.android.ab_tests.c0;
import com.avito.android.advert.item.auto_media.ab.ItemJournalAbTestGroup;
import javax.inject.Inject;
import kotlin.Metadata;
import u3.g;

/* compiled from: AdvertDetailsAutoMediaAbTestsProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lu4/b;", "Lu4/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: u4.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C48791b implements InterfaceC48790a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c0 f439765a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC27642e f439766b;

    @Inject
    public C48791b(@k InterfaceC27642e interfaceC27642e, @k c0 c0Var) {
        this.f439765a = c0Var;
        this.f439766b = interfaceC27642e;
    }

    @Override // u4.InterfaceC48790a
    @k
    public final g<ItemJournalAbTestGroup> a() {
        return new g<>(this.f439766b.c(new d()), this.f439765a);
    }
}
