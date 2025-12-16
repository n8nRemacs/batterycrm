package m60;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: AccountsMergePhoneNumberInputApiResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lm60/a;", "", "a", "b", "Lm60/a$a;", "Lm60/a$b;", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: m60.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC43891a {

    /* compiled from: AccountsMergePhoneNumberInputApiResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lm60/a$a;", "Lm60/a;", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: m60.a$a, reason: collision with other inner class name */
    public static final class C11815a implements InterfaceC43891a {

        @c("description")
        @l
        private final AttributedText description;

        public C11815a(@l AttributedText attributedText) {
            this.description = attributedText;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final AttributedText getDescription() {
            return this.description;
        }
    }

    /* compiled from: AccountsMergePhoneNumberInputApiResponse.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lm60/a$b;", "Lm60/a;", "<init>", "()V", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: m60.a$b */
    public static final /* data */ class b implements InterfaceC43891a {
        static {
            new b();
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 530341251;
        }

        @k
        public final String toString() {
            return "NoActiveSession";
        }
    }
}
