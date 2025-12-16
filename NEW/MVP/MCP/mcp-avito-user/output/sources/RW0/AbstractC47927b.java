package rw0;

import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CalculationOptions.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lrw0/b;", "", "<init>", "()V", "a", "b", "Lrw0/b$a;", "Lrw0/b$b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rw0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC47927b {

    /* compiled from: CalculationOptions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrw0/b$a;", "Lrw0/b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rw0.b$a */
    public static final /* data */ class a extends AbstractC47927b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f437172a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final AttributedText f437173b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final k f437174c;

        public a(@Y61.k ArrayList arrayList, @Y61.k AttributedText attributedText, @Y61.k k kVar) {
            super(null);
            this.f437172a = arrayList;
            this.f437173b = attributedText;
            this.f437174c = kVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f437172a, aVar.f437172a) && L.f(this.f437173b, aVar.f437173b) && L.f(this.f437174c, aVar.f437174c);
        }

        public final int hashCode() {
            return this.f437174c.hashCode() + com.avito.android.actions_sheet.a.b(this.f437172a.hashCode() * 31, 31, this.f437173b);
        }

        @Y61.k
        public final String toString() {
            return "Content(payments=" + this.f437172a + ", bonusesInfo=" + this.f437173b + ", paymentState=" + this.f437174c + ')';
        }
    }

    /* compiled from: CalculationOptions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrw0/b$b;", "Lrw0/b;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rw0.b$b, reason: collision with other inner class name */
    public static final class C12600b extends AbstractC47927b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C12600b f437175a = new C12600b();

        public C12600b() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC47927b(C42822w c42822w) {
        this();
    }

    public AbstractC47927b() {
    }
}
