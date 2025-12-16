package Ux;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessAdvertFeedbackAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LUx/a;", "", "a", "b", "c", "d", "LUx/a$a;", "LUx/a$b;", "LUx/a$c;", "LUx/a$d;", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ux.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC15579a {

    /* compiled from: EarlyAccessAdvertFeedbackAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUx/a$a;", "LUx/a;", "<init>", "()V", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ux.a$a, reason: collision with other inner class name */
    public static final class C1155a implements InterfaceC15579a {
        static {
            new C1155a();
        }
    }

    /* compiled from: EarlyAccessAdvertFeedbackAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUx/a$b;", "LUx/a;", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ux.a$b */
    public static final /* data */ class b implements InterfaceC15579a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f16783a;

        public b(@k String str) {
            this.f16783a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f16783a, ((b) obj).f16783a);
        }

        public final int hashCode() {
            return this.f16783a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("FeedbackTextChange(text="), this.f16783a, ')');
        }
    }

    /* compiled from: EarlyAccessAdvertFeedbackAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUx/a$c;", "LUx/a;", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ux.a$c */
    public static final /* data */ class c implements InterfaceC15579a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f16784a;

        public c(boolean z12) {
            this.f16784a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f16784a == ((c) obj).f16784a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f16784a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("KeyboardToggle(isKeyboardVisible="), this.f16784a, ')');
        }
    }

    /* compiled from: EarlyAccessAdvertFeedbackAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUx/a$d;", "LUx/a;", "<init>", "()V", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ux.a$d */
    public static final class d implements InterfaceC15579a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f16785a = new d();
    }
}
