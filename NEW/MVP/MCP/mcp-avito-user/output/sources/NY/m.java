package NY;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.messenger.context.Placeholder;
import com.avito.android.remote.model.text.AttributedText;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Placeholder.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LNY/m;", "", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a f11585a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AttributedText f11586b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Placeholder.Button f11587c;

    /* compiled from: Placeholder.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNY/m$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final LinkedHashMap f11588a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Size f11589b;

        public a(@Y61.k LinkedHashMap linkedHashMap, @Y61.k Size size) {
            this.f11588a = linkedHashMap;
            this.f11589b = size;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f11588a.equals(aVar.f11588a) && this.f11589b.equals(aVar.f11589b);
        }

        public final int hashCode() {
            return this.f11589b.hashCode() + (this.f11588a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "Image(url=" + this.f11588a + ", size=" + this.f11589b + ')';
        }
    }

    public m(@Y61.k a aVar, @Y61.k AttributedText attributedText, @Y61.l Placeholder.Button button) {
        this.f11585a = aVar;
        this.f11586b = attributedText;
        this.f11587c = button;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return L.f(this.f11585a, mVar.f11585a) && L.f(this.f11586b, mVar.f11586b) && L.f(this.f11587c, mVar.f11587c);
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(this.f11585a.hashCode() * 31, 31, this.f11586b);
        Placeholder.Button button = this.f11587c;
        return iB2 + (button == null ? 0 : button.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "Placeholder(image=" + this.f11585a + ", description=" + this.f11586b + ", button=" + this.f11587c + ')';
    }
}
