package com.avito.android.motivation_screen.models;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MotivationInternalAction.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/motivation_screen/models/MotivationInternalAction;", "", "<init>", "()V", "a", "ContentLoaded", "b", "c", "Lcom/avito/android/motivation_screen/models/MotivationInternalAction$a;", "Lcom/avito/android/motivation_screen/models/MotivationInternalAction$ContentLoaded;", "Lcom/avito/android/motivation_screen/models/MotivationInternalAction$b;", "Lcom/avito/android/motivation_screen/models/MotivationInternalAction$c;", "_avito_gig_motivation-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class MotivationInternalAction {

    /* compiled from: MotivationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/motivation_screen/models/MotivationInternalAction$ContentLoaded;", "Lcom/avito/android/motivation_screen/models/MotivationInternalAction;", "a", "InternalProgressStep", "_avito_gig_motivation-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoaded extends MotivationInternalAction {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<String> f206311a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f206312b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final AttributedText f206313c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f206314d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final AttributedText f206315e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f206316f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final String f206317g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final List<InternalProgressStep> f206318h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final String f206319i;

        /* renamed from: j, reason: collision with root package name */
        @k
        public final a f206320j;

        /* renamed from: k, reason: collision with root package name */
        @l
        public final a f206321k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f206322l;

        /* compiled from: MotivationInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/motivation_screen/models/MotivationInternalAction$ContentLoaded$InternalProgressStep;", "", "InternalProgressStepState", "_avito_gig_motivation-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class InternalProgressStep {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f206323a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final InternalProgressStepState f206324b;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: MotivationInternalAction.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/motivation_screen/models/MotivationInternalAction$ContentLoaded$InternalProgressStep$InternalProgressStepState;", "", "_avito_gig_motivation-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class InternalProgressStepState {

                /* renamed from: b, reason: collision with root package name */
                public static final InternalProgressStepState f206325b;

                /* renamed from: c, reason: collision with root package name */
                public static final InternalProgressStepState f206326c;

                /* renamed from: d, reason: collision with root package name */
                public static final InternalProgressStepState f206327d;

                /* renamed from: e, reason: collision with root package name */
                public static final InternalProgressStepState f206328e;

                /* renamed from: f, reason: collision with root package name */
                public static final /* synthetic */ InternalProgressStepState[] f206329f;

                /* renamed from: g, reason: collision with root package name */
                public static final /* synthetic */ kotlin.enums.a f206330g;

                static {
                    InternalProgressStepState internalProgressStepState = new InternalProgressStepState("COMPLETED", 0);
                    f206325b = internalProgressStepState;
                    InternalProgressStepState internalProgressStepState2 = new InternalProgressStepState("LOCKED", 1);
                    f206326c = internalProgressStepState2;
                    InternalProgressStepState internalProgressStepState3 = new InternalProgressStepState("CURRENT", 2);
                    f206327d = internalProgressStepState3;
                    InternalProgressStepState internalProgressStepState4 = new InternalProgressStepState("FINISH", 3);
                    f206328e = internalProgressStepState4;
                    InternalProgressStepState[] internalProgressStepStateArr = {internalProgressStepState, internalProgressStepState2, internalProgressStepState3, internalProgressStepState4};
                    f206329f = internalProgressStepStateArr;
                    f206330g = kotlin.enums.c.a(internalProgressStepStateArr);
                }

                public InternalProgressStepState() {
                    throw null;
                }

                public static InternalProgressStepState valueOf(String str) {
                    return (InternalProgressStepState) Enum.valueOf(InternalProgressStepState.class, str);
                }

                public static InternalProgressStepState[] values() {
                    return (InternalProgressStepState[]) f206329f.clone();
                }
            }

            public InternalProgressStep(@k String str, @k InternalProgressStepState internalProgressStepState) {
                this.f206323a = str;
                this.f206324b = internalProgressStepState;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InternalProgressStep)) {
                    return false;
                }
                InternalProgressStep internalProgressStep = (InternalProgressStep) obj;
                return L.f(this.f206323a, internalProgressStep.f206323a) && this.f206324b == internalProgressStep.f206324b;
            }

            public final int hashCode() {
                return this.f206324b.hashCode() + (this.f206323a.hashCode() * 31);
            }

            @k
            public final String toString() {
                return "InternalProgressStep(text=" + this.f206323a + ", state=" + this.f206324b + ')';
            }
        }

        /* compiled from: MotivationInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/motivation_screen/models/MotivationInternalAction$ContentLoaded$a;", "", "_avito_gig_motivation-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f206331a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final DeepLink f206332b;

            public a(@k String str, @k DeepLink deepLink) {
                this.f206331a = str;
                this.f206332b = deepLink;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f206331a, aVar.f206331a) && L.f(this.f206332b, aVar.f206332b);
            }

            public final int hashCode() {
                return this.f206332b.hashCode() + (this.f206331a.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("InternalAction(title=");
                sb2.append(this.f206331a);
                sb2.append(", deeplink=");
                return com.avito.android.actions_sheet.a.v(sb2, this.f206332b, ')');
            }
        }

        public /* synthetic */ ContentLoaded(List list, String str, AttributedText attributedText, String str2, AttributedText attributedText2, String str3, String str4, List list2, String str5, a aVar, a aVar2, boolean z12, int i12, C42822w c42822w) {
            this(list, str, attributedText, str2, attributedText2, str3, str4, list2, (i12 & 256) != 0 ? null : str5, aVar, aVar2, z12);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentLoaded)) {
                return false;
            }
            ContentLoaded contentLoaded = (ContentLoaded) obj;
            return L.f(this.f206311a, contentLoaded.f206311a) && L.f(this.f206312b, contentLoaded.f206312b) && L.f(this.f206313c, contentLoaded.f206313c) && L.f(this.f206314d, contentLoaded.f206314d) && L.f(this.f206315e, contentLoaded.f206315e) && L.f(this.f206316f, contentLoaded.f206316f) && L.f(this.f206317g, contentLoaded.f206317g) && L.f(this.f206318h, contentLoaded.f206318h) && L.f(this.f206319i, contentLoaded.f206319i) && L.f(this.f206320j, contentLoaded.f206320j) && L.f(this.f206321k, contentLoaded.f206321k) && this.f206322l == contentLoaded.f206322l;
        }

        public final int hashCode() {
            int iE2 = H.e(H.d(H.d(com.avito.android.actions_sheet.a.b(H.d(com.avito.android.actions_sheet.a.b(H.d(this.f206311a.hashCode() * 31, 31, this.f206312b), 31, this.f206313c), 31, this.f206314d), 31, this.f206315e), 31, this.f206316f), 31, this.f206317g), 31, this.f206318h);
            String str = this.f206319i;
            int iHashCode = (this.f206320j.hashCode() + ((iE2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            a aVar = this.f206321k;
            return Boolean.hashCode(this.f206322l) + ((iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentLoaded(badges=");
            sb2.append(this.f206311a);
            sb2.append(", title=");
            sb2.append(this.f206312b);
            sb2.append(", subtitle=");
            sb2.append(this.f206313c);
            sb2.append(", description=");
            sb2.append(this.f206314d);
            sb2.append(", duration=");
            sb2.append(this.f206315e);
            sb2.append(", progressTitle=");
            sb2.append(this.f206316f);
            sb2.append(", progressSubtitle=");
            sb2.append(this.f206317g);
            sb2.append(", progressSteps=");
            sb2.append(this.f206318h);
            sb2.append(", paymentTitle=");
            sb2.append(this.f206319i);
            sb2.append(", infoButton=");
            sb2.append(this.f206320j);
            sb2.append(", button=");
            sb2.append(this.f206321k);
            sb2.append(", shouldShowAnimation=");
            return r.x(sb2, this.f206322l, ')');
        }

        public ContentLoaded(@k List<String> list, @k String str, @k AttributedText attributedText, @k String str2, @k AttributedText attributedText2, @k String str3, @k String str4, @k List<InternalProgressStep> list2, @l String str5, @k a aVar, @l a aVar2, boolean z12) {
            super(null);
            this.f206311a = list;
            this.f206312b = str;
            this.f206313c = attributedText;
            this.f206314d = str2;
            this.f206315e = attributedText2;
            this.f206316f = str3;
            this.f206317g = str4;
            this.f206318h = list2;
            this.f206319i = str5;
            this.f206320j = aVar;
            this.f206321k = aVar2;
            this.f206322l = z12;
        }
    }

    /* compiled from: MotivationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/motivation_screen/models/MotivationInternalAction$a;", "Lcom/avito/android/motivation_screen/models/MotivationInternalAction;", "<init>", "()V", "_avito_gig_motivation-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends MotivationInternalAction {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f206333a = new a();

        public a() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 261065619;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: MotivationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/motivation_screen/models/MotivationInternalAction$b;", "Lcom/avito/android/motivation_screen/models/MotivationInternalAction;", "<init>", "()V", "_avito_gig_motivation-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends MotivationInternalAction {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f206334a = new b();

        public b() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 263094179;
        }

        @k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: MotivationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/motivation_screen/models/MotivationInternalAction$c;", "Lcom/avito/android/motivation_screen/models/MotivationInternalAction;", "<init>", "()V", "_avito_gig_motivation-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends MotivationInternalAction {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f206335a = new c();

        public c() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -894615425;
        }

        @k
        public final String toString() {
            return "StartLoading";
        }
    }

    public /* synthetic */ MotivationInternalAction(C42822w c42822w) {
        this();
    }

    public MotivationInternalAction() {
    }
}
