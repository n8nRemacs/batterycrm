package Eg0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.component.accordion.s;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: TextSheetState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LEg0/d;", "", "a", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class d {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f4159g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f4160a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f4161b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f4162c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f4163d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4164e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Integer f4165f;

    /* compiled from: TextSheetState.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEg0/d$a;", "", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k String str, @k String str2, @k PrintableText printableText, @l String str3, boolean z12, @l Integer num) {
        this.f4160a = str;
        this.f4161b = str2;
        this.f4162c = printableText;
        this.f4163d = str3;
        this.f4164e = z12;
        this.f4165f = num;
    }

    public static d a(d dVar, String str, String str2, boolean z12, int i12) {
        String str3 = dVar.f4160a;
        if ((i12 & 2) != 0) {
            str = dVar.f4161b;
        }
        String str4 = str;
        PrintableText printableText = dVar.f4162c;
        if ((i12 & 8) != 0) {
            str2 = dVar.f4163d;
        }
        String str5 = str2;
        if ((i12 & 16) != 0) {
            z12 = dVar.f4164e;
        }
        Integer num = dVar.f4165f;
        dVar.getClass();
        return new d(str3, str4, printableText, str5, z12, num);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f4160a, dVar.f4160a) && L.f(this.f4161b, dVar.f4161b) && L.f(this.f4162c, dVar.f4162c) && L.f(this.f4163d, dVar.f4163d) && this.f4164e == dVar.f4164e && L.f(this.f4165f, dVar.f4165f);
    }

    public final int hashCode() {
        int iF2 = com.avito.android.actions_sheet.a.f(this.f4162c, H.d(this.f4160a.hashCode() * 31, 31, this.f4161b), 31);
        String str = this.f4163d;
        int i12 = r.i((iF2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f4164e);
        Integer num = this.f4165f;
        return i12 + (num != null ? num.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextSheetState(title=");
        sb2.append(this.f4160a);
        sb2.append(", text=");
        sb2.append(this.f4161b);
        sb2.append(", textHint=");
        sb2.append(this.f4162c);
        sb2.append(", errorMessage=");
        sb2.append(this.f4163d);
        sb2.append(", isLoading=");
        sb2.append(this.f4164e);
        sb2.append(", maxLength=");
        return s.j(sb2, this.f4165f, ')');
    }
}
