package p40;

import Y61.k;
import com.avito.android.I1;
import com.avito.android.zstd.e;
import com.squareup.anvil.annotations.ContributesBinding;
import java.io.ByteArrayInputStream;
import java.util.Arrays;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;
import okio.X;

/* compiled from: BeduinCacheCompressor.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lp40/b;", "Lp40/a;", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: p40.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C46891b implements InterfaceC46890a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f428190a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final I1 f428191b;

    @Inject
    public C46891b(@k e eVar, @k I1 i12) {
        this.f428190a = eVar;
        this.f428191b = i12;
    }

    @Override // p40.InterfaceC46890a
    public final void a(@k X x12, @k String str) {
        if (this.f428191b.x().invoke().booleanValue()) {
            x12.write(this.f428190a.b(str));
        } else {
            x12.b2(str);
        }
    }

    @Override // p40.InterfaceC46890a
    @k
    public final String b(@k byte[] bArr) {
        try {
            return C43066x.v(kotlin.io.b.c(this.f428190a.c(new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length)))));
        } catch (Exception unused) {
            return C43066x.v(bArr);
        }
    }
}
