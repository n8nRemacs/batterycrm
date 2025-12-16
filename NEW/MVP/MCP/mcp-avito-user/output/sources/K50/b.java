package K50;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BusinessVrfResult.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LK50/b;", "", "a", "b", "c", "LK50/b$a;", "LK50/b$b;", "LK50/b$c;", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: BusinessVrfResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LK50/b$a;", "LK50/b;", "LK50/j;", "passportUserDialog", "<init>", "(LK50/j;)V", "LK50/j;", "a", "()LK50/j;", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        @com.google.gson.annotations.c("passportUserDialog")
        @Y61.k
        private final j passportUserDialog;

        public a(@Y61.k j jVar) {
            this.passportUserDialog = jVar;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final j getPassportUserDialog() {
            return this.passportUserDialog;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.passportUserDialog, ((a) obj).passportUserDialog);
        }

        public final int hashCode() {
            return this.passportUserDialog.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ErrorDialog(passportUserDialog=" + this.passportUserDialog + ')';
        }
    }

    /* compiled from: BusinessVrfResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LK50/b$b;", "LK50/b;", "<init>", "()V", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: K50.b$b, reason: collision with other inner class name */
    public static final class C0553b implements b {
    }

    /* compiled from: BusinessVrfResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LK50/b$c;", "LK50/b;", "LK50/c;", "data", "<init>", "(LK50/c;)V", "LK50/c;", "a", "()LK50/c;", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        @com.google.gson.annotations.c("data")
        @Y61.k
        private final K50.c data;

        public c(@Y61.k K50.c cVar) {
            this.data = cVar;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final K50.c getData() {
            return this.data;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.data, ((c) obj).data);
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Ok(data=" + this.data + ')';
        }
    }
}
