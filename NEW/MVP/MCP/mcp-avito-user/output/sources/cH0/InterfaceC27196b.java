package ch0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StepProgress.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lch0/b;", "", "a", "b", "c", "Lch0/b$a;", "Lch0/b$b;", "Lch0/b$c;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ch0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC27196b {

    /* compiled from: StepProgress.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lch0/b$a;", "Lch0/b;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ch0.b$a */
    public static final class a implements InterfaceC27196b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f58101a = new a();
    }

    /* compiled from: StepProgress.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lch0/b$b;", "Lch0/b;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ch0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C2057b implements InterfaceC27196b {

        /* renamed from: a, reason: collision with root package name */
        public final float f58102a;

        public C2057b(float f12) {
            this.f58102a = f12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2057b) && Float.compare(this.f58102a, ((C2057b) obj).f58102a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f58102a);
        }

        @k
        public final String toString() {
            return r.k(')', this.f58102a, new StringBuilder("Progress(progress="));
        }
    }

    /* compiled from: StepProgress.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lch0/b$c;", "Lch0/b;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ch0.b$c */
    public static final /* data */ class c implements InterfaceC27196b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f58103a;

        public c(@k String str) {
            this.f58103a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f58103a, ((c) obj).f58103a);
        }

        public final int hashCode() {
            return this.f58103a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Title(title="), this.f58103a, ')');
        }
    }
}
