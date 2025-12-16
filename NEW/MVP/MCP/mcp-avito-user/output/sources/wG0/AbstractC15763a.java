package Wg0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RatingFormRequest.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LWg0/a;", "", "<init>", "()V", "a", "b", "LWg0/a$a;", "LWg0/a$b;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Wg0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC15763a {

    /* compiled from: RatingFormRequest.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u0016"}, d2 = {"LWg0/a$a;", "LWg0/a;", "", "pageFrom", "", "draftId", "", "Lcom/avito/android/rating_form/api/remote/model/a;", "commands", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;)V", "Ljava/lang/String;", "getPageFrom", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getDraftId", "()Ljava/lang/Integer;", "Ljava/util/List;", "getCommands", "()Ljava/util/List;", "getTheme", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Wg0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1279a extends AbstractC15763a {

        @c("commands")
        @k
        private final List<com.avito.android.rating_form.api.remote.model.a> commands;

        @c("draftId")
        @l
        private final Integer draftId;

        @c("pageFrom")
        @l
        private final String pageFrom;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)
        @l
        private final String theme;

        /* JADX WARN: Multi-variable type inference failed */
        public C1279a(@l String str, @l Integer num, @k List<? extends com.avito.android.rating_form.api.remote.model.a> list, @l String str2) {
            super(null);
            this.pageFrom = str;
            this.draftId = num;
            this.commands = list;
            this.theme = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1279a)) {
                return false;
            }
            C1279a c1279a = (C1279a) obj;
            return L.f(this.pageFrom, c1279a.pageFrom) && L.f(this.draftId, c1279a.draftId) && L.f(this.commands, c1279a.commands) && L.f(this.theme, c1279a.theme);
        }

        public final int hashCode() {
            String str = this.pageFrom;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.draftId;
            int iE2 = H.e((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.commands);
            String str2 = this.theme;
            return iE2 + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RatingModelFormRequest(pageFrom=");
            sb2.append(this.pageFrom);
            sb2.append(", draftId=");
            sb2.append(this.draftId);
            sb2.append(", commands=");
            sb2.append(this.commands);
            sb2.append(", theme=");
            return C22026a.c(sb2, this.theme, ')');
        }
    }

    /* compiled from: RatingFormRequest.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LWg0/a$b;", "LWg0/a;", "", "draftId", "", "Lcom/avito/android/rating_form/api/remote/model/a;", "commands", "", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "<init>", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;)V", "Ljava/lang/Integer;", "getDraftId", "()Ljava/lang/Integer;", "Ljava/util/List;", "getCommands", "()Ljava/util/List;", "Ljava/lang/String;", "getTheme", "()Ljava/lang/String;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Wg0.a$b */
    public static final /* data */ class b extends AbstractC15763a {

        @c("commands")
        @k
        private final List<com.avito.android.rating_form.api.remote.model.a> commands;

        @c("draftId")
        @l
        private final Integer draftId;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)
        @l
        private final String theme;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@l Integer num, @k List<? extends com.avito.android.rating_form.api.remote.model.a> list, @l String str) {
            super(null);
            this.draftId = num;
            this.commands = list;
            this.theme = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.draftId, bVar.draftId) && L.f(this.commands, bVar.commands) && L.f(this.theme, bVar.theme);
        }

        public final int hashCode() {
            Integer num = this.draftId;
            int iE2 = H.e((num == null ? 0 : num.hashCode()) * 31, 31, this.commands);
            String str = this.theme;
            return iE2 + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RatingSellerFormRequest(draftId=");
            sb2.append(this.draftId);
            sb2.append(", commands=");
            sb2.append(this.commands);
            sb2.append(", theme=");
            return C22026a.c(sb2, this.theme, ')');
        }
    }

    public /* synthetic */ AbstractC15763a(C42822w c42822w) {
        this();
    }

    private AbstractC15763a() {
    }
}
