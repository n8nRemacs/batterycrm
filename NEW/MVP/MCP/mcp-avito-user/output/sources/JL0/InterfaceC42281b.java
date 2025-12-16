package jL0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoprolongOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LjL0/b;", "", "a", "b", "c", "LjL0/b$a;", "LjL0/b$b;", "LjL0/b$c;", "_avito_vas-autoprolong_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jL0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC42281b {

    /* compiled from: AutoprolongOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LjL0/b$a;", "LjL0/b;", "<init>", "()V", "_avito_vas-autoprolong_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jL0.b$a */
    public static final class a implements InterfaceC42281b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f405560a = new a();
    }

    /* compiled from: AutoprolongOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjL0/b$b;", "LjL0/b;", "_avito_vas-autoprolong_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jL0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11560b implements InterfaceC42281b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f405561a;

        public C11560b(@k DeepLink deepLink) {
            this.f405561a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11560b) && L.f(this.f405561a, ((C11560b) obj).f405561a);
        }

        public final int hashCode() {
            return this.f405561a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f405561a, ')');
        }
    }

    /* compiled from: AutoprolongOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjL0/b$c;", "LjL0/b;", "_avito_vas-autoprolong_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jL0.b$c */
    public static final /* data */ class c implements InterfaceC42281b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f405562a;

        public c(@k ApiError apiError) {
            this.f405562a = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f405562a, ((c) obj).f405562a);
        }

        public final int hashCode() {
            return this.f405562a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("ShowError(error="), this.f405562a, ')');
        }
    }
}
