package Lr;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CptActivationOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LLr/b;", "", "a", "b", "LLr/b$a;", "LLr/b$b;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Lr.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC14432b {

    /* compiled from: CptActivationOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LLr/b$a;", "LLr/b;", "<init>", "()V", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Lr.b$a */
    public static final /* data */ class a implements InterfaceC14432b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f10135a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 215592087;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: CptActivationOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLr/b$b;", "LLr/b;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Lr.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0634b implements InterfaceC14432b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f10136a;

        public C0634b(@k DeepLink deepLink) {
            this.f10136a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0634b) && L.f(this.f10136a, ((C0634b) obj).f10136a);
        }

        public final int hashCode() {
            return this.f10136a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f10136a, ')');
        }
    }
}
