package Jy0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.str_calendar.common.models.Position;
import com.avito.android.str_calendar.seller.calendar.mvi.entity.Status;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerCalendarItemState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJy0/b;", "", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Jy0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C14262b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Status f9188a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Position f9189b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Status f9190c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Position f9191d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9192e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f9193f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f9194g;

    public C14262b(@k Status status, @k Position position, @k Status status2, @k Position position2, boolean z12, boolean z13, @k String str) {
        this.f9188a = status;
        this.f9189b = position;
        this.f9190c = status2;
        this.f9191d = position2;
        this.f9192e = z12;
        this.f9193f = z13;
        this.f9194g = str;
    }

    public static C14262b a(C14262b c14262b, Position position) {
        return new C14262b(c14262b.f9188a, c14262b.f9189b, Status.f287687b, position, c14262b.f9192e, c14262b.f9193f, c14262b.f9194g);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14262b)) {
            return false;
        }
        C14262b c14262b = (C14262b) obj;
        return this.f9188a == c14262b.f9188a && this.f9189b == c14262b.f9189b && this.f9190c == c14262b.f9190c && this.f9191d == c14262b.f9191d && this.f9192e == c14262b.f9192e && this.f9193f == c14262b.f9193f && L.f(this.f9194g, c14262b.f9194g);
    }

    public final int hashCode() {
        return this.f9194g.hashCode() + r.i(r.i((this.f9191d.hashCode() + ((this.f9190c.hashCode() + ((this.f9189b.hashCode() + (this.f9188a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.f9192e), 31, this.f9193f);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrSellerCalendarItemState(primaryStatus=");
        sb2.append(this.f9188a);
        sb2.append(", primaryPosition=");
        sb2.append(this.f9189b);
        sb2.append(", secondaryStatus=");
        sb2.append(this.f9190c);
        sb2.append(", secondaryPosition=");
        sb2.append(this.f9191d);
        sb2.append(", hasEditedParameters=");
        sb2.append(this.f9192e);
        sb2.append(", hasLastMinuteOffer=");
        sb2.append(this.f9193f);
        sb2.append(", nightPrice=");
        return C22026a.c(sb2, this.f9194g, ')');
    }
}
