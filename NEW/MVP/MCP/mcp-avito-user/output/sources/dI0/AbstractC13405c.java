package Di0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.media3.common.C23088b;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.recall_me.presentation.RecallMeParams;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RecallMeState.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LDi0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "a", "b", "c", "LDi0/c$a;", "LDi0/c$b;", "LDi0/c$c;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Di0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC13405c extends q {

    /* compiled from: RecallMeState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDi0/c$a;", "LDi0/c;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Di0.c$a */
    public static final /* data */ class a extends AbstractC13405c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final RecallMeParams f3400b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f3401c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f3402d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f3403e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f3404f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f3405g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final String f3406h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f3407i;

        /* renamed from: j, reason: collision with root package name */
        @k
        public final Object f3408j;

        /* renamed from: k, reason: collision with root package name */
        @k
        public final AttributedText f3409k;

        public a(@k RecallMeParams recallMeParams, boolean z12, @k String str, @k String str2, @k String str3, boolean z13, @k String str4, boolean z14, @k List<String> list, @k AttributedText attributedText) {
            super(null);
            this.f3400b = recallMeParams;
            this.f3401c = z12;
            this.f3402d = str;
            this.f3403e = str2;
            this.f3404f = str3;
            this.f3405g = z13;
            this.f3406h = str4;
            this.f3407i = z14;
            this.f3408j = list;
            this.f3409k = attributedText;
        }

        /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.List] */
        public static a d(a aVar, boolean z12, String str, String str2, boolean z13, int i12) {
            return new a(aVar.f3400b, (i12 & 2) != 0 ? aVar.f3401c : z12, aVar.f3402d, aVar.f3403e, (i12 & 16) != 0 ? aVar.f3404f : str, (i12 & 32) != 0 ? aVar.f3405g : false, (i12 & 64) != 0 ? aVar.f3406h : str2, (i12 & 128) != 0 ? aVar.f3407i : z13, aVar.f3408j, aVar.f3409k);
        }

        @Override // Di0.AbstractC13405c
        @k
        /* renamed from: c, reason: from getter */
        public final RecallMeParams getF3411b() {
            return this.f3400b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f3400b, aVar.f3400b) && this.f3401c == aVar.f3401c && L.f(this.f3402d, aVar.f3402d) && L.f(this.f3403e, aVar.f3403e) && L.f(this.f3404f, aVar.f3404f) && this.f3405g == aVar.f3405g && L.f(this.f3406h, aVar.f3406h) && this.f3407i == aVar.f3407i && L.f(this.f3408j, aVar.f3408j) && L.f(this.f3409k, aVar.f3409k);
        }

        public final int hashCode() {
            return this.f3409k.hashCode() + C23088b.a(r.i(H.d(r.i(H.d(H.d(H.d(r.i(this.f3400b.hashCode() * 31, 31, this.f3401c), 31, this.f3402d), 31, this.f3403e), 31, this.f3404f), 31, this.f3405g), 31, this.f3406h), 31, this.f3407i), 31, this.f3408j);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Initialized(params=");
            sb2.append(this.f3400b);
            sb2.append(", isLoading=");
            sb2.append(this.f3401c);
            sb2.append(", formTitle=");
            sb2.append(this.f3402d);
            sb2.append(", formSubtitle=");
            sb2.append(this.f3403e);
            sb2.append(", name=");
            sb2.append(this.f3404f);
            sb2.append(", nameError=");
            sb2.append(this.f3405g);
            sb2.append(", phone=");
            sb2.append(this.f3406h);
            sb2.append(", phoneError=");
            sb2.append(this.f3407i);
            sb2.append(", confirmedPhones=");
            sb2.append(this.f3408j);
            sb2.append(", agreements=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f3409k, ')');
        }
    }

    /* compiled from: RecallMeState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDi0/c$b;", "LDi0/c;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Di0.c$b */
    public static final /* data */ class b extends AbstractC13405c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final RecallMeParams f3410b;

        public b(@k RecallMeParams recallMeParams) {
            super(null);
            this.f3410b = recallMeParams;
        }

        @Override // Di0.AbstractC13405c
        @k
        /* renamed from: c, reason: from getter */
        public final RecallMeParams getF3411b() {
            return this.f3410b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f3410b, ((b) obj).f3410b);
        }

        public final int hashCode() {
            return this.f3410b.hashCode();
        }

        @k
        public final String toString() {
            return "Initializing(params=" + this.f3410b + ')';
        }
    }

    /* compiled from: RecallMeState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDi0/c$c;", "LDi0/c;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Di0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0188c extends AbstractC13405c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final RecallMeParams f3411b;

        public C0188c(@k RecallMeParams recallMeParams) {
            super(null);
            this.f3411b = recallMeParams;
        }

        @Override // Di0.AbstractC13405c
        @k
        /* renamed from: c, reason: from getter */
        public final RecallMeParams getF3411b() {
            return this.f3411b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0188c) && L.f(this.f3411b, ((C0188c) obj).f3411b);
        }

        public final int hashCode() {
            return this.f3411b.hashCode();
        }

        @k
        public final String toString() {
            return "InitializingError(params=" + this.f3411b + ')';
        }
    }

    public /* synthetic */ AbstractC13405c(C42822w c42822w) {
        this();
    }

    @k
    /* renamed from: c */
    public abstract RecallMeParams getF3411b();

    public AbstractC13405c() {
    }
}
