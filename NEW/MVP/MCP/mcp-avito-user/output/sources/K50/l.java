package K50;

import androidx.appcompat.app.r;
import com.avito.android.remote.model.UserDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RequestCheckOwnershipResult.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LK50/l;", "", "a", "b", "c", "LK50/l$a;", "LK50/l$b;", "LK50/l$c;", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface l {

    /* compiled from: RequestCheckOwnershipResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LK50/l$a;", "LK50/l;", "Lcom/avito/android/remote/model/UserDialog;", "userDialog", "<init>", "(Lcom/avito/android/remote/model/UserDialog;)V", "Lcom/avito/android/remote/model/UserDialog;", "a", "()Lcom/avito/android/remote/model/UserDialog;", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements l {

        @com.google.gson.annotations.c("userDialog")
        @Y61.k
        private final UserDialog userDialog;

        public a(@Y61.k UserDialog userDialog) {
            this.userDialog = userDialog;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final UserDialog getUserDialog() {
            return this.userDialog;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.userDialog, ((a) obj).userDialog);
        }

        public final int hashCode() {
            return this.userDialog.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Failure(userDialog=" + this.userDialog + ')';
        }
    }

    /* compiled from: RequestCheckOwnershipResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LK50/l$b;", "LK50/l;", "<init>", "()V", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements l {
    }

    /* compiled from: RequestCheckOwnershipResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LK50/l$c;", "LK50/l;", "", "timerSeconds", "<init>", "(I)V", "I", "a", "()I", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements l {

        @com.google.gson.annotations.c("timer")
        private final int timerSeconds;

        public c(int i12) {
            this.timerSeconds = i12;
        }

        /* renamed from: a, reason: from getter */
        public final int getTimerSeconds() {
            return this.timerSeconds;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.timerSeconds == ((c) obj).timerSeconds;
        }

        public final int hashCode() {
            return Integer.hashCode(this.timerSeconds);
        }

        @Y61.k
        public final String toString() {
            return r.t(new StringBuilder("Ok(timerSeconds="), this.timerSeconds, ')');
        }
    }
}
