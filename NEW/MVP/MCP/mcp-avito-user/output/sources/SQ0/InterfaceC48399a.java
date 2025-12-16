package sq0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.adapter.select.SelectItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectFieldAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lsq0/a;", "", "a", "b", "c", "Lsq0/a$a;", "Lsq0/a$b;", "Lsq0/a$c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sq0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC48399a {

    /* compiled from: SelectFieldAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsq0/a$a;", "Lsq0/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sq0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12646a implements InterfaceC48399a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final SelectItem.Option f438880a;

        public C12646a(@l SelectItem.Option option) {
            this.f438880a = option;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12646a) && L.f(this.f438880a, ((C12646a) obj).f438880a);
        }

        public final int hashCode() {
            SelectItem.Option option = this.f438880a;
            if (option == null) {
                return 0;
            }
            return option.hashCode();
        }

        @k
        public final String toString() {
            return "SelectOption(option=" + this.f438880a + ')';
        }
    }

    /* compiled from: SelectFieldAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsq0/a$b;", "Lsq0/a;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sq0.a$b */
    public static final /* data */ class b implements InterfaceC48399a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f438881a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1270449342;
        }

        @k
        public final String toString() {
            return "SelectorClick";
        }
    }

    /* compiled from: SelectFieldAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsq0/a$c;", "Lsq0/a;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sq0.a$c */
    public static final /* data */ class c implements InterfaceC48399a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f438882a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -214768283;
        }

        @k
        public final String toString() {
            return "SubmitClick";
        }
    }
}
