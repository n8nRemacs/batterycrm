package Vb;

import androidx.compose.foundation.H;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AiAssistantState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"LVb/j;", "", "<init>", "()V", "a", "b", "c", "d", "LVb/j$a;", "LVb/j$b;", "LVb/j$c;", "LVb/j$d;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class j {

    /* compiled from: AiAssistantState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVb/j$a;", "LVb/j;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f17256a = new a();

        public a() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -564655955;
        }

        @Y61.k
        public final String toString() {
            return "Content";
        }
    }

    /* compiled from: AiAssistantState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVb/j$b;", "LVb/j;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ApiError f17257a;

        public b(@Y61.k ApiError apiError) {
            super(null);
            this.f17257a = apiError;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f17257a, ((b) obj).f17257a);
        }

        public final int hashCode() {
            return this.f17257a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.n(new StringBuilder("Error(error="), this.f17257a, ')');
        }
    }

    /* compiled from: AiAssistantState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVb/j$c;", "LVb/j;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f17258a = new c();

        public c() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1179536016;
        }

        @Y61.k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: AiAssistantState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVb/j$d;", "LVb/j;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Image f17259a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f17260b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final AttributedText f17261c;

        public d(@Y61.l Image image, @Y61.k String str, @Y61.k AttributedText attributedText) {
            super(null);
            this.f17259a = image;
            this.f17260b = str;
            this.f17261c = attributedText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f17259a, dVar.f17259a) && L.f(this.f17260b, dVar.f17260b) && L.f(this.f17261c, dVar.f17261c);
        }

        public final int hashCode() {
            Image image = this.f17259a;
            return this.f17261c.hashCode() + H.d((image == null ? 0 : image.hashCode()) * 31, 31, this.f17260b);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Maintenance(image=");
            sb2.append(this.f17259a);
            sb2.append(", title=");
            sb2.append(this.f17260b);
            sb2.append(", text=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f17261c, ')');
        }
    }

    public /* synthetic */ j(C42822w c42822w) {
        this();
    }

    public j() {
    }
}
