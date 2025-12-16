package Cm0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReplaceMainOnboarding.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LCm0/a;", "", "a", "b", "_avito_replace-main_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cm0.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C13324a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AttributedText f2654a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f2655b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final b f2656c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C0123a f2657d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f2658e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2659f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2660g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2661h;

    /* compiled from: ReplaceMainOnboarding.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCm0/a$a;", "", "_avito_replace-main_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cm0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0123a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f2662a;

        public C0123a(@k String str) {
            this.f2662a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0123a) && L.f(this.f2662a, ((C0123a) obj).f2662a);
        }

        public final int hashCode() {
            return this.f2662a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("CancelButton(text="), this.f2662a, ')');
        }
    }

    /* compiled from: ReplaceMainOnboarding.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCm0/a$b;", "", "_avito_replace-main_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cm0.a$b */
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f2663a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f2664b;

        public b(@k String str, @k String str2) {
            this.f2663a = str;
            this.f2664b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f2663a, bVar.f2663a) && L.f(this.f2664b, bVar.f2664b);
        }

        public final int hashCode() {
            return this.f2664b.hashCode() + (this.f2663a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ConfirmButton(text=");
            sb2.append(this.f2663a);
            sb2.append(", clearShowId=");
            return C22026a.c(sb2, this.f2664b, ')');
        }
    }

    public C13324a(@k AttributedText attributedText, @k AttributedText attributedText2, @k b bVar, @k C0123a c0123a, @k String str, int i12, int i13, int i14) {
        this.f2654a = attributedText;
        this.f2655b = attributedText2;
        this.f2656c = bVar;
        this.f2657d = c0123a;
        this.f2658e = str;
        this.f2659f = i12;
        this.f2660g = i13;
        this.f2661h = i14;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13324a)) {
            return false;
        }
        C13324a c13324a = (C13324a) obj;
        return L.f(this.f2654a, c13324a.f2654a) && L.f(this.f2655b, c13324a.f2655b) && L.f(this.f2656c, c13324a.f2656c) && L.f(this.f2657d, c13324a.f2657d) && L.f(this.f2658e, c13324a.f2658e) && this.f2659f == c13324a.f2659f && this.f2660g == c13324a.f2660g && this.f2661h == c13324a.f2661h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2661h) + r.e(this.f2660g, r.e(this.f2659f, H.d(H.d((this.f2656c.hashCode() + com.avito.android.actions_sheet.a.b(this.f2654a.hashCode() * 31, 31, this.f2655b)) * 31, 31, this.f2657d.f2662a), 31, this.f2658e), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReplaceMainOnboarding(title=");
        sb2.append(this.f2654a);
        sb2.append(", subtitle=");
        sb2.append(this.f2655b);
        sb2.append(", confirmButton=");
        sb2.append(this.f2656c);
        sb2.append(", cancelButton=");
        sb2.append(this.f2657d);
        sb2.append(", showId=");
        sb2.append(this.f2658e);
        sb2.append(", showCount=");
        sb2.append(this.f2659f);
        sb2.append(", priority=");
        sb2.append(this.f2660g);
        sb2.append(", showDelayMs=");
        return r.t(sb2, this.f2661h, ')');
    }
}
