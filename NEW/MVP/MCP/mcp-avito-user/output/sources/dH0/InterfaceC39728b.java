package dh0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.rating_form.RatingFormArguments;
import com.avito.android.rating_form.StepIdentifier;
import com.avito.android.rating_form.ToastInfo;
import com.avito.android.rating_form.api.remote.model.RatingFormAddValueType;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RatingFormOneTimeEvent.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Ldh0/b;", "", "a", "b", "c", "d", "e", "f", "g", "Ldh0/b$a;", "Ldh0/b$b;", "Ldh0/b$c;", "Ldh0/b$d;", "Ldh0/b$e;", "Ldh0/b$f;", "Ldh0/b$g;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dh0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC39728b {

    /* compiled from: RatingFormOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldh0/b$a;", "Ldh0/b;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dh0.b$a */
    public static final /* data */ class a implements InterfaceC39728b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final ToastInfo f394000a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f394001b;

        public a(ToastInfo toastInfo, boolean z12, int i12, C42822w c42822w) {
            z12 = (i12 & 2) != 0 ? false : z12;
            this.f394000a = toastInfo;
            this.f394001b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f394000a, aVar.f394000a) && this.f394001b == aVar.f394001b;
        }

        public final int hashCode() {
            ToastInfo toastInfo = this.f394000a;
            return Boolean.hashCode(this.f394001b) + ((toastInfo == null ? 0 : toastInfo.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DoneUpdateList(toastInfo=");
            sb2.append(this.f394000a);
            sb2.append(", needToReload=");
            return r.x(sb2, this.f394001b, ')');
        }
    }

    /* compiled from: RatingFormOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldh0/b$b;", "Ldh0/b;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dh0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11032b implements InterfaceC39728b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f394002a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f394003b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f394004c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f394005d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final DeepLink f394006e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f394007f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final String f394008g;

        public C11032b() {
            this(false, null, null, null, null, false, null, 127, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11032b)) {
                return false;
            }
            C11032b c11032b = (C11032b) obj;
            return this.f394002a == c11032b.f394002a && L.f(this.f394003b, c11032b.f394003b) && L.f(this.f394004c, c11032b.f394004c) && L.f(this.f394005d, c11032b.f394005d) && L.f(this.f394006e, c11032b.f394006e) && this.f394007f == c11032b.f394007f && L.f(this.f394008g, c11032b.f394008g);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f394002a) * 31;
            String str = this.f394003b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f394004c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f394005d;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            DeepLink deepLink = this.f394006e;
            int i12 = r.i((iHashCode4 + (deepLink == null ? 0 : deepLink.hashCode())) * 31, 31, this.f394007f);
            String str4 = this.f394008g;
            return i12 + (str4 != null ? str4.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FinishWithResult(wasOpenedFromPush=");
            sb2.append(this.f394002a);
            sb2.append(", closeMessage=");
            sb2.append(this.f394003b);
            sb2.append(", closeDescription=");
            sb2.append(this.f394004c);
            sb2.append(", closeButtonTitle=");
            sb2.append(this.f394005d);
            sb2.append(", closeButtonUri=");
            sb2.append(this.f394006e);
            sb2.append(", refreshScreen=");
            sb2.append(this.f394007f);
            sb2.append(", publishedRatingUserKey=");
            return C22026a.c(sb2, this.f394008g, ')');
        }

        public C11032b(boolean z12, @l String str, @l String str2, @l String str3, @l DeepLink deepLink, boolean z13, @l String str4) {
            this.f394002a = z12;
            this.f394003b = str;
            this.f394004c = str2;
            this.f394005d = str3;
            this.f394006e = deepLink;
            this.f394007f = z13;
            this.f394008g = str4;
        }

        public /* synthetic */ C11032b(boolean z12, String str, String str2, String str3, DeepLink deepLink, boolean z13, String str4, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : deepLink, (i12 & 32) == 0 ? z13 : false, (i12 & 64) != 0 ? null : str4);
        }
    }

    /* compiled from: RatingFormOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldh0/b$c;", "Ldh0/b;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dh0.b$c */
    public static final /* data */ class c implements InterfaceC39728b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f394009a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1895745930;
        }

        @k
        public final String toString() {
            return "FinishWithoutResult";
        }
    }

    /* compiled from: RatingFormOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldh0/b$e;", "Ldh0/b;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dh0.b$e */
    public static final /* data */ class e implements InterfaceC39728b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AttributedText f394016a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final List<RatingFormAddValueType.DoneButton> f394017b;

        public e(@k AttributedText attributedText, @l List<RatingFormAddValueType.DoneButton> list) {
            this.f394016a = attributedText;
            this.f394017b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f394016a, eVar.f394016a) && L.f(this.f394017b, eVar.f394017b);
        }

        public final int hashCode() {
            int iHashCode = this.f394016a.hashCode() * 31;
            List<RatingFormAddValueType.DoneButton> list = this.f394017b;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDonePseudoStep(content=");
            sb2.append(this.f394016a);
            sb2.append(", buttons=");
            return H.p(sb2, this.f394017b, ')');
        }
    }

    /* compiled from: RatingFormOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldh0/b$f;", "Ldh0/b;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dh0.b$f */
    public static final /* data */ class f implements InterfaceC39728b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final RatingFormArguments f394018a;

        /* renamed from: b, reason: collision with root package name */
        public final int f394019b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final StepIdentifier f394020c;

        public f(@k RatingFormArguments ratingFormArguments, int i12, @k StepIdentifier stepIdentifier) {
            this.f394018a = ratingFormArguments;
            this.f394019b = i12;
            this.f394020c = stepIdentifier;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f394018a, fVar.f394018a) && this.f394019b == fVar.f394019b && L.f(this.f394020c, fVar.f394020c);
        }

        public final int hashCode() {
            return this.f394020c.hashCode() + r.e(this.f394019b, this.f394018a.hashCode() * 31, 31);
        }

        @k
        public final String toString() {
            return "SelectItemEvent(formArguments=" + this.f394018a + ", draftId=" + this.f394019b + ", stepIdentifier=" + this.f394020c + ')';
        }
    }

    /* compiled from: RatingFormOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldh0/b$g;", "Ldh0/b;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dh0.b$g */
    public static final /* data */ class g implements InterfaceC39728b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final RatingFormArguments f394021a;

        /* renamed from: b, reason: collision with root package name */
        public final int f394022b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final StepIdentifier f394023c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f394024d;

        public g(@k RatingFormArguments ratingFormArguments, int i12, @k StepIdentifier stepIdentifier, @k String str) {
            this.f394021a = ratingFormArguments;
            this.f394022b = i12;
            this.f394023c = stepIdentifier;
            this.f394024d = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f394021a, gVar.f394021a) && this.f394022b == gVar.f394022b && L.f(this.f394023c, gVar.f394023c) && L.f(this.f394024d, gVar.f394024d);
        }

        public final int hashCode() {
            return this.f394024d.hashCode() + ((this.f394023c.hashCode() + r.e(this.f394022b, this.f394021a.hashCode() * 31, 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("StepEvent(formArguments=");
            sb2.append(this.f394021a);
            sb2.append(", draftId=");
            sb2.append(this.f394022b);
            sb2.append(", stepIdentifier=");
            sb2.append(this.f394023c);
            sb2.append(", suffix=");
            return C22026a.c(sb2, this.f394024d, ')');
        }
    }

    /* compiled from: RatingFormOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldh0/b$d;", "Ldh0/b;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dh0.b$d */
    public static final /* data */ class d implements InterfaceC39728b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f394010a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f394011b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f394012c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final DeepLink f394013d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final UniversalImage f394014e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f394015f;

        public d(@l DeepLink deepLink, @l UniversalImage universalImage, @k String str, @l String str2, @l String str3, @l String str4) {
            this.f394010a = str;
            this.f394011b = str2;
            this.f394012c = str3;
            this.f394013d = deepLink;
            this.f394014e = universalImage;
            this.f394015f = str4;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f394010a, dVar.f394010a) && L.f(this.f394011b, dVar.f394011b) && L.f(this.f394012c, dVar.f394012c) && L.f(this.f394013d, dVar.f394013d) && L.f(this.f394014e, dVar.f394014e) && L.f(this.f394015f, dVar.f394015f);
        }

        public final int hashCode() {
            int iHashCode = this.f394010a.hashCode() * 31;
            String str = this.f394011b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f394012c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            DeepLink deepLink = this.f394013d;
            int iHashCode4 = (iHashCode3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            UniversalImage universalImage = this.f394014e;
            int iHashCode5 = (iHashCode4 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
            String str3 = this.f394015f;
            return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InfoEvent(title=");
            sb2.append(this.f394010a);
            sb2.append(", message=");
            sb2.append(this.f394011b);
            sb2.append(", buttonText=");
            sb2.append(this.f394012c);
            sb2.append(", buttonUrl=");
            sb2.append(this.f394013d);
            sb2.append(", image=");
            sb2.append(this.f394014e);
            sb2.append(", publishedRatingUserKey=");
            return C22026a.c(sb2, this.f394015f, ')');
        }

        public /* synthetic */ d(String str, String str2, String str3, DeepLink deepLink, UniversalImage universalImage, String str4, int i12, C42822w c42822w) {
            this(deepLink, universalImage, str, str2, str3, (i12 & 32) != 0 ? null : str4);
        }
    }
}
