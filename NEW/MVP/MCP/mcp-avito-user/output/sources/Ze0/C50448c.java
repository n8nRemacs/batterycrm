package zE0;

import Y61.k;
import com.avito.android.ownership.Owners;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import vE0.AbstractC49202b;
import vE0.C49204d;
import vE0.InterfaceC49203c;

/* compiled from: LastSearchTimestampFeature.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LzE0/c;", "LvE0/c;", "a", "_avito_timestamp-storage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zE0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50448c implements InterfaceC49203c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f443977b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final AbstractC49202b.AbstractC12751b.a f443978c = new AbstractC49202b.AbstractC12751b.a("LastSearchTimestampFeature_show", new C49204d(null, 0L, 1, null), false, false, new C49204d(16L, null, 2, null), 12, null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AbstractC49202b.a f443979a;

    /* compiled from: LastSearchTimestampFeature.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LzE0/c$a;", "", "<init>", "()V", "_avito_timestamp-storage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zE0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C50448c(long j12) {
        Owners owners = Owners.f210476d;
        this.f443979a = new AbstractC49202b.a(String.valueOf(j12), new C49204d(null, 0L, 1, null), false, f443978c, 4, null);
    }

    @Override // vE0.InterfaceC49203c
    @k
    public final List<AbstractC49202b> a() {
        return C42745f0.U(f443978c, this.f443979a);
    }
}
