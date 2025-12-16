package iv0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PortfolioProjectBuyerOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Liv0/b;", "", "a", "b", "c", "Liv0/b$a;", "Liv0/b$b;", "Liv0/b$c;", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: iv0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC42116b {

    /* compiled from: PortfolioProjectBuyerOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Liv0/b$a;", "Liv0/b;", "<init>", "()V", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iv0.b$a */
    public static final /* data */ class a implements InterfaceC42116b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f405367a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 903268450;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: PortfolioProjectBuyerOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Liv0/b$c;", "Liv0/b;", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iv0.b$c */
    public static final /* data */ class c implements InterfaceC42116b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f405372a;

        public c(@k String str) {
            this.f405372a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f405372a, ((c) obj).f405372a);
        }

        public final int hashCode() {
            return this.f405372a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowError(error="), this.f405372a, ')');
        }
    }

    /* compiled from: PortfolioProjectBuyerOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Liv0/b$b;", "Liv0/b;", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iv0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11541b implements InterfaceC42116b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<Image> f405368a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f405369b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final AdvertAction.Phone f405370c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final AdvertAction.Messenger f405371d;

        public C11541b(@k List<Image> list, @l Integer num, @l AdvertAction.Phone phone, @l AdvertAction.Messenger messenger) {
            this.f405368a = list;
            this.f405369b = num;
            this.f405370c = phone;
            this.f405371d = messenger;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11541b)) {
                return false;
            }
            C11541b c11541b = (C11541b) obj;
            return L.f(this.f405368a, c11541b.f405368a) && L.f(this.f405369b, c11541b.f405369b) && L.f(this.f405370c, c11541b.f405370c) && L.f(this.f405371d, c11541b.f405371d);
        }

        public final int hashCode() {
            int iHashCode = this.f405368a.hashCode() * 31;
            Integer num = this.f405369b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            AdvertAction.Phone phone = this.f405370c;
            int iHashCode3 = (iHashCode2 + (phone == null ? 0 : phone.hashCode())) * 31;
            AdvertAction.Messenger messenger = this.f405371d;
            return iHashCode3 + (messenger != null ? messenger.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "OpenGallery(images=" + this.f405368a + ", startPosition=" + this.f405369b + ", phone=" + this.f405370c + ", message=" + this.f405371d + ')';
        }

        public /* synthetic */ C11541b(List list, Integer num, AdvertAction.Phone phone, AdvertAction.Messenger messenger, int i12, C42822w c42822w) {
            this(list, (i12 & 2) != 0 ? 0 : num, phone, messenger);
        }
    }
}
