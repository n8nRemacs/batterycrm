package vn;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DiscountOnDelivery.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lvn/b;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "Lvn/b$a;", "progressBar", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lvn/b$a;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lvn/b$a;", "a", "()Lvn/b$a;", "_avito_cart-snippet-actions_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vn.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C49355b {

    @c("progressBar")
    @k
    private final a progressBar;

    @c("text")
    @k
    private final AttributedText text;

    /* compiled from: DiscountOnDelivery.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lvn/b$a;", "", "", "", "fractions", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito_cart-snippet-actions_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vn.b$a */
    public static final /* data */ class a {

        @c("fractions")
        @k
        private final List<Float> fractions;

        public a(@k List<Float> list) {
            this.fractions = list;
        }

        @k
        public final List<Float> a() {
            return this.fractions;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.fractions, ((a) obj).fractions);
        }

        public final int hashCode() {
            return this.fractions.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("ProgressBar(fractions="), this.fractions, ')');
        }
    }

    public C49355b(@k AttributedText attributedText, @k a aVar) {
        this.text = attributedText;
        this.progressBar = aVar;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final a getProgressBar() {
        return this.progressBar;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final AttributedText getText() {
        return this.text;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49355b)) {
            return false;
        }
        C49355b c49355b = (C49355b) obj;
        return L.f(this.text, c49355b.text) && L.f(this.progressBar, c49355b.progressBar);
    }

    public final int hashCode() {
        return this.progressBar.hashCode() + (this.text.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "DiscountOnDelivery(text=" + this.text + ", progressBar=" + this.progressBar + ')';
    }
}
