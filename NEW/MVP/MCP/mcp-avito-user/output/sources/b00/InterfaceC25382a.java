package b00;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.document_requirements.model.Document;
import kotlin.Metadata;

/* compiled from: DocumentRequirementsAction.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lb00/a;", "", "a", "Lb00/a$a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: b00.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC25382a {

    /* compiled from: DocumentRequirementsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lb00/a$a;", "Lb00/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b00.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1983a implements InterfaceC25382a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Document f56810a;

        public C1983a(@k Document document) {
            this.f56810a = document;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1983a) && this.f56810a == ((C1983a) obj).f56810a;
        }

        public final int hashCode() {
            return this.f56810a.hashCode();
        }

        @k
        public final String toString() {
            return "DocumentClick(document=" + this.f56810a + ')';
        }
    }
}
