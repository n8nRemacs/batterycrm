package le;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: RegisterProfilesListV3Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lle/c;", "", "a", "b", "Lle/c$a;", "Lle/c$b;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: le.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC43738c {

    /* compiled from: RegisterProfilesListV3Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lle/c$a;", "Lle/c;", "Lle/a;", "messages", "<init>", "(Lle/a;)V", "Lle/a;", "a", "()Lle/a;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: le.c$a */
    public static final class a implements InterfaceC43738c {

        @com.google.gson.annotations.c("messages")
        @k
        private final C43736a messages;

        public a(@k C43736a c43736a) {
            this.messages = c43736a;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final C43736a getMessages() {
            return this.messages;
        }
    }

    /* compiled from: RegisterProfilesListV3Response.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lle/c$b;", "Lle/c;", "Lle/b;", "profile", "Lcom/avito/android/remote/model/text/AttributedText;", ConstraintKt.WARNING, "<init>", "(Lle/b;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lle/b;", "a", "()Lle/b;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: le.c$b */
    public static final class b implements InterfaceC43738c {

        @com.google.gson.annotations.c("profile")
        @k
        private final C43737b profile;

        @com.google.gson.annotations.c(ConstraintKt.WARNING)
        @l
        private final AttributedText warning;

        public b(@k C43737b c43737b, @l AttributedText attributedText) {
            this.profile = c43737b;
            this.warning = attributedText;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final C43737b getProfile() {
            return this.profile;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final AttributedText getWarning() {
            return this.warning;
        }
    }
}
