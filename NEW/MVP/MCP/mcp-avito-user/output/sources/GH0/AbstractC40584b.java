package gH0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.GeoReference;
import fH0.InterfaceC40292b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AddressPresenterDelegateAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LgH0/b;", "LfH0/b;", "<init>", "()V", "a", "b", "LgH0/b$a;", "LgH0/b$b;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gH0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC40584b implements InterfaceC40292b {

    /* compiled from: AddressPresenterDelegateAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LgH0/b$a;", "LgH0/b;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gH0.b$a */
    public static final class a extends AbstractC40584b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f396413a = new a();

        public a() {
            super(null);
        }
    }

    /* compiled from: AddressPresenterDelegateAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LgH0/b$b;", "LgH0/b;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gH0.b$b, reason: collision with other inner class name */
    public static final class C11202b extends AbstractC40584b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f396414a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final List<GeoReference> f396415b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Coordinates f396416c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f396417d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f396418e;

        public C11202b(@k Coordinates coordinates, @k String str, @k String str2, @k String str3, @l List list) {
            super(null);
            this.f396414a = str;
            this.f396415b = list;
            this.f396416c = coordinates;
            this.f396417d = str2;
            this.f396418e = str3;
        }
    }

    public /* synthetic */ AbstractC40584b(C42822w c42822w) {
        this();
    }

    public AbstractC40584b() {
    }
}
