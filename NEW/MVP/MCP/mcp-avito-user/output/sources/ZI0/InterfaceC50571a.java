package zi0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.recall_me.domain.RecallMeFormState;
import com.avito.android.recall_me.presentation.RecallMeParams;
import com.avito.android.recall_me.presentation.items.single_input.SingleInputItem;
import com.avito.android.recall_me.presentation.items.single_input.SingleInputType;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RecallMeAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lzi0/a;", "", "a", "b", "c", "d", "e", "Lzi0/a$a;", "Lzi0/a$b;", "Lzi0/a$c;", "Lzi0/a$d;", "Lzi0/a$e;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zi0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC50571a {

    /* compiled from: RecallMeAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzi0/a$b;", "Lzi0/a;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zi0.a$b */
    public static final /* data */ class b implements InterfaceC50571a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f444178a;

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f444178a, ((b) obj).f444178a);
        }

        public final int hashCode() {
            String str = this.f444178a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnAcceptButtonClicked(confirmedPhone="), this.f444178a, ')');
        }

        public b(@l String str) {
            this.f444178a = str;
        }

        public /* synthetic */ b(String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str);
        }
    }

    /* compiled from: RecallMeAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzi0/a$c;", "Lzi0/a;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zi0.a$c */
    public static final /* data */ class c implements InterfaceC50571a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SingleInputType f444179a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f444180b;

        public c(@k SingleInputType singleInputType, @l String str) {
            this.f444179a = singleInputType;
            this.f444180b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f444179a == cVar.f444179a && L.f(this.f444180b, cVar.f444180b);
        }

        public final int hashCode() {
            int iHashCode = this.f444179a.hashCode() * 31;
            String str = this.f444180b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnTextInputChanged(fieldType=");
            sb2.append(this.f444179a);
            sb2.append(", newValue=");
            return C22026a.c(sb2, this.f444180b, ')');
        }
    }

    /* compiled from: RecallMeAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzi0/a$d;", "Lzi0/a;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zi0.a$d */
    public static final /* data */ class d implements InterfaceC50571a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SingleInputItem f444181a;

        public d(@k SingleInputItem singleInputItem) {
            this.f444181a = singleInputItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f444181a, ((d) obj).f444181a);
        }

        public final int hashCode() {
            return this.f444181a.hashCode();
        }

        @k
        public final String toString() {
            return "OnValidationReset(item=" + this.f444181a + ')';
        }
    }

    /* compiled from: RecallMeAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzi0/a$e;", "Lzi0/a;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zi0.a$e */
    public static final /* data */ class e implements InterfaceC50571a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f444182a;

        public e(@k DeepLink deepLink) {
            this.f444182a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f444182a, ((e) obj).f444182a);
        }

        public final int hashCode() {
            return this.f444182a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenLink(link="), this.f444182a, ')');
        }
    }

    /* compiled from: RecallMeAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzi0/a$a;", "Lzi0/a;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zi0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12967a implements InterfaceC50571a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final RecallMeParams f444176a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final RecallMeFormState f444177b;

        public C12967a(@k RecallMeParams recallMeParams, @l RecallMeFormState recallMeFormState) {
            this.f444176a = recallMeParams;
            this.f444177b = recallMeFormState;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12967a)) {
                return false;
            }
            C12967a c12967a = (C12967a) obj;
            return L.f(this.f444176a, c12967a.f444176a) && L.f(this.f444177b, c12967a.f444177b);
        }

        public final int hashCode() {
            int iHashCode = this.f444176a.hashCode() * 31;
            RecallMeFormState recallMeFormState = this.f444177b;
            return iHashCode + (recallMeFormState == null ? 0 : recallMeFormState.hashCode());
        }

        @k
        public final String toString() {
            return "LoadContactInfo(openParams=" + this.f444176a + ", formState=" + this.f444177b + ')';
        }

        public /* synthetic */ C12967a(RecallMeParams recallMeParams, RecallMeFormState recallMeFormState, int i12, C42822w c42822w) {
            this(recallMeParams, (i12 & 2) != 0 ? null : recallMeFormState);
        }
    }
}
