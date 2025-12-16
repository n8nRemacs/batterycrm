package Vr;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CptMassActivationOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LVr/b;", "", "a", "b", "c", "LVr/b$a;", "LVr/b$b;", "LVr/b$c;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Vr.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC15710b {

    /* compiled from: CptMassActivationOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVr/b$a;", "LVr/b;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vr.b$a */
    public static final /* data */ class a implements InterfaceC15710b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f17429a;

        public a(@k DeepLink deepLink) {
            this.f17429a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f17429a, ((a) obj).f17429a);
        }

        public final int hashCode() {
            return this.f17429a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("CloseWithDeeplinkResult(deeplink="), this.f17429a, ')');
        }
    }

    /* compiled from: CptMassActivationOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVr/b$b;", "LVr/b;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vr.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1206b implements InterfaceC15710b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f17430a;

        public C1206b(@k DeepLink deepLink) {
            this.f17430a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1206b) && L.f(this.f17430a, ((C1206b) obj).f17430a);
        }

        public final int hashCode() {
            return this.f17430a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f17430a, ')');
        }
    }

    /* compiled from: CptMassActivationOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVr/b$c;", "LVr/b;", "<init>", "()V", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vr.b$c */
    public static final /* data */ class c implements InterfaceC15710b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f17431a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -368119684;
        }

        @k
        public final String toString() {
            return "SetEmptyResult";
        }
    }
}
